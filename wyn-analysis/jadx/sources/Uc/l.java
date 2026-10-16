package Uc;

import A.AbstractC0213f;
import Pc.C0799o;
import Pc.C0800p;
import Pc.C0801q;
import ba.C1521a;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m9.AbstractC3505d;
import m9.C3502a;
import m9.C3503b;
import m9.C3504c;
import m9.C3506e;
import m9.V;
import m9.W;
import uc.InterfaceC4265b;

/* loaded from: classes5.dex */
public final /* synthetic */ class l implements InterfaceC4265b, Q1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12750a;

    public /* synthetic */ l(int i5) {
        this.f12750a = i5;
    }

    @Override // uc.InterfaceC4265b
    public void e(Object obj, C1521a c1521a) {
        switch (this.f12750a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                FlutterFirebasePlugin.cachedThreadPool.execute(new T3.r(6, (n) ((ArrayList) obj).get(0), new C0801q(arrayList, c1521a, 16)));
                break;
            case 1:
                ArrayList arrayList2 = new ArrayList();
                FlutterFirebasePlugin.cachedThreadPool.execute(new T3.r(7, (n) ((ArrayList) obj).get(0), new C0799o(arrayList2, c1521a, 17)));
                break;
            case 2:
                ArrayList arrayList3 = new ArrayList();
                FlutterFirebasePlugin.cachedThreadPool.execute(new T3.r(10, (n) ((ArrayList) obj).get(0), new C0800p(arrayList3, c1521a, 17)));
                break;
            case 3:
                ArrayList arrayList4 = new ArrayList();
                FlutterFirebasePlugin.cachedThreadPool.execute(new T3.r(12, (n) ((ArrayList) obj).get(0), new C0801q(arrayList4, c1521a, 17)));
                break;
            case 4:
                ArrayList arrayList5 = new ArrayList();
                FlutterFirebasePlugin.cachedThreadPool.execute(new T3.r(11, (n) ((ArrayList) obj).get(0), new C0799o(arrayList5, c1521a, 18)));
                break;
            case 5:
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.a((n) arrayList7.get(0), (String) arrayList7.get(1), new C0800p(arrayList6, c1521a, 18), 9));
                break;
            case 6:
                ArrayList arrayList8 = new ArrayList();
                FlutterFirebasePlugin.cachedThreadPool.execute(new T3.r(8, (Boolean) ((ArrayList) obj).get(0), new C0801q(arrayList8, c1521a, 18)));
                break;
            case 7:
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.a((n) arrayList10.get(0), (j) arrayList10.get(1), new C0801q(arrayList9, c1521a, 13), 11));
                break;
            case 8:
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.a((n) arrayList12.get(0), (j) arrayList12.get(1), new C0799o(arrayList11, c1521a, 14), 14));
                break;
            case 9:
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = (ArrayList) obj;
                n nVar = (n) arrayList14.get(0);
                FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.a((j) arrayList14.get(1), nVar, new C0800p(arrayList13, c1521a, 14), 12));
                break;
            case 10:
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = (ArrayList) obj;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.a((n) arrayList16.get(0), (j) arrayList16.get(1), new C0801q(arrayList15, c1521a, 14), 10));
                break;
            case 11:
                ArrayList arrayList17 = new ArrayList();
                ArrayList arrayList18 = (ArrayList) obj;
                n nVar2 = (n) arrayList18.get(0);
                String str = (String) arrayList18.get(1);
                Boolean bool = (Boolean) arrayList18.get(2);
                u uVar = (u) arrayList18.get(3);
                FlutterFirebasePlugin.cachedThreadPool.execute(new d((t) arrayList18.get(4), nVar2, str, bool, uVar, new C0799o(arrayList17, c1521a, 15), 0));
                break;
            default:
                ArrayList arrayList19 = new ArrayList();
                ArrayList arrayList20 = (ArrayList) obj;
                n nVar3 = (n) arrayList20.get(0);
                String str2 = (String) arrayList20.get(1);
                u uVar2 = (u) arrayList20.get(2);
                int i5 = AbstractC0213f.g(1)[((Integer) arrayList20.get(3)).intValue()];
                List<h> list = (List) arrayList20.get(4);
                Boolean bool2 = (Boolean) arrayList20.get(5);
                C0800p c0800p = new C0800p(arrayList19, c1521a, 15);
                W wI = xg.g.I(f.c(nVar3), str2, bool2.booleanValue(), uVar2);
                ArrayList arrayList21 = new ArrayList();
                for (h hVar : list) {
                    int iF = AbstractC0213f.f(hVar.f12738a);
                    if (iF == 0) {
                        arrayList21.add(new C3503b(null, "count"));
                    } else if (iF == 1) {
                        arrayList21.add(new C3504c(m9.r.a(hVar.f12739b), "sum"));
                    } else if (iF == 2) {
                        arrayList21.add(new C3502a(m9.r.a(hVar.f12739b), "average"));
                    }
                }
                AbstractC3505d abstractC3505d = (AbstractC3505d) arrayList21.get(0);
                AbstractC3505d[] abstractC3505dArr = (AbstractC3505d[]) arrayList21.subList(1, arrayList21.size()).toArray(new AbstractC3505d[0]);
                wI.getClass();
                V v2 = new V();
                v2.add(abstractC3505d);
                v2.addAll(Arrays.asList(abstractC3505dArr));
                FlutterFirebasePlugin.cachedThreadPool.execute(new e(new C3506e(wI, v2), i5, list, c0800p));
                break;
        }
    }

    @Override // Q1.g
    public void invoke(Object obj) {
        V1.i iVar = (V1.i) obj;
        switch (this.f12750a) {
            case 13:
                iVar.getClass();
                break;
            case 14:
                iVar.getClass();
                break;
            case 15:
                iVar.getClass();
                break;
            case 16:
                iVar.getClass();
                break;
            case 17:
                iVar.getClass();
                break;
            case 18:
                iVar.getClass();
                break;
            case 19:
                iVar.getClass();
                break;
            case 20:
                iVar.getClass();
                break;
            case 21:
                iVar.getClass();
                break;
            case 22:
                iVar.getClass();
                break;
            case 23:
                iVar.getClass();
                break;
            case 24:
                iVar.getClass();
                break;
            case 25:
                iVar.getClass();
                break;
            case 26:
                iVar.getClass();
                break;
            case 27:
                iVar.getClass();
                break;
            case 28:
                iVar.getClass();
                break;
            default:
                iVar.getClass();
                break;
        }
    }

    public /* synthetic */ l(f fVar, int i5) {
        this.f12750a = i5;
    }
}
