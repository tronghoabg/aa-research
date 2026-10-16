package com.google.android.libraries.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IIndoorBuildingDelegate;
import com.google.android.libraries.maps.model.internal.IIndoorLevelDelegate;
import defpackage.spu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class IndoorBuilding {
    private final IIndoorBuildingDelegate a;

    public IndoorBuilding(IIndoorBuildingDelegate iIndoorBuildingDelegate) {
        spu.ax(iIndoorBuildingDelegate, "delegate");
        this.a = iIndoorBuildingDelegate;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IndoorBuilding)) {
            return false;
        }
        try {
            return this.a.equalsRemote(((IndoorBuilding) obj).a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int getActiveLevelIndex() {
        try {
            return this.a.getActiveLevelIndex();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int getDefaultLevelIndex() {
        try {
            return this.a.getDefaultLevelIndex();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public List<IndoorLevel> getLevels() {
        try {
            List<IBinder> levels = this.a.getLevels();
            if (levels == null) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList(levels.size());
            Iterator<IBinder> it = levels.iterator();
            while (it.hasNext()) {
                arrayList.add(new IndoorLevel(IIndoorLevelDelegate.Stub.asInterface(it.next())));
            }
            return arrayList;
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

    public boolean isUnderground() {
        try {
            return this.a.isUnderground();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
