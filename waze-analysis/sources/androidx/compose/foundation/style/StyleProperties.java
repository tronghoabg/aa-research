package androidx.compose.foundation.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.ValueElement;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.common.video.Frame;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StyleProperties {
    public static final int $stable = 8;
    public Brush backgroundBrush;
    public Brush borderBrush;
    public float borderWidth;
    public float bottom;
    public boolean clip;
    public ColorFilter colorFilter;
    private Brush contentBrush;
    public float contentPaddingBottom;
    public float contentPaddingEnd;
    public float contentPaddingStart;
    public float contentPaddingTop;
    public Object dropShadow;
    public float externalPaddingBottom;
    public float externalPaddingEnd;
    public float externalPaddingStart;
    public float externalPaddingTop;
    public FontFamily fontFamily;
    public Brush foregroundBrush;
    public Object innerShadow;
    public float left;
    public int objectsSet;
    public long primitivesSet;
    public float right;
    public float rotationX;
    public float rotationY;
    public float rotationZ;
    public int textEnums;
    public TextIndent textIndent;
    public float top;
    public float translationX;
    public float translationY;
    public float zIndex;
    public float width = Float.NaN;
    public float height = Float.NaN;
    public float widthFraction = Float.NaN;
    public float heightFraction = Float.NaN;
    public float minHeight = Float.NaN;
    public float maxHeight = Float.NaN;
    public float minWidth = Float.NaN;
    public float maxWidth = Float.NaN;
    private long borderColor = Color.Companion.m8254getBlack0d7_KjU();
    private long backgroundColor = Color.Companion.m8263getTransparent0d7_KjU();
    private long foregroundColor = Color.Companion.m8264getUnspecified0d7_KjU();
    public Shape shape = RectangleShapeKt.getRectangleShape();
    public float alpha = 1.0f;
    public float scaleX = 1.0f;
    public float scaleY = 1.0f;
    public float transformOriginX = TransformOrigin.m8666getPivotFractionXimpl(TransformOrigin.Companion.m8671getCenterSzJe1aQ());
    public float transformOriginY = TransformOrigin.m8667getPivotFractionYimpl(TransformOrigin.Companion.m8671getCenterSzJe1aQ());
    public float cameraDistance = 1.0f;
    private long contentColor = Color.Companion.m8264getUnspecified0d7_KjU();
    public TextMotion textMotion = TextMotion.Companion.getStatic();
    private long fontSize = TextUnit.Companion.m11373getUnspecifiedXSAIIZE();
    private long lineHeight = TextUnit.Companion.m11373getUnspecifiedXSAIIZE();
    private long letterSpacing = TextUnit.Companion.m11373getUnspecifiedXSAIIZE();
    private float baselineShift = BaselineShift.Companion.m10887getUnspecifiedy9eOQZs();
    private int lineBreak = LineBreak.Companion.m10929getUnspecifiedrAG3T2k();

    public static /* synthetic */ int diff$foundation$default(StyleProperties styleProperties, StyleProperties styleProperties2, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 63;
        }
        return styleProperties.diff$foundation(styleProperties2, i2);
    }

    private static final boolean valueElements$lambda$0$add(List<ValueElement> list, String str, Object obj) {
        return list.add(new ValueElement(str, obj));
    }

    public final void alpha(float f2) {
        this.primitivesSet |= 2097152;
        this.alpha = f2;
    }

    public final void backgroundBrush(Brush brush) {
        this.primitivesSet &= -17179869185L;
        int i2 = this.objectsSet;
        this.objectsSet = brush != null ? i2 | 2 : i2 & (-3);
        this.backgroundBrush = brush;
        this.backgroundColor = Color.Companion.m8264getUnspecified0d7_KjU();
    }

    /* renamed from: backgroundColor-8_81llA, reason: not valid java name */
    public final void m3154backgroundColor8_81llA(long j2) {
        this.primitivesSet |= 17179869184L;
        this.objectsSet &= -3;
        this.backgroundColor = j2;
        this.backgroundBrush = null;
    }

    /* renamed from: baselineShift-4Dl_Bck, reason: not valid java name */
    public final void m3155baselineShift4Dl_Bck(float f2) {
        this.primitivesSet |= 8796093022208L;
        this.baselineShift = f2;
    }

    public final void borderBrush(Brush brush) {
        this.primitivesSet &= -34359738369L;
        int i2 = this.objectsSet;
        this.objectsSet = brush != null ? i2 | 1 : i2 & (-2);
        this.borderBrush = brush;
        this.borderColor = Color.Companion.m8264getUnspecified0d7_KjU();
    }

    /* renamed from: borderColor-8_81llA, reason: not valid java name */
    public final void m3156borderColor8_81llA(long j2) {
        this.primitivesSet |= 34359738368L;
        this.objectsSet &= -2;
        this.borderColor = j2;
        this.borderBrush = null;
    }

    public final void borderWidth(float f2) {
        this.primitivesSet |= 256;
        this.borderWidth = f2;
    }

    public final void bottom(float f2) {
        this.primitivesSet |= Frame.USAGE_VIDEO_ENCODE;
        this.bottom = f2;
    }

    public final void cameraDistance(float f2) {
        this.primitivesSet |= 8589934592L;
        this.cameraDistance = f2;
    }

    public final void clear$foundation() {
        StylePropertiesKt.getEmptyStyleProperties().copyInto$foundation(this);
    }

    public final void clip(boolean z) {
        this.primitivesSet |= 2147483648L;
        this.clip = z;
    }

    public final void colorFilter(ColorFilter colorFilter) {
        this.objectsSet |= 16;
        this.colorFilter = colorFilter;
    }

    public final void contentBrush(Brush brush) {
        this.primitivesSet &= -137438953473L;
        int i2 = this.objectsSet;
        this.objectsSet = brush != null ? i2 | 128 : i2 & (-129);
        this.contentBrush = brush;
        this.contentColor = Color.Companion.m8264getUnspecified0d7_KjU();
    }

    /* renamed from: contentColor-8_81llA, reason: not valid java name */
    public final void m3157contentColor8_81llA(long j2) {
        this.primitivesSet |= 137438953472L;
        this.objectsSet &= -129;
        this.contentColor = j2;
        this.contentBrush = null;
    }

    public final void contentPaddingBottom(float f2) {
        this.primitivesSet |= 8;
        this.contentPaddingBottom = f2;
    }

    public final void contentPaddingEnd(float f2) {
        this.primitivesSet |= 2;
        this.contentPaddingEnd = f2;
    }

    public final void contentPaddingStart(float f2) {
        this.primitivesSet |= 1;
        this.contentPaddingStart = f2;
    }

    public final void contentPaddingTop(float f2) {
        this.primitivesSet |= 4;
        this.contentPaddingTop = f2;
    }

    public final StyleProperties copy$foundation() {
        StyleProperties styleProperties = new StyleProperties();
        copyInto$foundation(styleProperties);
        return styleProperties;
    }

    public final void copyInto$foundation(StyleProperties styleProperties, int i2) {
        long jPrimitiveFlagsOf = this.primitivesSet & StylePropertiesKt.primitiveFlagsOf(i2);
        int innerLayoutObjectFlags = (((i2 & 1) != 0 ? StylePropertiesKt.getInnerLayoutObjectFlags() : 0) | ((i2 & 8) != 0 ? StylePropertiesKt.getOuterLayoutObjectFlags() : 0) | ((i2 & 2) != 0 ? StylePropertiesKt.getDrawObjectFlags() : 0) | ((i2 & 4) != 0 ? StylePropertiesKt.getLayerObjectFlags() : 0) | ((i2 & 32) != 0 ? StylePropertiesKt.getTextDrawObjectFlags() : 0) | ((i2 & 16) != 0 ? StylePropertiesKt.getTextLayoutObjectFlags() : 0)) & this.objectsSet;
        if (jPrimitiveFlagsOf != 0) {
            if ((8192 & jPrimitiveFlagsOf) != 0) {
                styleProperties.left(this.left);
            }
            if ((16384 & jPrimitiveFlagsOf) != 0) {
                styleProperties.top(this.top);
            }
            if ((32768 & jPrimitiveFlagsOf) != 0) {
                styleProperties.right(this.right);
            }
            if ((Frame.USAGE_VIDEO_ENCODE & jPrimitiveFlagsOf) != 0) {
                styleProperties.bottom(this.bottom);
            }
            if ((262144 & jPrimitiveFlagsOf) != 0) {
                styleProperties.minHeight(this.minHeight);
            }
            if ((1048576 & jPrimitiveFlagsOf) != 0) {
                styleProperties.maxHeight(this.maxHeight);
            }
            if ((131072 & jPrimitiveFlagsOf) != 0) {
                styleProperties.minWidth(this.minWidth);
            }
            if ((524288 & jPrimitiveFlagsOf) != 0) {
                styleProperties.maxWidth(this.maxWidth);
            }
            if ((1 & jPrimitiveFlagsOf) != 0) {
                styleProperties.contentPaddingStart(this.contentPaddingStart);
            }
            if ((2 & jPrimitiveFlagsOf) != 0) {
                styleProperties.contentPaddingEnd(this.contentPaddingEnd);
            }
            if ((4 & jPrimitiveFlagsOf) != 0) {
                styleProperties.contentPaddingTop(this.contentPaddingTop);
            }
            if ((8 & jPrimitiveFlagsOf) != 0) {
                styleProperties.contentPaddingBottom(this.contentPaddingBottom);
            }
            if ((16 & jPrimitiveFlagsOf) != 0) {
                styleProperties.externalPaddingStart(this.externalPaddingStart);
            }
            if ((32 & jPrimitiveFlagsOf) != 0) {
                styleProperties.externalPaddingEnd(this.externalPaddingEnd);
            }
            if ((64 & jPrimitiveFlagsOf) != 0) {
                styleProperties.externalPaddingTop(this.externalPaddingTop);
            }
            if ((128 & jPrimitiveFlagsOf) != 0) {
                styleProperties.externalPaddingBottom(this.externalPaddingBottom);
            }
            if ((256 & jPrimitiveFlagsOf) != 0) {
                styleProperties.borderWidth(this.borderWidth);
            }
            if ((2097152 & jPrimitiveFlagsOf) != 0) {
                styleProperties.alpha(this.alpha);
            }
            if ((4194304 & jPrimitiveFlagsOf) != 0) {
                styleProperties.scaleX(this.scaleX);
            }
            if ((8388608 & jPrimitiveFlagsOf) != 0) {
                styleProperties.scaleY(this.scaleY);
            }
            if ((16777216 & jPrimitiveFlagsOf) != 0) {
                styleProperties.translationX(this.translationX);
            }
            if ((33554432 & jPrimitiveFlagsOf) != 0) {
                styleProperties.translationY(this.translationY);
            }
            if ((67108864 & jPrimitiveFlagsOf) != 0) {
                styleProperties.rotationX(this.rotationX);
            }
            if ((134217728 & jPrimitiveFlagsOf) != 0) {
                styleProperties.rotationY(this.rotationY);
            }
            if ((268435456 & jPrimitiveFlagsOf) != 0) {
                styleProperties.rotationZ(this.rotationZ);
            }
            if ((536870912 & jPrimitiveFlagsOf) != 0) {
                styleProperties.transformOriginX(this.transformOriginX);
            }
            if ((1073741824 & jPrimitiveFlagsOf) != 0) {
                styleProperties.transformOriginY(this.transformOriginY);
            }
            if ((4294967296L & jPrimitiveFlagsOf) != 0) {
                styleProperties.zIndex(this.zIndex);
            }
            if ((8589934592L & jPrimitiveFlagsOf) != 0) {
                styleProperties.cameraDistance(this.cameraDistance);
            }
            if ((34359738368L & jPrimitiveFlagsOf) != 0) {
                styleProperties.m3156borderColor8_81llA(this.borderColor);
            }
            if ((17179869184L & jPrimitiveFlagsOf) != 0) {
                styleProperties.m3154backgroundColor8_81llA(this.backgroundColor);
            }
            if ((68719476736L & jPrimitiveFlagsOf) != 0) {
                styleProperties.m3161foregroundColor8_81llA(this.foregroundColor);
            }
            if ((2147483648L & jPrimitiveFlagsOf) != 0) {
                styleProperties.clip(this.clip);
            }
            if ((512 & jPrimitiveFlagsOf) != 0) {
                styleProperties.width(this.width);
            }
            if ((1024 & jPrimitiveFlagsOf) != 0) {
                styleProperties.height(this.height);
            }
            if ((Frame.USAGE_COMPOSER_OVERLAY & jPrimitiveFlagsOf) != 0) {
                styleProperties.widthFraction(this.widthFraction);
            }
            if ((4096 & jPrimitiveFlagsOf) != 0) {
                styleProperties.heightFraction(this.heightFraction);
            }
            if ((137438953472L & jPrimitiveFlagsOf) != 0) {
                styleProperties.m3157contentColor8_81llA(this.contentColor);
            }
            if ((140737488355328L & jPrimitiveFlagsOf) != 0) {
                styleProperties.m3179lineHeightR2X_6o(this.lineHeight);
            }
            if ((281474976710656L & jPrimitiveFlagsOf) != 0) {
                styleProperties.m3177letterSpacingR2X_6o(this.letterSpacing);
            }
            if ((8796093022208L & jPrimitiveFlagsOf) != 0) {
                styleProperties.m3155baselineShift4Dl_Bck(this.baselineShift);
            }
            if ((562949953421312L & jPrimitiveFlagsOf) != 0) {
                styleProperties.m3178lineBreakCZqVlQI(this.lineBreak);
            }
            if ((StylePropertiesKt.TextEnumMask & jPrimitiveFlagsOf) != 0) {
                if ((274877906944L & jPrimitiveFlagsOf) != 0) {
                    styleProperties.textDecoration(getTextDecoration$foundation());
                }
                if ((70368744177664L & jPrimitiveFlagsOf) != 0) {
                    styleProperties.m3158fontSizeR2X_6o(this.fontSize);
                }
                if ((2199023255552L & jPrimitiveFlagsOf) != 0) {
                    styleProperties.m3189textAlignaXe7zB0(m3174getTextAligne0LSkKk$foundation());
                }
                if ((4398046511104L & jPrimitiveFlagsOf) != 0) {
                    styleProperties.m3190textDirectionHejc4pk(m3175getTextDirections_7Xco$foundation());
                }
                if ((17592186044416L & jPrimitiveFlagsOf) != 0) {
                    styleProperties.m3176hyphens3fSNIE(m3170getHyphensvmbZdU8$foundation());
                }
                if ((35184372088832L & jPrimitiveFlagsOf) != 0) {
                    styleProperties.m3160fontSynthesis6p3vJLY(m3168getFontSynthesisGVVA2EU$foundation());
                }
                if ((549755813888L & jPrimitiveFlagsOf) != 0) {
                    styleProperties.fontWeight(getFontWeight$foundation());
                }
                if ((jPrimitiveFlagsOf & 1099511627776L) != 0) {
                    styleProperties.m3159fontStylenzbMABs(m3167getFontStyle_LCdwA$foundation());
                }
            }
        }
        if (innerLayoutObjectFlags != 0) {
            if ((innerLayoutObjectFlags & 8) != 0) {
                styleProperties.shape(this.shape);
            }
            if ((innerLayoutObjectFlags & 16) != 0) {
                styleProperties.colorFilter(this.colorFilter);
            }
            if ((innerLayoutObjectFlags & 1) != 0) {
                styleProperties.borderBrush(this.borderBrush);
            }
            if ((innerLayoutObjectFlags & 2) != 0) {
                styleProperties.backgroundBrush(this.backgroundBrush);
            }
            if ((innerLayoutObjectFlags & 4) != 0) {
                styleProperties.foregroundBrush(this.foregroundBrush);
            }
            if ((innerLayoutObjectFlags & 32) != 0) {
                styleProperties.dropShadow(this.dropShadow);
            }
            if ((innerLayoutObjectFlags & 64) != 0) {
                styleProperties.innerShadow(this.innerShadow);
            }
            if ((innerLayoutObjectFlags & 128) != 0) {
                styleProperties.contentBrush(this.contentBrush);
            }
            if ((innerLayoutObjectFlags & 256) != 0) {
                styleProperties.fontFamily(this.fontFamily);
            }
            if ((innerLayoutObjectFlags & 512) != 0) {
                styleProperties.textMotion(this.textMotion);
            }
            if ((innerLayoutObjectFlags & 1024) != 0) {
                TextIndent textIndent = this.textIndent;
                x.c(textIndent);
                styleProperties.textIndent(textIndent);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:347:0x0615, code lost:
    
        if (h.g.b.x.n(r0, r1) == false) goto L349;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int diff$foundation(androidx.compose.foundation.style.StyleProperties r20, int r21) {
        /*
            Method dump skipped, instructions count: 1564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.style.StyleProperties.diff$foundation(androidx.compose.foundation.style.StyleProperties, int):int");
    }

    public final void dropShadow(Object obj) {
        int i2 = this.objectsSet;
        this.objectsSet = obj != null ? i2 | 32 : i2 & (-33);
        this.dropShadow = obj;
    }

    public final void externalPaddingBottom(float f2) {
        this.primitivesSet |= 128;
        this.externalPaddingBottom = f2;
    }

    public final void externalPaddingEnd(float f2) {
        this.primitivesSet |= 32;
        this.externalPaddingEnd = f2;
    }

    public final void externalPaddingStart(float f2) {
        this.primitivesSet |= 16;
        this.externalPaddingStart = f2;
    }

    public final void externalPaddingTop(float f2) {
        this.primitivesSet |= 64;
        this.externalPaddingTop = f2;
    }

    public final void fontFamily(FontFamily fontFamily) {
        this.objectsSet |= 256;
        this.fontFamily = fontFamily;
    }

    /* renamed from: fontSize--R2X_6o, reason: not valid java name */
    public final void m3158fontSizeR2X_6o(long j2) {
        this.primitivesSet |= 70368744177664L;
        this.fontSize = j2;
    }

    /* renamed from: fontStyle-nzbMABs, reason: not valid java name */
    public final void m3159fontStylenzbMABs(int i2) {
        this.primitivesSet |= 1099511627776L;
        this.textEnums = ((i2 | 2) & 3) | (this.textEnums & (-4));
    }

    /* renamed from: fontSynthesis-6p3vJLY, reason: not valid java name */
    public final void m3160fontSynthesis6p3vJLY(int i2) {
        this.primitivesSet |= 35184372088832L;
        this.textEnums = ((i2 << 10) & StylePropertiesKt.FontSynthesisMask) | (this.textEnums & (-15361));
    }

    public final void fontWeight(FontWeight fontWeight) {
        this.primitivesSet |= 549755813888L;
        this.textEnums = ((fontWeight.getWeight() << 17) & StylePropertiesKt.FontWeightMask) | (this.textEnums & (-134086657));
    }

    public final void foregroundBrush(Brush brush) {
        this.primitivesSet &= -68719476737L;
        int i2 = this.objectsSet;
        this.objectsSet = brush != null ? i2 | 4 : i2 & (-5);
        this.foregroundBrush = brush;
        this.foregroundColor = Color.Companion.m8264getUnspecified0d7_KjU();
    }

    /* renamed from: foregroundColor-8_81llA, reason: not valid java name */
    public final void m3161foregroundColor8_81llA(long j2) {
        this.primitivesSet |= 68719476736L;
        this.objectsSet &= -5;
        this.foregroundColor = j2;
        this.foregroundBrush = null;
    }

    /* renamed from: getBackgroundColor-0d7_KjU$foundation, reason: not valid java name */
    public final long m3162getBackgroundColor0d7_KjU$foundation() {
        return this.backgroundColor;
    }

    /* renamed from: getBaselineShift-y9eOQZs$foundation, reason: not valid java name */
    public final float m3163getBaselineShifty9eOQZs$foundation() {
        return this.baselineShift;
    }

    /* renamed from: getBorderColor-0d7_KjU$foundation, reason: not valid java name */
    public final long m3164getBorderColor0d7_KjU$foundation() {
        return this.borderColor;
    }

    public final Brush getContentBrush$foundation() {
        return this.contentBrush;
    }

    /* renamed from: getContentColor-0d7_KjU$foundation, reason: not valid java name */
    public final long m3165getContentColor0d7_KjU$foundation() {
        return this.contentColor;
    }

    /* renamed from: getFontSize-XSAIIZE$foundation, reason: not valid java name */
    public final long m3166getFontSizeXSAIIZE$foundation() {
        return this.fontSize;
    }

    /* renamed from: getFontStyle-_-LCdwA$foundation, reason: not valid java name */
    public final int m3167getFontStyle_LCdwA$foundation() {
        return ((this.primitivesSet & 1099511627776L) == 0 || (this.textEnums & 1) != 1) ? FontStyle.Companion.m10668getNormal_LCdwA() : FontStyle.Companion.m10667getItalic_LCdwA();
    }

    /* renamed from: getFontSynthesis-GVVA2EU$foundation, reason: not valid java name */
    public final int m3168getFontSynthesisGVVA2EU$foundation() {
        if ((this.primitivesSet & 35184372088832L) == 0) {
            return FontSynthesis.Companion.m10679getNoneGVVA2EU();
        }
        FontSynthesis.Companion companion = FontSynthesis.Companion;
        int i2 = (this.textEnums & StylePropertiesKt.FontSynthesisMask) >> 10;
        companion.m10682valueOf9CiegCU(i2);
        return i2;
    }

    public final FontWeight getFontWeight$foundation() {
        return (this.primitivesSet & 549755813888L) != 0 ? new FontWeight((this.textEnums >> 17) & 1023) : FontWeight.Companion.getNormal();
    }

    /* renamed from: getForegroundColor-0d7_KjU$foundation, reason: not valid java name */
    public final long m3169getForegroundColor0d7_KjU$foundation() {
        return this.foregroundColor;
    }

    /* renamed from: getHyphens-vmbZdU8$foundation, reason: not valid java name */
    public final int m3170getHyphensvmbZdU8$foundation() {
        if ((this.primitivesSet & 17592186044416L) == 0) {
            return Hyphens.Companion.m10905getUnspecifiedvmbZdU8();
        }
        Hyphens.Companion companion = Hyphens.Companion;
        int i2 = (this.textEnums & 768) >> 8;
        companion.m10906valueOfkPa1_AA(i2);
        return i2;
    }

    /* renamed from: getLetterSpacing-XSAIIZE$foundation, reason: not valid java name */
    public final long m3171getLetterSpacingXSAIIZE$foundation() {
        return this.letterSpacing;
    }

    /* renamed from: getLineBreak-rAG3T2k$foundation, reason: not valid java name */
    public final int m3172getLineBreakrAG3T2k$foundation() {
        return this.lineBreak;
    }

    /* renamed from: getLineHeight-XSAIIZE$foundation, reason: not valid java name */
    public final long m3173getLineHeightXSAIIZE$foundation() {
        return this.lineHeight;
    }

    public final int getPhaseFlags$foundation() {
        return StylePropertiesKt.objectPhaseFlagsOf(this.objectsSet) | StylePropertiesKt.primitivePhaseFlagsOf(this.primitivesSet);
    }

    /* renamed from: getTextAlign-e0LSkKk$foundation, reason: not valid java name */
    public final int m3174getTextAligne0LSkKk$foundation() {
        if ((this.primitivesSet & 2199023255552L) == 0) {
            return TextAlign.Companion.m11017getUnspecifiede0LSkKk();
        }
        TextAlign.Companion companion = TextAlign.Companion;
        int i2 = (this.textEnums & 28) >> 2;
        companion.m11018valueOfIgVj0fw(i2);
        return i2;
    }

    public final TextDecoration getTextDecoration$foundation() {
        return (this.primitivesSet & 274877906944L) != 0 ? TextDecoration.Companion.valueOf((this.textEnums >> 14) & 3) : TextDecoration.Companion.getNone();
    }

    /* renamed from: getTextDirection-s_7X-co$foundation, reason: not valid java name */
    public final int m3175getTextDirections_7Xco$foundation() {
        if ((this.primitivesSet & 4398046511104L) == 0) {
            return TextDirection.Companion.m11033getUnspecifieds_7Xco();
        }
        TextDirection.Companion companion = TextDirection.Companion;
        int i2 = (this.textEnums & 112) >> 4;
        companion.m11034valueOfE8nx0Ws(i2);
        return i2;
    }

    public final boolean hasId(byte b2) {
        return ((1 << b2) & this.primitivesSet) != 0;
    }

    public final boolean hasLayerProperties() {
        return ((this.primitivesSet & StylePropertiesKt.getLayerPrimitiveFlags()) == 0 && (this.objectsSet & StylePropertiesKt.getLayerObjectFlags()) == 0) ? false : true;
    }

    public final void height(float f2) {
        this.primitivesSet = (this.primitivesSet | 1024) & (-4097);
        this.height = f2;
        this.heightFraction = Float.NaN;
    }

    public final void heightFraction(float f2) {
        this.primitivesSet = (this.primitivesSet & (-1025)) | 4096;
        this.heightFraction = f2;
        this.height = Float.NaN;
    }

    /* renamed from: hyphens--3fSNIE, reason: not valid java name */
    public final void m3176hyphens3fSNIE(int i2) {
        this.primitivesSet |= 17592186044416L;
        this.textEnums = ((i2 << 8) & 768) | (this.textEnums & (-769));
    }

    public final void innerShadow(Object obj) {
        int i2 = this.objectsSet;
        this.objectsSet = obj != null ? i2 | 64 : i2 & (-65);
        this.innerShadow = obj;
    }

    public final void left(float f2) {
        this.primitivesSet |= 8192;
        this.left = f2;
    }

    /* renamed from: letterSpacing--R2X_6o, reason: not valid java name */
    public final void m3177letterSpacingR2X_6o(long j2) {
        this.primitivesSet |= 281474976710656L;
        this.letterSpacing = j2;
    }

    /* renamed from: lineBreak-CZqVlQI, reason: not valid java name */
    public final void m3178lineBreakCZqVlQI(int i2) {
        this.primitivesSet |= 562949953421312L;
        this.lineBreak = i2;
    }

    /* renamed from: lineHeight--R2X_6o, reason: not valid java name */
    public final void m3179lineHeightR2X_6o(long j2) {
        this.primitivesSet |= 140737488355328L;
        this.lineHeight = j2;
    }

    public final void maxHeight(float f2) {
        this.primitivesSet |= 1048576;
        this.maxHeight = f2;
    }

    public final void maxWidth(float f2) {
        this.primitivesSet |= 524288;
        this.maxWidth = f2;
    }

    public final void minHeight(float f2) {
        this.primitivesSet |= 262144;
        this.minHeight = f2;
    }

    public final void minWidth(float f2) {
        this.primitivesSet |= 131072;
        this.minWidth = f2;
    }

    public final void right(float f2) {
        this.primitivesSet |= 32768;
        this.right = f2;
    }

    public final void rotationX(float f2) {
        this.primitivesSet |= 67108864;
        this.rotationX = f2;
    }

    public final void rotationY(float f2) {
        this.primitivesSet |= 134217728;
        this.rotationY = f2;
    }

    public final void rotationZ(float f2) {
        this.primitivesSet |= 268435456;
        this.rotationZ = f2;
    }

    public final void scaleX(float f2) {
        this.primitivesSet |= 4194304;
        this.scaleX = f2;
    }

    public final void scaleY(float f2) {
        this.primitivesSet |= 8388608;
        this.scaleY = f2;
    }

    /* renamed from: setBackgroundColor-8_81llA$foundation, reason: not valid java name */
    public final void m3180setBackgroundColor8_81llA$foundation(long j2) {
        this.backgroundColor = j2;
    }

    /* renamed from: setBaselineShift-4Dl_Bck$foundation, reason: not valid java name */
    public final void m3181setBaselineShift4Dl_Bck$foundation(float f2) {
        this.baselineShift = f2;
    }

    /* renamed from: setBorderColor-8_81llA$foundation, reason: not valid java name */
    public final void m3182setBorderColor8_81llA$foundation(long j2) {
        this.borderColor = j2;
    }

    public final void setContentBrush$foundation(Brush brush) {
        this.contentBrush = brush;
    }

    /* renamed from: setContentColor-8_81llA$foundation, reason: not valid java name */
    public final void m3183setContentColor8_81llA$foundation(long j2) {
        this.contentColor = j2;
    }

    /* renamed from: setFontSize--R2X_6o$foundation, reason: not valid java name */
    public final void m3184setFontSizeR2X_6o$foundation(long j2) {
        this.fontSize = j2;
    }

    /* renamed from: setForegroundColor-8_81llA$foundation, reason: not valid java name */
    public final void m3185setForegroundColor8_81llA$foundation(long j2) {
        this.foregroundColor = j2;
    }

    /* renamed from: setLetterSpacing--R2X_6o$foundation, reason: not valid java name */
    public final void m3186setLetterSpacingR2X_6o$foundation(long j2) {
        this.letterSpacing = j2;
    }

    /* renamed from: setLineBreak-CZqVlQI$foundation, reason: not valid java name */
    public final void m3187setLineBreakCZqVlQI$foundation(int i2) {
        this.lineBreak = i2;
    }

    /* renamed from: setLineHeight--R2X_6o$foundation, reason: not valid java name */
    public final void m3188setLineHeightR2X_6o$foundation(long j2) {
        this.lineHeight = j2;
    }

    public final void shape(Shape shape) {
        this.objectsSet |= 8;
        this.shape = shape;
    }

    /* renamed from: textAlign-aXe7zB0, reason: not valid java name */
    public final void m3189textAlignaXe7zB0(int i2) {
        this.primitivesSet |= 2199023255552L;
        this.textEnums = ((i2 << 2) & 28) | (this.textEnums & (-29));
    }

    public final void textDecoration(TextDecoration textDecoration) {
        this.primitivesSet |= 274877906944L;
        this.textEnums = (((textDecoration.getMask() | 4) << 14) & StylePropertiesKt.TextDecorationMask) | (this.textEnums & (-114689));
    }

    /* renamed from: textDirection-Hejc4pk, reason: not valid java name */
    public final void m3190textDirectionHejc4pk(int i2) {
        this.primitivesSet |= 4398046511104L;
        this.textEnums = ((i2 << 4) & 112) | (this.textEnums & (-113));
    }

    public final void textIndent(TextIndent textIndent) {
        this.objectsSet |= 1024;
        this.textIndent = textIndent;
    }

    public final void textMotion(TextMotion textMotion) {
        this.objectsSet |= 512;
        this.textMotion = textMotion;
    }

    public final void top(float f2) {
        this.primitivesSet |= 16384;
        this.top = f2;
    }

    public final void transformOriginX(float f2) {
        this.primitivesSet |= 536870912;
        this.transformOriginX = f2;
    }

    public final void transformOriginY(float f2) {
        this.primitivesSet |= 1073741824;
        this.transformOriginY = f2;
    }

    public final void translation(float f2, float f3) {
        translationX(f2);
        translationY(f3);
    }

    /* renamed from: translation-k-4lQ0M, reason: not valid java name */
    public final void m3191translationk4lQ0M(long j2) {
        translationX(Float.intBitsToFloat((int) (j2 >> 32)));
        translationY(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
    }

    public final void translationX(float f2) {
        this.primitivesSet |= 16777216;
        this.translationX = f2;
    }

    public final void translationY(float f2) {
        this.primitivesSet |= 33554432;
        this.translationY = f2;
    }

    public final List<ValueElement> valueElements() {
        ArrayList arrayList = new ArrayList();
        long j2 = this.primitivesSet;
        long j3 = 1 & j2;
        int i2 = this.objectsSet;
        if (j3 != 0) {
            valueElements$lambda$0$add(arrayList, "contentPaddingStart", Float.valueOf(this.contentPaddingStart));
        }
        if ((2 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "contentPaddingEnd", Float.valueOf(this.contentPaddingEnd));
        }
        if ((4 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "contentPaddingTop", Float.valueOf(this.contentPaddingTop));
        }
        if ((8 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "contentPaddingBottom", Float.valueOf(this.contentPaddingBottom));
        }
        if ((16 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "externalPaddingStart", Float.valueOf(this.externalPaddingStart));
        }
        if ((32 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "externalPaddingEnd", Float.valueOf(this.externalPaddingEnd));
        }
        if ((64 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "externalPaddingTop", Float.valueOf(this.externalPaddingTop));
        }
        if ((128 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "externalPaddingBottom", Float.valueOf(this.externalPaddingBottom));
        }
        if ((256 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "borderWidth", Float.valueOf(this.borderWidth));
        }
        if ((512 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "width", Float.valueOf(this.width));
        }
        if ((1024 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "height", Float.valueOf(this.height));
        }
        if ((Frame.USAGE_COMPOSER_OVERLAY & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "widthFraction", Float.valueOf(this.widthFraction));
        }
        if ((4096 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "heightFraction", Float.valueOf(this.heightFraction));
        }
        if ((2097152 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "alpha", Float.valueOf(this.alpha));
        }
        if ((4194304 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "scaleX", Float.valueOf(this.scaleX));
        }
        if ((8388608 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "scaleY", Float.valueOf(this.scaleY));
        }
        if ((16777216 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "translationX", Float.valueOf(this.translationX));
        }
        if ((33554432 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "translationY", Float.valueOf(this.translationY));
        }
        if ((67108864 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "rotationX", Float.valueOf(this.rotationX));
        }
        if ((134217728 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "rotationY", Float.valueOf(this.rotationY));
        }
        if ((268435456 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "rotationZ", Float.valueOf(this.rotationZ));
        }
        if ((536870912 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "transformOriginX", Float.valueOf(this.transformOriginX));
        }
        if ((1073741824 & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "transformOriginY", Float.valueOf(this.transformOriginY));
        }
        if ((4294967296L & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "zIndex", Float.valueOf(this.zIndex));
        }
        if ((i2 & 16) != 0) {
            valueElements$lambda$0$add(arrayList, "colorFilter", this.colorFilter);
        }
        if ((8589934592L & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "cameraDistance", Float.valueOf(this.cameraDistance));
        }
        if ((34359738368L & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "borderColor", Color.m8218boximpl(this.borderColor));
        }
        if ((i2 & 1) != 0) {
            valueElements$lambda$0$add(arrayList, "borderBrush", this.borderBrush);
        }
        if ((17179869184L & j2) != 0) {
            valueElements$lambda$0$add(arrayList, TtmlNode.ATTR_TTS_BACKGROUND_COLOR, Color.m8218boximpl(this.backgroundColor));
        }
        if ((i2 & 2) != 0) {
            valueElements$lambda$0$add(arrayList, "backgroundBrush", this.backgroundBrush);
        }
        if ((i2 & 4) != 0) {
            valueElements$lambda$0$add(arrayList, "foregroundBrush", this.foregroundBrush);
        }
        if ((2147483648L & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "clip", Boolean.valueOf(this.clip));
        }
        if ((i2 & 8) != 0) {
            valueElements$lambda$0$add(arrayList, "shape", this.shape);
        }
        if ((137438953472L & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "contentColor", Color.m8218boximpl(this.contentColor));
        }
        if ((i2 & 128) != 0) {
            valueElements$lambda$0$add(arrayList, "contentBrush", this.contentBrush);
        }
        if ((i2 & 256) != 0) {
            valueElements$lambda$0$add(arrayList, TtmlNode.ATTR_TTS_FONT_FAMILY, this.fontFamily);
        }
        if ((i2 & 512) != 0) {
            valueElements$lambda$0$add(arrayList, "textMotion", this.textMotion);
        }
        if ((i2 & 1024) != 0) {
            valueElements$lambda$0$add(arrayList, "textIndent", this.textIndent);
        }
        if ((70368744177664L & j2) != 0) {
            valueElements$lambda$0$add(arrayList, TtmlNode.ATTR_TTS_FONT_SIZE, TextUnit.m11352boximpl(this.fontSize));
        }
        if ((140737488355328L & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "lineHeight", TextUnit.m11352boximpl(this.lineHeight));
        }
        if ((281474976710656L & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "letterSpacing", TextUnit.m11352boximpl(this.letterSpacing));
        }
        if ((8796093022208L & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "baselineShift", BaselineShift.m10873boximpl(this.baselineShift));
        }
        if ((562949953421312L & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "lineBreak", LineBreak.m10909boximpl(this.lineBreak));
        }
        if ((2199023255552L & j2) != 0) {
            valueElements$lambda$0$add(arrayList, TtmlNode.ATTR_TTS_TEXT_ALIGN, TextAlign.m11004boximpl(m3174getTextAligne0LSkKk$foundation()));
        }
        if ((4398046511104L & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "textDirection", TextDirection.m11021boximpl(m3175getTextDirections_7Xco$foundation()));
        }
        if ((17592186044416L & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "hyphens", Hyphens.m10896boximpl(m3170getHyphensvmbZdU8$foundation()));
        }
        if ((1099511627776L & j2) != 0) {
            valueElements$lambda$0$add(arrayList, TtmlNode.ATTR_TTS_FONT_STYLE, FontStyle.m10658boximpl(m3167getFontStyle_LCdwA$foundation()));
        }
        if ((549755813888L & j2) != 0) {
            valueElements$lambda$0$add(arrayList, TtmlNode.ATTR_TTS_FONT_WEIGHT, getFontWeight$foundation());
        }
        if ((35184372088832L & j2) != 0) {
            valueElements$lambda$0$add(arrayList, "fontSynthesis", FontSynthesis.m10669boximpl(m3168getFontSynthesisGVVA2EU$foundation()));
        }
        if ((j2 & 274877906944L) != 0) {
            valueElements$lambda$0$add(arrayList, TtmlNode.ATTR_TTS_TEXT_DECORATION, getTextDecoration$foundation());
        }
        return arrayList;
    }

    public final void width(float f2) {
        this.primitivesSet = (this.primitivesSet | 512) & (-2049);
        this.width = f2;
        this.widthFraction = Float.NaN;
    }

    public final void widthFraction(float f2) {
        this.primitivesSet = (this.primitivesSet & (-513)) | Frame.USAGE_COMPOSER_OVERLAY;
        this.widthFraction = f2;
        this.width = Float.NaN;
    }

    public final void zIndex(float f2) {
        this.primitivesSet |= 4294967296L;
        this.zIndex = f2;
    }

    public final boolean hasId(int i2) {
        return (this.objectsSet & (1 << (i2 + (-50)))) != 0;
    }

    public final void copyInto$foundation(StyleProperties styleProperties) {
        styleProperties.primitivesSet = this.primitivesSet;
        styleProperties.objectsSet = this.objectsSet;
        styleProperties.left = this.left;
        styleProperties.top = this.top;
        styleProperties.right = this.right;
        styleProperties.bottom = this.bottom;
        styleProperties.minHeight = this.minHeight;
        styleProperties.maxHeight = this.maxHeight;
        styleProperties.minWidth = this.minWidth;
        styleProperties.maxWidth = this.maxWidth;
        styleProperties.contentPaddingStart = this.contentPaddingStart;
        styleProperties.contentPaddingEnd = this.contentPaddingEnd;
        styleProperties.contentPaddingTop = this.contentPaddingTop;
        styleProperties.contentPaddingBottom = this.contentPaddingBottom;
        styleProperties.externalPaddingStart = this.externalPaddingStart;
        styleProperties.externalPaddingEnd = this.externalPaddingEnd;
        styleProperties.externalPaddingTop = this.externalPaddingTop;
        styleProperties.externalPaddingBottom = this.externalPaddingBottom;
        styleProperties.borderWidth = this.borderWidth;
        styleProperties.shape = this.shape;
        styleProperties.alpha = this.alpha;
        styleProperties.scaleX = this.scaleX;
        styleProperties.scaleY = this.scaleY;
        styleProperties.translationX = this.translationX;
        styleProperties.translationY = this.translationY;
        styleProperties.rotationX = this.rotationX;
        styleProperties.rotationY = this.rotationY;
        styleProperties.rotationZ = this.rotationZ;
        styleProperties.transformOriginX = this.transformOriginX;
        styleProperties.transformOriginY = this.transformOriginY;
        styleProperties.zIndex = this.zIndex;
        styleProperties.colorFilter = this.colorFilter;
        styleProperties.cameraDistance = this.cameraDistance;
        styleProperties.borderColor = this.borderColor;
        styleProperties.borderBrush = this.borderBrush;
        styleProperties.backgroundColor = this.backgroundColor;
        styleProperties.backgroundBrush = this.backgroundBrush;
        styleProperties.foregroundColor = this.foregroundColor;
        styleProperties.foregroundBrush = this.foregroundBrush;
        styleProperties.dropShadow = this.dropShadow;
        styleProperties.innerShadow = this.innerShadow;
        styleProperties.clip = this.clip;
        styleProperties.width = this.width;
        styleProperties.height = this.height;
        styleProperties.widthFraction = this.widthFraction;
        styleProperties.heightFraction = this.heightFraction;
        styleProperties.contentColor = this.contentColor;
        styleProperties.contentBrush = this.contentBrush;
        styleProperties.fontFamily = this.fontFamily;
        styleProperties.textMotion = this.textMotion;
        styleProperties.textIndent = this.textIndent;
        styleProperties.fontSize = this.fontSize;
        styleProperties.lineHeight = this.lineHeight;
        styleProperties.letterSpacing = this.letterSpacing;
        styleProperties.baselineShift = this.baselineShift;
        styleProperties.lineBreak = this.lineBreak;
        styleProperties.textEnums = this.textEnums;
    }
}
