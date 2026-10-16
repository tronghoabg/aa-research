package com.waze.navigate;

import com.waze.NativeManager;
import com.waze.jni.protos.VenueData;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public abstract class eg {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void clearNavigationStartPointImpl$default(eg egVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearNavigationStartPointImpl");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        egVar.clearNavigationStartPointImpl(lVar);
    }

    static final h.ab clearNavigationStartPointImpl$lambda$0(eg egVar) {
        h.g.b.x.d(egVar, "null cannot be cast to non-null type com.waze.navigate.NavigationStartPointNativeManager");
        ((NavigationStartPointNativeManager) egVar).clearNavigationStartPointImplNTV();
        return null;
    }

    static final void onStartPointChangedJNI$lambda$0(eg egVar, VenueData venueData) {
        h.g.b.x.d(egVar, "null cannot be cast to non-null type com.waze.navigate.NavigationStartPointNativeManager");
        h.g.b.x.c(venueData);
        ((NavigationStartPointNativeManager) egVar).onStartPointChanged(venueData);
    }

    static final void onStartPointRemovedJNI$lambda$0(eg egVar) {
        h.g.b.x.d(egVar, "null cannot be cast to non-null type com.waze.navigate.NavigationStartPointNativeManager");
        ((NavigationStartPointNativeManager) egVar).onStartPointRemoved();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setNavigationStartPointLatLon$default(eg egVar, int i2, int i3, h.g.a.l lVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNavigationStartPointLatLon");
        }
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        egVar.setNavigationStartPointLatLon(i2, i3, lVar);
    }

    static final h.ab setNavigationStartPointLatLon$lambda$0(eg egVar, int i2, int i3) {
        h.g.b.x.d(egVar, "null cannot be cast to non-null type com.waze.navigate.NavigationStartPointNativeManager");
        ((NavigationStartPointNativeManager) egVar).setNavigationStartPointLatLonNTV(i2, i3);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setNavigationStartPointVenue$default(eg egVar, VenueData venueData, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNavigationStartPointVenue");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        egVar.setNavigationStartPointVenue(venueData, lVar);
    }

    static final h.ab setNavigationStartPointVenue$lambda$0(eg egVar, VenueData venueData) {
        h.g.b.x.d(egVar, "null cannot be cast to non-null type com.waze.navigate.NavigationStartPointNativeManager");
        byte[] byteArray = venueData.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        ((NavigationStartPointNativeManager) egVar).setNavigationStartPointVenueNTV(byteArray);
        return null;
    }

    public void clearNavigationStartPointImpl(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bj(this, 17), lVar != null ? new Cdo(lVar, 9) : null);
    }

    public abstract void onStartPointChanged(VenueData venueData);

    protected final void onStartPointChangedJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "venue");
        try {
            NativeManager.runMainThreadTask(new ba(this, (VenueData) VenueData.parser().c(bArr), 19, null));
        } catch (com.google.v.eu unused) {
        }
    }

    public abstract void onStartPointRemoved();

    protected final void onStartPointRemovedJNI() {
        NativeManager.runMainThreadTask(new e(this, 13));
    }

    public void setNavigationStartPointLatLon(int i2, int i3, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bp(this, i2, i3, 2), lVar != null ? new Cdo(lVar, 10) : null);
    }

    public void setNavigationStartPointVenue(VenueData venueData, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(venueData, "venue");
        NativeManager.runNativeTask(new bd(this, venueData, 10), lVar != null ? new Cdo(lVar, 8) : null);
    }

    public final void setNavigationStartPointLatLon(int i2, int i3) {
        setNavigationStartPointLatLon$default(this, i2, i3, null, 4, null);
    }

    public final void clearNavigationStartPointImpl() {
        clearNavigationStartPointImpl$default(this, null, 1, null);
    }

    public final void setNavigationStartPointVenue(VenueData venueData) {
        h.g.b.x.f(venueData, "venue");
        setNavigationStartPointVenue$default(this, venueData, null, 2, null);
    }
}
