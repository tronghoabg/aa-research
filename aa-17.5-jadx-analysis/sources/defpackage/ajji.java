package defpackage;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ajji {
    public final ajix a;
    public final long b;
    public long c;
    public final CopyOnWriteArrayList d;
    public final BlockingQueue e;
    public final ajjq f;

    public ajji(ajjq ajjqVar, ajix ajixVar) {
        ajixVar.getClass();
        this.f = ajjqVar;
        this.a = ajixVar;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.b = 250000000L;
        this.c = Long.MIN_VALUE;
        this.d = new CopyOnWriteArrayList();
        this.e = new LinkedBlockingDeque();
    }

    public final void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            ajjt ajjtVar = (ajjt) it.next();
            ajjtVar.g();
            this.f.g.addLast(ajjtVar.f());
        }
        copyOnWriteArrayList.clear();
    }
}
