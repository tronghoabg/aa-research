package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Feature {
    private final com.google.android.libraries.maps.model.internal.IFeatureDelegate a;

    public @interface SubfeatureType {
        public static final int DATASET_FEATURE = 2;
        public static final int PLACE_FEATURE = 1;
        public static final int SUBFEATURE_TYPE_UNSPECIFIED = 0;
    }

    public Feature(com.google.android.libraries.maps.model.internal.IFeatureDelegate iFeatureDelegate) {
        this.a = iFeatureDelegate;
    }

    public static com.google.android.libraries.maps.model.Feature a(com.google.android.libraries.maps.model.internal.IFeatureDelegate iFeatureDelegate) {
        defpackage.sqs.aA(iFeatureDelegate);
        try {
            int subfeatureType = iFeatureDelegate.getSubfeatureType();
            if (subfeatureType == 1) {
                return new com.google.android.libraries.maps.model.PlaceFeature(iFeatureDelegate);
            }
            if (subfeatureType == 2) {
                return new com.google.android.libraries.maps.model.DatasetFeature(iFeatureDelegate);
            }
            return null;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    @com.google.android.libraries.maps.model.FeatureType
    public java.lang.String getFeatureType() {
        try {
            return this.a.getFeatureType();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }
}
