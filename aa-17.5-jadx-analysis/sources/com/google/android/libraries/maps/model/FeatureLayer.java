package com.google.android.libraries.maps.model;

import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IFeatureLayerDelegate;
import com.google.android.libraries.maps.model.internal.IOnFeatureClickListener;
import defpackage.spu;
import defpackage.vje;
import defpackage.vjf;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class FeatureLayer {
    private final IFeatureLayerDelegate a;
    private StyleFactory b;
    private final Map c = new HashMap();

    public interface OnFeatureClickListener {
        void onFeatureClick(FeatureClickEvent featureClickEvent);
    }

    public interface StyleFactory {
        FeatureStyle getStyle(Feature feature);
    }

    public FeatureLayer(IFeatureLayerDelegate iFeatureLayerDelegate) {
        spu.aw(iFeatureLayerDelegate);
        this.a = iFeatureLayerDelegate;
    }

    public final void addOnFeatureClickListener(OnFeatureClickListener onFeatureClickListener) {
        try {
            vjf vjfVar = new vjf(onFeatureClickListener);
            this.c.put(onFeatureClickListener, vjfVar);
            this.a.addOnFeatureClickListener(vjfVar);
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

    public StyleFactory getFeatureStyle() {
        return this.b;
    }

    @FeatureType
    public String getFeatureType() {
        try {
            return this.a.getFeatureType();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean isAvailable() {
        try {
            return this.a.isAvailable();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void removeOnFeatureClickListener(OnFeatureClickListener onFeatureClickListener) {
        try {
            Map map = this.c;
            if (map.containsKey(onFeatureClickListener)) {
                this.a.removeOnFeatureClickListener((IOnFeatureClickListener) map.get(onFeatureClickListener));
                map.remove(onFeatureClickListener);
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setFeatureStyle(StyleFactory styleFactory) {
        this.b = styleFactory;
        IFeatureLayerDelegate iFeatureLayerDelegate = this.a;
        if (styleFactory == null) {
            try {
                iFeatureLayerDelegate.setFeatureStyle(null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            try {
                iFeatureLayerDelegate.setFeatureStyle(new vje(styleFactory));
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }
}
