package defpackage;

import com.google.android.gms.car.display.CarDisplayId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class nsr implements nsw {
    public static final yph a = yph.c("GH.DisplayLayoutMngr");
    public volatile nsv c;
    public boolean e;
    public boolean g;
    public nsq h;
    public int i = 1;
    public final Map b = new HashMap();
    public final List d = new ArrayList();
    public boolean f = false;

    public static nsr c() {
        return (nsr) mki.a.i(nsr.class);
    }

    private final void l() {
        int i = this.i;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw new IllegalStateException("DisplayLayoutManager queried before being initialized");
        }
        if (i2 != 2) {
            return;
        }
        ((ype) ((ype) a.h()).ai((char) 5408)).u("DisplayLayoutManager queried after being stopped");
    }

    public final nso a(CarDisplayId carDisplayId) {
        l();
        Map map = this.b;
        woy.aa(map.containsKey(carDisplayId), "No display layout found for the provided display id.");
        nso nsoVar = (nso) map.get(carDisplayId);
        nsoVar.getClass();
        return nsoVar;
    }

    public final nso b() {
        return a(CarDisplayId.a);
    }

    @Override // defpackage.nsw
    public final nsv d(CarDisplayId carDisplayId) {
        return a(carDisplayId).m();
    }

    public final yfq e() {
        l();
        return yfq.o(this.b.values());
    }

    public final void f(boolean z) {
        if (this.f == z) {
            return;
        }
        ((ype) ((ype) a.f()).ai((char) 5411)).y("Setting compat mode: %b", Boolean.valueOf(z));
        this.f = z;
        if (h()) {
            Map map = this.b;
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((nso) it.next()).w = z;
            }
            try {
                if (kio.b().r()) {
                    for (nso nsoVar : map.values()) {
                        kio.b().e();
                        nsoVar.O();
                    }
                }
            } catch (IllegalStateException e) {
                ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 5412)).y("Car is not connected, cannot relayout for compat mode, changing to %b", Boolean.valueOf(z));
            }
        }
    }

    @Override // defpackage.nsw
    public final boolean g(CarDisplayId carDisplayId) {
        return a(carDisplayId).F();
    }

    public final boolean h() {
        wer.c();
        return this.i == 2;
    }

    @Override // defpackage.nsw
    public final boolean i(CarDisplayId carDisplayId) {
        return a(carDisplayId).H();
    }

    public final boolean j(nsv nsvVar) {
        return this.c != null && this.c.equals(nsvVar);
    }

    @Override // defpackage.nsw
    public final boolean k(CarDisplayId carDisplayId) {
        return a(carDisplayId).J();
    }
}
