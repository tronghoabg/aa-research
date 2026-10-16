package androidx.camera.camera2.pipe.media;

import h.g.b.x;
import kotlinx.a.b;
import kotlinx.a.d;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SharedReference<T> {
    private final b count;
    private d<Finalizer<T>> currentFinalizer;
    private final T value;

    public SharedReference(T t, Finalizer<? super T> finalizer) {
        x.f(finalizer, "defaultFinalizer");
        this.value = t;
        this.count = h.e.b.f(1);
        this.currentFinalizer = h.e.b.h(finalizer);
    }

    public final T acquireOrNull() {
        b bVar;
        int iD;
        int i2;
        do {
            bVar = this.count;
            iD = bVar.d();
            i2 = iD == 0 ? 0 : iD + 1;
        } while (!bVar.g(iD, i2));
        if (i2 != 0) {
            return this.value;
        }
        return null;
    }

    public final void decrement() {
        if (this.count.a() == 0) {
            Finalizer finalizer = (Finalizer) this.currentFinalizer.a(null);
            x.c(finalizer);
            finalizer.finalize(this.value);
        }
    }

    public final void setFinalizer(Finalizer<? super T> finalizer) {
        Object objB;
        Finalizer finalizer2;
        x.f(finalizer, "value");
        d<Finalizer<T>> dVar = this.currentFinalizer;
        do {
            objB = dVar.b();
            finalizer2 = (Finalizer) objB;
        } while (!dVar.e(objB, finalizer2 == null ? null : finalizer));
        if (finalizer2 != null) {
            finalizer2.finalize(null);
        } else {
            finalizer.finalize(null);
        }
    }
}
