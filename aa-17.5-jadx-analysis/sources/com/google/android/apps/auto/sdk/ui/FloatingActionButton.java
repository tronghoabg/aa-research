package com.google.android.apps.auto.sdk.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Checkable;
import android.widget.ImageButton;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.khy;
import defpackage.oxd;
import defpackage.oxl;

/* loaded from: classes2.dex */
public class FloatingActionButton extends ImageButton implements Checkable {
    private static final int[] a = {R.attr.state_checked};
    private Animation b;
    private Animation c;
    private Drawable d;
    private oxd e;
    private boolean f;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new khy(12);
        boolean a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            return "FloatingActionButton.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " checked=" + this.a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.a));
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, oxl.a, i, i2);
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(9, 0);
            if (resourceId != 0) {
                this.b = AnimationUtils.loadAnimation(getContext(), resourceId);
            }
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(10, 0);
            if (resourceId2 != 0) {
                this.c = AnimationUtils.loadAnimation(getContext(), resourceId2);
            }
            oxd oxdVar = oxd.values()[typedArrayObtainStyledAttributes.getInt(4, 0)];
            this.e = oxdVar;
            Context context2 = getContext();
            int i3 = oxdVar.f;
            this.d = i3 == 0 ? null : context2.getDrawable(i3);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f) {
            mergeDrawableStates(iArrOnCreateDrawableState, a);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            Animation animation = this.b;
            if (animation != null) {
                startAnimation(animation);
                return;
            }
            return;
        }
        Animation animation2 = this.c;
        if (animation2 != null) {
            startAnimation(animation2);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.f;
        return savedState;
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            Animation animation = this.c;
            if (animation != null) {
                startAnimation(animation);
            }
            Drawable drawable = this.d;
            if (drawable != null) {
                setBackground(drawable);
            }
            Log.i("FloatingActionButton", "id: ".concat(String.valueOf(getResources().getResourceEntryName(getId()))));
            Log.i("FloatingActionButton", "mType: ".concat(String.valueOf(String.valueOf(this.e))));
            Log.i("FloatingActionButton", "mFocusGainedAnimation: ".concat(String.valueOf(String.valueOf(this.b))));
            Log.i("FloatingActionButton", "mFocusLostAnimation: ".concat(String.valueOf(String.valueOf(this.c))));
            Log.i("FloatingActionButton", "mBackground: ".concat(String.valueOf(String.valueOf(this.d))));
            Log.i("FloatingActionButton", "mIsChecked: " + this.f);
            Log.i("FloatingActionButton", "mIsBroadcasting: false");
            Log.i("FloatingActionButton", "mOnCheckedChangeListener: null");
        }
    }

    @Override // android.view.View
    @ResultIgnorabilityUnspecified
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        refreshDrawableState();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (this.e == oxd.Toggle) {
            setChecked(!this.f);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.carButtonStyle, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public FloatingActionButton(Context context) {
        this(context, null, com.google.android.projection.gearhead.R.attr.carButtonStyle, 0);
    }
}
