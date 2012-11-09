package topoos.APIAccess.Operations;
/**
 * Elimina todos los avisos de error (o lo avisos de error de alg�n tipo concreto) registrados en un punto de inter�s. 
 * La categor�a debe pertenecer a la aplicaci�n.
 * @author MAJS
 *
 */
public class POISWarningDelete extends APIOperation{

	public static final String	TYPE_CLOSED="CLOSED";
	public static final String	TYPE_DUPLICATED="DUPLICATED";
	public static final String	TYPE_WRONG_INDICATOR="WRONG_INDICATOR";
	public static final String	TYPE_WRONG_INFO="WRONG_INFO";
	
	private String  oauth_token=null; // (obligatorio) access_token a los recursos del usuario
	private String	poi=null; // (opcional) identificador del POI cuyos warnings vamos a eliminar
	private String type=null; //  (obligatorio) lista de tipos de warning que deseamos eliminar (eliminar� todos los warnings de ese tipo), separados por comas:
	//	CLOSED: Marcados como cerrado o inexistente
	//	DUPLICATED: Marcados como duplicado
	//	WRONG_INDICATOR: La marca de posici�n es incorrecta o inexacta
	//	WRONG_INFO: La informaci�n del punto de inter�s es incorrecta o incompleta


	public POISWarningDelete(String operationName, String method, String format,
			Integer version, String oauth_token, String poi, String type) {
		super(operationName, method, format, version);
		this.oauth_token = oauth_token;
		this.poi = poi;
		this.type = type;
	}

	
	@Override
	public boolean ValidateParams() {
		// TODO Auto-generated method stub
		boolean validate = true;
		validate = validate && isValidorNull(poi);
		validate = validate && isValid(type);
		validate = validate && isValid(oauth_token);
		return validate;
	}

	@Override
	public String ConcatParams() {
		// TODO Auto-generated method stub

		String params = null;
		if (this.ValidateParams()) {
			params = "/" + this.Version + "/pois/warnings/delete."
					+ this.Format 
					+ "?oauth_token=" + this.oauth_token
					+(poi == null? "" : "&poi="+APIUtils.toStringUrlEncoded(poi))
					+ "&type="+type
					;
		}
		return params;
	}

}
