package androidx.compose.material3;

import h.g.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
final class ListItemType implements Comparable<ListItemType> {
    private final int lines;
    public static final Companion Companion = new Companion(null);
    private static final int OneLine = 1;
    private static final int TwoLine = 2;
    private static final int ThreeLine = 3;

    private /* synthetic */ ListItemType(int i2) {
        this.lines = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ListItemType m5158boximpl(int i2) {
        return new ListItemType(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5161equalsimpl(int i2, Object obj) {
        return (obj instanceof ListItemType) && i2 == ((ListItemType) obj).m5166unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5162equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5164toStringimpl(int i2) {
        return "ListItemType(lines=" + i2 + ')';
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ListItemType listItemType) {
        return m5165compareToyh95HIg(listItemType.m5166unboximpl());
    }

    /* renamed from: compareTo-yh95HIg, reason: not valid java name */
    public int m5165compareToyh95HIg(int i2) {
        return m5159compareToyh95HIg(this.lines, i2);
    }

    public boolean equals(Object obj) {
        return m5161equalsimpl(this.lines, obj);
    }

    public int hashCode() {
        return this.lines;
    }

    public String toString() {
        return m5164toStringimpl(this.lines);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5166unboximpl() {
        return this.lines;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getOneLine-AlXitO8, reason: not valid java name */
        public final int m5167getOneLineAlXitO8() {
            return ListItemType.OneLine;
        }

        /* renamed from: getThreeLine-AlXitO8, reason: not valid java name */
        public final int m5168getThreeLineAlXitO8() {
            return ListItemType.ThreeLine;
        }

        /* renamed from: getTwoLine-AlXitO8, reason: not valid java name */
        public final int m5169getTwoLineAlXitO8() {
            return ListItemType.TwoLine;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
        /* renamed from: invoke-Z-LSjz4$material3, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int m5170invokeZLSjz4$material3(boolean r1, boolean r2, boolean r3) {
            /*
                r0 = this;
                if (r1 == 0) goto L5
                if (r2 != 0) goto L7
                r2 = 0
            L5:
                if (r3 == 0) goto Lc
            L7:
                int r0 = r0.m5168getThreeLineAlXitO8()
                return r0
            Lc:
                if (r1 != 0) goto L16
                if (r2 == 0) goto L11
                goto L16
            L11:
                int r0 = r0.m5167getOneLineAlXitO8()
                return r0
            L16:
                int r0 = r0.m5169getTwoLineAlXitO8()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemType.Companion.m5170invokeZLSjz4$material3(boolean, boolean, boolean):int");
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: compareTo-yh95HIg, reason: not valid java name */
    public static int m5159compareToyh95HIg(int i2, int i3) {
        return x.a(i2, i3);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m5160constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5163hashCodeimpl(int i2) {
        return i2;
    }
}
