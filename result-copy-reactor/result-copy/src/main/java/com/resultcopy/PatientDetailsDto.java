package com.resultcopy;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
/**
 * @author AC089545
 */
/** Demographic Information */
@Setter
@Getter
public class PatientDetailsDto {
  private Integer id ;
  private String firstName ;
  private String lastName ;
  private String mrn ;
  private String fin ;
  private Date resultCopiedDateTime;
}
