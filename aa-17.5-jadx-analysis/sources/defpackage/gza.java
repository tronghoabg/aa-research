package defpackage;

/* loaded from: classes2.dex */
public final class gza implements wb {
    public final gwc a;
    public final wb b;

    public gza(gwc gwcVar, wb wbVar) {
        this.a = gwcVar;
        this.b = wbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gza)) {
            return false;
        }
        gza gzaVar = (gza) obj;
        return affa.f(this.a, gzaVar.a) && affa.f(this.b, gzaVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "UiModelTemplate(umEmitter=" + this.a + ", originalTemplate=" + this.b + ")";
    }
}
