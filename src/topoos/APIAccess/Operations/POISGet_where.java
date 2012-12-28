package topoos.APIAccess.Operations;
// TODO: Auto-generated Javadoc

/**
 * The Class POISGet_where.
 *
 * @see APIOperation
 * @author topoos
 */
public class POISGet_where extends APIOperation{

	/** The oauth_token. */
	private String  oauth_token=null; // (obligatorio) access_token a los recursos del usuario
	
	/** The pois. */
	private String  pois=null; // (opcional) lista de identificadores de POI que deseamos recuperar, separados por comas
	
	/** The categories. */
	private String  categories=null; // (obligatorio) identificadores de las categor�as de filtrado, los POI obtenidos pertenecer�n a todas las especificadas, separadas por comas
	
	/** The city. */
	private String  city=null; // (opcional) obtiene los POI en la ciudad especificada
	
	/** The country. */
	private String  country=null; // (opcional) obtiene los POI en la provincia especificada
	
	/** The postal_code. */
	private String  postal_code=null; //(opcional) obtiene los POI cuyo c�digo postal coincida con el especificado
	
	/** The q. */
	private String  q=null; // (opcional) obtiene los POI cuyo nombre o descripci�n coincida con el patr�n
	/** The total. */
	private Integer  total=null; // (opcional) obtiene un n�mero determinado de pois

	/**
	 * Instantiates a new pOIS get_where.
	 *
	 * @param operationName the operation name
	 * @param method the method
	 * @param format the format
	 * @param version the version
	 * @param oauth_token the oauth_token
	 * @param pois the pois
	 * @param categories the categories
	 * @param city the city
	 * @param country the country
	 * @param postal_code the postal_code
	 * @param q the q
	 * @param total the total pois
	 */
	public POISGet_where(String operationName, String method, String format,
			Integer version, String oauth_token, String pois,
			String categories, String city, String country, String postal_code,
			String q, Integer total) {
		super(operationName, method, format, version);
		this.oauth_token = oauth_token;
		this.pois = pois;
		this.categories = categories;
		this.city = city;
		this.country = country;
		this.postal_code = postal_code;
		this.q = q;
		this.total = total;
	}


	
	/* (non-Javadoc)
	 * @see topoos.APIAccess.Operations.APIOperation#ValidateParams()
	 */
	@Override
	public boolean ValidateParams() {
		// TODO Auto-generated method stub
		boolean validate = super.ValidateParams();
		validate = validate && isValid(categories);
		validate = validate && isValidorNull(pois);
		validate = validate && isValidorNull(city);
		validate = validate && isValidorNull(country);
		validate = validate && isValidorNull(postal_code);
		validate = validate && isValidorNull(q);
		validate = validate && isValidorNull(APIUtils.toStringInteger(total));
		validate = validate && isValid(oauth_token);
		return validate;
	}


	/* (non-Javadoc)
	 * @see topoos.APIAccess.Operations.APIOperation#ConcatParams()
	 */
	@Override
	public String ConcatParams() {
		String params = null;
		if (this.ValidateParams()) {
			params = "/" + this.Version + "/pois/get_where." + this.Format 
					+ "?oauth_token=" + this.oauth_token
					+ "&categories="+APIUtils.toStringUrlEncoded(categories)
					+(pois == null? "" : "&pois="+APIUtils.toStringUrlEncoded(pois))
					+(city == null? "" : "&city="+APIUtils.toStringUrlEncoded(city))
					+(country == null? "" : "&country="+APIUtils.toStringUrlEncoded(country))
					+(postal_code == null? "" : "&postal_code="+APIUtils.toStringUrlEncoded(postal_code))
					+(q == null? "" : "&q="+APIUtils.toStringUrlEncoded(q))
					+(total == null? "" : "&total="+APIUtils.toStringInteger(total))
					;
		}
		return params;
	}
}
