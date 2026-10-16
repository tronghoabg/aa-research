package com.google.android.libraries.maps.model;

/* JADX INFO: loaded from: classes3.dex */
public class AdvancedMarker extends com.google.android.libraries.maps.model.Marker {
    public AdvancedMarker(com.google.android.libraries.maps.model.internal.IMarkerDelegate iMarkerDelegate) {
        super(iMarkerDelegate);
    }

    public android.view.View getIconView() {
        try {
            return (android.view.View) defpackage.srg.a(this.a.getIconView());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setIconView(android.view.View view) {
        if (view != null && view.getParent() != null) {
            throw new java.lang.IllegalArgumentException("View already has a parent, can not be used as Marker");
        }
        try {
            this.a.setIconView(new defpackage.srg(view));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }
}
