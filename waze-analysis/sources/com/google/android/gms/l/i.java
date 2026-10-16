package com.google.android.gms.l;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.bb;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<i> CREATOR = new com.google.android.gms.auth.a.b(8);

    /* renamed from: a, reason: collision with root package name */
    public final List f5626a;

    public i(List list) {
        this.f5626a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return this.f5626a.equals(((i) obj).f5626a);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (h hVar : this.f5626a) {
            if (!z) {
                sb.append(", ");
            }
            hVar.a(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        List list = this.f5626a;
        int iD = bb.d(parcel);
        bb.y(parcel, 2, list);
        bb.e(parcel, iD);
    }
}
