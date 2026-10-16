package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class kd implements kf {

    /* renamed from: a, reason: collision with root package name */
    private final e.a.ep f47276a;

    /* synthetic */ kd(e.a.ep epVar) {
        com.google.d.b.an.B(epVar);
        this.f47276a = epVar;
    }

    @Override // e.a.d.kf
    public final e.a.dd a(e.a.cz czVar, e.a.cx cxVar) {
        return czVar.a(this.f47276a, cxVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kd) {
            return this.f47276a.equals(((kd) obj).f47276a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47276a.hashCode();
    }

    public final String toString() {
        return this.f47276a.toString();
    }
}
