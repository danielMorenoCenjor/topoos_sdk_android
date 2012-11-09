package topoos.APIAccess.Operations;

/**
 * Actualiza la descripci�n de una categor�a. La categor�a debe pertenecer a la
 * aplicaci�n.
 * 
 * @author MAJS
 * 
 */
public class POISCategoriesUpdate extends APIOperation {

	private String oauth_token = null; // (obligatorio) access_token a los
										// recursos del usuario
	private String desc = null; // : (obligatorio) descripci�n de la categor�a
	private String category = null; // (obligatorio) identificador de la
									// categor�a a modificar

	public POISCategoriesUpdate(String operationName, String method,
			String format, Integer version, String oauth_token, String desc,
			String category) {
		super(operationName, method, format, version);
		this.oauth_token = oauth_token;
		this.desc = desc;
		this.category = category;
	}

	@Override
	public boolean ValidateParams() {
		// TODO Auto-generated method stub
		boolean validate = super.ValidateParams();
		validate = validate && isValid(APIUtils.toStringUrlEncoded(desc));
		validate = validate && isValid(APIUtils.toStringUrlEncoded(category));
		validate = validate && isValid(oauth_token);

		return validate;
	}

	@Override
	public String ConcatParams() {
		String params = null;
		if (this.ValidateParams()) {
			params = "/" + this.Version + "/pois/categories/update."
					+ this.Format + "?oauth_token=" + this.oauth_token
					+ "&desc=" + APIUtils.toStringUrlEncoded(desc)
					+ "&category=" + APIUtils.toStringUrlEncoded(category);
		}
		return params;
	}
}