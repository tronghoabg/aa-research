package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.media3.muxer.MuxerUtil;
import h.a.i;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SaversKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1679a = 0;
    private static final Saver<AnnotatedString, Object> AnnotatedStringSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            AnnotatedString annotatedString = (AnnotatedString) obj2;
            return i.f(annotatedString.getText(), SaversKt.save(annotatedString.getAnnotations$ui_text(), SaversKt.AnnotationRangeListSaver, (SaverScope) obj));
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda11
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.AnnotatedStringSaver$lambda$1(obj);
        }
    });
    private static final Saver<List<AnnotatedString.Range<? extends Object>>, Object> AnnotationRangeListSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda22
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return SaversKt.AnnotationRangeListSaver$lambda$0((SaverScope) obj, (List) obj2);
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda33
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.AnnotationRangeListSaver$lambda$1(obj);
        }
    });
    private static final Saver<AnnotatedString.Range<? extends Object>, Object> AnnotationRangeSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda44
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return SaversKt.AnnotationRangeSaver$lambda$0((SaverScope) obj, (AnnotatedString.Range) obj2);
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda55
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.AnnotationRangeSaver$lambda$1(obj);
        }
    });
    private static final Saver<VerbatimTtsAnnotation, Object> VerbatimTtsAnnotationSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda58
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ((VerbatimTtsAnnotation) obj2).getVerbatim();
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda59
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.VerbatimTtsAnnotationSaver$lambda$1(obj);
        }
    });
    private static final Saver<UrlAnnotation, Object> UrlAnnotationSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda60
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ((UrlAnnotation) obj2).getUrl();
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda61
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.UrlAnnotationSaver$lambda$1(obj);
        }
    });
    private static final Saver<LinkAnnotation.Url, Object> LinkSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda1
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            LinkAnnotation.Url url = (LinkAnnotation.Url) obj2;
            return i.f(url.getUrl(), SaversKt.save(url.getStyles(), SaversKt.TextLinkStylesSaver, (SaverScope) obj));
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.LinkSaver$lambda$1(obj);
        }
    });
    private static final Saver<LinkAnnotation.Clickable, Object> ClickableSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda3
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            LinkAnnotation.Clickable clickable = (LinkAnnotation.Clickable) obj2;
            return i.f(clickable.getTag(), SaversKt.save(clickable.getStyles(), SaversKt.TextLinkStylesSaver, (SaverScope) obj));
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda4
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.ClickableSaver$lambda$1(obj);
        }
    });
    private static final Saver<ParagraphStyle, Object> ParagraphStyleSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda5
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            SaverScope saverScope = (SaverScope) obj;
            ParagraphStyle paragraphStyle = (ParagraphStyle) obj2;
            return i.f(SaversKt.save(TextAlign.m11004boximpl(paragraphStyle.m10451getTextAligne0LSkKk()), SaversKt.getSaver(TextAlign.Companion), saverScope), SaversKt.save(TextDirection.m11021boximpl(paragraphStyle.m10453getTextDirections_7Xco()), SaversKt.getSaver(TextDirection.Companion), saverScope), SaversKt.save(TextUnit.m11352boximpl(paragraphStyle.m10449getLineHeightXSAIIZE()), SaversKt.getSaver(TextUnit.Companion), saverScope), SaversKt.save(paragraphStyle.getTextIndent(), SaversKt.getSaver(TextIndent.Companion), saverScope), SaversKt.save(paragraphStyle.getPlatformStyle(), Savers_androidKt.getSaver(PlatformParagraphStyle.Companion), saverScope), SaversKt.save(paragraphStyle.getLineHeightStyle(), SaversKt.getSaver(LineHeightStyle.Companion), saverScope), SaversKt.save(LineBreak.m10909boximpl(paragraphStyle.m10448getLineBreakrAG3T2k()), Savers_androidKt.getSaver(LineBreak.Companion), saverScope), SaversKt.save(Hyphens.m10896boximpl(paragraphStyle.m10446getHyphensvmbZdU8()), SaversKt.getSaver(Hyphens.Companion), saverScope), SaversKt.save(paragraphStyle.getTextMotion(), Savers_androidKt.getSaver(TextMotion.Companion), saverScope));
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda6
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.ParagraphStyleSaver$lambda$1(obj);
        }
    });
    private static final Saver<SpanStyle, Object> SpanStyleSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda7
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            SaverScope saverScope = (SaverScope) obj;
            SpanStyle spanStyle = (SpanStyle) obj2;
            return i.f(SaversKt.save(Color.m8218boximpl(spanStyle.m10487getColor0d7_KjU()), SaversKt.getSaver(Color.Companion), saverScope), SaversKt.save(TextUnit.m11352boximpl(spanStyle.m10488getFontSizeXSAIIZE()), SaversKt.getSaver(TextUnit.Companion), saverScope), SaversKt.save(spanStyle.getFontWeight(), SaversKt.getSaver(FontWeight.Companion), saverScope), SaversKt.save(spanStyle.m10489getFontStyle4Lr2A7w(), SaversKt.getSaver(FontStyle.Companion), saverScope), SaversKt.save(spanStyle.m10490getFontSynthesisZQGJjVo(), SaversKt.getSaver(FontSynthesis.Companion), saverScope), -1, spanStyle.getFontFeatureSettings(), SaversKt.save(TextUnit.m11352boximpl(spanStyle.m10491getLetterSpacingXSAIIZE()), SaversKt.getSaver(TextUnit.Companion), saverScope), SaversKt.save(spanStyle.m10486getBaselineShift5SSeXJ0(), SaversKt.getSaver(BaselineShift.Companion), saverScope), SaversKt.save(spanStyle.getTextGeometricTransform(), SaversKt.getSaver(TextGeometricTransform.Companion), saverScope), SaversKt.save(spanStyle.getLocaleList(), SaversKt.getSaver(LocaleList.Companion), saverScope), SaversKt.save(Color.m8218boximpl(spanStyle.m10485getBackground0d7_KjU()), SaversKt.getSaver(Color.Companion), saverScope), SaversKt.save(spanStyle.getTextDecoration(), SaversKt.getSaver(TextDecoration.Companion), saverScope), SaversKt.save(spanStyle.getShadow(), SaversKt.getSaver(Shadow.Companion), saverScope));
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda8
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.SpanStyleSaver$lambda$1(obj);
        }
    });
    private static final Saver<TextLinkStyles, Object> TextLinkStylesSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda9
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return SaversKt.TextLinkStylesSaver$lambda$0((SaverScope) obj, (TextLinkStyles) obj2);
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda10
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.TextLinkStylesSaver$lambda$1(obj);
        }
    });
    private static final Saver<TextDecoration, Object> TextDecorationSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda12
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(((TextDecoration) obj2).getMask());
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda13
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.TextDecorationSaver$lambda$1(obj);
        }
    });
    private static final Saver<TextGeometricTransform, Object> TextGeometricTransformSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda14
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            TextGeometricTransform textGeometricTransform = (TextGeometricTransform) obj2;
            return i.f(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda15
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.TextGeometricTransformSaver$lambda$1(obj);
        }
    });
    private static final Saver<TextIndent, Object> TextIndentSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda16
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            SaverScope saverScope = (SaverScope) obj;
            TextIndent textIndent = (TextIndent) obj2;
            return i.f(SaversKt.save(TextUnit.m11352boximpl(textIndent.m11041getFirstLineXSAIIZE()), SaversKt.getSaver(TextUnit.Companion), saverScope), SaversKt.save(TextUnit.m11352boximpl(textIndent.m11042getRestLineXSAIIZE()), SaversKt.getSaver(TextUnit.Companion), saverScope));
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda17
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.TextIndentSaver$lambda$1(obj);
        }
    });
    private static final Saver<FontWeight, Object> FontWeightSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda18
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(((FontWeight) obj2).getWeight());
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda19
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.FontWeightSaver$lambda$1(obj);
        }
    });
    private static final Saver<BaselineShift, Object> BaselineShiftSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda20
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return Float.valueOf(((BaselineShift) obj2).m10879unboximpl());
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda21
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.BaselineShiftSaver$lambda$1(obj);
        }
    });
    private static final Saver<TextRange, Object> TextRangeSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda23
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            TextRange textRange = (TextRange) obj2;
            return i.f(Integer.valueOf(TextRange.m10546getStartimpl(textRange.m10550unboximpl())), Integer.valueOf(TextRange.m10541getEndimpl(textRange.m10550unboximpl())));
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda24
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.TextRangeSaver$lambda$1(obj);
        }
    });
    private static final Saver<Shadow, Object> ShadowSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda25
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            SaverScope saverScope = (SaverScope) obj;
            Shadow shadow = (Shadow) obj2;
            return i.f(SaversKt.save(Color.m8218boximpl(shadow.m8602getColor0d7_KjU()), SaversKt.getSaver(Color.Companion), saverScope), SaversKt.save(Offset.m7969boximpl(shadow.m8603getOffsetF1C5BW0()), SaversKt.getSaver(Offset.Companion), saverScope), Float.valueOf(shadow.getBlurRadius()));
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda26
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.ShadowSaver$lambda$1(obj);
        }
    });
    private static final NonNullValueClassSaver<Color, Object> ColorSaver = NonNullValueClassSaver(new p<SaverScope, Color, Object>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, Color color) {
            return m10475invoke4WTKRHQ(saverScope, color.m8238unboximpl());
        }

        /* renamed from: invoke-4WTKRHQ, reason: not valid java name */
        public final Object m10475invoke4WTKRHQ(SaverScope saverScope, long j2) {
            if (j2 == 16) {
                return false;
            }
            return Integer.valueOf(ColorKt.m8282toArgb8_81llA(j2));
        }
    }, new l<Object, Color>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
        @Override // h.g.a.l
        /* renamed from: invoke-ijrfgN4, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Color invoke(Object obj) {
            if (x.n(obj, false)) {
                return Color.m8218boximpl(Color.Companion.m8264getUnspecified0d7_KjU());
            }
            x.d(obj, "null cannot be cast to non-null type kotlin.Int");
            return Color.m8218boximpl(ColorKt.Color(((Integer) obj).intValue()));
        }
    });
    private static final NonNullValueClassSaver<TextAlign, Object> TextAlignSaver = NonNullValueClassSaver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda27
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(((TextAlign) obj2).m11010unboximpl());
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda28
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.TextAlignSaver$lambda$1(obj);
        }
    });
    private static final NonNullValueClassSaver<TextDirection, Object> TextDirectionSaver = NonNullValueClassSaver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda29
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(((TextDirection) obj2).m11027unboximpl());
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda30
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.TextDirectionSaver$lambda$1(obj);
        }
    });
    private static final NonNullValueClassSaver<Hyphens, Object> HyphensSaver = NonNullValueClassSaver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda31
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(((Hyphens) obj2).m10902unboximpl());
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda32
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.HyphensSaver$lambda$1(obj);
        }
    });
    private static final Saver<FontStyle, Object> FontStyleSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda34
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(((FontStyle) obj2).m10664unboximpl());
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda35
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.FontStyleSaver$lambda$1(obj);
        }
    });
    private static final Saver<FontSynthesis, Object> FontSynthesisSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda36
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(((FontSynthesis) obj2).m10677unboximpl());
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda37
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.FontSynthesisSaver$lambda$1(obj);
        }
    });
    private static final NonNullValueClassSaver<TextUnit, Object> TextUnitSaver = NonNullValueClassSaver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda38
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return SaversKt.TextUnitSaver$lambda$0((SaverScope) obj, (TextUnit) obj2);
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda39
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.TextUnitSaver$lambda$1(obj);
        }
    });
    private static final NonNullValueClassSaver<TextUnitType, Object> TextUnitTypeSaver = NonNullValueClassSaver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda40
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return SaversKt.TextUnitTypeSaver$lambda$0((SaverScope) obj, (TextUnitType) obj2);
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda41
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.TextUnitTypeSaver$lambda$1(obj);
        }
    });
    private static final NonNullValueClassSaver<Offset, Object> OffsetSaver = NonNullValueClassSaver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda42
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return SaversKt.OffsetSaver$lambda$0((SaverScope) obj, (Offset) obj2);
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda43
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.OffsetSaver$lambda$1(obj);
        }
    });
    private static final Saver<LocaleList, Object> LocaleListSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda45
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return SaversKt.LocaleListSaver$lambda$0((SaverScope) obj, (LocaleList) obj2);
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda46
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.LocaleListSaver$lambda$1(obj);
        }
    });
    private static final Saver<Locale, Object> LocaleSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda47
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ((Locale) obj2).toLanguageTag();
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda48
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.LocaleSaver$lambda$1(obj);
        }
    });
    private static final Saver<LineHeightStyle, Object> LineHeightStyleSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda49
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            SaverScope saverScope = (SaverScope) obj;
            LineHeightStyle lineHeightStyle = (LineHeightStyle) obj2;
            return i.f(SaversKt.save(LineHeightStyle.Alignment.m10970boximpl(lineHeightStyle.m10967getAlignmentPIaL0Z0()), SaversKt.getSaver(LineHeightStyle.Alignment.Companion), saverScope), SaversKt.save(LineHeightStyle.Trim.m10991boximpl(lineHeightStyle.m10969getTrimEVpEnUU()), SaversKt.getSaver(LineHeightStyle.Trim.Companion), saverScope), SaversKt.save(LineHeightStyle.Mode.m10981boximpl(lineHeightStyle.m10968getModelzQqcRY()), SaversKt.getSaver(LineHeightStyle.Mode.Companion), saverScope));
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda50
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.LineHeightStyleSaver$lambda$1(obj);
        }
    });
    private static final NonNullValueClassSaver<LineHeightStyle.Alignment, Object> LineHeightStyleAlignmentSaver = NonNullValueClassSaver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda51
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return Float.valueOf(((LineHeightStyle.Alignment) obj2).m10976unboximpl());
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda52
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.LineHeightStyleAlignmentSaver$lambda$1(obj);
        }
    });
    private static final NonNullValueClassSaver<LineHeightStyle.Trim, Object> LineHeightStyleTrimSaver = NonNullValueClassSaver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda53
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(((LineHeightStyle.Trim) obj2).m10999unboximpl());
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda54
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.LineHeightStyleTrimSaver$lambda$1(obj);
        }
    });
    private static final NonNullValueClassSaver<LineHeightStyle.Mode, Object> LineHeightStyleModeSaver = NonNullValueClassSaver(new p() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda56
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(((LineHeightStyle.Mode) obj2).m10987unboximpl());
        }
    }, new l() { // from class: androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda57
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SaversKt.LineHeightStyleModeSaver$lambda$1(obj);
        }
    });

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotationType.values().length];
            try {
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotationType.Span.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnnotationType.Url.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AnnotationType.Link.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AnnotationType.Clickable.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AnnotationType.String.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final AnnotatedString AnnotatedStringSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(1);
        Saver<List<AnnotatedString.Range<? extends Object>>, Object> saver = AnnotationRangeListSaver;
        List<AnnotatedString.Range<? extends Object>> listRestore = ((!x.n(obj2, false) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
        Object obj3 = list.get(0);
        String str = obj3 != null ? (String) obj3 : null;
        if (str == null) {
            x.g();
        }
        return new AnnotatedString(listRestore, str);
    }

    static final Object AnnotationRangeListSaver$lambda$0(SaverScope saverScope, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(save((AnnotatedString.Range) list.get(i2), AnnotationRangeSaver, saverScope));
        }
        return arrayList;
    }

    static final List AnnotationRangeListSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = list.get(i2);
            ArrayList arrayList2 = arrayList;
            Saver<AnnotatedString.Range<? extends Object>, Object> saver = AnnotationRangeSaver;
            AnnotatedString.Range<? extends Object> rangeRestore = null;
            if ((!x.n(obj2, false) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) {
                rangeRestore = saver.restore(obj2);
            }
            if (rangeRestore == null) {
                x.g();
            }
            arrayList2.add(rangeRestore);
        }
        return arrayList;
    }

    static final Object AnnotationRangeSaver$lambda$0(SaverScope saverScope, AnnotatedString.Range range) {
        AnnotationType annotationType;
        Object objSave;
        Object item = range.getItem();
        if (item instanceof ParagraphStyle) {
            annotationType = AnnotationType.Paragraph;
        } else if (item instanceof SpanStyle) {
            annotationType = AnnotationType.Span;
        } else if (item instanceof VerbatimTtsAnnotation) {
            annotationType = AnnotationType.VerbatimTts;
        } else if (item instanceof UrlAnnotation) {
            annotationType = AnnotationType.Url;
        } else if (item instanceof LinkAnnotation.Url) {
            annotationType = AnnotationType.Link;
        } else if (item instanceof LinkAnnotation.Clickable) {
            annotationType = AnnotationType.Clickable;
        } else {
            if (!(item instanceof StringAnnotation)) {
                throw new UnsupportedOperationException();
            }
            annotationType = AnnotationType.String;
        }
        switch (annotationType.ordinal()) {
            case 0:
                Object item2 = range.getItem();
                x.d(item2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                objSave = save((ParagraphStyle) item2, ParagraphStyleSaver, saverScope);
                break;
            case 1:
                Object item3 = range.getItem();
                x.d(item3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                objSave = save((SpanStyle) item3, SpanStyleSaver, saverScope);
                break;
            case 2:
                Object item4 = range.getItem();
                x.d(item4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                objSave = save((VerbatimTtsAnnotation) item4, VerbatimTtsAnnotationSaver, saverScope);
                break;
            case 3:
                Object item5 = range.getItem();
                x.d(item5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                objSave = save((UrlAnnotation) item5, UrlAnnotationSaver, saverScope);
                break;
            case 4:
                Object item6 = range.getItem();
                x.d(item6, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                objSave = save((LinkAnnotation.Url) item6, LinkSaver, saverScope);
                break;
            case 5:
                Object item7 = range.getItem();
                x.d(item7, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                objSave = save((LinkAnnotation.Clickable) item7, ClickableSaver, saverScope);
                break;
            case 6:
                Object item8 = range.getItem();
                x.d(item8, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                objSave = ((StringAnnotation) item8).m10500unboximpl();
                break;
            default:
                throw new h.i();
        }
        return i.f(annotationType, objSave, Integer.valueOf(range.getStart()), Integer.valueOf(range.getEnd()), range.getTag());
    }

    static final AnnotatedString.Range AnnotationRangeSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        ParagraphStyle paragraphStyleRestore = null;
        clickableRestore = null;
        LinkAnnotation.Clickable clickableRestore = null;
        urlRestore = null;
        LinkAnnotation.Url urlRestore = null;
        urlAnnotationRestore = null;
        UrlAnnotation urlAnnotationRestore = null;
        verbatimTtsAnnotationRestore = null;
        VerbatimTtsAnnotation verbatimTtsAnnotationRestore = null;
        spanStyleRestore = null;
        SpanStyle spanStyleRestore = null;
        paragraphStyleRestore = null;
        AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
        if (annotationType == null) {
            x.g();
        }
        Object obj3 = list.get(2);
        Integer num = obj3 != null ? (Integer) obj3 : null;
        if (num == null) {
            x.g();
        }
        int iIntValue = num.intValue();
        Object obj4 = list.get(3);
        Integer num2 = obj4 != null ? (Integer) obj4 : null;
        if (num2 == null) {
            x.g();
        }
        int iIntValue2 = num2.intValue();
        Object obj5 = list.get(4);
        String str = obj5 != null ? (String) obj5 : null;
        if (str == null) {
            x.g();
        }
        AnnotationType annotationType2 = AnnotationType.Paragraph;
        switch (annotationType.ordinal()) {
            case 0:
                Object obj6 = list.get(1);
                Saver<ParagraphStyle, Object> saver = ParagraphStyleSaver;
                if ((!x.n(obj6, false) || (saver instanceof NonNullValueClassSaver)) && obj6 != null) {
                    paragraphStyleRestore = saver.restore(obj6);
                }
                if (paragraphStyleRestore == null) {
                    x.g();
                }
                return new AnnotatedString.Range(paragraphStyleRestore, iIntValue, iIntValue2, str);
            case 1:
                Object obj7 = list.get(1);
                Saver<SpanStyle, Object> saver2 = SpanStyleSaver;
                if ((!x.n(obj7, false) || (saver2 instanceof NonNullValueClassSaver)) && obj7 != null) {
                    spanStyleRestore = saver2.restore(obj7);
                }
                if (spanStyleRestore == null) {
                    x.g();
                }
                return new AnnotatedString.Range(spanStyleRestore, iIntValue, iIntValue2, str);
            case 2:
                Object obj8 = list.get(1);
                Saver<VerbatimTtsAnnotation, Object> saver3 = VerbatimTtsAnnotationSaver;
                if ((!x.n(obj8, false) || (saver3 instanceof NonNullValueClassSaver)) && obj8 != null) {
                    verbatimTtsAnnotationRestore = saver3.restore(obj8);
                }
                if (verbatimTtsAnnotationRestore == null) {
                    x.g();
                }
                return new AnnotatedString.Range(verbatimTtsAnnotationRestore, iIntValue, iIntValue2, str);
            case 3:
                Object obj9 = list.get(1);
                Saver<UrlAnnotation, Object> saver4 = UrlAnnotationSaver;
                if ((!x.n(obj9, false) || (saver4 instanceof NonNullValueClassSaver)) && obj9 != null) {
                    urlAnnotationRestore = saver4.restore(obj9);
                }
                if (urlAnnotationRestore == null) {
                    x.g();
                }
                return new AnnotatedString.Range(urlAnnotationRestore, iIntValue, iIntValue2, str);
            case 4:
                Object obj10 = list.get(1);
                Saver<LinkAnnotation.Url, Object> saver5 = LinkSaver;
                if ((!x.n(obj10, false) || (saver5 instanceof NonNullValueClassSaver)) && obj10 != null) {
                    urlRestore = saver5.restore(obj10);
                }
                if (urlRestore == null) {
                    x.g();
                }
                return new AnnotatedString.Range(urlRestore, iIntValue, iIntValue2, str);
            case 5:
                Object obj11 = list.get(1);
                Saver<LinkAnnotation.Clickable, Object> saver6 = ClickableSaver;
                if ((!x.n(obj11, false) || (saver6 instanceof NonNullValueClassSaver)) && obj11 != null) {
                    clickableRestore = saver6.restore(obj11);
                }
                if (clickableRestore == null) {
                    x.g();
                }
                return new AnnotatedString.Range(clickableRestore, iIntValue, iIntValue2, str);
            case 6:
                Object obj12 = list.get(1);
                String str2 = obj12 != null ? (String) obj12 : null;
                if (str2 == null) {
                    x.g();
                }
                return new AnnotatedString.Range(StringAnnotation.m10494boximpl(str2), iIntValue, iIntValue2, str);
            default:
                throw new h.i();
        }
    }

    static final BaselineShift BaselineShiftSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.Float");
        return BaselineShift.m10873boximpl(((Float) obj).floatValue());
    }

    static final LinkAnnotation.Clickable ClickableSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        String str = obj2 != null ? (String) obj2 : null;
        if (str == null) {
            x.g();
        }
        Object obj3 = list.get(1);
        Saver<TextLinkStyles, Object> saver = TextLinkStylesSaver;
        return new LinkAnnotation.Clickable(str, ((!x.n(obj3, false) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) ? saver.restore(obj3) : null, null);
    }

    static final FontStyle FontStyleSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.Int");
        return FontStyle.m10658boximpl(((Integer) obj).intValue());
    }

    static final FontSynthesis FontSynthesisSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.Int");
        return FontSynthesis.m10669boximpl(((Integer) obj).intValue());
    }

    static final FontWeight FontWeightSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.Int");
        return new FontWeight(((Integer) obj).intValue());
    }

    static final Hyphens HyphensSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.Int");
        return Hyphens.m10896boximpl(((Integer) obj).intValue());
    }

    static final LineHeightStyle.Alignment LineHeightStyleAlignmentSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) obj).floatValue();
        LineHeightStyle.Alignment.m10971constructorimpl(fFloatValue);
        return LineHeightStyle.Alignment.m10970boximpl(fFloatValue);
    }

    static final LineHeightStyle.Mode LineHeightStyleModeSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.Int");
        return LineHeightStyle.Mode.m10981boximpl(((Integer) obj).intValue());
    }

    static final LineHeightStyle LineHeightStyleSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<LineHeightStyle.Alignment, Object> saver = getSaver(LineHeightStyle.Alignment.Companion);
        o oVar = null;
        LineHeightStyle.Alignment alignmentRestore = ((!x.n(obj2, false) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
        if (alignmentRestore == null) {
            x.g();
        }
        float fM10976unboximpl = alignmentRestore.m10976unboximpl();
        Object obj3 = list.get(1);
        Saver<LineHeightStyle.Trim, Object> saver2 = getSaver(LineHeightStyle.Trim.Companion);
        LineHeightStyle.Trim trimRestore = ((!x.n(obj3, false) || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? saver2.restore(obj3) : null;
        if (trimRestore == null) {
            x.g();
        }
        int iM10999unboximpl = trimRestore.m10999unboximpl();
        Object obj4 = list.get(2);
        Saver<LineHeightStyle.Mode, Object> saver3 = getSaver(LineHeightStyle.Mode.Companion);
        LineHeightStyle.Mode modeRestore = ((!x.n(obj4, false) || (saver3 instanceof NonNullValueClassSaver)) && obj4 != null) ? saver3.restore(obj4) : null;
        if (modeRestore == null) {
            x.g();
        }
        return new LineHeightStyle(fM10976unboximpl, iM10999unboximpl, modeRestore.m10987unboximpl(), oVar);
    }

    static final LineHeightStyle.Trim LineHeightStyleTrimSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.Int");
        return LineHeightStyle.Trim.m10991boximpl(((Integer) obj).intValue());
    }

    static final LinkAnnotation.Url LinkSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextLinkStyles textLinkStylesRestore = null;
        String str = obj2 != null ? (String) obj2 : null;
        if (str == null) {
            x.g();
        }
        Object obj3 = list.get(1);
        Saver<TextLinkStyles, Object> saver = TextLinkStylesSaver;
        if ((!x.n(obj3, false) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) {
            textLinkStylesRestore = saver.restore(obj3);
        }
        return new LinkAnnotation.Url(str, textLinkStylesRestore, null, 4, null);
    }

    static final Object LocaleListSaver$lambda$0(SaverScope saverScope, LocaleList localeList) {
        List<Locale> localeList2 = localeList.getLocaleList();
        ArrayList arrayList = new ArrayList(localeList2.size());
        int size = localeList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(save(localeList2.get(i2), getSaver(Locale.Companion), saverScope));
        }
        return arrayList;
    }

    static final LocaleList LocaleListSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = list.get(i2);
            ArrayList arrayList2 = arrayList;
            Saver<Locale, Object> saver = getSaver(Locale.Companion);
            Locale localeRestore = null;
            if ((!x.n(obj2, false) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) {
                localeRestore = saver.restore(obj2);
            }
            if (localeRestore == null) {
                x.g();
            }
            arrayList2.add(localeRestore);
        }
        return new LocaleList(arrayList);
    }

    static final Locale LocaleSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.String");
        return new Locale((String) obj);
    }

    private static final <Original, Saveable> NonNullValueClassSaver<Original, Saveable> NonNullValueClassSaver(final p<? super SaverScope, ? super Original, ? extends Saveable> pVar, final l<? super Saveable, ? extends Original> lVar) {
        return new NonNullValueClassSaver() { // from class: androidx.compose.ui.text.SaversKt.NonNullValueClassSaver.1
            @Override // androidx.compose.runtime.saveable.Saver
            public Object restore(Object obj) {
                return lVar.invoke(obj);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Object save(SaverScope saverScope, Object obj) {
                return pVar.invoke(saverScope, obj);
            }
        };
    }

    static final Object OffsetSaver$lambda$0(SaverScope saverScope, Offset offset) {
        return (offset != null && Offset.m7977equalsimpl0(offset.m7990unboximpl(), Offset.Companion.m7995getUnspecifiedF1C5BW0())) ? (Serializable) false : i.f(Float.valueOf(Float.intBitsToFloat((int) (offset.m7990unboximpl() >> 32))), Float.valueOf(Float.intBitsToFloat((int) (offset.m7990unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE))));
    }

    static final Offset OffsetSaver$lambda$1(Object obj) {
        if (x.n(obj, false)) {
            return Offset.m7969boximpl(Offset.Companion.m7995getUnspecifiedF1C5BW0());
        }
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f2 = obj2 != null ? (Float) obj2 : null;
        if (f2 == null) {
            x.g();
        }
        float fFloatValue = f2.floatValue();
        Object obj3 = list.get(1);
        if ((obj3 != null ? (Float) obj3 : null) == null) {
            x.g();
        }
        return Offset.m7969boximpl((Float.floatToRawIntBits(fFloatValue) << 32) | (Float.floatToRawIntBits(r1.floatValue()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    static final ParagraphStyle ParagraphStyleSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<TextAlign, Object> saver = getSaver(TextAlign.Companion);
        TextMotion textMotionRestore = null;
        TextAlign textAlignRestore = ((!x.n(obj2, false) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
        if (textAlignRestore == null) {
            x.g();
        }
        int iM11010unboximpl = textAlignRestore.m11010unboximpl();
        Object obj3 = list.get(1);
        Saver<TextDirection, Object> saver2 = getSaver(TextDirection.Companion);
        TextDirection textDirectionRestore = ((!x.n(obj3, false) || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? saver2.restore(obj3) : null;
        if (textDirectionRestore == null) {
            x.g();
        }
        int iM11027unboximpl = textDirectionRestore.m11027unboximpl();
        Object obj4 = list.get(2);
        Saver<TextUnit, Object> saver3 = getSaver(TextUnit.Companion);
        TextUnit textUnitRestore = ((!x.n(obj4, false) || (saver3 instanceof NonNullValueClassSaver)) && obj4 != null) ? saver3.restore(obj4) : null;
        if (textUnitRestore == null) {
            x.g();
        }
        long jM11371unboximpl = textUnitRestore.m11371unboximpl();
        Object obj5 = list.get(3);
        Saver<TextIndent, Object> saver4 = getSaver(TextIndent.Companion);
        TextIndent textIndentRestore = ((!x.n(obj5, false) || (saver4 instanceof NonNullValueClassSaver)) && obj5 != null) ? saver4.restore(obj5) : null;
        Object obj6 = list.get(4);
        Saver<PlatformParagraphStyle, Object> saver5 = Savers_androidKt.getSaver(PlatformParagraphStyle.Companion);
        PlatformParagraphStyle platformParagraphStyleRestore = ((!x.n(obj6, false) || (saver5 instanceof NonNullValueClassSaver)) && obj6 != null) ? saver5.restore(obj6) : null;
        Object obj7 = list.get(5);
        Saver<LineHeightStyle, Object> saver6 = getSaver(LineHeightStyle.Companion);
        LineHeightStyle lineHeightStyleRestore = ((!x.n(obj7, false) || (saver6 instanceof NonNullValueClassSaver)) && obj7 != null) ? saver6.restore(obj7) : null;
        Object obj8 = list.get(6);
        Saver<LineBreak, Object> saver7 = Savers_androidKt.getSaver(LineBreak.Companion);
        LineBreak lineBreakRestore = ((!x.n(obj8, false) || (saver7 instanceof NonNullValueClassSaver)) && obj8 != null) ? saver7.restore(obj8) : null;
        if (lineBreakRestore == null) {
            x.g();
        }
        int iM10921unboximpl = lineBreakRestore.m10921unboximpl();
        Object obj9 = list.get(7);
        Saver<Hyphens, Object> saver8 = getSaver(Hyphens.Companion);
        Hyphens hyphensRestore = ((!x.n(obj9, false) || (saver8 instanceof NonNullValueClassSaver)) && obj9 != null) ? saver8.restore(obj9) : null;
        if (hyphensRestore == null) {
            x.g();
        }
        int iM10902unboximpl = hyphensRestore.m10902unboximpl();
        Object obj10 = list.get(8);
        Saver<TextMotion, Object> saver9 = Savers_androidKt.getSaver(TextMotion.Companion);
        if ((!x.n(obj10, false) || (saver9 instanceof NonNullValueClassSaver)) && obj10 != null) {
            textMotionRestore = saver9.restore(obj10);
        }
        return new ParagraphStyle(iM11010unboximpl, iM11027unboximpl, jM11371unboximpl, textIndentRestore, platformParagraphStyleRestore, lineHeightStyleRestore, iM10921unboximpl, iM10902unboximpl, textMotionRestore, (o) null);
    }

    static final Shadow ShadowSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<Color, Object> saver = getSaver(Color.Companion);
        Color colorRestore = ((!x.n(obj2, false) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
        if (colorRestore == null) {
            x.g();
        }
        long jM8238unboximpl = colorRestore.m8238unboximpl();
        Object obj3 = list.get(1);
        Saver<Offset, Object> saver2 = getSaver(Offset.Companion);
        Offset offsetRestore = ((!x.n(obj3, false) || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? saver2.restore(obj3) : null;
        if (offsetRestore == null) {
            x.g();
        }
        long jM7990unboximpl = offsetRestore.m7990unboximpl();
        Object obj4 = list.get(2);
        Float f2 = obj4 != null ? (Float) obj4 : null;
        if (f2 == null) {
            x.g();
        }
        return new Shadow(jM8238unboximpl, jM7990unboximpl, f2.floatValue(), null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 androidx.compose.ui.text.SpanStyle, still in use, count: 2, list:
          (r1v1 androidx.compose.ui.text.SpanStyle) from 0x012f: MOVE (r16v2 androidx.compose.ui.text.SpanStyle) = (r1v1 androidx.compose.ui.text.SpanStyle) (LINE:304)
          (r1v1 androidx.compose.ui.text.SpanStyle) from 0x0128: MOVE (r16v7 androidx.compose.ui.text.SpanStyle) = (r1v1 androidx.compose.ui.text.SpanStyle) (LINE:297)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    static final androidx.compose.ui.text.SpanStyle SpanStyleSaver$lambda$1(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SaversKt.SpanStyleSaver$lambda$1(java.lang.Object):androidx.compose.ui.text.SpanStyle");
    }

    static final TextAlign TextAlignSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.Int");
        return TextAlign.m11004boximpl(((Integer) obj).intValue());
    }

    static final TextDecoration TextDecorationSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.Int");
        return new TextDecoration(((Integer) obj).intValue());
    }

    static final TextDirection TextDirectionSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.Int");
        return TextDirection.m11021boximpl(((Integer) obj).intValue());
    }

    static final TextGeometricTransform TextGeometricTransformSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
        List list = (List) obj;
        return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }

    static final TextIndent TextIndentSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<TextUnit, Object> saver = getSaver(TextUnit.Companion);
        TextUnit textUnitRestore = null;
        TextUnit textUnitRestore2 = ((!x.n(obj2, false) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
        if (textUnitRestore2 == null) {
            x.g();
        }
        long jM11371unboximpl = textUnitRestore2.m11371unboximpl();
        Object obj3 = list.get(1);
        Saver<TextUnit, Object> saver2 = getSaver(TextUnit.Companion);
        if ((!x.n(obj3, false) || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) {
            textUnitRestore = saver2.restore(obj3);
        }
        if (textUnitRestore == null) {
            x.g();
        }
        return new TextIndent(jM11371unboximpl, textUnitRestore.m11371unboximpl(), null);
    }

    static final Object TextLinkStylesSaver$lambda$0(SaverScope saverScope, TextLinkStyles textLinkStyles) {
        SpanStyle style = textLinkStyles.getStyle();
        Saver<SpanStyle, Object> saver = SpanStyleSaver;
        return i.f(save(style, saver, saverScope), save(textLinkStyles.getFocusedStyle(), saver, saverScope), save(textLinkStyles.getHoveredStyle(), saver, saverScope), save(textLinkStyles.getPressedStyle(), saver, saverScope));
    }

    static final TextLinkStyles TextLinkStylesSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<SpanStyle, Object> saver = SpanStyleSaver;
        SpanStyle spanStyleRestore = null;
        SpanStyle spanStyleRestore2 = ((!x.n(obj2, false) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
        Object obj3 = list.get(1);
        SpanStyle spanStyleRestore3 = ((!x.n(obj3, false) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) ? saver.restore(obj3) : null;
        Object obj4 = list.get(2);
        SpanStyle spanStyleRestore4 = ((!x.n(obj4, false) || (saver instanceof NonNullValueClassSaver)) && obj4 != null) ? saver.restore(obj4) : null;
        Object obj5 = list.get(3);
        if ((!x.n(obj5, false) || (saver instanceof NonNullValueClassSaver)) && obj5 != null) {
            spanStyleRestore = saver.restore(obj5);
        }
        return new TextLinkStyles(spanStyleRestore2, spanStyleRestore3, spanStyleRestore4, spanStyleRestore);
    }

    static final TextRange TextRangeSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Integer num = obj2 != null ? (Integer) obj2 : null;
        if (num == null) {
            x.g();
        }
        int iIntValue = num.intValue();
        Object obj3 = list.get(1);
        Integer num2 = obj3 != null ? (Integer) obj3 : null;
        if (num2 == null) {
            x.g();
        }
        return TextRange.m10534boximpl(TextRangeKt.TextRange(iIntValue, num2.intValue()));
    }

    static final Object TextUnitSaver$lambda$0(SaverScope saverScope, TextUnit textUnit) {
        return (textUnit != null && TextUnit.m11359equalsimpl0(textUnit.m11371unboximpl(), TextUnit.Companion.m11373getUnspecifiedXSAIIZE())) ? (Serializable) false : i.f(Float.valueOf(TextUnit.m11362getValueimpl(textUnit.m11371unboximpl())), save(TextUnitType.m11387boximpl(TextUnit.m11361getTypeUIouoOA(textUnit.m11371unboximpl())), getSaver(TextUnitType.Companion), saverScope));
    }

    static final TextUnit TextUnitSaver$lambda$1(Object obj) {
        if (x.n(obj, false)) {
            return TextUnit.m11352boximpl(TextUnit.Companion.m11373getUnspecifiedXSAIIZE());
        }
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextUnitType textUnitTypeRestore = null;
        Float f2 = obj2 != null ? (Float) obj2 : null;
        if (f2 == null) {
            x.g();
        }
        float fFloatValue = f2.floatValue();
        Object obj3 = list.get(1);
        Saver<TextUnitType, Object> saver = getSaver(TextUnitType.Companion);
        if ((!x.n(obj3, false) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) {
            textUnitTypeRestore = saver.restore(obj3);
        }
        if (textUnitTypeRestore == null) {
            x.g();
        }
        return TextUnit.m11352boximpl(TextUnitKt.m11374TextUnitanM5pPY(fFloatValue, textUnitTypeRestore.m11393unboximpl()));
    }

    static final Object TextUnitTypeSaver$lambda$0(SaverScope saverScope, TextUnitType textUnitType) {
        long jM11393unboximpl = textUnitType.m11393unboximpl();
        if (TextUnitType.m11390equalsimpl0(jM11393unboximpl, TextUnitType.Companion.m11394getEmUIouoOA())) {
            return 0;
        }
        return TextUnitType.m11390equalsimpl0(jM11393unboximpl, TextUnitType.Companion.m11395getSpUIouoOA()) ? 1 : false;
    }

    static final TextUnitType TextUnitTypeSaver$lambda$1(Object obj) {
        return x.n(obj, 0) ? TextUnitType.m11387boximpl(TextUnitType.Companion.m11394getEmUIouoOA()) : x.n(obj, 1) ? TextUnitType.m11387boximpl(TextUnitType.Companion.m11395getSpUIouoOA()) : TextUnitType.m11387boximpl(TextUnitType.Companion.m11396getUnspecifiedUIouoOA());
    }

    static final UrlAnnotation UrlAnnotationSaver$lambda$1(Object obj) {
        String str = obj != null ? (String) obj : null;
        if (str == null) {
            x.g();
        }
        return new UrlAnnotation(str);
    }

    static final VerbatimTtsAnnotation VerbatimTtsAnnotationSaver$lambda$1(Object obj) {
        String str = obj != null ? (String) obj : null;
        if (str == null) {
            x.g();
        }
        return new VerbatimTtsAnnotation(str);
    }

    public static final Saver<AnnotatedString, Object> getAnnotatedStringSaver() {
        return AnnotatedStringSaver;
    }

    public static final Saver<FontStyle, Object> getFontStyleSaver() {
        return FontStyleSaver;
    }

    public static final Saver<FontSynthesis, Object> getFontSynthesisSaver() {
        return FontSynthesisSaver;
    }

    public static final Saver<ParagraphStyle, Object> getParagraphStyleSaver() {
        return ParagraphStyleSaver;
    }

    public static final Saver<Offset, Object> getSaver(Offset.Companion companion) {
        return OffsetSaver;
    }

    public static final Saver<SpanStyle, Object> getSpanStyleSaver() {
        return SpanStyleSaver;
    }

    public static final Saver<TextLinkStyles, Object> getTextLinkStylesSaver() {
        return TextLinkStylesSaver;
    }

    public static final NonNullValueClassSaver<TextUnitType, Object> getTextUnitTypeSaver() {
        return TextUnitTypeSaver;
    }

    public static final /* synthetic */ <T extends Saver<Original, Saveable>, Original, Saveable, Result> Result restore(Saveable saveable, T t) {
        if ((x.n(saveable, false) && !(t instanceof NonNullValueClassSaver)) || saveable == null) {
            return null;
        }
        Result result = (Result) t.restore(saveable);
        x.i();
        return result;
    }

    public static final <T extends Saver<Original, Saveable>, Original, Saveable> Object save(Original original, T t, SaverScope saverScope) {
        Object objSave;
        if (original == null || (objSave = t.save(saverScope, original)) == null) {
            return false;
        }
        return objSave;
    }

    public static final Saver<TextRange, Object> getSaver(TextRange.Companion companion) {
        return TextRangeSaver;
    }

    public static final Saver<FontStyle, Object> getSaver(FontStyle.Companion companion) {
        return FontStyleSaver;
    }

    public static final Saver<FontSynthesis, Object> getSaver(FontSynthesis.Companion companion) {
        return FontSynthesisSaver;
    }

    public static final Saver<FontWeight, Object> getSaver(FontWeight.Companion companion) {
        return FontWeightSaver;
    }

    public static final Saver<Locale, Object> getSaver(Locale.Companion companion) {
        return LocaleSaver;
    }

    public static final Saver<LocaleList, Object> getSaver(LocaleList.Companion companion) {
        return LocaleListSaver;
    }

    public static final Saver<BaselineShift, Object> getSaver(BaselineShift.Companion companion) {
        return BaselineShiftSaver;
    }

    public static final Saver<LineHeightStyle, Object> getSaver(LineHeightStyle.Companion companion) {
        return LineHeightStyleSaver;
    }

    public static final Saver<TextDecoration, Object> getSaver(TextDecoration.Companion companion) {
        return TextDecorationSaver;
    }

    private static /* synthetic */ void getAnnotationRangeSaver$annotations() {
    }

    public static final Saver<TextGeometricTransform, Object> getSaver(TextGeometricTransform.Companion companion) {
        return TextGeometricTransformSaver;
    }

    private static /* synthetic */ void getUrlAnnotationSaver$annotations() {
    }

    public static final Saver<TextIndent, Object> getSaver(TextIndent.Companion companion) {
        return TextIndentSaver;
    }

    public static final Saver<Shadow, Object> getSaver(Shadow.Companion companion) {
        return ShadowSaver;
    }

    public static final <T> T save(T t) {
        return t;
    }

    public static final Saver<Hyphens, Object> getSaver(Hyphens.Companion companion) {
        return HyphensSaver;
    }

    private static final Saver<LineHeightStyle.Mode, Object> getSaver(LineHeightStyle.Mode.Companion companion) {
        return LineHeightStyleModeSaver;
    }

    public static final Saver<TextDirection, Object> getSaver(TextDirection.Companion companion) {
        return TextDirectionSaver;
    }

    public static final Saver<TextUnit, Object> getSaver(TextUnit.Companion companion) {
        return TextUnitSaver;
    }

    public static final Saver<Color, Object> getSaver(Color.Companion companion) {
        return ColorSaver;
    }

    private static final Saver<LineHeightStyle.Alignment, Object> getSaver(LineHeightStyle.Alignment.Companion companion) {
        return LineHeightStyleAlignmentSaver;
    }

    private static final Saver<LineHeightStyle.Trim, Object> getSaver(LineHeightStyle.Trim.Companion companion) {
        return LineHeightStyleTrimSaver;
    }

    public static final Saver<TextUnitType, Object> getSaver(TextUnitType.Companion companion) {
        return TextUnitTypeSaver;
    }

    public static final Saver<TextAlign, Object> getSaver(TextAlign.Companion companion) {
        return TextAlignSaver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <Result> Result restore(Object obj) {
        if (obj == 0) {
            return null;
        }
        x.i();
        return obj;
    }
}
