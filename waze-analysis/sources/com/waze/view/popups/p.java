package com.waze.view.popups;

import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class p extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ float f45336a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f45337b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f45338c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f45339d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f45340e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ t f45341f;

    p(t tVar, float f2, float f3, float f4, float f5, float f6) {
        this.f45336a = f2;
        this.f45337b = f3;
        this.f45338c = f4;
        this.f45339d = f5;
        this.f45340e = f6;
        Objects.requireNonNull(tVar);
        this.f45341f = tVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(this.f45341f.f45355h);
            return;
        }
        outline.setRoundRect((int) this.f45336a, (int) this.f45337b, (int) this.f45338c, (int) this.f45339d, this.f45340e / 2.0f);
    }
}
