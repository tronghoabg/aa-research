package com.google.android.libraries.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.android.libraries.maps.model.VisibleRegion;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.sqi;
import defpackage.vim;

/* loaded from: classes3.dex */
public final class Projection {
    private final vim a;

    public Projection(vim vimVar) {
        this.a = vimVar;
    }

    public LatLng fromScreenLocation(Point point) {
        try {
            return this.a.f(new sqi(point));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public VisibleRegion getVisibleRegion() {
        try {
            return this.a.g();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @ResultIgnorabilityUnspecified
    public Point toScreenLocation(LatLng latLng) {
        try {
            return (Point) sqi.a(this.a.e(latLng));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
