package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
final class ydh extends yee {
    final /* synthetic */ Iterator a;
    final /* synthetic */ ydj b;
    private ylb c;

    public ydh(ydj ydjVar, Iterator it) {
        this.a = it;
        this.b = ydjVar;
    }

    @Override // defpackage.yee
    protected final Iterator a() {
        return this.a;
    }

    @Override // defpackage.yel
    protected final /* synthetic */ Object d() {
        return this.a;
    }

    @Override // defpackage.yee, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        ylb ylbVar = (ylb) super.next();
        this.c = ylbVar;
        return ylbVar;
    }

    @Override // defpackage.yee, java.util.Iterator
    public final void remove() {
        woy.aa(this.c != null, "no calls to next() since the last call to remove()");
        Object objB = this.c.b();
        objB.getClass();
        ydj ydjVar = this.b;
        AtomicInteger atomicInteger = (AtomicInteger) yrm.J(ydjVar.countMap, objB);
        if (atomicInteger != null) {
            while (true) {
                int i = atomicInteger.get();
                if (i == 0) {
                    break;
                } else if (atomicInteger.compareAndSet(i, 0)) {
                    ydjVar.countMap.remove(objB, atomicInteger);
                    break;
                }
            }
        }
        this.c = null;
    }
}
