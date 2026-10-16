package com.google.android.material.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h extends AbsSavedState {
    public static final Parcelable.Creator<h> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    final int f6289a;

    /* renamed from: b, reason: collision with root package name */
    final int f6290b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f6291c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f6292d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f6293e;

    public h(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6289a = parcel.readInt();
        this.f6290b = parcel.readInt();
        this.f6291c = parcel.readInt() == 1;
        this.f6292d = parcel.readInt() == 1;
        this.f6293e = parcel.readInt() == 1;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f6289a);
        parcel.writeInt(this.f6290b);
        parcel.writeInt(this.f6291c ? 1 : 0);
        parcel.writeInt(this.f6292d ? 1 : 0);
        parcel.writeInt(this.f6293e ? 1 : 0);
    }

    public h(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
        super(parcelable);
        this.f6289a = bottomSheetBehavior.f6275h;
        this.f6290b = bottomSheetBehavior.x;
        this.f6291c = bottomSheetBehavior.t;
        this.f6292d = bottomSheetBehavior.f6274g;
        this.f6293e = bottomSheetBehavior.V;
    }
}
