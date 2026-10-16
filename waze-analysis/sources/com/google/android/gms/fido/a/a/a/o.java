package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<o> CREATOR = new e(5, null);

    /* renamed from: a, reason: collision with root package name */
    private final com.google.v.v f5421a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.v.v f5422b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.v.v f5423c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f5424d;

    o(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        com.google.android.gms.common.api.internal.av.m(bArr);
        com.google.v.v vVarQ = com.google.v.v.q(bArr);
        com.google.android.gms.common.api.internal.av.m(bArr2);
        com.google.v.v vVarQ2 = com.google.v.v.q(bArr2);
        com.google.android.gms.common.api.internal.av.m(bArr3);
        com.google.v.v vVarQ3 = com.google.v.v.q(bArr3);
        com.google.android.gms.common.api.internal.av.m(vVarQ);
        this.f5421a = vVarQ;
        com.google.android.gms.common.api.internal.av.m(vVarQ2);
        this.f5422b = vVarQ2;
        com.google.android.gms.common.api.internal.av.m(vVarQ3);
        this.f5423c = vVarQ3;
        com.google.android.gms.common.api.internal.av.m(strArr);
        this.f5424d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0117 A[Catch: i -> 0x0200, JSONException -> 0x0243, TRY_LEAVE, TryCatch #1 {i -> 0x0200, blocks: (B:24:0x00e6, B:30:0x0105, B:32:0x0117, B:37:0x012d, B:40:0x014f, B:42:0x0165, B:44:0x016b, B:45:0x0187, B:46:0x018c, B:47:0x018d, B:48:0x0192, B:53:0x019d, B:55:0x01ad, B:57:0x01bb, B:58:0x01d0, B:59:0x01d5, B:60:0x01d6, B:61:0x01db, B:66:0x01fa, B:67:0x01ff), top: B:93:0x00e6, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fa A[Catch: i -> 0x0200, JSONException -> 0x0243, TRY_ENTER, TryCatch #1 {i -> 0x0200, blocks: (B:24:0x00e6, B:30:0x0105, B:32:0x0117, B:37:0x012d, B:40:0x014f, B:42:0x0165, B:44:0x016b, B:45:0x0187, B:46:0x018c, B:47:0x018d, B:48:0x0192, B:53:0x019d, B:55:0x01ad, B:57:0x01bb, B:58:0x01d0, B:59:0x01d5, B:60:0x01d6, B:61:0x01db, B:66:0x01fa, B:67:0x01ff), top: B:93:0x00e6, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject a() {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.a.a.a.o.a():org.json.JSONObject");
    }

    public final byte[] b() {
        return this.f5423c.x();
    }

    public final byte[] c() {
        return this.f5422b.x();
    }

    @Deprecated
    public final byte[] d() {
        return this.f5421a.x();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Objects.equals(this.f5421a, oVar.f5421a) && Objects.equals(this.f5422b, oVar.f5422b) && Objects.equals(this.f5423c, oVar.f5423c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f5421a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f5422b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f5423c}))});
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("keyHandle", com.google.d.h.f.l().o(d()));
        zVarH.d("clientDataJSON", com.google.d.h.f.l().o(c()));
        zVarH.d("attestationObject", com.google.d.h.f.l().o(b()));
        zVarH.d("transports", Arrays.toString(this.f5424d));
        return zVarH.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.l(parcel, 2, d());
        com.google.android.gms.common.internal.bb.l(parcel, 3, c());
        com.google.android.gms.common.internal.bb.l(parcel, 4, b());
        com.google.android.gms.common.internal.bb.v(parcel, 5, this.f5424d);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
