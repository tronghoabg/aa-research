package com.applovin.impl.mediation;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1451o;
import com.applovin.impl.c3;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.y2;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22263a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediationServiceImpl f22264b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f22265c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f22266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a.InterfaceC0014a f22267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f22268f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f22269g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f22270h;

    public /* synthetic */ k(MediationServiceImpl mediationServiceImpl, c3 c3Var, h hVar, ViewGroup viewGroup, AbstractC1451o abstractC1451o, Activity activity, a.InterfaceC0014a interfaceC0014a) {
        this.f22264b = mediationServiceImpl;
        this.f22268f = c3Var;
        this.f22265c = hVar;
        this.f22269g = viewGroup;
        this.f22270h = abstractC1451o;
        this.f22266d = activity;
        this.f22267e = interfaceC0014a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22263a) {
            case 0:
                this.f22264b.a(this.f22265c, (String) this.f22268f, (MaxAdapterParametersImpl) this.f22269g, (y2) this.f22270h, this.f22266d, this.f22267e);
                break;
            default:
                Activity activity = this.f22266d;
                this.f22264b.a((c3) this.f22268f, this.f22265c, (ViewGroup) this.f22269g, (AbstractC1451o) this.f22270h, activity, this.f22267e);
                break;
        }
    }

    public /* synthetic */ k(MediationServiceImpl mediationServiceImpl, h hVar, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, y2 y2Var, Activity activity, a.InterfaceC0014a interfaceC0014a) {
        this.f22264b = mediationServiceImpl;
        this.f22265c = hVar;
        this.f22268f = str;
        this.f22269g = maxAdapterParametersImpl;
        this.f22270h = y2Var;
        this.f22266d = activity;
        this.f22267e = interfaceC0014a;
    }
}
