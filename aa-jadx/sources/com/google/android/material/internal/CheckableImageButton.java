package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
public class CheckableImageButton extends defpackage.jf implements android.widget.Checkable {
    private static final int[] e = {android.R.attr.state_checked};
    public boolean a;
    public boolean b;
    public boolean c;
    public defpackage.wqs d;

    public CheckableImageButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        this.c = true;
        defpackage.ebt.n(this, new defpackage.wqr(this));
    }

    public final void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.a ? mergeDrawableStates(super.onCreateDrawableState(i + 1), e) : super.onCreateDrawableState(i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        this.d = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.internal.CheckableImageButton.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.internal.CheckableImageButton.SavedState savedState = (com.google.android.material.internal.CheckableImageButton.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        setChecked(savedState.a);
    }

    @Override // android.view.View
    protected final android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.internal.CheckableImageButton.SavedState savedState = new com.google.android.material.internal.CheckableImageButton.SavedState(super.onSaveInstanceState());
        savedState.a = this.a;
        return savedState;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (!this.b || this.a == z) {
            return;
        }
        this.a = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public final void setFocusable(boolean z) {
        defpackage.wqs wqsVar;
        boolean zIsFocusable = isFocusable();
        super.setFocusable(z);
        if (zIsFocusable == z || (wqsVar = this.d) == null) {
            return;
        }
        wqsVar.a();
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        if (this.c) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.a);
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.internal.CheckableImageButton.SavedState> CREATOR = new defpackage.wmw(3);
        boolean a;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    public CheckableImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(android.content.Context context) {
        this(context, null);
    }
}
