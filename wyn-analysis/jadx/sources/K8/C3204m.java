package k8;

/* renamed from: k8.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3204m extends AbstractC3201j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f39304a;

    public C3204m(Object obj) {
        this.f39304a = obj;
    }

    @Override // k8.AbstractC3201j
    public final Object a() {
        return this.f39304a;
    }

    @Override // k8.AbstractC3201j
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3204m) {
            return this.f39304a.equals(((C3204m) obj).f39304a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39304a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f39304a + ")";
    }
}
