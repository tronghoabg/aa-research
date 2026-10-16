package K8;

import android.app.Activity;
import android.content.res.AssetManager;
import cb.AbstractC1593a;
import com.google.android.gms.internal.p002firebaseauthapi.zzagm;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final /* synthetic */ class A implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public String f6560a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6561b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6562c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6563d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6564e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6565f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6566g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6567h;

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e7) {
            String message = e7.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((i3.a) this.f6563d).d();
            return null;
        }
    }

    public void b(int i5, Serializable serializable) {
        ((Executor) this.f6562c).execute(new Mb.b(this, i5, serializable, 5));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean z2;
        C0690b c0690b = (C0690b) this.f6562c;
        c0690b.getClass();
        if (!task.isSuccessful()) {
            AbstractC1593a.t("Failed to initialize reCAPTCHA config: ", task.getException().getMessage(), "b");
        }
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f6564e;
        C6.l lVarN = firebaseAuth.n();
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f6563d;
        String str = this.f6560a;
        Activity activity = (Activity) this.f6566g;
        boolean z10 = this.f6561b;
        F f10 = (F) this.f6567h;
        if (lVarN != null) {
            C6.l lVarN2 = firebaseAuth.n();
            synchronized (lVarN2.f1844a) {
                try {
                    zzagm zzagmVar = (zzagm) lVarN2.f1846c;
                    z2 = zzagmVar != null && zzagmVar.zzc("PHONE_PROVIDER");
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                firebaseAuth.n().H(firebaseAuth.b(), Boolean.FALSE, (RecaptchaAction) this.f6565f).addOnSuccessListener(new G(0, taskCompletionSource)).addOnFailureListener(new H(c0690b, firebaseAuth, str, activity, z10, f10, taskCompletionSource));
                return;
            }
        }
        c0690b.c(firebaseAuth, str, activity, z10, false, f10, taskCompletionSource);
    }
}
