package b7;

import a7.C1337c;
import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f19369c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static b f19370d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f19371a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f19372b;

    public b(Context context) {
        this.f19372b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static b a(Context context) {
        AbstractC1732v.i(context);
        ReentrantLock reentrantLock = f19369c;
        reentrantLock.lock();
        try {
            if (f19370d == null) {
                f19370d = new b(context.getApplicationContext());
            }
            b bVar = f19370d;
            reentrantLock.unlock();
            return bVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String f(String str, String str2) {
        return N0.a.g(str, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, str2);
    }

    public final GoogleSignInAccount b() {
        String strD;
        String strD2 = d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strD2) || (strD = d(f("googleSignInAccount", strD2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.V(strD);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void c(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) throws JSONException {
        AbstractC1732v.i(googleSignInAccount);
        AbstractC1732v.i(googleSignInOptions);
        String str = googleSignInAccount.f26388i;
        e("defaultGoogleSignInAccount", str);
        String strF = f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f26381b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f26382c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f26383d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f26384e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.k;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f26390l;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f26385f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f26386g;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f26387h);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = googleSignInAccount.f26389j;
            Scope[] scopeArr = (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
            Arrays.sort(scopeArr, C1337c.f17394b);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f26423b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            e(strF, jSONObject.toString());
            String strF2 = f("googleSignInOptions", str);
            String str9 = googleSignInOptions.f26405h;
            String str10 = googleSignInOptions.f26404g;
            ArrayList arrayList2 = googleSignInOptions.f26399b;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList2, GoogleSignInOptions.f26397q);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f26423b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f26400c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f26401d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f26403f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f26402e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                e(strF2, jSONObject2.toString());
            } catch (JSONException e7) {
                throw new RuntimeException(e7);
            }
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final String d(String str) {
        ReentrantLock reentrantLock = this.f19371a;
        reentrantLock.lock();
        try {
            return this.f19372b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(String str, String str2) {
        ReentrantLock reentrantLock = this.f19371a;
        reentrantLock.lock();
        try {
            this.f19372b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
