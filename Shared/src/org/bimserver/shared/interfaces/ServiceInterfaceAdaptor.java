package org.bimserver.shared.interfaces;

/******************************************************************************
 * Copyright (C) 2009-2013  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/
import org.bimserver.shared.exceptions.UserException;
import org.bimserver.shared.exceptions.ServerException;

public class ServiceInterfaceAdaptor implements ServiceInterface {

	public void abortTransaction(java.lang.Long tid) throws UserException, ServerException {
	}
	
	public void addBooleanAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName, java.lang.Boolean value) throws UserException, ServerException {
	}
	
	public void addDeserializer(org.bimserver.interfaces.objects.SDeserializerPluginConfiguration deserializer) throws UserException, ServerException {
	}
	
	public void addDoubleAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName, java.lang.Double value) throws UserException, ServerException {
	}
	
	public void addExtendedDataSchema(org.bimserver.interfaces.objects.SExtendedDataSchema extendedDataSchema) throws UserException, ServerException {
	}
	
	public void addExtendedDataToProject(java.lang.Long poid, org.bimserver.interfaces.objects.SExtendedData extendedData) throws UserException, ServerException {
	}
	
	public void addExtendedDataToRevision(java.lang.Long roid, org.bimserver.interfaces.objects.SExtendedData extendedData) throws UserException, ServerException {
	}
	
	public void addIntegerAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName, java.lang.Integer value) throws UserException, ServerException {
	}
	
	public void addInternalService(org.bimserver.interfaces.objects.SInternalServicePluginConfiguration internalService) throws UserException, ServerException {
	}
	
	public void addLocalServiceToProject(java.lang.Long poid, org.bimserver.interfaces.objects.SService sService, java.lang.Long internalServiceOid) throws UserException, ServerException {
	}
	
	public void addModelCompare(org.bimserver.interfaces.objects.SModelComparePluginConfiguration modelCompare) throws UserException, ServerException {
	}
	
	public void addModelMerger(org.bimserver.interfaces.objects.SModelMergerPluginConfiguration modelMerger) throws UserException, ServerException {
	}
	
	public void addObjectIDM(org.bimserver.interfaces.objects.SObjectIDMPluginConfiguration objectIDM) throws UserException, ServerException {
	}
	
	public org.bimserver.interfaces.objects.SProject addProject(java.lang.String projectName) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SProject addProjectAsSubProject(java.lang.String projectName, java.lang.Long parentPoid) throws UserException, ServerException {
		return null;
	}
	
	public void addQueryEngine(org.bimserver.interfaces.objects.SQueryEnginePluginConfiguration queryEngine) throws UserException, ServerException {
	}
	
	public void addReference(java.lang.Long tid, java.lang.Long oid, java.lang.String referenceName, java.lang.Long referenceOid) throws UserException, ServerException {
	}
	
	public void addRenderEngine(org.bimserver.interfaces.objects.SRenderEnginePluginConfiguration renderEngine) throws UserException, ServerException {
	}
	
	public void addSerializer(org.bimserver.interfaces.objects.SSerializerPluginConfiguration serializer) throws UserException, ServerException {
	}
	
	public void addServiceToProject(java.lang.Long poid, org.bimserver.interfaces.objects.SService sService) throws UserException, ServerException {
	}
	
	public void addStringAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName, java.lang.String value) throws UserException, ServerException {
	}
	
	public org.bimserver.interfaces.objects.SUser addUser(java.lang.String username, java.lang.String name, org.bimserver.interfaces.objects.SUserType type, java.lang.Boolean selfRegistration) throws UserException, ServerException {
		return null;
	}
	
	public void addUserToExtendedDataSchema(java.lang.Long uoid, java.lang.Long edsid) throws UserException, ServerException {
	}
	
	public java.lang.Boolean addUserToProject(java.lang.Long uoid, java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.String autologin(java.lang.String username, java.lang.String hash) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long branchToExistingProject(java.lang.Long roid, java.lang.Long destPoid, java.lang.String comment, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long branchToNewProject(java.lang.Long roid, java.lang.String projectName, java.lang.String comment, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Boolean changePassword(java.lang.Long uoid, java.lang.String oldPassword, java.lang.String newPassword) throws UserException, ServerException {
		return null;
	}
	
	public void changeUserType(java.lang.Long uoid, org.bimserver.interfaces.objects.SUserType userType) throws UserException, ServerException {
	}
	
	public java.lang.Long checkin(java.lang.Long poid, java.lang.String comment, java.lang.Long deserializerOid, java.lang.Long fileSize, java.lang.String fileName, javax.activation.DataHandler ifcFile, java.lang.Boolean merge, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long checkinFromUrl(java.lang.Long poid, java.lang.String comment, java.lang.Long deserializerOid, java.lang.String fileName, java.lang.String url, java.lang.Boolean merge, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long checkout(java.lang.Long roid, java.lang.Long serializerOid, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long checkoutLastRevision(java.lang.Long poid, java.lang.Long serializerOid, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public void cleanupLongAction(java.lang.Long actionId) throws UserException, ServerException {
	}
	
	public java.lang.Integer clearOutputFileCache() throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long commitTransaction(java.lang.Long tid, java.lang.String comment) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SCompareResult compare(java.lang.Long roid1, java.lang.Long roid2, org.bimserver.interfaces.objects.SCompareType sCompareType, java.lang.Long mcid) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Integer count(java.lang.Long roid, java.lang.String className) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long createObject(java.lang.Long tid, java.lang.String className) throws UserException, ServerException {
		return null;
	}
	
	public void deleteDeserializer(java.lang.Long sid) throws UserException, ServerException {
	}
	
	public void deleteInternalService(java.lang.Long oid) throws UserException, ServerException {
	}
	
	public void deleteModelCompare(java.lang.Long iid) throws UserException, ServerException {
	}
	
	public void deleteModelMerger(java.lang.Long iid) throws UserException, ServerException {
	}
	
	public void deleteObjectIDM(java.lang.Long oid) throws UserException, ServerException {
	}
	
	public java.lang.Boolean deleteProject(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public void deleteQueryEngine(java.lang.Long iid) throws UserException, ServerException {
	}
	
	public void deleteRenderEngine(java.lang.Long iid) throws UserException, ServerException {
	}
	
	public void deleteSerializer(java.lang.Long sid) throws UserException, ServerException {
	}
	
	public void deleteService(java.lang.Long oid) throws UserException, ServerException {
	}
	
	public java.lang.Boolean deleteUser(java.lang.Long uoid) throws UserException, ServerException {
		return null;
	}
	
	public void disablePlugin(java.lang.String name) throws UserException, ServerException {
	}
	
	public java.lang.Long download(java.lang.Long roid, java.lang.Long serializerOid, java.lang.Boolean showOwn, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long downloadByGuids(java.util.Set<java.lang.Long> roids, java.util.Set<java.lang.String> guids, java.lang.Long serializerOid, java.lang.Boolean deep, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long downloadByNames(java.util.Set<java.lang.Long> roids, java.util.Set<java.lang.String> names, java.lang.Long serializerOid, java.lang.Boolean deep, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long downloadByOids(java.util.Set<java.lang.Long> roids, java.util.Set<java.lang.Long> oids, java.lang.Long serializerOid, java.lang.Boolean sync, java.lang.Boolean deep) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long downloadByTypes(java.util.Set<java.lang.Long> roids, java.util.Set<java.lang.String> classNames, java.lang.Long serializerOid, java.lang.Boolean includeAllSubtypes, java.lang.Boolean useObjectIDM, java.lang.Boolean deep, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long downloadCompareResults(java.lang.Long serializerOid, java.lang.Long roid1, java.lang.Long roid2, java.lang.Long mcid, org.bimserver.interfaces.objects.SCompareType type, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long downloadQuery(java.lang.Long roid, java.lang.Long qeid, java.lang.String code, java.lang.Boolean sync, java.lang.Long serializerOid) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long downloadRevisions(java.util.Set<java.lang.Long> roids, java.lang.Long serializerOid, java.lang.Boolean sync) throws UserException, ServerException {
		return null;
	}
	
	public void enablePlugin(java.lang.String name) throws UserException, ServerException {
	}
	
	public void externalServiceUpdate(java.lang.String uuid, org.bimserver.interfaces.objects.SRemoteServiceUpdate sExternalServiceUpdate) throws UserException, ServerException {
	}
	
	public org.bimserver.interfaces.objects.SAccessMethod getAccessMethod() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SLongAction> getActiveLongActions() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SUser> getAllAuthorizedUsersOfProject(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SCheckout> getAllCheckoutsByUser(java.lang.Long uoid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SCheckout> getAllCheckoutsOfProject(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SCheckout> getAllCheckoutsOfProjectAndSubProjects(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SCheckout> getAllCheckoutsOfRevision(java.lang.Long roid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SDeserializerPluginDescriptor> getAllDeserializerPluginDescriptors() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SDeserializerPluginConfiguration> getAllDeserializers(java.lang.Boolean onlyEnabled) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SExtendedData> getAllExtendedDataOfRevision(java.lang.Long roid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SExtendedDataSchema> getAllExtendedDataSchemas() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SInternalServicePluginConfiguration> getAllInternalServices(java.lang.Boolean onlyEnabled) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SProfileDescriptor> getAllLocalProfiles(java.lang.String serviceIdentifier) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SServiceDescriptor> getAllLocalServiceDescriptors() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SModelComparePluginDescriptor> getAllModelComparePluginDescriptors() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SModelComparePluginConfiguration> getAllModelCompares(java.lang.Boolean onlyEnabled) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SModelMergerPluginDescriptor> getAllModelMergerPluginDescriptors() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SModelMergerPluginConfiguration> getAllModelMergers(java.lang.Boolean onlyEnabled) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SProject> getAllNonAuthorizedProjectsOfUser(java.lang.Long uoid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SUser> getAllNonAuthorizedUsersOfProject(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SObjectIDMPluginDescriptor> getAllObjectIDMPluginDescriptors() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SObjectIDMPluginConfiguration> getAllObjectIDMs(java.lang.Boolean onlyEnabled) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SPluginDescriptor> getAllPlugins() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SProfileDescriptor> getAllPrivateProfiles(java.lang.String notificationsUrl, java.lang.String serviceIdentifier, java.lang.String token) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SProject> getAllProjects(java.lang.Boolean onlyTopLevel) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SProfileDescriptor> getAllPublicProfiles(java.lang.String notificationsUrl, java.lang.String serviceIdentifier) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SQueryEnginePluginDescriptor> getAllQueryEnginePluginDescriptors() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SQueryEnginePluginConfiguration> getAllQueryEngines(java.lang.Boolean onlyEnabled) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SProject> getAllReadableProjects() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SRenderEnginePluginDescriptor> getAllRenderEnginePluginDescriptors() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SRenderEnginePluginConfiguration> getAllRenderEngines(java.lang.Boolean onlyEnabled) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SExtendedDataSchema> getAllRepositoryExtendedDataSchemas() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SRevision> getAllRevisionsByUser(java.lang.Long uoid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SRevision> getAllRevisionsOfProject(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SSerializerPluginDescriptor> getAllSerializerPluginDescriptors() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SSerializerPluginConfiguration> getAllSerializers(java.lang.Boolean onlyEnabled) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SServiceDescriptor> getAllServiceDescriptors() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SServicePluginDescriptor> getAllServicePluginDescriptors() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SService> getAllServicesOfProject(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SUser> getAllUsers() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<java.lang.String> getAvailableClasses() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<java.lang.String> getAvailableClassesInRevision(java.lang.Long roid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SBimServerInfo getBimServerInfo() throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Boolean getBooleanAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<java.lang.Boolean> getBooleanAttributes(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName) throws UserException, ServerException {
		return null;
	}
	
	public byte[] getByteArrayAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<byte[]> getByteArrayAttributes(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName) throws UserException, ServerException {
		return null;
	}
	
	public java.util.Set<java.lang.String> getCheckinWarnings(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.Set<java.lang.String> getCheckoutWarnings(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SUser getCurrentUser() throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SDataObject getDataObjectByGuid(java.lang.Long roid, java.lang.String guid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SDataObject getDataObjectByOid(java.lang.Long roid, java.lang.Long oid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SDataObject> getDataObjects(java.lang.Long roid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SDataObject> getDataObjectsByType(java.lang.Long roid, java.lang.String className) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SDatabaseInformation getDatabaseInformation() throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SModelComparePluginConfiguration getDefaultModelCompare() throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SModelMergerPluginConfiguration getDefaultModelMerger() throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SObjectIDMPluginConfiguration getDefaultObjectIDM() throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SQueryEnginePluginConfiguration getDefaultQueryEngine() throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SRenderEnginePluginConfiguration getDefaultRenderEngine() throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SSerializerPluginConfiguration getDefaultSerializer() throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SDeserializerPluginConfiguration getDeserializerById(java.lang.Long oid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SDeserializerPluginConfiguration getDeserializerByName(java.lang.String deserializerName) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Double getDoubleAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<java.lang.Double> getDoubleAttributes(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SDownloadResult getDownloadData(java.lang.Long actionId) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.String getEnumAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SExtendedData getExtendedData(java.lang.Long oid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SExtendedDataSchema getExtendedDataSchemaById(java.lang.Long oid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SExtendedDataSchema getExtendedDataSchemaByNamespace(java.lang.String namespace) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SExtendedDataSchema getExtendedDataSchemaFromRepository(java.lang.String namespace) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SFile getFile(java.lang.Long fileId) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SGeoTag getGeoTag(java.lang.Long goid) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Integer getIntegerAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<java.lang.Integer> getIntegerAttributes(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SInternalServicePluginConfiguration getInternalServiceById(java.lang.Long oid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SJavaInfo getJavaInfo() throws UserException, ServerException {
		return null;
	}
	
	public java.util.Date getLastDatabaseReset() throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SVersion getLatestVersion() throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SUser getLoggedInUser() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SLogAction> getLogs() throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SLongActionState getLongActionState(java.lang.Long actionId) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long getLongAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SMigration> getMigrations() throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SModelComparePluginConfiguration getModelCompareById(java.lang.Long oid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SModelComparePluginConfiguration getModelCompareByName(java.lang.String name) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SModelMergerPluginConfiguration getModelMergerById(java.lang.Long oid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SModelMergerPluginConfiguration getModelMergerByName(java.lang.String name) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SObjectIDMPluginConfiguration getObjectIDMById(java.lang.Long oid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SObjectIDMPluginConfiguration getObjectIDMByName(java.lang.String objectIDMName) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long getOidByGuid(java.lang.Long roid, java.lang.String guid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SObjectDefinition getPluginObjectDefinition(java.lang.String className) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SObjectType getPluginSettings(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SLongActionState getProgress(java.lang.Long topicId) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<java.lang.Long> getProgressTopicsOnProject(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<java.lang.Long> getProgressTopicsOnRevision(java.lang.Long poid, java.lang.Long roid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<java.lang.Long> getProgressTopicsOnServer() throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SProject getProjectByPoid(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SProject> getProjectsByName(java.lang.String name) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.String getProtocolBuffersFile() throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SQueryEnginePluginConfiguration getQueryEngineById(java.lang.Long oid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SQueryEnginePluginConfiguration getQueryEngineByName(java.lang.String name) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.String getQueryEngineExample(java.lang.Long qeid, java.lang.String key) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<java.lang.String> getQueryEngineExampleKeys(java.lang.Long qeid) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long getReference(java.lang.Long tid, java.lang.Long oid, java.lang.String referenceName) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<java.lang.Long> getReferences(java.lang.Long tid, java.lang.Long oid, java.lang.String referenceName) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.String getRemoteAddress() throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SRenderEnginePluginConfiguration getRenderEngineById(java.lang.Long oid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SRenderEnginePluginConfiguration getRenderEngineByName(java.lang.String name) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SRevision getRevision(java.lang.Long roid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SRevisionSummary getRevisionSummary(java.lang.Long roid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SSerializerPluginConfiguration getSerializerByContentType(java.lang.String contentType) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SSerializerPluginConfiguration getSerializerById(java.lang.Long oid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SSerializerPluginConfiguration getSerializerByName(java.lang.String serializerName) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SSerializerPluginConfiguration getSerializerByPluginClassName(java.lang.String pluginClassName) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SSerializerPluginDescriptor getSerializerPluginDescriptor(java.lang.String type) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SServerInfo getServerInfo() throws UserException, ServerException {
		return null;
	}
	
	public java.lang.String getServerLog() throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SServerSettings getServerSettings() throws UserException, ServerException {
		return null;
	}
	
	public java.util.Date getServerStartTime() throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SService getService(java.lang.Long soid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SServiceDescriptor getServiceDescriptor(java.lang.String url) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SServiceInterface> getServiceInterfaces() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SServiceParameter> getServiceMethodParameters(java.lang.String serviceInterfaceName, java.lang.String serviceMethodName) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SServiceMethod> getServiceMethods(java.lang.String serviceInterfaceName) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.String getServiceRepositoryUrl() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SServiceType> getServiceTypes(java.lang.String serviceInterfaceName) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.String getSettingEmailSenderAddress() throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Integer getSettingProtocolBuffersPort() throws UserException, ServerException {
		return null;
	}
	
	public java.lang.String getSettingSiteAddress() throws UserException, ServerException {
		return null;
	}
	
	public java.lang.String getSettingSmtpServer() throws UserException, ServerException {
		return null;
	}
	
	public java.lang.String getStringAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<java.lang.String> getStringAttributes(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName) throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SProject> getSubProjects(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SDeserializerPluginConfiguration getSuggestedDeserializerForExtension(java.lang.String extension) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SSystemInfo getSystemInfo() throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SUser getUserByUoid(java.lang.Long uoid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SUser getUserByUserName(java.lang.String username) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SUserSettings getUserSettings() throws UserException, ServerException {
		return null;
	}
	
	public java.util.List<org.bimserver.interfaces.objects.SProject> getUsersProjects(java.lang.Long uoid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SVersion getVersion() throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Boolean hasActiveSerializer(java.lang.String contentType) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Boolean isLoggedIn() throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Boolean isSettingAllowSelfRegistration() throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Boolean isSettingAllowUsersToCreateTopLevelProjects() throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Boolean isSettingCacheOutputFiles() throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Boolean isSettingCheckinMergingEnabled() throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Boolean isSettingGenerateGeometryOnCheckin() throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Boolean isSettingHideUserListForNonAdmin() throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Boolean isSettingSendConfirmationEmailAfterRegistration() throws UserException, ServerException {
		return null;
	}
	
	public java.lang.String login(java.lang.String username, java.lang.String password) throws UserException, ServerException {
		return null;
	}
	
	public void logout() throws UserException, ServerException {
	}
	
	public void migrateDatabase() throws UserException, ServerException {
	}
	
	public void registerChangeProgressOnProject(java.lang.Long endPointId, java.lang.Long poid) throws UserException, ServerException {
	}
	
	public void registerChangeProgressOnRevision(java.lang.Long endPointId, java.lang.Long roid, java.lang.Long poid) throws UserException, ServerException {
	}
	
	public void registerNewProjectHandler(java.lang.Long endPointId) throws UserException, ServerException {
	}
	
	public void registerNewRevisionOnSpecificProjectHandler(java.lang.Long endPointId, java.lang.Long poid) throws UserException, ServerException {
	}
	
	public void registerNewUserHandler(java.lang.Long endPointId) throws UserException, ServerException {
	}
	
	public void registerProgressHandler(java.lang.Long topicId, java.lang.Long endPointId) throws UserException, ServerException {
	}
	
	public java.lang.Long registerProgressOnProjectTopic(org.bimserver.interfaces.objects.SProgressTopicType type, java.lang.Long poid, java.lang.String description) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long registerProgressOnRevisionTopic(org.bimserver.interfaces.objects.SProgressTopicType type, java.lang.Long poid, java.lang.Long roid, java.lang.String description) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long registerProgressTopic(org.bimserver.interfaces.objects.SProgressTopicType type, java.lang.String description) throws UserException, ServerException {
		return null;
	}
	
	public void removeAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName, java.lang.Integer index) throws UserException, ServerException {
	}
	
	public void removeObject(java.lang.Long tid, java.lang.Long oid) throws UserException, ServerException {
	}
	
	public void removeReference(java.lang.Long tid, java.lang.Long oid, java.lang.String referenceName, java.lang.Integer index) throws UserException, ServerException {
	}
	
	public void removeUserFromExtendedDataSchema(java.lang.Long uoid, java.lang.Long edsid) throws UserException, ServerException {
	}
	
	public java.lang.Boolean removeUserFromProject(java.lang.Long uoid, java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public void requestPasswordChange(java.lang.String username, java.lang.String resetUrl) throws UserException, ServerException {
	}
	
	public void sendCompareEmail(org.bimserver.interfaces.objects.SCompareType sCompareType, java.lang.Long mcid, java.lang.Long poid, java.lang.Long roid1, java.lang.Long roid2, java.lang.String address) throws UserException, ServerException {
	}
	
	public void setBooleanAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName, java.lang.Boolean value) throws UserException, ServerException {
	}
	
	public void setBooleanAttributes(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName, java.util.List<java.lang.Boolean> values) throws UserException, ServerException {
	}
	
	public void setByteArrayAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName, java.lang.Byte[] value) throws UserException, ServerException {
	}
	
	public void setDefaultModelCompare(java.lang.Long oid) throws UserException, ServerException {
	}
	
	public void setDefaultModelMerger(java.lang.Long oid) throws UserException, ServerException {
	}
	
	public void setDefaultObjectIDM(java.lang.Long oid) throws UserException, ServerException {
	}
	
	public void setDefaultQueryEngine(java.lang.Long oid) throws UserException, ServerException {
	}
	
	public void setDefaultRenderEngine(java.lang.Long oid) throws UserException, ServerException {
	}
	
	public void setDefaultSerializer(java.lang.Long oid) throws UserException, ServerException {
	}
	
	public void setDoubleAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName, java.lang.Double value) throws UserException, ServerException {
	}
	
	public void setDoubleAttributes(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName, java.util.List<java.lang.Double> values) throws UserException, ServerException {
	}
	
	public void setEnumAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName, java.lang.String value) throws UserException, ServerException {
	}
	
	public void setIntegerAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName, java.lang.Integer value) throws UserException, ServerException {
	}
	
	public void setIntegerAttributes(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName, java.util.List<java.lang.Integer> values) throws UserException, ServerException {
	}
	
	public void setLongAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName, java.lang.Long value) throws UserException, ServerException {
	}
	
	public void setLongAttributes(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName, java.util.List<java.lang.Long> values) throws UserException, ServerException {
	}
	
	public void setPluginSettings(java.lang.Long poid, org.bimserver.interfaces.objects.SObjectType settings) throws UserException, ServerException {
	}
	
	public void setReference(java.lang.Long tid, java.lang.Long oid, java.lang.String referenceName, java.lang.Long referenceOid) throws UserException, ServerException {
	}
	
	public void setRevisionTag(java.lang.Long roid, java.lang.String tag) throws UserException, ServerException {
	}
	
	public void setServerSettings(org.bimserver.interfaces.objects.SServerSettings serverSettings) throws UserException, ServerException {
	}
	
	public void setServiceRepositoryUrl(java.lang.String url) throws UserException, ServerException {
	}
	
	public void setSettingAllowSelfRegistration(java.lang.Boolean allowSelfRegistration) throws UserException, ServerException {
	}
	
	public void setSettingAllowUsersToCreateTopLevelProjects(java.lang.Boolean allowUsersToCreateTopLevelProjects) throws UserException, ServerException {
	}
	
	public void setSettingCacheOutputFiles(java.lang.Boolean cacheOutputFiles) throws UserException, ServerException {
	}
	
	public void setSettingCheckinMergingEnabled(java.lang.Boolean checkinMergingEnabled) throws UserException, ServerException {
	}
	
	public void setSettingEmailSenderAddress(java.lang.String emailSenderAddress) throws UserException, ServerException {
	}
	
	public void setSettingGenerateGeometryOnCheckin(java.lang.Boolean generateGeometryOnCheckin) throws UserException, ServerException {
	}
	
	public void setSettingHideUserListForNonAdmin(java.lang.Boolean hideUserListForNonAdmin) throws UserException, ServerException {
	}
	
	public void setSettingProtocolBuffersPort(java.lang.Integer port) throws UserException, ServerException {
	}
	
	public void setSettingSendConfirmationEmailAfterRegistration(java.lang.Boolean sendConfirmationEmailAfterRegistration) throws UserException, ServerException {
	}
	
	public void setSettingSiteAddress(java.lang.String siteAddress) throws UserException, ServerException {
	}
	
	public void setSettingSmtpServer(java.lang.String smtpServer) throws UserException, ServerException {
	}
	
	public void setStringAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName, java.lang.String value) throws UserException, ServerException {
	}
	
	public void setWhiteListedDomains(java.util.List<java.lang.String> domains) throws UserException, ServerException {
	}
	
	public void setup(java.lang.String siteAddress, java.lang.String smtpServer, java.lang.String smtpSender, java.lang.String adminName, java.lang.String adminUsername, java.lang.String adminPassword) throws UserException, ServerException {
	}
	
	public java.lang.String shareRevision(java.lang.Long roid) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long startTransaction(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public void triggerNewExtendedData(java.lang.Long edid, java.lang.Long soid) throws UserException, ServerException {
	}
	
	public void triggerNewRevision(java.lang.Long roid, java.lang.Long soid) throws UserException, ServerException {
	}
	
	public java.lang.Boolean undeleteProject(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Boolean undeleteUser(java.lang.Long uoid) throws UserException, ServerException {
		return null;
	}
	
	public void unregisterChangeProgressOnProject(java.lang.Long endPointId, java.lang.Long poid) throws UserException, ServerException {
	}
	
	public void unregisterChangeProgressOnRevision(java.lang.Long endPointId, java.lang.Long roid, java.lang.Long poid) throws UserException, ServerException {
	}
	
	public void unregisterNewProjectHandler(java.lang.Long endPointId) throws UserException, ServerException {
	}
	
	public void unregisterNewRevisionOnSpecificProjectHandler(java.lang.Long endPointId, java.lang.Long poid) throws UserException, ServerException {
	}
	
	public void unregisterNewUserHandler(java.lang.Long endPointId) throws UserException, ServerException {
	}
	
	public void unregisterProgressHandler(java.lang.Long topicId, java.lang.Long endPointId) throws UserException, ServerException {
	}
	
	public void unregisterProgressTopic(java.lang.Long topicId) throws UserException, ServerException {
	}
	
	public void unsetAttribute(java.lang.Long tid, java.lang.Long oid, java.lang.String attributeName) throws UserException, ServerException {
	}
	
	public void unsetReference(java.lang.Long tid, java.lang.Long oid, java.lang.String referenceName) throws UserException, ServerException {
	}
	
	public void updateDeserializer(org.bimserver.interfaces.objects.SDeserializerPluginConfiguration deserializer) throws UserException, ServerException {
	}
	
	public void updateGeoTag(org.bimserver.interfaces.objects.SGeoTag sGeoTag) throws UserException, ServerException {
	}
	
	public void updateInternalService(org.bimserver.interfaces.objects.SInternalServicePluginConfiguration internalService) throws UserException, ServerException {
	}
	
	public void updateModelCompare(org.bimserver.interfaces.objects.SModelComparePluginConfiguration modelCompare) throws UserException, ServerException {
	}
	
	public void updateModelMerger(org.bimserver.interfaces.objects.SModelMergerPluginConfiguration modelMerger) throws UserException, ServerException {
	}
	
	public void updateObjectIDM(org.bimserver.interfaces.objects.SObjectIDMPluginConfiguration objectIDM) throws UserException, ServerException {
	}
	
	public void updateProgressTopic(java.lang.Long topicId, org.bimserver.interfaces.objects.SLongActionState state) throws UserException, ServerException {
	}
	
	public void updateProject(org.bimserver.interfaces.objects.SProject sProject) throws UserException, ServerException {
	}
	
	public void updateQueryEngine(org.bimserver.interfaces.objects.SQueryEnginePluginConfiguration queryEngine) throws UserException, ServerException {
	}
	
	public void updateRenderEngine(org.bimserver.interfaces.objects.SRenderEnginePluginConfiguration renderEngine) throws UserException, ServerException {
	}
	
	public void updateRevision(org.bimserver.interfaces.objects.SRevision sRevision) throws UserException, ServerException {
	}
	
	public void updateSerializer(org.bimserver.interfaces.objects.SSerializerPluginConfiguration serializer) throws UserException, ServerException {
	}
	
	public java.lang.Boolean upgradePossible() throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Long uploadFile(org.bimserver.interfaces.objects.SFile file) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Boolean userHasCheckinRights(java.lang.Long uoid, java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public java.lang.Boolean userHasRights(java.lang.Long poid) throws UserException, ServerException {
		return null;
	}
	
	public org.bimserver.interfaces.objects.SUser validateAccount(java.lang.Long uoid, java.lang.String token, java.lang.String password) throws UserException, ServerException {
		return null;
	}
	
}