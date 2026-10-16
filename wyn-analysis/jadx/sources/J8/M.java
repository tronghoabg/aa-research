package J8;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes4.dex */
public final class M extends com.moloco.sdk.internal.publisher.H {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5770c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0627b f5771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f5772e;

    public /* synthetic */ M(FirebaseAuth firebaseAuth, String str, C0627b c0627b, int i5) {
        this.f5769b = i5;
        this.f5770c = str;
        this.f5771d = c0627b;
        this.f5772e = firebaseAuth;
    }

    @Override // com.moloco.sdk.internal.publisher.H
    public final Task y0(String str) {
        switch (this.f5769b) {
            case 0:
                boolean zIsEmpty = TextUtils.isEmpty(str);
                String str2 = this.f5770c;
                if (zIsEmpty) {
                    Log.i("FirebaseAuth", "Email link sign in for " + str2 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for email link sign in for " + str2);
                }
                FirebaseAuth firebaseAuth = this.f5772e;
                return firebaseAuth.f27287e.zzb(firebaseAuth.f27283a, this.f5770c, this.f5771d, firebaseAuth.k, str);
            default:
                boolean zIsEmpty2 = TextUtils.isEmpty(str);
                String str3 = this.f5770c;
                if (zIsEmpty2) {
                    Log.i("FirebaseAuth", "Password reset request " + str3 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for password reset of email " + str3);
                }
                FirebaseAuth firebaseAuth2 = this.f5772e;
                return firebaseAuth2.f27287e.zza(firebaseAuth2.f27283a, this.f5770c, this.f5771d, firebaseAuth2.k, str);
        }
    }
}
