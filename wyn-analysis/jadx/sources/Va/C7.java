package Va;

/* loaded from: classes4.dex */
public final class C7 extends A7.B0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13252b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7(int i5, Class cls) {
        super(cls);
        this.f13252b = i5;
    }

    @Override // A7.B0
    public final boolean d0(C1077na c1077na) {
        switch (this.f13252b) {
            case 0:
                return ((Class) this.f421a).isInstance(c1077na.s0());
            case 1:
                return ((Class) this.f421a).equals(c1077na.t0().getType());
            default:
                return ((Class) this.f421a).isAssignableFrom(c1077na.t0().getType());
        }
    }
}
