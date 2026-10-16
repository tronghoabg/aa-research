package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class vty {
    public static final woy b = new woy();
    private final AtomicReference c = new AtomicReference();
    public final AtomicReference a = new AtomicReference();

    vty() {
        new AtomicReference(null);
        new ConcurrentLinkedQueue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static vty b(yfq yfqVar) {
        vty vtyVar;
        int i = 0;
        do {
            if (i >= ((yls) yfqVar).c) {
                break;
            }
            xue xueVar = (xue) yfqVar.get(i);
            Object objG = xueVar.g(b);
            xub xubVarA = objG == null ? xueVar.c.containsKey(xue.e) ? xub.a(2) : xub.a(3) : new xub(1, objG);
            vtyVar = xubVarA.b == 1 ? (vty) xubVarA.a : null;
            i++;
        } while (vtyVar == null);
        return vtyVar;
    }

    public final vtx a() {
        return (vtx) this.c.get();
    }
}
