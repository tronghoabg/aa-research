package androidx.compose.ui.graphics;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class ImageBitmapConfig {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Argb8888 = 0;
    private static final int Alpha8 = 1;
    private static final int Rgb565 = 2;
    private static final int F16 = 3;
    private static final int Gpu = 4;

    private /* synthetic */ ImageBitmapConfig(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImageBitmapConfig m8465boximpl(int i2) {
        return new ImageBitmapConfig(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8467equalsimpl(int i2, Object obj) {
        return (obj instanceof ImageBitmapConfig) && i2 == ((ImageBitmapConfig) obj).m8471unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8468equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8470toStringimpl(int i2) {
        return m8468equalsimpl0(i2, Argb8888) ? "Argb8888" : m8468equalsimpl0(i2, Alpha8) ? "Alpha8" : m8468equalsimpl0(i2, Rgb565) ? "Rgb565" : m8468equalsimpl0(i2, F16) ? "F16" : m8468equalsimpl0(i2, Gpu) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m8467equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m8470toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8471unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAlpha8-_sVssgQ, reason: not valid java name */
        public final int m8472getAlpha8_sVssgQ() {
            return ImageBitmapConfig.Alpha8;
        }

        /* renamed from: getArgb8888-_sVssgQ, reason: not valid java name */
        public final int m8473getArgb8888_sVssgQ() {
            return ImageBitmapConfig.Argb8888;
        }

        /* renamed from: getF16-_sVssgQ, reason: not valid java name */
        public final int m8474getF16_sVssgQ() {
            return ImageBitmapConfig.F16;
        }

        /* renamed from: getGpu-_sVssgQ, reason: not valid java name */
        public final int m8475getGpu_sVssgQ() {
            return ImageBitmapConfig.Gpu;
        }

        /* renamed from: getRgb565-_sVssgQ, reason: not valid java name */
        public final int m8476getRgb565_sVssgQ() {
            return ImageBitmapConfig.Rgb565;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8466constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8469hashCodeimpl(int i2) {
        return i2;
    }
}
