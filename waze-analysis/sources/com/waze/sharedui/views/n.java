package com.waze.sharedui.views;

import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Path f39253a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f39254b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f39255c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f39256d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f39257e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f39258f;

    n(p pVar, Path path, float f2, float f3, float f4, float f5, float f6) {
        this.f39253a = path;
        this.f39254b = f2;
        this.f39255c = f3;
        this.f39256d = f4;
        this.f39257e = f5;
        this.f39258f = f6;
        Objects.requireNonNull(pVar);
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(this.f39253a);
            return;
        }
        float f2 = this.f39254b;
        float f3 = this.f39255c;
        outline.setRoundRect((int) (f2 - f3), (int) this.f39256d, (int) (this.f39257e + f3), (int) this.f39258f, f3);
    }
}
