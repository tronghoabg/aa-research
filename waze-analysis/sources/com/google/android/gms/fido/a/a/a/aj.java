package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import j$.util.Objects;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aj extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<aj> CREATOR = new e(12, null);

    /* renamed from: a, reason: collision with root package name */
    private final String f5289a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5290b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.v.v f5291c;

    /* renamed from: d, reason: collision with root package name */
    private final o f5292d;

    /* renamed from: e, reason: collision with root package name */
    private final n f5293e;

    /* renamed from: f, reason: collision with root package name */
    private final p f5294f;

    /* renamed from: g, reason: collision with root package name */
    private final j f5295g;

    /* renamed from: h, reason: collision with root package name */
    private final String f5296h;

    /* renamed from: i, reason: collision with root package name */
    private String f5297i;

    aj(String str, String str2, byte[] bArr, o oVar, n nVar, p pVar, j jVar, String str3) {
        com.google.v.v vVarQ = bArr == null ? null : com.google.v.v.q(bArr);
        boolean z = true;
        com.google.android.gms.common.api.internal.av.d((oVar != null && nVar == null && pVar == null) || (oVar == null && nVar != null && pVar == null) || (oVar == null && nVar == null && pVar != null), "Must provide a response object.");
        if (pVar == null && (str == null || vVarQ == null)) {
            z = false;
        }
        com.google.android.gms.common.api.internal.av.d(z, "Must provide id and rawId if not an error response.");
        this.f5289a = str;
        this.f5290b = str2;
        this.f5291c = vVarQ;
        this.f5292d = oVar;
        this.f5293e = nVar;
        this.f5294f = pVar;
        this.f5295g = jVar;
        this.f5296h = str3;
        this.f5297i = null;
    }

    public final String a() {
        return b().toString();
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObjectC;
        try {
            JSONObject jSONObject = new JSONObject();
            com.google.v.v vVar = this.f5291c;
            if (vVar != null && vVar.x().length > 0) {
                jSONObject.put("rawId", a.a.O(vVar.x()));
            }
            String str = this.f5296h;
            if (str != null) {
                jSONObject.put("authenticatorAttachment", str);
            }
            String str2 = this.f5290b;
            if (str2 != null && this.f5294f == null) {
                jSONObject.put(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, str2);
            }
            String str3 = this.f5289a;
            if (str3 != null) {
                jSONObject.put(TtmlNode.ATTR_ID, str3);
            }
            String str4 = "response";
            n nVar = this.f5293e;
            boolean z = true;
            if (nVar != null) {
                jSONObjectC = nVar.a();
            } else {
                o oVar = this.f5292d;
                if (oVar != null) {
                    jSONObjectC = oVar.a();
                } else {
                    p pVar = this.f5294f;
                    z = false;
                    if (pVar != null) {
                        jSONObjectC = pVar.c();
                        str4 = "error";
                    } else {
                        jSONObjectC = null;
                    }
                }
            }
            if (jSONObjectC != null) {
                jSONObject.put(str4, jSONObjectC);
            }
            j jVar = this.f5295g;
            if (jVar != null) {
                jSONObject.put("clientExtensionResults", jVar.a());
                return jSONObject;
            }
            if (z) {
                jSONObject.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
        }
    }

    public final com.google.android.gms.common.internal.a.a c() {
        o oVar = this.f5292d;
        if (oVar != null) {
            return oVar;
        }
        n nVar = this.f5293e;
        if (nVar != null) {
            return nVar;
        }
        p pVar = this.f5294f;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("No response set.");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        return Objects.equals(this.f5289a, ajVar.f5289a) && Objects.equals(this.f5290b, ajVar.f5290b) && Objects.equals(this.f5291c, ajVar.f5291c) && Objects.equals(this.f5292d, ajVar.f5292d) && Objects.equals(this.f5293e, ajVar.f5293e) && Objects.equals(this.f5294f, ajVar.f5294f) && Objects.equals(this.f5295g, ajVar.f5295g) && Objects.equals(this.f5296h, ajVar.f5296h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5289a, this.f5290b, this.f5291c, this.f5293e, this.f5292d, this.f5294f, this.f5295g, this.f5296h});
    }

    public final String toString() {
        com.google.v.v vVar = this.f5291c;
        byte[] bArrX = vVar == null ? null : vVar.x();
        String str = this.f5290b;
        String str2 = this.f5289a;
        o oVar = this.f5292d;
        n nVar = this.f5293e;
        p pVar = this.f5294f;
        j jVar = this.f5295g;
        String str3 = this.f5296h;
        return "PublicKeyCredential{\n id='" + str2 + "', \n type='" + str + "', \n rawId=" + a.a.O(bArrX) + ", \n registerResponse=" + String.valueOf(oVar) + ", \n signResponse=" + String.valueOf(nVar) + ", \n errorResponse=" + String.valueOf(pVar) + ", \n extensionsClientOutputs=" + String.valueOf(jVar) + ", \n authenticatorAttachment='" + str3 + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        if (d.a.a.a.a.a.a.b()) {
            this.f5297i = b().toString();
        }
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.u(parcel, 1, this.f5289a);
        com.google.android.gms.common.internal.bb.u(parcel, 2, this.f5290b);
        com.google.v.v vVar = this.f5291c;
        com.google.android.gms.common.internal.bb.l(parcel, 3, vVar == null ? null : vVar.x());
        com.google.android.gms.common.internal.bb.t(parcel, 4, this.f5292d, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 5, this.f5293e, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 6, this.f5294f, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 7, this.f5295g, i2);
        com.google.android.gms.common.internal.bb.u(parcel, 8, this.f5296h);
        com.google.android.gms.common.internal.bb.u(parcel, 9, this.f5297i);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
        this.f5297i = null;
    }
}
