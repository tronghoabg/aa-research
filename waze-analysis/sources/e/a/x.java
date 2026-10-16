package e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final w f47857a;

    /* renamed from: b, reason: collision with root package name */
    private final ee f47858b;

    private x(w wVar, ee eeVar) {
        com.google.d.b.an.C(wVar, "state is null");
        this.f47857a = wVar;
        com.google.d.b.an.C(eeVar, "status is null");
        this.f47858b = eeVar;
    }

    public static x b(w wVar) {
        com.google.d.b.an.m(wVar != w.f47853c, "state is TRANSIENT_ERROR. Use forError() instead");
        return new x(wVar, ee.f47401a);
    }

    public static x c(ee eeVar) {
        com.google.d.b.an.m(!eeVar.l(), "The error status must not be OK");
        return new x(w.f47853c, eeVar);
    }

    public final w a() {
        return this.f47857a;
    }

    public final ee d() {
        return this.f47858b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f47857a.equals(xVar.f47857a) && this.f47858b.equals(xVar.f47858b);
    }

    public final int hashCode() {
        return this.f47857a.hashCode() ^ this.f47858b.hashCode();
    }

    public final String toString() {
        ee eeVar = this.f47858b;
        boolean zL = eeVar.l();
        w wVar = this.f47857a;
        if (zL) {
            return wVar.toString();
        }
        return wVar.toString() + "(" + eeVar.toString() + ")";
    }
}
