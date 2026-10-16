package com.google.android.libraries.maps.model;

import android.os.RemoteException;
import android.view.View;
import com.google.android.libraries.maps.model.internal.IMarkerDelegate;
import defpackage.sqi;

/* loaded from: classes3.dex */
public class AdvancedMarker extends Marker {
    public AdvancedMarker(IMarkerDelegate iMarkerDelegate) {
        super(iMarkerDelegate);
    }

    public View getIconView() {
        try {
            return (View) sqi.a(this.a.getIconView());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void setIconView(View view) {
        if (view != null && view.getParent() != null) {
            throw new IllegalArgumentException("View already has a parent, can not be used as Marker");
        }
        try {
            this.a.setIconView(new sqi(view));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
