package Ef;

/* loaded from: classes5.dex */
public final class V extends AbstractC0509q0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3702e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3703f;

    public /* synthetic */ V(Object obj, int i5) {
        this.f3702e = i5;
        this.f3703f = obj;
    }

    @Override // Ef.AbstractC0509q0
    public final boolean i() {
        switch (this.f3702e) {
        }
        return false;
    }

    @Override // Ef.AbstractC0509q0
    public final void j(Throwable th) {
        switch (this.f3702e) {
            case 0:
                ((U) this.f3703f).dispose();
                break;
            case 1:
                ((tf.l) this.f3703f).invoke(th);
                break;
            default:
                Object obj = z0.f3793a.get(h());
                boolean z2 = obj instanceof C0517x;
                C0510r0 c0510r0 = (C0510r0) this.f3703f;
                if (!z2) {
                    c0510r0.resumeWith(H.N(obj));
                    break;
                } else {
                    c0510r0.resumeWith(Fe.e.z(((C0517x) obj).f3788a));
                    break;
                }
        }
    }
}
