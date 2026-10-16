package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import androidx.core.text.TextUtilsCompat;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics_androidKt {
    public static final ParagraphIntrinsics ActualParagraphIntrinsics(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, FontFamily.Resolver resolver) {
        return new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasEmojiCompat(TextStyle textStyle) {
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        EmojiSupportMatch emojiSupportMatchM10393boximpl = null;
        if (platformStyle != null && (paragraphStyle = platformStyle.getParagraphStyle()) != null) {
            emojiSupportMatchM10393boximpl = EmojiSupportMatch.m10393boximpl(paragraphStyle.m10474getEmojiSupportMatch_3YsG6Y());
        }
        return emojiSupportMatchM10393boximpl == null || !EmojiSupportMatch.m10396equalsimpl0(emojiSupportMatchM10393boximpl.m10399unboximpl(), EmojiSupportMatch.Companion.m10402getNone_3YsG6Y());
    }

    /* renamed from: resolveTextDirectionHeuristics-HklW4sA, reason: not valid java name */
    public static final int m10839resolveTextDirectionHeuristicsHklW4sA(int i2, LocaleList localeList) {
        Locale platformLocale;
        if (TextDirection.m11024equalsimpl0(i2, TextDirection.Companion.m11029getContentOrLtrs_7Xco())) {
            return 2;
        }
        if (TextDirection.m11024equalsimpl0(i2, TextDirection.Companion.m11030getContentOrRtls_7Xco())) {
            return 3;
        }
        if (TextDirection.m11024equalsimpl0(i2, TextDirection.Companion.m11031getLtrs_7Xco())) {
            return 0;
        }
        if (TextDirection.m11024equalsimpl0(i2, TextDirection.Companion.m11032getRtls_7Xco())) {
            return 1;
        }
        if (!TextDirection.m11024equalsimpl0(i2, TextDirection.Companion.m11028getContents_7Xco()) && !TextDirection.m11024equalsimpl0(i2, TextDirection.Companion.m11033getUnspecifieds_7Xco())) {
            throw new IllegalStateException("Invalid TextDirection.");
        }
        if (localeList == null || (platformLocale = localeList.get(0).getPlatformLocale()) == null) {
            platformLocale = Locale.getDefault();
        }
        int layoutDirectionFromLocale = TextUtilsCompat.getLayoutDirectionFromLocale(platformLocale);
        return (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) ? 2 : 3;
    }

    /* renamed from: resolveTextDirectionHeuristics-HklW4sA$default, reason: not valid java name */
    public static /* synthetic */ int m10840resolveTextDirectionHeuristicsHklW4sA$default(int i2, LocaleList localeList, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            localeList = null;
        }
        return m10839resolveTextDirectionHeuristicsHklW4sA(i2, localeList);
    }
}
