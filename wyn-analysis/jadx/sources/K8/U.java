package K8;

import a.AbstractC1304a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import f7.AbstractC2614a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class U extends AbstractC2614a implements J8.E {
    public static final Parcelable.Creator<U> CREATOR = new C0691c(1);

    /* renamed from: a, reason: collision with root package name */
    public String f6614a;

    /* renamed from: b, reason: collision with root package name */
    public String f6615b;

    /* renamed from: c, reason: collision with root package name */
    public String f6616c;

    /* renamed from: d, reason: collision with root package name */
    public String f6617d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f6618e;

    /* renamed from: f, reason: collision with root package name */
    public String f6619f;

    /* renamed from: g, reason: collision with root package name */
    public String f6620g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6621h;

    /* renamed from: i, reason: collision with root package name */
    public String f6622i;

    public U(String str, String str2, String str3, String str4, String str5, String str6, boolean z2, String str7) {
        this.f6614a = str;
        this.f6615b = str2;
        this.f6619f = str3;
        this.f6620g = str4;
        this.f6616c = str5;
        this.f6617d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f6618e = Uri.parse(str6);
        }
        this.f6621h = z2;
        this.f6622i = str7;
    }

    public static U V(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new U(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e7) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzzh(e7);
        }
    }

    @Override // J8.E
    public final String J() {
        return this.f6615b;
    }

    @Override // J8.E
    public final String Q() {
        return this.f6619f;
    }

    @Override // J8.E
    public final String getUid() {
        return this.f6614a;
    }

    @Override // J8.E
    public final String h() {
        return this.f6620g;
    }

    @Override // J8.E
    public final String o() {
        return this.f6616c;
    }

    @Override // J8.E
    public final Uri w() {
        String str = this.f6617d;
        if (!TextUtils.isEmpty(str) && this.f6618e == null) {
            this.f6618e = Uri.parse(str);
        }
        return this.f6618e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f6614a, false);
        AbstractC1304a.a0(parcel, 2, this.f6615b, false);
        AbstractC1304a.a0(parcel, 3, this.f6616c, false);
        AbstractC1304a.a0(parcel, 4, this.f6617d, false);
        AbstractC1304a.a0(parcel, 5, this.f6619f, false);
        AbstractC1304a.a0(parcel, 6, this.f6620g, false);
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeInt(this.f6621h ? 1 : 0);
        AbstractC1304a.a0(parcel, 8, this.f6622i, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    @Override // J8.E
    public final boolean z() {
        return this.f6621h;
    }

    public final String zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f6614a);
            jSONObject.putOpt("providerId", this.f6615b);
            jSONObject.putOpt("displayName", this.f6616c);
            jSONObject.putOpt("photoUrl", this.f6617d);
            jSONObject.putOpt("email", this.f6619f);
            jSONObject.putOpt("phoneNumber", this.f6620g);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f6621h));
            jSONObject.putOpt("rawUserInfo", this.f6622i);
            return jSONObject.toString();
        } catch (JSONException e7) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzzh(e7);
        }
    }
}
