package r9;

/* renamed from: r9.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC3951h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3955l f44620b;

    public /* synthetic */ RunnableC3951h(C3955l c3955l, int i5) {
        this.f44619a = i5;
        this.f44620b = c3955l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44619a) {
            case 0:
                this.f44620b.f44632b.start();
                break;
            case 1:
                this.f44620b.f44633c.start();
                break;
            default:
                this.f44620b.f44632b.v();
                break;
        }
    }
}
