package q2;

import N1.Y;

/* renamed from: q2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3864h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f44039b;

    public /* synthetic */ RunnableC3864h(i iVar, r rVar, int i5) {
        this.f44038a = i5;
        this.f44039b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44038a) {
            case 0:
                this.f44039b.getClass();
                break;
            case 1:
                this.f44039b.q();
                break;
            default:
                this.f44039b.B();
                break;
        }
    }

    public /* synthetic */ RunnableC3864h(i iVar, r rVar, Y y10) {
        this.f44038a = 0;
        this.f44039b = rVar;
    }
}
