package com.google.android.apps.auto.sdk.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.lz;
import defpackage.owu;
import defpackage.yph;

/* loaded from: classes2.dex */
public class AutoTunedRecyclerView extends owu {
    static {
        yph.c("GH.AutoTuneRV");
    }

    public AutoTunedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ab(new CarLayoutManager(context));
    }

    private final void aC(View view, float f) {
        if (!(view instanceof ViewGroup)) {
            view.setAlpha(f);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aC(viewGroup.getChildAt(i), f);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CarLayoutManager g() {
        lz lzVar = this.n;
        if (lzVar != null) {
            return (CarLayoutManager) lzVar;
        }
        return null;
    }

    public final void aA() {
        CarLayoutManager carLayoutManagerG = g();
        carLayoutManagerG.getClass();
        int i = carLayoutManagerG.e;
        if (i == -1) {
            return;
        }
        ad(i);
    }

    public final void aB() {
        CarLayoutManager carLayoutManagerG = g();
        carLayoutManagerG.getClass();
        int i = carLayoutManagerG.d;
        if (i == -1) {
            return;
        }
        ad(i);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final boolean ak(int i, int i2) {
        return super.ak(i, Math.min(Math.max(Math.round(i2), -10000), 10000));
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float f;
        int bottom;
        int height;
        if (this.ad) {
            if (view.getTop() < getBottom() && view.getBottom() > getBottom()) {
                bottom = getBottom() - view.getTop();
                height = view.getHeight();
            } else if (view.getTop() >= getTop() || view.getBottom() <= getTop()) {
                f = 1.0f;
                float f2 = 1.0f - f;
                aC(view, 1.0f - (f2 * f2));
            } else {
                bottom = view.getBottom() - getTop();
                height = view.getHeight();
            }
            f = bottom / height;
            float f22 = 1.0f - f;
            aC(view, 1.0f - (f22 * f22));
        }
        return super.drawChild(canvas, view, j);
    }

    public AutoTunedRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AutoTunedRecyclerView(Context context) {
        this(context, null);
    }
}
