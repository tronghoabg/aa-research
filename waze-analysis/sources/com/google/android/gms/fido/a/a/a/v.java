package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class v extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<v> CREATOR = new com.google.android.gms.auth.api.identity.n(14);

    /* renamed from: a, reason: collision with root package name */
    private final List f5440a;

    public v(List list) {
        com.google.android.gms.common.api.internal.av.m(list);
        this.f5440a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        List list = this.f5440a;
        List list2 = ((v) obj).f5440a;
        return list.containsAll(list2) && list2.containsAll(list);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f5440a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        List list = this.f5440a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.y(parcel, 1, list);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
