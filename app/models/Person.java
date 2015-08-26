package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;

/**
 * Created by SOAlade on 8/1/2015.
 */
@Entity
public class Person extends Model {
    @Id
    public Long id;

    @Constraints.Required
    public String title;

    @Constraints.Required
    public String firstName;

    @Constraints.Required
    public String lastName;

    public String gender;

    @Constraints.Required
    public String mobile;

    public String whatsAppId;

    @Constraints.Required
    public String email;

    public String PostalAddress;

    @Constraints.Required
    //@OneToOne
    public String nationality;

    //@OneToOne
    public String state;

    public String LocalChurch;

    public String chapterMember;


    public String commitments;



}
