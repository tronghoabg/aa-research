package defpackage;

/* loaded from: classes2.dex */
public abstract class ajbv implements aivv {
    public final aisx a;
    public final long b;
    private final aisx c;
    private final aisv d;

    public ajbv(long j, ajbv ajbvVar, int i) {
        aisy aisyVar = aisy.a;
        this.a = new aisx(null, aisyVar);
        this.c = new aisx(ajbvVar, aisyVar);
        this.b = j;
        this.d = new aisv(i << 16, aisyVar);
    }

    public abstract int a();

    public abstract void k(int i);

    public final Object l() {
        return this.a.a;
    }

    public final ajbv m() {
        Object objL = l();
        if (objL == ajbu.a) {
            return null;
        }
        return (ajbv) objL;
    }

    public final ajbv n() {
        return (ajbv) this.c.a;
    }

    public final void o() {
        this.c.b(null);
    }

    public final void p() {
        Object obj;
        ajbv ajbvVarM;
        boolean z = aitz.a;
        if (q()) {
            return;
        }
        while (true) {
            ajbv ajbvVarN = n();
            while (ajbvVarN != null && ajbvVarN.t()) {
                ajbvVarN = (ajbv) ajbvVarN.c.a;
            }
            ajbv ajbvVarM2 = m();
            ajbvVarM2.getClass();
            while (ajbvVarM2.t() && (ajbvVarM = ajbvVarM2.m()) != null) {
                ajbvVarM2 = ajbvVarM;
            }
            aisx aisxVar = ajbvVarM2.c;
            do {
                obj = aisxVar.a;
            } while (!aisxVar.d(obj, ((ajbv) obj) == null ? null : ajbvVarN));
            if (ajbvVarN != null) {
                ajbvVarN.a.c(ajbvVarM2);
            }
            if (!ajbvVarM2.t() || ajbvVarM2.q()) {
                if (ajbvVarN == null || !ajbvVarN.t()) {
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
        return aisv.a.addAndGet(this.d, -65536) == a() && !q();
    }

    public final boolean t() {
        return this.d.b == a() && !q();
    }

    public final boolean u() {
        aisv aisvVar;
        int i;
        do {
            aisvVar = this.d;
            i = aisvVar.b;
            if (i == a() && !q()) {
                return false;
            }
        } while (!aisvVar.b(i, 65536 + i));
        return true;
    }
}
