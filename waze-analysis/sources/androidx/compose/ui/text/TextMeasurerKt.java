package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextOverflow;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextMeasurerKt {
    private static final int DefaultCacheSize = 8;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m10524isEllipsisMW5ApA(int i2) {
        return TextOverflow.m11059equalsimpl0(i2, TextOverflow.Companion.m11069getEllipsisgIe3tQ8()) || TextOverflow.m11059equalsimpl0(i2, TextOverflow.Companion.m11071getStartEllipsisgIe3tQ8()) || TextOverflow.m11059equalsimpl0(i2, TextOverflow.Companion.m11070getMiddleEllipsisgIe3tQ8());
    }
}
