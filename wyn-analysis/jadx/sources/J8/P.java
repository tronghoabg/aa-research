package J8;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzabj;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes4.dex */
public final class P extends com.moloco.sdk.internal.publisher.H {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5778c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0640o f5779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f5780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f5781f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f5782g;

    public P(FirebaseAuth firebaseAuth, String str, boolean z2, AbstractC0640o abstractC0640o, String str2, String str3) {
        this.f5777b = str;
        this.f5778c = z2;
        this.f5779d = abstractC0640o;
        this.f5780e = str2;
        this.f5781f = str3;
        this.f5782g = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [J8.h, K8.E] */
    @Override // com.moloco.sdk.internal.publisher.H
    public final Task y0(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String str2 = this.f5777b;
        if (zIsEmpty) {
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + str2);
        }
        boolean z2 = this.f5778c;
        FirebaseAuth firebaseAuth = this.f5782g;
        if (!z2) {
            return firebaseAuth.f27287e.zzb(firebaseAuth.f27283a, this.f5777b, this.f5780e, this.f5781f, str, new C0632g(firebaseAuth));
        }
        zzabj zzabjVar = firebaseAuth.f27287e;
        AbstractC0640o abstractC0640o = this.f5779d;
        AbstractC1732v.i(abstractC0640o);
        return zzabjVar.zzb(firebaseAuth.f27283a, abstractC0640o, this.f5777b, this.f5780e, this.f5781f, str, new C0633h(firebaseAuth, 0));
    }
}
