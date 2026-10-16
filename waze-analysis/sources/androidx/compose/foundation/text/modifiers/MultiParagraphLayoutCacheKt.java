package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MultiParagraphLayoutCacheKt {
    private static final long DefaultFontSize = TextUnitKt.getSp(14);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: times-NB67dxo, reason: not valid java name */
    public static final long m3813timesNB67dxo(long j2, long j3) {
        if (!TextUnit.m11364isEmimpl(j3)) {
            throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) TextUnit.m11369toStringimpl(j3)) + '.');
        }
        if (TextUnit.m11364isEmimpl(j2)) {
            throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + ((Object) TextUnit.m11369toStringimpl(j3)) + "). Please declare the style.fontSize with Sp units instead.");
        }
        if (TextUnit.m11360getRawTypeimpl(j2) != 0) {
            float fM11362getValueimpl = TextUnit.m11362getValueimpl(j3);
            TextUnitKt.m11375checkArithmeticR2X_6o(j2);
            return TextUnitKt.pack(TextUnit.m11360getRawTypeimpl(j2), TextUnit.m11362getValueimpl(j2) * fM11362getValueimpl);
        }
        long j4 = DefaultFontSize;
        float fM11362getValueimpl2 = TextUnit.m11362getValueimpl(j3);
        TextUnitKt.m11375checkArithmeticR2X_6o(j4);
        return TextUnitKt.pack(TextUnit.m11360getRawTypeimpl(j4), TextUnit.m11362getValueimpl(j4) * fM11362getValueimpl2);
    }
}
