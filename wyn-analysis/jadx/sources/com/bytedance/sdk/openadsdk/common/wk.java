package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class wk extends View {

    /* renamed from: oa, reason: collision with root package name */
    private View f25321oa;
    private final uef uef;

    public interface uef {
        View uef(Context context);
    }

    public wk(Context context, uef uefVar) {
        super(context);
        this.uef = uefVar;
        uef();
    }

    private View oa() {
        uef uefVar;
        if (this.f25321oa == null && (uefVar = this.uef) != null) {
            this.f25321oa = uefVar.uef(getContext());
            uef(this.f25321oa, (ViewGroup) getParent());
        }
        return this.f25321oa;
    }

    private void uef() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        View view = this.f25321oa;
        if (view != null) {
            view.setVisibility(i5);
            return;
        }
        super.setVisibility(i5);
        if (i5 == 0 || i5 == 4) {
            oa();
        }
    }

    private void uef(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }
}
