package topoos.APIAccess.Operations;


/**
 * Crea una nueva regla de uno de los siguientes tipos:
 *	TRACK_OUT_OF_BOUNDS: Regla asociada a un Track. Cada vez que se registre una posici�n asociada a un Track se comprobar� si esta est� fuera de la zona circular especificada, y si es as� se generar� una alerta Push al Endpoint establecido en la configuraci�n de la aplicaci�n.
 * @author MAJS
 *
 */
public class RulesAdd extends APIOperation{

	public static final String TYPE_TRACK_OUT_OF_BOUNDS="TRACK_OUT_OF_BOUNDS";
	
	private String oauth_token=null; // (obligatorio)access_token de Acceso a recursos
	private Double	lat=null; // (obligatorio) latitud del centro del c�rculo del �rea permitida, en grados decimales
	private Double	lng=null; // (obligatorio) longitud del centro del c�rculo del �rea permitida, en grados decimales
	private Double 	radius=null; //(obligatorio) radio del c�rculo del �rea permitida, en grados decimales.
	private String	type=null; //TRACK_OUT_OF_BOUNDS


	public RulesAdd(String operationName, String method, String format,
			Integer version, String oauth_token, String device, Double lat,
			Double lng, Double radius, String type) {
		super(operationName, method, format, version);
		this.oauth_token = oauth_token;
		this.lat = lat;
		this.lng = lng;
		this.radius = radius;
		this.type = type;
	}
	
	@Override
	public boolean ValidateParams() {

		boolean validate = super.ValidateParams();
		validate = validate && isValid(APIUtils.toStringDouble(lat));
		validate = validate && isValid(APIUtils.toStringDouble(lng));
		validate = validate && isValid(oauth_token);
		validate = validate && isValid(APIUtils.toStringDouble(radius));
		validate = validate && isValid(type);
		return validate;
	}

	@Override
	public String ConcatParams() {

		String params = null;
		if (this.ValidateParams()) {
			params = "/" + this.Version + "/rules/add." + this.Format 
					+ "?oauth_token=" + this.oauth_token
					+ "&lat="+APIUtils.toStringDouble(lat)
					+ "&lng="+APIUtils.toStringDouble(lng)
					+ "&radius="+APIUtils.toStringDouble(radius)
					+ "&type="+type
					;
		}
		return params;
	}
	

		
}