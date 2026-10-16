package J8;

import K8.C0693e;
import K8.C0700l;
import K8.InterfaceC0702n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.firebase.auth.FirebaseAuth;
import org.json.JSONException;

/* renamed from: J8.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0633h implements InterfaceC0702n, K8.J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f5806b;

    public /* synthetic */ C0633h(FirebaseAuth firebaseAuth, int i5) {
        this.f5805a = i5;
        this.f5806b = firebaseAuth;
    }

    @Override // K8.J
    public final void a(zzagl zzaglVar, AbstractC0640o abstractC0640o) throws JSONException {
        switch (this.f5805a) {
            case 0:
                AbstractC1732v.i(zzaglVar);
                AbstractC1732v.i(abstractC0640o);
                ((C0693e) abstractC0640o).f6627a = zzaglVar;
                FirebaseAuth firebaseAuth = this.f5806b;
                firebaseAuth.getClass();
                FirebaseAuth.l(firebaseAuth, abstractC0640o, zzaglVar, true, true);
                break;
            default:
                FirebaseAuth firebaseAuth2 = this.f5806b;
                firebaseAuth2.getClass();
                FirebaseAuth.l(firebaseAuth2, abstractC0640o, zzaglVar, true, true);
                break;
        }
    }

    @Override // K8.InterfaceC0702n
    public final void zza(Status status) {
        switch (this.f5805a) {
            case 0:
                int i5 = status.f26429a;
                if (i5 == 17011 || i5 == 17021 || i5 == 17005 || i5 == 17091) {
                    FirebaseAuth firebaseAuth = this.f5806b;
                    firebaseAuth.q();
                    K8.z zVar = firebaseAuth.f27305x;
                    if (zVar != null) {
                        C0700l c0700l = zVar.f6688b;
                        c0700l.f6662d.removeCallbacks(c0700l.f6663e);
                        break;
                    }
                }
                break;
            default:
                int i10 = status.f26429a;
                if (i10 == 17011 || i10 == 17021 || i10 == 17005) {
                    FirebaseAuth firebaseAuth2 = this.f5806b;
                    firebaseAuth2.q();
                    K8.z zVar2 = firebaseAuth2.f27305x;
                    if (zVar2 != null) {
                        C0700l c0700l2 = zVar2.f6688b;
                        c0700l2.f6662d.removeCallbacks(c0700l2.f6663e);
                        break;
                    }
                }
                break;
        }
    }
}
