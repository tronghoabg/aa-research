package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.ui.text.TextRange;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextPreparedSelectionKt {

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[IndexTransformationType.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndexTransformationType.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndexTransformationType.Replacement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IndexTransformationType.Insertion.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long calculateNextCursorPositionAndWedgeAffinity(int i2, int i3, TransformedTextFieldState transformedTextFieldState) {
        if (i2 == -1) {
            return CursorAndWedgeAffinity.m3725constructorimpl(i3);
        }
        long jM3710mapFromTransformedjx7JFs = transformedTextFieldState.m3710mapFromTransformedjx7JFs(i2);
        long jM3713mapToTransformedGEjPoXI = transformedTextFieldState.m3713mapToTransformedGEjPoXI(jM3710mapFromTransformedjx7JFs);
        int iOrdinal = ((TextRange.m10540getCollapsedimpl(jM3710mapFromTransformedjx7JFs) && TextRange.m10540getCollapsedimpl(jM3713mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m10540getCollapsedimpl(jM3710mapFromTransformedjx7JFs) || TextRange.m10540getCollapsedimpl(jM3713mapToTransformedGEjPoXI)) ? (!TextRange.m10540getCollapsedimpl(jM3710mapFromTransformedjx7JFs) || TextRange.m10540getCollapsedimpl(jM3713mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement).ordinal();
        if (iOrdinal == 0) {
            return CursorAndWedgeAffinity.m3726constructorimpl(i2, i2 > i3 ? WedgeAffinity.Start : WedgeAffinity.End);
        }
        if (iOrdinal == 1) {
            return i2 > i3 ? i2 == TextRange.m10546getStartimpl(jM3713mapToTransformedGEjPoXI) ? CursorAndWedgeAffinity.m3726constructorimpl(i2, WedgeAffinity.Start) : CursorAndWedgeAffinity.m3726constructorimpl(TextRange.m10541getEndimpl(jM3713mapToTransformedGEjPoXI), WedgeAffinity.End) : i2 == TextRange.m10541getEndimpl(jM3713mapToTransformedGEjPoXI) ? CursorAndWedgeAffinity.m3726constructorimpl(i2, WedgeAffinity.End) : CursorAndWedgeAffinity.m3726constructorimpl(TextRange.m10546getStartimpl(jM3713mapToTransformedGEjPoXI), WedgeAffinity.Start);
        }
        if (iOrdinal == 2) {
            return i2 > i3 ? CursorAndWedgeAffinity.m3726constructorimpl(TextRange.m10541getEndimpl(jM3713mapToTransformedGEjPoXI), WedgeAffinity.Start) : CursorAndWedgeAffinity.m3726constructorimpl(TextRange.m10546getStartimpl(jM3713mapToTransformedGEjPoXI), WedgeAffinity.End);
        }
        if (iOrdinal == 3) {
            return CursorAndWedgeAffinity.m3725constructorimpl(i2);
        }
        throw new i();
    }
}
