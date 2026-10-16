package androidx.camera.camera2.pipe;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class RequestTemplate {
    private final int value;

    private /* synthetic */ RequestTemplate(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ RequestTemplate m887boximpl(int i2) {
        return new RequestTemplate(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m889equalsimpl(int i2, Object obj) {
        return (obj instanceof RequestTemplate) && i2 == ((RequestTemplate) obj).m894unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m890equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: getName-impl, reason: not valid java name */
    public static final String m891getNameimpl(int i2) {
        switch (i2) {
            case 1:
                return "TEMPLATE_PREVIEW";
            case 2:
                return "TEMPLATE_STILL_CAPTURE";
            case 3:
                return "TEMPLATE_RECORD";
            case 4:
                return "TEMPLATE_VIDEO_SNAPSHOT";
            case 5:
                return "TEMPLATE_ZERO_SHUTTER_LAG";
            case 6:
                return "TEMPLATE_MANUAL";
            default:
                return "UNKNOWN-" + i2;
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m893toStringimpl(int i2) {
        return a.a(i2, "RequestTemplate(value=", ")");
    }

    public boolean equals(Object obj) {
        return m889equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m893toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m894unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m888constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m892hashCodeimpl(int i2) {
        return i2;
    }
}
