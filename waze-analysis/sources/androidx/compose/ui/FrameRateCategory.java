package androidx.compose.ui;

import androidx.webkit.Profile;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class FrameRateCategory {
    private final float value;
    public static final Companion Companion = new Companion(null);
    private static final float Default = Float.NaN;
    private static final float Normal = -3.0f;
    private static final float High = -4.0f;

    private /* synthetic */ FrameRateCategory(float f2) {
        this.value = f2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FrameRateCategory m7649boximpl(float f2) {
        return new FrameRateCategory(f2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7651equalsimpl(float f2, Object obj) {
        return (obj instanceof FrameRateCategory) && Float.compare(f2, ((FrameRateCategory) obj).m7655unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7652equalsimpl0(float f2, float f3) {
        return Float.compare(f2, f3) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7653hashCodeimpl(float f2) {
        return Float.floatToIntBits(f2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7654toStringimpl(float f2) {
        return f2 == -3.0f ? "Normal" : f2 == -4.0f ? "High" : Profile.DEFAULT_PROFILE_NAME;
    }

    public boolean equals(Object obj) {
        return m7651equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7653hashCodeimpl(this.value);
    }

    public String toString() {
        return m7654toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m7655unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getDefault-NSsRyOo, reason: not valid java name */
        public final float m7656getDefaultNSsRyOo() {
            return FrameRateCategory.Default;
        }

        /* renamed from: getHigh-NSsRyOo, reason: not valid java name */
        public final float m7657getHighNSsRyOo() {
            return FrameRateCategory.High;
        }

        /* renamed from: getNormal-NSsRyOo, reason: not valid java name */
        public final float m7658getNormalNSsRyOo() {
            return FrameRateCategory.Normal;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static float m7650constructorimpl(float f2) {
        return f2;
    }
}
