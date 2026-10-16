package com.applovin.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f20743b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f20744c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20745d;

    public /* synthetic */ B(Object obj, boolean z2, long j8, int i5) {
        this.f20742a = i5;
        this.f20745d = obj;
        this.f20743b = z2;
        this.f20744c = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20742a) {
            case 0:
                ((a2) this.f20745d).b(this.f20743b, this.f20744c);
                break;
            default:
                ((com.applovin.impl.sdk.r) this.f20745d).a(this.f20743b, this.f20744c);
                break;
        }
    }
}
