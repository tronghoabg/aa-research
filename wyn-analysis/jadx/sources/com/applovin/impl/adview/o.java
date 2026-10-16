package com.applovin.impl.adview;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f21099b;

    public /* synthetic */ o(a aVar, int i5) {
        this.f21098a = i5;
        this.f21099b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21098a) {
            case 0:
                this.f21099b.s();
                break;
            case 1:
                this.f21099b.p();
                break;
            case 2:
                this.f21099b.r();
                break;
            case 3:
                this.f21099b.q();
                break;
            case 4:
                this.f21099b.t();
                break;
            default:
                this.f21099b.o();
                break;
        }
    }
}
