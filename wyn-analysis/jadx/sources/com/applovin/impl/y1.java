package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;

/* loaded from: classes.dex */
public class y1 extends v1 {
    public y1(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(bVar, activity, kVar);
    }

    @Override // com.applovin.impl.v1
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f23393d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.f23392c.n(), (this.f23392c.u0() ? 3 : 5) | 48, gVar);
        }
        if (kVar != null) {
            this.f23393d.addView(kVar, this.f23394e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f23393d);
        } else {
            this.f23391b.setContentView(this.f23393d);
        }
    }
}
