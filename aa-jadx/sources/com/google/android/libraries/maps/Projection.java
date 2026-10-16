package com.google.android.libraries.maps;

/* JADX INFO: loaded from: classes3.dex */
public final class Projection {
    private final defpackage.vjj a;

    public Projection(defpackage.vjj vjjVar) {
        this.a = vjjVar;
    }

    public com.google.android.libraries.maps.model.LatLng fromScreenLocation(android.graphics.Point point) {
        try {
            return this.a.f(new defpackage.srg(point));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public com.google.android.libraries.maps.model.VisibleRegion getVisibleRegion() {
        try {
            return this.a.g();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public android.graphics.Point toScreenLocation(com.google.android.libraries.maps.model.LatLng latLng) {
        try {
            return (android.graphics.Point) defpackage.srg.a(this.a.e(latLng));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }
}
