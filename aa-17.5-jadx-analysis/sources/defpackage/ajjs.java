package defpackage;

/* loaded from: classes3.dex */
public final class ajjs {
    public final ajjt a;
    public final ajjt b;
    public final Throwable c;

    public ajjs(ajjt ajjtVar, ajjt ajjtVar2, Throwable th) {
        ajjtVar.getClass();
        this.a = ajjtVar;
        this.b = ajjtVar2;
        this.c = th;
    }

    public final boolean a() {
        return this.b == null && this.c == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajjs)) {
            return false;
        }
        ajjs ajjsVar = (ajjs) obj;
        return affa.f(this.a, ajjsVar.a) && affa.f(this.b, ajjsVar.b) && affa.f(this.c, ajjsVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ajjt ajjtVar = this.b;
        int iHashCode2 = (iHashCode + (ajjtVar == null ? 0 : ajjtVar.hashCode())) * 31;
        Throwable th = this.c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ")";
    }
}
