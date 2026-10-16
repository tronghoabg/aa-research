package defpackage;

import com.google.android.gms.car.CarInfo;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class kiq {
    public static final yph a = yph.c("GH.CarInfoCache");
    public static final CarInfo b = new CarInfo("", "", "", "", 0, 0, false, 0, "", "", "", "", false, false, false, "", "", 0);
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference d = new AtomicReference();
    private final kfn e;

    public kiq(jri jriVar) {
        kip kipVar = new kip(this);
        this.e = kipVar;
        if (jriVar == jri.b) {
            yph yphVar = kio.a;
            ((kio) mki.a.i(kio.class)).v(kipVar);
        }
    }

    public static kiq a() {
        return (kiq) mki.a.i(kiq.class);
    }

    public final CarInfo b() {
        return (CarInfo) this.c.get();
    }

    public final String c() {
        return (String) this.d.get();
    }

    public final void d(CarInfo carInfo, String str) {
        ((ype) ((ype) a.f()).ai((char) 3154)).y("setCarInfo invoked by %s", str);
        this.c.set(carInfo);
    }
}
