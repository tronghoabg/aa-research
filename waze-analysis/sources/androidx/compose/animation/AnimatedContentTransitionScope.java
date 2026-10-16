package androidx.compose.animation;

import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.unit.IntOffset;
import h.g.a;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface AnimatedContentTransitionScope<S> extends Transition.Segment<S> {
    Alignment getContentAlignment();

    ExitTransition getKeepUntilTransitionsFinished(ExitTransition.Companion companion);

    /* renamed from: slideIntoContainer-mOhB8PU, reason: not valid java name */
    EnterTransition mo1705slideIntoContainermOhB8PU(int i2, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, l<? super Integer, Integer> lVar);

    /* renamed from: slideOutOfContainer-mOhB8PU, reason: not valid java name */
    ExitTransition mo1706slideOutOfContainermOhB8PU(int i2, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, l<? super Integer, Integer> lVar);

    ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform);

    /* compiled from: WazeSource */
    @a
    public final class SlideDirection {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Left = 0;
        private static final int Right = 1;
        private static final int Up = 2;
        private static final int Down = 3;
        private static final int Start = 4;
        private static final int End = 5;

        private /* synthetic */ SlideDirection(int i2) {
            this.value = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ SlideDirection m1709boximpl(int i2) {
            return new SlideDirection(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1711equalsimpl(int i2, Object obj) {
            return (obj instanceof SlideDirection) && i2 == ((SlideDirection) obj).m1715unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1712equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1714toStringimpl(int i2) {
            return m1712equalsimpl0(i2, Left) ? "Left" : m1712equalsimpl0(i2, Right) ? "Right" : m1712equalsimpl0(i2, Up) ? "Up" : m1712equalsimpl0(i2, Down) ? "Down" : m1712equalsimpl0(i2, Start) ? "Start" : m1712equalsimpl0(i2, End) ? "End" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m1711equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return m1714toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m1715unboximpl() {
            return this.value;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getDown-DKzdypw, reason: not valid java name */
            public final int m1716getDownDKzdypw() {
                return SlideDirection.Down;
            }

            /* renamed from: getEnd-DKzdypw, reason: not valid java name */
            public final int m1717getEndDKzdypw() {
                return SlideDirection.End;
            }

            /* renamed from: getLeft-DKzdypw, reason: not valid java name */
            public final int m1718getLeftDKzdypw() {
                return SlideDirection.Left;
            }

            /* renamed from: getRight-DKzdypw, reason: not valid java name */
            public final int m1719getRightDKzdypw() {
                return SlideDirection.Right;
            }

            /* renamed from: getStart-DKzdypw, reason: not valid java name */
            public final int m1720getStartDKzdypw() {
                return SlideDirection.Start;
            }

            /* renamed from: getUp-DKzdypw, reason: not valid java name */
            public final int m1721getUpDKzdypw() {
                return SlideDirection.Up;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m1710constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1713hashCodeimpl(int i2) {
            return i2;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedContentTransitionScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: slideIntoContainer-mOhB8PU$default, reason: not valid java name */
        public static /* synthetic */ EnterTransition m1707slideIntoContainermOhB8PU$default(AnimatedContentTransitionScope animatedContentTransitionScope, int i2, FiniteAnimationSpec finiteAnimationSpec, l lVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
            }
            if ((i3 & 2) != 0) {
                int i4 = VisibilityThresholdsKt.f1650a;
                finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m11287boximpl(InlineClassHelperKt.Uint64Low32), 3, null);
            }
            if ((i3 & 4) != 0) {
                lVar = AnimatedContentTransitionScope$slideIntoContainer$1.INSTANCE;
            }
            return animatedContentTransitionScope.mo1705slideIntoContainermOhB8PU(i2, finiteAnimationSpec, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: slideOutOfContainer-mOhB8PU$default, reason: not valid java name */
        public static /* synthetic */ ExitTransition m1708slideOutOfContainermOhB8PU$default(AnimatedContentTransitionScope animatedContentTransitionScope, int i2, FiniteAnimationSpec finiteAnimationSpec, l lVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
            }
            if ((i3 & 2) != 0) {
                int i4 = VisibilityThresholdsKt.f1650a;
                finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m11287boximpl(InlineClassHelperKt.Uint64Low32), 3, null);
            }
            if ((i3 & 4) != 0) {
                lVar = AnimatedContentTransitionScope$slideOutOfContainer$1.INSTANCE;
            }
            return animatedContentTransitionScope.mo1706slideOutOfContainermOhB8PU(i2, finiteAnimationSpec, lVar);
        }

        public static /* synthetic */ void getKeepUntilTransitionsFinished$annotations(ExitTransition.Companion companion) {
        }
    }
}
