package J8;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class z extends t {
    public static final Parcelable.Creator<z> CREATOR = new I2.d(12);

    /* renamed from: a, reason: collision with root package name */
    public final String f5833a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5834b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5835c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5836d;

    public z(long j8, String str, String str2, String str3) {
        AbstractC1732v.f(str);
        this.f5833a = str;
        this.f5834b = str2;
        this.f5835c = j8;
        AbstractC1732v.f(str3);
        this.f5836d = str3;
    }

    public static z Y(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
        }
        return new z(jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optString("phoneNumber"));
    }

    @Override // J8.t
    public final long V() {
        return this.f5835c;
    }

    @Override // J8.t
    public final String W() {
        return "phone";
    }

    @Override // J8.t
    public final JSONObject X() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f5833a);
            jSONObject.putOpt("displayName", this.f5834b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f5835c));
            jSONObject.putOpt("phoneNumber", this.f5836d);
            return jSONObject;
        } catch (JSONException e7) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzzh(e7);
        }
    }

    @Override // J8.t
    public final String getUid() {
        return this.f5833a;
    }

    @Override // J8.t
    public final String o() {
        return this.f5834b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f5833a, false);
        AbstractC1304a.a0(parcel, 2, this.f5834b, false);
        AbstractC1304a.k0(parcel, 3, 8);
        parcel.writeLong(this.f5835c);
        AbstractC1304a.a0(parcel, 4, this.f5836d, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
