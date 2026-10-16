package androidx.compose.foundation.gestures.snapping;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class FinalSnappingItem {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int ClosestItem = 0;
    private static final int NextItem = 1;
    private static final int PreviousItem = 2;

    private /* synthetic */ FinalSnappingItem(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FinalSnappingItem m2370boximpl(int i2) {
        return new FinalSnappingItem(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2372equalsimpl(int i2, Object obj) {
        return (obj instanceof FinalSnappingItem) && i2 == ((FinalSnappingItem) obj).m2376unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2373equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2375toStringimpl(int i2) {
        return "FinalSnappingItem(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m2372equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m2375toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2376unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getClosestItem-bbeMdSM, reason: not valid java name */
        public final int m2377getClosestItembbeMdSM() {
            return FinalSnappingItem.ClosestItem;
        }

        /* renamed from: getNextItem-bbeMdSM, reason: not valid java name */
        public final int m2378getNextItembbeMdSM() {
            return FinalSnappingItem.NextItem;
        }

        /* renamed from: getPreviousItem-bbeMdSM, reason: not valid java name */
        public final int m2379getPreviousItembbeMdSM() {
            return FinalSnappingItem.PreviousItem;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2371constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2374hashCodeimpl(int i2) {
        return i2;
    }
}
