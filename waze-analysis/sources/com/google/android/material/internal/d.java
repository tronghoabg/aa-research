package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d extends AbsSavedState {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    boolean f6579a;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6579a = parcel.readInt() == 1;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f6579a ? 1 : 0);
    }

    public d(Parcelable parcelable) {
        super(parcelable);
    }
}
