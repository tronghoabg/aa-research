package defpackage;

import android.os.Build;
import android.os.PowerManager;
import android.os.PowerManager$OnThermalStatusChangedListener;

/* loaded from: classes.dex */
public final class obq extends eqj {
    public static final yph a = yph.c("GH.SevThermalStatusLD");
    private final PowerManager$OnThermalStatusChangedListener h;
    private final aezr i;

    public obq() {
        this.h = Build.VERSION.SDK_INT >= 29 ? new obp(this, 0) : null;
        this.i = new aezy(new nnj(7));
    }

    private final PowerManager a() {
        Object objA = this.i.a();
        objA.getClass();
        return (PowerManager) objA;
    }

    @Override // defpackage.eqj
    protected final void c() {
        PowerManager$OnThermalStatusChangedListener powerManager$OnThermalStatusChangedListener = this.h;
        if (powerManager$OnThermalStatusChangedListener == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        a().addThermalStatusListener(powerManager$OnThermalStatusChangedListener);
    }

    @Override // defpackage.eqj
    protected final void d() {
        PowerManager$OnThermalStatusChangedListener powerManager$OnThermalStatusChangedListener = this.h;
        if (powerManager$OnThermalStatusChangedListener == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        a().removeThermalStatusListener(powerManager$OnThermalStatusChangedListener);
    }
}
