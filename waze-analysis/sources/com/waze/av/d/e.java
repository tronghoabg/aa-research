package com.waze.av.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.w;
import h.g.b.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public static final e f16054a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f16055b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f16056c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f16057d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f16058e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f16059f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f16060g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ e[] f16061h;

    static {
        e eVar = new e("Sunday", 0);
        f16054a = eVar;
        e eVar2 = new e("Monday", 1);
        f16055b = eVar2;
        e eVar3 = new e("Tuesday", 2);
        f16056c = eVar3;
        e eVar4 = new e("Wednesday", 3);
        f16057d = eVar4;
        e eVar5 = new e("Thursday", 4);
        f16058e = eVar5;
        e eVar6 = new e("Friday", 5);
        f16059f = eVar6;
        e eVar7 = new e("Saturday", 6);
        f16060g = eVar7;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        f16061h = eVarArr;
        h.d.b.a(eVarArr);
        CREATOR = new w(10);
    }

    public static e[] values() {
        return (e[]) f16061h.clone();
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
