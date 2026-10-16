package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ax extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<ax> CREATOR = new e(15, null);

    /* renamed from: a, reason: collision with root package name */
    private final String f5354a;

    ax(String str) {
        this.f5354a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ax) {
            return Objects.equals(this.f5354a, ((ax) obj).f5354a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5354a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.f5354a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.u(parcel, 1, str);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
