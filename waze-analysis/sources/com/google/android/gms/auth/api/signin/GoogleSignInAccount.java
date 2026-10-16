package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.bb;
import com.google.firebase.crashlytics.a.c.h;
import com.waze.strings.DisplayStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public class GoogleSignInAccount extends com.google.android.gms.common.internal.a.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new e(1);

    /* renamed from: a, reason: collision with root package name */
    final List f4570a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4571b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4572c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4573d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4574e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f4575f;

    /* renamed from: g, reason: collision with root package name */
    private String f4576g;

    /* renamed from: h, reason: collision with root package name */
    private final long f4577h;

    /* renamed from: i, reason: collision with root package name */
    private final String f4578i;

    /* renamed from: j, reason: collision with root package name */
    private final String f4579j;

    /* renamed from: k, reason: collision with root package name */
    private final String f4580k;

    /* renamed from: l, reason: collision with root package name */
    private final Set f4581l = new HashSet();

    GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List list, String str7, String str8) {
        this.f4571b = str;
        this.f4572c = str2;
        this.f4573d = str3;
        this.f4574e = str4;
        this.f4575f = uri;
        this.f4576g = str5;
        this.f4577h = j2;
        this.f4578i = str6;
        this.f4570a = list;
        this.f4579j = str7;
        this.f4580k = str8;
    }

    public static GoogleSignInAccount b(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j2 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        String strOptString2 = jSONObject.optString(TtmlNode.ATTR_ID);
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has(NotificationCompat.CATEGORY_EMAIL) ? jSONObject.optString(NotificationCompat.CATEGORY_EMAIL) : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        Long lValueOf = Long.valueOf(j2);
        String string = jSONObject.getString("obfuscatedIdentifier");
        lValueOf.getClass();
        av.k(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j2, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f4576g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final Account a() {
        String str = this.f4573d;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public final String c() {
        return this.f4578i;
    }

    public final String d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f4571b;
            if (str != null) {
                jSONObject.put(TtmlNode.ATTR_ID, str);
            }
            String str2 = this.f4572c;
            if (str2 != null) {
                jSONObject.put("tokenId", str2);
            }
            String str3 = this.f4573d;
            if (str3 != null) {
                jSONObject.put(NotificationCompat.CATEGORY_EMAIL, str3);
            }
            String str4 = this.f4574e;
            if (str4 != null) {
                jSONObject.put("displayName", str4);
            }
            String str5 = this.f4579j;
            if (str5 != null) {
                jSONObject.put("givenName", str5);
            }
            String str6 = this.f4580k;
            if (str6 != null) {
                jSONObject.put("familyName", str6);
            }
            Uri uri = this.f4575f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str7 = this.f4576g;
            if (str7 != null) {
                jSONObject.put("serverAuthCode", str7);
            }
            jSONObject.put("expirationTime", this.f4577h);
            jSONObject.put("obfuscatedIdentifier", this.f4578i);
            JSONArray jSONArray = new JSONArray();
            List list = this.f4570a;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new h(1));
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.a());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final Set e() {
        HashSet hashSet = new HashSet(this.f4570a);
        hashSet.addAll(this.f4581l);
        return hashSet;
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
        return googleSignInAccount.f4578i.equals(this.f4578i) && googleSignInAccount.e().equals(e());
    }

    public final int hashCode() {
        return ((this.f4578i.hashCode() + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + e().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.u(parcel, 2, this.f4571b);
        bb.u(parcel, 3, this.f4572c);
        bb.u(parcel, 4, this.f4573d);
        bb.u(parcel, 5, this.f4574e);
        bb.t(parcel, 6, this.f4575f, i2);
        bb.u(parcel, 7, this.f4576g);
        bb.h(parcel, 8, this.f4577h);
        bb.u(parcel, 9, this.f4578i);
        bb.y(parcel, 10, this.f4570a);
        bb.u(parcel, 11, this.f4579j);
        bb.u(parcel, 12, this.f4580k);
        bb.e(parcel, iD);
    }
}
