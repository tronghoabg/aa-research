package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class af extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<af> CREATOR = new com.google.android.gms.auth.api.signin.e(3);

    /* renamed from: a, reason: collision with root package name */
    private final String f5281a;

    public af(String str) {
        com.google.android.gms.common.api.internal.av.m(str);
        this.f5281a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof af) {
            return this.f5281a.equals(((af) obj).f5281a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5281a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.f5281a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.u(parcel, 1, str);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
