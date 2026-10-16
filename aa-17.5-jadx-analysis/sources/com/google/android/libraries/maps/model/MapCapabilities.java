package com.google.android.libraries.maps.model;

import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class MapCapabilities {
    private final IMapCapabilitiesDelegate a;

    public MapCapabilities(IMapCapabilitiesDelegate iMapCapabilitiesDelegate) {
        spu.aw(iMapCapabilitiesDelegate);
        this.a = iMapCapabilitiesDelegate;
    }

    @ResultIgnorabilityUnspecified
    public boolean isAdvancedMarkersAvailable() {
        try {
            return this.a.isAdvancedMarkersAvailable();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isDataDrivenStylingAvailable() {
        try {
            return this.a.isDataDrivenStylingAvailable();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
