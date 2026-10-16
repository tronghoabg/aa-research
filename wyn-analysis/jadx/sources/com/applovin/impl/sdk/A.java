package com.applovin.impl.sdk;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f22790b;

    public /* synthetic */ A(l lVar, int i5) {
        this.f22789a = i5;
        this.f22790b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22789a) {
            case 0:
                this.f22790b.V();
                break;
            default:
                this.f22790b.U();
                break;
        }
    }
}
