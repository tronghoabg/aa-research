package com.waze.ad.a;

import android.view.View;
import android.view.ViewTreeObserver;
import h.ab;
import h.g.a.l;
import kotlinx.coroutines.k;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f13890a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f13891b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f13892c;

    e(l lVar, View view, k kVar) {
        this.f13890a = lVar;
        this.f13891b = view;
        this.f13892c = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        l lVar = this.f13890a;
        View view = this.f13891b;
        if (((Boolean) lVar.invoke(view)).booleanValue()) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f13892c.resumeWith(ab.f48028a);
        }
    }
}
