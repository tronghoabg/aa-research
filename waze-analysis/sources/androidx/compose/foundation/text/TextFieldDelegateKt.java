package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.a.ac;
import h.a.i;
import h.g.a.a;
import h.g.a.l;
import h.k.n;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldDelegateKt {
    public static final int DefaultWidthCharCount = 10;
    private static final String EmptyTextReplacement = o.j("H", 10);

    public static final long computeSizeForDefaultText(TextStyle textStyle, Density density, FontFamily.Resolver resolver, int i2) {
        Paragraph paragraphParagraphForDefaultText = paragraphForDefaultText(textStyle, density, resolver, i2);
        return (TextDelegateKt.ceilToIntPx(paragraphParagraphForDefaultText.getMinIntrinsicWidth()) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & TextDelegateKt.ceilToIntPx(paragraphParagraphForDefaultText.getHeight()));
    }

    public static /* synthetic */ long computeSizeForDefaultText$default(TextStyle textStyle, Density density, FontFamily.Resolver resolver, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 1;
        }
        return computeSizeForDefaultText(textStyle, density, resolver, i2);
    }

    public static final Rect focusedRectInRoot(TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, int i2, a<IntSize> aVar) {
        Rect boundingBox = i2 < textLayoutResult.getLayoutInput().getText().length() ? textLayoutResult.getBoundingBox(i2) : i2 != 0 ? textLayoutResult.getBoundingBox(i2 - 1) : new Rect(0.0f, 0.0f, 1.0f, (int) (aVar.invoke().m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        long jMo9746localToRootMKHz9U = layoutCoordinates.mo9746localToRootMKHz9U((Float.floatToRawIntBits(boundingBox.getTop()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(boundingBox.getLeft()) << 32));
        long j2 = jMo9746localToRootMKHz9U >> 32;
        int i3 = (int) (jMo9746localToRootMKHz9U & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) j2);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i3);
        return RectKt.m8020Recttz77jQw((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(boundingBox.getBottom() - boundingBox.getTop())) | (Float.floatToRawIntBits(boundingBox.getRight() - boundingBox.getLeft()) << 32));
    }

    public static final String getEmptyTextReplacement() {
        return EmptyTextReplacement;
    }

    public static final Paragraph paragraphForDefaultText(TextStyle textStyle, Density density, FontFamily.Resolver resolver, int i2) {
        return ParagraphKt.m10425ParagraphUl8oQg4(i.aM(n.u(0, i2), "\n", null, null, 0, new l() { // from class: androidx.compose.foundation.text.TextFieldDelegateKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                return TextFieldDelegateKt.EmptyTextReplacement;
            }
        }, 30), textStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), density, resolver, (DisplayStrings.DS_ROUTE_SETTINGS_ROUTE_CALCULATION_FAILED_MESSAGE & 32) != 0 ? ac.f47967a : null, (DisplayStrings.DS_ROUTE_SETTINGS_ROUTE_CALCULATION_FAILED_MESSAGE & 64) != 0 ? ac.f47967a : null, (DisplayStrings.DS_ROUTE_SETTINGS_ROUTE_CALCULATION_FAILED_MESSAGE & 128) != 0 ? Integer.MAX_VALUE : i2, (DisplayStrings.DS_ROUTE_SETTINGS_ROUTE_CALCULATION_FAILED_MESSAGE & 256) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : 0);
    }
}
