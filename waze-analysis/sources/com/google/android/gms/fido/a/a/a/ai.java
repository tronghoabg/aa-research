package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ai extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<ai> CREATOR = new com.google.android.gms.auth.api.signin.e(5);

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f5287a = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    /* renamed from: b, reason: collision with root package name */
    private final byte[][] f5288b;

    public ai(byte[][] bArr) {
        com.google.android.gms.common.api.internal.av.c(bArr != null);
        com.google.android.gms.common.api.internal.av.c(1 == ((bArr.length & 1) ^ 1));
        int i2 = 0;
        while (i2 < bArr.length) {
            com.google.android.gms.common.api.internal.av.c(i2 == 0 || bArr[i2] != null);
            int i3 = i2 + 1;
            com.google.android.gms.common.api.internal.av.c(bArr[i3] != null);
            int length = bArr[i3].length;
            com.google.android.gms.common.api.internal.av.c(length == 32 || length == 64);
            i2 += 2;
        }
        this.f5288b = bArr;
    }

    public static ai a(JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z) {
                    arrayList.add(d(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(e(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(a.a.P(next));
                    if (z) {
                        arrayList.add(d(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(e(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new ai((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    private static JSONObject b(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", a.a.O(bArr));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    private static byte[] c(byte[] bArr) {
        com.google.d.g.h hVarA = com.google.d.g.j.b().a();
        hVarA.d(f5287a);
        hVarA.d(bArr);
        return hVarA.k().d();
    }

    private static byte[] d(JSONObject jSONObject) throws JSONException {
        byte[] bArrP = a.a.P(jSONObject.getString("first"));
        if (bArrP.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrP;
        }
        byte[] bArrP2 = a.a.P(jSONObject.getString("second"));
        if (bArrP2.length == 32) {
            return com.google.d.l.j.r(bArrP, bArrP2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    private static byte[] e(JSONObject jSONObject) {
        byte[] bArrC = c(a.a.P(jSONObject.getString("first")));
        return !jSONObject.has("second") ? bArrC : com.google.d.l.j.r(bArrC, c(a.a.P(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ai) {
            return Arrays.deepEquals(this.f5288b, ((ai) obj).f5288b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.f5288b) {
            if (bArr != null) {
                iHashCode ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return iHashCode;
    }

    public final String toString() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            int i2 = 0;
            JSONObject jSONObject2 = null;
            while (true) {
                byte[][] bArr = this.f5288b;
                if (i2 >= bArr.length) {
                    return "PrfExtension{" + jSONObject.toString() + "}";
                }
                if (bArr[i2] == null) {
                    jSONObject.put("eval", b(bArr[i2 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(a.a.O(bArr[i2]), b(bArr[i2 + 1]));
                }
                i2 += 2;
            }
        } catch (JSONException e2) {
            return "PrfExtension{Exception:" + e2.getMessage() + "}";
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        byte[][] bArr = this.f5288b;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.m(parcel, 1, bArr);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
