package Mb;

import A.AbstractC0213f;
import K8.A;
import Pc.C0799o;
import Q1.g;
import Uc.f;
import Uc.n;
import android.graphics.Bitmap;
import android.util.Log;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.google.android.gms.ads.nativead.l;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.MessageLite;
import com.unity3d.ads.InitializationListener;
import com.unity3d.services.core.properties.SdkProperties;
import com.vungle.ads.internal.util.i;
import com.vungle.ads.internal.util.j;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import m9.H;
import m9.P;
import m9.T;
import v9.AbstractC4335b;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7624b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7625c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7626d;

    public /* synthetic */ b(j jVar, Bitmap bitmap, int i5) {
        this.f7623a = 0;
        this.f7625c = jVar;
        this.f7626d = bitmap;
        this.f7624b = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = false;
        int i5 = 3;
        switch (this.f7623a) {
            case 0:
                i.a((j) this.f7625c, (Bitmap) this.f7626d, this.f7624b);
                return;
            case 1:
                Iterator it = ((CopyOnWriteArraySet) this.f7625c).iterator();
                while (it.hasNext()) {
                    Q1.i iVar = (Q1.i) it.next();
                    if (!iVar.f9678d) {
                        int i10 = this.f7624b;
                        if (i10 != -1) {
                            iVar.f9676b.a(i10);
                        }
                        iVar.f9677c = true;
                        ((g) this.f7626d).invoke(iVar.f9675a);
                    }
                }
                return;
            case 2:
                n nVar = (n) this.f7625c;
                int i11 = this.f7624b;
                C0799o c0799o = (C0799o) this.f7626d;
                FirebaseFirestore firebaseFirestoreC = f.c(nVar);
                Dd.c cVar = firebaseFirestoreC.k;
                cVar.C();
                if (firebaseFirestoreC.f27333m == null) {
                    H h10 = firebaseFirestoreC.f27331j;
                    P p10 = h10.f40430e;
                    if ((p10 != null ? p10 instanceof T : h10.f40428c) || (p10 instanceof T)) {
                        l lVar = new l(10, z2);
                        lVar.f26356b = cVar;
                        firebaseFirestoreC.f27333m = lVar;
                    }
                }
                l lVar2 = firebaseFirestoreC.f27333m;
                if (lVar2 != null) {
                    int iF = AbstractC0213f.f(i11);
                    if (iF == 0) {
                        lVar2.i();
                    } else if (iF == 1) {
                        lVar2.b();
                    } else if (iF == 2) {
                        Dd.c cVar2 = (Dd.c) lVar2.f26356b;
                        synchronized (cVar2) {
                            cVar2.C();
                            p9.n nVar2 = (p9.n) cVar2.f2643c;
                            nVar2.e();
                            nVar2.f43382d.a(new p9.l(nVar2, i5));
                        }
                    }
                } else {
                    Log.d("FlutterFirestorePlugin", "`PersistentCacheIndexManager` is not available.");
                }
                c0799o.a(null);
                return;
            case 3:
                ((MaxAdPlacer) this.f7625c).a(this.f7624b, (Collection) this.f7626d);
                return;
            case 4:
                SdkProperties.lambda$notifyInitializationFailed$3((InitializationListener) this.f7625c, this.f7624b, (String) this.f7626d);
                return;
            case 5:
                ((i3.a) ((A) this.f7625c).f6563d).a(this.f7624b, (Serializable) this.f7626d);
                return;
            case 6:
                Iterator it2 = ((CopyOnWriteArraySet) this.f7625c).iterator();
                while (it2.hasNext()) {
                    u6.i iVar2 = (u6.i) it2.next();
                    if (!iVar2.f46681d) {
                        int i12 = this.f7624b;
                        if (i12 != -1) {
                            iVar2.f46679b.a(i12);
                        }
                        iVar2.f46680c = true;
                        ((u6.g) this.f7626d).invoke(iVar2.f46678a);
                    }
                }
                return;
            default:
                E4.n nVar3 = (E4.n) this.f7625c;
                boolean zE = Ba.c.E();
                int i13 = this.f7624b;
                MessageLite messageLite = (MessageLite) this.f7626d;
                AbstractC4335b abstractC4335b = (AbstractC4335b) nVar3.f2940d;
                if (zE) {
                    Ba.c.p(abstractC4335b.getClass().getSimpleName(), "(%x) Stream received (%s): %s", 1, Integer.valueOf(System.identityHashCode(abstractC4335b)), Integer.valueOf(i13), messageLite);
                }
                if (i13 == 1) {
                    abstractC4335b.e(messageLite);
                    return;
                } else {
                    abstractC4335b.f(messageLite);
                    return;
                }
        }
    }

    public /* synthetic */ b(Object obj, int i5, Object obj2, int i10) {
        this.f7623a = i10;
        this.f7625c = obj;
        this.f7624b = i5;
        this.f7626d = obj2;
    }
}
