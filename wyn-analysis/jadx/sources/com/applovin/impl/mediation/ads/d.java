package com.applovin.impl.mediation.ads;

import com.applovin.impl.b3;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaxAdViewImpl f22082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b3 f22083c;

    public /* synthetic */ d(MaxAdViewImpl maxAdViewImpl, b3 b3Var, int i5) {
        this.f22081a = i5;
        this.f22082b = maxAdViewImpl;
        this.f22083c = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22081a) {
            case 0:
                this.f22082b.a(this.f22083c);
                break;
            default:
                this.f22082b.b(this.f22083c);
                break;
        }
    }
}
