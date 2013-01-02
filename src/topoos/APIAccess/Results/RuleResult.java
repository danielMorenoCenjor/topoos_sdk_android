package topoos.APIAccess.Results;

import org.json.JSONObject;
import org.json.JSONTokener;

import android.util.Log;

import topoos.Constants;
import topoos.Messages;
import topoos.Exception.TopoosException;
import topoos.Objects.*;

// TODO: Auto-generated Javadoc

/**
 * The Class RuleResult.
 * 
 * @see APICallResult
 * @author topoos
 */
public class RuleResult extends APICallResult {

	/** The rule. */
	private Rule rule = null;

	/**
	 * Instantiates a new rule result.
	 */
	public RuleResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new rule result.
	 * 
	 * @param error
	 *            the error
	 * @param result
	 *            the result
	 */
	public RuleResult(String error, String result) {
		super(error, result);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new rule result.
	 * 
	 * @param error
	 *            the error
	 * @param result
	 *            the result
	 * @param rule
	 *            the rule
	 */
	public RuleResult(String error, String result, Rule rule) {
		super(error, result);
		this.rule = rule;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see topoos.APIAccess.Results.APICallResult#setParameters()
	 */
	@Override
	public void setParameters() throws TopoosException {
		// TODO Auto-generated method stub
		Integer id = null;
		String type = null;
		if (APIUtils.getcorrectJSONstring(Result) != null) {
			try {
				JSONObject jObject = (JSONObject) new JSONTokener(
						APIUtils.getcorrectJSONstring(Result)).nextValue();
				// Extracting content
				id = APIUtils.getIntegerorNull(jObject, "id");
				type = APIUtils.getStringorNull(jObject, "type");
				this.rule = new Rule(id, type);

			} catch (Exception e) {
				if (Constants.DEBUG) {
					e.printStackTrace();
				}
				throw new TopoosException(TopoosException.ERROR_PARSE);
			}
		} else {
			if (Constants.DEBUG) {
				Log.i(Constants.TAG, Messages.TOPOOS_NORESULT);
			}
		}
	}

	/**
	 * Gets the rule.
	 * 
	 * @return the rule
	 */
	public Rule getRule() {
		return rule;
	}

	/**
	 * Sets the rule.
	 * 
	 * @param rule
	 *            the rule to set
	 */
	public void setRule(Rule rule) {
		this.rule = rule;
	}

}
