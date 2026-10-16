package com.bytedance.adsdk.ugeno.uef;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* loaded from: classes.dex */
public class bcc implements xs {
    private float ivm;
    private float lw;
    private float moa;

    /* renamed from: oa, reason: collision with root package name */
    private float f24763oa;
    private View uef;
    private float yo;

    public bcc(View view) {
        this.uef = view;
    }

    @Override // com.bytedance.adsdk.ugeno.uef.xs
    public float getRipple() {
        return this.yo;
    }

    @Override // com.bytedance.adsdk.ugeno.uef.xs
    public float getRubIn() {
        return this.ivm;
    }

    @Override // com.bytedance.adsdk.ugeno.uef.xs
    public float getShine() {
        return this.moa;
    }

    @Override // com.bytedance.adsdk.ugeno.uef.xs
    public float getStretch() {
        return this.lw;
    }

    public void lw(float f10) {
        this.ivm = f10;
        this.uef.postInvalidate();
    }

    public void moa(float f10) {
        this.lw = f10;
        this.uef.postInvalidate();
    }

    public void oa(float f10) {
        View view = this.uef;
        if (view == null) {
            return;
        }
        this.yo = f10;
        view.postInvalidate();
    }

    public void uef(float f10) {
        View view = this.uef;
        if (view == null) {
            return;
        }
        this.f24763oa = f10;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f10);
        }
    }

    public void yo(float f10) {
        View view = this.uef;
        if (view == null) {
            return;
        }
        this.moa = f10;
        view.postInvalidate();
    }

    public float uef() {
        return this.f24763oa;
    }

    public void uef(int i5) {
        View view = this.uef;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i5);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i5);
        }
    }
}
