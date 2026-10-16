package com.google.android.gms.pseudonymous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.srf;
import j$.util.Objects;

/* loaded from: classes2.dex */
public class PseudonymousIdToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PseudonymousIdToken> CREATOR = new srf(10);
    public final String a;

    public PseudonymousIdToken(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PseudonymousIdToken) {
            return Objects.equals(this.a, ((PseudonymousIdToken) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PseudonymousIdToken[" + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iL = spu.l(parcel, 20293);
        spu.F(parcel, 2, str);
        spu.m(parcel, iL);
    }
}
