package p9;

import A.AbstractC0213f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f43377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f43378c;

    public /* synthetic */ m(n nVar, v vVar, int i5) {
        this.f43376a = i5;
        this.f43377b = nVar;
        this.f43378c = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        int i5 = 4;
        v vVar = this.f43378c;
        n nVar = this.f43377b;
        switch (this.f43376a) {
            case 0:
                Q1.n nVar2 = nVar.f43388j;
                nVar2.getClass();
                u uVar = vVar.f43420a;
                HashMap map = (HashMap) nVar2.f9697c;
                C3787h c3787h = (C3787h) map.get(uVar);
                if (c3787h != null) {
                    ArrayList arrayList = c3787h.f43358a;
                    arrayList.remove(vVar);
                    if (arrayList.isEmpty()) {
                        i5 = vVar.a() ? 1 : 2;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((v) it.next()).a()) {
                                }
                            } else if (vVar.a()) {
                                i5 = 3;
                            }
                        }
                    }
                    int iF = AbstractC0213f.f(i5);
                    z zVar = (z) nVar2.f9696b;
                    if (iF == 0) {
                        map.remove(uVar);
                        zVar.k(uVar, true);
                        break;
                    } else if (iF == 1) {
                        map.remove(uVar);
                        zVar.k(uVar, false);
                        break;
                    } else if (iF == 2) {
                        zVar.a("stopListeningToRemoteStore");
                        w wVar = (w) zVar.f43433c.get(uVar);
                        A6.c.z(wVar != null, "Trying to stop listening to a query not found", new Object[0]);
                        int i10 = wVar.f43427b;
                        List list = (List) zVar.f43434d.get(Integer.valueOf(i10));
                        list.remove(uVar);
                        if (list.isEmpty()) {
                            zVar.f43432b.x(i10);
                            break;
                        }
                    }
                }
                break;
            default:
                Q1.n nVar3 = nVar.f43388j;
                nVar3.getClass();
                u uVar2 = vVar.f43420a;
                HashMap map2 = (HashMap) nVar3.f9697c;
                C3787h c3787h2 = (C3787h) map2.get(uVar2);
                if (c3787h2 == null) {
                    c3787h2 = new C3787h();
                    map2.put(uVar2, c3787h2);
                    i5 = vVar.a() ? 1 : 2;
                } else {
                    Iterator it2 = c3787h2.f43358a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((v) it2.next()).a()) {
                            }
                        } else if (vVar.a()) {
                            i5 = 3;
                        }
                    }
                }
                c3787h2.f43358a.add(vVar);
                int i11 = nVar3.f9695a;
                vVar.f43424e = i11;
                C3779D c3779d = vVar.f43425f;
                if (c3779d == null || vVar.f43423d || !vVar.d(c3779d, i11)) {
                    z2 = false;
                } else {
                    vVar.c(vVar.f43425f);
                    z2 = true;
                }
                A6.c.z(!z2, "onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", new Object[0]);
                C3779D c3779d2 = c3787h2.f43359b;
                if (c3779d2 != null && vVar.b(c3779d2)) {
                    nVar3.f();
                }
                int iF2 = AbstractC0213f.f(i5);
                z zVar2 = (z) nVar3.f9696b;
                if (iF2 == 0) {
                    zVar2.d(uVar2, true);
                    break;
                } else if (iF2 == 1) {
                    zVar2.d(uVar2, false);
                    break;
                } else if (iF2 == 2) {
                    zVar2.a("listenToRemoteStore");
                    A6.c.z(zVar2.f43433c.containsKey(uVar2), "This is the first listen to query: %s", uVar2);
                    zVar2.f43432b.j(zVar2.f43431a.a(uVar2.i()));
                    break;
                }
                break;
        }
    }
}
