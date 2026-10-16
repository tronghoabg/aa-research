package N6;

/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8557a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8558b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8559c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8560d;

    public /* synthetic */ w(x xVar, boolean z2, boolean z10) {
        this.f8560d = xVar;
        this.f8558b = z2;
        this.f8559c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8557a) {
            case 0:
                ((x) this.f8560d).d(this.f8558b, this.f8559c);
                break;
            default:
                if (!this.f8558b) {
                    this.f8559c = true;
                    ((Runnable) this.f8560d).run();
                    break;
                }
                break;
        }
    }

    public w(Runnable runnable) {
        this.f8560d = runnable;
    }
}
