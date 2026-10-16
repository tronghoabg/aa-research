package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import h.g.a;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class StringAnnotation implements AnnotatedString.Annotation {
    private final String value;

    private /* synthetic */ StringAnnotation(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StringAnnotation m10494boximpl(String str) {
        return new StringAnnotation(str);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10496equalsimpl(String str, Object obj) {
        return (obj instanceof StringAnnotation) && x.n(str, ((StringAnnotation) obj).m10500unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10497equalsimpl0(String str, String str2) {
        return x.n(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10498hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10499toStringimpl(String str) {
        return "StringAnnotation(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m10496equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m10498hashCodeimpl(this.value);
    }

    public String toString() {
        return m10499toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m10500unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m10495constructorimpl(String str) {
        return str;
    }
}
