package Vc;

import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.Iterator;
import m9.C3510i;
import m9.C3514m;
import m9.C3516o;
import m9.EnumC3515n;
import m9.G;
import m9.InterfaceC3517p;
import m9.W;
import m9.Y;
import p9.C3779D;
import s9.h;
import s9.k;
import uc.C4271h;
import vf.AbstractC4345a;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements InterfaceC3517p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14856c;

    public /* synthetic */ a(int i5, Object obj, Object obj2) {
        this.f14854a = i5;
        this.f14856c = obj;
        this.f14855b = obj2;
    }

    @Override // m9.InterfaceC3517p
    public final void a(Object obj, G g9) {
        switch (this.f14854a) {
            case 0:
                C3516o c3516o = (C3516o) obj;
                C4271h c4271h = (C4271h) this.f14855b;
                b bVar = (b) this.f14856c;
                if (g9 == null) {
                    c4271h.a(xg.g.W(c3516o, bVar.f14859c).b());
                    break;
                } else {
                    bVar.getClass();
                    c4271h.c("firebase_firestore", g9.getMessage(), AbstractC4345a.n(g9));
                    c4271h.b();
                    bVar.onCancel(null);
                    break;
                }
            case 1:
                Y y10 = (Y) obj;
                b bVar2 = (b) this.f14856c;
                bVar2.getClass();
                C4271h c4271h2 = (C4271h) this.f14855b;
                if (g9 == null) {
                    ArrayList arrayList = new ArrayList(3);
                    ArrayList arrayList2 = new ArrayList(y10.b().size());
                    ArrayList arrayList3 = new ArrayList(y10.a().size());
                    Iterator it = y10.b().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        EnumC3515n enumC3515n = bVar2.f14859c;
                        if (!zHasNext) {
                            Iterator it2 = y10.a().iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(xg.g.V((C3510i) it2.next(), enumC3515n).a());
                            }
                            arrayList.add(arrayList2);
                            arrayList.add(arrayList3);
                            arrayList.add(xg.g.Y(y10.f40463f).b());
                            c4271h2.a(arrayList);
                            break;
                        } else {
                            arrayList2.add(xg.g.W((C3516o) it.next(), enumC3515n).b());
                        }
                    }
                } else {
                    c4271h2.c("firebase_firestore", g9.getMessage(), AbstractC4345a.n(g9));
                    c4271h2.b();
                    bVar2.onCancel(null);
                    break;
                }
            case 2:
                C3779D c3779d = (C3779D) obj;
                C3514m c3514m = (C3514m) this.f14856c;
                c3514m.getClass();
                InterfaceC3517p interfaceC3517p = (InterfaceC3517p) this.f14855b;
                if (g9 == null) {
                    A6.c.z(c3779d != null, "Got event without value or error set", new Object[0]);
                    A6.c.z(c3779d.f43330b.f45376a.size() <= 1, "Too many documents returned on a document query", new Object[0]);
                    c9.c cVar = c3779d.f43330b.f45376a;
                    h hVar = c3514m.f40495a;
                    k kVar = (k) cVar.b(hVar);
                    FirebaseFirestore firebaseFirestore = c3514m.f40496b;
                    boolean z2 = c3779d.f43333e;
                    interfaceC3517p.a(kVar != null ? new C3516o(firebaseFirestore, kVar.f45380a, kVar, z2, c3779d.f43334f.f19805a.a(kVar.f45380a)) : new C3516o(firebaseFirestore, hVar, null, z2, false), null);
                    break;
                } else {
                    interfaceC3517p.a(null, g9);
                    break;
                }
            default:
                C3779D c3779d2 = (C3779D) obj;
                W w2 = (W) this.f14856c;
                w2.getClass();
                InterfaceC3517p interfaceC3517p2 = (InterfaceC3517p) this.f14855b;
                if (g9 == null) {
                    A6.c.z(c3779d2 != null, "Got event without value or error set", new Object[0]);
                    interfaceC3517p2.a(new Y(w2, c3779d2, w2.f40457b), null);
                    break;
                } else {
                    interfaceC3517p2.a(null, g9);
                    break;
                }
        }
    }
}
