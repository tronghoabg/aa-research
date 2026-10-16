package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public final class FeatureLayer {
    private final com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate a;
    private com.google.android.libraries.maps.model.FeatureLayer.StyleFactory b;
    private final java.util.Map c = new java.util.HashMap();

    public interface OnFeatureClickListener {
        void onFeatureClick(com.google.android.libraries.maps.model.FeatureClickEvent featureClickEvent);
    }

    public interface StyleFactory {
        com.google.android.libraries.maps.model.FeatureStyle getStyle(com.google.android.libraries.maps.model.Feature feature);
    }

    public FeatureLayer(com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate iFeatureLayerDelegate) {
        defpackage.sqs.aA(iFeatureLayerDelegate);
        this.a = iFeatureLayerDelegate;
    }

    public final void addOnFeatureClickListener(com.google.android.libraries.maps.model.FeatureLayer.OnFeatureClickListener onFeatureClickListener) {
        try {
            defpackage.vkc vkcVar = new defpackage.vkc(onFeatureClickListener);
            this.c.put(onFeatureClickListener, vkcVar);
            this.a.addOnFeatureClickListener(vkcVar);
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

    public com.google.android.libraries.maps.model.FeatureLayer.StyleFactory getFeatureStyle() {
        return this.b;
    }

    @com.google.android.libraries.maps.model.FeatureType
    public java.lang.String getFeatureType() {
        try {
            return this.a.getFeatureType();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public boolean isAvailable() {
        try {
            return this.a.isAvailable();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void removeOnFeatureClickListener(com.google.android.libraries.maps.model.FeatureLayer.OnFeatureClickListener onFeatureClickListener) {
        try {
            java.util.Map map = this.c;
            if (map.containsKey(onFeatureClickListener)) {
                this.a.removeOnFeatureClickListener((com.google.android.libraries.maps.model.internal.IOnFeatureClickListener) map.get(onFeatureClickListener));
                map.remove(onFeatureClickListener);
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setFeatureStyle(com.google.android.libraries.maps.model.FeatureLayer.StyleFactory styleFactory) {
        this.b = styleFactory;
        com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate iFeatureLayerDelegate = this.a;
        if (styleFactory == null) {
            try {
                iFeatureLayerDelegate.setFeatureStyle(null);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
            }
        } else {
            try {
                iFeatureLayerDelegate.setFeatureStyle(new defpackage.vkb(styleFactory));
            } catch (android.os.RemoteException e2) {
                throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e2);
            }
        }
    }
}
