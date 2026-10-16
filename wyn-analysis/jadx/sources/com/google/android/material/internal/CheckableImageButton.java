package com.google.android.material.internal;

import O7.e;
import W7.a;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import k1.S;
import q.C3837t;

/* loaded from: classes4.dex */
public class CheckableImageButton extends C3837t implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f26972g = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f26973d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26974e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26975f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.wynauto.wyn.R.attr.imageButtonStyle);
        this.f26974e = true;
        this.f26975f = true;
        S.m(this, new e(this, 1));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f26973d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        return this.f26973d ? View.mergeDrawableStates(super.onCreateDrawableState(i5 + 1), f26972g) : super.onCreateDrawableState(i5);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f44826a);
        setChecked(aVar.f15195c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f15195c = this.f26973d;
        return aVar;
    }

    public void setCheckable(boolean z2) {
        if (this.f26974e != z2) {
            this.f26974e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f26974e || this.f26973d == z2) {
            return;
        }
        this.f26973d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f26975f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f26975f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f26973d);
    }
}
