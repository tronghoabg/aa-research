package com.applovin.impl.sdk;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f23268b;

    public /* synthetic */ v(d dVar, int i5) {
        this.f23267a = i5;
        this.f23268b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23267a) {
            case 0:
                this.f23268b.c();
                break;
            default:
                this.f23268b.d();
                break;
        }
    }
}
