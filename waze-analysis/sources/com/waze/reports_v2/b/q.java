package com.waze.reports_v2.b;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public static final q f34111a;

    /* renamed from: b, reason: collision with root package name */
    public static final q f34112b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f34113c;

    /* renamed from: d, reason: collision with root package name */
    public static final q f34114d;

    /* renamed from: e, reason: collision with root package name */
    public static final q f34115e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f34116f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f34117g;

    /* renamed from: h, reason: collision with root package name */
    public static final q f34118h;

    /* renamed from: i, reason: collision with root package name */
    public static final q f34119i;

    /* renamed from: j, reason: collision with root package name */
    public static final q f34120j;

    /* renamed from: k, reason: collision with root package name */
    public static final q f34121k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ q[] f34122l;

    static {
        q qVar = new q("TRAFFIC", 0);
        f34111a = qVar;
        q qVar2 = new q("POLICE", 1);
        f34112b = qVar2;
        q qVar3 = new q("CRASH", 2);
        f34113c = qVar3;
        q qVar4 = new q("HAZARD", 3);
        f34114d = qVar4;
        q qVar5 = new q("WEATHER", 4);
        f34115e = qVar5;
        q qVar6 = new q("BLOCKED_LANE", 5);
        f34116f = qVar6;
        q qVar7 = new q("MAP_ISSUE", 6);
        f34117g = qVar7;
        q qVar8 = new q("DEBUG", 7);
        f34118h = qVar8;
        q qVar9 = new q("CLOSURE", 8);
        f34119i = qVar9;
        q qVar10 = new q("PERSONAL_SAFETY", 9);
        f34120j = qVar10;
        q qVar11 = new q("ANIMAL", 10);
        f34121k = qVar11;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11};
        f34122l = qVarArr;
        h.d.b.a(qVarArr);
        CREATOR = new com.google.android.gms.common.api.n(7);
    }

    public static q a(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f34122l.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.g.b.x.f(parcel, "dest");
        parcel.writeString(name());
    }
}
