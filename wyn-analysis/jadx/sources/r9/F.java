package r9;

import android.database.Cursor;
import ia.C2862b;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeSet;
import ka.AbstractC3230e0;
import ka.C1;
import n9.C3610e;
import ne.C3618a;
import p9.C3776A;
import p9.C3783d;
import p9.C3789j;
import p9.EnumC3788i;
import q9.C3880a;
import q9.C3882c;
import vf.AbstractC4345a;
import w9.AbstractC4397p;
import w9.InterfaceC4388g;

/* loaded from: classes4.dex */
public final class F implements InterfaceC3949f {
    public static final byte[] k = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final K f44555a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.v f44556b;

    /* renamed from: c, reason: collision with root package name */
    public final String f44557c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f44558d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final ad.L f44559e = new ad.L(24);

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f44560f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final PriorityQueue f44561g = new PriorityQueue(10, new q6.d(13));

    /* renamed from: h, reason: collision with root package name */
    public boolean f44562h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f44563i = -1;

    /* renamed from: j, reason: collision with root package name */
    public long f44564j = -1;

    public F(K k5, a2.v vVar, C3610e c3610e) {
        this.f44555a = k5;
        this.f44556b = vVar;
        String str = c3610e.f40955a;
        this.f44557c = str == null ? "" : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (s9.p.f(r5) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        r7 = new java.util.ArrayList(r0);
        r0 = new java.util.ArrayList();
        r8 = r5.m().getValuesList().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (r8.hasNext() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        r10 = (ka.C1) r8.next();
        r11 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        if (r11.hasNext() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        r13 = (q9.C3882c) r11.next();
        r14 = new q9.C3882c();
        r13 = r13.f44176a;
        r13 = java.util.Arrays.copyOf(r13.f44181a, r13.f44182b);
        r15 = r14.f44176a;
        r15.a(r13.length);
        r4 = r13.length;
        r22 = r1;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cd, code lost:
    
        if (r1 >= r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        r16 = r13[r1];
        r17 = r1;
        r1 = r15.f44181a;
        r1 = r15.f44182b;
        r15.f44182b = r1 + 1;
        r1[r1] = r16;
        r1 = r17 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e4, code lost:
    
        r1 = r14.a(r12);
        xg.g.c0(r10, r1);
        r1.S();
        r0.add(r14);
        r1 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f4, code lost:
    
        r22 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object[] a(s9.a r20, p9.C3776A r21, java.util.Collection r22) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.F.a(s9.a, p9.A, java.util.Collection):java.lang.Object[]");
    }

    public static s9.b f(Collection collection) {
        A6.c.z(!collection.isEmpty(), "Found empty index group when looking for least recent index offset.", new Object[0]);
        Iterator it = collection.iterator();
        s9.b bVar = ((s9.a) it.next()).f45359d.f45366b;
        int iMax = bVar.f45364c;
        while (it.hasNext()) {
            s9.b bVar2 = ((s9.a) it.next()).f45359d.f45366b;
            if (bVar2.compareTo(bVar) < 0) {
                bVar = bVar2;
            }
            iMax = Math.max(bVar2.f45364c, iMax);
        }
        return new s9.b(bVar.f45362a, bVar.f45363b, iMax);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        r9.add(((s9.d) r8.get(r10)).f45367a.c());
        r10 = r10 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s9.a b(p9.C3776A r15) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.F.b(p9.A):s9.a");
    }

    @Override // r9.InterfaceC3949f
    public final void c(s9.a aVar) {
        Object[] objArr = {Integer.valueOf(aVar.f45356a)};
        K k5 = this.f44555a;
        k5.f0("DELETE FROM index_configuration WHERE index_id = ?", objArr);
        int i5 = aVar.f45356a;
        k5.f0("DELETE FROM index_entries WHERE index_id = ?", Integer.valueOf(i5));
        k5.f0("DELETE FROM index_state WHERE index_id = ?", Integer.valueOf(i5));
        this.f44561g.remove(aVar);
        Map map = (Map) this.f44560f.get(aVar.f45357b);
        if (map != null) {
            map.remove(Integer.valueOf(i5));
        }
    }

    public final Collection d(String str) {
        A6.c.z(this.f44562h, "IndexManager not started", new Object[0]);
        Map map = (Map) this.f44560f.get(str);
        return map == null ? Collections.EMPTY_LIST : map.values();
    }

    @Override // r9.InterfaceC3949f
    public final void e(s9.a aVar) {
        A6.c.z(this.f44562h, "IndexManager not started", new Object[0]);
        int i5 = this.f44563i + 1;
        String str = aVar.f45357b;
        ArrayList arrayList = aVar.f45358c;
        s9.a aVar2 = new s9.a(i5, str, arrayList, aVar.f45359d);
        Integer numValueOf = Integer.valueOf(i5);
        this.f44556b.getClass();
        C2862b c2862bD = ia.h.d();
        c2862bD.b();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            s9.d dVar = (s9.d) it.next();
            ia.d dVarH = ia.f.h();
            dVarH.b(dVar.f45367a.c());
            int i10 = dVar.f45368b;
            if (i10 == 3) {
                dVarH.a();
            } else if (i10 == 1) {
                dVarH.c(ia.e.ASCENDING);
            } else {
                dVarH.c(ia.e.DESCENDING);
            }
            c2862bD.a(dVarH);
        }
        this.f44555a.f0("INSERT INTO index_configuration (index_id, collection_group, index_proto) VALUES(?, ?, ?)", numValueOf, str, ((ia.h) c2862bD.build()).toByteArray());
        i(aVar2);
    }

    public final List g(C3776A c3776a) {
        List listSingletonList;
        HashMap map = this.f44558d;
        if (map.containsKey(c3776a)) {
            return (List) map.get(c3776a);
        }
        ArrayList arrayList = new ArrayList();
        if (c3776a.f43309c.isEmpty()) {
            arrayList.add(c3776a);
        } else {
            C3783d c3783d = new C3783d(1, c3776a.f43309c);
            if (DesugarCollections.unmodifiableList(c3783d.f43344a).isEmpty()) {
                listSingletonList = Collections.EMPTY_LIST;
            } else {
                p9.k kVarO = Fe.b.o(Fe.b.p(c3783d));
                A6.c.z(Fe.b.G(kVarO), "computeDistributedNormalForm did not result in disjunctive normal form", new Object[0]);
                if (kVarO instanceof C3789j) {
                    listSingletonList = Collections.singletonList(kVarO);
                } else {
                    if (kVarO instanceof C3783d) {
                        C3783d c3783d2 = (C3783d) kVarO;
                        Iterator it = c3783d2.f43344a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((p9.k) it.next()) instanceof C3783d) {
                                    break;
                                }
                            } else if (c3783d2.e()) {
                            }
                        }
                    }
                    listSingletonList = kVarO.b();
                }
            }
            Iterator it2 = listSingletonList.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C3776A(c3776a.f43310d, c3776a.f43311e, ((p9.k) it2.next()).b(), c3776a.f43308b, c3776a.f43312f, c3776a.f43313g, c3776a.f43314h));
            }
        }
        map.put(c3776a, arrayList);
        return arrayList;
    }

    @Override // r9.InterfaceC3949f
    public final String h() {
        A6.c.z(this.f44562h, "IndexManager not started", new Object[0]);
        s9.a aVar = (s9.a) this.f44561g.peek();
        if (aVar != null) {
            return aVar.f45357b;
        }
        return null;
    }

    public final void i(s9.a aVar) {
        HashMap map = this.f44560f;
        String str = aVar.f45357b;
        Map map2 = (Map) map.get(str);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(str, map2);
        }
        int i5 = aVar.f45356a;
        s9.a aVar2 = (s9.a) map2.get(Integer.valueOf(i5));
        PriorityQueue priorityQueue = this.f44561g;
        if (aVar2 != null) {
            priorityQueue.remove(aVar2);
        }
        map2.put(Integer.valueOf(i5), aVar);
        priorityQueue.add(aVar);
        this.f44563i = Math.max(this.f44563i, i5);
        this.f44564j = Math.max(this.f44564j, aVar.f45359d.f45365a);
    }

    @Override // r9.InterfaceC3949f
    public final int k(C3776A c3776a) {
        List listG = g(c3776a);
        Iterator it = listG.iterator();
        int i5 = 3;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C3776A c3776a2 = (C3776A) it.next();
            s9.a aVarB = b(c3776a2);
            if (aVarB == null) {
                i5 = 1;
                break;
            }
            int size = aVarB.f45358c.size();
            HashSet hashSet = new HashSet();
            Iterator it2 = c3776a2.f43309c.iterator();
            int i10 = 0;
            while (it2.hasNext()) {
                for (C3789j c3789j : ((p9.k) it2.next()).c()) {
                    if (!c3789j.f43373c.equals(s9.j.f45378b)) {
                        EnumC3788i enumC3788i = EnumC3788i.ARRAY_CONTAINS;
                        EnumC3788i enumC3788i2 = c3789j.f43371a;
                        if (enumC3788i2.equals(enumC3788i) || enumC3788i2.equals(EnumC3788i.ARRAY_CONTAINS_ANY)) {
                            i10 = 1;
                        } else {
                            hashSet.add(c3789j.f43373c);
                        }
                    }
                }
            }
            for (p9.t tVar : c3776a2.f43308b) {
                if (!tVar.f43407b.equals(s9.j.f45378b)) {
                    hashSet.add(tVar.f43407b);
                }
            }
            if (size < hashSet.size() + i10) {
                i5 = 2;
            }
        }
        if (c3776a.f43312f == -1 || listG.size() <= 1 || i5 != 3) {
            return i5;
        }
        return 2;
    }

    @Override // r9.InterfaceC3949f
    public final s9.b m(String str) {
        Collection collectionD = d(str);
        A6.c.z(!collectionD.isEmpty(), "minOffset was called for collection without indexes", new Object[0]);
        return f(collectionD);
    }

    @Override // r9.InterfaceC3949f
    public final void n(c9.c cVar) {
        int i5;
        byte[] bArrCopyOf;
        int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        A6.c.z(this.f44562h, "IndexManager not started", new Object[0]);
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            s9.m mVar = ((s9.h) entry.getKey()).f45375a;
            for (s9.a aVar : d(mVar.g(mVar.f45369a.size() - i10))) {
                s9.h hVar = (s9.h) entry.getKey();
                TreeSet treeSet = new TreeSet();
                C3618a c3618aG0 = this.f44555a.g0("SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?");
                Integer numValueOf = Integer.valueOf(aVar.f45356a);
                String strC = hVar.f45375a.c();
                String str = this.f44557c;
                Object[] objArr = new Object[3];
                objArr[0] = numValueOf;
                objArr[1] = strC;
                objArr[i10] = str;
                c3618aG0.b(objArr);
                Cursor cursorI = c3618aG0.i();
                while (true) {
                    try {
                        boolean zMoveToNext = cursorI.moveToNext();
                        i5 = aVar.f45356a;
                        if (!zMoveToNext) {
                            break;
                        } else {
                            treeSet.add(new C3880a(i5, hVar, cursorI.getBlob(0), cursorI.getBlob(1)));
                        }
                    } finally {
                    }
                }
                cursorI.close();
                s9.k kVar = (s9.k) entry.getValue();
                TreeSet treeSet2 = new TreeSet();
                C3882c c3882c = new C3882c();
                Iterator it2 = aVar.b().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        q9.e eVar = c3882c.f44176a;
                        bArrCopyOf = Arrays.copyOf(eVar.f44181a, eVar.f44182b);
                        break;
                    }
                    s9.d dVar = (s9.d) it2.next();
                    C1 c1F = kVar.f45384e.f(dVar.f45367a);
                    if (c1F == null) {
                        bArrCopyOf = null;
                        break;
                    } else {
                        AbstractC4345a abstractC4345aA = c3882c.a(dVar.f45368b);
                        xg.g.c0(c1F, abstractC4345aA);
                        abstractC4345aA.S();
                    }
                }
                if (bArrCopyOf != null) {
                    s9.d dVarA = aVar.a();
                    if (dVarA != null) {
                        C1 c1F2 = kVar.f45384e.f(dVarA.f45367a);
                        if (s9.p.f(c1F2)) {
                            for (C1 c12 : c1F2.m().getValuesList()) {
                                C3882c c3882c2 = new C3882c();
                                AbstractC4345a abstractC4345aA2 = c3882c2.a(1);
                                xg.g.c0(c12, abstractC4345aA2);
                                abstractC4345aA2.S();
                                q9.e eVar2 = c3882c2.f44176a;
                                treeSet2.add(new C3880a(i5, kVar.f45380a, Arrays.copyOf(eVar2.f44181a, eVar2.f44182b), bArrCopyOf));
                            }
                        }
                    } else {
                        treeSet2.add(new C3880a(i5, kVar.f45380a, new byte[0], bArrCopyOf));
                    }
                }
                if (!treeSet.equals(treeSet2)) {
                    final s9.k kVar2 = (s9.k) entry.getValue();
                    Ba.c.p("F", "Updating index entries for document '%s'", 1, kVar2.f45380a);
                    InterfaceC4388g interfaceC4388g = new InterfaceC4388g(this) { // from class: r9.C

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ F f44548b;

                        {
                            this.f44548b = this;
                        }

                        @Override // w9.InterfaceC4388g
                        public final void accept(Object obj) {
                            s9.k kVar3 = kVar2;
                            F f10 = this.f44548b;
                            int i13 = i12;
                            C3880a c3880a = (C3880a) obj;
                            f10.getClass();
                            switch (i13) {
                                case 0:
                                    Integer numValueOf2 = Integer.valueOf(c3880a.f44170a);
                                    String strC2 = kVar3.f45380a.f45375a.c();
                                    f10.f44555a.f0("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", numValueOf2, f10.f44557c, c3880a.f44172c, c3880a.f44173d, strC2);
                                    break;
                                default:
                                    Integer numValueOf3 = Integer.valueOf(c3880a.f44170a);
                                    String strC3 = kVar3.f45380a.f45375a.c();
                                    f10.f44555a.f0("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", numValueOf3, f10.f44557c, c3880a.f44172c, c3880a.f44173d, strC3);
                                    break;
                            }
                        }
                    };
                    InterfaceC4388g interfaceC4388g2 = new InterfaceC4388g(this) { // from class: r9.C

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ F f44548b;

                        {
                            this.f44548b = this;
                        }

                        @Override // w9.InterfaceC4388g
                        public final void accept(Object obj) {
                            s9.k kVar3 = kVar2;
                            F f10 = this.f44548b;
                            int i13 = i11;
                            C3880a c3880a = (C3880a) obj;
                            f10.getClass();
                            switch (i13) {
                                case 0:
                                    Integer numValueOf2 = Integer.valueOf(c3880a.f44170a);
                                    String strC2 = kVar3.f45380a.f45375a.c();
                                    f10.f44555a.f0("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", numValueOf2, f10.f44557c, c3880a.f44172c, c3880a.f44173d, strC2);
                                    break;
                                default:
                                    Integer numValueOf3 = Integer.valueOf(c3880a.f44170a);
                                    String strC3 = kVar3.f45380a.f45375a.c();
                                    f10.f44555a.f0("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", numValueOf3, f10.f44557c, c3880a.f44172c, c3880a.f44173d, strC3);
                                    break;
                            }
                        }
                    };
                    m9.B b5 = AbstractC4397p.f47455a;
                    AbstractC4397p.f(treeSet.iterator(), treeSet2.iterator(), treeSet.comparator() != null ? treeSet.comparator() : new q6.d(25), interfaceC4388g, interfaceC4388g2);
                }
                i10 = 2;
            }
        }
    }

    @Override // r9.InterfaceC3949f
    public final void o(String str, s9.b bVar) {
        A6.c.z(this.f44562h, "IndexManager not started", new Object[0]);
        this.f44564j++;
        for (s9.a aVar : d(str)) {
            s9.a aVar2 = new s9.a(aVar.f45356a, aVar.f45357b, aVar.f45358c, new s9.c(this.f44564j, bVar));
            Integer numValueOf = Integer.valueOf(aVar.f45356a);
            Long lValueOf = Long.valueOf(this.f44564j);
            s9.o oVar = bVar.f45362a;
            this.f44555a.f0("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", numValueOf, this.f44557c, lValueOf, Long.valueOf(oVar.f45390a.f45352a), Integer.valueOf(oVar.f45390a.f45353b), AbstractC3230e0.n(bVar.f45363b.f45375a), Integer.valueOf(bVar.f45364c));
            i(aVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Collection] */
    @Override // r9.InterfaceC3949f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List p(p9.C3776A r28) {
        /*
            Method dump skipped, instructions count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.F.p(p9.A):java.util.List");
    }

    @Override // r9.InterfaceC3949f
    public final Collection r() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f44560f.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((Map) it.next()).values());
        }
        return arrayList;
    }

    @Override // r9.InterfaceC3949f
    public final void start() {
        HashMap map = new HashMap();
        K k5 = this.f44555a;
        C3618a c3618aG0 = k5.g0("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?");
        int i5 = 0;
        c3618aG0.b(this.f44557c);
        c3618aG0.f(new C3943D(map, i5));
        k5.g0("SELECT index_id, collection_group, index_proto FROM index_configuration").f(new E(i5, this, map));
        this.f44562h = true;
    }

    @Override // r9.InterfaceC3949f
    public final List t(String str) {
        A6.c.z(this.f44562h, "IndexManager not started", new Object[0]);
        ArrayList arrayList = new ArrayList();
        C3618a c3618aG0 = this.f44555a.g0("SELECT parent FROM collection_parents WHERE collection_id = ?");
        c3618aG0.b(str);
        Cursor cursorI = c3618aG0.i();
        while (cursorI.moveToNext()) {
            try {
                arrayList.add(AbstractC3230e0.l(cursorI.getString(0)));
            } catch (Throwable th) {
                if (cursorI != null) {
                    try {
                        cursorI.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorI.close();
        return arrayList;
    }

    @Override // r9.InterfaceC3949f
    public final void u(s9.m mVar) {
        A6.c.z(this.f44562h, "IndexManager not started", new Object[0]);
        A6.c.z(mVar.f45369a.size() % 2 == 1, "Expected a collection path.", new Object[0]);
        if (this.f44559e.e(mVar)) {
            this.f44555a.f0("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", mVar.f(), AbstractC3230e0.n((s9.m) mVar.k()));
        }
    }

    @Override // r9.InterfaceC3949f
    public final void v() {
        K k5 = this.f44555a;
        k5.f0("DELETE FROM index_configuration", new Object[0]);
        k5.f0("DELETE FROM index_entries", new Object[0]);
        k5.f0("DELETE FROM index_state", new Object[0]);
        this.f44561g.clear();
        this.f44560f.clear();
    }

    @Override // r9.InterfaceC3949f
    public final s9.b x(C3776A c3776a) {
        ArrayList arrayList = new ArrayList();
        Iterator it = g(c3776a).iterator();
        while (it.hasNext()) {
            s9.a aVarB = b((C3776A) it.next());
            if (aVarB != null) {
                arrayList.add(aVarB);
            }
        }
        return f(arrayList);
    }

    @Override // r9.InterfaceC3949f
    public final void y(C3776A c3776a) {
        s9.a aVar;
        A6.c.z(this.f44562h, "IndexManager not started", new Object[0]);
        for (C3776A c3776a2 : g(c3776a)) {
            int iK = k(c3776a2);
            if (iK == 1 || iK == 2) {
                String strF = c3776a2.f43311e;
                if (strF == null) {
                    strF = c3776a2.f43310d.f();
                }
                TreeSet treeSet = new TreeSet(new q6.d(20));
                ArrayList arrayList = new ArrayList();
                Iterator it = c3776a2.f43309c.iterator();
                while (it.hasNext()) {
                    C3789j c3789j = (C3789j) ((p9.k) it.next());
                    if (c3789j.f()) {
                        treeSet.add(c3789j);
                    } else {
                        arrayList.add(c3789j);
                    }
                }
                if (treeSet.size() > 1) {
                    aVar = null;
                } else {
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C3789j c3789j2 = (C3789j) it2.next();
                        if (!c3789j2.f43373c.equals(s9.j.f45378b)) {
                            EnumC3788i enumC3788i = EnumC3788i.ARRAY_CONTAINS;
                            EnumC3788i enumC3788i2 = c3789j2.f43371a;
                            boolean zEquals = enumC3788i2.equals(enumC3788i);
                            s9.j jVar = c3789j2.f43373c;
                            if (zEquals || enumC3788i2.equals(EnumC3788i.ARRAY_CONTAINS_ANY)) {
                                arrayList2.add(new s9.d(3, jVar));
                            } else if (!hashSet.contains(jVar)) {
                                hashSet.add(jVar);
                                arrayList2.add(new s9.d(1, jVar));
                            }
                        }
                    }
                    for (p9.t tVar : c3776a2.f43308b) {
                        if (!tVar.f43407b.equals(s9.j.f45378b)) {
                            s9.j jVar2 = tVar.f43407b;
                            if (!hashSet.contains(jVar2)) {
                                hashSet.add(jVar2);
                                arrayList2.add(new s9.d(tVar.f43406a == 1 ? 1 : 2, jVar2));
                            }
                        }
                    }
                    aVar = new s9.a(-1, strF, arrayList2, s9.a.f45354e);
                }
                if (aVar != null) {
                    e(aVar);
                }
            }
        }
    }
}
