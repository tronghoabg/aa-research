package com.waze.location;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class bd {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void SetCompass$default(bd bdVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: SetCompass");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        bdVar.SetCompass(i2, lVar);
    }

    static final h.ab SetCompass$lambda$0(bd bdVar, int i2) {
        h.g.b.x.d(bdVar, "null cannot be cast to non-null type com.waze.location.LocationSensorListener");
        ((LocationSensorListener) bdVar).SetCompassNTV(i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setInnerCarCompass$default(bd bdVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setInnerCarCompass");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        bdVar.setInnerCarCompass(i2, lVar);
    }

    static final h.ab setInnerCarCompass$lambda$0(bd bdVar, int i2) {
        h.g.b.x.d(bdVar, "null cannot be cast to non-null type com.waze.location.LocationSensorListener");
        ((LocationSensorListener) bdVar).setInnerCarCompassNTV(i2);
        return null;
    }

    public void SetCompass(int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bc(this, i2, 1), lVar != null ? new ad(lVar, 2) : null);
    }

    protected final float getGeomagneticHorizontalStrengthUTJNI(int i2, int i3) {
        return ((LocationSensorListener) this).getGeomagneticHorizontalStrengthUT(i2, i3);
    }

    protected final void initRotationVectorsJNI() {
        ((LocationSensorListener) this).initRotationVectors();
    }

    protected final boolean isLocationPermissionGrantedJNI() {
        return ((LocationSensorListener) this).isLocationPermissionGranted();
    }

    public void setInnerCarCompass(int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new bc(this, i2, 0), lVar != null ? new ad(lVar, 3) : null);
    }

    protected final void updateSpeedometerJNI(int i2, String str, int i3, double d2) {
        ((LocationSensorListener) this).updateSpeedometer(i2, str, i3, d2);
    }

    public final void SetCompass(int i2) {
        SetCompass$default(this, i2, null, 2, null);
    }

    public final void setInnerCarCompass(int i2) {
        setInnerCarCompass$default(this, i2, null, 2, null);
    }
}
