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
	private Integer 	radius=null; //(obligatorio) radio del c�rculo del �rea permitida, en grados decimales.
	private String	type=null; //TRACK_OUT_OF_BOUNDS
	private Integer track=null; //Identificador del track que vamos a a�adir
	

	/**
	 * @param operationName
	 * @param method
	 * @param format
	 * @param version
	 * @param oauth_token
	 * @param lat
	 * @param lng
	 * @param radius
	 * @param type
	 * @param track
	 */
	public RulesAdd(String operationName, String method, String format,
			Integer version, String oauth_token, Double lat, Double lng,
			Integer radius, String type, Integer track) {
		super(operationName, method, format, version);
		this.oauth_token = oauth_token;
		this.lat = lat;
		this.lng = lng;
		this.radius = radius;
		this.type = type;
		this.track = track;
	}

	@Override
	public boolean ValidateParams() {

		boolean validate = super.ValidateParams();
		validate = validate && isValid(APIUtils.toStringDouble(lat));
		validate = validate && isValid(APIUtils.toStringDouble(lng));
		validate = validate && isValid(oauth_token);
		validate = validate && isValid(APIUtils.toStringInteger(radius));
		validate = validate && isValid(type);
		validate = validate && isValid(APIUtils.toStringInteger(track));
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
					+ "&radius="+APIUtils.toStringInteger(radius)
					+ "&track="+APIUtils.toStringInteger(track)
					+ "&type="+type
					;
		}
		return params;
	}
	

		
}