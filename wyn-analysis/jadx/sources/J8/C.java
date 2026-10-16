package J8;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzahp;
import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class C extends t {
    public static final Parcelable.Creator<C> CREATOR = new I2.d(14);

    /* renamed from: a, reason: collision with root package name */
    public final String f5734a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5735b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5736c;

    /* renamed from: d, reason: collision with root package name */
    public final zzahp f5737d;

    public C(String str, String str2, long j8, zzahp zzahpVar) {
        AbstractC1732v.f(str);
        this.f5734a = str;
        this.f5735b = str2;
        this.f5736c = j8;
        AbstractC1732v.j(zzahpVar, "totpInfo cannot be null.");
        this.f5737d = zzahpVar;
    }

    public static C Y(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long jOptLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new C(jSONObject.optString("uid"), jSONObject.optString("displayName"), jOptLong, new zzahp());
    }

    @Override // J8.t
    public final long V() {
        return this.f5736c;
    }

    @Override // J8.t
    public final String W() {
        return "totp";
    }

    @Override // J8.t
    public final JSONObject X() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f5734a);
            jSONObject.putOpt("displayName", this.f5735b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f5736c));
            jSONObject.putOpt("totpInfo", this.f5737d);
            return jSONObject;
        } catch (JSONException e7) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzzh(e7);
        }
    }

    @Override // J8.t
    public final String getUid() {
        return this.f5734a;
    }

    @Override // J8.t
    public final String o() {
        return this.f5735b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f5734a, false);
        AbstractC1304a.a0(parcel, 2, this.f5735b, false);
        AbstractC1304a.k0(parcel, 3, 8);
        parcel.writeLong(this.f5736c);
        AbstractC1304a.Z(parcel, 4, this.f5737d, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
