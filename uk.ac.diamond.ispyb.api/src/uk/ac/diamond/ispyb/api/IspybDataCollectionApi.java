package uk.ac.diamond.ispyb.api;

import java.io.Closeable;

public interface IspybDataCollectionApi extends Closeable {
	public int upsertDataCollection(DataCollection dataCollection);
	public int upsertDataCollectionGroup(DataCollectionGroup dataCollectionGroup);
	public DataCollection retrieveDataCollectionForSubsample(int id);
}
