package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public abstract class fz extends lt {
    final fy a;
    private final a e;

    protected fz(gf gfVar) {
        a aVar = new a();
        this.e = aVar;
        gb gbVar = new gb(this);
        synchronized (fw.a) {
            if (fw.b == null) {
                fw.b = Executors.newFixedThreadPool(2);
            }
        }
        fy fyVar = new fy(gbVar, new rz(fw.b, gfVar));
        this.a = fyVar;
        fyVar.c.add(aVar);
    }

    @Override // defpackage.lt
    public final int a() {
        return this.a.e.size();
    }

    protected final Object b(int i) {
        return this.a.e.get(i);
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void c(List list) {
        fy fyVar = this.a;
        int i = fyVar.f + 1;
        fyVar.f = i;
        List list2 = fyVar.d;
        if (list == list2) {
            return;
        }
        List list3 = fyVar.e;
        if (list == null) {
            int size = list2.size();
            fyVar.d = null;
            fyVar.e = Collections.EMPTY_LIST;
            fyVar.a.b(0, size);
            fyVar.a();
            return;
        }
        if (list2 != null) {
            fyVar.g.b.execute(new isp(fyVar, list2, list, i, 1));
            return;
        }
        fyVar.d = list;
        fyVar.e = DesugarCollections.unmodifiableList(list);
        fyVar.a.a(0, list.size());
        fyVar.a();
    }
}
