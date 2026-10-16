package com.google.android.gms.l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<h> CREATOR = new com.google.android.gms.auth.a.b(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f5622a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5623b;

    /* renamed from: c, reason: collision with root package name */
    public final f f5624c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5625d;

    public h(String str, String str2, f fVar, boolean z) {
        this.f5622a = str;
        this.f5623b = str2;
        this.f5624c = fVar;
        this.f5625d = z;
    }

    final void a(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.f5622a);
        sb.append(", ");
        sb.append(this.f5623b);
        sb.append(", ");
        this.f5624c.d(sb);
        sb.append(", ");
        sb.append(this.f5625d);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return com.waze.c.c.e.b(this.f5622a, hVar.f5622a) && com.waze.c.c.e.b(this.f5623b, hVar.f5623b) && com.waze.c.c.e.b(this.f5624c, hVar.f5624c) && this.f5625d == hVar.f5625d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.f5622a;
        int iD = bb.d(parcel);
        bb.u(parcel, 2, str);
        bb.u(parcel, 3, this.f5623b);
        bb.t(parcel, 4, this.f5624c, i2);
        bb.f(parcel, 5, this.f5625d);
        bb.e(parcel, iD);
    }
}
