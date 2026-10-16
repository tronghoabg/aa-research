package com.waze.av.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.w;
import h.g.b.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public static final d f16051a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f16052b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ d[] f16053c;

    static {
        d dVar = new d("Unspecified", 0);
        f16051a = dVar;
        d dVar2 = new d("Parking", 1);
        f16052b = dVar2;
        d[] dVarArr = {dVar, dVar2};
        f16053c = dVarArr;
        h.d.b.a(dVarArr);
        CREATOR = new w(9);
    }

    public static d[] values() {
        return (d[]) f16053c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        parcel.writeString(name());
    }
}
