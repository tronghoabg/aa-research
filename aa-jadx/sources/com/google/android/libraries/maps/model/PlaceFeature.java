package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public final class PlaceFeature extends com.google.android.libraries.maps.model.Feature {
    private final com.google.android.libraries.maps.model.internal.IFeatureDelegate a;

    public PlaceFeature(com.google.android.libraries.maps.model.internal.IFeatureDelegate iFeatureDelegate) {
        super(iFeatureDelegate);
        this.a = iFeatureDelegate;
    }

    public java.lang.String getPlaceId() {
        try {
            return this.a.getPlaceId();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }
}
