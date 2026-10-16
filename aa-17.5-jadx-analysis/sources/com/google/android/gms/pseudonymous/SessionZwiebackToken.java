package com.google.android.gms.pseudonymous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.srf;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class SessionZwiebackToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SessionZwiebackToken> CREATOR = new srf(11);
    private final String a;
    private final String b;

    public SessionZwiebackToken(Parcel parcel) {
        this.a = parcel.readString();
        String string = parcel.readString();
        spu.aw(string);
        this.b = string;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SessionZwiebackToken)) {
            return false;
        }
        SessionZwiebackToken sessionZwiebackToken = (SessionZwiebackToken) obj;
        return Objects.equals(this.a, sessionZwiebackToken.a) && Objects.equals(this.b, sessionZwiebackToken.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
