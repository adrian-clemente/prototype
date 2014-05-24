
package com.prototype.user;

import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Generate a user
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.PegasusDataTemplateGenerator", comments = "LinkedIn Data Template. Generated from /home/adrianc/apps/workspace/prototype/api/src/main/pegasus/com/prototype/user/User.pdsc.", date = "Fri May 23 20:46:56 CEST 2014")
public class User
    extends RecordTemplate
{

    private final static User.Fields _fields = new User.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"com.prototype.user\",\"doc\":\"Generate a user\",\"fields\":[{\"name\":\"username\",\"type\":\"string\",\"doc\":\"The user name\"}]}"));
    private final static RecordDataSchema.Field FIELD_Username = SCHEMA.getField("username");

    public User() {
        super(new DataMap(), SCHEMA);
    }

    public User(DataMap data) {
        super(data, SCHEMA);
    }

    public static User.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for username
     * 
     * @see Fields#username
     */
    public boolean hasUsername() {
        return contains(FIELD_Username);
    }

    /**
     * Remover for username
     * 
     * @see Fields#username
     */
    public void removeUsername() {
        remove(FIELD_Username);
    }

    /**
     * Getter for username
     * 
     * @see Fields#username
     */
    public String getUsername(GetMode mode) {
        return obtainDirect(FIELD_Username, String.class, mode);
    }

    /**
     * Getter for username
     * 
     * @see Fields#username
     */
    public String getUsername() {
        return getUsername(GetMode.STRICT);
    }

    /**
     * Setter for username
     * 
     * @see Fields#username
     */
    public User setUsername(String value, SetMode mode) {
        putDirect(FIELD_Username, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for username
     * 
     * @see Fields#username
     */
    public User setUsername(String value) {
        putDirect(FIELD_Username, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public User clone()
        throws CloneNotSupportedException
    {
        return ((User) super.clone());
    }

    @Override
    public User copy()
        throws CloneNotSupportedException
    {
        return ((User) super.copy());
    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        /**
         * The user name
         * 
         */
        public PathSpec username() {
            return new PathSpec(getPathComponents(), "username");
        }

    }

}
