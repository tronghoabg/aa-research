package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class hvq extends WeakReference {
    final hui a;
    final boolean b;
    hwx c;

    public hvq(hui huiVar, hwr hwrVar, ReferenceQueue referenceQueue) {
        super(hwrVar, referenceQueue);
        a.al(huiVar, "Argument must not be null");
        this.a = huiVar;
        this.c = null;
        this.b = hwrVar.a;
    }

    final void a() {
        this.c = null;
        clear();
    }
}
