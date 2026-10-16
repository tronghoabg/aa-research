package m9;

import A7.AbstractC0279p0;
import E5.C0441b;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.NullValue;
import com.google.protobuf.Timestamp;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ka.AbstractC3256n;
import ka.B1;
import ka.C1;
import ka.C3232f;
import ka.C3235g;
import ka.C3257n0;
import ka.C3263p0;
import ne.C3618a;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import t9.C4150a;
import t9.C4151b;
import w9.AbstractC4391j;
import w9.AbstractC4397p;
import w9.C4390i;

/* loaded from: classes4.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final s9.f f40480a;

    public f0(s9.f fVar) {
        this.f40480a = fVar;
    }

    public static C1 h(s8.q qVar) {
        int i5 = (qVar.f45353b / 1000) * 1000;
        B1 b1W = C1.w();
        b1W.o(Timestamp.newBuilder().setSeconds(qVar.f45352a).setNanos(i5));
        return (C1) b1W.build();
    }

    public final s9.l a(Object obj, C0441b c0441b) {
        if (obj.getClass().isArray()) {
            throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was an array");
        }
        C1 c1D = d(AbstractC4391j.b(obj, C4390i.f47439d), c0441b);
        if (c1D.v() == 11) {
            return new s9.l(c1D);
        }
        B b5 = AbstractC4397p.f47455a;
        throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was of type: ".concat(obj.getClass().getName()));
    }

    public final C1 b(Object obj, C0441b c0441b) {
        return d(AbstractC4391j.b(obj, C4390i.f47439d), c0441b);
    }

    public final ArrayList c(List list) {
        E4.n nVar = new E4.n(4, 19);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            arrayList.add(b(list.get(i5), new C0441b((E4.n) nVar.x().f3291c, null, true, 13)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1 d(Object obj, C0441b c0441b) {
        int i5 = 13;
        boolean z2 = obj instanceof Map;
        E4.n nVar = (E4.n) c0441b.f3291c;
        s9.j jVar = (s9.j) c0441b.f3292d;
        Comparable comparable = null;
        Object[] objArr = 0;
        if (z2) {
            Map map = (Map) obj;
            if (map.isEmpty()) {
                if (jVar != null && !jVar.h()) {
                    c0441b.a(jVar);
                }
                B1 b1W = C1.w();
                b1W.k(C3263p0.c());
                return (C1) b1W.build();
            }
            C3257n0 c3257n0F = C3263p0.f();
            for (Map.Entry entry : map.entrySet()) {
                if (!(entry.getKey() instanceof String)) {
                    throw c0441b.f(String.format("Non-String Map key (%s) is not allowed", entry.getValue()));
                }
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                C0441b c0441b2 = new C0441b(nVar, jVar == null ? null : (s9.j) jVar.a(str), objArr == true ? 1 : 0, i5);
                c0441b2.q(str);
                C1 c1D = d(value, c0441b2);
                if (c1D != null) {
                    c3257n0F.b(str, c1D);
                }
            }
            B1 b1W2 = C1.w();
            b1W2.j(c3257n0F);
            return (C1) b1W2.build();
        }
        if (obj instanceof AbstractC3524x) {
            AbstractC3524x abstractC3524x = (AbstractC3524x) obj;
            if (!c0441b.h()) {
                throw c0441b.f(abstractC3524x.a().concat("() can only be used with set() and update()"));
            }
            if (jVar == null) {
                throw c0441b.f(abstractC3524x.a().concat("() is not currently supported inside arrays"));
            }
            if (abstractC3524x instanceof C3521u) {
                int i10 = nVar.f2938b;
                if (i10 == 2) {
                    c0441b.a(jVar);
                    return null;
                }
                if (i10 != 3) {
                    throw c0441b.f("FieldValue.delete() can only be used with update() and set() with SetOptions.merge()");
                }
                A6.c.z(jVar.f45369a.size() > 0, "FieldValue.delete() at the top level should have already been handled.", new Object[0]);
                throw c0441b.f("FieldValue.delete() can only appear at the top level of your update data");
            }
            if (abstractC3524x instanceof C3523w) {
                c0441b.b(jVar, t9.n.f45966a);
                return null;
            }
            if (abstractC3524x instanceof C3520t) {
                c0441b.b(jVar, new C4151b(c(((C3520t) abstractC3524x).f40510c)));
                return null;
            }
            if (abstractC3524x instanceof C3519s) {
                c0441b.b(jVar, new C4150a(c(((C3519s) abstractC3524x).f40509c)));
                return null;
            }
            if (abstractC3524x instanceof C3522v) {
                c0441b.b(jVar, new t9.k(f(((C3522v) abstractC3524x).f40511c, false)));
                return null;
            }
            B b5 = AbstractC4397p.f47455a;
            A6.c.s("Unknown FieldValue type: %s", abstractC3524x == null ? "null" : abstractC3524x.getClass().getName());
            throw null;
        }
        if (jVar != null) {
            c0441b.a(jVar);
        }
        if (obj instanceof List) {
            if (c0441b.f3290b && nVar.f2938b != 5) {
                throw c0441b.f("Nested arrays are not supported");
            }
            C3232f c3232fG = C3235g.g();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                C1 c1D2 = d(it.next(), new C0441b(nVar, comparable, z, i5));
                if (c1D2 == null) {
                    B1 b1W3 = C1.w();
                    b1W3.l(NullValue.NULL_VALUE);
                    c1D2 = (C1) b1W3.build();
                }
                c3232fG.b(c1D2);
            }
            B1 b1W4 = C1.w();
            b1W4.b(c3232fG);
            return (C1) b1W4.build();
        }
        if (obj == null) {
            B1 b1W5 = C1.w();
            b1W5.l(NullValue.NULL_VALUE);
            return (C1) b1W5.build();
        }
        if (obj instanceof Integer) {
            B1 b1W6 = C1.w();
            b1W6.h(((Integer) obj).intValue());
            return (C1) b1W6.build();
        }
        if (obj instanceof Long) {
            B1 b1W7 = C1.w();
            b1W7.h(((Long) obj).longValue());
            return (C1) b1W7.build();
        }
        if (obj instanceof Float) {
            B1 b1W8 = C1.w();
            b1W8.f(((Float) obj).doubleValue());
            return (C1) b1W8.build();
        }
        if (obj instanceof Double) {
            B1 b1W9 = C1.w();
            b1W9.f(((Double) obj).doubleValue());
            return (C1) b1W9.build();
        }
        if (obj instanceof Boolean) {
            B1 b1W10 = C1.w();
            b1W10.d(((Boolean) obj).booleanValue());
            return (C1) b1W10.build();
        }
        if (obj instanceof String) {
            B1 b1W11 = C1.w();
            b1W11.n((String) obj);
            return (C1) b1W11.build();
        }
        if (obj instanceof Date) {
            return h(new s8.q((Date) obj));
        }
        if (obj instanceof s8.q) {
            return h((s8.q) obj);
        }
        if (obj instanceof J) {
            J j8 = (J) obj;
            B1 b1W12 = C1.w();
            Ia.b bVarG = Ia.c.g();
            bVarG.a(j8.f40437a);
            bVarG.b(j8.f40438b);
            b1W12.g(bVarG);
            return (C1) b1W12.build();
        }
        if (obj instanceof C3508g) {
            B1 b1W13 = C1.w();
            b1W13.e(((C3508g) obj).f40481a);
            return (C1) b1W13.build();
        }
        if (!(obj instanceof C3514m)) {
            if (!(obj instanceof g0)) {
                if (obj.getClass().isArray()) {
                    throw c0441b.f("Arrays are not supported; use a List instead");
                }
                B b10 = AbstractC4397p.f47455a;
                throw c0441b.f("Unsupported type: ".concat(obj.getClass().getName()));
            }
            C3257n0 c3257n0F2 = C3263p0.f();
            c3257n0F2.b("__type__", s9.p.f45396f);
            double[] dArr = ((g0) obj).f40482a;
            ArrayList arrayList = new ArrayList(dArr.length);
            for (int i11 = 0; i11 < dArr.length; i11++) {
                arrayList.add(i11, Double.valueOf(dArr[i11]));
            }
            c3257n0F2.b(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, d(arrayList, c0441b));
            B1 b1W14 = C1.w();
            b1W14.j(c3257n0F2);
            return (C1) b1W14.build();
        }
        C3514m c3514m = (C3514m) obj;
        s9.f fVar = this.f40480a;
        String str2 = fVar.f45371b;
        String str3 = fVar.f45370a;
        FirebaseFirestore firebaseFirestore = c3514m.f40496b;
        if (firebaseFirestore != null) {
            s9.f fVar2 = firebaseFirestore.f27324c;
            if (!fVar2.equals(fVar)) {
                StringBuilder sb2 = new StringBuilder("Document reference is for database ");
                sb2.append(fVar2.f45370a);
                sb2.append("/");
                AbstractC3256n.p(sb2, fVar2.f45371b, " but should be for database ", str3, "/");
                sb2.append(str2);
                throw c0441b.f(sb2.toString());
            }
        }
        B1 b1W15 = C1.w();
        String strD = c3514m.d();
        StringBuilder sbR = AbstractC0279p0.r("projects/", str3, "/databases/", str2, "/documents/");
        sbR.append(strD);
        b1W15.m(sbR.toString());
        return (C1) b1W15.build();
    }

    public final md.J e(Object obj, t9.f fVar) {
        E4.n nVar = new E4.n(2, 19);
        s9.l lVarA = a(obj, nVar.x());
        HashSet hashSet = (HashSet) nVar.f2939c;
        ArrayList arrayList = (ArrayList) nVar.f2940d;
        if (fVar == null) {
            return new md.J(lVarA, new t9.f(hashSet), DesugarCollections.unmodifiableList(arrayList));
        }
        HashSet hashSet2 = fVar.f45948a;
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            s9.j jVar = (s9.j) it.next();
            Iterator it2 = hashSet.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (jVar.i(((t9.g) it3.next()).f45949a)) {
                            break;
                        }
                    }
                    throw new IllegalArgumentException("Field '" + jVar.c() + "' is specified in your field mask but not in your input data.");
                }
                if (jVar.i((s9.j) it2.next())) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            t9.g gVar = (t9.g) it4.next();
            s9.j jVar2 = gVar.f45949a;
            Iterator it5 = hashSet2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                if (((s9.j) it5.next()).i(jVar2)) {
                    arrayList2.add(gVar);
                    break;
                }
            }
        }
        return new md.J(lVarA, fVar, DesugarCollections.unmodifiableList(arrayList2));
    }

    public final C1 f(Object obj, boolean z2) {
        E4.n nVar = new E4.n(z2 ? 5 : 4, 19);
        C1 c1B = b(obj, nVar.x());
        A6.c.z(c1B != null, "Parsed data should not be null.", new Object[0]);
        A6.c.z(((ArrayList) nVar.f2940d).isEmpty(), "Field transforms should have been disallowed.", new Object[0]);
        return c1B;
    }

    public final md.J g(Object obj) {
        E4.n nVar = new E4.n(1, 19);
        return new md.J(a(obj, nVar.x()), (t9.f) null, DesugarCollections.unmodifiableList((ArrayList) nVar.f2940d));
    }

    public final C3618a i(Map map) {
        E4.n nVar = new E4.n(3, 19);
        C0441b c0441bX = nVar.x();
        s9.l lVar = new s9.l();
        for (Map.Entry entry : map.entrySet()) {
            r rVarA = r.a((String) entry.getKey());
            Object value = entry.getValue();
            boolean z2 = value instanceof C3521u;
            s9.j jVar = rVarA.f40508a;
            if (z2) {
                c0441bX.a(jVar);
            } else {
                C1 c1B = b(value, c0441bX.c(jVar));
                if (c1B != null) {
                    c0441bX.a(jVar);
                    lVar.g(c1B, jVar);
                }
            }
        }
        return new C3618a(lVar, new t9.f((HashSet) nVar.f2939c), DesugarCollections.unmodifiableList((ArrayList) nVar.f2940d));
    }
}
