package J8;

import K8.C0700l;
import K8.InterfaceC0701m;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes4.dex */
public final class N implements InterfaceC0701m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0640o f5773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f5774b;

    public N(FirebaseAuth firebaseAuth, AbstractC0640o abstractC0640o) {
        this.f5773a = abstractC0640o;
        this.f5774b = firebaseAuth;
    }

    @Override // K8.InterfaceC0702n
    public final void zza(Status status) {
        int i5 = status.f26429a;
        if (i5 == 17011 || i5 == 17021 || i5 == 17005) {
            FirebaseAuth firebaseAuth = this.f5774b;
            firebaseAuth.q();
            K8.z zVar = firebaseAuth.f27305x;
            if (zVar != null) {
                C0700l c0700l = zVar.f6688b;
                c0700l.f6662d.removeCallbacks(c0700l.f6663e);
            }
        }
    }
}
