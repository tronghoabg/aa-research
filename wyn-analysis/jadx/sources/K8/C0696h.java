package K8;

import J8.C0632g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: K8.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0696h {

    /* renamed from: a, reason: collision with root package name */
    public final C0693e f6645a;

    public C0696h(C0693e c0693e) {
        this.f6645a = c0693e;
    }

    public final Task a(J8.s sVar, String str) {
        AbstractC1732v.i(sVar);
        C0693e c0693e = this.f6645a;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(s8.g.f(c0693e.f6629c));
        firebaseAuth.getClass();
        if (sVar instanceof J8.y) {
            C0632g c0632g = new C0632g(firebaseAuth);
            return firebaseAuth.f27287e.zza(firebaseAuth.f27283a, (J8.y) sVar, c0693e, str, c0632g);
        }
        if (!(sVar instanceof J8.B)) {
            return Tasks.forException(zzadg.zza(new Status(17499, null, null, null)));
        }
        String str2 = firebaseAuth.k;
        C0632g c0632g2 = new C0632g(firebaseAuth);
        return firebaseAuth.f27287e.zza(firebaseAuth.f27283a, (J8.B) sVar, c0693e, str, str2, c0632g2);
    }
}
