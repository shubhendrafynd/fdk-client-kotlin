



##### [Back to Platform docs](./README.md)

## Inventory Methods

* [getJobsByCompany](#getjobsbycompany)
* [updateJob](#updatejob)
* [createJob](#createjob)
* [suppressStores](#suppressstores)
* [getConfigByCompany](#getconfigbycompany)
* [getJobSteps](#getjobsteps)
* [getJobByCompanyAndIntegration](#getjobbycompanyandintegration)
* [disable](#disable)
* [getJobConfigDefaults](#getjobconfigdefaults)
* [getJobByCode](#getjobbycode)
* [getJobCodeMetrics](#getjobcodemetrics)
* [getJobCodesByCompanyAndIntegration](#getjobcodesbycompanyandintegration)



## Methods with example and description


### getJobsByCompany
Get Job Configs For A Company




```kotlin
platformClient.inventory.getJobsByCompany(pageNo: pageNo, pageSize: pageSize).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNo | Int? | no | Page Number |   
| pageSize | Int? | no | Page Size |  



REST Endpoint that returns all job configs for a company

*Returned Response:*




[ResponseEnvelopeListJobConfigRawDTO](#ResponseEnvelopeListJobConfigRawDTO)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateJob
Updates An Existing Job Config




```kotlin
platformClient.inventory.updateJob(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [JobConfigDTO](#JobConfigDTO) | yes | Request body |


REST Endpoint that updates a job config

*Returned Response:*




[ResponseEnvelopeString](#ResponseEnvelopeString)

Job Config Updated Successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createJob
Creates A New Job Config




```kotlin
platformClient.inventory.createJob(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [JobConfigDTO](#JobConfigDTO) | yes | Request body |


REST Endpoint that creates a new job config

*Returned Response:*




[ResponseEnvelopeString](#ResponseEnvelopeString)

Job Config Created Successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### suppressStores
Get Slingshot Configuration Of  A Company




```kotlin
platformClient.inventory.suppressStores(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [SuppressStorePayload](#SuppressStorePayload) | yes | Request body |


REST Endpoint that returns all configuration detail of a company

*Returned Response:*




[ResponseEnvelopeKafkaResponse](#ResponseEnvelopeKafkaResponse)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getConfigByCompany
Get Slingshot Configuration Of  A Company




```kotlin
platformClient.inventory.getConfigByCompany().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```






REST Endpoint that returns all configuration detail of a company

*Returned Response:*




[ResponseEnvelopeListSlingshotConfigurationDetail](#ResponseEnvelopeListSlingshotConfigurationDetail)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getJobSteps
Get Job Code Steps




```kotlin
platformClient.inventory.getJobSteps(jobId: jobId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| jobId | Int | yes | Job Id |  



REST Endpoint that returns Inventory Job Steps

*Returned Response:*




[ResponseEnvelopeListJobStepsDTO](#ResponseEnvelopeListJobStepsDTO)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getJobByCompanyAndIntegration
Get Job Configs By Company And Integration




```kotlin
platformClient.inventory.getJobByCompanyAndIntegration(integrationId: integrationId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| integrationId | String | yes | Integration Id |   
| pageNo | Int? | no | Page Number |   
| pageSize | Int? | no | Page Size |  



REST Endpoint that returns all job configs by company And integration

*Returned Response:*




[ResponseEnvelopeListJobConfigDTO](#ResponseEnvelopeListJobConfigDTO)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### disable
Disable Job Config




```kotlin
platformClient.inventory.disable(integrationId: integrationId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| integrationId | String | yes | IntegrationId |  



REST Endpoint that disables Inventory Job Config

*Returned Response:*




[ResponseEnvelopeString](#ResponseEnvelopeString)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getJobConfigDefaults
Get Job Configs Defaults




```kotlin
platformClient.inventory.getJobConfigDefaults().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```






REST Endpoint that returns default fields job configs by company And integration

*Returned Response:*




[ResponseEnvelopeJobConfigDTO](#ResponseEnvelopeJobConfigDTO)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getJobByCode
Get Job Config By Code




```kotlin
platformClient.inventory.getJobByCode(code: code).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| code | String | yes | Job Code |  



REST Endpoint that returns job config by code

*Returned Response:*




[ResponseEnvelopeJobConfigDTO](#ResponseEnvelopeJobConfigDTO)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getJobCodeMetrics
Get Job Metrics




```kotlin
platformClient.inventory.getJobCodeMetrics(code: code, pageNo: pageNo, pageSize: pageSize, status: status, date: date).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| code | String | yes | Code |   
| pageNo | Int? | no | Page Number |   
| pageSize | Int? | no | Page Size |   
| status | String? | no | Status |   
| date | String? | no | From Date |  



REST Endpoint that returns Inventory Run History For A Job Code

*Returned Response:*




[ResponseEnvelopeJobMetricsDto](#ResponseEnvelopeJobMetricsDto)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getJobCodesByCompanyAndIntegration
Get Job Codes By Company And Integration




```kotlin
platformClient.inventory.getJobCodesByCompanyAndIntegration(integrationId: integrationId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| integrationId | String | yes | Integration Id |   
| pageNo | Int? | no | Page Number |   
| pageSize | Int? | no | Page Size |  



REST Endpoint that returns all job codes by company And integration

*Returned Response:*




[ResponseEnvelopeListJobConfigListDTO](#ResponseEnvelopeListJobConfigListDTO)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [DataTresholdDTO](#DataTresholdDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | minPrice | Double? |  yes  |  |
 | safeStock | Int? |  yes  |  |
 | periodThreshold | Int? |  yes  |  |
 | periodThresholdType | String? |  yes  |  |
 | periodTypeList | ArrayList<[GenericDTO](#GenericDTO)>? |  yes  |  |

---


 
 
 #### [GenericDTO](#GenericDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String? |  yes  |  |
 | value | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [JobConfigDTO](#JobConfigDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | integrationData | HashMap<String,HashMap<String,Any>>? |  yes  |  |
 | companyName | String? |  yes  |  |
 | integration | String |  no  |  |
 | companyId | Int |  no  |  |
 | taskDetails | [TaskDTO](#TaskDTO)? |  yes  |  |
 | thresholdDetails | [DataTresholdDTO](#DataTresholdDTO)? |  yes  |  |
 | jobCode | String? |  yes  |  |
 | alias | String? |  yes  |  |

---


 
 
 #### [TaskDTO](#TaskDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | Int? |  yes  |  |
 | groupList | ArrayList<[GenericDTO](#GenericDTO)>? |  yes  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | size | Int? |  yes  |  |
 | current | Int? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | itemTotal | Int? |  yes  |  |
 | nextId | String? |  yes  |  |
 | hasPrevious | Boolean? |  yes  |  |

---


 
 
 #### [ResponseEnvelopeString](#ResponseEnvelopeString)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String? |  yes  |  |
 | status | Int? |  yes  |  |
 | error | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | message | String? |  yes  |  |
 | totalTimeTakenInMillis | Int? |  yes  |  |
 | httpStatus | String? |  yes  |  |
 | items | String? |  yes  |  |
 | payload | String? |  yes  |  |
 | traceId | String? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [KafkaMetaModel](#KafkaMetaModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | jobType | String? |  yes  |  |
 | batchId | Int? |  yes  |  |
 | action | String? |  yes  |  |
 | trace | ArrayList<String>? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | createdTimestamp | Int? |  yes  |  |

---


 
 
 #### [SuppressStoreModel](#SuppressStoreModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stores | ArrayList<Int>? |  yes  |  |

---


 
 
 #### [SuppressStorePayload](#SuppressStorePayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | payload | ArrayList<[SuppressStoreModel](#SuppressStoreModel)>? |  yes  |  |
 | meta | [KafkaMetaModel](#KafkaMetaModel)? |  yes  |  |

---


 
 
 #### [KafkaResponse](#KafkaResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | offset | Int? |  yes  |  |
 | partition | Int? |  yes  |  |

---


 
 
 #### [ResponseEnvelopeKafkaResponse](#ResponseEnvelopeKafkaResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String? |  yes  |  |
 | status | Int? |  yes  |  |
 | error | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | message | String? |  yes  |  |
 | totalTimeTakenInMillis | Int? |  yes  |  |
 | httpStatus | String? |  yes  |  |
 | items | [KafkaResponse](#KafkaResponse)? |  yes  |  |
 | payload | [KafkaResponse](#KafkaResponse)? |  yes  |  |
 | traceId | String? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [GCompany](#GCompany)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | integration | String? |  yes  |  |
 | level | String? |  yes  |  |
 | uid | Int? |  yes  |  |
 | opted | Boolean? |  yes  |  |
 | permissions | ArrayList<String>? |  yes  |  |
 | token | String? |  yes  |  |
 | name | String? |  yes  |  |
 | stores | ArrayList<[GStore](#GStore)>? |  yes  |  |

---


 
 
 #### [GStore](#GStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | integration | String? |  yes  |  |
 | level | String? |  yes  |  |
 | uid | Int? |  yes  |  |
 | opted | Boolean? |  yes  |  |
 | permissions | ArrayList<String>? |  yes  |  |
 | token | String? |  yes  |  |
 | code | String? |  yes  |  |
 | name | String? |  yes  |  |
 | data | [StoreData](#StoreData)? |  yes  |  |

---


 
 
 #### [Metum](#Metum)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [ResponseEnvelopeListSlingshotConfigurationDetail](#ResponseEnvelopeListSlingshotConfigurationDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String? |  yes  |  |
 | status | Int? |  yes  |  |
 | error | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | message | String? |  yes  |  |
 | totalTimeTakenInMillis | Int? |  yes  |  |
 | httpStatus | String? |  yes  |  |
 | items | ArrayList<[SlingshotConfigurationDetail](#SlingshotConfigurationDetail)>? |  yes  |  |
 | payload | ArrayList<[SlingshotConfigurationDetail](#SlingshotConfigurationDetail)>? |  yes  |  |
 | traceId | String? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [SlingshotConfigurationDetail](#SlingshotConfigurationDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | integration | [SlingshotIntegration](#SlingshotIntegration)? |  yes  |  |
 | companies | ArrayList<[GCompany](#GCompany)>? |  yes  |  |

---


 
 
 #### [SlingshotIntegration](#SlingshotIntegration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | description | String? |  yes  |  |
 | name | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | meta | ArrayList<[Metum](#Metum)>? |  yes  |  |

---


 
 
 #### [StoreData](#StoreData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | locationId | String? |  yes  |  |

---


 
 
 #### [AWSS3config](#AWSS3config)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bucket | String? |  yes  |  |
 | region | String? |  yes  |  |
 | dir | String? |  yes  |  |
 | accessKey | String? |  yes  |  |
 | secretKey | String? |  yes  |  |
 | localFilePath | String? |  yes  |  |
 | archivePath | String? |  yes  |  |
 | archive | Boolean? |  yes  |  |
 | delete | Boolean? |  yes  |  |
 | unzip | Boolean? |  yes  |  |
 | zipFormat | String? |  yes  |  |
 | fileRegex | String? |  yes  |  |
 | archiveConfig | [ArchiveConfig](#ArchiveConfig)? |  yes  |  |

---


 
 
 #### [ArchiveConfig](#ArchiveConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | delete | Boolean? |  yes  |  |
 | archive | Boolean? |  yes  |  |
 | archiveDir | String? |  yes  |  |

---


 
 
 #### [Audit](#Audit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdBy | String? |  yes  |  |
 | modifiedBy | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |

---


 
 
 #### [CatalogMasterConfig](#CatalogMasterConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sourceSlug | String? |  yes  |  |

---


 
 
 #### [CompanyConfig](#CompanyConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | Int? |  yes  |  |
 | excludeSteps | ArrayList<Int>? |  yes  |  |
 | hiddenClosetKeys | ArrayList<String>? |  yes  |  |
 | openTags | HashMap<String,HashMap<String,Any>>? |  yes  |  |
 | taxIdentifiers | ArrayList<String>? |  yes  |  |
 | deleteQuantityThreshold | Int? |  yes  |  |

---


 
 
 #### [DBConfig](#DBConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | vendor | String? |  yes  |  |
 | host | String? |  yes  |  |
 | port | Int? |  yes  |  |
 | username | String? |  yes  |  |
 | password | String? |  yes  |  |
 | dbname | String? |  yes  |  |
 | query | String? |  yes  |  |
 | procedure | Boolean? |  yes  |  |
 | driverClass | String? |  yes  |  |
 | jdbcUrl | String? |  yes  |  |
 | optionalProperties | HashMap<String,String>? |  yes  |  |

---


 
 
 #### [DBConnectionProfile](#DBConnectionProfile)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | inventory | String? |  yes  |  |

---


 
 
 #### [DBParamConfig](#DBParamConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | params | HashMap<String,HashMap<String,Any>>? |  yes  |  |

---


 
 
 #### [DefaultHeadersDTO](#DefaultHeadersDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | store | [PropBeanDTO](#PropBeanDTO)? |  yes  |  |
 | intfArticleId | [PropBeanDTO](#PropBeanDTO)? |  yes  |  |
 | priceEffective | [PropBeanDTO](#PropBeanDTO)? |  yes  |  |
 | quantity | [PropBeanDTO](#PropBeanDTO)? |  yes  |  |

---


 
 
 #### [DocMappingConfig](#DocMappingConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | properties | HashMap<String,HashMap<String,Any>>? |  yes  |  |
 | junkDataThresholdCount | Int? |  yes  |  |
 | propBeanConfigs | ArrayList<[PropBeanConfig](#PropBeanConfig)>? |  yes  |  |
 | unwindField | String? |  yes  |  |
 | defaultHeaders | [DefaultHeadersDTO](#DefaultHeadersDTO)? |  yes  |  |

---


 
 
 #### [EmailConfig](#EmailConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | recepient | String? |  yes  |  |
 | host | String? |  yes  |  |
 | username | String? |  yes  |  |
 | password | String? |  yes  |  |
 | unzip | Boolean? |  yes  |  |
 | readFromContent | Boolean? |  yes  |  |
 | filterBasedOnRecepients | Boolean? |  yes  |  |
 | pcol | String? |  yes  |  |
 | subjectLineRegex | String? |  yes  |  |
 | senderAddress | String? |  yes  |  |
 | localDir | String? |  yes  |  |
 | folderNameHierarchies | ArrayList<String>? |  yes  |  |
 | attachmentRegex | String? |  yes  |  |
 | bodyContentRegex | String? |  yes  |  |
 | passwordProtected | Boolean? |  yes  |  |
 | zipFormat | String? |  yes  |  |
 | attachmentMandate | Boolean? |  yes  |  |
 | filterFilesAfterExtraction | Boolean? |  yes  |  |
 | archiveConfig | [ArchiveConfig](#ArchiveConfig)? |  yes  |  |
 | readAllUnreadMails | Boolean? |  yes  |  |
 | contentType | String? |  yes  |  |
 | downloadableLink | Boolean? |  yes  |  |
 | properties | HashMap<String,String>? |  yes  |  |

---


 
 
 #### [FTPConfig](#FTPConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | host | String? |  yes  |  |
 | port | Int? |  yes  |  |
 | username | String? |  yes  |  |
 | password | String? |  yes  |  |
 | unzip | Boolean? |  yes  |  |
 | retries | Int? |  yes  |  |
 | interval | Int? |  yes  |  |
 | localDir | String? |  yes  |  |
 | remoteDir | String? |  yes  |  |
 | zipFileRegex | String? |  yes  |  |
 | archiveConfig | [ArchiveConfig](#ArchiveConfig)? |  yes  |  |
 | fileRegex | String? |  yes  |  |
 | zipFormat | String? |  yes  |  |
 | readAllFiles | Boolean? |  yes  |  |

---


 
 
 #### [FileConfig](#FileConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | delimiter | String? |  yes  |  |
 | charset | String? |  yes  |  |
 | properties | HashMap<String,HashMap<String,Any>>? |  yes  |  |
 | fileHasHeader | Boolean? |  yes  |  |
 | headerIndex | Int? |  yes  |  |
 | headerArray | ArrayList<String>? |  yes  |  |
 | dataStartIndex | Int? |  yes  |  |
 | propBeanConfigs | ArrayList<[PropBeanConfig](#PropBeanConfig)>? |  yes  |  |
 | junkDataThresholdCount | Int? |  yes  |  |
 | fileType | String? |  yes  |  |
 | lineValidityCheck | Boolean? |  yes  |  |
 | sheetNames | ArrayList<String>? |  yes  |  |
 | readAllSheets | Boolean? |  yes  |  |
 | quoteChar | String? |  yes  |  |
 | escapeChar | String? |  yes  |  |
 | defaultHeaders | [DefaultHeadersDTO](#DefaultHeadersDTO)? |  yes  |  |

---


 
 
 #### [GoogleSpreadSheetConfig](#GoogleSpreadSheetConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | range | String? |  yes  |  |
 | sheetId | String? |  yes  |  |
 | clientSecretLocation | String? |  yes  |  |
 | credStorageDirectory | String? |  yes  |  |
 | localDir | String? |  yes  |  |
 | archiveConfig | [ArchiveConfig](#ArchiveConfig)? |  yes  |  |

---


 
 
 #### [HttpConfig](#HttpConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hosturl | String? |  yes  |  |
 | username | String? |  yes  |  |
 | password | String? |  yes  |  |
 | requestParams | HashMap<String,String>? |  yes  |  |
 | httpMethod | String? |  yes  |  |
 | requestPayload | String? |  yes  |  |
 | localPath | String? |  yes  |  |
 | archiveConfig | [ArchiveConfig](#ArchiveConfig)? |  yes  |  |

---


 
 
 #### [JobConfig](#JobConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int? |  yes  |  |
 | jobCode | String? |  yes  |  |
 | taskType | String? |  yes  |  |
 | syncDelay | Int? |  yes  |  |
 | cronExpression | String? |  yes  |  |
 | storeFilter | [StoreFilter](#StoreFilter)? |  yes  |  |
 | processConfig | [ProcessConfig](#ProcessConfig)? |  yes  |  |
 | storeConfig | ArrayList<[StoreConfig](#StoreConfig)>? |  yes  |  |
 | properties | HashMap<String,String>? |  yes  |  |
 | immediateFirstRun | Boolean? |  yes  |  |
 | disable | Boolean? |  yes  |  |
 | dependentJobCodes | ArrayList<String>? |  yes  |  |
 | companyConfig | ArrayList<[CompanyConfig](#CompanyConfig)>? |  yes  |  |
 | companyIds | ArrayList<Int>? |  yes  |  |
 | taxIdentifiers | ArrayList<String>? |  yes  |  |
 | priority | String? |  yes  |  |
 | periodThreshold | Int? |  yes  |  |
 | periodThresholdType | String? |  yes  |  |
 | dbConnectionProfile | [DBConnectionProfile](#DBConnectionProfile)? |  yes  |  |
 | params | HashMap<String,HashMap<String,Any>>? |  yes  |  |
 | openTags | HashMap<String,HashMap<String,Any>>? |  yes  |  |
 | deleteQuantityThreshold | Int? |  yes  |  |
 | catalogMasterConfig | [CatalogMasterConfig](#CatalogMasterConfig)? |  yes  |  |
 | aggregatorTypes | ArrayList<String>? |  yes  |  |
 | integrationType | String? |  yes  |  |
 | minPrice | Double? |  yes  |  |
 | audit | [Audit](#Audit)? |  yes  |  |
 | version | Int? |  yes  |  |
 | alias | String? |  yes  |  |

---


 
 
 #### [JobConfigRawDTO](#JobConfigRawDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyName | String |  no  |  |
 | integration | String |  no  |  |
 | companyId | Int |  no  |  |
 | data | [JobConfig](#JobConfig)? |  yes  |  |

---


 
 
 #### [JsonDocConfig](#JsonDocConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | propBeanConfigs | ArrayList<[PropBeanConfig](#PropBeanConfig)>? |  yes  |  |

---


 
 
 #### [LocalFileConfig](#LocalFileConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | retries | Int? |  yes  |  |
 | interval | Int? |  yes  |  |
 | localDir | String? |  yes  |  |
 | workingDir | String? |  yes  |  |
 | unzip | Boolean? |  yes  |  |
 | zipFileRegex | String? |  yes  |  |
 | fileRegex | String? |  yes  |  |
 | zipFormat | String? |  yes  |  |
 | archiveConfig | [ArchiveConfig](#ArchiveConfig)? |  yes  |  |
 | readAllFiles | Boolean? |  yes  |  |

---


 
 
 #### [MongoDocConfig](#MongoDocConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | collectionName | String? |  yes  |  |
 | findQuery | HashMap<String,HashMap<String,Any>>? |  yes  |  |
 | projectionQuery | HashMap<String,HashMap<String,Any>>? |  yes  |  |
 | propBeanConfigs | ArrayList<[PropBeanConfig](#PropBeanConfig)>? |  yes  |  |
 | aggregatePipeline | ArrayList<HashMap<String,HashMap<String,Any>>>? |  yes  |  |
 | skipSave | Boolean? |  yes  |  |

---


 
 
 #### [OAuthConfig](#OAuthConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | limit | Int? |  yes  |  |
 | pages | Int? |  yes  |  |
 | interval | Int? |  yes  |  |
 | consumerKey | String? |  yes  |  |
 | consumerSecret | String? |  yes  |  |
 | token | String? |  yes  |  |
 | tokenSecret | String? |  yes  |  |
 | restUrl | String? |  yes  |  |
 | restBaseUrl | String? |  yes  |  |
 | functionName | String? |  yes  |  |

---


 
 
 #### [ProcessConfig](#ProcessConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dbConfig | [DBConfig](#DBConfig)? |  yes  |  |
 | dbParamConfig | [DBParamConfig](#DBParamConfig)? |  yes  |  |
 | sftpConfig | [SFTPConfig](#SFTPConfig)? |  yes  |  |
 | awsS3Config | [AWSS3config](#AWSS3config)? |  yes  |  |
 | mongoDocConfig | [MongoDocConfig](#MongoDocConfig)? |  yes  |  |
 | ftpConfig | [FTPConfig](#FTPConfig)? |  yes  |  |
 | emailConfig | [EmailConfig](#EmailConfig)? |  yes  |  |
 | fileConfig | [FileConfig](#FileConfig)? |  yes  |  |
 | jsonDocConfig | [JsonDocConfig](#JsonDocConfig)? |  yes  |  |
 | docMappingConfig | [DocMappingConfig](#DocMappingConfig)? |  yes  |  |
 | taskStepConfig | [TaskStepConfig](#TaskStepConfig)? |  yes  |  |
 | httpConfig | [HttpConfig](#HttpConfig)? |  yes  |  |
 | localFileConfig | [LocalFileConfig](#LocalFileConfig)? |  yes  |  |
 | oauthConfig | [OAuthConfig](#OAuthConfig)? |  yes  |  |
 | googleSpreadsheetConfig | [GoogleSpreadSheetConfig](#GoogleSpreadSheetConfig)? |  yes  |  |

---


 
 
 #### [PropBeanConfig](#PropBeanConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | required | Boolean? |  yes  |  |
 | optional | Boolean? |  yes  |  |
 | send | [Send](#Send)? |  yes  |  |
 | validations | ArrayList<HashMap<String,HashMap<String,Any>>>? |  yes  |  |
 | values | ArrayList<String>? |  yes  |  |
 | include | Boolean? |  yes  |  |
 | sourceField | String? |  yes  |  |
 | sourceFields | ArrayList<String>? |  yes  |  |
 | destinationField | String? |  yes  |  |
 | dataType | String? |  yes  |  |
 | defaultValue | HashMap<String,Any>? |  yes  |  |
 | constValue | HashMap<String,Any>? |  yes  |  |
 | concatStr | String? |  yes  |  |
 | functionName | String? |  yes  |  |
 | transformerName | String? |  yes  |  |
 | allParamFunctionName | String? |  yes  |  |
 | subSeparator | String? |  yes  |  |
 | indexField | String? |  yes  |  |
 | ignoreIfNotExists | Boolean? |  yes  |  |
 | identifierType | String? |  yes  |  |
 | projectionQuery | HashMap<String,HashMap<String,Any>>? |  yes  |  |
 | enrichFromMaster | Boolean? |  yes  |  |

---


 
 
 #### [PropBeanDTO](#PropBeanDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | required | Boolean? |  yes  |  |
 | optional | Boolean? |  yes  |  |
 | include | Boolean? |  yes  |  |
 | sourceField | String? |  yes  |  |
 | sourceFields | ArrayList<String>? |  yes  |  |
 | destinationField | String? |  yes  |  |
 | dataType | String? |  yes  |  |
 | defaultValue | HashMap<String,Any>? |  yes  |  |
 | constValue | HashMap<String,Any>? |  yes  |  |
 | concatStr | String? |  yes  |  |
 | functionName | String? |  yes  |  |
 | transformerName | String? |  yes  |  |
 | allParamFunctionName | String? |  yes  |  |
 | subSeparator | String? |  yes  |  |
 | indexField | String? |  yes  |  |
 | ignoreIfNotExists | Boolean? |  yes  |  |
 | identifierType | String? |  yes  |  |
 | projectionQuery | HashMap<String,HashMap<String,Any>>? |  yes  |  |
 | enrichFromMaster | Boolean? |  yes  |  |

---


 
 
 #### [ResponseEnvelopeListJobConfigRawDTO](#ResponseEnvelopeListJobConfigRawDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String? |  yes  |  |
 | status | Int? |  yes  |  |
 | error | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | message | String? |  yes  |  |
 | totalTimeTakenInMillis | Int? |  yes  |  |
 | httpStatus | String? |  yes  |  |
 | items | ArrayList<[JobConfigRawDTO](#JobConfigRawDTO)>? |  yes  |  |
 | payload | ArrayList<[JobConfigRawDTO](#JobConfigRawDTO)>? |  yes  |  |
 | traceId | String? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [SFTPConfig](#SFTPConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | host | String? |  yes  |  |
 | port | Int? |  yes  |  |
 | username | String? |  yes  |  |
 | password | String? |  yes  |  |
 | unzip | Boolean? |  yes  |  |
 | retries | Int? |  yes  |  |
 | interval | Int? |  yes  |  |
 | privateKeyPath | String? |  yes  |  |
 | strictHostKeyChecking | Boolean? |  yes  |  |
 | localDir | String? |  yes  |  |
 | remoteDir | String? |  yes  |  |
 | passwordProtected | Boolean? |  yes  |  |
 | zipFileRegex | String? |  yes  |  |
 | fileRegex | String? |  yes  |  |
 | zipFormat | String? |  yes  |  |
 | archiveConfig | [ArchiveConfig](#ArchiveConfig)? |  yes  |  |
 | readAllFiles | Boolean? |  yes  |  |

---


 
 
 #### [Send](#Send)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | raw | Boolean? |  yes  |  |
 | processed | Boolean? |  yes  |  |

---


 
 
 #### [StoreConfig](#StoreConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | jobCode | String? |  yes  |  |
 | storeid | String? |  yes  |  |
 | storeAlias | String? |  yes  |  |
 | storeFileRegex | String? |  yes  |  |
 | storeFileName | String? |  yes  |  |
 | processConfig | [ProcessConfig](#ProcessConfig)? |  yes  |  |
 | properties | HashMap<String,String>? |  yes  |  |

---


 
 
 #### [StoreFilter](#StoreFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | includeTags | ArrayList<String>? |  yes  |  |
 | excludeTags | ArrayList<String>? |  yes  |  |
 | query | HashMap<String,HashMap<String,Any>>? |  yes  |  |

---


 
 
 #### [TaskConfig](#TaskConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | taskConfigId | Int? |  yes  |  |
 | taskParams | ArrayList<[TaskParam](#TaskParam)>? |  yes  |  |

---


 
 
 #### [TaskParam](#TaskParam)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | value | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [TaskStepConfig](#TaskStepConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | taskConfigs | ArrayList<[TaskConfig](#TaskConfig)>? |  yes  |  |
 | taskConfigIds | ArrayList<Int>? |  yes  |  |
 | taskConfigGroupIds | ArrayList<Int>? |  yes  |  |

---


 
 
 #### [JobStepsDTO](#JobStepsDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stepName | String? |  yes  |  |
 | type | String? |  yes  |  |
 | stepExecutionTime | Int? |  yes  |  |
 | startCount | Int? |  yes  |  |
 | endCount | Int? |  yes  |  |
 | deletedCount | Int? |  yes  |  |
 | processedStartTime | String? |  yes  |  |
 | processedAt | String? |  yes  |  |

---


 
 
 #### [ResponseEnvelopeListJobStepsDTO](#ResponseEnvelopeListJobStepsDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String? |  yes  |  |
 | status | Int? |  yes  |  |
 | error | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | message | String? |  yes  |  |
 | totalTimeTakenInMillis | Int? |  yes  |  |
 | httpStatus | String? |  yes  |  |
 | items | ArrayList<[JobStepsDTO](#JobStepsDTO)>? |  yes  |  |
 | payload | ArrayList<[JobStepsDTO](#JobStepsDTO)>? |  yes  |  |
 | traceId | String? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [ResponseEnvelopeListJobConfigDTO](#ResponseEnvelopeListJobConfigDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String? |  yes  |  |
 | status | Int? |  yes  |  |
 | error | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | message | String? |  yes  |  |
 | totalTimeTakenInMillis | Int? |  yes  |  |
 | httpStatus | String? |  yes  |  |
 | items | ArrayList<[JobConfigDTO](#JobConfigDTO)>? |  yes  |  |
 | payload | ArrayList<[JobConfigDTO](#JobConfigDTO)>? |  yes  |  |
 | traceId | String? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [ResponseEnvelopeJobConfigDTO](#ResponseEnvelopeJobConfigDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String? |  yes  |  |
 | status | Int? |  yes  |  |
 | error | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | message | String? |  yes  |  |
 | totalTimeTakenInMillis | Int? |  yes  |  |
 | httpStatus | String? |  yes  |  |
 | items | [JobConfigDTO](#JobConfigDTO)? |  yes  |  |
 | payload | [JobConfigDTO](#JobConfigDTO)? |  yes  |  |
 | traceId | String? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [JobHistoryDto](#JobHistoryDto)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalAddedCount | Int? |  yes  |  |
 | totalUpdatedCount | Int? |  yes  |  |
 | totalSuppressedCount | Int? |  yes  |  |
 | totalInitialCount | Int? |  yes  |  |
 | jobId | Int? |  yes  |  |
 | status | String? |  yes  |  |
 | jobCode | String? |  yes  |  |
 | processedOn | String? |  yes  |  |
 | filename | ArrayList<String>? |  yes  |  |
 | errorType | String? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [JobMetricsDto](#JobMetricsDto)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | jobCode | String? |  yes  |  |
 | isRunMoreThanUsual | String? |  yes  |  |
 | jobHistory | ArrayList<[JobHistoryDto](#JobHistoryDto)>? |  yes  |  |
 | totalSuccessCount | Int? |  yes  |  |
 | totalFailureCount | Int? |  yes  |  |
 | totalWarningCount | Int? |  yes  |  |
 | totalSuppressedCount | Int? |  yes  |  |
 | totalJobRuns | Int? |  yes  |  |

---


 
 
 #### [ResponseEnvelopeJobMetricsDto](#ResponseEnvelopeJobMetricsDto)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String? |  yes  |  |
 | status | Int? |  yes  |  |
 | error | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | message | String? |  yes  |  |
 | totalTimeTakenInMillis | Int? |  yes  |  |
 | httpStatus | String? |  yes  |  |
 | items | [JobMetricsDto](#JobMetricsDto)? |  yes  |  |
 | payload | [JobMetricsDto](#JobMetricsDto)? |  yes  |  |
 | traceId | String? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [JobConfigListDTO](#JobConfigListDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String? |  yes  |  |
 | alias | String? |  yes  |  |
 | modifiedBy | String? |  yes  |  |
 | createdBy | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [ResponseEnvelopeListJobConfigListDTO](#ResponseEnvelopeListJobConfigListDTO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String? |  yes  |  |
 | status | Int? |  yes  |  |
 | error | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | message | String? |  yes  |  |
 | totalTimeTakenInMillis | Int? |  yes  |  |
 | httpStatus | String? |  yes  |  |
 | items | ArrayList<[JobConfigListDTO](#JobConfigListDTO)>? |  yes  |  |
 | payload | ArrayList<[JobConfigListDTO](#JobConfigListDTO)>? |  yes  |  |
 | traceId | String? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---



