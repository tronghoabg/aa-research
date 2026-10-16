package androidx.constraintlayout.compose;

import h.g.a;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes3.dex */
public final class Skip {
    private final String description;

    private /* synthetic */ Skip(String str) {
        this.description = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Skip m11614boximpl(String str) {
        return new Skip(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m11616constructorimpl(int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(':');
        sb.append(i3);
        sb.append('x');
        sb.append(i4);
        return sb.toString();
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11618equalsimpl(String str, Object obj) {
        return (obj instanceof Skip) && x.n(str, ((Skip) obj).m11622unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11619equalsimpl0(String str, String str2) {
        return x.n(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11620hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11621toStringimpl(String str) {
        return "Skip(description=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m11618equalsimpl(this.description, obj);
    }

    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return m11620hashCodeimpl(this.description);
    }

    public String toString() {
        return m11621toStringimpl(this.description);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m11622unboximpl() {
        return this.description;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m11615constructorimpl(int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(':');
        sb.append(i3);
        return sb.toString();
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static String m11617constructorimpl(String str) {
        return str;
    }
}
