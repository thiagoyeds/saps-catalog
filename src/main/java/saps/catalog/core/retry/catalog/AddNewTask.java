/* (C)2020 */
package saps.catalog.core.retry.catalog;

import java.util.Date;
import saps.catalog.core.Catalog;
import saps.common.core.model.SapsImage;

public class AddNewTask implements CatalogRetry<SapsImage> {

  private Catalog imageStore;
  private String taskId;
  private String dataset;
  private String region;
  private Date date;
  private int priority;
  private String userEmail;
  private String inputdownloadingPhaseTag;
  private String digestInputdownloading;
  private String preprocessingPhaseTag;
  private String digestPreprocessing;
  private String processingPhaseTag;
  private String digestProcessing;

  public AddNewTask(
      Catalog imageStore,
      String taskId,
      String dataset,
      String region,
      Date date,
      int priority,
      String userEmail,
      String inputdownloadingPhaseTag,
      String digestInputdownloading,
      String preprocessingPhaseTag,
      String digestPreprocessing,
      String processingPhaseTag,
      String digestProcessing) {
    this.imageStore = imageStore;
    this.taskId = taskId;
    this.dataset = dataset;
    this.region = region;
    this.date = date;
    this.priority = priority;
    this.userEmail = userEmail;
    this.inputdownloadingPhaseTag = inputdownloadingPhaseTag;
    this.digestInputdownloading = digestInputdownloading;
    this.preprocessingPhaseTag = preprocessingPhaseTag;
    this.digestPreprocessing = digestPreprocessing;
    this.processingPhaseTag = processingPhaseTag;
    this.digestProcessing = digestProcessing;
  }

  @Override
  public SapsImage run() {
    return imageStore.addTask(
        taskId,
        dataset,
        region,
        date,
        priority,
        userEmail,
        inputdownloadingPhaseTag,
        digestInputdownloading,
        preprocessingPhaseTag,
        digestPreprocessing,
        processingPhaseTag,
        digestProcessing);
  }
}
