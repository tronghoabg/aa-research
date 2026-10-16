package J8;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzal;
import com.google.android.gms.internal.p002firebaseauthapi.zzao;
import com.unity3d.ads.metadata.MediationMetaData;
import f7.AbstractC2614a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class H extends AbstractC2614a {
    public static final Parcelable.Creator<H> CREATOR = new I2.d(10);

    /* renamed from: a, reason: collision with root package name */
    public final String f5749a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5750b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5751c;

    public H(String str, String str2, String str3) {
        this.f5749a = str;
        this.f5750b = str2;
        this.f5751c = str3;
    }

    public static final H V(JSONObject jSONObject) {
        return new H(jSONObject.getString("credentialId"), jSONObject.getString(MediationMetaData.KEY_NAME), jSONObject.getString("displayName"));
    }

    public static zzal W(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzal.zza(new ArrayList());
        }
        zzao zzaoVarZzg = zzal.zzg();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i5);
            zzaoVarZzg.zza(new H(jSONObject.getString("credentialId"), jSONObject.getString(MediationMetaData.KEY_NAME), jSONObject.getString("displayName")));
        }
        return zzaoVarZzg.zza();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f5749a, false);
        AbstractC1304a.a0(parcel, 2, this.f5750b, false);
        AbstractC1304a.a0(parcel, 3, this.f5751c, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
