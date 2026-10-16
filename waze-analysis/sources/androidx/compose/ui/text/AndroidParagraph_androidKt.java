package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.SpannedExtensions_androidKt;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannableString == null) {
            spannableString = new SpannableString(charSequence);
        }
        if (!SpannedExtensions_androidKt.hasSpan(spannableString, IndentationFixSpan.class)) {
            SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i2) {
        int lineCount = textLayout.getLineCount();
        for (int i3 = 0; i3 < lineCount; i3++) {
            if (textLayout.getLineBottom(i3) > i2) {
                return i3;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z) {
        return (!z || TextUnit.m11359equalsimpl0(textStyle.m10582getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) || TextUnit.m11359equalsimpl0(textStyle.m10582getLetterSpacingXSAIIZE(), TextUnit.Companion.m11373getUnspecifiedXSAIIZE()) || TextAlign.m11007equalsimpl0(textStyle.m10587getTextAligne0LSkKk(), TextAlign.Companion.m11017getUnspecifiede0LSkKk()) || TextAlign.m11007equalsimpl0(textStyle.m10587getTextAligne0LSkKk(), TextAlign.Companion.m11016getStarte0LSkKk()) || TextAlign.m11007equalsimpl0(textStyle.m10587getTextAligne0LSkKk(), TextAlign.Companion.m11013getJustifye0LSkKk())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m10375toLayoutAlignaXe7zB0(int i2) {
        if (TextAlign.m11007equalsimpl0(i2, TextAlign.Companion.m11014getLefte0LSkKk())) {
            return 3;
        }
        if (TextAlign.m11007equalsimpl0(i2, TextAlign.Companion.m11015getRighte0LSkKk())) {
            return 4;
        }
        if (TextAlign.m11007equalsimpl0(i2, TextAlign.Companion.m11011getCentere0LSkKk())) {
            return 2;
        }
        return (!TextAlign.m11007equalsimpl0(i2, TextAlign.Companion.m11016getStarte0LSkKk()) && TextAlign.m11007equalsimpl0(i2, TextAlign.Companion.m11012getEnde0LSkKk())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m10376toLayoutBreakStrategyxImikfE(int i2) {
        if (LineBreak.Strategy.m10933equalsimpl0(i2, LineBreak.Strategy.Companion.m10939getSimplefcGXIks())) {
            return 0;
        }
        if (LineBreak.Strategy.m10933equalsimpl0(i2, LineBreak.Strategy.Companion.m10938getHighQualityfcGXIks())) {
            return 1;
        }
        return !LineBreak.Strategy.m10933equalsimpl0(i2, LineBreak.Strategy.Companion.m10937getBalancedfcGXIks()) ? 0 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m10377toLayoutHyphenationFrequency3fSNIE(int i2) {
        if (Hyphens.m10899equalsimpl0(i2, Hyphens.Companion.m10903getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT > 32 ? 4 : 2;
        }
        Hyphens.m10899equalsimpl0(i2, Hyphens.Companion.m10904getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m10378toLayoutLineBreakStylehpcqdu8(int i2) {
        if (LineBreak.Strictness.m10944equalsimpl0(i2, LineBreak.Strictness.Companion.m10948getDefaultusljTpc())) {
            return 0;
        }
        if (LineBreak.Strictness.m10944equalsimpl0(i2, LineBreak.Strictness.Companion.m10949getLooseusljTpc())) {
            return 1;
        }
        if (LineBreak.Strictness.m10944equalsimpl0(i2, LineBreak.Strictness.Companion.m10950getNormalusljTpc())) {
            return 2;
        }
        return !LineBreak.Strictness.m10944equalsimpl0(i2, LineBreak.Strictness.Companion.m10951getStrictusljTpc()) ? 0 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m10379toLayoutLineBreakWordStylewPN0Rpw(int i2) {
        return (!LineBreak.WordBreak.m10956equalsimpl0(i2, LineBreak.WordBreak.Companion.m10960getDefaultjp8hJ3c()) && LineBreak.WordBreak.m10956equalsimpl0(i2, LineBreak.WordBreak.Companion.m10961getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutTextGranularity-duNsdkg, reason: not valid java name */
    public static final int m10380toLayoutTextGranularityduNsdkg(int i2) {
        return (!TextGranularity.m10504equalsimpl0(i2, TextGranularity.Companion.m10508getCharacterDRrd7Zo()) && TextGranularity.m10504equalsimpl0(i2, TextGranularity.Companion.m10509getWordDRrd7Zo())) ? 1 : 0;
    }
}
