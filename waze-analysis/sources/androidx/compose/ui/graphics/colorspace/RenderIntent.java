package androidx.compose.ui.graphics.colorspace;

import androidx.exifinterface.media.ExifInterface;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class RenderIntent {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Perceptual = 0;
    private static final int Relative = 1;
    private static final int Saturation = 2;
    private static final int Absolute = 3;

    private /* synthetic */ RenderIntent(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ RenderIntent m8710boximpl(int i2) {
        return new RenderIntent(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8712equalsimpl(int i2, Object obj) {
        return (obj instanceof RenderIntent) && i2 == ((RenderIntent) obj).m8716unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8713equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8715toStringimpl(int i2) {
        return m8713equalsimpl0(i2, Perceptual) ? "Perceptual" : m8713equalsimpl0(i2, Relative) ? "Relative" : m8713equalsimpl0(i2, Saturation) ? ExifInterface.TAG_SATURATION : m8713equalsimpl0(i2, Absolute) ? "Absolute" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m8712equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m8715toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8716unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAbsolute-uksYyKA, reason: not valid java name */
        public final int m8717getAbsoluteuksYyKA() {
            return RenderIntent.Absolute;
        }

        /* renamed from: getPerceptual-uksYyKA, reason: not valid java name */
        public final int m8718getPerceptualuksYyKA() {
            return RenderIntent.Perceptual;
        }

        /* renamed from: getRelative-uksYyKA, reason: not valid java name */
        public final int m8719getRelativeuksYyKA() {
            return RenderIntent.Relative;
        }

        /* renamed from: getSaturation-uksYyKA, reason: not valid java name */
        public final int m8720getSaturationuksYyKA() {
            return RenderIntent.Saturation;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8711constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8714hashCodeimpl(int i2) {
        return i2;
    }
}
