package androidx.compose.foundation.layout;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes.dex */
public final class Fr {
    private final float value;

    private /* synthetic */ Fr(float f2) {
        this.value = f2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Fr m2630boximpl(float f2) {
        return new Fr(f2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2632equalsimpl(float f2, Object obj) {
        return (obj instanceof Fr) && Float.compare(f2, ((Fr) obj).m2636unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2633equalsimpl0(float f2, float f3) {
        return Float.compare(f2, f3) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2634hashCodeimpl(float f2) {
        return Float.floatToIntBits(f2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2635toStringimpl(float f2) {
        return f2 + ".fr";
    }

    public boolean equals(Object obj) {
        return m2632equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m2634hashCodeimpl(this.value);
    }

    public String toString() {
        return m2635toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m2636unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m2631constructorimpl(float f2) {
        return f2;
    }
}
