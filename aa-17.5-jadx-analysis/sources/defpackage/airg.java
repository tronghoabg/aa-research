package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class airg implements airp {
    private final AtomicReference a;

    public airg(airp airpVar) {
        this.a = new AtomicReference(airpVar);
    }

    @Override // defpackage.airp
    public final Iterator a() {
        airp airpVar = (airp) this.a.getAndSet(null);
        if (airpVar != null) {
            return airpVar.a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
