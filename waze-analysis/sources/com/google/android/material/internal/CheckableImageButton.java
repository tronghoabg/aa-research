package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.ak;
import android.util.AttributeSet;
import android.widget.Checkable;
import androidx.core.view.ViewCompat;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class CheckableImageButton extends ak implements Checkable {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f6565a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    private boolean f6566b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6567c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6568d;

    /* renamed from: e, reason: collision with root package name */
    private b f6569e;

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f6567c = true;
        this.f6568d = true;
        ViewCompat.setAccessibilityDelegate(this, new a(this));
    }

    public final void a(boolean z) {
        if (this.f6567c != z) {
            this.f6567c = z;
            sendAccessibilityEvent(0);
        }
    }

    public final void b(b bVar) {
        this.f6569e = bVar;
    }

    public final void c(boolean z) {
        this.f6568d = z;
    }

    public final boolean d() {
        return this.f6567c;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f6566b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        return this.f6566b ? mergeDrawableStates(super.onCreateDrawableState(i2 + 1), f6565a) : super.onCreateDrawableState(i2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        this.f6569e = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setChecked(dVar.f6579a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f6579a = this.f6566b;
        return dVar;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (!this.f6567c || this.f6566b == z) {
            return;
        }
        this.f6566b = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public final void setFocusable(boolean z) {
        b bVar;
        boolean zIsFocusable = isFocusable();
        super.setFocusable(z);
        if (zIsFocusable == z || (bVar = this.f6569e) == null) {
            return;
        }
        bVar.a();
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        if (this.f6568d) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f6566b);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.waze.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }
}
