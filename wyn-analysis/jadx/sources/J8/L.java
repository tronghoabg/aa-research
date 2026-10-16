package J8;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes4.dex */
public final class L extends com.moloco.sdk.internal.publisher.H {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f5766c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5768e;

    public /* synthetic */ L(FirebaseAuth firebaseAuth, Object obj, Object obj2, int i5) {
        this.f5765b = i5;
        this.f5767d = obj;
        this.f5768e = obj2;
        this.f5766c = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [J8.h, K8.E] */
    @Override // com.moloco.sdk.internal.publisher.H
    public final Task y0(String str) {
        switch (this.f5765b) {
            case 0:
                boolean zIsEmpty = TextUtils.isEmpty(str);
                String str2 = (String) this.f5767d;
                if (zIsEmpty) {
                    Log.i("FirebaseAuth", "Creating user with " + str2 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for sign up with email " + str2);
                }
                FirebaseAuth firebaseAuth = this.f5766c;
                return firebaseAuth.f27287e.zza(firebaseAuth.f27283a, (String) this.f5767d, (String) this.f5768e, firebaseAuth.k, str, new C0632g(firebaseAuth));
            default:
                if (TextUtils.isEmpty(str)) {
                    Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
                }
                FirebaseAuth firebaseAuth2 = this.f5766c;
                return firebaseAuth2.f27287e.zza(firebaseAuth2.f27283a, (AbstractC0640o) this.f5767d, (AbstractC0629d) this.f5768e, str, (K8.E) new C0633h(firebaseAuth2, 0));
        }
    }
}
