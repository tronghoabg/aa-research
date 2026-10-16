package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.bb;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public final class y extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<y> CREATOR = new com.google.android.gms.a.b.b.b(6);

    /* renamed from: a, reason: collision with root package name */
    private final String f4568a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4569b;

    public y(String str, String str2) {
        av.n(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        av.l(strTrim, "Account identifier cannot be empty");
        this.f4568a = strTrim;
        av.k(str2);
        this.f4569b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Objects.equals(this.f4568a, yVar.f4568a) && Objects.equals(this.f4569b, yVar.f4569b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4568a, this.f4569b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.f4568a;
        int iD = bb.d(parcel);
        bb.u(parcel, 1, str);
        bb.u(parcel, 2, this.f4569b);
        bb.e(parcel, iD);
    }
}
