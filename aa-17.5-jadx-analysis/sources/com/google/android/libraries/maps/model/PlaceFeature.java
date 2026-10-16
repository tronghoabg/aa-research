package com.google.android.libraries.maps.model;

import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IFeatureDelegate;

/* loaded from: classes3.dex */
public final class PlaceFeature extends Feature {
    private final IFeatureDelegate a;

    public PlaceFeature(IFeatureDelegate iFeatureDelegate) {
        super(iFeatureDelegate);
        this.a = iFeatureDelegate;
    }

    public String getPlaceId() {
        try {
            return this.a.getPlaceId();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
