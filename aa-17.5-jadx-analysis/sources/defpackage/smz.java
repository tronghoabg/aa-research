package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class smz extends svh implements slb, slc {
    private static final omc h = svf.a;
    public final Context a;
    public final Handler b;
    public final Set c;
    public final snr d;
    public svj e;
    public smg f;
    public final omc g;

    public smz(Context context, Handler handler, snr snrVar) {
        omc omcVar = h;
        this.a = context;
        this.b = handler;
        this.d = snrVar;
        this.c = snrVar.b;
        this.g = omcVar;
    }

    @Override // defpackage.slz
    public final void a(Bundle bundle) throws JSONException, NumberFormatException {
        GoogleSignInAccount googleSignInAccount;
        svj svjVar = this.e;
        try {
            Account account = svjVar.a.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                Context context = svjVar.b;
                qpe.a.lock();
                try {
                    if (qpe.b == null) {
                        qpe.b = new qpe(context.getApplicationContext());
                    }
                    qpe qpeVar = qpe.b;
                    qpe.a.unlock();
                    String strA = qpeVar.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        String strA2 = qpeVar.a("googleSignInAccount:" + strA);
                        if (strA2 != null) {
                            try {
                                if (!TextUtils.isEmpty(strA2)) {
                                    JSONObject jSONObject = new JSONObject(strA2);
                                    String strOptString = jSONObject.optString("photoUrl");
                                    Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
                                    long j = Long.parseLong(jSONObject.getString("expirationTime"));
                                    HashSet hashSet = new HashSet();
                                    JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                                    int i = 0;
                                    for (int length = jSONArray.length(); i < length; length = length) {
                                        hashSet.add(new Scope(1, jSONArray.getString(i)));
                                        i++;
                                    }
                                    String strOptString2 = jSONObject.optString("id");
                                    String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
                                    String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
                                    String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
                                    String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
                                    String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
                                    Long lValueOf = Long.valueOf(j);
                                    String string = jSONObject.getString("obfuscatedIdentifier");
                                    lValueOf.getClass();
                                    spu.at(string);
                                    googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
                                    googleSignInAccount.f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    googleSignInAccount = null;
                } catch (Throwable th) {
                    qpe.a.unlock();
                    throw th;
                }
            } else {
                googleSignInAccount = null;
            }
            Integer num = svjVar.x;
            spu.aw(num);
            ResolveAccountRequest resolveAccountRequest = new ResolveAccountRequest(2, account, num.intValue(), googleSignInAccount);
            svi sviVar = (svi) svjVar.v();
            SignInRequest signInRequest = new SignInRequest(1, resolveAccountRequest);
            Parcel parcelGh = sviVar.gh();
            ijp.g(parcelGh, signInRequest);
            ijp.i(parcelGh, this);
            sviVar.gj(12, parcelGh);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                c(new SignInResponse(1, new ConnectionResult(1, 8, null, null, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.slz
    public final void b(int i) {
        smg smgVar = this.f;
        sme smeVar = (sme) smgVar.e.k.get(smgVar.b);
        if (smeVar != null) {
            if (smeVar.g) {
                smeVar.l(new ConnectionResult(1, 17, null, null, null));
            } else {
                smeVar.b(i);
            }
        }
    }

    @Override // defpackage.svh
    public final void c(SignInResponse signInResponse) {
        this.b.post(new sbj(this, signInResponse, 8, (char[]) null));
    }

    @Override // defpackage.smu
    public final void i(ConnectionResult connectionResult) {
        this.f.b(connectionResult);
    }
}
