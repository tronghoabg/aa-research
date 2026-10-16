package A7;

/* renamed from: A7.k1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0265k1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0259i1 f939b;

    public /* synthetic */ RunnableC0265k1(C0259i1 c0259i1, int i5) {
        this.f938a = i5;
        this.f939b = c0259i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f938a) {
            case 0:
                C0259i1 c0259i1 = this.f939b;
                c0259i1.f903e = c0259i1.f908j;
                break;
            default:
                this.f939b.f908j = null;
                break;
        }
    }
}
