package androidx.compose.ui.graphics;

import androidx.exifinterface.media.ExifInterface;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class BlendMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clear = 0;
    private static final int Src = 1;
    private static final int Dst = 2;
    private static final int SrcOver = 3;
    private static final int DstOver = 4;
    private static final int SrcIn = 5;
    private static final int DstIn = 6;
    private static final int SrcOut = 7;
    private static final int DstOut = 8;
    private static final int SrcAtop = 9;
    private static final int DstAtop = 10;
    private static final int Xor = 11;
    private static final int Plus = 12;
    private static final int Modulate = 13;
    private static final int Screen = 14;
    private static final int Overlay = 15;
    private static final int Darken = 16;
    private static final int Lighten = 17;
    private static final int ColorDodge = 18;
    private static final int ColorBurn = 19;
    private static final int Hardlight = 20;
    private static final int Softlight = 21;
    private static final int Difference = 22;
    private static final int Exclusion = 23;
    private static final int Multiply = 24;
    private static final int Hue = 25;
    private static final int Saturation = 26;
    private static final int Color = 27;
    private static final int Luminosity = 28;

    private /* synthetic */ BlendMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlendMode m8134boximpl(int i2) {
        return new BlendMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8136equalsimpl(int i2, Object obj) {
        return (obj instanceof BlendMode) && i2 == ((BlendMode) obj).m8140unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8137equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8139toStringimpl(int i2) {
        return m8137equalsimpl0(i2, Clear) ? "Clear" : m8137equalsimpl0(i2, Src) ? "Src" : m8137equalsimpl0(i2, Dst) ? "Dst" : m8137equalsimpl0(i2, SrcOver) ? "SrcOver" : m8137equalsimpl0(i2, DstOver) ? "DstOver" : m8137equalsimpl0(i2, SrcIn) ? "SrcIn" : m8137equalsimpl0(i2, DstIn) ? "DstIn" : m8137equalsimpl0(i2, SrcOut) ? "SrcOut" : m8137equalsimpl0(i2, DstOut) ? "DstOut" : m8137equalsimpl0(i2, SrcAtop) ? "SrcAtop" : m8137equalsimpl0(i2, DstAtop) ? "DstAtop" : m8137equalsimpl0(i2, Xor) ? "Xor" : m8137equalsimpl0(i2, Plus) ? "Plus" : m8137equalsimpl0(i2, Modulate) ? "Modulate" : m8137equalsimpl0(i2, Screen) ? "Screen" : m8137equalsimpl0(i2, Overlay) ? "Overlay" : m8137equalsimpl0(i2, Darken) ? "Darken" : m8137equalsimpl0(i2, Lighten) ? "Lighten" : m8137equalsimpl0(i2, ColorDodge) ? "ColorDodge" : m8137equalsimpl0(i2, ColorBurn) ? "ColorBurn" : m8137equalsimpl0(i2, Hardlight) ? "HardLight" : m8137equalsimpl0(i2, Softlight) ? "Softlight" : m8137equalsimpl0(i2, Difference) ? "Difference" : m8137equalsimpl0(i2, Exclusion) ? "Exclusion" : m8137equalsimpl0(i2, Multiply) ? "Multiply" : m8137equalsimpl0(i2, Hue) ? "Hue" : m8137equalsimpl0(i2, Saturation) ? ExifInterface.TAG_SATURATION : m8137equalsimpl0(i2, Color) ? "Color" : m8137equalsimpl0(i2, Luminosity) ? "Luminosity" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m8136equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m8139toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8140unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getClear-0nO6VwU, reason: not valid java name */
        public final int m8141getClear0nO6VwU() {
            return BlendMode.Clear;
        }

        /* renamed from: getColor-0nO6VwU, reason: not valid java name */
        public final int m8142getColor0nO6VwU() {
            return BlendMode.Color;
        }

        /* renamed from: getColorBurn-0nO6VwU, reason: not valid java name */
        public final int m8143getColorBurn0nO6VwU() {
            return BlendMode.ColorBurn;
        }

        /* renamed from: getColorDodge-0nO6VwU, reason: not valid java name */
        public final int m8144getColorDodge0nO6VwU() {
            return BlendMode.ColorDodge;
        }

        /* renamed from: getDarken-0nO6VwU, reason: not valid java name */
        public final int m8145getDarken0nO6VwU() {
            return BlendMode.Darken;
        }

        /* renamed from: getDifference-0nO6VwU, reason: not valid java name */
        public final int m8146getDifference0nO6VwU() {
            return BlendMode.Difference;
        }

        /* renamed from: getDst-0nO6VwU, reason: not valid java name */
        public final int m8147getDst0nO6VwU() {
            return BlendMode.Dst;
        }

        /* renamed from: getDstAtop-0nO6VwU, reason: not valid java name */
        public final int m8148getDstAtop0nO6VwU() {
            return BlendMode.DstAtop;
        }

        /* renamed from: getDstIn-0nO6VwU, reason: not valid java name */
        public final int m8149getDstIn0nO6VwU() {
            return BlendMode.DstIn;
        }

        /* renamed from: getDstOut-0nO6VwU, reason: not valid java name */
        public final int m8150getDstOut0nO6VwU() {
            return BlendMode.DstOut;
        }

        /* renamed from: getDstOver-0nO6VwU, reason: not valid java name */
        public final int m8151getDstOver0nO6VwU() {
            return BlendMode.DstOver;
        }

        /* renamed from: getExclusion-0nO6VwU, reason: not valid java name */
        public final int m8152getExclusion0nO6VwU() {
            return BlendMode.Exclusion;
        }

        /* renamed from: getHardlight-0nO6VwU, reason: not valid java name */
        public final int m8153getHardlight0nO6VwU() {
            return BlendMode.Hardlight;
        }

        /* renamed from: getHue-0nO6VwU, reason: not valid java name */
        public final int m8154getHue0nO6VwU() {
            return BlendMode.Hue;
        }

        /* renamed from: getLighten-0nO6VwU, reason: not valid java name */
        public final int m8155getLighten0nO6VwU() {
            return BlendMode.Lighten;
        }

        /* renamed from: getLuminosity-0nO6VwU, reason: not valid java name */
        public final int m8156getLuminosity0nO6VwU() {
            return BlendMode.Luminosity;
        }

        /* renamed from: getModulate-0nO6VwU, reason: not valid java name */
        public final int m8157getModulate0nO6VwU() {
            return BlendMode.Modulate;
        }

        /* renamed from: getMultiply-0nO6VwU, reason: not valid java name */
        public final int m8158getMultiply0nO6VwU() {
            return BlendMode.Multiply;
        }

        /* renamed from: getOverlay-0nO6VwU, reason: not valid java name */
        public final int m8159getOverlay0nO6VwU() {
            return BlendMode.Overlay;
        }

        /* renamed from: getPlus-0nO6VwU, reason: not valid java name */
        public final int m8160getPlus0nO6VwU() {
            return BlendMode.Plus;
        }

        /* renamed from: getSaturation-0nO6VwU, reason: not valid java name */
        public final int m8161getSaturation0nO6VwU() {
            return BlendMode.Saturation;
        }

        /* renamed from: getScreen-0nO6VwU, reason: not valid java name */
        public final int m8162getScreen0nO6VwU() {
            return BlendMode.Screen;
        }

        /* renamed from: getSoftlight-0nO6VwU, reason: not valid java name */
        public final int m8163getSoftlight0nO6VwU() {
            return BlendMode.Softlight;
        }

        /* renamed from: getSrc-0nO6VwU, reason: not valid java name */
        public final int m8164getSrc0nO6VwU() {
            return BlendMode.Src;
        }

        /* renamed from: getSrcAtop-0nO6VwU, reason: not valid java name */
        public final int m8165getSrcAtop0nO6VwU() {
            return BlendMode.SrcAtop;
        }

        /* renamed from: getSrcIn-0nO6VwU, reason: not valid java name */
        public final int m8166getSrcIn0nO6VwU() {
            return BlendMode.SrcIn;
        }

        /* renamed from: getSrcOut-0nO6VwU, reason: not valid java name */
        public final int m8167getSrcOut0nO6VwU() {
            return BlendMode.SrcOut;
        }

        /* renamed from: getSrcOver-0nO6VwU, reason: not valid java name */
        public final int m8168getSrcOver0nO6VwU() {
            return BlendMode.SrcOver;
        }

        /* renamed from: getXor-0nO6VwU, reason: not valid java name */
        public final int m8169getXor0nO6VwU() {
            return BlendMode.Xor;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8135constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8138hashCodeimpl(int i2) {
        return i2;
    }
}
