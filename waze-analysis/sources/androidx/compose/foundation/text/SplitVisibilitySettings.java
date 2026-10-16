package androidx.compose.foundation.text;

import h.g.a;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class SplitVisibilitySettings {
    private final int value;

    private /* synthetic */ SplitVisibilitySettings(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SplitVisibilitySettings m3363boximpl(int i2) {
        return new SplitVisibilitySettings(i2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3365constructorimpl(boolean z, boolean z2) {
        return (z ? 1 : 0) | (true != z2 ? 0 : 2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3366equalsimpl(int i2, Object obj) {
        return (obj instanceof SplitVisibilitySettings) && i2 == ((SplitVisibilitySettings) obj).m3372unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3367equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: getPhysical-impl, reason: not valid java name */
    public static final boolean m3368getPhysicalimpl(int i2) {
        return (i2 & 2) != 0;
    }

    /* renamed from: getTouch-impl, reason: not valid java name */
    public static final boolean m3369getTouchimpl(int i2) {
        return (i2 & 1) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3371toStringimpl(int i2) {
        return "SplitVisibilitySettings(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m3366equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m3371toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3372unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3364constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3370hashCodeimpl(int i2) {
        return i2;
    }
}
