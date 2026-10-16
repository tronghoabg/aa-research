package androidx.compose.ui.text;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextRangeKt {
    public static final long TextRange(int i2, int i3) {
        long jPackWithCheck = packWithCheck(i2, i3);
        TextRange.Companion companion = TextRange.Companion;
        return jPackWithCheck;
    }

    /* renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m10552coerceIn8ffj60Q(long j2, int i2, int i3) {
        int iM10541getEndimpl = TextRange.m10541getEndimpl(j2);
        if (iM10541getEndimpl < i2) {
            iM10541getEndimpl = i2;
        }
        if (iM10541getEndimpl > i3) {
            iM10541getEndimpl = i3;
        }
        int iM10546getStartimpl = TextRange.m10546getStartimpl(j2);
        if (iM10546getStartimpl >= i2) {
            i2 = iM10546getStartimpl;
        }
        if (i2 <= i3) {
            i3 = i2;
        }
        return (i3 == TextRange.m10546getStartimpl(j2) && iM10541getEndimpl == TextRange.m10541getEndimpl(j2)) ? j2 : TextRange(i3, iM10541getEndimpl);
    }

    private static final long packWithCheck(int i2, int i3) {
        if (i2 < 0 || i3 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("start and end cannot be negative. [start: " + i2 + ", end: " + i3 + ']');
        }
        return (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
    }

    /* renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m10553substringFDrldGo(CharSequence charSequence, long j2) {
        return charSequence.subSequence(TextRange.m10544getMinimpl(j2), TextRange.m10543getMaximpl(j2)).toString();
    }

    public static final long TextRange(int i2) {
        return TextRange(i2, i2);
    }
}
