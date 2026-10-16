package Cd;

import ef.C2515C;
import gf.C2755b;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import r7.AbstractC3935e;
import vf.AbstractC4345a;

/* renamed from: Cd.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0341i extends AbstractC3471j implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Rd.e f2112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0342j f2113b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0341i(C0342j c0342j, InterfaceC3103c interfaceC3103c) {
        super(3, interfaceC3103c);
        this.f2113b = c0342j;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C0341i c0341i = new C0341i(this.f2113b, (InterfaceC3103c) obj3);
        c0341i.f2112a = (Rd.e) obj;
        C2515C c2515c = C2515C.f34653a;
        c0341i.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        int i5;
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        Rd.e eVar = this.f2112a;
        String string = ((Fd.c) eVar.f10601a).f4045a.toString();
        C0340h c0340h = new C0340h();
        Fd.c cVar = (Fd.c) eVar.f10601a;
        Jd.n nVar = cVar.f4047c;
        Jd.n nVar2 = c0340h.f2106a;
        xg.g.l(nVar2, nVar);
        Map values = (Map) nVar2.f421a;
        AbstractC3340k.e(values, "values");
        Nd.b bVar = new Nd.b();
        Iterator it = values.entrySet().iterator();
        while (true) {
            i5 = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            while (i5 < size) {
                arrayList.add((String) list.get(i5));
                i5++;
            }
            bVar.put(str, arrayList);
        }
        this.f2113b.f2119a.invoke(c0340h);
        Set setEntrySet = bVar.entrySet();
        AbstractC3340k.e(setEntrySet, "<this>");
        Set<Map.Entry> setUnmodifiableSet = DesugarCollections.unmodifiableSet(setEntrySet);
        AbstractC3340k.d(setUnmodifiableSet, "unmodifiableSet(...)");
        for (Map.Entry entry2 : setUnmodifiableSet) {
            String str2 = (String) entry2.getKey();
            List list2 = (List) entry2.getValue();
            List listI = nVar2.i(str2);
            if (listI == null) {
                nVar2.f(str2, list2);
            } else if (!listI.equals(list2)) {
                List list3 = Jd.p.f6064a;
                if (!str2.equals("Cookie")) {
                    values.remove(str2);
                    nVar2.f(str2, list2);
                    List list4 = listI;
                    List list5 = (List) values.get(str2);
                    Set setX0 = list5 != null ? ff.o.X0(list5) : ff.x.f35434a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list4) {
                        if (!setX0.contains((String) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    nVar2.f(str2, arrayList2);
                }
            }
        }
        Jd.H hB = c0340h.f2107b.b();
        C0334b c0334b = C0342j.f2117b;
        Jd.B b5 = cVar.f4045a;
        Jd.D d3 = b5.f6010d;
        Jd.D d5 = hB.f6032g;
        if (d3 == null) {
            b5.f6010d = d5;
        }
        if (b5.f6007a.length() <= 0) {
            Jd.B b10 = new Jd.B();
            b10.f6010d = d5;
            String str3 = hB.f6026a;
            AbstractC3340k.e(str3, "<set-?>");
            b10.f6007a = str3;
            int i10 = hB.f6027b;
            Integer numValueOf = Integer.valueOf(i10);
            if (i10 == 0) {
                numValueOf = null;
            }
            b10.d(numValueOf != null ? numValueOf.intValue() : hB.f6033h.f6021b);
            AbstractC4345a.L(b10, (String) hB.f6034i.getValue());
            b10.f6011e = (String) hB.k.getValue();
            b10.f6012f = (String) hB.f6036l.getValue();
            Jd.z zVar = new Jd.z(8);
            zVar.A(tg.b.L((String) hB.f6035j.getValue()));
            b10.f6015i = zVar;
            b10.f6016j = new S3.l(zVar);
            String str4 = (String) hB.f6037m.getValue();
            AbstractC3340k.e(str4, "<set-?>");
            b10.f6013g = str4;
            b10.f6008b = hB.f6030e;
            b10.f6010d = b5.f6010d;
            int i11 = b5.f6009c;
            if (i11 != 0) {
                b10.d(i11);
            }
            List listL = b10.f6014h;
            List list6 = b5.f6014h;
            if (!list6.isEmpty()) {
                if (listL.isEmpty() || ((CharSequence) ff.o.q0(list6)).length() == 0) {
                    listL = list6;
                } else {
                    C2755b c2755b = new C2755b((list6.size() + listL.size()) - 1);
                    int size2 = listL.size() - 1;
                    while (i5 < size2) {
                        c2755b.add(listL.get(i5));
                        i5++;
                    }
                    c2755b.addAll(list6);
                    listL = AbstractC3935e.l(c2755b);
                }
            }
            AbstractC3340k.e(listL, "<set-?>");
            b10.f6014h = listL;
            if (b5.f6013g.length() > 0) {
                String str5 = b5.f6013g;
                AbstractC3340k.e(str5, "<set-?>");
                b10.f6013g = str5;
            }
            Jd.z zVar2 = new Jd.z(8);
            xg.g.l(zVar2, b10.f6015i);
            Jd.z value = b5.f6015i;
            AbstractC3340k.e(value, "value");
            b10.f6015i = value;
            b10.f6016j = new S3.l(value);
            for (Map.Entry entry3 : zVar2.b()) {
                String name = (String) entry3.getKey();
                List list7 = (List) entry3.getValue();
                Jd.z zVar3 = b10.f6015i;
                zVar3.getClass();
                AbstractC3340k.e(name, "name");
                if (!((Map) zVar3.f421a).containsKey(name)) {
                    b10.f6015i.f(name, list7);
                }
            }
            xg.g.U(b5, b10);
        }
        Nd.d dVar = c0340h.f2108c;
        for (Nd.a key : ff.o.S0(dVar.c().keySet())) {
            Nd.d dVar2 = cVar.f4050f;
            dVar2.getClass();
            AbstractC3340k.e(key, "key");
            if (!dVar2.c().containsKey(key)) {
                cVar.f4050f.e(key, dVar.b(key));
            }
        }
        cVar.f4047c.B();
        cVar.f4047c.A(new Jd.o(values));
        vg.b bVar2 = AbstractC0343k.f2122a;
        StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Applied DefaultRequest to ", string, ". New url: ");
        sbW.append(cVar.f4045a);
        bVar2.s(sbW.toString());
        return C2515C.f34653a;
    }
}
