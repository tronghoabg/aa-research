package com.applovin.impl.sdk;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f23273b;

    public /* synthetic */ x(int i5, k kVar) {
        this.f23272a = i5;
        this.f23273b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23272a) {
            case 0:
                this.f23273b.J0();
                break;
            case 1:
                this.f23273b.K0();
                break;
            case 2:
                this.f23273b.L0();
                break;
            default:
                this.f23273b.M0();
                break;
        }
    }
}
