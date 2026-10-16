package K8;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzagh;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class I implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntegrityManager f6590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0690b f6591c;

    public I(C0690b c0690b, String str, IntegrityManager integrityManager) {
        this.f6589a = str;
        this.f6590b = integrityManager;
        this.f6591c = c0690b;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            this.f6591c.f6625b = ((zzagh) task.getResult()).zza();
            return this.f6590b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(((zzagh) task.getResult()).zza())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f6589a.getBytes("UTF-8")), 11))).build());
        }
        Log.e("b", "Problem retrieving Play Integrity producer project:  " + task.getException().getMessage());
        return Tasks.forException(task.getException());
    }
}
