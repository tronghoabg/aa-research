package com.google.android.gms.auth.api.signin;

import a.AbstractC1304a;
import a7.C1337c;
import a7.C1338d;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b7.C1518a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes3.dex */
public class GoogleSignInOptions extends AbstractC2614a implements e, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions k;

    /* renamed from: l, reason: collision with root package name */
    public static final GoogleSignInOptions f26392l;

    /* renamed from: m, reason: collision with root package name */
    public static final Scope f26393m;

    /* renamed from: n, reason: collision with root package name */
    public static final Scope f26394n;

    /* renamed from: o, reason: collision with root package name */
    public static final Scope f26395o;

    /* renamed from: p, reason: collision with root package name */
    public static final Scope f26396p;

    /* renamed from: q, reason: collision with root package name */
    public static final C1337c f26397q;

    /* renamed from: a, reason: collision with root package name */
    public final int f26398a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f26399b;

    /* renamed from: c, reason: collision with root package name */
    public final Account f26400c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26401d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26402e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f26403f;

    /* renamed from: g, reason: collision with root package name */
    public final String f26404g;

    /* renamed from: h, reason: collision with root package name */
    public final String f26405h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f26406i;

    /* renamed from: j, reason: collision with root package name */
    public final String f26407j;

    static {
        Scope scope = new Scope(1, "profile");
        f26393m = new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f26394n = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f26395o = scope3;
        f26396p = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f26396p)) {
            Scope scope4 = f26395o;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        k = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f26396p)) {
            Scope scope5 = f26395o;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        f26392l = new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new C1338d(1);
        f26397q = new C1337c(1);
    }

    public GoogleSignInOptions(int i5, ArrayList arrayList, Account account, boolean z2, boolean z10, boolean z11, String str, String str2, HashMap map, String str3) {
        this.f26398a = i5;
        this.f26399b = arrayList;
        this.f26400c = account;
        this.f26401d = z2;
        this.f26402e = z10;
        this.f26403f = z11;
        this.f26404g = str;
        this.f26405h = str2;
        this.f26406i = new ArrayList(map.values());
        this.f26407j = str3;
    }

    public static GoogleSignInOptions W(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i5 = 0; i5 < length; i5++) {
            hashSet.add(new Scope(1, jSONArray.getString(i5)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap X(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1518a c1518a = (C1518a) it.next();
                map.put(Integer.valueOf(c1518a.f19367b), c1518a);
            }
        }
        return map;
    }

    public final ArrayList V() {
        return new ArrayList(this.f26399b);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b A[Catch: ClassCastException -> 0x0077, TryCatch #0 {ClassCastException -> 0x0077, blocks: (B:5:0x0008, B:7:0x0016, B:10:0x001f, B:12:0x002d, B:15:0x0038, B:21:0x0045, B:23:0x004b, B:29:0x0059, B:31:0x005f, B:33:0x0065, B:35:0x006b, B:26:0x0052, B:19:0x003f), top: B:41:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052 A[Catch: ClassCastException -> 0x0077, TryCatch #0 {ClassCastException -> 0x0077, blocks: (B:5:0x0008, B:7:0x0016, B:10:0x001f, B:12:0x002d, B:15:0x0038, B:21:0x0045, B:23:0x004b, B:29:0x0059, B:31:0x005f, B:33:0x0065, B:35:0x006b, B:26:0x0052, B:19:0x003f), top: B:41:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.f26404g
            java.util.ArrayList r1 = r7.f26399b
            r2 = 0
            if (r8 != 0) goto L8
            return r2
        L8:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r8 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r8     // Catch: java.lang.ClassCastException -> L77
            java.lang.String r3 = r8.f26404g     // Catch: java.lang.ClassCastException -> L77
            android.accounts.Account r4 = r8.f26400c     // Catch: java.lang.ClassCastException -> L77
            java.util.ArrayList r5 = r7.f26406i     // Catch: java.lang.ClassCastException -> L77
            boolean r5 = r5.isEmpty()     // Catch: java.lang.ClassCastException -> L77
            if (r5 == 0) goto L77
            java.util.ArrayList r5 = r8.f26406i     // Catch: java.lang.ClassCastException -> L77
            boolean r5 = r5.isEmpty()     // Catch: java.lang.ClassCastException -> L77
            if (r5 != 0) goto L1f
            goto L77
        L1f:
            int r5 = r1.size()     // Catch: java.lang.ClassCastException -> L77
            java.util.ArrayList r6 = r8.V()     // Catch: java.lang.ClassCastException -> L77
            int r6 = r6.size()     // Catch: java.lang.ClassCastException -> L77
            if (r5 != r6) goto L77
            java.util.ArrayList r5 = r8.V()     // Catch: java.lang.ClassCastException -> L77
            boolean r1 = r1.containsAll(r5)     // Catch: java.lang.ClassCastException -> L77
            if (r1 != 0) goto L38
            goto L77
        L38:
            android.accounts.Account r1 = r7.f26400c     // Catch: java.lang.ClassCastException -> L77
            if (r1 != 0) goto L3f
            if (r4 != 0) goto L77
            goto L45
        L3f:
            boolean r1 = r1.equals(r4)     // Catch: java.lang.ClassCastException -> L77
            if (r1 == 0) goto L77
        L45:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.ClassCastException -> L77
            if (r1 == 0) goto L52
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.ClassCastException -> L77
            if (r0 == 0) goto L77
            goto L59
        L52:
            boolean r0 = r0.equals(r3)     // Catch: java.lang.ClassCastException -> L77
            if (r0 != 0) goto L59
            goto L77
        L59:
            boolean r0 = r7.f26403f     // Catch: java.lang.ClassCastException -> L77
            boolean r1 = r8.f26403f     // Catch: java.lang.ClassCastException -> L77
            if (r0 != r1) goto L77
            boolean r0 = r7.f26401d     // Catch: java.lang.ClassCastException -> L77
            boolean r1 = r8.f26401d     // Catch: java.lang.ClassCastException -> L77
            if (r0 != r1) goto L77
            boolean r0 = r7.f26402e     // Catch: java.lang.ClassCastException -> L77
            boolean r1 = r8.f26402e     // Catch: java.lang.ClassCastException -> L77
            if (r0 != r1) goto L77
            java.lang.String r0 = r7.f26407j     // Catch: java.lang.ClassCastException -> L77
            java.lang.String r8 = r8.f26407j     // Catch: java.lang.ClassCastException -> L77
            boolean r8 = android.text.TextUtils.equals(r0, r8)     // Catch: java.lang.ClassCastException -> L77
            if (r8 == 0) goto L77
            r8 = 1
            return r8
        L77:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f26399b;
        int size = arrayList2.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(((Scope) arrayList2.get(i5)).f26423b);
        }
        Collections.sort(arrayList);
        int iHashCode = arrayList.hashCode() + (1 * 31);
        Account account = this.f26400c;
        int iHashCode2 = (iHashCode * 31) + (account == null ? 0 : account.hashCode());
        String str = this.f26404g;
        int iHashCode3 = (((((((iHashCode2 * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.f26403f ? 1 : 0)) * 31) + (this.f26401d ? 1 : 0)) * 31) + (this.f26402e ? 1 : 0);
        String str2 = this.f26407j;
        return (iHashCode3 * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f26398a);
        AbstractC1304a.e0(parcel, 2, V(), false);
        AbstractC1304a.Z(parcel, 3, this.f26400c, i5, false);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f26401d ? 1 : 0);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f26402e ? 1 : 0);
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeInt(this.f26403f ? 1 : 0);
        AbstractC1304a.a0(parcel, 7, this.f26404g, false);
        AbstractC1304a.a0(parcel, 8, this.f26405h, false);
        AbstractC1304a.e0(parcel, 9, this.f26406i, false);
        AbstractC1304a.a0(parcel, 10, this.f26407j, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
