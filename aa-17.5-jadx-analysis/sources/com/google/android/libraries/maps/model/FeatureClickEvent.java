package com.google.android.libraries.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IFeatureClickEventDelegate;
import com.google.android.libraries.maps.model.internal.IFeatureDelegate;
import defpackage.spu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class FeatureClickEvent {
    private final IFeatureClickEventDelegate a;

    public FeatureClickEvent(IFeatureClickEventDelegate iFeatureClickEventDelegate) {
        spu.aw(iFeatureClickEventDelegate);
        this.a = iFeatureClickEventDelegate;
    }

    public List<Feature> getFeatures() {
        try {
            List<IBinder> features = this.a.getFeatures();
            if (features == null) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList(features.size());
            Iterator<IBinder> it = features.iterator();
            while (it.hasNext()) {
                Feature featureA = Feature.a(IFeatureDelegate.Stub.asInterface(it.next()));
                if (featureA != null) {
                    arrayList.add(featureA);
                }
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public LatLng getLatLng() {
        try {
            return this.a.getLatLng();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
