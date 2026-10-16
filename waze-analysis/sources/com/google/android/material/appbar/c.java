package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends AbsSavedState {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    boolean f6181a;

    /* renamed from: b, reason: collision with root package name */
    boolean f6182b;

    /* renamed from: c, reason: collision with root package name */
    int f6183c;

    /* renamed from: d, reason: collision with root package name */
    float f6184d;

    /* renamed from: e, reason: collision with root package name */
    boolean f6185e;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6181a = parcel.readByte() != 0;
        this.f6182b = parcel.readByte() != 0;
        this.f6183c = parcel.readInt();
        this.f6184d = parcel.readFloat();
        this.f6185e = parcel.readByte() != 0;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.f6181a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6182b ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f6183c);
        parcel.writeFloat(this.f6184d);
        parcel.writeByte(this.f6185e ? (byte) 1 : (byte) 0);
    }

    public c(Parcelable parcelable) {
        super(parcelable);
    }
}
