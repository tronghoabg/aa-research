package androidx.compose.runtime;

import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Applier<N> {
    void apply(p<? super N, Object, ab> pVar, Object obj);

    void clear();

    void down(N n);

    N getCurrent();

    void insertBottomUp(int i2, N n);

    void insertTopDown(int i2, N n);

    void move(int i2, int i3, int i4);

    void onBeginChanges();

    void onEndChanges();

    void remove(int i2, int i3);

    void reuse();

    void up();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.Applier$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$apply(Applier applier, p pVar, Object obj) {
            pVar.invoke(applier.getCurrent(), obj);
        }

        public static void $default$reuse(Applier applier) {
            Object current = applier.getCurrent();
            ComposeNodeLifecycleCallback composeNodeLifecycleCallback = current instanceof ComposeNodeLifecycleCallback ? (ComposeNodeLifecycleCallback) current : null;
            if (composeNodeLifecycleCallback != null) {
                composeNodeLifecycleCallback.onReuse();
            }
        }

        public static void $default$onBeginChanges(Applier applier) {
        }

        public static void $default$onEndChanges(Applier applier) {
        }

        public static /* synthetic */ void access$onBeginChanges$jd(Applier applier) {
        }

        public static /* synthetic */ void access$onEndChanges$jd(Applier applier) {
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static <N> void apply(Applier<N> applier, p<? super N, Object, ab> pVar, Object obj) {
            CC.$default$apply(applier, pVar, obj);
        }

        @Deprecated
        public static <N> void reuse(Applier<N> applier) {
            CC.$default$reuse(applier);
        }

        @Deprecated
        public static <N> void onBeginChanges(Applier<N> applier) {
        }

        @Deprecated
        public static <N> void onEndChanges(Applier<N> applier) {
        }
    }
}
