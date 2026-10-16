package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<n> CREATOR = new e(4, null);

    /* renamed from: a, reason: collision with root package name */
    private final com.google.v.v f5416a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.v.v f5417b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.v.v f5418c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.v.v f5419d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.v.v f5420e;

    n(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        com.google.android.gms.common.api.internal.av.m(bArr);
        com.google.v.v vVarQ = com.google.v.v.q(bArr);
        com.google.android.gms.common.api.internal.av.m(bArr2);
        com.google.v.v vVarQ2 = com.google.v.v.q(bArr2);
        com.google.android.gms.common.api.internal.av.m(bArr3);
        com.google.v.v vVarQ3 = com.google.v.v.q(bArr3);
        com.google.android.gms.common.api.internal.av.m(bArr4);
        com.google.v.v vVarQ4 = com.google.v.v.q(bArr4);
        com.google.v.v vVarQ5 = bArr5 == null ? null : com.google.v.v.q(bArr5);
        com.google.android.gms.common.api.internal.av.m(vVarQ);
        this.f5416a = vVarQ;
        com.google.android.gms.common.api.internal.av.m(vVarQ2);
        this.f5417b = vVarQ2;
        com.google.android.gms.common.api.internal.av.m(vVarQ3);
        this.f5418c = vVarQ3;
        com.google.android.gms.common.api.internal.av.m(vVarQ4);
        this.f5419d = vVarQ4;
        this.f5420e = vVarQ5;
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", a.a.O(c()));
            jSONObject.put("authenticatorData", a.a.O(b()));
            jSONObject.put("signature", a.a.O(e()));
            if (this.f5420e != null) {
                jSONObject.put("userHandle", a.a.O(f()));
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e2);
        }
    }

    public final byte[] b() {
        return this.f5418c.x();
    }

    public final byte[] c() {
        return this.f5417b.x();
    }

    @Deprecated
    public final byte[] d() {
        return this.f5416a.x();
    }

    public final byte[] e() {
        return this.f5419d.x();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Objects.equals(this.f5416a, nVar.f5416a) && Objects.equals(this.f5417b, nVar.f5417b) && Objects.equals(this.f5418c, nVar.f5418c) && Objects.equals(this.f5419d, nVar.f5419d) && Objects.equals(this.f5420e, nVar.f5420e);
    }

    public final byte[] f() {
        com.google.v.v vVar = this.f5420e;
        if (vVar == null) {
            return null;
        }
        return vVar.x();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f5416a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f5417b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f5418c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f5419d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f5420e}))});
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("keyHandle", com.google.d.h.f.l().o(d()));
        zVarH.d("clientDataJSON", com.google.d.h.f.l().o(c()));
        zVarH.d("authenticatorData", com.google.d.h.f.l().o(b()));
        zVarH.d("signature", com.google.d.h.f.l().o(e()));
        byte[] bArrF = f();
        if (bArrF != null) {
            zVarH.d("userHandle", com.google.d.h.f.l().o(bArrF));
        }
        return zVarH.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.l(parcel, 2, d());
        com.google.android.gms.common.internal.bb.l(parcel, 3, c());
        com.google.android.gms.common.internal.bb.l(parcel, 4, b());
        com.google.android.gms.common.internal.bb.l(parcel, 5, e());
        com.google.android.gms.common.internal.bb.l(parcel, 6, f());
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
