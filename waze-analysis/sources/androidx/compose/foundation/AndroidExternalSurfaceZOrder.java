package androidx.compose.foundation;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class AndroidExternalSurfaceZOrder {
    private final int zOrder;
    public static final Companion Companion = new Companion(null);
    private static final int Behind = 0;
    private static final int MediaOverlay = 1;
    private static final int OnTop = 2;

    private /* synthetic */ AndroidExternalSurfaceZOrder(int i2) {
        this.zOrder = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AndroidExternalSurfaceZOrder m1955boximpl(int i2) {
        return new AndroidExternalSurfaceZOrder(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1957equalsimpl(int i2, Object obj) {
        return (obj instanceof AndroidExternalSurfaceZOrder) && i2 == ((AndroidExternalSurfaceZOrder) obj).m1961unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1958equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1960toStringimpl(int i2) {
        return "AndroidExternalSurfaceZOrder(zOrder=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m1957equalsimpl(this.zOrder, obj);
    }

    public final int getZOrder() {
        return this.zOrder;
    }

    public int hashCode() {
        return this.zOrder;
    }

    public String toString() {
        return m1960toStringimpl(this.zOrder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1961unboximpl() {
        return this.zOrder;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getBehind-B_4ceCc, reason: not valid java name */
        public final int m1962getBehindB_4ceCc() {
            return AndroidExternalSurfaceZOrder.Behind;
        }

        /* renamed from: getMediaOverlay-B_4ceCc, reason: not valid java name */
        public final int m1963getMediaOverlayB_4ceCc() {
            return AndroidExternalSurfaceZOrder.MediaOverlay;
        }

        /* renamed from: getOnTop-B_4ceCc, reason: not valid java name */
        public final int m1964getOnTopB_4ceCc() {
            return AndroidExternalSurfaceZOrder.OnTop;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m1956constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1959hashCodeimpl(int i2) {
        return i2;
    }
}
