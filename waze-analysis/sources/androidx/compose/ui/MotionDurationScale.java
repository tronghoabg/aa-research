package androidx.compose.ui;

import h.c.h;
import h.c.i;
import h.c.j;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface MotionDurationScale extends h {
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.MotionDurationScale$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        public static <R> R fold(MotionDurationScale motionDurationScale, R r, p<? super R, ? super h, ? extends R> pVar) {
            return (R) h.c.a.h.e(motionDurationScale, r, pVar);
        }

        public static <E extends h> E get(MotionDurationScale motionDurationScale, i<E> iVar) {
            return (E) h.c.a.h.f(motionDurationScale, iVar);
        }

        public static j minusKey(MotionDurationScale motionDurationScale, i<?> iVar) {
            return h.c.a.h.g(motionDurationScale, iVar);
        }

        public static j plus(MotionDurationScale motionDurationScale, j jVar) {
            return h.c.a.h.h(motionDurationScale, jVar);
        }
    }

    /* compiled from: WazeSource */
    public final class Key implements i<MotionDurationScale> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // h.c.h
    i<?> getKey();

    float getScaleFactor();
}
