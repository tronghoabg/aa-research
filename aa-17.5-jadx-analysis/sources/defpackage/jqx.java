package defpackage;

import android.os.Handler;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class jqx implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public jqx(Runnable runnable, zgt zgtVar, long j, TimeUnit timeUnit, int i) {
        this.e = i;
        this.b = runnable;
        this.c = zgtVar;
        this.a = j;
        this.d = timeUnit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, zgt] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                this.b.run();
                woy.aD(this.c.schedule(this, this.a, (TimeUnit) this.d));
                return;
            } else {
                ((jqe) this.d).g.k.e.b(this.a);
                ((Handler) this.c).post(new joo(this.b, 3));
                return;
            }
        }
        ?? r0 = this.d;
        long j = this.a;
        jrb jrbVar = new jrb(j, r0);
        jre jreVar = (jre) this.b;
        Map map = jreVar.d;
        Object obj = this.c;
        if (((jrb) map.put(obj, jrbVar)) != null) {
            ((ype) jre.a.l().ai((char) 2670)).y("Replaced existing insights for %s", obj);
        }
        Iterator it = jreVar.c.iterator();
        while (it.hasNext()) {
            Object obj2 = ((ajmd) it.next()).a;
            jrd jrdVar = (jrd) obj2;
            if (jrdVar.a.q(obj) && j >= jrdVar.h) {
                ((ype) jre.a.l().ai((char) 2655)).y("New insights for %s", obj);
                ((eqj) obj2).m(r0);
                jrdVar.a();
            }
        }
    }

    public jqx(jqe jqeVar, long j, Handler handler, jkv jkvVar, int i) {
        this.e = i;
        this.a = j;
        this.c = handler;
        this.b = jkvVar;
        this.d = jqeVar;
    }

    public /* synthetic */ jqx(jre jreVar, jra jraVar, long j, List list, int i) {
        this.e = i;
        this.b = jreVar;
        this.c = jraVar;
        this.a = j;
        this.d = list;
    }
}
