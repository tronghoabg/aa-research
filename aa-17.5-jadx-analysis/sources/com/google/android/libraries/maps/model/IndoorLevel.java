package com.google.android.libraries.maps.model;

import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class IndoorLevel {
    private final IIndoorLevelDelegate a;

    public IndoorLevel(IIndoorLevelDelegate iIndoorLevelDelegate) {
        spu.aw(iIndoorLevelDelegate);
        this.a = iIndoorLevelDelegate;
    }

    public void activate() {
        try {
            this.a.activate();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IndoorLevel)) {
            return false;
        }
        try {
            return this.a.equalsRemote(((IndoorLevel) obj).a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public String getName() {
        try {
            return this.a.getName();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public String getShortName() {
        try {
            return this.a.getShortName();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.a.hashCodeRemote();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
