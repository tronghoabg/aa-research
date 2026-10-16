package androidx.compose.foundation.style;

import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Interpolatable;
import androidx.compose.ui.graphics.LightingColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.graphics.shadow.ShadowKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.common.video.Frame;
import h.a.c;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StylePropertiesKt {
    public static final byte AlphaId = 21;
    public static final int BackgroundBrushId = 51;
    public static final byte BackgroundColorId = 34;
    public static final byte BaselineShiftId = 43;
    public static final int BorderBrushId = 50;
    public static final byte BorderColorId = 35;
    public static final byte BorderWidthId = 8;
    public static final byte BottomId = 16;
    public static final int BrushPropertiesMask = 135;
    public static final byte CameraDistanceId = 33;
    public static final byte ClipId = 31;
    public static final int ColorFilterId = 54;
    public static final int ContentBrushId = 57;
    public static final byte ContentColorId = 37;
    public static final byte ContentPaddingBottomId = 3;
    public static final byte ContentPaddingEndId = 1;
    public static final byte ContentPaddingStartId = 0;
    public static final byte ContentPaddingTopId = 2;
    public static final int DrawFlag = 2;
    private static final int DrawObjectFlags;
    private static final long DrawPrimitiveFlags;
    public static final int DropShadowId = 55;
    private static final StyleProperties EmptyStyleProperties;
    public static final byte ExternalPaddingBottomId = 7;
    public static final byte ExternalPaddingEndId = 5;
    public static final byte ExternalPaddingStartId = 4;
    public static final byte ExternalPaddingTopId = 6;
    public static final int FirstObjectProperty = 50;
    public static final int FontFamilyId = 58;
    public static final byte FontSizeId = 46;
    public static final byte FontStyleId = 40;
    public static final int FontStyleMask = 3;
    public static final int FontStyleShift = 0;
    public static final byte FontSynthesisId = 45;
    public static final int FontSynthesisMask = 15360;
    public static final int FontSynthesisShift = 10;
    public static final byte FontWeightId = 39;
    public static final int FontWeightMask = 134086656;
    public static final int FontWeightShift = 17;
    public static final int ForegroundBrushId = 52;
    public static final byte ForegroundColorId = 36;
    public static final byte HeightFractionId = 12;
    public static final byte HeightId = 10;
    public static final byte HyphensId = 44;
    public static final int HyphensMask = 768;
    public static final int HyphensShift = 8;
    public static final int InheritedFlags = 48;
    public static final int InnerLayoutFlag = 1;
    private static final int InnerLayoutObjectFlags;
    private static final long InnerLayoutPrimitiveFlags;
    public static final int InnerShadowId = 56;
    public static final int LastObjectProperty = 60;
    public static final int LayerFlag = 4;
    private static final int LayerObjectFlags;
    private static final long LayerPrimitiveFlags;
    public static final byte LeftId = 13;
    public static final byte LetterSpacingId = 48;
    public static final byte LineBreakId = 49;
    public static final byte LineHeightId = 47;
    public static final byte MaxHeightId = 20;
    public static final byte MaxWidthId = 19;
    public static final byte MinHeightId = 18;
    public static final byte MinWidthId = 17;
    public static final int ObjectPropertyCount = 11;
    public static final int OuterLayoutFlag = 8;
    private static final int OuterLayoutObjectFlags;
    private static final long OuterLayoutPrimitiveFlags;
    public static final int PhaseFlagMask = 63;
    public static final int PrimitivePropertyCount = 50;
    public static final int PropertyCount = 61;
    public static final byte RightId = 15;
    public static final byte RotationXId = 26;
    public static final byte RotationYId = 27;
    public static final byte RotationZId = 28;
    public static final byte ScaleXId = 22;
    public static final byte ScaleYId = 23;
    public static final int ShapeId = 53;
    public static final byte TextAlignId = 41;
    public static final int TextAlignMask = 28;
    public static final int TextAlignShift = 2;
    public static final byte TextDecorationId = 38;
    public static final int TextDecorationMask = 114688;
    public static final int TextDecorationShift = 14;
    public static final byte TextDirectionId = 42;
    public static final int TextDirectionMask = 112;
    public static final int TextDirectionShift = 4;
    public static final int TextDrawFlag = 32;
    private static final int TextDrawObjectFlags;
    private static final long TextDrawPrimitiveFlags;
    public static final long TextEnumMask = 131666517426176L;
    public static final int TextIndentId = 60;
    public static final int TextLayoutFlag = 16;
    private static final int TextLayoutObjectFlags;
    private static final long TextLayoutPrimitiveFlags;
    public static final int TextMotionId = 59;
    public static final byte TopId = 14;
    public static final byte TransformOriginXId = 29;
    public static final byte TransformOriginYId = 30;
    public static final byte TranslationXId = 24;
    public static final byte TranslationYId = 25;
    public static final byte WidthFractionId = 11;
    public static final byte WidthId = 9;
    public static final byte ZIndexId = 32;
    private static ab flagsBuild;
    private static final int[] propertyFlags = new int[61];

    static {
        buildFlags();
        flagsBuild = ab.f48028a;
        InnerLayoutPrimitiveFlags = primitiveFlagsOf(1);
        OuterLayoutPrimitiveFlags = primitiveFlagsOf(8);
        DrawPrimitiveFlags = primitiveFlagsOf(2);
        LayerPrimitiveFlags = primitiveFlagsOf(4);
        TextDrawPrimitiveFlags = primitiveFlagsOf(32);
        TextLayoutPrimitiveFlags = primitiveFlagsOf(16);
        InnerLayoutObjectFlags = objectFlagsOf(1);
        OuterLayoutObjectFlags = objectFlagsOf(8);
        DrawObjectFlags = objectFlagsOf(2);
        LayerObjectFlags = objectFlagsOf(4);
        TextDrawObjectFlags = objectFlagsOf(32);
        TextLayoutObjectFlags = objectFlagsOf(16);
        EmptyStyleProperties = new StyleProperties();
    }

    private static final <T> void animateAB(StyleProperties styleProperties, StyleProperties styleProperties2, StyleProperties styleProperties3, byte b2, long j2, StyleAnimations styleAnimations, l<? super StyleProperties, ? extends T> lVar, p<? super StyleProperties, ? super T, ab> pVar) {
        long j3 = 1 << b2;
        if ((j2 & j3) != 0) {
            if ((styleProperties2.primitivesSet & j3) == 0) {
                pVar.invoke(styleProperties, lVar.invoke(styleProperties3));
            } else if ((styleProperties3.primitivesSet & j3) != 0) {
                pVar.invoke(styleProperties, ((double) styleAnimations.timeOf((int) b2)) < 0.5d ? lVar.invoke(styleProperties2) : lVar.invoke(styleProperties3));
            } else {
                pVar.invoke(styleProperties, lVar.invoke(styleProperties2));
            }
        }
    }

    private static final void buildFlags() {
        int[] iArr = propertyFlags;
        iArr[2] = iArr[2] | 1;
        iArr[3] = iArr[3] | 1;
        iArr[0] = iArr[0] | 1;
        iArr[1] = iArr[1] | 1;
        iArr[6] = iArr[6] | 8;
        iArr[7] = iArr[7] | 8;
        iArr[4] = iArr[4] | 8;
        iArr[5] = iArr[5] | 8;
        iArr[8] = 3 | iArr[8];
        iArr[35] = iArr[35] | 2;
        iArr[50] = iArr[50] | 2;
        iArr[9] = iArr[9] | 8;
        iArr[10] = iArr[10] | 8;
        iArr[11] = iArr[11] | 8;
        iArr[12] = iArr[12] | 8;
        iArr[13] = iArr[13] | 8;
        iArr[14] = iArr[14] | 8;
        iArr[15] = iArr[15] | 8;
        iArr[16] = iArr[16] | 8;
        iArr[17] = iArr[17] | 8;
        iArr[18] = iArr[18] | 8;
        iArr[19] = iArr[19] | 8;
        iArr[20] = iArr[20] | 8;
        iArr[21] = iArr[21] | 4;
        iArr[22] = iArr[22] | 4;
        iArr[23] = iArr[23] | 4;
        iArr[24] = iArr[24] | 4;
        iArr[25] = iArr[25] | 4;
        iArr[29] = iArr[29] | 4;
        iArr[30] = iArr[30] | 4;
        iArr[26] = iArr[26] | 4;
        iArr[27] = iArr[27] | 4;
        iArr[28] = iArr[28] | 4;
        iArr[32] = iArr[32] | 4;
        iArr[34] = iArr[34] | 2;
        iArr[51] = iArr[51] | 2;
        iArr[36] = iArr[36] | 2;
        iArr[52] = iArr[52] | 2;
        iArr[31] = iArr[31] | 4;
        iArr[53] = iArr[53] | 2;
        iArr[54] = 4 | iArr[54];
        iArr[55] = iArr[55] | 2;
        iArr[56] = 2 | iArr[56];
        iArr[37] = iArr[37] | 32;
        iArr[57] = 32 | iArr[57];
        iArr[58] = iArr[58] | 48;
        iArr[59] = iArr[59] | 48;
        iArr[60] = iArr[60] | 48;
        iArr[46] = iArr[46] | 48;
        iArr[47] = iArr[47] | 48;
        iArr[48] = iArr[48] | 48;
        iArr[43] = iArr[43] | 48;
        iArr[49] = iArr[49] | 48;
        iArr[39] = iArr[39] | 48;
        iArr[40] = iArr[40] | 48;
        iArr[41] = iArr[41] | 48;
        iArr[42] = iArr[42] | 48;
        iArr[44] = iArr[44] | 48;
        iArr[45] = iArr[45] | 48;
        iArr[38] = iArr[38] | 48;
    }

    private static final boolean compareProperty(long j2, byte b2, float f2, float f3) {
        return ((j2 & (1 << b2)) == 0 || Float.floatToRawIntBits(f2) == Float.floatToRawIntBits(f3)) ? false : true;
    }

    /* renamed from: compareProperty-0YGnOg8, reason: not valid java name */
    private static final boolean m3192compareProperty0YGnOg8(long j2, byte b2, long j3, long j4) {
        return ((j2 & (1 << b2)) == 0 || Color.m8229equalsimpl0(j3, j4)) ? false : true;
    }

    /* renamed from: compareProperty-IXTc2U4, reason: not valid java name */
    private static final boolean m3193comparePropertyIXTc2U4(long j2, byte b2, int i2, int i3) {
        return ((j2 & (1 << b2)) == 0 || TextDirection.m11024equalsimpl0(i2, i3)) ? false : true;
    }

    /* renamed from: compareProperty-MEXYdzc, reason: not valid java name */
    private static final boolean m3194comparePropertyMEXYdzc(long j2, byte b2, int i2, int i3) {
        return ((j2 & (1 << b2)) == 0 || TextAlign.m11007equalsimpl0(i2, i3)) ? false : true;
    }

    /* renamed from: compareProperty-Mp_48LE, reason: not valid java name */
    private static final boolean m3195comparePropertyMp_48LE(long j2, byte b2, int i2, int i3) {
        return ((j2 & (1 << b2)) == 0 || FontSynthesis.m10672equalsimpl0(i2, i3)) ? false : true;
    }

    /* renamed from: compareProperty-Y_r0B1c, reason: not valid java name */
    private static final boolean m3196comparePropertyY_r0B1c(long j2, byte b2, long j3, long j4) {
        return ((j2 & (1 << b2)) == 0 || TextUnit.m11359equalsimpl0(j3, j4)) ? false : true;
    }

    /* renamed from: compareProperty-Z2s4JLk, reason: not valid java name */
    private static final boolean m3197comparePropertyZ2s4JLk(long j2, byte b2, int i2, int i3) {
        return ((j2 & (1 << b2)) == 0 || LineBreak.m10915equalsimpl0(i2, i3)) ? false : true;
    }

    /* renamed from: compareProperty-u6JgV54, reason: not valid java name */
    private static final boolean m3198comparePropertyu6JgV54(long j2, byte b2, float f2, float f3) {
        return ((j2 & (1 << b2)) == 0 || BaselineShift.m10876equalsimpl0(f2, f3)) ? false : true;
    }

    /* renamed from: compareProperty-xuesbOU, reason: not valid java name */
    private static final boolean m3199comparePropertyxuesbOU(long j2, byte b2, int i2, int i3) {
        return ((j2 & (1 << b2)) == 0 || FontStyle.m10661equalsimpl0(i2, i3)) ? false : true;
    }

    /* renamed from: compareProperty-ywbYpVk, reason: not valid java name */
    private static final boolean m3200comparePropertyywbYpVk(long j2, byte b2, int i2, int i3) {
        return ((j2 & (1 << b2)) == 0 || Hyphens.m10899equalsimpl0(i2, i3)) ? false : true;
    }

    private static final void flag(byte b2, int i2) {
        int[] iArr = propertyFlags;
        iArr[b2] = i2 | iArr[b2];
    }

    private static final int getBits(int i2, int i3, int i4) {
        return (i2 & i3) >> i4;
    }

    public static final int getDrawObjectFlags() {
        return DrawObjectFlags;
    }

    public static final long getDrawPrimitiveFlags() {
        return DrawPrimitiveFlags;
    }

    public static final StyleProperties getEmptyStyleProperties() {
        return EmptyStyleProperties;
    }

    public static final int getInnerLayoutObjectFlags() {
        return InnerLayoutObjectFlags;
    }

    public static final long getInnerLayoutPrimitiveFlags() {
        return InnerLayoutPrimitiveFlags;
    }

    public static final int getLayerObjectFlags() {
        return LayerObjectFlags;
    }

    public static final long getLayerPrimitiveFlags() {
        return LayerPrimitiveFlags;
    }

    public static final int getOuterLayoutObjectFlags() {
        return OuterLayoutObjectFlags;
    }

    public static final long getOuterLayoutPrimitiveFlags() {
        return OuterLayoutPrimitiveFlags;
    }

    public static final int getTextDrawObjectFlags() {
        return TextDrawObjectFlags;
    }

    public static final long getTextDrawPrimitiveFlags() {
        return TextDrawPrimitiveFlags;
    }

    public static final int getTextLayoutObjectFlags() {
        return TextLayoutObjectFlags;
    }

    public static final long getTextLayoutPrimitiveFlags() {
        return TextLayoutPrimitiveFlags;
    }

    private static final boolean hasId(long j2, byte b2) {
        return (j2 & (1 << b2)) != 0;
    }

    public static final void lerp(StyleProperties styleProperties, StyleProperties styleProperties2, StyleAnimations styleAnimations, long j2, int i2, StyleProperties styleProperties3) {
        StyleProperties styleProperties4;
        StyleProperties styleProperties5;
        StyleAnimations styleAnimations2;
        StyleProperties styleProperties6;
        int i3 = (styleProperties.objectsSet | styleProperties2.objectsSet) & i2;
        long jRemoveColorForBrushProperties = removeColorForBrushProperties((styleProperties.primitivesSet | styleProperties2.primitivesSet) & j2, i3);
        if (jRemoveColorForBrushProperties == 0) {
            if (i3 == 0) {
                return;
            } else {
                jRemoveColorForBrushProperties = 0;
            }
        }
        if ((OuterLayoutPrimitiveFlags & jRemoveColorForBrushProperties) != 0) {
            lerpOuterLayout(jRemoveColorForBrushProperties, styleProperties, styleProperties2, styleAnimations, styleProperties3);
        }
        if ((InnerLayoutPrimitiveFlags & jRemoveColorForBrushProperties) != 0) {
            lerpInnerLayout(jRemoveColorForBrushProperties, styleProperties, styleProperties2, styleAnimations, styleProperties3);
        }
        if ((DrawPrimitiveFlags & jRemoveColorForBrushProperties) != 0) {
            styleProperties4 = styleProperties;
            styleProperties5 = styleProperties2;
            styleAnimations2 = styleAnimations;
            styleProperties6 = styleProperties3;
            lerpDraw(jRemoveColorForBrushProperties, styleProperties4, styleProperties5, styleAnimations2, styleProperties6);
        } else {
            styleProperties4 = styleProperties;
            styleProperties5 = styleProperties2;
            styleAnimations2 = styleAnimations;
            styleProperties6 = styleProperties3;
        }
        if ((DrawObjectFlags & i3) != 0) {
            lerpDraw(i3, styleProperties4, styleProperties5, styleAnimations2, styleProperties6);
        }
        if ((LayerPrimitiveFlags & jRemoveColorForBrushProperties) != 0) {
            lerpLayer(jRemoveColorForBrushProperties, styleProperties4, styleProperties5, styleAnimations2, styleProperties6);
        }
        if ((LayerObjectFlags & i3) != 0) {
            lerpLayer(i3, styleProperties4, styleProperties5, styleAnimations2, styleProperties6);
        }
        if ((137438953472L & jRemoveColorForBrushProperties) != 0) {
            styleProperties6.m3157contentColor8_81llA(ColorKt.m8279lerpjxsXWHM(styleProperties4.m3165getContentColor0d7_KjU$foundation(), styleProperties5.m3165getContentColor0d7_KjU$foundation(), styleAnimations2.timeOf(37)));
        }
        if ((i3 & 128) != 0) {
            styleProperties6.contentBrush(m3201lerpwffgcV4(styleProperties4.getContentBrush$foundation(), styleProperties4.m3165getContentColor0d7_KjU$foundation(), styleProperties5.getContentBrush$foundation(), styleProperties5.m3165getContentColor0d7_KjU$foundation(), styleAnimations2.timeOf(57)));
        }
        if ((TextLayoutPrimitiveFlags & jRemoveColorForBrushProperties) != 0) {
            lerpTextLayout(jRemoveColorForBrushProperties, styleProperties4, styleProperties5, styleAnimations2, styleProperties6);
        }
        if ((TextLayoutObjectFlags & i3) != 0) {
            lerpTextLayout(i3, styleProperties4, styleProperties5, styleAnimations2, styleProperties6);
        }
    }

    /* renamed from: lerp-wffgcV4, reason: not valid java name */
    private static final Brush m3201lerpwffgcV4(Brush brush, long j2, Brush brush2, long j3, float f2) {
        if (brush == null && brush2 == null) {
            return null;
        }
        if (brush == null) {
            brush = new SolidColor(j2, null);
        } else if (brush2 == null) {
            brush2 = new SolidColor(j3, null);
        }
        Object objLerp = Interpolatable.Companion.lerp(brush, brush2, f2);
        Brush brush3 = objLerp instanceof Brush ? (Brush) objLerp : null;
        return brush3 == null ? ((double) f2) < 0.5d ? brush : brush2 : brush3;
    }

    private static final Shadow[] lerpArrayShadows(Shadow[] shadowArr, Shadow[] shadowArr2, float f2) {
        int iMax = Math.max(shadowArr.length, shadowArr2.length);
        Shadow[] shadowArr3 = new Shadow[iMax];
        for (int i2 = 0; i2 < iMax; i2++) {
            shadowArr3[i2] = null;
        }
        for (int i3 = 0; i3 < iMax; i3++) {
            shadowArr3[i3] = ShadowKt.lerp((Shadow) c.O(shadowArr, i3), (Shadow) c.O(shadowArr2, i3), f2);
        }
        return shadowArr3;
    }

    public static final void lerpDraw(int i2, StyleProperties styleProperties, StyleProperties styleProperties2, StyleAnimations styleAnimations, StyleProperties styleProperties3) {
        if ((i2 & 1) != 0) {
            styleProperties3.borderBrush(m3201lerpwffgcV4(styleProperties.borderBrush, styleProperties.m3164getBorderColor0d7_KjU$foundation(), styleProperties2.borderBrush, styleProperties2.m3164getBorderColor0d7_KjU$foundation(), styleAnimations.timeOf(50)));
        }
        if ((i2 & 2) != 0) {
            styleProperties3.backgroundBrush(m3201lerpwffgcV4(styleProperties.backgroundBrush, styleProperties.m3162getBackgroundColor0d7_KjU$foundation(), styleProperties2.backgroundBrush, styleProperties2.m3162getBackgroundColor0d7_KjU$foundation(), styleAnimations.timeOf(51)));
        }
        if ((i2 & 4) != 0) {
            styleProperties3.foregroundBrush(m3201lerpwffgcV4(styleProperties.foregroundBrush, styleProperties.m3169getForegroundColor0d7_KjU$foundation(), styleProperties2.foregroundBrush, styleProperties2.m3169getForegroundColor0d7_KjU$foundation(), styleAnimations.timeOf(52)));
        }
        if ((i2 & 64) != 0) {
            styleProperties3.innerShadow(lerpShadows(styleProperties.innerShadow, styleProperties2.innerShadow, styleAnimations.timeOf(56)));
        }
        if ((i2 & 32) != 0) {
            styleProperties3.dropShadow(lerpShadows(styleProperties.dropShadow, styleProperties2.dropShadow, styleAnimations.timeOf(55)));
        }
        if ((i2 & 8) != 0) {
            styleProperties3.shape(lerp(styleProperties.shape, styleProperties2.shape, styleAnimations.timeOf(53)));
        }
    }

    public static final void lerpInnerLayout(long j2, StyleProperties styleProperties, StyleProperties styleProperties2, StyleAnimations styleAnimations, StyleProperties styleProperties3) {
        if ((1 & j2) != 0) {
            styleProperties3.contentPaddingStart(MathHelpersKt.lerp(styleProperties.contentPaddingStart, styleProperties2.contentPaddingStart, styleAnimations.timeOf(0)));
        }
        if ((2 & j2) != 0) {
            styleProperties3.contentPaddingEnd(MathHelpersKt.lerp(styleProperties.contentPaddingEnd, styleProperties2.contentPaddingEnd, styleAnimations.timeOf(1)));
        }
        if ((4 & j2) != 0) {
            styleProperties3.contentPaddingTop(MathHelpersKt.lerp(styleProperties.contentPaddingTop, styleProperties2.contentPaddingTop, styleAnimations.timeOf(2)));
        }
        if ((j2 & 8) != 0) {
            styleProperties3.contentPaddingBottom(MathHelpersKt.lerp(styleProperties.contentPaddingBottom, styleProperties2.contentPaddingBottom, styleAnimations.timeOf(3)));
        }
    }

    public static final void lerpLayer(long j2, StyleProperties styleProperties, StyleProperties styleProperties2, StyleAnimations styleAnimations, StyleProperties styleProperties3) {
        if ((2097152 & j2) != 0) {
            styleProperties3.alpha(MathHelpersKt.lerp(styleProperties.alpha, styleProperties2.alpha, styleAnimations.timeOf(21)));
        }
        if ((4194304 & j2) != 0) {
            styleProperties3.scaleX(MathHelpersKt.lerp(styleProperties.scaleX, styleProperties2.scaleX, styleAnimations.timeOf(22)));
        }
        if ((8388608 & j2) != 0) {
            styleProperties3.scaleY(MathHelpersKt.lerp(styleProperties.scaleY, styleProperties2.scaleY, styleAnimations.timeOf(23)));
        }
        if ((16777216 & j2) != 0) {
            styleProperties3.translationX(MathHelpersKt.lerp(styleProperties.translationX, styleProperties2.translationX, styleAnimations.timeOf(24)));
        }
        if ((33554432 & j2) != 0) {
            styleProperties3.translationY(MathHelpersKt.lerp(styleProperties.translationY, styleProperties2.translationY, styleAnimations.timeOf(25)));
        }
        if ((67108864 & j2) != 0) {
            styleProperties3.rotationX(MathHelpersKt.lerp(styleProperties.rotationX, styleProperties2.rotationX, styleAnimations.timeOf(26)));
        }
        if ((134217728 & j2) != 0) {
            styleProperties3.rotationY(MathHelpersKt.lerp(styleProperties.rotationY, styleProperties2.rotationY, styleAnimations.timeOf(27)));
        }
        if ((268435456 & j2) != 0) {
            styleProperties3.rotationZ(MathHelpersKt.lerp(styleProperties.rotationZ, styleProperties2.rotationZ, styleAnimations.timeOf(28)));
        }
        if ((536870912 & j2) != 0) {
            styleProperties3.translationX(MathHelpersKt.lerp(styleProperties.transformOriginX, styleProperties2.transformOriginX, styleAnimations.timeOf(29)));
        }
        if ((1073741824 & j2) != 0) {
            styleProperties3.translationY(MathHelpersKt.lerp(styleProperties.transformOriginY, styleProperties2.transformOriginY, styleAnimations.timeOf(30)));
        }
        if ((4294967296L & j2) != 0) {
            styleProperties3.zIndex(MathHelpersKt.lerp(styleProperties.zIndex, styleProperties2.zIndex, styleAnimations.timeOf(32)));
        }
        if ((j2 & 2147483648L) != 0) {
            styleProperties3.clip(styleAnimations.timeOf(31) < 0.5f ? styleProperties.clip : styleProperties2.clip);
        }
    }

    private static final float lerpMaybeNan(float f2, float f3, float f4) {
        boolean zIsNaN = Float.isNaN(f2);
        boolean zIsNaN2 = Float.isNaN(f3);
        if (zIsNaN) {
            return f3;
        }
        return !zIsNaN2 ? ((1.0f - f4) * f2) + (f4 * f3) : f2;
    }

    public static final void lerpOuterLayout(long j2, StyleProperties styleProperties, StyleProperties styleProperties2, StyleAnimations styleAnimations, StyleProperties styleProperties3) {
        if ((16 & j2) != 0) {
            float fTimeOf = styleAnimations.timeOf(4);
            float f2 = styleProperties.externalPaddingStart;
            float f3 = styleProperties2.externalPaddingStart;
            boolean zIsNaN = Float.isNaN(f2);
            boolean zIsNaN2 = Float.isNaN(f3);
            float f4 = (1.0f - fTimeOf) * f2;
            float f5 = fTimeOf * f3;
            if (zIsNaN) {
                f2 = f3;
            } else {
                float f6 = f4 + f5;
                if (!zIsNaN2) {
                    f2 = f6;
                }
            }
            styleProperties3.externalPaddingStart(f2);
        }
        if ((32 & j2) != 0) {
            float fTimeOf2 = styleAnimations.timeOf(5);
            float f7 = styleProperties.externalPaddingEnd;
            float f8 = styleProperties2.externalPaddingEnd;
            boolean zIsNaN3 = Float.isNaN(f7);
            boolean zIsNaN4 = Float.isNaN(f8);
            float f9 = (1.0f - fTimeOf2) * f7;
            float f10 = fTimeOf2 * f8;
            if (zIsNaN3) {
                f7 = f8;
            } else {
                float f11 = f9 + f10;
                if (!zIsNaN4) {
                    f7 = f11;
                }
            }
            styleProperties3.externalPaddingEnd(f7);
        }
        if ((64 & j2) != 0) {
            float fTimeOf3 = styleAnimations.timeOf(6);
            float f12 = styleProperties.externalPaddingTop;
            float f13 = styleProperties2.externalPaddingTop;
            boolean zIsNaN5 = Float.isNaN(f12);
            boolean zIsNaN6 = Float.isNaN(f13);
            float f14 = (1.0f - fTimeOf3) * f12;
            float f15 = fTimeOf3 * f13;
            if (zIsNaN5) {
                f12 = f13;
            } else {
                float f16 = f14 + f15;
                if (!zIsNaN6) {
                    f12 = f16;
                }
            }
            styleProperties3.externalPaddingTop(f12);
        }
        if ((128 & j2) != 0) {
            float fTimeOf4 = styleAnimations.timeOf(7);
            float f17 = styleProperties.externalPaddingBottom;
            float f18 = styleProperties2.externalPaddingBottom;
            boolean zIsNaN7 = Float.isNaN(f17);
            boolean zIsNaN8 = Float.isNaN(f18);
            float f19 = (1.0f - fTimeOf4) * f17;
            float f20 = fTimeOf4 * f18;
            if (zIsNaN7) {
                f17 = f18;
            } else {
                float f21 = f19 + f20;
                if (!zIsNaN8) {
                    f17 = f21;
                }
            }
            styleProperties3.externalPaddingBottom(f17);
        }
        if ((8192 & j2) != 0) {
            float fTimeOf5 = styleAnimations.timeOf(13);
            float f22 = styleProperties.left;
            float f23 = styleProperties2.left;
            boolean zIsNaN9 = Float.isNaN(f22);
            boolean zIsNaN10 = Float.isNaN(f23);
            float f24 = (1.0f - fTimeOf5) * f22;
            float f25 = fTimeOf5 * f23;
            if (zIsNaN9) {
                f22 = f23;
            } else {
                float f26 = f24 + f25;
                if (!zIsNaN10) {
                    f22 = f26;
                }
            }
            styleProperties3.left(f22);
        }
        if ((16384 & j2) != 0) {
            float fTimeOf6 = styleAnimations.timeOf(14);
            float f27 = styleProperties.top;
            float f28 = styleProperties2.top;
            boolean zIsNaN11 = Float.isNaN(f27);
            boolean zIsNaN12 = Float.isNaN(f28);
            float f29 = (1.0f - fTimeOf6) * f27;
            float f30 = fTimeOf6 * f28;
            if (zIsNaN11) {
                f27 = f28;
            } else {
                float f31 = f29 + f30;
                if (!zIsNaN12) {
                    f27 = f31;
                }
            }
            styleProperties3.top(f27);
        }
        if ((32768 & j2) != 0) {
            float fTimeOf7 = styleAnimations.timeOf(15);
            float f32 = styleProperties.right;
            float f33 = styleProperties2.right;
            boolean zIsNaN13 = Float.isNaN(f32);
            boolean zIsNaN14 = Float.isNaN(f33);
            float f34 = (1.0f - fTimeOf7) * f32;
            float f35 = fTimeOf7 * f33;
            if (zIsNaN13) {
                f32 = f33;
            } else {
                float f36 = f34 + f35;
                if (!zIsNaN14) {
                    f32 = f36;
                }
            }
            styleProperties3.right(f32);
        }
        if ((Frame.USAGE_VIDEO_ENCODE & j2) != 0) {
            float fTimeOf8 = styleAnimations.timeOf(16);
            float f37 = styleProperties.bottom;
            float f38 = styleProperties2.bottom;
            boolean zIsNaN15 = Float.isNaN(f37);
            boolean zIsNaN16 = Float.isNaN(f38);
            float f39 = (1.0f - fTimeOf8) * f37;
            float f40 = fTimeOf8 * f38;
            if (zIsNaN15) {
                f37 = f38;
            } else {
                float f41 = f39 + f40;
                if (!zIsNaN16) {
                    f37 = f41;
                }
            }
            styleProperties3.bottom(f37);
        }
        if ((512 & j2) != 0) {
            float fTimeOf9 = styleAnimations.timeOf(9);
            float f42 = styleProperties.width;
            float f43 = styleProperties2.width;
            boolean zIsNaN17 = Float.isNaN(f42);
            boolean zIsNaN18 = Float.isNaN(f43);
            float f44 = (1.0f - fTimeOf9) * f42;
            float f45 = fTimeOf9 * f43;
            if (zIsNaN17) {
                f42 = f43;
            } else {
                float f46 = f44 + f45;
                if (!zIsNaN18) {
                    f42 = f46;
                }
            }
            styleProperties3.width(f42);
        }
        if ((1024 & j2) != 0) {
            float fTimeOf10 = styleAnimations.timeOf(10);
            float f47 = styleProperties.height;
            float f48 = styleProperties2.height;
            boolean zIsNaN19 = Float.isNaN(f47);
            boolean zIsNaN20 = Float.isNaN(f48);
            float f49 = (1.0f - fTimeOf10) * f47;
            float f50 = fTimeOf10 * f48;
            if (zIsNaN19) {
                f47 = f48;
            } else {
                float f51 = f49 + f50;
                if (!zIsNaN20) {
                    f47 = f51;
                }
            }
            styleProperties3.height(f47);
        }
        if ((Frame.USAGE_COMPOSER_OVERLAY & j2) != 0) {
            float fTimeOf11 = styleAnimations.timeOf(11);
            float f52 = styleProperties.widthFraction;
            float f53 = styleProperties2.widthFraction;
            boolean zIsNaN21 = Float.isNaN(f52);
            boolean zIsNaN22 = Float.isNaN(f53);
            float f54 = (1.0f - fTimeOf11) * f52;
            float f55 = fTimeOf11 * f53;
            if (zIsNaN21) {
                f52 = f53;
            } else {
                float f56 = f54 + f55;
                if (!zIsNaN22) {
                    f52 = f56;
                }
            }
            styleProperties3.widthFraction(f52);
        }
        if ((4096 & j2) != 0) {
            float fTimeOf12 = styleAnimations.timeOf(12);
            float f57 = styleProperties.heightFraction;
            float f58 = styleProperties2.heightFraction;
            boolean zIsNaN23 = Float.isNaN(f57);
            boolean zIsNaN24 = Float.isNaN(f58);
            float f59 = (1.0f - fTimeOf12) * f57;
            float f60 = fTimeOf12 * f58;
            if (zIsNaN23) {
                f57 = f58;
            } else {
                float f61 = f59 + f60;
                if (!zIsNaN24) {
                    f57 = f61;
                }
            }
            styleProperties3.heightFraction(f57);
        }
        if ((131072 & j2) != 0) {
            float fTimeOf13 = styleAnimations.timeOf(17);
            float f62 = styleProperties.minWidth;
            float f63 = styleProperties2.minWidth;
            boolean zIsNaN25 = Float.isNaN(f62);
            boolean zIsNaN26 = Float.isNaN(f63);
            float f64 = (1.0f - fTimeOf13) * f62;
            float f65 = fTimeOf13 * f63;
            if (zIsNaN25) {
                f62 = f63;
            } else {
                float f66 = f64 + f65;
                if (!zIsNaN26) {
                    f62 = f66;
                }
            }
            styleProperties3.minWidth(f62);
        }
        if ((524288 & j2) != 0) {
            float fTimeOf14 = styleAnimations.timeOf(19);
            float f67 = styleProperties.maxWidth;
            float f68 = styleProperties2.maxWidth;
            boolean zIsNaN27 = Float.isNaN(f67);
            boolean zIsNaN28 = Float.isNaN(f68);
            float f69 = (1.0f - fTimeOf14) * f67;
            float f70 = fTimeOf14 * f68;
            if (zIsNaN27) {
                f67 = f68;
            } else {
                float f71 = f69 + f70;
                if (!zIsNaN28) {
                    f67 = f71;
                }
            }
            styleProperties3.maxWidth(f67);
        }
        if ((262144 & j2) != 0) {
            float fTimeOf15 = styleAnimations.timeOf(18);
            float f72 = styleProperties.minHeight;
            float f73 = styleProperties2.minHeight;
            boolean zIsNaN29 = Float.isNaN(f72);
            boolean zIsNaN30 = Float.isNaN(f73);
            float f74 = (1.0f - fTimeOf15) * f72;
            float f75 = fTimeOf15 * f73;
            if (zIsNaN29) {
                f72 = f73;
            } else {
                float f76 = f74 + f75;
                if (!zIsNaN30) {
                    f72 = f76;
                }
            }
            styleProperties3.minHeight(f72);
        }
        if ((j2 & 1048576) != 0) {
            float fTimeOf16 = styleAnimations.timeOf(20);
            float f77 = styleProperties.maxHeight;
            float f78 = styleProperties2.maxHeight;
            boolean zIsNaN31 = Float.isNaN(f77);
            boolean zIsNaN32 = Float.isNaN(f78);
            float f79 = (1.0f - fTimeOf16) * f77;
            float f80 = fTimeOf16 * f78;
            if (zIsNaN31) {
                f77 = f78;
            } else {
                float f81 = f79 + f80;
                if (!zIsNaN32) {
                    f77 = f81;
                }
            }
            styleProperties3.maxHeight(f77);
        }
    }

    private static final Object lerpShadows(Object obj, Object obj2, float f2) {
        Shadow[] shadowArr;
        Shadow[] shadowArr2;
        if (obj == null && obj2 == null) {
            return null;
        }
        boolean z = obj instanceof Object[];
        boolean z2 = obj2 instanceof Object[];
        if (!z && !z2) {
            return ShadowKt.lerp(obj instanceof Shadow ? (Shadow) obj : null, obj2 instanceof Shadow ? (Shadow) obj2 : null, f2);
        }
        if (z) {
            x.d(obj, "null cannot be cast to non-null type kotlin.Array<androidx.compose.ui.graphics.shadow.Shadow>");
            shadowArr = (Shadow[]) obj;
        } else {
            x.d(obj, "null cannot be cast to non-null type androidx.compose.ui.graphics.shadow.Shadow");
            shadowArr = new Shadow[]{(Shadow) obj};
        }
        if (z2) {
            x.d(obj2, "null cannot be cast to non-null type kotlin.Array<androidx.compose.ui.graphics.shadow.Shadow>");
            shadowArr2 = (Shadow[]) obj2;
        } else {
            x.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.graphics.shadow.Shadow");
            shadowArr2 = new Shadow[]{(Shadow) obj2};
        }
        return lerpArrayShadows(shadowArr, shadowArr2, f2);
    }

    public static final void lerpTextLayout(long j2, StyleProperties styleProperties, StyleProperties styleProperties2, StyleAnimations styleAnimations, StyleProperties styleProperties3) {
        int iM3167getFontStyle_LCdwA$foundation;
        if ((j2 & 274877906944L) != 0) {
            styleProperties3.textDecoration(((styleProperties.primitivesSet & 274877906944L) == 0 || ((274877906944L & styleProperties2.primitivesSet) != 0 && ((double) styleAnimations.timeOf(38)) >= 0.5d)) ? styleProperties2.getTextDecoration$foundation() : styleProperties.getTextDecoration$foundation());
        }
        if ((j2 & 70368744177664L) != 0) {
            styleProperties3.m3158fontSizeR2X_6o(((styleProperties.primitivesSet & 70368744177664L) == 0 || ((70368744177664L & styleProperties2.primitivesSet) != 0 && ((double) styleAnimations.timeOf(46)) >= 0.5d)) ? styleProperties2.m3166getFontSizeXSAIIZE$foundation() : styleProperties.m3166getFontSizeXSAIIZE$foundation());
        }
        if ((j2 & 140737488355328L) != 0) {
            styleProperties3.m3179lineHeightR2X_6o(((styleProperties.primitivesSet & 140737488355328L) == 0 || ((140737488355328L & styleProperties2.primitivesSet) != 0 && ((double) styleAnimations.timeOf(47)) >= 0.5d)) ? styleProperties2.m3173getLineHeightXSAIIZE$foundation() : styleProperties.m3173getLineHeightXSAIIZE$foundation());
        }
        if ((j2 & 281474976710656L) != 0) {
            styleProperties3.m3177letterSpacingR2X_6o(((styleProperties.primitivesSet & 281474976710656L) == 0 || ((281474976710656L & styleProperties2.primitivesSet) != 0 && ((double) styleAnimations.timeOf(48)) >= 0.5d)) ? styleProperties2.m3171getLetterSpacingXSAIIZE$foundation() : styleProperties.m3171getLetterSpacingXSAIIZE$foundation());
        }
        if ((j2 & 8796093022208L) != 0) {
            styleProperties3.m3155baselineShift4Dl_Bck(((styleProperties.primitivesSet & 8796093022208L) == 0 || ((8796093022208L & styleProperties2.primitivesSet) != 0 && ((double) styleAnimations.timeOf(43)) >= 0.5d)) ? styleProperties2.m3163getBaselineShifty9eOQZs$foundation() : styleProperties.m3163getBaselineShifty9eOQZs$foundation());
        }
        if ((j2 & 562949953421312L) != 0) {
            styleProperties3.m3178lineBreakCZqVlQI(((styleProperties.primitivesSet & 562949953421312L) == 0 || ((562949953421312L & styleProperties2.primitivesSet) != 0 && ((double) styleAnimations.timeOf(49)) >= 0.5d)) ? styleProperties2.m3172getLineBreakrAG3T2k$foundation() : styleProperties.m3172getLineBreakrAG3T2k$foundation());
        }
        if ((j2 & 2199023255552L) != 0) {
            styleProperties3.m3189textAlignaXe7zB0(((styleProperties.primitivesSet & 2199023255552L) == 0 || ((2199023255552L & styleProperties2.primitivesSet) != 0 && ((double) styleAnimations.timeOf(41)) >= 0.5d)) ? styleProperties2.m3174getTextAligne0LSkKk$foundation() : styleProperties.m3174getTextAligne0LSkKk$foundation());
        }
        if ((j2 & 4398046511104L) != 0) {
            styleProperties3.m3190textDirectionHejc4pk(((styleProperties.primitivesSet & 4398046511104L) == 0 || ((4398046511104L & styleProperties2.primitivesSet) != 0 && ((double) styleAnimations.timeOf(42)) >= 0.5d)) ? styleProperties2.m3175getTextDirections_7Xco$foundation() : styleProperties.m3175getTextDirections_7Xco$foundation());
        }
        if ((j2 & 17592186044416L) != 0) {
            styleProperties3.m3176hyphens3fSNIE(((styleProperties.primitivesSet & 17592186044416L) == 0 || ((17592186044416L & styleProperties2.primitivesSet) != 0 && ((double) styleAnimations.timeOf(44)) >= 0.5d)) ? styleProperties2.m3170getHyphensvmbZdU8$foundation() : styleProperties.m3170getHyphensvmbZdU8$foundation());
        }
        if ((j2 & 35184372088832L) != 0) {
            styleProperties3.m3160fontSynthesis6p3vJLY(((styleProperties.primitivesSet & 35184372088832L) == 0 || ((35184372088832L & styleProperties2.primitivesSet) != 0 && ((double) styleAnimations.timeOf(45)) >= 0.5d)) ? styleProperties2.m3168getFontSynthesisGVVA2EU$foundation() : styleProperties.m3168getFontSynthesisGVVA2EU$foundation());
        }
        if ((j2 & 549755813888L) != 0) {
            styleProperties3.fontWeight(((styleProperties.primitivesSet & 549755813888L) == 0 || ((549755813888L & styleProperties2.primitivesSet) != 0 && ((double) styleAnimations.timeOf(39)) >= 0.5d)) ? styleProperties2.getFontWeight$foundation() : styleProperties.getFontWeight$foundation());
        }
        if ((j2 & 1099511627776L) != 0) {
            if ((styleProperties.primitivesSet & 1099511627776L) == 0) {
                iM3167getFontStyle_LCdwA$foundation = styleProperties2.m3167getFontStyle_LCdwA$foundation();
            } else {
                if ((styleProperties2.primitivesSet & 1099511627776L) != 0) {
                    styleProperties3.m3159fontStylenzbMABs(((double) styleAnimations.timeOf(40)) < 0.5d ? styleProperties.m3167getFontStyle_LCdwA$foundation() : styleProperties2.m3167getFontStyle_LCdwA$foundation());
                    return;
                }
                iM3167getFontStyle_LCdwA$foundation = styleProperties.m3167getFontStyle_LCdwA$foundation();
            }
            styleProperties3.m3159fontStylenzbMABs(iM3167getFontStyle_LCdwA$foundation);
        }
    }

    private static final int objectFlagsOf(int i2) {
        int i3 = 0;
        for (int i4 = 50; i4 < 61; i4++) {
            if ((propertyFlags[i4] & i2) != 0) {
                i3 |= 1 << (i4 - 50);
            }
        }
        return i3;
    }

    public static final int objectPhaseFlagsOf(int i2) {
        return ((InnerLayoutObjectFlags & i2) != 0 ? 1 : 0) | ((OuterLayoutObjectFlags & i2) != 0 ? 8 : 0) | ((DrawObjectFlags & i2) != 0 ? 2 : 0) | ((LayerObjectFlags & i2) != 0 ? 4 : 0) | ((TextDrawObjectFlags & i2) != 0 ? 32 : 0) | ((i2 & TextLayoutObjectFlags) != 0 ? 16 : 0);
    }

    public static final int objectsSetForFlags(int i2) {
        return ((i2 & 1) != 0 ? getInnerLayoutObjectFlags() : 0) | ((i2 & 8) != 0 ? getOuterLayoutObjectFlags() : 0) | ((i2 & 2) != 0 ? getDrawObjectFlags() : 0) | ((i2 & 4) != 0 ? getLayerObjectFlags() : 0) | ((i2 & 32) != 0 ? getTextDrawObjectFlags() : 0) | ((i2 & 16) != 0 ? getTextLayoutObjectFlags() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long primitiveFlagsOf(int i2) {
        long j2 = 0;
        for (int i3 = 0; i3 < 50; i3++) {
            if ((propertyFlags[i3] & i2) != 0) {
                j2 |= 1 << ((byte) i3);
            }
        }
        return j2;
    }

    public static final int primitivePhaseFlagsOf(long j2) {
        return ((InnerLayoutPrimitiveFlags & j2) != 0 ? 1 : 0) | ((OuterLayoutPrimitiveFlags & j2) != 0 ? 8 : 0) | ((DrawPrimitiveFlags & j2) != 0 ? 2 : 0) | ((LayerPrimitiveFlags & j2) != 0 ? 4 : 0) | ((TextDrawPrimitiveFlags & j2) != 0 ? 32 : 0) | ((j2 & TextLayoutPrimitiveFlags) != 0 ? 16 : 0);
    }

    public static final long primitivesSetForFlags(int i2) {
        return ((i2 & 16) != 0 ? getTextLayoutPrimitiveFlags() : 0L) | ((i2 & 1) != 0 ? getInnerLayoutPrimitiveFlags() : 0L) | ((i2 & 8) != 0 ? getOuterLayoutPrimitiveFlags() : 0L) | ((i2 & 2) != 0 ? getDrawPrimitiveFlags() : 0L) | ((i2 & 4) != 0 ? getLayerPrimitiveFlags() : 0L) | ((i2 & 32) != 0 ? getTextDrawPrimitiveFlags() : 0L);
    }

    public static final long removeColorForBrushProperties(long j2, int i2) {
        if ((i2 & 1) != 0) {
            j2 &= -34359738369L;
        }
        if ((i2 & 128) != 0) {
            j2 &= -137438953473L;
        }
        if ((i2 & 2) != 0) {
            j2 &= -17179869185L;
        }
        return (i2 & 4) != 0 ? j2 & (-68719476737L) : j2;
    }

    private static final int setBits(int i2, int i3, int i4, int i5) {
        return (i2 & (~i3)) | (i3 & (i5 << i4));
    }

    private static final int shiftOffset(int i2) {
        return i2 - 50;
    }

    public static final int withId(int i2, int i3) {
        return i2 | (1 << (i3 - 50));
    }

    private static final int withoutId(int i2, int i3) {
        return i2 & (~(1 << (i3 - 50)));
    }

    private static final int shiftOffset(byte b2) {
        return b2;
    }

    public static final long withId(long j2, byte b2) {
        return j2 | (1 << b2);
    }

    private static final void flag(int i2, int i3) {
        int[] iArr = propertyFlags;
        iArr[i2] = i3 | iArr[i2];
    }

    public static final long withoutId(long j2, byte b2) {
        return j2 & (~(1 << b2));
    }

    public static /* synthetic */ void getEmptyStyleProperties$annotations() {
    }

    private static /* synthetic */ void getFlagsBuild$annotations() {
    }

    private static final boolean hasId(int i2, int i3) {
        return (i2 & (1 << (i3 + (-50)))) != 0;
    }

    private static final <T> boolean compareProperty(int i2, int i3, T t, T t2) {
        return ((i2 & (1 << (i3 + (-50)))) == 0 || x.n(t, t2)) ? false : true;
    }

    private static final boolean compareProperty(long j2, byte b2, boolean z, boolean z2) {
        return ((j2 & (1 << b2)) == 0 || z == z2) ? false : true;
    }

    private static final boolean compareProperty(long j2, byte b2, FontWeight fontWeight, FontWeight fontWeight2) {
        return ((j2 & (1 << b2)) == 0 || x.n(fontWeight, fontWeight2)) ? false : true;
    }

    private static final <T> void animateAB(StyleProperties styleProperties, StyleProperties styleProperties2, StyleProperties styleProperties3, int i2, int i3, StyleAnimations styleAnimations, l<? super StyleProperties, ? extends T> lVar, p<? super StyleProperties, ? super T, ab> pVar) {
        int i4 = 1 << (i2 - 50);
        if ((i3 & i4) != 0) {
            if ((styleProperties2.objectsSet & i4) != 0) {
                if ((styleProperties3.objectsSet & i4) != 0) {
                    pVar.invoke(styleProperties, ((double) styleAnimations.timeOf(i2)) < 0.5d ? lVar.invoke(styleProperties2) : lVar.invoke(styleProperties3));
                    return;
                } else {
                    pVar.invoke(styleProperties, lVar.invoke(styleProperties2));
                    return;
                }
            }
            pVar.invoke(styleProperties, lVar.invoke(styleProperties3));
        }
    }

    public static final void lerpDraw(long j2, StyleProperties styleProperties, StyleProperties styleProperties2, StyleAnimations styleAnimations, StyleProperties styleProperties3) {
        if ((256 & j2) != 0) {
            styleProperties3.borderWidth(MathHelpersKt.lerp(styleProperties.borderWidth, styleProperties2.borderWidth, styleAnimations.timeOf(8)));
        }
        if ((34359738368L & j2) != 0) {
            styleProperties3.m3156borderColor8_81llA(ColorKt.m8279lerpjxsXWHM(styleProperties.m3164getBorderColor0d7_KjU$foundation(), styleProperties2.m3164getBorderColor0d7_KjU$foundation(), styleAnimations.timeOf(35)));
        }
        if ((17179869184L & j2) != 0) {
            styleProperties3.m3154backgroundColor8_81llA(ColorKt.m8279lerpjxsXWHM(styleProperties.m3162getBackgroundColor0d7_KjU$foundation(), styleProperties2.m3162getBackgroundColor0d7_KjU$foundation(), styleAnimations.timeOf(34)));
        }
        if ((j2 & 68719476736L) != 0) {
            styleProperties3.m3161foregroundColor8_81llA(ColorKt.m8279lerpjxsXWHM(styleProperties.m3169getForegroundColor0d7_KjU$foundation(), styleProperties2.m3169getForegroundColor0d7_KjU$foundation(), styleAnimations.timeOf(36)));
        }
    }

    private static final ColorFilter lerp(BlendModeColorFilter blendModeColorFilter, BlendModeColorFilter blendModeColorFilter2, float f2) {
        return ColorFilter.Companion.m8272tintxETnrds(ColorKt.m8279lerpjxsXWHM(blendModeColorFilter.m8171getColor0d7_KjU(), blendModeColorFilter2.m8171getColor0d7_KjU(), f2), f2 <= 0.5f ? blendModeColorFilter.m8170getBlendMode0nO6VwU() : blendModeColorFilter2.m8170getBlendMode0nO6VwU());
    }

    private static final ColorFilter lerp(ColorFilter colorFilter, ColorFilter colorFilter2, float f2) {
        if ((colorFilter instanceof BlendModeColorFilter) && (colorFilter2 instanceof BlendModeColorFilter)) {
            return lerp((BlendModeColorFilter) colorFilter, (BlendModeColorFilter) colorFilter2, f2);
        }
        if ((colorFilter instanceof LightingColorFilter) && (colorFilter2 instanceof LightingColorFilter)) {
            return lerp((LightingColorFilter) colorFilter, (LightingColorFilter) colorFilter2, f2);
        }
        return f2 <= 0.5f ? colorFilter : colorFilter2;
    }

    private static final ColorFilter lerp(LightingColorFilter lightingColorFilter, LightingColorFilter lightingColorFilter2, float f2) {
        return ColorFilter.Companion.m8271lightingOWjLjI(ColorKt.m8279lerpjxsXWHM(lightingColorFilter.m8486getMultiply0d7_KjU(), lightingColorFilter2.m8486getMultiply0d7_KjU(), f2), ColorKt.m8279lerpjxsXWHM(lightingColorFilter.m8485getAdd0d7_KjU(), lightingColorFilter2.m8485getAdd0d7_KjU(), f2));
    }

    private static final Shape lerp(Shape shape, Shape shape2, float f2) {
        if (f2 != 0.0f) {
            if (f2 != 1.0f) {
                Object objLerp = Interpolatable.Companion.lerp(shape, shape2, f2);
                Shape shape3 = objLerp instanceof Shape ? (Shape) objLerp : null;
                if (shape3 != null) {
                    return shape3;
                }
                if (f2 < 0.5d) {
                }
            }
            return shape2;
        }
        return shape;
    }

    public static final void lerpLayer(int i2, StyleProperties styleProperties, StyleProperties styleProperties2, StyleAnimations styleAnimations, StyleProperties styleProperties3) {
        if ((i2 & 16) != 0) {
            styleProperties3.colorFilter(lerp(styleProperties.colorFilter, styleProperties2.colorFilter, styleAnimations.timeOf(54)));
        }
    }

    public static final void lerpTextLayout(int i2, StyleProperties styleProperties, StyleProperties styleProperties2, StyleAnimations styleAnimations, StyleProperties styleProperties3) {
        TextIndent textIndent;
        if ((i2 & 256) != 0) {
            styleProperties3.fontFamily(((styleProperties.objectsSet & 256) == 0 || ((styleProperties2.objectsSet & 256) != 0 && ((double) styleAnimations.timeOf(58)) >= 0.5d)) ? styleProperties2.fontFamily : styleProperties.fontFamily);
        }
        if ((i2 & 512) != 0) {
            styleProperties3.textMotion(((styleProperties.objectsSet & 512) == 0 || ((styleProperties2.objectsSet & 512) != 0 && ((double) styleAnimations.timeOf(59)) >= 0.5d)) ? styleProperties2.textMotion : styleProperties.textMotion);
        }
        if ((i2 & 1024) != 0) {
            if ((styleProperties.objectsSet & 1024) == 0) {
                textIndent = styleProperties2.textIndent;
            } else {
                if ((styleProperties2.objectsSet & 1024) != 0) {
                    TextIndent textIndent2 = ((double) styleAnimations.timeOf(60)) < 0.5d ? styleProperties.textIndent : styleProperties2.textIndent;
                    x.c(textIndent2);
                    styleProperties3.textIndent(textIndent2);
                    return;
                }
                textIndent = styleProperties.textIndent;
            }
            x.c(textIndent);
            styleProperties3.textIndent(textIndent);
        }
    }
}
