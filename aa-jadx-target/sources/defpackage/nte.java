package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nte implements defpackage.ntj {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.DisplayLayoutMngr");
    public volatile defpackage.nti c;
    public boolean e;
    public boolean g;
    public defpackage.ntd h;
    public int i = 1;
    public final java.util.Map b = new java.util.HashMap();
    public final java.util.List d = new java.util.ArrayList();
    public boolean f = false;

    public static defpackage.nte c() {
        return (defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class);
    }

    private final void l() {
        int i = this.i;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw new java.lang.IllegalStateException("DisplayLayoutManager queried before being initialized");
        }
        if (i2 != 2) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5410)).u("DisplayLayoutManager queried after being stopped");
    }

    public final defpackage.ntb a(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        l();
        java.util.Map map = this.b;
        defpackage.ysr.bk(map.containsKey(carDisplayId), "No display layout found for the provided display id.");
        defpackage.ntb ntbVar = (defpackage.ntb) map.get(carDisplayId);
        ntbVar.getClass();
        return ntbVar;
    }

    public final defpackage.ntb b() {
        return a(com.google.android.gms.car.display.CarDisplayId.a);
    }

    @Override // defpackage.ntj
    public final defpackage.nti d(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        return a(carDisplayId).m();
    }

    public final defpackage.ygw e() {
        l();
        return defpackage.ygw.o(this.b.values());
    }

    public final void f(boolean z) {
        if (this.f == z) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5414)).y("Setting compat mode: %b", java.lang.Boolean.valueOf(z));
        this.f = z;
        if (h()) {
            java.util.Map map = this.b;
            java.util.Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((defpackage.ntb) it.next()).w = z;
            }
            try {
                if (defpackage.kit.b().r()) {
                    for (defpackage.ntb ntbVar : map.values()) {
                        defpackage.kit.b().e();
                        ntbVar.M();
                    }
                }
            } catch (java.lang.IllegalStateException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 5415)).y("Car is not connected, cannot relayout for compat mode, changing to %b", java.lang.Boolean.valueOf(z));
            }
        }
    }

    @Override // defpackage.ntj
    public final boolean g(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        return a(carDisplayId).F();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final boolean h() throws wfo {
        defpackage.wfp.c();
        return this.i == 2;
    }

    @Override // defpackage.ntj
    public final boolean i(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        return a(carDisplayId).H();
    }

    public final boolean j(defpackage.nti ntiVar) {
        return this.c != null && this.c.equals(ntiVar);
    }

    @Override // defpackage.ntj
    public final boolean k(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        return a(carDisplayId).J();
    }
}
