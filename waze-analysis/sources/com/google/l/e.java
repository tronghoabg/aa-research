package com.google.l;

import com.google.l.b.a.aa;
import com.google.l.b.a.ae;
import com.google.l.b.a.bo;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    static final com.google.l.b.e f12446a;

    /* renamed from: b, reason: collision with root package name */
    static final com.google.l.b.a.i f12447b;

    /* renamed from: c, reason: collision with root package name */
    static final e f12448c;

    /* renamed from: d, reason: collision with root package name */
    static final List f12449d;
    private static final b y = b.f12217a;
    private static final int z = 1;
    private static final int A = 1;
    private static final int B = 2;

    /* renamed from: e, reason: collision with root package name */
    final com.google.l.b.g f12450e = com.google.l.b.g.f12371a;
    final int u = 1;
    final int v = z;

    /* renamed from: f, reason: collision with root package name */
    final Map f12451f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    final List f12452g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    final List f12453h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    final boolean f12454i = false;

    /* renamed from: j, reason: collision with root package name */
    final String f12455j = null;

    /* renamed from: k, reason: collision with root package name */
    final int f12456k = 2;

    /* renamed from: l, reason: collision with root package name */
    final int f12457l = 2;
    final boolean m = false;
    final boolean n = false;
    final boolean o = true;
    final b p = y;
    final boolean q = false;
    final s r = null;
    final boolean s = true;
    final int w = A;
    final int x = B;
    final ArrayDeque t = new ArrayDeque();

    static {
        com.google.l.b.e eVar = new com.google.l.b.e(Collections.EMPTY_MAP, Collections.EMPTY_LIST);
        f12446a = eVar;
        com.google.l.b.a.i iVar = new com.google.l.b.a.i(eVar);
        f12447b = iVar;
        e eVar2 = new e();
        f12448c = eVar2;
        f12449d = eVar2.b(eVar, iVar);
    }

    static List c(Collection collection) {
        if (collection.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        if (collection.size() == 1) {
            return Collections.singletonList(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
        }
        return DesugarCollections.unmodifiableList(Arrays.asList(collection.toArray()));
    }

    public final d a() {
        return new d(this);
    }

    final List b(com.google.l.b.e eVar, com.google.l.b.a.i iVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bo.Z);
        arrayList.add(com.google.l.b.a.t.a(this.w));
        com.google.l.b.g gVar = this.f12450e;
        arrayList.add(gVar);
        List list = this.f12452g;
        if (!list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(list);
            Collections.reverse(arrayList2);
            arrayList.addAll(arrayList2);
        }
        List list2 = this.f12453h;
        if (!list2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(list2);
            Collections.reverse(arrayList3);
            arrayList.addAll(arrayList3);
        }
        v vVar = com.google.l.b.c.g.f12357a;
        arrayList.add(bo.F);
        arrayList.add(bo.m);
        arrayList.add(bo.f12269g);
        arrayList.add(bo.f12271i);
        arrayList.add(bo.f12273k);
        u uVar = bo.t;
        arrayList.add(bo.g(Long.TYPE, Long.class, uVar));
        arrayList.add(bo.g(Double.TYPE, Double.class, bo.v));
        arrayList.add(bo.g(Float.TYPE, Float.class, bo.u));
        arrayList.add(com.google.l.b.a.r.a(this.x));
        arrayList.add(bo.o);
        arrayList.add(bo.q);
        arrayList.add(bo.f(AtomicLong.class, bo.b(uVar)));
        arrayList.add(bo.f(AtomicLongArray.class, bo.c(uVar)));
        arrayList.add(bo.s);
        arrayList.add(bo.x);
        arrayList.add(bo.H);
        arrayList.add(bo.J);
        arrayList.add(bo.A);
        arrayList.add(bo.C);
        arrayList.add(bo.E);
        arrayList.add(bo.L);
        arrayList.add(bo.N);
        arrayList.add(bo.R);
        arrayList.add(bo.T);
        arrayList.add(bo.X);
        arrayList.add(bo.P);
        arrayList.add(bo.f12266d);
        arrayList.add(com.google.l.b.a.f.f12276a);
        arrayList.add(bo.V);
        v vVarD = bo.d();
        if (vVarD != null) {
            arrayList.add(vVarD);
        }
        arrayList.addAll(com.google.l.b.c.g.f12360d);
        arrayList.add(com.google.l.b.a.a.f12222a);
        arrayList.add(bo.f12264b);
        arrayList.add(new com.google.l.b.a.p(eVar, 1));
        arrayList.add(new com.google.l.b.a.p(eVar, 0));
        arrayList.add(iVar);
        arrayList.add(bo.aa);
        arrayList.add(new aa(eVar, this.v, gVar, iVar, c(this.t)));
        arrayList.trimToSize();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final void d(Type type, Object obj) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(obj);
        boolean z2 = obj instanceof p;
        if (!z2 && !(obj instanceof h) && !(obj instanceof f) && !(obj instanceof u)) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not implement any supported type adapter class or interface");
        }
        if (type == Object.class) {
            throw new IllegalArgumentException("Cannot override built-in adapter for ".concat(type.toString()));
        }
        if (obj instanceof f) {
            this.f12451f.put(type, (f) obj);
        }
        if (z2 || (obj instanceof h)) {
            this.f12452g.add(ae.c(com.google.l.c.a.b(type), obj));
        }
        if (obj instanceof u) {
            this.f12452g.add(bo.e(com.google.l.c.a.b(type), (u) obj));
        }
    }
}
