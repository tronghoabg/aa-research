package od;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import md.C3533a;
import md.InterfaceC3543k;
import td.C4157a;

/* loaded from: classes5.dex */
public abstract class S1 implements X1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3533a f41807a = new C3533a("io.grpc.internal.GrpcAttributes.securityLevel");

    /* renamed from: b, reason: collision with root package name */
    public static final C3533a f41808b = new C3533a("io.grpc.internal.GrpcAttributes.clientEagAttrs");

    public static InterfaceC3734w0 m() {
        return C3723s1.f42092e == null ? new C3723s1() : new com.moloco.sdk.acm.services.f();
    }

    public static Set n(String str, Map map) {
        md.j0 j0VarValueOf;
        List listC = AbstractC3719r0.c(str, map);
        if (listC == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(md.j0.class);
        for (Object obj : listC) {
            if (obj instanceof Double) {
                Double d3 = (Double) obj;
                int iIntValue = d3.intValue();
                U8.v0.p0(((double) iIntValue) == d3.doubleValue(), "Status code %s is not integral", obj);
                j0VarValueOf = md.k0.d(iIntValue).f40685a;
                U8.v0.p0(j0VarValueOf.f40671a == d3.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new E5.Q("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass(), 12);
                }
                try {
                    j0VarValueOf = md.j0.valueOf((String) obj);
                } catch (IllegalArgumentException e7) {
                    throw new E5.Q("Status code " + obj + " is not valid", e7, 12);
                }
            }
            enumSetNoneOf.add(j0VarValueOf);
        }
        return DesugarCollections.unmodifiableSet(enumSetNoneOf);
    }

    public static List o(Map map) {
        String strH;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List listC = AbstractC3719r0.c("loadBalancingConfig", map);
            if (listC == null) {
                listC = null;
            } else {
                AbstractC3719r0.a(listC);
            }
            arrayList.addAll(listC);
        }
        if (arrayList.isEmpty() && (strH = AbstractC3719r0.h("loadBalancingPolicy", map)) != null) {
            arrayList.add(Collections.singletonMap(strH.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static md.d0 s(List list, md.Q q4) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Q1 q12 = (Q1) it.next();
            String str = q12.f41792a;
            md.P pC = q4.c(str);
            if (pC != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(S1.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                md.d0 d0VarC = pC.c(q12.f41793b);
                return d0VarC.f40632a != null ? d0VarC : new md.d0(new R1(pC, d0VarC.f40633b));
            }
            arrayList.add(str);
        }
        return new md.d0(md.k0.f40676g.h("None of " + arrayList + " specified by Service Config are available."));
    }

    public static List t(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map.size() != 1) {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            arrayList.add(new Q1(str, AbstractC3719r0.g(str, map)));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // od.X1
    public void a(InterfaceC3543k interfaceC3543k) {
        ((AbstractC3671b) this).f41918d.a(interfaceC3543k);
    }

    @Override // od.X1
    public void c(C4157a c4157a) {
        try {
            if (!((AbstractC3671b) this).f41918d.isClosed()) {
                ((AbstractC3671b) this).f41918d.c(c4157a);
            }
        } finally {
            AbstractC3669a0.b(c4157a);
        }
    }

    @Override // od.X1
    public void d(int i5) {
        pd.j jVar = ((pd.k) this).f43536n;
        jVar.getClass();
        Xd.b.b();
        R3.c cVar = new R3.c(jVar, i5, 5);
        synchronized (jVar.f43528w) {
            cVar.run();
        }
    }

    @Override // od.X1
    public void flush() {
        W w2 = ((AbstractC3671b) this).f41918d;
        if (w2.isClosed()) {
            return;
        }
        w2.flush();
    }

    @Override // od.X1
    public void h() {
        pd.j jVar = ((pd.k) this).f43536n;
        W0 w02 = jVar.f41873d;
        w02.f41825a = jVar;
        jVar.f41870a = w02;
    }

    public abstract int p();

    public abstract boolean q(P1 p12);

    public abstract void r(P1 p12);
}
