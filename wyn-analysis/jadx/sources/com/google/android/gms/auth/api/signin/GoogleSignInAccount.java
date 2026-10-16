package com.google.android.gms.auth.api.signin;

import a.AbstractC1304a;
import a7.C1338d;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes3.dex */
public class GoogleSignInAccount extends AbstractC2614a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C1338d(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f26380a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26381b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26382c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26383d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26384e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f26385f;

    /* renamed from: g, reason: collision with root package name */
    public String f26386g;

    /* renamed from: h, reason: collision with root package name */
    public final long f26387h;

    /* renamed from: i, reason: collision with root package name */
    public final String f26388i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f26389j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final String f26390l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f26391m = new HashSet();

    public GoogleSignInAccount(int i5, String str, String str2, String str3, String str4, Uri uri, String str5, long j8, String str6, ArrayList arrayList, String str7, String str8) {
        this.f26380a = i5;
        this.f26381b = str;
        this.f26382c = str2;
        this.f26383d = str3;
        this.f26384e = str4;
        this.f26385f = uri;
        this.f26386g = str5;
        this.f26387h = j8;
        this.f26388i = str6;
        this.f26389j = arrayList;
        this.k = str7;
        this.f26390l = str8;
    }

    public static GoogleSignInAccount V(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j8 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i5 = 0; i5 < length; i5++) {
            hashSet.add(new Scope(1, jSONArray.getString(i5)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        AbstractC1732v.f(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j8, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f26386g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f26388i.equals(this.f26388i)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f26389j);
        hashSet.addAll(googleSignInAccount.f26391m);
        HashSet hashSet2 = new HashSet(this.f26389j);
        hashSet2.addAll(this.f26391m);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f26388i.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f26389j);
        hashSet.addAll(this.f26391m);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f26380a);
        AbstractC1304a.a0(parcel, 2, this.f26381b, false);
        AbstractC1304a.a0(parcel, 3, this.f26382c, false);
        AbstractC1304a.a0(parcel, 4, this.f26383d, false);
        AbstractC1304a.a0(parcel, 5, this.f26384e, false);
        AbstractC1304a.Z(parcel, 6, this.f26385f, i5, false);
        AbstractC1304a.a0(parcel, 7, this.f26386g, false);
        AbstractC1304a.k0(parcel, 8, 8);
        parcel.writeLong(this.f26387h);
        AbstractC1304a.a0(parcel, 9, this.f26388i, false);
        AbstractC1304a.e0(parcel, 10, this.f26389j, false);
        AbstractC1304a.a0(parcel, 11, this.k, false);
        AbstractC1304a.a0(parcel, 12, this.f26390l, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
