package P3;

import J3.r;
import Q3.f;
import Q3.g;
import S3.p;
import b7.k;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final f f9092a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9093b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9094c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9095d;

    /* renamed from: e, reason: collision with root package name */
    public k f9096e;

    public b(f tracker) {
        AbstractC3340k.e(tracker, "tracker");
        this.f9092a = tracker;
        this.f9093b = new ArrayList();
        this.f9094c = new ArrayList();
    }

    public abstract boolean a(p pVar);

    public abstract boolean b(Object obj);

    public final void c(Iterable workSpecs) {
        AbstractC3340k.e(workSpecs, "workSpecs");
        this.f9093b.clear();
        this.f9094c.clear();
        ArrayList arrayList = this.f9093b;
        for (Object obj : workSpecs) {
            if (a((p) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.f9093b;
        ArrayList arrayList3 = this.f9094c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((p) it.next()).f10977a);
        }
        if (this.f9093b.isEmpty()) {
            this.f9092a.b(this);
        } else {
            f fVar = this.f9092a;
            fVar.getClass();
            synchronized (fVar.f9831c) {
                try {
                    if (fVar.f9832d.add(this)) {
                        if (fVar.f9832d.size() == 1) {
                            fVar.f9833e = fVar.a();
                            r.d().a(g.f9834a, fVar.getClass().getSimpleName() + ": initial state = " + fVar.f9833e);
                            fVar.d();
                        }
                        Object obj2 = fVar.f9833e;
                        this.f9095d = obj2;
                        d(this.f9096e, obj2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f9096e, this.f9095d);
    }

    public final void d(k kVar, Object obj) {
        if (this.f9093b.isEmpty() || kVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            kVar.B(this.f9093b);
            return;
        }
        ArrayList workSpecs = this.f9093b;
        AbstractC3340k.e(workSpecs, "workSpecs");
        synchronized (kVar.f19398d) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = workSpecs.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (kVar.m(((p) next).f10977a)) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    p pVar = (p) it2.next();
                    r.d().a(O3.c.f8856a, "Constraints met for " + pVar);
                }
                O3.b bVar = (O3.b) kVar.f19396b;
                if (bVar != null) {
                    bVar.f(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
