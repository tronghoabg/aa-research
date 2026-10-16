package com.google.android.material.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d extends View.BaseSavedState {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    int f6206a;

    /* synthetic */ d(Parcel parcel) {
        super(parcel);
        this.f6206a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int i2 = this.f6206a;
        return "MaterialCheckBox.SavedState{" + hexString + " CheckedState=" + (i2 != 1 ? i2 != 2 ? "unchecked" : "indeterminate" : "checked") + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeValue(Integer.valueOf(this.f6206a));
    }
}
