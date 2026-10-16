package defpackage;

/* loaded from: classes2.dex */
public final class gos implements gmw {
    public final gmw a;
    public final gor b;

    public gos(gmw gmwVar, gor gorVar) {
        this.a = gmwVar;
        this.b = gorVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gos)) {
            return false;
        }
        gos gosVar = (gos) obj;
        return affa.f(this.a, gosVar.a) && affa.f(this.b, gosVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MapWithContentTemplateInternal(content=" + this.a + ", mapActions=" + this.b + ")";
    }
}
