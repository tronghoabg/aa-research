package com.waze.ad.a;

import android.view.View;
import h.ab;
import h.g.a.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f13888a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f13889b;

    d(View view, e eVar) {
        this.f13888a = view;
        this.f13889b = eVar;
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.f13888a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f13889b);
        return ab.f48028a;
    }
}
