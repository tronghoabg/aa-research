package com.bytedance.sdk.component.bcc.uef;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ivm f24962b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f24963c;

    public /* synthetic */ a(ivm ivmVar, Runnable runnable, int i5) {
        this.f24961a = i5;
        this.f24962b = ivmVar;
        this.f24963c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24961a) {
            case 0:
                this.f24962b.lw(this.f24963c);
                break;
            default:
                this.f24962b.moa(this.f24963c);
                break;
        }
    }
}
