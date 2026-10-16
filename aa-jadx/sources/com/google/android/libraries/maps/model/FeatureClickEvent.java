package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public final class FeatureClickEvent {
    private final com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate a;

    public FeatureClickEvent(com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate iFeatureClickEventDelegate) {
        defpackage.sqs.aA(iFeatureClickEventDelegate);
        this.a = iFeatureClickEventDelegate;
    }

    public java.util.List<com.google.android.libraries.maps.model.Feature> getFeatures() {
        try {
            java.util.List<android.os.IBinder> features = this.a.getFeatures();
            if (features == null) {
                return new java.util.ArrayList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(features.size());
            java.util.Iterator<android.os.IBinder> it = features.iterator();
            while (it.hasNext()) {
                com.google.android.libraries.maps.model.Feature featureA = com.google.android.libraries.maps.model.Feature.a(com.google.android.libraries.maps.model.internal.IFeatureDelegate.Stub.asInterface(it.next()));
                if (featureA != null) {
                    arrayList.add(featureA);
                }
            }
            return arrayList;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public com.google.android.libraries.maps.model.LatLng getLatLng() {
        try {
            return this.a.getLatLng();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }
}
