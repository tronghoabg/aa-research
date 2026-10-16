package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.d.d.ci;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class an extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<an> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f5322a;

    /* renamed from: b, reason: collision with root package name */
    private final as f5323b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.v.v f5324c;

    /* renamed from: d, reason: collision with root package name */
    private final List f5325d;

    static {
        ci.q(com.google.android.gms.fido.a.a.a.a.a.f5274a, com.google.android.gms.fido.a.a.a.a.a.f5275b);
        f5322a = false;
        CREATOR = new com.google.android.gms.auth.api.signin.e(6);
    }

    public an(String str, byte[] bArr, List list) {
        com.google.v.v vVarQ = com.google.v.v.q(bArr);
        com.google.android.gms.common.api.internal.av.m(str);
        try {
            this.f5323b = as.a(str);
            com.google.android.gms.common.api.internal.av.m(vVarQ);
            this.f5324c = vVarQ;
            this.f5325d = list;
        } catch (ar e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final byte[] a() {
        return this.f5324c.x();
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof an)) {
            return false;
        }
        an anVar = (an) obj;
        if (!this.f5323b.equals(anVar.f5323b) || !Objects.equals(this.f5324c, anVar.f5324c)) {
            return false;
        }
        List list2 = this.f5325d;
        if (list2 == null && anVar.f5325d == null) {
            return true;
        }
        return list2 != null && (list = anVar.f5325d) != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5323b, this.f5324c, this.f5325d});
    }

    public final String toString() {
        return "PublicKeyCredentialDescriptor{\n type=" + String.valueOf(this.f5323b) + ", \n id=" + a.a.O(a()) + ", \n transports=" + String.valueOf(this.f5325d) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        as asVar = this.f5323b;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.u(parcel, 2, asVar.toString());
        com.google.android.gms.common.internal.bb.l(parcel, 3, a());
        com.google.android.gms.common.internal.bb.y(parcel, 4, this.f5325d);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
