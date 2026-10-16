package com.applovin.impl.mediation;

import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.t4;
import com.applovin.impl.y2;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements t4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediationServiceImpl f22260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22261c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22262d;

    public /* synthetic */ j(MediationServiceImpl mediationServiceImpl, Object obj, Object obj2, int i5) {
        this.f22259a = i5;
        this.f22260b = mediationServiceImpl;
        this.f22261c = obj;
        this.f22262d = obj2;
    }

    @Override // com.applovin.impl.t4.a
    public final void a(Object obj) {
        switch (this.f22259a) {
            case 0:
                this.f22260b.a((h) this.f22261c, (t4) this.f22262d, (String) obj);
                break;
            default:
                this.f22260b.a((y2) this.f22261c, (a.InterfaceC0014a) this.f22262d, (String) obj);
                break;
        }
    }
}
