package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.emoji2.text.EmojiSpan;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PlaceholderExtensions_androidKt {
    /* renamed from: getSpanUnit--R2X_6o, reason: not valid java name */
    private static final int m10852getSpanUnitR2X_6o(long j2) {
        long jM11361getTypeUIouoOA = TextUnit.m11361getTypeUIouoOA(j2);
        if (TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11395getSpUIouoOA())) {
            return 0;
        }
        return !TextUnitType.m11390equalsimpl0(jM11361getTypeUIouoOA, TextUnitType.Companion.m11394getEmUIouoOA()) ? 2 : 1;
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg, reason: not valid java name */
    private static final int m10854getSpanVerticalAligndo9XGg(int i2) {
        if (PlaceholderVerticalAlign.m10463equalsimpl0(i2, PlaceholderVerticalAlign.Companion.m10467getAboveBaselineJ6kI3mc())) {
            return 0;
        }
        if (PlaceholderVerticalAlign.m10463equalsimpl0(i2, PlaceholderVerticalAlign.Companion.m10473getTopJ6kI3mc())) {
            return 1;
        }
        if (PlaceholderVerticalAlign.m10463equalsimpl0(i2, PlaceholderVerticalAlign.Companion.m10468getBottomJ6kI3mc())) {
            return 2;
        }
        if (PlaceholderVerticalAlign.m10463equalsimpl0(i2, PlaceholderVerticalAlign.Companion.m10469getCenterJ6kI3mc())) {
            return 3;
        }
        if (PlaceholderVerticalAlign.m10463equalsimpl0(i2, PlaceholderVerticalAlign.Companion.m10472getTextTopJ6kI3mc())) {
            return 4;
        }
        if (PlaceholderVerticalAlign.m10463equalsimpl0(i2, PlaceholderVerticalAlign.Companion.m10470getTextBottomJ6kI3mc())) {
            return 5;
        }
        if (PlaceholderVerticalAlign.m10463equalsimpl0(i2, PlaceholderVerticalAlign.Companion.m10471getTextCenterJ6kI3mc())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }

    private static final void setPlaceholder(Spannable spannable, Placeholder placeholder, int i2, int i3, Density density) {
        for (Object obj : spannable.getSpans(i2, i3, EmojiSpan.class)) {
            spannable.removeSpan((EmojiSpan) obj);
        }
        SpannableExtensions_androidKt.setSpan(spannable, new PlaceholderSpan(TextUnit.m11362getValueimpl(placeholder.m10459getWidthXSAIIZE()), m10852getSpanUnitR2X_6o(placeholder.m10459getWidthXSAIIZE()), TextUnit.m11362getValueimpl(placeholder.m10457getHeightXSAIIZE()), m10852getSpanUnitR2X_6o(placeholder.m10457getHeightXSAIIZE()), density, m10854getSpanVerticalAligndo9XGg(placeholder.m10458getPlaceholderVerticalAlignJ6kI3mc())), i2, i3);
    }

    public static final void setPlaceholders(Spannable spannable, List<AnnotatedString.Range<Placeholder>> list, Density density) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<Placeholder> range = list.get(i2);
            setPlaceholder(spannable, range.component1(), range.component2(), range.component3(), density);
        }
    }

    /* renamed from: getSpanUnit--R2X_6o$annotations, reason: not valid java name */
    private static /* synthetic */ void m10853getSpanUnitR2X_6o$annotations(long j2) {
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg$annotations, reason: not valid java name */
    private static /* synthetic */ void m10855getSpanVerticalAligndo9XGg$annotations(int i2) {
    }
}
