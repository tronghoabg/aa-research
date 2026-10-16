package com.waze.av.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.w;
import h.g.b.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public static final j f16079a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f16080b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f16081c;

    /* renamed from: d, reason: collision with root package name */
    public static final j f16082d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ j[] f16083e;

    static {
        j jVar = new j("Unknown", 0);
        f16079a = jVar;
        j jVar2 = new j("Operational", 1);
        f16080b = jVar2;
        j jVar3 = new j("TemporarilyClosed", 2);
        f16081c = jVar3;
        j jVar4 = new j("PermanentlyClosed", 3);
        f16082d = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        f16083e = jVarArr;
        h.d.b.a(jVarArr);
        CREATOR = new w(12);
    }

    public static j[] values() {
        return (j[]) f16083e.clone();
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
