package defpackage;

import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class hwy implements hvw, huu {
    private final hvv a;
    private final hvx b;
    private int c;
    private int d = -1;
    private hui e;
    private List f;
    private int g;
    private File h;
    private hwz i;
    private volatile ncp j;

    public hwy(hvx hvxVar, hvv hvvVar) {
        this.b = hvxVar;
        this.a = hvvVar;
    }

    private final boolean c() {
        return this.g < this.f.size();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [huv, java.lang.Object] */
    @Override // defpackage.hvw
    public final void a() {
        ncp ncpVar = this.j;
        if (ncpVar != null) {
            ncpVar.a.b();
        }
    }

    /* JADX WARN: Type inference failed for: r1v27, types: [huv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [huv, java.lang.Object] */
    @Override // defpackage.hvw
    public final boolean b() {
        List arrayList;
        hvx hvxVar = this.b;
        List listD = hvxVar.d();
        boolean z = false;
        if (listD.isEmpty()) {
            return false;
        }
        hsn hsnVarA = hvxVar.c.a();
        Class<?> cls = hvxVar.d.getClass();
        Class cls2 = hvxVar.g;
        Class cls3 = hvxVar.j;
        ieb iebVar = hsnVarA.d;
        ifw ifwVar = (ifw) ((AtomicReference) iebVar.a).getAndSet(null);
        if (ifwVar == null) {
            ifwVar = new ifw(cls, cls2, cls3);
        } else {
            ifwVar.a(cls, cls2, cls3);
        }
        Object obj = iebVar.b;
        synchronized (obj) {
            arrayList = (List) ((aat) obj).get(ifwVar);
        }
        ((AtomicReference) iebVar.a).set(ifwVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            Iterator it = hsnVarA.h.l(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : hsnVarA.c.b((Class) it.next(), cls2)) {
                    if (!hsnVarA.f.g(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            ieb iebVar2 = hsnVarA.d;
            List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            Object obj2 = iebVar2.b;
            synchronized (obj2) {
                ((aat) obj2).put(new ifw(cls, cls2, cls3), listUnmodifiableList);
            }
        }
        if (arrayList.isEmpty()) {
            hvx hvxVar2 = this.b;
            if (File.class.equals(hvxVar2.j)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + String.valueOf(hvxVar2.d.getClass()) + " to " + String.valueOf(hvxVar2.j));
        }
        while (true) {
            if (this.f != null && c()) {
                this.j = null;
                while (!z && c()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    hzh hzhVar = (hzh) list.get(i);
                    File file = this.h;
                    hvx hvxVar3 = this.b;
                    this.j = hzhVar.b(file, hvxVar3.e, hvxVar3.f, hvxVar3.h);
                    if (this.j != null && hvxVar3.g(this.j.a.a())) {
                        this.j.a.d(hvxVar3.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= arrayList.size()) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 >= listD.size()) {
                    return false;
                }
                this.d = 0;
            }
            hui huiVar = (hui) listD.get(this.c);
            Class cls5 = (Class) arrayList.get(this.d);
            hvx hvxVar4 = this.b;
            this.i = new hwz(hvxVar4.h(), huiVar, hvxVar4.m, hvxVar4.e, hvxVar4.f, hvxVar4.a(cls5), cls5, hvxVar4.h);
            File fileA = hvxVar4.c().a(this.i);
            this.h = fileA;
            if (fileA != null) {
                this.e = huiVar;
                this.f = hvxVar4.f(fileA);
                this.g = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [huv, java.lang.Object] */
    @Override // defpackage.huu
    public final void f(Object obj) {
        this.a.d(this.e, obj, this.j.a, 4, this.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [huv, java.lang.Object] */
    @Override // defpackage.huu
    public final void g(Exception exc) {
        this.a.c(this.i, exc, this.j.a, 4);
    }
}
