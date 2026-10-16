package Af;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class a implements k {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f1287a;

    public a(k kVar) {
        this.f1287a = new AtomicReference(kVar);
    }

    @Override // Af.k
    public final Iterator iterator() {
        k kVar = (k) this.f1287a.getAndSet(null);
        if (kVar != null) {
            return kVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
