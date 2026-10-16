package J8;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzabj;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes4.dex */
public final class G extends com.moloco.sdk.internal.publisher.H {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5745b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0640o f5746c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0630e f5747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f5748e;

    public G(FirebaseAuth firebaseAuth, boolean z2, AbstractC0640o abstractC0640o, C0630e c0630e) {
        this.f5745b = z2;
        this.f5746c = abstractC0640o;
        this.f5747d = c0630e;
        this.f5748e = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [J8.h, K8.E] */
    @Override // com.moloco.sdk.internal.publisher.H
    public final Task y0(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        C0630e c0630e = this.f5747d;
        boolean z2 = this.f5745b;
        FirebaseAuth firebaseAuth = this.f5748e;
        if (!z2) {
            return firebaseAuth.f27287e.zza(firebaseAuth.f27283a, c0630e, str, (K8.J) new C0632g(firebaseAuth));
        }
        zzabj zzabjVar = firebaseAuth.f27287e;
        AbstractC0640o abstractC0640o = this.f5746c;
        AbstractC1732v.i(abstractC0640o);
        return zzabjVar.zzb(firebaseAuth.f27283a, abstractC0640o, c0630e, str, (K8.E) new C0633h(firebaseAuth, 0));
    }
}
