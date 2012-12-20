package topoos.APIAccess.Results;

import topoos.Exception.TopoosException;
// TODO: Auto-generated Javadoc

/**
 * Class that implements the api caller result.
 *
 * @see APICallResult
 * @author MAJS
 */
public abstract class APICallResult {

	/** The Format. */
	protected String Format = null;
	
	/** The Error. */
	protected String Error = null;
	
	/** The Result. */
	protected String Result = null;

	/**
	 * Instantiates a new aPI call result.
	 *
	 * @param error the error
	 * @param result the result
	 */
	public APICallResult(String error, String result) {
		this.Error = error;
		this.Result = result;
	}

	/**
	 * Instantiates a new aPI call result.
	 */
	public APICallResult() {

	}

	/**
	 * Sets the parameters.
	 *
	 * @throws TopoosException the topoos exception
	 */
	public abstract void setParameters() throws TopoosException;

	/**
	 * set the parameter.
	 *
	 * @return the format
	 */
	public String getFormat() {
		return Format;
	}

	/**
	 * set the format that received as a parameter.
	 *
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		Format = format;
	}

	/**
	 * get the error.
	 *
	 * @return the error
	 */
	public String getError() {
		return Error;
	}

	/**
	 * Sets the error.
	 *
	 * @param error the error to set
	 */
	public void setError(String error) {
		Error = error;
	}

	/**
	 * get the result.
	 *
	 * @return the result
	 */
	public String getResult() {
		return Result;
	}

	/**
	 * Sets the result.
	 *
	 * @param result the result to set
	 */
	public void setResult(String result) {
		Result = result;
	}

}
