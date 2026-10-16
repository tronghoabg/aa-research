package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.platform.extensions.PlaceholderExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.emoji2.text.EmojiCompat;
import h.g.a.r;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidParagraphHelper_androidKt {
    private static final AndroidParagraphHelper_androidKt$NoopSpan$1 NoopSpan = new CharacterStyle() { // from class: androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1
        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    };

    public static final CharSequence createCharSequence(String str, float f2, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, r<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> rVar, boolean z) {
        String strProcess;
        float f3;
        Density density2;
        PlatformParagraphStyle paragraphStyle;
        if (z && EmojiCompat.isConfigured()) {
            PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
            EmojiSupportMatch emojiSupportMatchM10393boximpl = null;
            if (platformStyle != null && (paragraphStyle = platformStyle.getParagraphStyle()) != null) {
                emojiSupportMatchM10393boximpl = EmojiSupportMatch.m10393boximpl(paragraphStyle.m10474getEmojiSupportMatch_3YsG6Y());
            }
            strProcess = EmojiCompat.get().process(str, 0, str.length(), Integer.MAX_VALUE, (emojiSupportMatchM10393boximpl != null && EmojiSupportMatch.m10396equalsimpl0(emojiSupportMatchM10393boximpl.m10399unboximpl(), EmojiSupportMatch.Companion.m10400getAll_3YsG6Y())) ? 1 : 0);
            if (strProcess == null) {
                x.g();
            }
        } else {
            strProcess = str;
        }
        if (list.isEmpty() && list2.isEmpty() && x.n(textStyle.getTextIndent(), TextIndent.Companion.getNone()) && TextUnit.m11360getRawTypeimpl(textStyle.m10585getLineHeightXSAIIZE()) == 0) {
            return strProcess;
        }
        Spannable spannableString = strProcess instanceof Spannable ? (Spannable) strProcess : new SpannableString(strProcess);
        if (x.n(textStyle.getTextDecoration(), TextDecoration.Companion.getUnderline())) {
            SpannableExtensions_androidKt.setSpan(spannableString, NoopSpan, 0, str.length());
        }
        if (isIncludeFontPaddingEnabled(textStyle) && textStyle.getLineHeightStyle() == null) {
            SpannableExtensions_androidKt.m10864setLineHeightr9BaKPg(spannableString, textStyle.m10585getLineHeightXSAIIZE(), f2, density);
            f3 = f2;
            density2 = density;
        } else {
            LineHeightStyle lineHeightStyle = textStyle.getLineHeightStyle();
            if (lineHeightStyle == null) {
                lineHeightStyle = LineHeightStyle.Companion.getDefault();
            }
            f3 = f2;
            density2 = density;
            SpannableExtensions_androidKt.m10863setLineHeightKmRG4DE(spannableString, textStyle.m10585getLineHeightXSAIIZE(), f3, density2, lineHeightStyle);
        }
        SpannableExtensions_androidKt.setTextIndent(spannableString, textStyle.getTextIndent(), f3, density2);
        SpannableExtensions_androidKt.setSpanStyles(spannableString, textStyle, list, density2, rVar);
        SpannableExtensions_androidKt.setBulletSpans(spannableString, list, f3, density2, textStyle.getTextIndent());
        PlaceholderExtensions_androidKt.setPlaceholders(spannableString, list2, density2);
        return spannableString;
    }

    public static final boolean isIncludeFontPaddingEnabled(TextStyle textStyle) {
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) {
            return false;
        }
        return paragraphStyle.getIncludeFontPadding();
    }
}
