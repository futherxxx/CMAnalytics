package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;

/**
 * Created by SOAlade on 8/1/2015.
 */
@Entity
public class RegisteredUser extends Model {
    @Id
    public Long id;

    @Constraints.Required
    public String userName;

    @Constraints.Required
    public String password;
}
