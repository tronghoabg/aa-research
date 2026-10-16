package L8;

import a2.C1323c;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class a implements jb.h {

    /* renamed from: a, reason: collision with root package name */
    public Object f6983a;

    /* renamed from: b, reason: collision with root package name */
    public int f6984b;

    /* renamed from: c, reason: collision with root package name */
    public int f6985c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f6986d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f6987e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f6988f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6989g;

    public a(int i5, int i10) {
        this.f6988f = new LinkedList();
        this.f6986d = new HashSet();
        this.f6987e = new HashSet();
        this.f6989g = new HashMap();
        this.f6983a = "Sqflite";
        this.f6984b = i5;
        this.f6985c = i10;
    }

    @Override // jb.h
    public void a(jb.e eVar, Runnable runnable) {
        jb.f fVar = new jb.f(eVar == null ? null : new C1323c(eVar, 15), runnable);
        synchronized (this) {
            ((LinkedList) this.f6988f).add(fVar);
            Iterator it = new HashSet((HashSet) this.f6986d).iterator();
            while (it.hasNext()) {
                g((jb.g) it.next());
            }
        }
    }

    @Override // jb.h
    public synchronized void b() {
        try {
            Iterator it = ((HashSet) this.f6986d).iterator();
            while (it.hasNext()) {
                ((jb.g) it.next()).a();
            }
            Iterator it2 = ((HashSet) this.f6987e).iterator();
            while (it2.hasNext()) {
                ((jb.g) it2.next()).a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void c(l lVar) {
        if (((HashSet) this.f6986d).contains(lVar.f7017a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f6987e).add(lVar);
    }

    public b d() {
        if (((e) this.f6989g) != null) {
            return new b((String) this.f6983a, new HashSet((HashSet) this.f6986d), new HashSet((HashSet) this.f6987e), this.f6984b, this.f6985c, (e) this.f6989g, (HashSet) this.f6988f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public synchronized jb.f e(jb.g gVar) {
        jb.f fVar;
        jb.g gVar2;
        try {
            ListIterator listIterator = ((LinkedList) this.f6988f).listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                fVar = (jb.f) listIterator.next();
                gVar2 = fVar.a() != null ? (jb.g) ((HashMap) this.f6989g).get(fVar.a()) : null;
                if (gVar2 == null) {
                    break;
                }
            } while (gVar2 != gVar);
            listIterator.remove();
            return fVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void f(int i5) {
        if (!(this.f6984b == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f6984b = i5;
    }

    public synchronized void g(jb.g gVar) {
        try {
            jb.f fVarE = e(gVar);
            if (fVarE != null) {
                ((HashSet) this.f6987e).add(gVar);
                ((HashSet) this.f6986d).remove(gVar);
                if (fVarE.a() != null) {
                    ((HashMap) this.f6989g).put(fVarE.a(), gVar);
                }
                gVar.f38722d.post(new com.applovin.impl.sdk.nativeAd.e(22, gVar, fVarE));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // jb.h
    public synchronized void start() {
        for (int i5 = 0; i5 < this.f6984b; i5++) {
            jb.g gVar = new jb.g(((String) this.f6983a) + i5, this.f6985c);
            gVar.b(new com.applovin.impl.sdk.nativeAd.e(23, this, gVar));
            ((HashSet) this.f6986d).add(gVar);
        }
    }

    public a(Class cls, Class[] clsArr) {
        this.f6983a = null;
        HashSet hashSet = new HashSet();
        this.f6986d = hashSet;
        this.f6987e = new HashSet();
        this.f6984b = 0;
        this.f6985c = 0;
        this.f6988f = new HashSet();
        hashSet.add(t.a(cls));
        for (Class cls2 : clsArr) {
            Fe.g.u(cls2, "Null interface");
            ((HashSet) this.f6986d).add(t.a(cls2));
        }
    }

    public a(t tVar, t[] tVarArr) {
        this.f6983a = null;
        HashSet hashSet = new HashSet();
        this.f6986d = hashSet;
        this.f6987e = new HashSet();
        this.f6984b = 0;
        this.f6985c = 0;
        this.f6988f = new HashSet();
        hashSet.add(tVar);
        for (t tVar2 : tVarArr) {
            Fe.g.u(tVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.f6986d, tVarArr);
    }

    public a(Integer num, int i5, Boolean bool, Integer num2, int i10, Integer num3, Boolean bool2) {
        this.f6983a = num;
        this.f6984b = i5;
        this.f6986d = bool;
        this.f6987e = num2;
        this.f6985c = i10;
        this.f6988f = num3;
        this.f6989g = bool2;
    }
}
