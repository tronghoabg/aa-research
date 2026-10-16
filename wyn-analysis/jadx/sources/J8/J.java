package J8;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes4.dex */
public final class J extends x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f5759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K8.K f5760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f5761c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f5762d;

    public J(FirebaseAuth firebaseAuth, v vVar, K8.K k, x xVar) {
        this.f5759a = vVar;
        this.f5760b = k;
        this.f5761c = xVar;
        this.f5762d = firebaseAuth;
    }

    @Override // J8.x
    public final void onCodeAutoRetrievalTimeOut(String str) {
        this.f5761c.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // J8.x
    public final void onCodeSent(String str, w wVar) {
        this.f5761c.onCodeSent(str, wVar);
    }

    @Override // J8.x
    public final void onVerificationCompleted(u uVar) {
        this.f5761c.onVerificationCompleted(uVar);
    }

    @Override // J8.x
    public final void onVerificationFailed(s8.j jVar) {
        boolean zZza = zzadg.zza(jVar);
        v vVar = this.f5759a;
        if (zZza) {
            vVar.f5831j = true;
            Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number " + vVar.f5826e);
            FirebaseAuth.j(vVar);
            return;
        }
        K8.K k = this.f5760b;
        boolean zIsEmpty = TextUtils.isEmpty(k.f6594c);
        x xVar = this.f5761c;
        if (zIsEmpty) {
            Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + vVar.f5826e + ", error - " + jVar.getMessage());
            xVar.onVerificationFailed(jVar);
            return;
        }
        if (zzadg.zzb(jVar) && this.f5762d.n().I() && TextUtils.isEmpty(k.f6593b)) {
            vVar.k = true;
            Log.d("FirebaseAuth", "Re-triggering phone verification with non-reCAPTCHA Enterprise flow for phone number " + vVar.f5826e);
            FirebaseAuth.j(vVar);
            return;
        }
        Log.d("FirebaseAuth", "Invoking original failure callbacks after reCAPTCHA Enterprise + phone verification failure for " + vVar.f5826e + ", error - " + jVar.getMessage());
        xVar.onVerificationFailed(jVar);
    }
}
