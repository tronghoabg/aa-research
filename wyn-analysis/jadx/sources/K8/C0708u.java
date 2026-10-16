package K8;

import android.net.Uri;
import android.util.Log;
import cb.AbstractC1593a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.internal.RecaptchaActivity;

/* renamed from: K8.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0708u implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6678a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Uri f6679b;

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f6678a) {
            case 0:
                F f10 = GenericIdpActivity.f27309d;
                Uri.Builder builderBuildUpon = this.f6679b.buildUpon();
                if (task.isSuccessful()) {
                    C8.c cVar = (C8.c) task.getResult();
                    s8.j jVar = cVar.f1911b;
                    if (jVar != null) {
                        Log.w("GenericIdpActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(jVar)));
                    }
                    builderBuildUpon.fragment("fac=" + cVar.f1910a);
                } else {
                    AbstractC1593a.t("Unexpected error getting App Check token: ", task.getException().getMessage(), "GenericIdpActivity");
                }
                return builderBuildUpon.build();
            default:
                F f11 = RecaptchaActivity.f27312d;
                Uri.Builder builderBuildUpon2 = this.f6679b.buildUpon();
                if (task.isSuccessful()) {
                    C8.c cVar2 = (C8.c) task.getResult();
                    s8.j jVar2 = cVar2.f1911b;
                    if (jVar2 != null) {
                        Log.w("RecaptchaActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(jVar2)));
                    }
                    builderBuildUpon2.fragment("fac=" + cVar2.f1910a);
                } else {
                    AbstractC1593a.t("Unexpected error getting App Check token: ", task.getException().getMessage(), "RecaptchaActivity");
                }
                return builderBuildUpon2.build();
        }
    }
}
