package W1;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final e f14954d = new E4.j().a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14955a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14956b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14957c;

    public e(E4.j jVar) {
        this.f14955a = jVar.f2896a;
        this.f14956b = jVar.f2897b;
        this.f14957c = jVar.f2898c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f14955a == eVar.f14955a && this.f14956b == eVar.f14956b && this.f14957c == eVar.f14957c;
    }

    public final int hashCode() {
        return ((this.f14955a ? 1 : 0) << 2) + ((this.f14956b ? 1 : 0) << 1) + (this.f14957c ? 1 : 0);
    }
}
