package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.signin.internal.k;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.bb;
import com.google.firebase.remoteconfig.internal.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public class GoogleSignInOptions extends com.google.android.gms.common.internal.a.a implements ReflectedParcelable, f {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public static final Scope f4582a = new Scope("profile");

    /* renamed from: b, reason: collision with root package name */
    public static final Scope f4583b;

    /* renamed from: c, reason: collision with root package name */
    public static final Scope f4584c;

    /* renamed from: d, reason: collision with root package name */
    public static final Scope f4585d;

    /* renamed from: e, reason: collision with root package name */
    public static final GoogleSignInOptions f4586e;

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator f4587h;

    /* renamed from: f, reason: collision with root package name */
    final int f4588f;

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList f4589i;

    /* renamed from: j, reason: collision with root package name */
    private Account f4590j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4591k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f4592l;
    private final boolean m;
    private String n;
    private String o;
    private ArrayList p;
    private String q;

    static {
        new Scope(NotificationCompat.CATEGORY_EMAIL);
        f4583b = new Scope("openid");
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f4584c = scope;
        f4585d = new Scope("https://www.googleapis.com/auth/games");
        d dVar = new d();
        dVar.b();
        dVar.c();
        f4586e = dVar.a();
        d dVar2 = new d();
        dVar2.d(scope, new Scope[0]);
        dVar2.a();
        CREATOR = new e(0);
        f4587h = new c();
    }

    private GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this.f4588f = i2;
        this.f4589i = arrayList;
        this.f4590j = account;
        this.f4591k = z;
        this.f4592l = z2;
        this.m = z3;
        this.n = str;
        this.o = str2;
        this.p = new ArrayList(map.values());
        this.q = str3;
    }

    public static GoogleSignInOptions b(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map n(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                map.put(Integer.valueOf(kVar.a()), kVar);
            }
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b A[Catch: ClassCastException -> 0x007d, TryCatch #0 {ClassCastException -> 0x007d, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0017, B:12:0x0027, B:15:0x0032, B:17:0x0036, B:22:0x0043, B:24:0x004b, B:30:0x005f, B:32:0x0065, B:34:0x006b, B:36:0x0071, B:27:0x0054, B:20:0x003b), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054 A[Catch: ClassCastException -> 0x007d, TryCatch #0 {ClassCastException -> 0x007d, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0017, B:12:0x0027, B:15:0x0032, B:17:0x0036, B:22:0x0043, B:24:0x004b, B:30:0x005f, B:32:0x0065, B:34:0x006b, B:36:0x0071, B:27:0x0054, B:20:0x003b), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r5 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r5     // Catch: java.lang.ClassCastException -> L7d
            java.util.ArrayList r1 = r4.p     // Catch: java.lang.ClassCastException -> L7d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L7d
            if (r1 == 0) goto L7d
            java.util.ArrayList r1 = r5.p     // Catch: java.lang.ClassCastException -> L7d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L7d
            if (r1 != 0) goto L17
            goto L7d
        L17:
            java.util.ArrayList r1 = r4.f4589i     // Catch: java.lang.ClassCastException -> L7d
            int r2 = r1.size()     // Catch: java.lang.ClassCastException -> L7d
            java.util.ArrayList r3 = r5.i()     // Catch: java.lang.ClassCastException -> L7d
            int r3 = r3.size()     // Catch: java.lang.ClassCastException -> L7d
            if (r2 != r3) goto L7d
            java.util.ArrayList r2 = r5.i()     // Catch: java.lang.ClassCastException -> L7d
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L7d
            if (r1 != 0) goto L32
            goto L7d
        L32:
            android.accounts.Account r1 = r4.f4590j     // Catch: java.lang.ClassCastException -> L7d
            if (r1 != 0) goto L3b
            android.accounts.Account r1 = r5.f4590j     // Catch: java.lang.ClassCastException -> L7d
            if (r1 != 0) goto L7d
            goto L43
        L3b:
            android.accounts.Account r2 = r5.f4590j     // Catch: java.lang.ClassCastException -> L7d
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L7d
            if (r1 == 0) goto L7d
        L43:
            java.lang.String r1 = r4.n     // Catch: java.lang.ClassCastException -> L7d
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L7d
            if (r1 == 0) goto L54
            java.lang.String r1 = r5.n     // Catch: java.lang.ClassCastException -> L7d
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L7d
            if (r1 == 0) goto L7d
            goto L5f
        L54:
            java.lang.String r1 = r4.n     // Catch: java.lang.ClassCastException -> L7d
            java.lang.String r2 = r5.n     // Catch: java.lang.ClassCastException -> L7d
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L7d
            if (r1 != 0) goto L5f
            goto L7d
        L5f:
            boolean r1 = r4.m     // Catch: java.lang.ClassCastException -> L7d
            boolean r2 = r5.m     // Catch: java.lang.ClassCastException -> L7d
            if (r1 != r2) goto L7d
            boolean r1 = r4.f4591k     // Catch: java.lang.ClassCastException -> L7d
            boolean r2 = r5.f4591k     // Catch: java.lang.ClassCastException -> L7d
            if (r1 != r2) goto L7d
            boolean r1 = r4.f4592l     // Catch: java.lang.ClassCastException -> L7d
            boolean r2 = r5.f4592l     // Catch: java.lang.ClassCastException -> L7d
            if (r1 != r2) goto L7d
            java.lang.String r4 = r4.q     // Catch: java.lang.ClassCastException -> L7d
            java.lang.String r5 = r5.q     // Catch: java.lang.ClassCastException -> L7d
            boolean r4 = android.text.TextUtils.equals(r4, r5)     // Catch: java.lang.ClassCastException -> L7d
            if (r4 == 0) goto L7d
            r4 = 1
            return r4
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final String f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.f4589i;
            Collections.sort(arrayList, f4587h);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).a());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f4590j;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f4591k);
            jSONObject.put("forceCodeForRefreshToken", this.m);
            jSONObject.put("serverAuthRequested", this.f4592l);
            if (!TextUtils.isEmpty(this.n)) {
                jSONObject.put("serverClientId", this.n);
            }
            if (!TextUtils.isEmpty(this.o)) {
                jSONObject.put("hostedDomain", this.o);
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f4589i;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((Scope) arrayList2.get(i2)).a());
        }
        Collections.sort(arrayList);
        x xVar = new x(null);
        xVar.e(arrayList);
        xVar.e(this.f4590j);
        xVar.e(this.n);
        xVar.d(this.m);
        xVar.d(this.f4591k);
        xVar.d(this.f4592l);
        xVar.e(this.q);
        return xVar.c();
    }

    public final ArrayList i() {
        return new ArrayList(this.f4589i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.f4588f;
        int iD = bb.d(parcel);
        bb.g(parcel, 1, i3);
        bb.y(parcel, 2, i());
        bb.t(parcel, 3, this.f4590j, i2);
        bb.f(parcel, 4, this.f4591k);
        bb.f(parcel, 5, this.f4592l);
        bb.f(parcel, 6, this.m);
        bb.u(parcel, 7, this.n);
        bb.u(parcel, 8, this.o);
        bb.y(parcel, 9, this.p);
        bb.u(parcel, 10, this.q);
        bb.e(parcel, iD);
    }

    GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList arrayList2, String str3) {
        this(i2, arrayList, account, z, z2, z3, str, str2, n(arrayList2), str3);
    }

    /* synthetic */ GoogleSignInOptions(ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this(3, arrayList, account, z, z2, z3, str, str2, map, str3);
    }
}
