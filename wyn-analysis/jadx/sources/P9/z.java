package p9;

import A7.C0237b0;
import A7.C0295v;
import E5.RunnableC0443c;
import E5.n0;
import ba.C1521a;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import md.j0;
import md.k0;
import n9.C3610e;
import r9.C3946c;
import r9.C3955l;
import r9.C3956m;
import r9.RunnableC3952i;
import r9.S;
import w9.AbstractC4397p;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final C3955l f43431a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f43432b;

    /* renamed from: l, reason: collision with root package name */
    public C3610e f43441l;

    /* renamed from: m, reason: collision with root package name */
    public Q1.n f43442m;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f43433c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f43434d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f43435e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f43436f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f43437g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final Y2.B f43438h = new Y2.B((byte) 0, 24);

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f43439i = new HashMap();
    public final R1.i k = new R1.i(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f43440j = new HashMap();

    public z(C3955l c3955l, n0 n0Var, C3610e c3610e) {
        this.f43431a = c3955l;
        this.f43432b = n0Var;
        this.f43441l = c3610e;
    }

    public static void e(k0 k0Var, String str, Object... objArr) {
        j0 j0Var = k0Var.f40685a;
        String str2 = k0Var.f40686b;
        if (str2 == null) {
            str2 = "";
        }
        if ((j0Var == j0.FAILED_PRECONDITION && str2.contains("requires an index")) || j0Var == j0.PERMISSION_DENIED) {
            Ba.c.p("Firestore", "%s: %s", 2, String.format(str, objArr), k0Var);
        }
    }

    public final void a(String str) {
        A6.c.z(this.f43442m != null, "Trying to call %s before setting callback", str);
    }

    public final void b(c9.c cVar, C8.i iVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f43433c.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C3955l c3955l = this.f43431a;
            if (!zHasNext) {
                this.f43442m.e(arrayList);
                c3955l.f44631a.P("notifyLocalViewChanges", new RunnableC3952i(c3955l, arrayList2, 1));
                return;
            }
            w wVar = (w) ((Map.Entry) it.next()).getValue();
            C3778C c3778c = wVar.f43428c;
            v9.t tVar = null;
            C0237b0 c0237b0D = c3778c.d(cVar, null);
            boolean z2 = false;
            if (c0237b0D.f812b) {
                c0237b0D = c3778c.d((c9.c) c3955l.b(wVar.f43426a, false).f19414b, c0237b0D);
            }
            int i5 = wVar.f43427b;
            if (iVar != null) {
                tVar = (v9.t) ((Map) iVar.f1940c).get(Integer.valueOf(i5));
            }
            if (iVar != null) {
                if (((Map) iVar.f1941d).get(Integer.valueOf(i5)) != null) {
                    z2 = true;
                }
            }
            X2.j jVarA = wVar.f43428c.a(c0237b0D, tVar, z2);
            l(i5, (List) jVarA.f16076c);
            C3779D c3779d = (C3779D) jVarA.f16075b;
            if (c3779d != null) {
                arrayList.add(c3779d);
                ArrayList arrayList3 = new ArrayList();
                q6.d dVar = s9.h.f45373b;
                c9.d dVar2 = new c9.d(arrayList3, dVar);
                c9.d dVar3 = new c9.d(new ArrayList(), dVar);
                Iterator it2 = c3779d.f43332d.iterator();
                while (it2.hasNext()) {
                    C3785f c3785f = (C3785f) it2.next();
                    int iOrdinal = c3785f.f43352a.ordinal();
                    s9.k kVar = c3785f.f43353b;
                    if (iOrdinal == 0) {
                        dVar3 = dVar3.a(kVar.f45380a);
                    } else if (iOrdinal == 1) {
                        dVar2 = dVar2.a(kVar.f45380a);
                    }
                }
                arrayList2.add(new C3956m(i5, c3779d.f43333e, dVar2, dVar3));
            }
        }
    }

    public final void c(C8.i iVar) {
        a("handleRemoteEvent");
        for (Map.Entry entry : ((Map) iVar.f1940c).entrySet()) {
            Integer num = (Integer) entry.getKey();
            v9.t tVar = (v9.t) entry.getValue();
            y yVar = (y) this.f43437g.get(num);
            if (yVar != null) {
                int size = tVar.f47114c.f19805a.size();
                c9.d dVar = tVar.f47115d;
                int size2 = dVar.f19805a.size() + size;
                c9.d dVar2 = tVar.f47116e;
                A6.c.z(dVar2.f19805a.size() + size2 <= 1, "Limbo resolution for single document contains multiple changes.", new Object[0]);
                if (tVar.f47114c.f19805a.size() > 0) {
                    yVar.f43430b = true;
                } else if (dVar.f19805a.size() > 0) {
                    A6.c.z(yVar.f43430b, "Received change for limbo target document without add.", new Object[0]);
                } else if (dVar2.f19805a.size() > 0) {
                    A6.c.z(yVar.f43430b, "Received remove for limbo target document without add.", new Object[0]);
                    yVar.f43430b = false;
                }
            }
        }
        C3955l c3955l = this.f43431a;
        b((c9.c) c3955l.f44631a.O("Apply remote event", new A5.g(c3955l, iVar, (s9.o) iVar.f1939b, 18)), iVar);
    }

    public final int d(u uVar, boolean z2) {
        a("listen");
        HashMap map = this.f43433c;
        A6.c.z(!map.containsKey(uVar), "We already listen to query: %s", uVar);
        C3776A c3776aI = uVar.i();
        C3955l c3955l = this.f43431a;
        S sA = c3955l.a(c3776aI);
        int i5 = sA.f44597b;
        C1521a c1521aB = c3955l.b(uVar, true);
        HashMap map2 = this.f43434d;
        boolean z10 = (map2.get(Integer.valueOf(i5)) != null ? ((w) map.get((u) ((List) map2.get(Integer.valueOf(i5))).get(0))).f43428c.f43322a : 1) == 3;
        c9.d dVar = s9.h.f45374c;
        v9.t tVar = new v9.t(sA.f44602g, z10, dVar, dVar, dVar);
        C3778C c3778c = new C3778C(uVar, (c9.d) c1521aB.f19415c);
        X2.j jVarA = c3778c.a(c3778c.d((c9.c) c1521aB.f19414b, null), tVar, false);
        l(i5, (List) jVarA.f16076c);
        map.put(uVar, new w(uVar, i5, c3778c));
        if (!map2.containsKey(Integer.valueOf(i5))) {
            map2.put(Integer.valueOf(i5), new ArrayList(1));
        }
        ((List) map2.get(Integer.valueOf(i5))).add(uVar);
        this.f43442m.e(Collections.singletonList((C3779D) jVarA.f16075b));
        if (z2) {
            this.f43432b.j(sA);
        }
        return sA.f44597b;
    }

    public final void f(int i5, k0 k0Var) {
        Map map = (Map) this.f43439i.get(this.f43441l);
        if (map != null) {
            Integer numValueOf = Integer.valueOf(i5);
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) map.get(numValueOf);
            if (taskCompletionSource != null) {
                if (k0Var != null) {
                    taskCompletionSource.setException(AbstractC4397p.g(k0Var));
                } else {
                    taskCompletionSource.setResult(null);
                }
                map.remove(numValueOf);
            }
        }
    }

    public final void g() {
        while (true) {
            LinkedHashSet linkedHashSet = this.f43435e;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            HashMap map = this.f43436f;
            if (map.size() >= 100) {
                return;
            }
            Iterator it = linkedHashSet.iterator();
            s9.h hVar = (s9.h) it.next();
            it.remove();
            R1.i iVar = this.k;
            int i5 = iVar.f10117b;
            iVar.f10117b = i5 + 2;
            this.f43437g.put(Integer.valueOf(i5), new y(hVar));
            map.put(hVar, Integer.valueOf(i5));
            this.f43432b.j(new S(new u(hVar.f45375a, null).i(), i5, -1L, r9.y.f44682d));
        }
    }

    public final void h(int i5, k0 k0Var) {
        HashMap map = this.f43434d;
        for (u uVar : (List) map.get(Integer.valueOf(i5))) {
            this.f43433c.remove(uVar);
            if (!k0Var.f()) {
                HashMap map2 = (HashMap) this.f43442m.f9697c;
                C3787h c3787h = (C3787h) map2.get(uVar);
                if (c3787h != null) {
                    Iterator it = c3787h.f43358a.iterator();
                    while (it.hasNext()) {
                        ((v) it.next()).f43422c.a(null, AbstractC4397p.g(k0Var));
                    }
                }
                map2.remove(uVar);
                e(k0Var, "Listen for %s failed", uVar);
            }
        }
        map.remove(Integer.valueOf(i5));
        Y2.B b5 = this.f43438h;
        c9.d dVarZ = b5.z(i5);
        b5.C(i5);
        Iterator it2 = dVarZ.iterator();
        while (true) {
            C0295v c0295v = (C0295v) it2;
            if (!((Iterator) c0295v.f1081b).hasNext()) {
                return;
            }
            s9.h hVar = (s9.h) c0295v.next();
            if (!b5.l(hVar)) {
                i(hVar);
            }
        }
    }

    public final void i(s9.h hVar) {
        this.f43435e.remove(hVar);
        HashMap map = this.f43436f;
        Integer num = (Integer) map.get(hVar);
        if (num != null) {
            this.f43432b.x(num.intValue());
            map.remove(hVar);
            this.f43437g.remove(num);
            g();
        }
    }

    public final void j(int i5) {
        HashMap map = this.f43440j;
        if (map.containsKey(Integer.valueOf(i5))) {
            Iterator it = ((List) map.get(Integer.valueOf(i5))).iterator();
            while (it.hasNext()) {
                ((TaskCompletionSource) it.next()).setResult(null);
            }
            map.remove(Integer.valueOf(i5));
        }
    }

    public final void k(u uVar, boolean z2) {
        a("stopListening");
        HashMap map = this.f43433c;
        w wVar = (w) map.get(uVar);
        A6.c.z(wVar != null, "Trying to stop listening to a query not found", new Object[0]);
        map.remove(uVar);
        int i5 = wVar.f43427b;
        List list = (List) this.f43434d.get(Integer.valueOf(i5));
        list.remove(uVar);
        if (list.isEmpty()) {
            C3955l c3955l = this.f43431a;
            c3955l.f44631a.P("Release target", new RunnableC0443c(c3955l, i5, 9));
            if (z2) {
                this.f43432b.x(i5);
            }
            h(i5, k0.f40674e);
        }
    }

    public final void l(int i5, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            int iOrdinal = rVar.f43395a.ordinal();
            Y2.B b5 = this.f43438h;
            s9.h hVar = rVar.f43396b;
            if (iOrdinal == 0) {
                b5.getClass();
                C3946c c3946c = new C3946c(hVar, i5);
                b5.f16383b = ((c9.d) b5.f16383b).a(c3946c);
                b5.f16384c = ((c9.d) b5.f16384c).a(c3946c);
                if (!this.f43436f.containsKey(hVar)) {
                    LinkedHashSet linkedHashSet = this.f43435e;
                    if (!linkedHashSet.contains(hVar)) {
                        Ba.c.p("z", "New document in limbo: %s", 1, hVar);
                        linkedHashSet.add(hVar);
                        g();
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    A6.c.s("Unknown limbo change type: %s", rVar.f43395a);
                    throw null;
                }
                Ba.c.p("z", "Document no longer in limbo: %s", 1, hVar);
                b5.getClass();
                C3946c c3946c2 = new C3946c(hVar, i5);
                b5.f16383b = ((c9.d) b5.f16383b).c(c3946c2);
                b5.f16384c = ((c9.d) b5.f16384c).c(c3946c2);
                if (!b5.l(hVar)) {
                    i(hVar);
                }
            }
        }
    }
}
