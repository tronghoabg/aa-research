package v9;

import A.AbstractC0213f;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Timestamp;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ka.C1;
import ka.C3216C;
import ka.C3219a1;
import ka.C3222b1;
import ka.C3231e1;
import ka.C3232f;
import ka.C3235g;
import ka.C3237g1;
import ka.C3240h1;
import ka.C3255m1;
import ka.C3258n1;
import ka.C3268r0;
import ka.C3270s0;
import ka.D;
import ka.E1;
import ka.EnumC3234f1;
import ka.F;
import ka.G1;
import ka.H;
import ka.L0;
import ka.M0;
import ka.N0;
import ka.O0;
import ka.P;
import ka.P0;
import ka.Q;
import ka.Q0;
import ka.Q1;
import ka.R0;
import ka.S0;
import ka.T0;
import ka.U0;
import ka.V0;
import ka.W0;
import ka.X;
import ka.X0;
import ka.Y;
import ka.Z;
import ka.Z0;
import p9.C3776A;
import p9.C3782c;
import p9.C3783d;
import p9.C3789j;
import p9.EnumC3788i;
import t9.C4150a;
import t9.C4151b;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final s9.f f47101a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47102b;

    public o(s9.f fVar) {
        this.f47101a = fVar;
        List listAsList = Arrays.asList("projects", fVar.f45370a, "databases", fVar.f45371b);
        s9.m mVar = s9.m.f45388b;
        this.f47102b = (listAsList.isEmpty() ? s9.m.f45388b : new s9.m(listAsList)).c();
    }

    public static p9.k a(Z0 z02) {
        int i5 = 1;
        int iOrdinal = z02.h().ordinal();
        if (iOrdinal == 0) {
            Q0 q0E = z02.e();
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = q0E.e().iterator();
            while (it.hasNext()) {
                arrayList.add(a((Z0) it.next()));
            }
            int iOrdinal2 = q0E.f().ordinal();
            if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    A6.c.s("Only AND and OR composite filter types are supported.", new Object[0]);
                    throw null;
                }
                i5 = 2;
            }
            return new C3783d(i5, arrayList);
        }
        EnumC3788i enumC3788i = EnumC3788i.NOT_EQUAL;
        EnumC3788i enumC3788i2 = EnumC3788i.EQUAL;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                A6.c.s("Unrecognized Filter.filterType %d", z02.h());
                throw null;
            }
            C3237g1 c3237g1I = z02.i();
            s9.j jVarL = s9.j.l(c3237g1I.e().d());
            int iOrdinal3 = c3237g1I.f().ordinal();
            if (iOrdinal3 == 1) {
                return C3789j.e(jVarL, enumC3788i2, s9.p.f45391a);
            }
            if (iOrdinal3 == 2) {
                return C3789j.e(jVarL, enumC3788i2, s9.p.f45392b);
            }
            if (iOrdinal3 == 3) {
                return C3789j.e(jVarL, enumC3788i, s9.p.f45391a);
            }
            if (iOrdinal3 == 4) {
                return C3789j.e(jVarL, enumC3788i, s9.p.f45392b);
            }
            A6.c.s("Unrecognized UnaryFilter.operator %d", c3237g1I.f());
            throw null;
        }
        U0 u0G = z02.g();
        s9.j jVarL2 = s9.j.l(u0G.f().d());
        T0 t0G = u0G.g();
        switch (t0G.ordinal()) {
            case 1:
                enumC3788i = EnumC3788i.LESS_THAN;
                break;
            case 2:
                enumC3788i = EnumC3788i.LESS_THAN_OR_EQUAL;
                break;
            case 3:
                enumC3788i = EnumC3788i.GREATER_THAN;
                break;
            case 4:
                enumC3788i = EnumC3788i.GREATER_THAN_OR_EQUAL;
                break;
            case 5:
                enumC3788i = enumC3788i2;
                break;
            case 6:
                break;
            case 7:
                enumC3788i = EnumC3788i.ARRAY_CONTAINS;
                break;
            case 8:
                enumC3788i = EnumC3788i.IN;
                break;
            case 9:
                enumC3788i = EnumC3788i.ARRAY_CONTAINS_ANY;
                break;
            case 10:
                enumC3788i = EnumC3788i.NOT_IN;
                break;
            default:
                A6.c.s("Unhandled FieldFilter.operator %d", t0G);
                throw null;
        }
        return C3789j.e(jVarL2, enumC3788i, u0G.h());
    }

    public static t9.j d(Q1 q12, s9.o oVar) {
        s9.o oVarF = f(q12.d());
        if (!s9.o.f45389b.equals(oVarF)) {
            oVar = oVarF;
        }
        int iC = q12.c();
        ArrayList arrayList = new ArrayList(iC);
        for (int i5 = 0; i5 < iC; i5++) {
            arrayList.add(q12.b(i5));
        }
        return new t9.j(oVar, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    public static C3776A e(String str, C3240h1 c3240h1) {
        s9.m mVar;
        String strE;
        List listSingletonList;
        List arrayList;
        int i5;
        s9.m mVarL = s9.m.l(str);
        A6.c.z(n(mVarL), "Tried to deserialize invalid key %s", mVarL);
        s9.m mVarM = mVarL.f45369a.size() == 4 ? s9.m.f45388b : m(mVarL);
        int iK = c3240h1.k();
        if (iK <= 0) {
            mVar = mVarM;
            strE = null;
        } else {
            A6.c.z(iK == 1, "StructuredQuery.from with more than one collection is not supported.", new Object[0]);
            N0 n0J = c3240h1.j();
            if (n0J.d()) {
                mVar = mVarM;
                strE = n0J.e();
            } else {
                mVarM = (s9.m) mVarM.a(n0J.e());
                mVar = mVarM;
                strE = null;
            }
        }
        if (c3240h1.t()) {
            p9.k kVarA = a(c3240h1.p());
            if (kVarA instanceof C3783d) {
                C3783d c3783d = (C3783d) kVarA;
                ArrayList arrayList2 = c3783d.f43344a;
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((p9.k) it.next()) instanceof C3783d) {
                            break;
                        }
                    } else if (c3783d.e()) {
                        listSingletonList = DesugarCollections.unmodifiableList(arrayList2);
                    }
                }
                listSingletonList = Collections.singletonList(kVarA);
            } else {
                listSingletonList = Collections.singletonList(kVarA);
            }
        } else {
            listSingletonList = Collections.EMPTY_LIST;
        }
        List list = listSingletonList;
        int iN = c3240h1.n();
        if (iN > 0) {
            arrayList = new ArrayList(iN);
            for (int i10 = 0; i10 < iN; i10++) {
                C3222b1 c3222b1M = c3240h1.m(i10);
                s9.j jVarL = s9.j.l(c3222b1M.e().d());
                int iOrdinal = c3222b1M.d().ordinal();
                if (iOrdinal != 1) {
                    i5 = 2;
                    if (iOrdinal != 2) {
                        A6.c.s("Unrecognized direction %d", c3222b1M.d());
                        throw null;
                    }
                } else {
                    i5 = 1;
                }
                arrayList.add(new p9.t(i5, jVarL));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        return new C3776A(mVar, strE, list, arrayList, c3240h1.r() ? c3240h1.l().getValue() : -1L, c3240h1.s() ? new C3782c(c3240h1.o().getValuesList(), c3240h1.o().d()) : null, c3240h1.q() ? new C3782c(c3240h1.i().getValuesList(), !c3240h1.i().d()) : null);
    }

    public static s9.o f(Timestamp timestamp) {
        return (timestamp.getSeconds() == 0 && timestamp.getNanos() == 0) ? s9.o.f45389b : new s9.o(new s8.q(timestamp.getSeconds(), timestamp.getNanos()));
    }

    public static Z0 g(p9.k kVar) {
        P0 p02;
        T0 t02;
        if (!(kVar instanceof C3789j)) {
            if (!(kVar instanceof C3783d)) {
                A6.c.s("Unrecognized filter type %s", kVar.toString());
                throw null;
            }
            C3783d c3783d = (C3783d) kVar;
            ArrayList arrayList = new ArrayList(DesugarCollections.unmodifiableList(c3783d.f43344a).size());
            Iterator it = DesugarCollections.unmodifiableList(c3783d.f43344a).iterator();
            while (it.hasNext()) {
                arrayList.add(g((p9.k) it.next()));
            }
            if (arrayList.size() == 1) {
                return (Z0) arrayList.get(0);
            }
            O0 o0G = Q0.g();
            int iF = AbstractC0213f.f(c3783d.f43345b);
            if (iF == 0) {
                p02 = P0.AND;
            } else {
                if (iF != 1) {
                    A6.c.s("Unrecognized composite filter type.", new Object[0]);
                    throw null;
                }
                p02 = P0.OR;
            }
            o0G.b(p02);
            o0G.a(arrayList);
            X0 x0J = Z0.j();
            x0J.a(o0G);
            return (Z0) x0J.build();
        }
        C3789j c3789j = (C3789j) kVar;
        EnumC3788i enumC3788i = c3789j.f43371a;
        EnumC3788i enumC3788i2 = EnumC3788i.EQUAL;
        s9.j jVar = c3789j.f43373c;
        C1 c12 = c3789j.f43372b;
        if (enumC3788i == enumC3788i2 || enumC3788i == EnumC3788i.NOT_EQUAL) {
            C3231e1 c3231e1G = C3237g1.g();
            V0 v0E = W0.e();
            v0E.a(jVar.c());
            c3231e1G.a((W0) v0E.build());
            C1 c13 = s9.p.f45391a;
            if (c12 != null && Double.isNaN(c12.getDoubleValue())) {
                c3231e1G.b(enumC3788i == enumC3788i2 ? EnumC3234f1.IS_NAN : EnumC3234f1.IS_NOT_NAN);
                X0 x0J2 = Z0.j();
                x0J2.c(c3231e1G);
                return (Z0) x0J2.build();
            }
            if (c12 != null && c12.v() == 1) {
                c3231e1G.b(enumC3788i == enumC3788i2 ? EnumC3234f1.IS_NULL : EnumC3234f1.IS_NOT_NULL);
                X0 x0J3 = Z0.j();
                x0J3.c(c3231e1G);
                return (Z0) x0J3.build();
            }
        }
        S0 s0I = U0.i();
        V0 v0E2 = W0.e();
        v0E2.a(jVar.c());
        s0I.a((W0) v0E2.build());
        switch (enumC3788i) {
            case LESS_THAN:
                t02 = T0.LESS_THAN;
                break;
            case LESS_THAN_OR_EQUAL:
                t02 = T0.LESS_THAN_OR_EQUAL;
                break;
            case EQUAL:
                t02 = T0.EQUAL;
                break;
            case NOT_EQUAL:
                t02 = T0.NOT_EQUAL;
                break;
            case GREATER_THAN:
                t02 = T0.GREATER_THAN;
                break;
            case GREATER_THAN_OR_EQUAL:
                t02 = T0.GREATER_THAN_OR_EQUAL;
                break;
            case ARRAY_CONTAINS:
                t02 = T0.ARRAY_CONTAINS;
                break;
            case ARRAY_CONTAINS_ANY:
                t02 = T0.ARRAY_CONTAINS_ANY;
                break;
            case IN:
                t02 = T0.IN;
                break;
            case NOT_IN:
                t02 = T0.NOT_IN;
                break;
            default:
                A6.c.s("Unknown operator %d", enumC3788i);
                throw null;
        }
        s0I.b(t02);
        s0I.c(c12);
        X0 x0J4 = Z0.j();
        x0J4.b(s0I);
        return (Z0) x0J4.build();
    }

    public static String k(s9.f fVar, s9.m mVar) {
        List listAsList = Arrays.asList("projects", fVar.f45370a, "databases", fVar.f45371b);
        s9.m mVar2 = s9.m.f45388b;
        return ((s9.m) ((s9.m) (listAsList.isEmpty() ? s9.m.f45388b : new s9.m(listAsList)).a("documents")).b(mVar)).c();
    }

    public static Timestamp l(s8.q qVar) {
        Timestamp.Builder builderNewBuilder = Timestamp.newBuilder();
        builderNewBuilder.setSeconds(qVar.f45352a);
        builderNewBuilder.setNanos(qVar.f45353b);
        return builderNewBuilder.build();
    }

    public static s9.m m(s9.m mVar) {
        A6.c.z(mVar.f45369a.size() > 4 && mVar.g(4).equals("documents"), "Tried to deserialize invalid key %s", mVar);
        return (s9.m) mVar.j();
    }

    public static boolean n(s9.m mVar) {
        return mVar.f45369a.size() >= 4 && mVar.g(0).equals("projects") && mVar.g(2).equals("databases");
    }

    public final s9.h b(String str) {
        s9.m mVarL = s9.m.l(str);
        A6.c.z(n(mVarL), "Tried to deserialize invalid key %s", mVarL);
        String strG = mVarL.g(1);
        s9.f fVar = this.f47101a;
        A6.c.z(strG.equals(fVar.f45370a), "Tried to deserialize key from different project.", new Object[0]);
        A6.c.z(mVarL.g(3).equals(fVar.f45371b), "Tried to deserialize key from different database.", new Object[0]);
        return new s9.h(m(mVarL));
    }

    public final t9.h c(G1 g12) {
        t9.m mVarA;
        t9.g gVar;
        if (g12.p()) {
            C3270s0 c3270s0H = g12.h();
            int iF = AbstractC0213f.f(c3270s0H.d());
            if (iF == 0) {
                mVarA = t9.m.a(c3270s0H.f());
            } else if (iF == 1) {
                mVarA = new t9.m(f(c3270s0H.g()), null);
            } else {
                if (iF != 2) {
                    A6.c.s("Unknown precondition", new Object[0]);
                    throw null;
                }
                mVarA = t9.m.f45963c;
            }
        } else {
            mVarA = t9.m.f45963c;
        }
        t9.m mVar = mVarA;
        ArrayList arrayList = new ArrayList();
        for (Z z2 : g12.n()) {
            int iF2 = AbstractC0213f.f(z2.l());
            if (iF2 == 0) {
                A6.c.z(z2.k() == Y.REQUEST_TIME, "Unknown transform setToServerValue: %s", z2.k());
                gVar = new t9.g(s9.j.l(z2.h()), t9.n.f45966a);
            } else if (iF2 == 1) {
                gVar = new t9.g(s9.j.l(z2.h()), new t9.k(z2.i()));
            } else if (iF2 == 4) {
                gVar = new t9.g(s9.j.l(z2.h()), new C4151b(z2.g().getValuesList()));
            } else {
                if (iF2 != 5) {
                    A6.c.s("Unknown FieldTransform proto: %s", z2);
                    throw null;
                }
                gVar = new t9.g(s9.j.l(z2.h()), new C4150a(z2.j().getValuesList()));
            }
            arrayList.add(gVar);
        }
        int iOrdinal = g12.j().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return new t9.e(b(g12.i()), mVar);
            }
            if (iOrdinal == 2) {
                return new t9.q(b(g12.o()), mVar);
            }
            A6.c.s("Unknown mutation operation: %d", g12.j());
            throw null;
        }
        if (!g12.s()) {
            return new t9.o(b(g12.l().getName()), s9.l.e(g12.l().getFieldsMap()), mVar, arrayList);
        }
        s9.h hVarB = b(g12.l().getName());
        s9.l lVarE = s9.l.e(g12.l().getFieldsMap());
        Q qM = g12.m();
        int iE = qM.e();
        HashSet hashSet = new HashSet(iE);
        for (int i5 = 0; i5 < iE; i5++) {
            hashSet.add(s9.j.l(qM.d(i5)));
        }
        return new t9.l(hVarB, lVarE, new t9.f(hashSet), mVar, arrayList);
    }

    public final String h(s9.h hVar) {
        return k(this.f47101a, hVar.f45375a);
    }

    public final G1 i(t9.h hVar) {
        C3270s0 c3270s0;
        GeneratedMessageLite generatedMessageLiteBuild;
        E1 e1T = G1.t();
        if (hVar instanceof t9.o) {
            s9.h hVar2 = hVar.f45951a;
            s9.l lVar = ((t9.o) hVar).f45967d;
            F fG = H.g();
            fG.b(h(hVar2));
            fG.a(lVar.b().s().getFieldsMap());
            e1T.d((H) fG.build());
        } else if (hVar instanceof t9.l) {
            s9.h hVar3 = hVar.f45951a;
            s9.l lVar2 = ((t9.l) hVar).f45961d;
            F fG2 = H.g();
            fG2.b(h(hVar3));
            fG2.a(lVar2.b().s().getFieldsMap());
            e1T.d((H) fG2.build());
            P pF = Q.f();
            Iterator it = ((t9.l) hVar).f45962e.f45948a.iterator();
            while (it.hasNext()) {
                pF.a(((s9.j) it.next()).c());
            }
            e1T.e((Q) pF.build());
        } else if (hVar instanceof t9.e) {
            e1T.c(h(hVar.f45951a));
        } else {
            if (!(hVar instanceof t9.q)) {
                A6.c.s("unknown mutation type %s", hVar.getClass());
                throw null;
            }
            e1T.f(h(hVar.f45951a));
        }
        for (t9.g gVar : hVar.f45953c) {
            t9.p pVar = gVar.f45950b;
            boolean z2 = pVar instanceof t9.n;
            s9.j jVar = gVar.f45949a;
            if (z2) {
                X xM = Z.m();
                xM.b(jVar.c());
                xM.e();
                generatedMessageLiteBuild = xM.build();
            } else if (pVar instanceof C4151b) {
                X xM2 = Z.m();
                xM2.b(jVar.c());
                C3232f c3232fG = C3235g.g();
                c3232fG.a(((C4151b) pVar).f45944a);
                xM2.a(c3232fG);
                generatedMessageLiteBuild = xM2.build();
            } else if (pVar instanceof C4150a) {
                X xM3 = Z.m();
                xM3.b(jVar.c());
                C3232f c3232fG2 = C3235g.g();
                c3232fG2.a(((C4150a) pVar).f45944a);
                xM3.d(c3232fG2);
                generatedMessageLiteBuild = xM3.build();
            } else {
                if (!(pVar instanceof t9.k)) {
                    A6.c.s("Unknown transform: %s", pVar);
                    throw null;
                }
                X xM4 = Z.m();
                xM4.b(jVar.c());
                xM4.c(((t9.k) pVar).f45960a);
                generatedMessageLiteBuild = xM4.build();
            }
            e1T.a((Z) generatedMessageLiteBuild);
        }
        t9.m mVar = hVar.f45952b;
        s9.o oVar = mVar.f45964a;
        Boolean bool = mVar.f45965b;
        if (oVar != null || bool != null) {
            A6.c.z(true ^ (oVar == null && bool == null), "Can't serialize an empty precondition", new Object[0]);
            C3268r0 c3268r0H = C3270s0.h();
            s9.o oVar2 = mVar.f45964a;
            if (oVar2 != null) {
                c3268r0H.b(l(oVar2.f45390a));
                c3270s0 = (C3270s0) c3268r0H.build();
            } else {
                if (bool == null) {
                    A6.c.s("Unknown Precondition", new Object[0]);
                    throw null;
                }
                c3268r0H.a(bool.booleanValue());
                c3270s0 = (C3270s0) c3268r0H.build();
            }
            e1T.b(c3270s0);
        }
        return (G1) e1T.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable, java.lang.Object] */
    public final C3258n1 j(C3776A c3776a) {
        C3255m1 c3255m1G = C3258n1.g();
        L0 l0U = C3240h1.u();
        s9.m mVar = c3776a.f43310d;
        s9.f fVar = this.f47101a;
        String str = c3776a.f43311e;
        if (str != null) {
            A6.c.z(mVar.f45369a.size() % 2 == 0, "Collection Group queries should be within a document path or root.", new Object[0]);
            c3255m1G.a(k(fVar, mVar));
            M0 m0F = N0.f();
            m0F.b(str);
            m0F.a();
            l0U.a(m0F);
        } else {
            A6.c.z(mVar.f45369a.size() % 2 != 0, "Document queries with filters are not supported.", new Object[0]);
            c3255m1G.a(k(fVar, (s9.m) mVar.k()));
            M0 m0F2 = N0.f();
            m0F2.b(mVar.f());
            l0U.a(m0F2);
        }
        List list = c3776a.f43309c;
        if (list.size() > 0) {
            l0U.f(g(new C3783d(1, list)));
        }
        for (p9.t tVar : c3776a.f43308b) {
            C3219a1 c3219a1F = C3222b1.f();
            if (AbstractC0213f.b(tVar.f43406a, 1)) {
                c3219a1F.a(R0.ASCENDING);
            } else {
                c3219a1F.a(R0.DESCENDING);
            }
            V0 v0E = W0.e();
            v0E.a(tVar.f43407b.c());
            c3219a1F.b((W0) v0E.build());
            l0U.b((C3222b1) c3219a1F.build());
        }
        long j8 = c3776a.f43312f;
        if (j8 != -1) {
            l0U.d(Int32Value.newBuilder().setValue((int) j8));
        }
        C3782c c3782c = c3776a.f43313g;
        if (c3782c != null) {
            C3216C c3216cF = D.f();
            c3216cF.a(c3782c.f43343b);
            c3216cF.b(c3782c.f43342a);
            l0U.e(c3216cF);
        }
        C3782c c3782c2 = c3776a.f43314h;
        if (c3782c2 != null) {
            C3216C c3216cF2 = D.f();
            c3216cF2.a(c3782c2.f43343b);
            c3216cF2.b(!c3782c2.f43342a);
            l0U.c(c3216cF2);
        }
        c3255m1G.b(l0U);
        return (C3258n1) c3255m1G.build();
    }
}
