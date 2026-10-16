package com.google.android.libraries.maps.model;

import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IFeatureDelegate;
import defpackage.spu;

/* loaded from: classes3.dex */
public abstract class Feature {
    private final IFeatureDelegate a;

    public @interface SubfeatureType {
        public static final int DATASET_FEATURE = 2;
        public static final int PLACE_FEATURE = 1;
        public static final int SUBFEATURE_TYPE_UNSPECIFIED = 0;
    }

    public Feature(IFeatureDelegate iFeatureDelegate) {
        this.a = iFeatureDelegate;
    }

    public static Feature a(IFeatureDelegate iFeatureDelegate) {
        spu.aw(iFeatureDelegate);
        try {
            int subfeatureType = iFeatureDelegate.getSubfeatureType();
            if (subfeatureType == 1) {
                return new PlaceFeature(iFeatureDelegate);
            }
            if (subfeatureType == 2) {
                return new DatasetFeature(iFeatureDelegate);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @FeatureType
    public String getFeatureType() {
        try {
            return this.a.getFeatureType();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
