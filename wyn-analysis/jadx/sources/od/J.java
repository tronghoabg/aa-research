package od;

/* loaded from: classes5.dex */
public final class J implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f41609b;

    public /* synthetic */ J(L l10, int i5) {
        this.f41608a = i5;
        this.f41609b = l10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41608a) {
            case 0:
                this.f41609b.f41623c.h();
                break;
            case 1:
                this.f41609b.n();
                break;
            case 2:
                this.f41609b.f41623c.flush();
                break;
            default:
                this.f41609b.f41623c.j();
                break;
        }
    }
}
