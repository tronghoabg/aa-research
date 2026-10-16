package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import j$.util.Objects;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<m> CREATOR = new com.google.android.gms.auth.api.identity.n(13);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5414a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.v.v f5415b;

    public m(boolean z, com.google.v.v vVar) {
        this.f5414a = z;
        this.f5415b = vVar;
    }

    private static String c(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public final JSONObject a() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f5414a) {
                jSONObject.put("enabled", true);
            }
            byte[] bArrB = b();
            if (bArrB != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", c(Arrays.copyOf(bArrB, 32)));
                if (bArrB.length == 64) {
                    jSONObject2.put("second", c(Arrays.copyOfRange(bArrB, 32, 64)));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e2);
        }
    }

    public final byte[] b() {
        com.google.v.v vVar = this.f5415b;
        if (vVar == null) {
            return null;
        }
        return vVar.x();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f5414a == mVar.f5414a && Objects.equals(this.f5415b, mVar.f5415b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f5414a), this.f5415b});
    }

    public final String toString() {
        byte[] bArrB = b();
        StringBuilder sb = new StringBuilder("AuthenticationExtensionsPrfOutputs{enabled:");
        sb.append(this.f5414a);
        sb.append("outputs:");
        sb.append(bArrB != null);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        boolean z = this.f5414a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.f(parcel, 1, z);
        com.google.android.gms.common.internal.bb.l(parcel, 2, b());
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
