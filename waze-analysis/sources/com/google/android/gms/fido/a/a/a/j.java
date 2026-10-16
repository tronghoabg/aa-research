package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<j> CREATOR = new e(2, null);

    /* renamed from: a, reason: collision with root package name */
    private final be f5406a;

    /* renamed from: b, reason: collision with root package name */
    private final l f5407b;

    /* renamed from: c, reason: collision with root package name */
    private final k f5408c;

    /* renamed from: d, reason: collision with root package name */
    private final m f5409d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5410e;

    j(be beVar, l lVar, k kVar, m mVar, String str) {
        this.f5406a = beVar;
        this.f5407b = lVar;
        this.f5408c = kVar;
        this.f5409d = mVar;
        this.f5410e = str;
    }

    public final JSONObject a() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            k kVar = this.f5408c;
            if (kVar != null) {
                jSONObject.put("credProps", kVar.a());
            }
            be beVar = this.f5406a;
            if (beVar != null) {
                jSONObject.put("uvm", beVar.a());
            }
            m mVar = this.f5409d;
            if (mVar != null) {
                jSONObject.put("prf", mVar.a());
            }
            String str = this.f5410e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Objects.equals(this.f5406a, jVar.f5406a) && Objects.equals(this.f5407b, jVar.f5407b) && Objects.equals(this.f5408c, jVar.f5408c) && Objects.equals(this.f5409d, jVar.f5409d) && Objects.equals(this.f5410e, jVar.f5410e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5406a, this.f5407b, this.f5408c, this.f5409d, this.f5410e});
    }

    public final String toString() {
        return "AuthenticationExtensionsClientOutputs{" + a().toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        be beVar = this.f5406a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.t(parcel, 1, beVar, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 2, this.f5407b, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 3, this.f5408c, i2);
        com.google.android.gms.common.internal.bb.t(parcel, 4, this.f5409d, i2);
        com.google.android.gms.common.internal.bb.u(parcel, 5, this.f5410e);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
