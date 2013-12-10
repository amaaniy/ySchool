package org.yarlithub.yschool.repository.model.obj.yschool;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;
import org.yarlithub.yschool.repository.model.obj.yschool.iface.IMarks;


/** 
 * Object mapping for hibernate-handled table: marks.
 * @author autogenerated
 */

@Entity
@Table(name = "marks", schema = "yschool")
public class Marks implements Cloneable, Serializable, IPojoGenEntity, IMarks {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558977425L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private Exam examIdexam;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private Integer isabsent;
	/** Field mapping. */
	private Double marks;
	/** Field mapping. */
	private Date modifiedTime;
	/** Field mapping. */
	private Student studentIdstudent;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public Marks() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public Marks(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param examIdexam Exam object;
	 * @param id Integer object;
	 * @param isabsent Integer object;
	 * @param modifiedTime Date object;
	 * @param studentIdstudent Student object;
	 */
	public Marks(Exam examIdexam, Integer id, Integer isabsent, 					
			Date modifiedTime, Student studentIdstudent) {

		this.examIdexam = examIdexam;
		this.id = id;
		this.isabsent = isabsent;
		this.modifiedTime = modifiedTime;
		this.studentIdstudent = studentIdstudent;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return Marks.class;
	}
 

    /**
     * Return the value associated with the column: examIdexam.
	 * @return A Exam object (this.examIdexam)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "exam_idexam", nullable = false )
	public Exam getExamIdexam() {
		return this.examIdexam;
		
	}
	

  
    /**  
     * Set the value related to the column: examIdexam.
	 * @param examIdexam the examIdexam value you wish to set
	 */
	public void setExamIdexam(final Exam examIdexam) {
		this.examIdexam = examIdexam;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic( optional = false )
	@Column( name = "idmarks", nullable = false  )
	public Integer getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

    /**
     * Return the value associated with the column: isabsent.
	 * @return A Integer object (this.isabsent)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Integer getIsabsent() {
		return this.isabsent;
		
	}
	

  
    /**  
     * Set the value related to the column: isabsent.
	 * @param isabsent the isabsent value you wish to set
	 */
	public void setIsabsent(final Integer isabsent) {
		this.isabsent = isabsent;
	}

    /**
     * Return the value associated with the column: marks.
	 * @return A Double object (this.marks)
	 */
	public Double getMarks() {
		return this.marks;
		
	}
	

  
    /**  
     * Set the value related to the column: marks.
	 * @param marks the marks value you wish to set
	 */
	public void setMarks(final Double marks) {
		this.marks = marks;
	}

    /**
     * Return the value associated with the column: modifiedTime.
	 * @return A Date object (this.modifiedTime)
	 */
	@Basic( optional = false )
	@Column( name = "modified_time", nullable = false  )
	public Date getModifiedTime() {
		return this.modifiedTime;
		
	}
	

  
    /**  
     * Set the value related to the column: modifiedTime.
	 * @param modifiedTime the modifiedTime value you wish to set
	 */
	public void setModifiedTime(final Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

    /**
     * Return the value associated with the column: studentIdstudent.
	 * @return A Student object (this.studentIdstudent)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "student_idstudent", nullable = false )
	public Student getStudentIdstudent() {
		return this.studentIdstudent;
		
	}
	

  
    /**  
     * Set the value related to the column: studentIdstudent.
	 * @param studentIdstudent the studentIdstudent value you wish to set
	 */
	public void setStudentIdstudent(final Student studentIdstudent) {
		this.studentIdstudent = studentIdstudent;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public Marks clone() throws CloneNotSupportedException {
		
        final Marks copy = (Marks)super.clone();

		copy.setExamIdexam(this.getExamIdexam());
		copy.setId(this.getId());
		copy.setIsabsent(this.getIsabsent());
		copy.setMarks(this.getMarks());
		copy.setModifiedTime(this.getModifiedTime());
		copy.setStudentIdstudent(this.getStudentIdstudent());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("id: " + this.getId() + ", ");
		sb.append("isabsent: " + this.getIsabsent() + ", ");
		sb.append("marks: " + this.getMarks() + ", ");
		sb.append("modifiedTime: " + this.getModifiedTime() + ", ");
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final Marks that; 
		try {
			that = (Marks) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((getExamIdexam() == null) && (that.getExamIdexam() == null)) || (getExamIdexam() != null && getExamIdexam().getId().equals(that.getExamIdexam().getId())));	
		result = result && (((getIsabsent() == null) && (that.getIsabsent() == null)) || (getIsabsent() != null && getIsabsent().equals(that.getIsabsent())));
		result = result && (((getMarks() == null) && (that.getMarks() == null)) || (getMarks() != null && getMarks().equals(that.getMarks())));
		result = result && (((getModifiedTime() == null) && (that.getModifiedTime() == null)) || (getModifiedTime() != null && getModifiedTime().equals(that.getModifiedTime())));
		result = result && (((getStudentIdstudent() == null) && (that.getStudentIdstudent() == null)) || (getStudentIdstudent() != null && getStudentIdstudent().getId().equals(that.getStudentIdstudent().getId())));	
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Integer newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0) {
							newHashCode = getId();
						} else {

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	

	
}
