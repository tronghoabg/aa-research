package com.google.android.libraries.maps.model;

import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IFeatureDelegate;
import defpackage.yfy;
import java.util.Map;

/* loaded from: classes3.dex */
public final class DatasetFeature extends Feature {
    private final IFeatureDelegate a;

    public DatasetFeature(IFeatureDelegate iFeatureDelegate) {
        super(iFeatureDelegate);
        this.a = iFeatureDelegate;
    }

    public Map<String, String> getDatasetAttributes() {
        try {
            return yfy.j(this.a.getDatasetAttributes());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public String getDatasetId() {
        try {
            return this.a.getDatasetId();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
