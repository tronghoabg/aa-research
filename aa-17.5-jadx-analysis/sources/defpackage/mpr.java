package defpackage;

import android.content.ComponentName;
import com.google.android.gms.car.display.CarDisplayId;

/* loaded from: classes.dex */
public final class mpr {
    public static final yph a = yph.c("GH.AuxDisplayConfig");
    public static final ComponentName b = new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.auxiliarydisplay.PrototypeAuxiliaryDisplayNavigationCarActivityService");
    public static final ComponentName c = new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.auxiliarydisplay.PrototypeAuxiliaryDisplayTurnCardCarActivityService");
    public static final ComponentName d = new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.auxiliarydisplay.AuxiliaryDisplayTurnCardCarActivityService");
    public static final ComponentName e = new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.auxiliarydisplay.AuxiliaryDisplayNavigationCarActivityService");
    private static final yfy h;
    public volatile yfy f;
    public volatile boolean g;

    static {
        yfu yfuVar = new yfu(4);
        for (rjj rjjVar : rjj.values()) {
            yfuVar.e(rjjVar, new mpq(rjjVar));
        }
        h = yfuVar.d(true);
    }

    public static mpr a() {
        return (mpr) mki.a.i(mpr.class);
    }

    public final mps b(rjj rjjVar) {
        d();
        mpq mpqVar = (mpq) h.get(rjjVar);
        mpqVar.getClass();
        return mpqVar;
    }

    public final rjj c(CarDisplayId carDisplayId) {
        d();
        if (!this.f.containsKey(carDisplayId)) {
            throw new IllegalArgumentException("AuxiliaryDisplayConfiguration can't provide initial content type for carDisplayId: ".concat(String.valueOf(String.valueOf(carDisplayId))));
        }
        rjj rjjVar = (rjj) this.f.get(carDisplayId);
        rjjVar.getClass();
        return rjjVar;
    }

    public final void d() {
        if (!this.g) {
            throw new IllegalStateException("AuxiliaryDisplayConfiguration queried before being initialized");
        }
        this.f.getClass();
    }
}
