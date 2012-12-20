package topoos.APIAccess.Operations;

// TODO: Auto-generated Javadoc
/**
 * Class that add POIS.
 *
 * @see APIOperation
 * @author topoos
 */
public class POISAdd extends APIOperation {

	/** The oauth_token. */
	private String oauth_token = null; // (obligatorio) access_token a los
										// recursos del usuario
	/** The lat. */
										private Double lat = null; // (obligatorio) latitud de la nueva posici�n.
								// Decimal.
	/** The lng. */
								private Double lng = null; // (obligatorio) longitud de la nueva posici�n.
								// Decimal.
	/** The accuracy. */
								private Double accuracy = null; // (opcional) precisi�n de la posici�n
									// (latitud, longitud). Decimal.
	/** The vaccuracy. */
									private Double vaccuracy = null; // (opcional) precisi�n de la elevaci�n.
										// Decimal.
	/** The elevation. */
										private Double elevation = null; // (opcional) elevaci�n respecto al nivel
										// del mar. Decimal.
	/** The categories. */
										private String categories = null; // (obligatorio) identificadores de las
										// categor�as a las que pertenece este
										// POI, separados por comas
	/** The name. */
										private String name = null; // (obligatorio) nombre del punto de inter�s.
								// Cadena de texto. M�ximo 255 caracteres.
	/** The desc. */
								private String desc = null; // (opcional) descripci�n del punto de inter�s.
								// Cadena de texto. M�ximo 500 caracteres.
	/** The address. */
								private String address = null; // (opcional) direcci�n del punto del
									// inter�s. Cadena de texto. M�ximo 50
									// caracteres.
	/** The cross_street. */
									private String cross_street = null; // (opcional) calle transversal. Cadena
										// de texto. M�ximo 50 caracteres.
	/** The city. */
										private String city = null; // (opcional) ciudad del punto de inter�s.
								// Cadena de texto. M�ximo 50 caracteres.
	/** The country. */
								private String country = null; // (opcional) estado. Cadena de texto. M�ximo
									// 30 caracteres.
	/** The postal_code. */
									private String postal_code = null; // (opcional) c�digo postal. Cadena de
										// texto. M�ximo 12 caracteres.
	/** The phone. */
										private String phone = null; // (opcional) tel�fono de contacto. Cadena de
									// texto. M�ximo 20 caracteres.
	/** The twitter. */
									private String twitter = null; // (opcional) identificador de usuario o
									// hashtag de Twitter. Cadena de texto.
									// M�ximo 50 caracteres.

	/**
									 * Instantiates a new pOIS add.
									 *
									 * @param operationName the operation name
									 * @param method the method
									 * @param format the format
									 * @param version the version
									 * @param oauth_token the oauth_token
									 * @param lat the lat
									 * @param lng the lng
									 * @param accuracy the accuracy
									 * @param vaccuracy the vaccuracy
									 * @param elevation the elevation
									 * @param categories the categories
									 * @param name the name
									 * @param desc the desc
									 * @param address the address
									 * @param cross_street the cross_street
									 * @param city the city
									 * @param country the country
									 * @param postal_code the postal_code
									 * @param phone the phone
									 * @param twitter the twitter
									 */
									public POISAdd(String operationName, String method, String format,
			Integer version, String oauth_token, Double lat, Double lng,
			Double accuracy, Double vaccuracy, Double elevation,
			String categories, String name, String desc, String address,
			String cross_street, String city, String country,
			String postal_code, String phone, String twitter) {
		super(operationName, method, format, version);
		this.oauth_token = oauth_token;
		this.lat = lat;
		this.lng = lng;
		this.accuracy = accuracy;
		this.vaccuracy = vaccuracy;
		this.elevation = elevation;
		this.categories = categories;
		this.name = name;
		this.desc = desc;
		this.address = address;
		this.cross_street = cross_street;
		this.city = city;
		this.country = country;
		this.postal_code = postal_code;
		this.phone = phone;
		this.twitter = twitter;
	}

	/* (non-Javadoc)
	 * @see topoos.APIAccess.Operations.APIOperation#ValidateParams()
	 */
	@Override
	public boolean ValidateParams() {
		boolean validate = super.ValidateParams();
		validate = validate && isValid(oauth_token);
		validate = validate && isValid(APIUtils.toStringDouble(lat));
		validate = validate && isValid(APIUtils.toStringDouble(lng));
		validate = validate && isValidorNull(APIUtils.toStringDouble(accuracy));
		validate = validate
				&& isValidorNull(APIUtils.toStringDouble(vaccuracy));
		validate = validate
				&& isValidorNull(APIUtils.toStringDouble(elevation));
		validate = validate && isValidorNull(categories);
		validate = validate && isValid(name);
		validate = validate && isValidorNull(desc);
		validate = validate && isValidorNull(address);
		validate = validate && isValidorNull(cross_street);
		validate = validate && isValidorNull(city);
		validate = validate && isValidorNull(country);
		validate = validate && isValidorNull(postal_code);
		validate = validate && isValidorNull(phone);
		validate = validate && isValidorNull(twitter);
		return validate;
	}

	/* (non-Javadoc)
	 * @see topoos.APIAccess.Operations.APIOperation#ConcatParams()
	 */
	@Override
	public String ConcatParams() {
		String params = null;
		if (this.ValidateParams()) {
			params = "/"
					+ this.Version
					+ "/pois/add."
					+ this.Format
					+ "?oauth_token="
					+ this.oauth_token
					+ "&lat="
					+ APIUtils.toStringDouble(lat)
					+ "&lng="
					+ APIUtils.toStringDouble(lng)
					+ (accuracy == null ? "" : "&accuracy="
							+ APIUtils.toStringDouble(accuracy))
					+ (vaccuracy == null ? "" : "&vaccuracy="
							+ APIUtils.toStringDouble(vaccuracy))
					+ (elevation == null ? "" : "&elevation="
							+ APIUtils.toStringDouble(elevation))
					+ (categories == null ? "" : "&categories="
							+ APIUtils.toStringUrlEncoded(categories))
					+ (name == null ? "" : "&name="
							+ APIUtils.toStringUrlEncoded(name))
					+ (desc == null ? "" : "&desc="
							+ APIUtils.toStringUrlEncoded(desc))
					+ (address == null ? "" : "&address="
							+ APIUtils.toStringUrlEncoded(address))
					+ (cross_street == null ? "" : "&cross_street="
							+ APIUtils.toStringUrlEncoded(cross_street))
					+ (city == null ? "" : "&city="
							+ APIUtils.toStringUrlEncoded(city))
					+ (country == null ? "" : "&country="
							+ APIUtils.toStringUrlEncoded(country))
					+ (postal_code == null ? "" : "&postal_code="
							+ APIUtils.toStringUrlEncoded(postal_code))
					+ (phone == null ? "" : "&phone="
							+ APIUtils.toStringUrlEncoded(phone))
					+ (twitter == null ? "" : "&elevation="
							+ APIUtils.toStringUrlEncoded(twitter));
		}
		return params;
	}

}
