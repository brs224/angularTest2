//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.14 at 02:16:36 PM CST 
//


package com.thomsonreuters.grc.workflow.domain;

import java.beans.Transient;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkOrderType", propOrder = {
    "id",
    "uuid",
    "regarding",
    "startDate",
    "summary",
    "status",
    "hasChanged",
    "updatedBy",
    "updatedByToken",
    "isManualWorkOrder",
    "workProductType",
    "sectorsConceptIds",
    "sourceDocument",
    "workStreams"
})
public class WorkOrderType {

    @XmlElement
    protected BigInteger id;
    @XmlElement
    protected String uuid;
    @XmlElement
    protected String regarding;
    @XmlElement
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement
    protected String summary;
    @XmlElement
    protected String status;
    protected boolean hasChanged;
    @XmlElement
    protected String updatedBy;
    @XmlElement
    protected String updatedByToken;
    @XmlElement
    protected boolean isManualWorkOrder;
    @XmlElement
    protected String workProductType;
    @XmlElement
    protected String sectorsConceptIds;
    @XmlElement
    protected DocumentType sourceDocument;
    @XmlElement
    protected WorkStreamListType workStreams;
    
    public WorkOrderType() {
    	
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getRegarding() {
        return regarding;
    }

    public void setRegarding(String regarding) {
        this.regarding = regarding;
    }

    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    public void setStartDate(XMLGregorianCalendar startDate) {
        this.startDate = startDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isHasChanged() {
        return hasChanged;
    }

    public void setHasChanged(boolean hasChanged) {
        this.hasChanged = hasChanged;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedByToken() {
        return updatedByToken;
    }

    public void setUpdatedByToken(String updatedByToken) {
        this.updatedByToken = updatedByToken;
    }

    public boolean isManualWorkOrder() {
        return isManualWorkOrder;
    }

    public void setManualWorkOrder(boolean isManualWorkOrder) {
        this.isManualWorkOrder = isManualWorkOrder;
    }

    public String getWorkProductType() {
        return workProductType;
    }

    public void setWorkProductType(String workProductType) {
        this.workProductType = workProductType;
    }

    public String getSectorsConceptIds() {
        return sectorsConceptIds;
    }

    public void setSectorsConceptIds(String sectorsConceptIds) {
        this.sectorsConceptIds = sectorsConceptIds;
    }

    public DocumentType getSourceDocument() {
        return sourceDocument;
    }

    public void setSourceDocument(DocumentType sourceDocument) {
        this.sourceDocument = sourceDocument;
    }

    public WorkStreamListType getWorkStreams() {
        return workStreams;
    }

    public void setWorkStreams(WorkStreamListType workStreams) {
        this.workStreams = workStreams;
    }
}