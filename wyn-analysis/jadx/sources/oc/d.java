package Oc;

import A7.RunnableC0278p;
import C8.f;
import Pc.C0785a;
import Pc.S;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import m9.E;
import m9.InterfaceC3517p;
import p9.C3781b;
import p9.n;
import s8.g;
import uc.C4271h;
import uc.InterfaceC4270g;
import uc.InterfaceC4272i;
import w9.AbstractC4392k;

/* loaded from: classes5.dex */
public final class d implements InterfaceC4272i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8955a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8956b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8957c;

    public /* synthetic */ d(Object obj, int i5) {
        this.f8955a = i5;
        this.f8956b = obj;
    }

    @Override // uc.InterfaceC4272i
    public final void onCancel(Object obj) {
        switch (this.f8955a) {
            case 0:
                c cVar = (c) this.f8957c;
                if (cVar != null) {
                    f fVar = (f) this.f8956b;
                    fVar.getClass();
                    ArrayList arrayList = fVar.f1921d;
                    arrayList.remove(cVar);
                    fVar.f1923f.a(arrayList.size() + fVar.f1920c.size());
                    this.f8957c = null;
                    break;
                }
                break;
            case 1:
                C0785a c0785a = (C0785a) this.f8957c;
                if (c0785a != null) {
                    ((FirebaseAuth) this.f8956b).f27286d.remove(c0785a);
                    this.f8957c = null;
                    break;
                }
                break;
            case 2:
                S s10 = (S) this.f8957c;
                if (s10 != null) {
                    ((FirebaseAuth) this.f8956b).f27284b.remove(s10);
                    this.f8957c = null;
                    break;
                }
                break;
            case 3:
                E e7 = (E) this.f8956b;
                if (e7 != null) {
                    e7.remove();
                    this.f8956b = null;
                    break;
                }
                break;
            default:
                this.f8957c = null;
                break;
        }
    }

    @Override // uc.InterfaceC4272i
    public final void onListen(Object obj, InterfaceC4270g interfaceC4270g) {
        E e7;
        switch (this.f8955a) {
            case 0:
                C4271h c4271h = (C4271h) interfaceC4270g;
                c cVar = new c(c4271h);
                this.f8957c = cVar;
                f fVar = (f) this.f8956b;
                fVar.getClass();
                ArrayList arrayList = fVar.f1921d;
                arrayList.add(cVar);
                fVar.f1923f.a(arrayList.size() + fVar.f1920c.size());
                if (fVar.b()) {
                    C8.b bVar = fVar.f1929m;
                    HashMap map = new HashMap();
                    map.put("token", bVar.f1907a);
                    c4271h.a(map);
                    return;
                }
                return;
            case 1:
                HashMap map2 = new HashMap();
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.f8956b;
                g gVar = firebaseAuth.f27283a;
                gVar.a();
                map2.put("appName", gVar.f45329b);
                C0785a c0785a = new C0785a(new AtomicBoolean(true), map2, (C4271h) interfaceC4270g);
                this.f8957c = c0785a;
                firebaseAuth.f27286d.add(c0785a);
                firebaseAuth.f27281A.execute(new RunnableC0278p(23, firebaseAuth, c0785a));
                return;
            case 2:
                HashMap map3 = new HashMap();
                FirebaseAuth firebaseAuth2 = (FirebaseAuth) this.f8956b;
                g gVar2 = firebaseAuth2.f27283a;
                gVar2.a();
                map3.put("appName", gVar2.f45329b);
                S s10 = new S(new AtomicBoolean(true), map3, (C4271h) interfaceC4270g);
                this.f8957c = s10;
                firebaseAuth2.f27284b.add(s10);
                firebaseAuth2.f27281A.execute(new RunnableC0278p(21, firebaseAuth2, s10));
                return;
            case 3:
                final C8.g gVar3 = new C8.g((C4271h) interfaceC4270g, 16);
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f8957c;
                C3781b c3781b = new C3781b(AbstractC4392k.f47444a, new InterfaceC3517p() { // from class: m9.D
                    @Override // m9.InterfaceC3517p
                    public final void a(Object obj2, G g9) {
                        A6.c.z(g9 == null, "snapshots-in-sync listeners should never get errors.", new Object[0]);
                        gVar3.run();
                    }
                });
                Dd.c cVar2 = firebaseFirestore.k;
                synchronized (cVar2) {
                    cVar2.C();
                    n nVar = (n) cVar2.f2643c;
                    nVar.e();
                    nVar.f43382d.a(new ng.a(6, nVar, c3781b));
                    e7 = new E(c3781b, nVar);
                }
                this.f8956b = e7;
                return;
            default:
                ArrayList arrayList2 = (ArrayList) this.f8956b;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C4271h) interfaceC4270g).a((Map) it.next());
                }
                arrayList2.clear();
                this.f8957c = (C4271h) interfaceC4270g;
                return;
        }
    }

    public d(int i5) {
        this.f8955a = i5;
        switch (i5) {
            case 4:
                this.f8956b = new ArrayList();
                break;
        }
    }
}
