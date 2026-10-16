package kotlinx.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.ar;
import h.g.b.x;
import h.l.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.b.c.al;
import kotlinx.b.c.an;
import kotlinx.b.c.av;
import kotlinx.b.c.ax;
import kotlinx.b.c.bd;
import kotlinx.b.c.bn;
import kotlinx.b.c.bp;
import kotlinx.b.c.bx;
import kotlinx.b.c.cj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class q {
    public static final List a(kotlinx.b.e.e eVar, List list, boolean z) {
        x.f(eVar, "<this>");
        x.f(list, "typeArguments");
        if (z) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(c(eVar, (s) it.next()));
            }
            return arrayList;
        }
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(h.a.i.q(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            b bVarE = e(eVar, (s) it2.next());
            if (bVarE == null) {
                return null;
            }
            arrayList2.add(bVarE);
        }
        return arrayList2;
    }

    public static final b b(h.l.c cVar, List list, h.g.a.a aVar) {
        kotlinx.b.c.e eVar;
        x.f(cVar, "<this>");
        x.f(list, "serializers");
        x.f(aVar, "elementClassifierIfArray");
        int i2 = ar.f48106a;
        if (x.n(cVar, new h.g.b.m(Collection.class)) || x.n(cVar, new h.g.b.m(List.class)) || x.n(cVar, new h.g.b.m(List.class)) || x.n(cVar, new h.g.b.m(ArrayList.class))) {
            eVar = new kotlinx.b.c.e((b) list.get(0));
        } else if (x.n(cVar, new h.g.b.m(HashSet.class))) {
            eVar = new an((b) list.get(0));
        } else if (x.n(cVar, new h.g.b.m(Set.class)) || x.n(cVar, new h.g.b.m(Set.class)) || x.n(cVar, new h.g.b.m(LinkedHashSet.class))) {
            eVar = new ax((b) list.get(0));
        } else if (x.n(cVar, new h.g.b.m(HashMap.class))) {
            eVar = new al((b) list.get(0), (b) list.get(1));
        } else if (x.n(cVar, new h.g.b.m(Map.class)) || x.n(cVar, new h.g.b.m(Map.class)) || x.n(cVar, new h.g.b.m(LinkedHashMap.class))) {
            eVar = new av((b) list.get(0), (b) list.get(1));
        } else if (x.n(cVar, new h.g.b.m(Map.Entry.class))) {
            b bVar = (b) list.get(0);
            b bVar2 = (b) list.get(1);
            x.f(bVar, "keySerializer");
            x.f(bVar2, "valueSerializer");
            eVar = new bd(bVar, bVar2);
        } else if (x.n(cVar, new h.g.b.m(h.k.class))) {
            b bVar3 = (b) list.get(0);
            b bVar4 = (b) list.get(1);
            x.f(bVar3, "keySerializer");
            x.f(bVar4, "valueSerializer");
            eVar = new bn(bVar3, bVar4);
        } else if (x.n(cVar, new h.g.b.m(h.p.class))) {
            b bVar5 = (b) list.get(0);
            b bVar6 = (b) list.get(1);
            b bVar7 = (b) list.get(2);
            x.f(bVar5, "aSerializer");
            x.f(bVar6, "bSerializer");
            x.f(bVar7, "cSerializer");
            eVar = new cj(bVar5, bVar6, bVar7);
        } else {
            x.f(cVar, "rootClass");
            if (h.g.b.o.w(cVar).isArray()) {
                Object objInvoke = aVar.invoke();
                x.d(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                eVar = kotlinx.b.a.b.c((h.l.c) objInvoke, (b) list.get(0));
            } else {
                eVar = null;
            }
        }
        if (eVar != null) {
            return eVar;
        }
        b[] bVarArr = (b[]) list.toArray(new b[0]);
        return h.o.c.o(cVar, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public static final b c(kotlinx.b.e.e eVar, s sVar) {
        x.f(eVar, "<this>");
        x.f(sVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        b bVarF = f(eVar, sVar, true);
        if (bVarF != null) {
            return bVarF;
        }
        h.l.c cVarB = bp.b(sVar);
        x.f(cVarB, "<this>");
        bp.d(cVarB);
        throw new h.e();
    }

    public static final b d(h.l.c cVar) {
        x.f(cVar, "<this>");
        x.f(cVar, "<this>");
        b bVarO = h.o.c.o(cVar, new b[0]);
        return bVarO == null ? bx.a(cVar) : bVarO;
    }

    public static final b e(kotlinx.b.e.e eVar, s sVar) {
        x.f(eVar, "<this>");
        x.f(sVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return f(eVar, sVar, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlinx.b.b f(kotlinx.b.e.e r6, h.l.s r7, boolean r8) {
        /*
            h.l.c r0 = kotlinx.b.c.bp.b(r7)
            boolean r1 = r7.c()
            java.util.List r7 = r7.a()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = h.a.i.q(r7, r3)
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r7 = r7.iterator()
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto Lb1
            java.util.List r2 = (java.util.List) r2
            boolean r7 = r2.isEmpty()
            r3 = 0
            if (r7 == 0) goto L40
            boolean r7 = h.o.c.p(r0)
            if (r7 == 0) goto L3b
            kotlinx.b.b r7 = kotlinx.b.e.e.f(r6, r0)
            if (r7 == 0) goto L3b
            goto L46
        L3b:
            kotlinx.b.b r7 = kotlinx.b.o.b(r0, r1)
            goto L54
        L40:
            boolean r7 = r6.e()
            if (r7 == 0) goto L48
        L46:
            r7 = r3
            goto L54
        L48:
            java.lang.Object r7 = kotlinx.b.o.a(r0, r2, r1)
            r4 = 1
            boolean r5 = r7 instanceof h.l
            if (r4 != r5) goto L52
            r7 = r3
        L52:
            kotlinx.b.b r7 = (kotlinx.b.b) r7
        L54:
            if (r7 == 0) goto L57
            return r7
        L57:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L7a
            kotlinx.b.b r7 = d(r0)
            if (r7 != 0) goto La6
            kotlinx.b.b r7 = kotlinx.b.e.e.f(r6, r0)
            if (r7 != 0) goto La6
            boolean r6 = h.o.c.p(r0)
            if (r6 == 0) goto L75
            kotlinx.b.f r6 = new kotlinx.b.f
            r6.<init>(r0)
            goto L76
        L75:
            r6 = r3
        L76:
            r7 = r6
            kotlinx.b.b r7 = (kotlinx.b.b) r7
            goto La6
        L7a:
            java.util.List r7 = a(r6, r2, r8)
            if (r7 != 0) goto L81
            return r3
        L81:
            com.waze.uid.state_impl.email.n r8 = new com.waze.uid.state_impl.email.n
            r4 = 13
            r8.<init>(r2, r4)
            kotlinx.b.b r8 = b(r0, r7, r8)
            if (r8 != 0) goto La5
            kotlinx.b.b r7 = r6.b(r0, r7)
            if (r7 != 0) goto La6
            boolean r6 = h.o.c.p(r0)
            if (r6 == 0) goto La0
            kotlinx.b.f r6 = new kotlinx.b.f
            r6.<init>(r0)
            goto La1
        La0:
            r6 = r3
        La1:
            r7 = r6
            kotlinx.b.b r7 = (kotlinx.b.b) r7
            goto La6
        La5:
            r7 = r8
        La6:
            if (r7 == 0) goto Lb0
            if (r1 == 0) goto Laf
            kotlinx.b.b r6 = kotlinx.b.a.b.l(r7)
            return r6
        Laf:
            return r7
        Lb0:
            return r3
        Lb1:
            java.lang.Object r6 = r7.next()
            h.l.u r6 = (h.l.u) r6
            java.lang.String r7 = "<this>"
            h.g.b.x.f(r6, r7)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Star projections in type arguments are not allowed, but had null"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.b.q.f(kotlinx.b.e.e, h.l.s, boolean):kotlinx.b.b");
    }
}
