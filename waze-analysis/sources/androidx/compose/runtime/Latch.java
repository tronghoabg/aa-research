package androidx.compose.runtime;

import h.ab;
import h.c.a.a;
import h.c.a.h;
import h.c.e;
import h.d.b;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Latch {
    public static final int $stable = 8;
    private final Object lock = new Object();
    private List<e<ab>> awaiters = new ArrayList();
    private List<e<ab>> spareList = new ArrayList();
    private boolean _isOpen = true;

    public final Object await(e<? super ab> eVar) {
        if (!isOpen()) {
            l lVar = new l(h.d(eVar), 1);
            lVar.u();
            final l lVar2 = lVar;
            synchronized (this.lock) {
                this.awaiters.add(lVar2);
            }
            lVar2.c(new h.g.a.l<Throwable, ab>() { // from class: androidx.compose.runtime.Latch$await$2$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    k<ab> kVar = lVar2;
                    Latch latch = this.this$0;
                    synchronized (latch.lock) {
                        latch.awaiters.remove(kVar);
                    }
                }

                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Throwable th) {
                    invoke2(th);
                    return ab.f48028a;
                }
            });
            Object objJ = lVar.j();
            a aVar = a.f48038a;
            if (objJ == aVar) {
                b.c(eVar);
            }
            if (objJ == aVar) {
                return objJ;
            }
        }
        return ab.f48028a;
    }

    public final void closeLatch() {
        synchronized (this.lock) {
            this._isOpen = false;
        }
    }

    public final boolean isOpen() {
        boolean z;
        synchronized (this.lock) {
            z = this._isOpen;
        }
        return z;
    }

    public final void openLatch() {
        synchronized (this.lock) {
            if (!isOpen()) {
                List<e<ab>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this._isOpen = true;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.get(i2).resumeWith(ab.f48028a);
                }
                list.clear();
            }
        }
    }

    public final <R> R withClosed(h.g.a.a<? extends R> aVar) {
        closeLatch();
        try {
            return aVar.invoke();
        } finally {
            openLatch();
        }
    }
}
