package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State extends Model
{
    @Id
    public long id;
    public String stateName;

}
