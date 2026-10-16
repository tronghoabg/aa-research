package od;

/* renamed from: od.g0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3687g0 extends A7.B0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41959b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ md.E f41960c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3687g0(md.E e7, int i5) {
        super(12);
        this.f41959b = i5;
        this.f41960c = e7;
    }

    @Override // A7.B0
    public final void F() {
        switch (this.f41959b) {
            case 0:
                C3711o0 c3711o0 = (C3711o0) this.f41960c;
                ((L0) c3711o0.f42029d.f41915c).f41638m.f41677Z.W(c3711o0, true);
                break;
            case 1:
                ((M0) this.f41960c).s();
                break;
            default:
                ((pd.m) this.f41960c).f43563h.n(true);
                break;
        }
    }

    @Override // A7.B0
    public final void G() {
        switch (this.f41959b) {
            case 0:
                C3711o0 c3711o0 = (C3711o0) this.f41960c;
                ((L0) c3711o0.f42029d.f41915c).f41638m.f41677Z.W(c3711o0, false);
                break;
            case 1:
                M0 m02 = (M0) this.f41960c;
                if (!m02.f41659G.get()) {
                    m02.u();
                    break;
                }
                break;
            default:
                ((pd.m) this.f41960c).f43563h.n(false);
                break;
        }
    }
}
