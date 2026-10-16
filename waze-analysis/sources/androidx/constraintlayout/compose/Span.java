package androidx.constraintlayout.compose;

import h.g.a;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes3.dex */
public final class Span {
    private final String description;

    private /* synthetic */ Span(String str) {
        this.description = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Span m11623boximpl(String str) {
        return new Span(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m11625constructorimpl(int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(':');
        sb.append(i3);
        sb.append('x');
        sb.append(i4);
        return sb.toString();
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11627equalsimpl(String str, Object obj) {
        return (obj instanceof Span) && x.n(str, ((Span) obj).m11631unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11628equalsimpl0(String str, String str2) {
        return x.n(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11629hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11630toStringimpl(String str) {
        return "Span(description=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m11627equalsimpl(this.description, obj);
    }

    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return m11629hashCodeimpl(this.description);
    }

    public String toString() {
        return m11630toStringimpl(this.description);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m11631unboximpl() {
        return this.description;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m11624constructorimpl(int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(':');
        sb.append(i3);
        return sb.toString();
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m11626constructorimpl(String str) {
        return str;
    }
}
