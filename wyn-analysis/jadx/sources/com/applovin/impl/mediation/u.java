package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.c3;
import com.applovin.impl.mediation.h;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22302c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22304e;

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, Object obj4, int i5) {
        this.f22300a = i5;
        this.f22301b = obj;
        this.f22302c = obj2;
        this.f22303d = obj3;
        this.f22304e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22300a) {
            case 0:
                ((h.b) this.f22301b).a((c3) this.f22302c, (MaxReward) this.f22303d, (Bundle) this.f22304e);
                break;
            case 1:
                ((h.b) this.f22301b).a((Runnable) this.f22302c, (MaxAdListener) this.f22303d, (String) this.f22304e);
                break;
            case 2:
                ((MediationServiceImpl) this.f22301b).a((c3) this.f22302c, (Long) this.f22303d, (MaxAdListener) this.f22304e);
                break;
            case 3:
                ((h) this.f22301b).a((MaxAdapter.OnCompletionListener) this.f22302c, (MaxAdapterInitializationParameters) this.f22303d, (Activity) this.f22304e);
                break;
            default:
                ((h) this.f22301b).a((MaxAdapterResponseParameters) this.f22302c, (MaxAdFormat) this.f22303d, (Activity) this.f22304e);
                break;
        }
    }
}
