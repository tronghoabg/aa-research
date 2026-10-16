package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.sdk.ad.b;

/* loaded from: classes.dex */
abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    final com.applovin.impl.sdk.k f23390a;

    /* renamed from: b, reason: collision with root package name */
    final Activity f23391b;

    /* renamed from: c, reason: collision with root package name */
    final com.applovin.impl.sdk.ad.b f23392c;

    /* renamed from: d, reason: collision with root package name */
    final ViewGroup f23393d;

    /* renamed from: e, reason: collision with root package name */
    final FrameLayout.LayoutParams f23394e;

    public v1(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f23394e = layoutParams;
        this.f23392c = bVar;
        this.f23390a = kVar;
        this.f23391b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f23393d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(View view) {
        this.f23393d.removeView(view);
    }

    public void a(com.applovin.impl.adview.g gVar) {
        if (gVar == null || gVar.getParent() != null) {
            return;
        }
        a(this.f23392c.n(), (this.f23392c.u0() ? 3 : 5) | 48, gVar);
    }

    public void a(b.d dVar, int i5, com.applovin.impl.adview.g gVar) {
        gVar.a(dVar.f22896a, dVar.f22900e, dVar.f22899d, i5);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gVar.getLayoutParams());
        int i10 = dVar.f22898c;
        layoutParams.setMargins(i10, dVar.f22897b, i10, 0);
        layoutParams.gravity = i5;
        this.f23393d.addView(gVar, layoutParams);
    }
}
