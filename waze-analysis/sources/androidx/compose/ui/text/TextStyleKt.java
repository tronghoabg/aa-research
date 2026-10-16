package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextStyleKt {

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformTextStyle createPlatformTextStyleInternal(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (platformSpanStyle == null && platformParagraphStyle == null) {
            return null;
        }
        return AndroidTextStyle_androidKt.createPlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    public static final TextStyle lerp(TextStyle textStyle, TextStyle textStyle2, float f2) {
        return new TextStyle(SpanStyleKt.lerp(textStyle.toSpanStyle(), textStyle2.toSpanStyle(), f2), ParagraphStyleKt.lerp(textStyle.toParagraphStyle(), textStyle2.toParagraphStyle(), f2));
    }

    public static final TextStyle resolveDefaults(TextStyle textStyle, LayoutDirection layoutDirection) {
        return new TextStyle(SpanStyleKt.resolveSpanStyleDefaults(textStyle.getSpanStyle$ui_text()), ParagraphStyleKt.resolveParagraphStyleDefaults(textStyle.getParagraphStyle$ui_text(), layoutDirection), textStyle.getPlatformStyle());
    }

    /* renamed from: resolveTextDirection-IhaHGbI, reason: not valid java name */
    public static final int m10592resolveTextDirectionIhaHGbI(LayoutDirection layoutDirection, int i2) {
        if (TextDirection.m11024equalsimpl0(i2, TextDirection.Companion.m11028getContents_7Xco())) {
            LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
            int iOrdinal = layoutDirection.ordinal();
            if (iOrdinal == 0) {
                return TextDirection.Companion.m11029getContentOrLtrs_7Xco();
            }
            if (iOrdinal == 1) {
                return TextDirection.Companion.m11030getContentOrRtls_7Xco();
            }
            throw new i();
        }
        if (!TextDirection.m11024equalsimpl0(i2, TextDirection.Companion.m11033getUnspecifieds_7Xco())) {
            return i2;
        }
        LayoutDirection layoutDirection3 = LayoutDirection.Ltr;
        int iOrdinal2 = layoutDirection.ordinal();
        if (iOrdinal2 == 0) {
            return TextDirection.Companion.m11031getLtrs_7Xco();
        }
        if (iOrdinal2 == 1) {
            return TextDirection.Companion.m11032getRtls_7Xco();
        }
        throw new i();
    }
}
