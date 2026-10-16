package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<k> CREATOR = new com.google.android.gms.auth.api.identity.n(11);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5411a;

    public k(boolean z) {
        this.f5411a = z;
    }

    public final JSONObject a() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rk", this.f5411a);
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e2);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k) && this.f5411a == ((k) obj).f5411a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f5411a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        boolean z = this.f5411a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.f(parcel, 1, z);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
