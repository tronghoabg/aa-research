package androidx.compose.ui.text.font;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import h.g.a;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class DeviceFontFamilyName {
    private final String name;

    private /* synthetic */ DeviceFontFamilyName(String str) {
        this.name = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DeviceFontFamilyName m10623boximpl(String str) {
        return new DeviceFontFamilyName(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m10624constructorimpl(String str) {
        if (str.length() <= 0) {
            InlineClassHelperKt.throwIllegalArgumentException("name may not be empty");
        }
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10625equalsimpl(String str, Object obj) {
        return (obj instanceof DeviceFontFamilyName) && x.n(str, ((DeviceFontFamilyName) obj).m10629unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10626equalsimpl0(String str, String str2) {
        return x.n(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10627hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10628toStringimpl(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m10625equalsimpl(this.name, obj);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return m10627hashCodeimpl(this.name);
    }

    public String toString() {
        return m10628toStringimpl(this.name);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m10629unboximpl() {
        return this.name;
    }
}
