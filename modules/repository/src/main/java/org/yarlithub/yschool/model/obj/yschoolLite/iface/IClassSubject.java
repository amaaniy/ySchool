package org.yarlithub.yschool.model.obj.yschoolLite.iface;
import java.util.Set;
import org.yarlithub.yschool.model.obj.yschoolLite.Classroom;
import org.yarlithub.yschool.model.obj.yschoolLite.Exam;
import org.yarlithub.yschool.model.obj.yschoolLite.Subject;


/** 
 * Object interface mapping for hibernate-handled table: Class_Subject.
 * @author autogenerated
 */

public interface IClassSubject {



    /**
     * Return the value associated with the column: classIdclass.
	 * @return A Classroom object (this.classIdclass)
	 */
	Classroom getClassIdclass();
	

  
    /**  
     * Set the value related to the column: classIdclass.
	 * @param classIdclass the classIdclass value you wish to set
	 */
	void setClassIdclass(final Classroom classIdclass);

    /**
     * Return the value associated with the column: exam.
	 * @return A Set&lt;Exam&gt; object (this.exam)
	 */
	Set<Exam> getExams();
	
	/**
	 * Adds a bi-directional link of type Exam to the exams set.
	 * @param exam item to add
	 */
	void addExam(Exam exam);

  
    /**  
     * Set the value related to the column: exam.
	 * @param exam the exam value you wish to set
	 */
	void setExams(final Set<Exam> exam);

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
	Integer getId();
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	void setId(final Integer id);

    /**
     * Return the value associated with the column: subjectIdsubject.
	 * @return A Subject object (this.subjectIdsubject)
	 */
	Subject getSubjectIdsubject();
	

  
    /**  
     * Set the value related to the column: subjectIdsubject.
	 * @param subjectIdsubject the subjectIdsubject value you wish to set
	 */
	void setSubjectIdsubject(final Subject subjectIdsubject);

	// end of interface
}