package com.applovin.impl.mediation;

import com.applovin.impl.c3;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.h;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22289b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22290c;

    public /* synthetic */ q(int i5, Object obj, Object obj2) {
        this.f22288a = i5;
        this.f22289b = obj;
        this.f22290c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22288a) {
            case 0:
                ((h.b) this.f22289b).a((MaxError) this.f22290c);
                break;
            case 1:
                ((MediationServiceImpl.b) this.f22289b).a((MaxAd) this.f22290c);
                break;
            case 2:
                ((b) this.f22289b).c((c3) this.f22290c);
                break;
            case 3:
                ((c) this.f22289b).a((c3) this.f22290c);
                break;
            default:
                ((h) this.f22289b).a((Runnable) this.f22290c);
                break;
        }
    }
}
