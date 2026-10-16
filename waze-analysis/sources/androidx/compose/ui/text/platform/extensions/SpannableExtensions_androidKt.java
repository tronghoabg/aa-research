package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.Bullet;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.CustomBulletSpan;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.q;
import h.g.a.r;
import h.g.b.o;
import h.g.b.x;
import h.h.a;
import h.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SpannableExtensions_androidKt {
    /* renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m10856createLetterSpacingSpaneAf_CNQ(long j2, Density density) {
        long jM11361getTypeUIouoOA = TextUnit.m11361getTypeUIouoOA(j2);
        if (TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11395getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo2126toPxR2X_6o(j2));
        }
        if (TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11394getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m11362getValueimpl(j2));
        }
        return null;
    }

    public static final void flattenFontStylesAndApply(SpanStyle spanStyle, List<AnnotatedString.Range<SpanStyle>> list, q<? super SpanStyle, ? super Integer, ? super Integer, ab> qVar) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            qVar.invoke(merge(spanStyle, list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
            return;
        }
        int size = list.size();
        int i2 = size + size;
        int[] iArr = new int[i2];
        List<AnnotatedString.Range<SpanStyle>> list2 = list;
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i3);
            iArr[i3] = range.getStart();
            iArr[i3 + size] = range.getEnd();
        }
        x.f(iArr, "<this>");
        if (i2 > 1) {
            Arrays.sort(iArr);
        }
        x.f(iArr, "<this>");
        if (i2 == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        int i4 = iArr[0];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = iArr[i5];
            if (i6 != i4) {
                int size3 = list2.size();
                SpanStyle spanStyleMerge = spanStyle;
                for (int i7 = 0; i7 < size3; i7++) {
                    AnnotatedString.Range<SpanStyle> range2 = list.get(i7);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(i4, i6, range2.getStart(), range2.getEnd())) {
                        spanStyleMerge = merge(spanStyleMerge, range2.getItem());
                    }
                }
                if (spanStyleMerge != null) {
                    qVar.invoke(spanStyleMerge, Integer.valueOf(i4), Integer.valueOf(i6));
                }
                i4 = i6;
            }
        }
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle spanStyle) {
        return TextUnitType.m11390equalsimpl0(TextUnit.m11361getTypeUIouoOA(spanStyle.m10491getLetterSpacingXSAIIZE()), TextUnitType.Companion.m11395getSpUIouoOA()) || TextUnitType.m11390equalsimpl0(TextUnit.m11361getTypeUIouoOA(spanStyle.m10491getLetterSpacingXSAIIZE()), TextUnitType.Companion.m11394getEmUIouoOA());
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m10579getFontSynthesisZQGJjVo() != null;
    }

    private static final boolean isNonLinearFontScalingActive(Density density) {
        return ((double) density.getFontScale()) > 1.05d;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    /* renamed from: resolveBulletTextUnitToPx-o2QH7mI, reason: not valid java name */
    private static final float m10857resolveBulletTextUnitToPxo2QH7mI(long j2, float f2, Density density) {
        if (TextUnit.m11359equalsimpl0(j2, TextUnit.Companion.m11373getUnspecifiedXSAIIZE())) {
            return f2;
        }
        long jM11361getTypeUIouoOA = TextUnit.m11361getTypeUIouoOA(j2);
        if (TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11395getSpUIouoOA())) {
            return density.mo2126toPxR2X_6o(j2);
        }
        if (TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11394getEmUIouoOA())) {
            return TextUnit.m11362getValueimpl(j2) * f2;
        }
        return Float.NaN;
    }

    /* renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m10858resolveLineHeightInPxo2QH7mI(long j2, float f2, Density density) {
        float fM11362getValueimpl;
        long jM11361getTypeUIouoOA = TextUnit.m11361getTypeUIouoOA(j2);
        if (TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11395getSpUIouoOA())) {
            if (!isNonLinearFontScalingActive(density)) {
                return density.mo2126toPxR2X_6o(j2);
            }
            fM11362getValueimpl = TextUnit.m11362getValueimpl(j2) / TextUnit.m11362getValueimpl(density.mo2130toSpkPz2Gy4(f2));
        } else {
            if (!TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11394getEmUIouoOA())) {
                return Float.NaN;
            }
            fM11362getValueimpl = TextUnit.m11362getValueimpl(j2);
        }
        return fM11362getValueimpl * f2;
    }

    /* renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m10859setBackgroundRPmYEkk(Spannable spannable, long j2, int i2, int i3) {
        if (j2 != 16) {
            setSpan(spannable, new BackgroundColorSpan(ColorKt.m8282toArgb8_81llA(j2)), i2, i3);
        }
    }

    /* renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m10860setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i2, int i3) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m10879unboximpl()), i2, i3);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, float f2, int i2, int i3) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m10861setColorRPmYEkk(spannable, ((SolidColor) brush).m8614getValue0d7_KjU(), i2, i3);
            } else {
                if (!(brush instanceof ShaderBrush)) {
                    throw new i();
                }
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f2), i2, i3);
            }
        }
    }

    public static final void setBulletSpans(Spannable spannable, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, float f2, Density density, TextIndent textIndent) {
        Density density2 = density;
        float fM11362getValueimpl = 0.0f;
        if (textIndent != null) {
            long jM11361getTypeUIouoOA = TextUnit.m11361getTypeUIouoOA(textIndent.m11041getFirstLineXSAIIZE());
            if (TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11395getSpUIouoOA())) {
                fM11362getValueimpl = density2.mo2126toPxR2X_6o(textIndent.m11041getFirstLineXSAIIZE());
            } else if (TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11394getEmUIouoOA())) {
                fM11362getValueimpl = TextUnit.m11362getValueimpl(textIndent.m11041getFirstLineXSAIIZE()) * f2;
            }
        }
        float f3 = fM11362getValueimpl;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i2);
            AnnotatedString.Annotation item = range.getItem();
            Bullet bullet = item instanceof Bullet ? (Bullet) item : null;
            if (bullet != null) {
                float fM10857resolveBulletTextUnitToPxo2QH7mI = m10857resolveBulletTextUnitToPxo2QH7mI(bullet.m10389getWidthXSAIIZE(), f2, density2);
                float fM10857resolveBulletTextUnitToPxo2QH7mI2 = m10857resolveBulletTextUnitToPxo2QH7mI(bullet.m10387getHeightXSAIIZE(), f2, density2);
                float fM10857resolveBulletTextUnitToPxo2QH7mI3 = m10857resolveBulletTextUnitToPxo2QH7mI(bullet.m10388getPaddingXSAIIZE(), f2, density2);
                if (!Float.isNaN(fM10857resolveBulletTextUnitToPxo2QH7mI) && !Float.isNaN(fM10857resolveBulletTextUnitToPxo2QH7mI2) && !Float.isNaN(fM10857resolveBulletTextUnitToPxo2QH7mI3)) {
                    setSpan(spannable, new CustomBulletSpan(bullet.getShape(), fM10857resolveBulletTextUnitToPxo2QH7mI, fM10857resolveBulletTextUnitToPxo2QH7mI2, fM10857resolveBulletTextUnitToPxo2QH7mI3, bullet.getBrush(), bullet.getAlpha(), bullet.getDrawStyle(), density2, f3), range.getStart(), range.getEnd());
                }
            }
            i2++;
            density2 = density;
        }
    }

    /* renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m10861setColorRPmYEkk(Spannable spannable, long j2, int i2, int i3) {
        if (j2 != 16) {
            setSpan(spannable, new ForegroundColorSpan(ColorKt.m8282toArgb8_81llA(j2)), i2, i3);
        }
    }

    private static final void setDrawStyle(Spannable spannable, DrawStyle drawStyle, int i2, int i3) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i2, i3);
        }
    }

    private static final void setFontAttributes(final Spannable spannable, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, final r<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> rVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i2);
            if ((range.getItem() instanceof SpanStyle) && (TextPaintExtensions_androidKt.hasFontAttributes((SpanStyle) range.getItem()) || ((SpanStyle) range.getItem()).m10490getFontSynthesisZQGJjVo() != null)) {
                x.d(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = arrayList;
        flattenFontStylesAndApply(hasFontAttributes(textStyle) ? new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m10578getFontStyle4Lr2A7w(), textStyle.m10579getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65475, (o) null) : null, arrayList2, new q() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt$$ExternalSyntheticLambda0
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SpannableExtensions_androidKt.setFontAttributes$lambda$2(spannable, rVar, (SpanStyle) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    static final ab setFontAttributes$lambda$2(Spannable spannable, r rVar, SpanStyle spanStyle, int i2, int i3) {
        FontFamily fontFamily = spanStyle.getFontFamily();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontStyle fontStyleM10489getFontStyle4Lr2A7w = spanStyle.m10489getFontStyle4Lr2A7w();
        FontStyle fontStyleM10658boximpl = FontStyle.m10658boximpl(fontStyleM10489getFontStyle4Lr2A7w != null ? fontStyleM10489getFontStyle4Lr2A7w.m10664unboximpl() : FontStyle.Companion.m10668getNormal_LCdwA());
        FontSynthesis fontSynthesisM10490getFontSynthesisZQGJjVo = spanStyle.m10490getFontSynthesisZQGJjVo();
        spannable.setSpan(new TypefaceSpan((Typeface) rVar.invoke(fontFamily, fontWeight, fontStyleM10658boximpl, FontSynthesis.m10669boximpl(fontSynthesisM10490getFontSynthesisZQGJjVo != null ? fontSynthesisM10490getFontSynthesisZQGJjVo.m10677unboximpl() : FontSynthesis.Companion.m10678getAllGVVA2EU()))), i2, i3, 33);
        return ab.f48028a;
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i2, int i3) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i2, i3);
        }
    }

    /* renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m10862setFontSizeKmRG4DE(Spannable spannable, long j2, Density density, int i2, int i3) {
        long jM11361getTypeUIouoOA = TextUnit.m11361getTypeUIouoOA(j2);
        if (TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11395getSpUIouoOA())) {
            setSpan(spannable, new AbsoluteSizeSpan(a.b(density.mo2126toPxR2X_6o(j2)), false), i2, i3);
        } else if (TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11394getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(TextUnit.m11362getValueimpl(j2)), i2, i3);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i2, int i3) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i2, i3);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i2, i3);
        }
    }

    /* renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m10863setLineHeightKmRG4DE(Spannable spannable, long j2, float f2, Density density, LineHeightStyle lineHeightStyle) {
        float fM10858resolveLineHeightInPxo2QH7mI = m10858resolveLineHeightInPxo2QH7mI(j2, f2, density);
        if (Float.isNaN(fM10858resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        Spannable spannable2 = spannable;
        setSpan(spannable, new LineHeightStyleSpan(fM10858resolveLineHeightInPxo2QH7mI, 0, (spannable2.length() == 0 || h.n.o.I(spannable2) == '\n') ? spannable.length() + 1 : spannable.length(), LineHeightStyle.Trim.m10996isTrimFirstLineTopimpl$ui_text(lineHeightStyle.m10969getTrimEVpEnUU()), LineHeightStyle.Trim.m10997isTrimLastLineBottomimpl$ui_text(lineHeightStyle.m10969getTrimEVpEnUU()), lineHeightStyle.m10967getAlignmentPIaL0Z0(), lineHeightStyle.m10968getModelzQqcRY(), null), 0, spannable.length());
    }

    /* renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m10864setLineHeightr9BaKPg(Spannable spannable, long j2, float f2, Density density) {
        float fM10858resolveLineHeightInPxo2QH7mI = m10858resolveLineHeightInPxo2QH7mI(j2, f2, density);
        if (Float.isNaN(fM10858resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightSpan(fM10858resolveLineHeightInPxo2QH7mI), 0, spannable.length());
    }

    public static final void setLocaleList(Spannable spannable, LocaleList localeList, int i2, int i3) {
        if (localeList != null) {
            setSpan(spannable, LocaleListHelperMethods.INSTANCE.localeSpan(localeList), i2, i3);
        }
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i2, int i3) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m8282toArgb8_81llA(shadow.m8602getColor0d7_KjU()), Float.intBitsToFloat((int) (shadow.m8603getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (shadow.m8603getOffsetF1C5BW0() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i2, i3);
        }
    }

    public static final void setSpan(Spannable spannable, Object obj, int i2, int i3) {
        spannable.setSpan(obj, i2, i3, 33);
    }

    private static final void setSpanStyle(Spannable spannable, SpanStyle spanStyle, int i2, int i3, Density density) {
        m10860setBaselineShift0ocSgnM(spannable, spanStyle.m10486getBaselineShift5SSeXJ0(), i2, i3);
        m10861setColorRPmYEkk(spannable, spanStyle.m10487getColor0d7_KjU(), i2, i3);
        setBrush(spannable, spanStyle.getBrush(), spanStyle.getAlpha(), i2, i3);
        setTextDecoration(spannable, spanStyle.getTextDecoration(), i2, i3);
        m10862setFontSizeKmRG4DE(spannable, spanStyle.m10488getFontSizeXSAIIZE(), density, i2, i3);
        setFontFeatureSettings(spannable, spanStyle.getFontFeatureSettings(), i2, i3);
        setGeometricTransform(spannable, spanStyle.getTextGeometricTransform(), i2, i3);
        setLocaleList(spannable, spanStyle.getLocaleList(), i2, i3);
        m10859setBackgroundRPmYEkk(spannable, spanStyle.m10485getBackground0d7_KjU(), i2, i3);
        setShadow(spannable, spanStyle.getShadow(), i2, i3);
        setDrawStyle(spannable, spanStyle.getDrawStyle(), i2, i3);
    }

    public static final void setSpanStyles(Spannable spannable, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, Density density, r<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> rVar) {
        MetricAffectingSpan metricAffectingSpanM10856createLetterSpacingSpaneAf_CNQ;
        setFontAttributes(spannable, textStyle, list, rVar);
        List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i2);
            if (range.getItem() instanceof SpanStyle) {
                int start = range.getStart();
                int end = range.getEnd();
                if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                    setSpanStyle(spannable, (SpanStyle) range.getItem(), start, end, density);
                    if (getNeedsLetterSpacingSpan((SpanStyle) range.getItem())) {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range2 = list.get(i3);
                AnnotatedString.Annotation item = range2.getItem();
                if (item instanceof SpanStyle) {
                    int start2 = range2.getStart();
                    int end2 = range2.getEnd();
                    if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (metricAffectingSpanM10856createLetterSpacingSpaneAf_CNQ = m10856createLetterSpacingSpaneAf_CNQ(((SpanStyle) item).m10491getLetterSpacingXSAIIZE(), density)) != null) {
                        setSpan(spannable, metricAffectingSpanM10856createLetterSpacingSpaneAf_CNQ, start2, end2);
                    }
                }
            }
        }
    }

    public static final void setTextDecoration(Spannable spannable, TextDecoration textDecoration, int i2, int i3) {
        if (textDecoration != null) {
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(TextDecoration.Companion.getUnderline()), textDecoration.contains(TextDecoration.Companion.getLineThrough())), i2, i3);
        }
    }

    public static final void setTextIndent(Spannable spannable, TextIndent textIndent, float f2, Density density) {
        if (textIndent != null) {
            if ((TextUnit.m11359equalsimpl0(textIndent.m11041getFirstLineXSAIIZE(), TextUnitKt.getSp(0)) && TextUnit.m11359equalsimpl0(textIndent.m11042getRestLineXSAIIZE(), TextUnitKt.getSp(0))) || TextUnit.m11360getRawTypeimpl(textIndent.m11041getFirstLineXSAIIZE()) == 0 || TextUnit.m11360getRawTypeimpl(textIndent.m11042getRestLineXSAIIZE()) == 0) {
                return;
            }
            long jM11361getTypeUIouoOA = TextUnit.m11361getTypeUIouoOA(textIndent.m11041getFirstLineXSAIIZE());
            float fM11362getValueimpl = 0.0f;
            float fMo2126toPxR2X_6o = TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11395getSpUIouoOA()) ? density.mo2126toPxR2X_6o(textIndent.m11041getFirstLineXSAIIZE()) : TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11394getEmUIouoOA()) ? TextUnit.m11362getValueimpl(textIndent.m11041getFirstLineXSAIIZE()) * f2 : 0.0f;
            long jM11361getTypeUIouoOA2 = TextUnit.m11361getTypeUIouoOA(textIndent.m11042getRestLineXSAIIZE());
            if (TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA2, TextUnitType.Companion.m11395getSpUIouoOA())) {
                fM11362getValueimpl = density.mo2126toPxR2X_6o(textIndent.m11042getRestLineXSAIIZE());
            } else if (TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA2, TextUnitType.Companion.m11394getEmUIouoOA())) {
                fM11362getValueimpl = TextUnit.m11362getValueimpl(textIndent.m11042getRestLineXSAIIZE()) * f2;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fMo2126toPxR2X_6o), (int) Math.ceil(fM11362getValueimpl)), 0, spannable.length());
        }
    }
}
