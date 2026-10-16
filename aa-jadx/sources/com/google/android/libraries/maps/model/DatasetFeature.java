package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public final class DatasetFeature extends com.google.android.libraries.maps.model.Feature {
    private final com.google.android.libraries.maps.model.internal.IFeatureDelegate a;

    public DatasetFeature(com.google.android.libraries.maps.model.internal.IFeatureDelegate iFeatureDelegate) {
        super(iFeatureDelegate);
        this.a = iFeatureDelegate;
    }

    public java.util.Map<java.lang.String, java.lang.String> getDatasetAttributes() {
        try {
            return defpackage.yhe.j(this.a.getDatasetAttributes());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public java.lang.String getDatasetId() {
        try {
            return this.a.getDatasetId();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }
}
