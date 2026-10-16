package androidx.compose.ui.text.style;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class TextOverflow {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clip = 1;
    private static final int Ellipsis = 2;
    private static final int Visible = 3;
    private static final int StartEllipsis = 4;
    private static final int MiddleEllipsis = 5;

    private /* synthetic */ TextOverflow(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextOverflow m11056boximpl(int i2) {
        return new TextOverflow(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11058equalsimpl(int i2, Object obj) {
        return (obj instanceof TextOverflow) && i2 == ((TextOverflow) obj).m11062unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11059equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11061toStringimpl(int i2) {
        return m11059equalsimpl0(i2, Clip) ? "Clip" : m11059equalsimpl0(i2, Ellipsis) ? "Ellipsis" : m11059equalsimpl0(i2, MiddleEllipsis) ? "MiddleEllipsis" : m11059equalsimpl0(i2, Visible) ? "Visible" : m11059equalsimpl0(i2, StartEllipsis) ? "StartEllipsis" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m11058equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m11061toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m11062unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getClip-gIe3tQ8, reason: not valid java name */
        public final int m11068getClipgIe3tQ8() {
            return TextOverflow.Clip;
        }

        /* renamed from: getEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m11069getEllipsisgIe3tQ8() {
            return TextOverflow.Ellipsis;
        }

        /* renamed from: getMiddleEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m11070getMiddleEllipsisgIe3tQ8() {
            return TextOverflow.MiddleEllipsis;
        }

        /* renamed from: getStartEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m11071getStartEllipsisgIe3tQ8() {
            return TextOverflow.StartEllipsis;
        }

        /* renamed from: getVisible-gIe3tQ8, reason: not valid java name */
        public final int m11072getVisiblegIe3tQ8() {
            return TextOverflow.Visible;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: getClip-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m11063getClipgIe3tQ8$annotations() {
        }

        /* renamed from: getEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m11064getEllipsisgIe3tQ8$annotations() {
        }

        /* renamed from: getMiddleEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m11065getMiddleEllipsisgIe3tQ8$annotations() {
        }

        /* renamed from: getStartEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m11066getStartEllipsisgIe3tQ8$annotations() {
        }

        /* renamed from: getVisible-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m11067getVisiblegIe3tQ8$annotations() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m11057constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11060hashCodeimpl(int i2) {
        return i2;
    }
}
