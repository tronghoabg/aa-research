package androidx.compose.ui.graphics.colorspace;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class ColorModel {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Rgb = 12884901888L;
    private static final long Xyz = 12884901889L;
    private static final long Lab = 12884901890L;
    private static final long Cmyk = 17179869187L;

    private /* synthetic */ ColorModel(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorModel m8687boximpl(long j2) {
        return new ColorModel(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8689equalsimpl(long j2, Object obj) {
        return (obj instanceof ColorModel) && j2 == ((ColorModel) obj).m8694unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8690equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getComponentCount-impl, reason: not valid java name */
    public static final int m8691getComponentCountimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8692hashCodeimpl(long j2) {
        return ColorModel$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8693toStringimpl(long j2) {
        return m8690equalsimpl0(j2, Rgb) ? "Rgb" : m8690equalsimpl0(j2, Xyz) ? "Xyz" : m8690equalsimpl0(j2, Lab) ? "Lab" : m8690equalsimpl0(j2, Cmyk) ? "Cmyk" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m8689equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m8692hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m8693toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m8694unboximpl() {
        return this.packedValue;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getCmyk-xdoWZVw, reason: not valid java name */
        public final long m8695getCmykxdoWZVw() {
            return ColorModel.Cmyk;
        }

        /* renamed from: getLab-xdoWZVw, reason: not valid java name */
        public final long m8696getLabxdoWZVw() {
            return ColorModel.Lab;
        }

        /* renamed from: getRgb-xdoWZVw, reason: not valid java name */
        public final long m8697getRgbxdoWZVw() {
            return ColorModel.Rgb;
        }

        /* renamed from: getXyz-xdoWZVw, reason: not valid java name */
        public final long m8698getXyzxdoWZVw() {
            return ColorModel.Xyz;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getComponentCount$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8688constructorimpl(long j2) {
        return j2;
    }
}
