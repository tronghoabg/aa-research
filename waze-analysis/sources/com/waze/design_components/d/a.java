package com.waze.design_components.d;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f23447a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f23448b;

    a(View view, float f2) {
        this.f23447a = view;
        this.f23448b = f2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        x.f(view, "view");
        x.f(outline, "outline");
        View view2 = this.f23447a;
        float height = view2.getHeight();
        float f2 = this.f23448b;
        outline.setRoundRect(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getWidth() - view2.getPaddingRight(), Float.valueOf(height + f2).intValue(), f2);
    }
}
