package Vc;

import A5.h;
import android.content.Context;
import android.content.IntentFilter;
import com.google.firebase.firestore.FirebaseFirestore;
import java.io.ByteArrayInputStream;
import m9.N;
import p9.n;
import uc.C4271h;
import uc.InterfaceC4270g;
import uc.InterfaceC4272i;
import x4.i;

/* loaded from: classes5.dex */
public final class d implements InterfaceC4272i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14865a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Object f14866b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14867c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14868d;

    public /* synthetic */ d() {
    }

    @Override // uc.InterfaceC4272i
    public final void onCancel(Object obj) {
        i iVar;
        switch (this.f14865a) {
            case 0:
                ((C4271h) this.f14866b).b();
                break;
            default:
                Context context = (Context) this.f14867c;
                if (context != null && (iVar = (i) this.f14868d) != null) {
                    context.unregisterReceiver(iVar);
                    break;
                }
                break;
        }
    }

    @Override // uc.InterfaceC4272i
    public final void onListen(Object obj, InterfaceC4270g interfaceC4270g) {
        switch (this.f14865a) {
            case 0:
                C4271h c4271h = (C4271h) interfaceC4270g;
                this.f14866b = c4271h;
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f14867c;
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) this.f14868d);
                N n10 = new N();
                Dd.c cVar = firebaseFirestore.k;
                synchronized (cVar) {
                    cVar.C();
                    n nVar = (n) cVar.f2643c;
                    nVar.e();
                    nVar.f43382d.a(new com.applovin.impl.mediation.ads.f(nVar, new o9.f(nVar.f43383e, byteArrayInputStream), n10, 27));
                }
                n10.a(new c(c4271h, 0));
                n10.addOnFailureListener(new h(22, this, c4271h));
                return;
            default:
                if (((Context) this.f14867c) == null) {
                    return;
                }
                IntentFilter intentFilter = new IntentFilter("android.location.PROVIDERS_CHANGED");
                intentFilter.addAction("android.intent.action.PROVIDER_CHANGED");
                i iVar = new i((C4271h) interfaceC4270g);
                this.f14868d = iVar;
                Y0.e.registerReceiver((Context) this.f14867c, iVar, intentFilter, 2);
                return;
        }
    }

    public d(FirebaseFirestore firebaseFirestore, byte[] bArr) {
        this.f14867c = firebaseFirestore;
        this.f14868d = bArr;
    }
}
