package androidx.compose.material3;

import h.g.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class ExposedDropdownMenuAnchorType {
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final String PrimaryNotEditable = "PrimaryNotEditable";
    private static final String PrimaryEditable = "PrimaryEditable";
    private static final String SecondaryEditable = "SecondaryEditable";

    private /* synthetic */ ExposedDropdownMenuAnchorType(String str) {
        this.name = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ExposedDropdownMenuAnchorType m4801boximpl(String str) {
        return new ExposedDropdownMenuAnchorType(str);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4803equalsimpl(String str, Object obj) {
        return (obj instanceof ExposedDropdownMenuAnchorType) && x.n(str, ((ExposedDropdownMenuAnchorType) obj).m4807unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4804equalsimpl0(String str, String str2) {
        return x.n(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4805hashCodeimpl(String str) {
        return str.hashCode();
    }

    public boolean equals(Object obj) {
        return m4803equalsimpl(this.name, obj);
    }

    public int hashCode() {
        return m4805hashCodeimpl(this.name);
    }

    public String toString() {
        return this.name;
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m4807unboximpl() {
        return this.name;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getPrimaryEditable-oYjWRB4, reason: not valid java name */
        public final String m4808getPrimaryEditableoYjWRB4() {
            return ExposedDropdownMenuAnchorType.PrimaryEditable;
        }

        /* renamed from: getPrimaryNotEditable-oYjWRB4, reason: not valid java name */
        public final String m4809getPrimaryNotEditableoYjWRB4() {
            return ExposedDropdownMenuAnchorType.PrimaryNotEditable;
        }

        /* renamed from: getSecondaryEditable-oYjWRB4, reason: not valid java name */
        public final String m4810getSecondaryEditableoYjWRB4() {
            return ExposedDropdownMenuAnchorType.SecondaryEditable;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static String m4802constructorimpl(String str) {
        return str;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4806toStringimpl(String str) {
        return str;
    }
}
