package androidx.compose.ui.graphics;

import android.graphics.PorterDuff;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidBlendMode_androidKt {

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[android.graphics.BlendMode.values().length];
            try {
                iArr[android.graphics.BlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[android.graphics.BlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[android.graphics.BlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[android.graphics.BlendMode.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[android.graphics.BlendMode.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[android.graphics.BlendMode.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[android.graphics.BlendMode.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[android.graphics.BlendMode.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[android.graphics.BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[android.graphics.BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[android.graphics.BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[android.graphics.BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[android.graphics.BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[android.graphics.BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[android.graphics.BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[android.graphics.BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[android.graphics.BlendMode.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[android.graphics.BlendMode.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[android.graphics.BlendMode.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[android.graphics.BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: isSupported-s9anfk8, reason: not valid java name */
    public static final boolean m8071isSupporteds9anfk8(int i2) {
        return true;
    }

    /* renamed from: toAndroidBlendMode-s9anfk8, reason: not valid java name */
    public static final android.graphics.BlendMode m8072toAndroidBlendModes9anfk8(int i2) {
        return BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8141getClear0nO6VwU()) ? android.graphics.BlendMode.CLEAR : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8164getSrc0nO6VwU()) ? android.graphics.BlendMode.SRC : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8147getDst0nO6VwU()) ? android.graphics.BlendMode.DST : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8168getSrcOver0nO6VwU()) ? android.graphics.BlendMode.SRC_OVER : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8151getDstOver0nO6VwU()) ? android.graphics.BlendMode.DST_OVER : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8166getSrcIn0nO6VwU()) ? android.graphics.BlendMode.SRC_IN : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8149getDstIn0nO6VwU()) ? android.graphics.BlendMode.DST_IN : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8167getSrcOut0nO6VwU()) ? android.graphics.BlendMode.SRC_OUT : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8150getDstOut0nO6VwU()) ? android.graphics.BlendMode.DST_OUT : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8165getSrcAtop0nO6VwU()) ? android.graphics.BlendMode.SRC_ATOP : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8148getDstAtop0nO6VwU()) ? android.graphics.BlendMode.DST_ATOP : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8169getXor0nO6VwU()) ? android.graphics.BlendMode.XOR : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8160getPlus0nO6VwU()) ? android.graphics.BlendMode.PLUS : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8157getModulate0nO6VwU()) ? android.graphics.BlendMode.MODULATE : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8162getScreen0nO6VwU()) ? android.graphics.BlendMode.SCREEN : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8159getOverlay0nO6VwU()) ? android.graphics.BlendMode.OVERLAY : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8145getDarken0nO6VwU()) ? android.graphics.BlendMode.DARKEN : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8155getLighten0nO6VwU()) ? android.graphics.BlendMode.LIGHTEN : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8144getColorDodge0nO6VwU()) ? android.graphics.BlendMode.COLOR_DODGE : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8143getColorBurn0nO6VwU()) ? android.graphics.BlendMode.COLOR_BURN : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8153getHardlight0nO6VwU()) ? android.graphics.BlendMode.HARD_LIGHT : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8163getSoftlight0nO6VwU()) ? android.graphics.BlendMode.SOFT_LIGHT : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8146getDifference0nO6VwU()) ? android.graphics.BlendMode.DIFFERENCE : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8152getExclusion0nO6VwU()) ? android.graphics.BlendMode.EXCLUSION : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8158getMultiply0nO6VwU()) ? android.graphics.BlendMode.MULTIPLY : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8154getHue0nO6VwU()) ? android.graphics.BlendMode.HUE : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8161getSaturation0nO6VwU()) ? android.graphics.BlendMode.SATURATION : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8142getColor0nO6VwU()) ? android.graphics.BlendMode.COLOR : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8156getLuminosity0nO6VwU()) ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    public static final int toComposeBlendMode(android.graphics.BlendMode blendMode) {
        switch (WhenMappings.$EnumSwitchMapping$0[blendMode.ordinal()]) {
            case 1:
                return BlendMode.Companion.m8141getClear0nO6VwU();
            case 2:
                return BlendMode.Companion.m8164getSrc0nO6VwU();
            case 3:
                return BlendMode.Companion.m8147getDst0nO6VwU();
            case 4:
                return BlendMode.Companion.m8168getSrcOver0nO6VwU();
            case 5:
                return BlendMode.Companion.m8151getDstOver0nO6VwU();
            case 6:
                return BlendMode.Companion.m8166getSrcIn0nO6VwU();
            case 7:
                return BlendMode.Companion.m8149getDstIn0nO6VwU();
            case 8:
                return BlendMode.Companion.m8167getSrcOut0nO6VwU();
            case 9:
                return BlendMode.Companion.m8150getDstOut0nO6VwU();
            case 10:
                return BlendMode.Companion.m8165getSrcAtop0nO6VwU();
            case 11:
                return BlendMode.Companion.m8148getDstAtop0nO6VwU();
            case 12:
                return BlendMode.Companion.m8169getXor0nO6VwU();
            case 13:
                return BlendMode.Companion.m8160getPlus0nO6VwU();
            case 14:
                return BlendMode.Companion.m8157getModulate0nO6VwU();
            case 15:
                return BlendMode.Companion.m8162getScreen0nO6VwU();
            case 16:
                return BlendMode.Companion.m8159getOverlay0nO6VwU();
            case 17:
                return BlendMode.Companion.m8145getDarken0nO6VwU();
            case 18:
                return BlendMode.Companion.m8155getLighten0nO6VwU();
            case 19:
                return BlendMode.Companion.m8144getColorDodge0nO6VwU();
            case 20:
                return BlendMode.Companion.m8143getColorBurn0nO6VwU();
            case 21:
                return BlendMode.Companion.m8153getHardlight0nO6VwU();
            case 22:
                return BlendMode.Companion.m8163getSoftlight0nO6VwU();
            case 23:
                return BlendMode.Companion.m8146getDifference0nO6VwU();
            case 24:
                return BlendMode.Companion.m8152getExclusion0nO6VwU();
            case 25:
                return BlendMode.Companion.m8158getMultiply0nO6VwU();
            case 26:
                return BlendMode.Companion.m8154getHue0nO6VwU();
            case 27:
                return BlendMode.Companion.m8161getSaturation0nO6VwU();
            case 28:
                return BlendMode.Companion.m8142getColor0nO6VwU();
            case 29:
                return BlendMode.Companion.m8156getLuminosity0nO6VwU();
            default:
                throw new i();
        }
    }

    /* renamed from: toPorterDuffMode-s9anfk8, reason: not valid java name */
    public static final PorterDuff.Mode m8073toPorterDuffModes9anfk8(int i2) {
        return BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8141getClear0nO6VwU()) ? PorterDuff.Mode.CLEAR : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8164getSrc0nO6VwU()) ? PorterDuff.Mode.SRC : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8147getDst0nO6VwU()) ? PorterDuff.Mode.DST : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8168getSrcOver0nO6VwU()) ? PorterDuff.Mode.SRC_OVER : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8151getDstOver0nO6VwU()) ? PorterDuff.Mode.DST_OVER : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8166getSrcIn0nO6VwU()) ? PorterDuff.Mode.SRC_IN : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8149getDstIn0nO6VwU()) ? PorterDuff.Mode.DST_IN : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8167getSrcOut0nO6VwU()) ? PorterDuff.Mode.SRC_OUT : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8150getDstOut0nO6VwU()) ? PorterDuff.Mode.DST_OUT : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8165getSrcAtop0nO6VwU()) ? PorterDuff.Mode.SRC_ATOP : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8148getDstAtop0nO6VwU()) ? PorterDuff.Mode.DST_ATOP : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8169getXor0nO6VwU()) ? PorterDuff.Mode.XOR : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8160getPlus0nO6VwU()) ? PorterDuff.Mode.ADD : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8162getScreen0nO6VwU()) ? PorterDuff.Mode.SCREEN : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8159getOverlay0nO6VwU()) ? PorterDuff.Mode.OVERLAY : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8145getDarken0nO6VwU()) ? PorterDuff.Mode.DARKEN : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8155getLighten0nO6VwU()) ? PorterDuff.Mode.LIGHTEN : BlendMode.m8137equalsimpl0(i2, BlendMode.Companion.m8157getModulate0nO6VwU()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
