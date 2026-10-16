package J8;

import K8.C0693e;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.firebase.auth.FirebaseAuth;
import org.json.JSONException;

/* renamed from: J8.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0632g implements K8.J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f5804a;

    public C0632g(FirebaseAuth firebaseAuth) {
        this.f5804a = firebaseAuth;
    }

    @Override // K8.J
    public final void a(zzagl zzaglVar, AbstractC0640o abstractC0640o) throws JSONException {
        AbstractC1732v.i(zzaglVar);
        AbstractC1732v.i(abstractC0640o);
        ((C0693e) abstractC0640o).f6627a = zzaglVar;
        FirebaseAuth firebaseAuth = this.f5804a;
        firebaseAuth.getClass();
        FirebaseAuth.l(firebaseAuth, abstractC0640o, zzaglVar, true, false);
    }
}
