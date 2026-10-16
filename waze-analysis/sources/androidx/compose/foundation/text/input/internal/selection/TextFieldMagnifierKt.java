package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.i;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldMagnifierKt {

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-hUlJWOE, reason: not valid java name */
    public static final long m3742calculateSelectionMagnifierCenterAndroidhUlJWOE(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, long j2) {
        int iM10546getStartimpl;
        long jM3757getHandleDragPositionF1C5BW0 = textFieldSelectionState.m3757getHandleDragPositionF1C5BW0();
        if ((9223372034707292159L & jM3757getHandleDragPositionF1C5BW0) == InlineClassHelperKt.UnspecifiedPackedFloats || transformedTextFieldState.getVisualText().length() == 0) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        long jM3484getSelectiond9O1mEE = transformedTextFieldState.getVisualText().m3484getSelectiond9O1mEE();
        Handle draggingHandle = textFieldSelectionState.getDraggingHandle();
        if (draggingHandle == null) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        int iOrdinal = draggingHandle.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            iM10546getStartimpl = TextRange.m10546getStartimpl(jM3484getSelectiond9O1mEE);
        } else {
            if (iOrdinal != 2) {
                throw new i();
            }
            iM10546getStartimpl = TextRange.m10541getEndimpl(jM3484getSelectiond9O1mEE);
        }
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM3757getHandleDragPositionF1C5BW0 >> 32));
        int lineForOffset = layoutResult.getLineForOffset(iM10546getStartimpl);
        float lineLeft = layoutResult.getLineLeft(lineForOffset);
        float lineRight = layoutResult.getLineRight(lineForOffset);
        float fG = n.g(fIntBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        if (!IntSize.m11337equalsimpl0(j2, IntSize.Companion.m11344getZeroYbymL2g()) && Math.abs(fIntBitsToFloat - fG) > ((int) (j2 >> 32)) / 2) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }
        float lineTop = layoutResult.getLineTop(lineForOffset);
        float lineBottom = ((layoutResult.getLineBottom(lineForOffset) - lineTop) / 2.0f) + lineTop;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fG);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(lineBottom);
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        long jM3691coerceIn3MmeM6k = (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32);
        if (textLayoutNodeCoordinates != null) {
            if (true != textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                jM3691coerceIn3MmeM6k = TextLayoutStateKt.m3691coerceIn3MmeM6k(jM3691coerceIn3MmeM6k, SelectionManagerKt.visibleBounds(textLayoutNodeCoordinates));
            }
        }
        return TextLayoutStateKt.m3693fromTextLayoutToCoreUv8p0NA(textLayoutState, jM3691coerceIn3MmeM6k);
    }
}
