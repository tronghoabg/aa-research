package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ajcv implements defpackage.aiwu {
    public final defpackage.aitx a;
    public final long b;
    private final defpackage.aitx c;
    private final defpackage.aitv d;

    public ajcv(long j, defpackage.ajcv ajcvVar, int i) {
        defpackage.aity aityVar = defpackage.aity.a;
        this.a = new defpackage.aitx(null, aityVar);
        this.c = new defpackage.aitx(ajcvVar, aityVar);
        this.b = j;
        this.d = new defpackage.aitv(i << 16, aityVar);
    }

    public abstract int a();

    public abstract void k(int i);

    public final java.lang.Object l() {
        return this.a.a;
    }

    public final defpackage.ajcv m() {
        java.lang.Object objL = l();
        if (objL == defpackage.ajcu.a) {
            return null;
        }
        return (defpackage.ajcv) objL;
    }

    public final defpackage.ajcv n() {
        return (defpackage.ajcv) this.c.a;
    }

    public final void o() {
        this.c.b(null);
    }

    public final void p() {
        java.lang.Object obj;
        defpackage.ajcv ajcvVarM;
        boolean z = defpackage.aiuy.a;
        if (q()) {
            return;
        }
        while (true) {
            defpackage.ajcv ajcvVarN = n();
            while (ajcvVarN != null && ajcvVarN.t()) {
                ajcvVarN = (defpackage.ajcv) ajcvVarN.c.a;
            }
            defpackage.ajcv ajcvVarM2 = m();
            ajcvVarM2.getClass();
            while (ajcvVarM2.t() && (ajcvVarM = ajcvVarM2.m()) != null) {
                ajcvVarM2 = ajcvVarM;
            }
            defpackage.aitx aitxVar = ajcvVarM2.c;
            do {
                obj = aitxVar.a;
            } while (!aitxVar.d(obj, ((defpackage.ajcv) obj) == null ? null : ajcvVarN));
            if (ajcvVarN != null) {
                ajcvVarN.a.c(ajcvVarM2);
            }
            if (!ajcvVarM2.t() || ajcvVarM2.q()) {
                if (ajcvVarN == null || !ajcvVarN.t()) {
                    return;
                }
            }
        }
    }

    public final boolean q() {
        return m() == null;
    }

    public final void r() {
        if (this.d.a() == a()) {
            p();
        }
    }

    public final boolean s() {
        return defpackage.aitv.a.addAndGet(this.d, -65536) == a() && !q();
    }

    public final boolean t() {
        return this.d.b == a() && !q();
    }

    public final boolean u() {
        defpackage.aitv aitvVar;
        int i;
        do {
            aitvVar = this.d;
            i = aitvVar.b;
            if (i == a() && !q()) {
                return false;
            }
        } while (!aitvVar.b(i, 65536 + i));
        return true;
    }
}
