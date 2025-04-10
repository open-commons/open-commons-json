/*

 * Copyright 2011 Park Jun-Hong (parkjunhong77@gmail.com)
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

/*


 * 
 *
 * This file is generated under this project, "open-commons-json".
 *
 * Date  : 2014. 4. 15. 오후 8:11:09
 *
 * Author: Park_Jun_Hong_(parkjunhong77@gmail.com)
 * 
 */

package open.commons.json.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import open.commons.json.IJSONSingle;
import open.commons.json.annotation.JSONField;
import open.commons.json.model.exception.JSONUnmarshalledException;

/**
 * 
 * @since 2014. 4. 15.
 * @author Park_Jun_Hong_(parkjunhong77@gmail.com)
 */
public class JSONArraySingle<T extends Serializable> extends DefaultJSONModel implements IJSONSingle<T> {

    private static final long serialVersionUID = 1L;

    protected JSONObject jsonobject = new JSONObject();

    @JSONField(name = "")
    protected String name;

    @JSONField(name = "")
    protected T value;

    public JSONArraySingle(String name) {
        setName(name);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @SuppressWarnings("rawtypes")
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        JSONArraySingle other = (JSONArraySingle) obj;
        if (getName() == null) {
            if (other.getName() != null)
                return false;
        } else if (!getName().equals(other.getName()))
            return false;
        if (getValue() == null) {
            if (other.getValue() != null)
                return false;
        } else if (!getValue().equals(other.getValue()))
            return false;
        return true;
    }

    /**
     * @see open.commons.json.IJSONSingle#get(java.lang.String)
     */
    @Override
    public T get(String name) {

        return null;
    }

    /**
     * @see open.commons.json.IJSONSingle#getName()
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * @see open.commons.json.IJSONSingle#getValue()
     */
    @Override
    public T getValue() {
        return value;
    }

    /**
     * @see open.commons.json.model.DefaultJSONModel#mature0(code.org.codehaus.jettison.json.JSONObject)
     */
    @SuppressWarnings("unchecked")
    @Override
    protected void mature0(JSONObject json) throws JSONException {

        try {
            Field field = getClass().getDeclaredField("value");
            ArrayList<Object> fieldInfo = JSONMapper.investigateField(this, field, "value");

            value = (T) JSONMapper.unmarshall("value", json.get(name), JSONMapper.getBuildConfig(this).getFieldBuildConfig("value"), fieldInfo.toArray());

            setValue((T) value);

        } catch (JSONException e) {
            throw e;
        } catch (Exception e) {
            throw new JSONUnmarshalledException(e);
        }
    }

    protected void setName(String name) {
        this.name = name;

        try {
            jsonobject.put("name", this.value);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @see open.commons.json.IJSONSingle#setValue(java.io.Serializable)
     */
    @Override
    public void setValue(T value) {
        this.value = value;

        try {

            Field field = getClass().getDeclaredField("value");
            ArrayList<Object> fieldInfo = JSONMapper.investigateField(this, field, "value");

            // jsonobject.put(name, JSONMapper.marshall(this.value, JSONMapper.getBuildConfig(this), null,
            // fieldInfo.toArray()));
            jsonobject.put(name, JSONMapper.marshall(this.value, JSONMapper.getBuildConfig(this).getFieldBuildConfig("value"), null, fieldInfo.toArray()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @see open.commons.json.model.DefaultJSONModel#toJSONObject0()
     */
    @Override
    protected JSONObject toJSONObject0() throws JSONException {
        return jsonobject;
    }

    @Override
    public String toJSONString() throws JSONException {
        return toJSONObject().toString();
    }
}
