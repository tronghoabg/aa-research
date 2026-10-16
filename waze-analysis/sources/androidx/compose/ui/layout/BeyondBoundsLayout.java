package androidx.compose.ui.layout;

import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface BeyondBoundsLayout {

    /* compiled from: WazeSource */
    public interface BeyondBoundsScope {
        boolean getHasMoreContent();
    }

    /* renamed from: layout-o7g1Pn8 */
    <T> T mo2930layouto7g1Pn8(int i2, l<? super BeyondBoundsScope, ? extends T> lVar);

    /* compiled from: WazeSource */
    @h.g.a
    public final class LayoutDirection {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Before = 1;
        private static final int After = 2;
        private static final int Left = 3;
        private static final int Right = 4;
        private static final int Above = 5;
        private static final int Below = 6;

        private /* synthetic */ LayoutDirection(int i2) {
            this.value = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ LayoutDirection m9721boximpl(int i2) {
            return new LayoutDirection(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m9723equalsimpl(int i2, Object obj) {
            return (obj instanceof LayoutDirection) && i2 == ((LayoutDirection) obj).m9727unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m9724equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m9726toStringimpl(int i2) {
            return m9724equalsimpl0(i2, Before) ? "Before" : m9724equalsimpl0(i2, After) ? "After" : m9724equalsimpl0(i2, Left) ? "Left" : m9724equalsimpl0(i2, Right) ? "Right" : m9724equalsimpl0(i2, Above) ? "Above" : m9724equalsimpl0(i2, Below) ? "Below" : "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return m9723equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return m9726toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m9727unboximpl() {
            return this.value;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getAbove-hoxUOeE, reason: not valid java name */
            public final int m9728getAbovehoxUOeE() {
                return LayoutDirection.Above;
            }

            /* renamed from: getAfter-hoxUOeE, reason: not valid java name */
            public final int m9729getAfterhoxUOeE() {
                return LayoutDirection.After;
            }

            /* renamed from: getBefore-hoxUOeE, reason: not valid java name */
            public final int m9730getBeforehoxUOeE() {
                return LayoutDirection.Before;
            }

            /* renamed from: getBelow-hoxUOeE, reason: not valid java name */
            public final int m9731getBelowhoxUOeE() {
                return LayoutDirection.Below;
            }

            /* renamed from: getLeft-hoxUOeE, reason: not valid java name */
            public final int m9732getLefthoxUOeE() {
                return LayoutDirection.Left;
            }

            /* renamed from: getRight-hoxUOeE, reason: not valid java name */
            public final int m9733getRighthoxUOeE() {
                return LayoutDirection.Right;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m9722constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m9725hashCodeimpl(int i2) {
            return i2;
        }
    }
}
