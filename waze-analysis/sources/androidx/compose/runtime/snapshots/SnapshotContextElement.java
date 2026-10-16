package androidx.compose.runtime.snapshots;

import h.c.h;
import h.c.i;
import h.c.j;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SnapshotContextElement extends h {
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        public static <R> R fold(SnapshotContextElement snapshotContextElement, R r, p<? super R, ? super h, ? extends R> pVar) {
            return (R) h.c.a.h.e(snapshotContextElement, r, pVar);
        }

        public static <E extends h> E get(SnapshotContextElement snapshotContextElement, i<E> iVar) {
            return (E) h.c.a.h.f(snapshotContextElement, iVar);
        }

        public static j minusKey(SnapshotContextElement snapshotContextElement, i<?> iVar) {
            return h.c.a.h.g(snapshotContextElement, iVar);
        }

        public static j plus(SnapshotContextElement snapshotContextElement, j jVar) {
            return h.c.a.h.h(snapshotContextElement, jVar);
        }
    }

    /* compiled from: WazeSource */
    public final class Key implements i<SnapshotContextElement> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }
}
