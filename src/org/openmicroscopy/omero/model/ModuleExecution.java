package org.openmicroscopy.omero.model;

import org.openmicroscopy.omero.BaseModelUtils;


import java.util.*;




/**
 * ModuleExecution generated by hbm2java
 */
public class
ModuleExecution 
implements java.io.Serializable ,
org.openmicroscopy.omero.OMEModel {

    // Fields    

     private Integer moduleExecutionId;
     private String status;
     private Double attributeDbTime;
     private String iteratorTag;
     private String dependence;
     private Double attributeSortTime;
     private Date timestamp;
     private Boolean virtualMex;
     private String inputTag;
     private String errorMessage;
     private Double attributeCreateTime;
     private String newFeatureTag;
     private Double totalTime;
     private Image image;
     private Dataset dataset;
     private Group group;
     private Experimenter experimenter;
     private Set thumbnails;
     private Set classifications;
     private Set repositories;
     private Set categories;
     private Set displayRois;
     private Set imageInfos;
     private Set imagePlates;
     private Set imagePixels;
     private Set groups;
     private Set experimenters;
     private Set categoryGroups;
     private Set imageAnnotations;
     private Set datasetAnnotations;
     private Set imageDimensions;
     private Set channelComponents;
     private Set displayOptions;


    // Constructors

    /** default constructor */
    public ModuleExecution() {
    }
    
    /** constructor with id */
    public ModuleExecution(Integer moduleExecutionId) {
        this.moduleExecutionId = moduleExecutionId;
    }
   
    
    

    // Property accessors

    /**
     * 
     */
    public Integer getModuleExecutionId() {
        return this.moduleExecutionId;
    }
    
    public void setModuleExecutionId(Integer moduleExecutionId) {
        this.moduleExecutionId = moduleExecutionId;
    }

    /**
     * 
     */
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     */
    public Double getAttributeDbTime() {
        return this.attributeDbTime;
    }
    
    public void setAttributeDbTime(Double attributeDbTime) {
        this.attributeDbTime = attributeDbTime;
    }

    /**
     * 
     */
    public String getIteratorTag() {
        return this.iteratorTag;
    }
    
    public void setIteratorTag(String iteratorTag) {
        this.iteratorTag = iteratorTag;
    }

    /**
     * 
     */
    public String getDependence() {
        return this.dependence;
    }
    
    public void setDependence(String dependence) {
        this.dependence = dependence;
    }

    /**
     * 
     */
    public Double getAttributeSortTime() {
        return this.attributeSortTime;
    }
    
    public void setAttributeSortTime(Double attributeSortTime) {
        this.attributeSortTime = attributeSortTime;
    }

    /**
     * 
     */
    public Date getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 
     */
    public Boolean getVirtualMex() {
        return this.virtualMex;
    }
    
    public void setVirtualMex(Boolean virtualMex) {
        this.virtualMex = virtualMex;
    }

    /**
     * 
     */
    public String getInputTag() {
        return this.inputTag;
    }
    
    public void setInputTag(String inputTag) {
        this.inputTag = inputTag;
    }

    /**
     * 
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }
    
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * 
     */
    public Double getAttributeCreateTime() {
        return this.attributeCreateTime;
    }
    
    public void setAttributeCreateTime(Double attributeCreateTime) {
        this.attributeCreateTime = attributeCreateTime;
    }

    /**
     * 
     */
    public String getNewFeatureTag() {
        return this.newFeatureTag;
    }
    
    public void setNewFeatureTag(String newFeatureTag) {
        this.newFeatureTag = newFeatureTag;
    }

    /**
     * 
     */
    public Double getTotalTime() {
        return this.totalTime;
    }
    
    public void setTotalTime(Double totalTime) {
        this.totalTime = totalTime;
    }

    /**
     * 
     */
    public Image getImage() {
        return this.image;
    }
    
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * 
     */
    public Dataset getDataset() {
        return this.dataset;
    }
    
    public void setDataset(Dataset dataset) {
        this.dataset = dataset;
    }

    /**
     * 
     */
    public Group getGroup() {
        return this.group;
    }
    
    public void setGroup(Group group) {
        this.group = group;
    }

    /**
     * 
     */
    public Experimenter getExperimenter() {
        return this.experimenter;
    }
    
    public void setExperimenter(Experimenter experimenter) {
        this.experimenter = experimenter;
    }

    /**
     * 
     */
    public Set getThumbnails() {
        return this.thumbnails;
    }
    
    public void setThumbnails(Set thumbnails) {
        this.thumbnails = thumbnails;
    }

    /**
     * 
     */
    public Set getClassifications() {
        return this.classifications;
    }
    
    public void setClassifications(Set classifications) {
        this.classifications = classifications;
    }

    /**
     * 
     */
    public Set getRepositories() {
        return this.repositories;
    }
    
    public void setRepositories(Set repositories) {
        this.repositories = repositories;
    }

    /**
     * 
     */
    public Set getCategories() {
        return this.categories;
    }
    
    public void setCategories(Set categories) {
        this.categories = categories;
    }

    /**
     * 
     */
    public Set getDisplayRois() {
        return this.displayRois;
    }
    
    public void setDisplayRois(Set displayRois) {
        this.displayRois = displayRois;
    }

    /**
     * 
     */
    public Set getImageInfos() {
        return this.imageInfos;
    }
    
    public void setImageInfos(Set imageInfos) {
        this.imageInfos = imageInfos;
    }

    /**
     * 
     */
    public Set getImagePlates() {
        return this.imagePlates;
    }
    
    public void setImagePlates(Set imagePlates) {
        this.imagePlates = imagePlates;
    }

    /**
     * 
     */
    public Set getImagePixels() {
        return this.imagePixels;
    }
    
    public void setImagePixels(Set imagePixels) {
        this.imagePixels = imagePixels;
    }

    /**
     * 
     */
    public Set getGroups() {
        return this.groups;
    }
    
    public void setGroups(Set groups) {
        this.groups = groups;
    }

    /**
     * 
     */
    public Set getExperimenters() {
        return this.experimenters;
    }
    
    public void setExperimenters(Set experimenters) {
        this.experimenters = experimenters;
    }

    /**
     * 
     */
    public Set getCategoryGroups() {
        return this.categoryGroups;
    }
    
    public void setCategoryGroups(Set categoryGroups) {
        this.categoryGroups = categoryGroups;
    }

    /**
     * 
     */
    public Set getImageAnnotations() {
        return this.imageAnnotations;
    }
    
    public void setImageAnnotations(Set imageAnnotations) {
        this.imageAnnotations = imageAnnotations;
    }

    /**
     * 
     */
    public Set getDatasetAnnotations() {
        return this.datasetAnnotations;
    }
    
    public void setDatasetAnnotations(Set datasetAnnotations) {
        this.datasetAnnotations = datasetAnnotations;
    }

    /**
     * 
     */
    public Set getImageDimensions() {
        return this.imageDimensions;
    }
    
    public void setImageDimensions(Set imageDimensions) {
        this.imageDimensions = imageDimensions;
    }

    /**
     * 
     */
    public Set getChannelComponents() {
        return this.channelComponents;
    }
    
    public void setChannelComponents(Set channelComponents) {
        this.channelComponents = channelComponents;
    }

    /**
     * 
     */
    public Set getDisplayOptions() {
        return this.displayOptions;
    }
    
    public void setDisplayOptions(Set displayOptions) {
        this.displayOptions = displayOptions;
    }





	/** utility methods. Container may re-assign this. */	
	protected static org.openmicroscopy.omero.BaseModelUtils _utils = 
		new org.openmicroscopy.omero.BaseModelUtils();
	public BaseModelUtils getUtils(){
		return _utils;
	}
	public void setUtils(BaseModelUtils utils){
		_utils = utils;
	}



}
