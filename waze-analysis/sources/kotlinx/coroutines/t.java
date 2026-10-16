package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Object f52062a;

    /* renamed from: b, reason: collision with root package name */
    public final j f52063b;

    /* renamed from: c, reason: collision with root package name */
    public final h.g.a.q f52064c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f52065d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f52066e;

    public /* synthetic */ t(Object obj, j jVar, h.g.a.q qVar, Throwable th, int i2) {
        this(obj, (i2 & 2) != 0 ? null : jVar, (i2 & 4) != 0 ? null : qVar, (i2 & 16) != 0 ? null : th);
    }

    public static /* synthetic */ t b(t tVar, j jVar, Throwable th, int i2) {
        Object obj = (i2 & 1) != 0 ? tVar.f52062a : null;
        if ((i2 & 2) != 0) {
            jVar = tVar.f52063b;
        }
        h.g.a.q qVar = (i2 & 4) != 0 ? tVar.f52064c : null;
        if ((i2 & 8) != 0) {
            Object obj2 = tVar.f52065d;
        }
        if ((i2 & 16) != 0) {
            th = tVar.f52066e;
        }
        return new t(obj, jVar, qVar, th);
    }

    public final boolean a() {
        return this.f52066e != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!h.g.b.x.n(this.f52062a, tVar.f52062a) || !h.g.b.x.n(this.f52063b, tVar.f52063b) || !h.g.b.x.n(this.f52064c, tVar.f52064c)) {
            return false;
        }
        Object obj2 = tVar.f52065d;
        return h.g.b.x.n(null, null) && h.g.b.x.n(this.f52066e, tVar.f52066e);
    }

    public final int hashCode() {
        Object obj = this.f52062a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        j jVar = this.f52063b;
        int iHashCode2 = jVar == null ? 0 : jVar.hashCode();
        int i2 = iHashCode * 31;
        h.g.a.q qVar = this.f52064c;
        int iHashCode3 = qVar == null ? 0 : qVar.hashCode();
        int i3 = (i2 + iHashCode2) * 31;
        Throwable th = this.f52066e;
        return ((i3 + iHashCode3) * 961) + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f52062a + ", cancelHandler=" + this.f52063b + ", onCancellation=" + this.f52064c + ", idempotentResume=null, cancelCause=" + this.f52066e + ")";
    }

    public t(Object obj, j jVar, h.g.a.q qVar, Throwable th) {
        this.f52062a = obj;
        this.f52063b = jVar;
        this.f52064c = qVar;
        this.f52065d = null;
        this.f52066e = th;
    }
}
