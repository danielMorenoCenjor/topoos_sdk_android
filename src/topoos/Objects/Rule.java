/**
 * Copyright 2014-present topoos
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package topoos.Objects;

import java.io.Serializable;

/**
 * Class that implements a rule.
 *
 * @author topoos
 */
public class Rule implements Serializable{
	
	/**
	 * V0
	 */
	private static final long serialVersionUID = 1L;
	
	/** The id. */
	private Integer id = null;
	
	/** The type. */
	private String type = null;

	/**
	 * Instantiates a new rule.
	 *
	 * @param id the id
	 * @param type the type
	 */
	public Rule(Integer id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	/**
	 * get the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * get the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
