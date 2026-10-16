package com.airbnb.lottie;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e extends View.BaseSavedState {
    public static final Parcelable.Creator<e> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    String f2287a;

    /* renamed from: b, reason: collision with root package name */
    int f2288b;

    /* renamed from: c, reason: collision with root package name */
    float f2289c;

    /* renamed from: d, reason: collision with root package name */
    boolean f2290d;

    /* renamed from: e, reason: collision with root package name */
    String f2291e;

    /* renamed from: f, reason: collision with root package name */
    int f2292f;

    /* renamed from: g, reason: collision with root package name */
    int f2293g;

    /* synthetic */ e(Parcel parcel) {
        super(parcel);
        this.f2287a = parcel.readString();
        this.f2289c = parcel.readFloat();
        this.f2290d = parcel.readInt() == 1;
        this.f2291e = parcel.readString();
        this.f2292f = parcel.readInt();
        this.f2293g = parcel.readInt();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f2287a);
        parcel.writeFloat(this.f2289c);
        parcel.writeInt(this.f2290d ? 1 : 0);
        parcel.writeString(this.f2291e);
        parcel.writeInt(this.f2292f);
        parcel.writeInt(this.f2293g);
    }
}
