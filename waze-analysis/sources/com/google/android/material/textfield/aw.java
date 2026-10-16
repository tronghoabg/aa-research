package com.google.android.material.textfield;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.customview.view.AbsSavedState;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aw extends AbsSavedState {
    public static final Parcelable.Creator<aw> CREATOR = new av();

    /* renamed from: a, reason: collision with root package name */
    CharSequence f6882a;

    /* renamed from: b, reason: collision with root package name */
    boolean f6883b;

    aw(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6882a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f6883b = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + String.valueOf(this.f6882a) + "}";
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        TextUtils.writeToParcel(this.f6882a, parcel, i2);
        parcel.writeInt(this.f6883b ? 1 : 0);
    }

    aw(Parcelable parcelable) {
        super(parcelable);
    }
}
