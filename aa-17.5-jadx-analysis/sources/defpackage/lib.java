package defpackage;

/* loaded from: classes.dex */
public final class lib {
    public final aezk a;
    private final tfj b;

    public lib(aezk aezkVar, tfj tfjVar) {
        this.a = aezkVar;
        this.b = tfjVar;
    }

    public final void a(String str) {
        lhg lhgVar = (lhg) this.a.a();
        if (str != null) {
            ((ype) lig.a.l().ai(3934)).M("Starting [%s] %s", str, lhgVar);
        } else {
            ((ype) lig.a.l().ai((char) 3933)).y("Starting %s", lhgVar);
        }
        tfj tfjVar = this.b;
        tfk tfkVar = tfk.a;
        tfkVar.b(tfjVar);
        lhgVar.c();
        tfkVar.d(tfjVar, 1);
    }

    public final void b() {
        lig.q((lhg) this.a.a());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lib) {
            lib libVar = (lib) obj;
            if (this.a.equals(libVar.a) && this.b.equals(libVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        tfj tfjVar = this.b;
        return "LifetimeComponentInfo{serviceProvider=" + this.a.toString() + ", startLatencyEvent=" + tfjVar.toString() + "}";
    }

    protected lib() {
        throw null;
    }
}
