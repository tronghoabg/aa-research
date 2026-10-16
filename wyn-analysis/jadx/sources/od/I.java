package od;

/* loaded from: classes5.dex */
public final class I implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41586b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L f41587c;

    public /* synthetic */ I(L l10, int i5, int i10) {
        this.f41585a = i10;
        this.f41587c = l10;
        this.f41586b = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41585a) {
            case 0:
                this.f41587c.f41623c.d(this.f41586b);
                break;
            case 1:
                this.f41587c.f41623c.e(this.f41586b);
                break;
            default:
                this.f41587c.f41623c.b(this.f41586b);
                break;
        }
    }
}
