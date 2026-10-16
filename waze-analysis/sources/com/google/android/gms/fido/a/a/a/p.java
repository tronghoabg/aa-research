package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<p> CREATOR = new e(6, null);

    /* renamed from: a, reason: collision with root package name */
    private final z f5425a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5426b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5427c;

    p(int i2, String str, int i3) {
        try {
            this.f5425a = z.b(i2);
            this.f5426b = str;
            this.f5427c = i3;
        } catch (y e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final z a() {
        return this.f5425a;
    }

    public final String b() {
        return this.f5426b;
    }

    public final JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", this.f5425a.a());
            String str = this.f5426b;
            if (str != null) {
                jSONObject.put("message", str);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Objects.equals(this.f5425a, pVar.f5425a) && Objects.equals(this.f5426b, pVar.f5426b) && Objects.equals(Integer.valueOf(this.f5427c), Integer.valueOf(pVar.f5427c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5425a, this.f5426b, Integer.valueOf(this.f5427c)});
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.b("errorCode", this.f5425a.a());
        String str = this.f5426b;
        if (str != null) {
            zVarH.d("errorMessage", str);
        }
        return zVarH.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.g(parcel, 2, this.f5425a.a());
        com.google.android.gms.common.internal.bb.u(parcel, 3, this.f5426b);
        com.google.android.gms.common.internal.bb.g(parcel, 4, this.f5427c);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
