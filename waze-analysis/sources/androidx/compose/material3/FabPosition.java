package androidx.compose.material3;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class FabPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Start = 0;
    private static final int Center = 1;
    private static final int End = 2;
    private static final int EndOverlay = 3;

    private /* synthetic */ FabPosition(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FabPosition m4835boximpl(int i2) {
        return new FabPosition(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4837equalsimpl(int i2, Object obj) {
        return (obj instanceof FabPosition) && i2 == ((FabPosition) obj).m4841unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4838equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4840toStringimpl(int i2) {
        return m4838equalsimpl0(i2, Start) ? "FabPosition.Start" : m4838equalsimpl0(i2, Center) ? "FabPosition.Center" : m4838equalsimpl0(i2, End) ? "FabPosition.End" : "FabPosition.EndOverlay";
    }

    public boolean equals(Object obj) {
        return m4837equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m4840toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4841unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getCenter-ERTFSPs, reason: not valid java name */
        public final int m4842getCenterERTFSPs() {
            return FabPosition.Center;
        }

        /* renamed from: getEnd-ERTFSPs, reason: not valid java name */
        public final int m4843getEndERTFSPs() {
            return FabPosition.End;
        }

        /* renamed from: getEndOverlay-ERTFSPs, reason: not valid java name */
        public final int m4844getEndOverlayERTFSPs() {
            return FabPosition.EndOverlay;
        }

        /* renamed from: getStart-ERTFSPs, reason: not valid java name */
        public final int m4845getStartERTFSPs() {
            return FabPosition.Start;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4836constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4839hashCodeimpl(int i2) {
        return i2;
    }
}
