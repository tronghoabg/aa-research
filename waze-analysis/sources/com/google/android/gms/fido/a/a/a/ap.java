package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ap extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<ap> CREATOR = new com.google.android.gms.auth.api.signin.e(8);

    /* renamed from: a, reason: collision with root package name */
    private final as f5327a;

    /* renamed from: b, reason: collision with root package name */
    private final t f5328b;

    public ap(String str, int i2) {
        com.google.android.gms.common.api.internal.av.m(str);
        try {
            this.f5327a = as.a(str);
            try {
                this.f5328b = t.b(i2);
            } catch (s e2) {
                throw new IllegalArgumentException(e2);
            }
        } catch (ar e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        return this.f5327a.equals(apVar.f5327a) && this.f5328b.equals(apVar.f5328b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5327a, this.f5328b});
    }

    public final String toString() {
        t tVar = this.f5328b;
        return "PublicKeyCredentialParameters{\n type=" + String.valueOf(this.f5327a) + ", \n algorithm=" + tVar.toString() + "\n }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        as asVar = this.f5327a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.u(parcel, 2, asVar.toString());
        com.google.android.gms.common.internal.bb.s(parcel, 3, Integer.valueOf(this.f5328b.a()));
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
