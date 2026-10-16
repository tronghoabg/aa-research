package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.PowerManager$OnThermalStatusChangedListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class oil implements lhg {
    public static final yph a = yph.c("GH.ThermalMitigation");
    PowerManager$OnThermalStatusChangedListener b;
    final AtomicBoolean c = new AtomicBoolean(false);
    public final yfy d;
    private final Context e;

    public oil(Context context) {
        yfu yfuVar = new yfu(4);
        yfuVar.e(0, yzy.vg);
        yfuVar.e(1, yzy.vh);
        yfuVar.e(2, yzy.vi);
        yfuVar.e(3, yzy.vj);
        yfuVar.e(4, yzy.vk);
        yfuVar.e(5, yzy.vl);
        yfuVar.e(6, yzy.vm);
        this.d = yfuVar.d(true);
        this.e = context;
    }

    @Override // defpackage.lhg
    public final void c() {
        if (Build.VERSION.SDK_INT < 29) {
            ((ype) a.l().ai((char) 5969)).u("Unable to start ThermalMitigationLogger, API level < Q");
            return;
        }
        if (this.c.compareAndSet(false, true)) {
            ((ype) a.l().ai((char) 5968)).u("Registering thermal status listener");
            this.b = new PowerManager$OnThermalStatusChangedListener() { // from class: oik
                public final void onThermalStatusChanged(int i) {
                    yzy yzyVar = (yzy) this.a.d.getOrDefault(Integer.valueOf(i), yzy.vf);
                    if (i == 3) {
                        ((ype) ((ype) oil.a.h()).ai(5966)).K("Thermal status update: %s (%d)", yzyVar.sn, i);
                    } else if (i == 4 || i == 5 || i == 6) {
                        ((ype) ((ype) oil.a.g()).ai(5967)).K("Thermal status update: %s (%d)", yzyVar.sn, i);
                    } else {
                        ((ype) ((ype) oil.a.f()).ai(5965)).K("Thermal status update: %s (%d)", yzyVar.sn, i);
                    }
                    ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.THERMAL_MITIGATION, yzyVar).l());
                }
            };
            PowerManager powerManager = (PowerManager) this.e.getSystemService(PowerManager.class);
            powerManager.getClass();
            powerManager.addThermalStatusListener(this.b);
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        if (this.c.compareAndSet(true, false)) {
            ((ype) a.l().ai((char) 5970)).u("Unregistering thermal status listener");
            PowerManager powerManager = (PowerManager) this.e.getSystemService(PowerManager.class);
            powerManager.getClass();
            powerManager.removeThermalStatusListener(this.b);
        }
    }
}
