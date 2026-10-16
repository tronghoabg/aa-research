package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.TextRange;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TransformedTextFieldStateKt {
    public static final <R> R getIndexTransformationType(TransformedTextFieldState transformedTextFieldState, int i2, q<? super IndexTransformationType, ? super TextRange, ? super TextRange, ? extends R> qVar) {
        long jM3710mapFromTransformedjx7JFs = transformedTextFieldState.m3710mapFromTransformedjx7JFs(i2);
        long jM3713mapToTransformedGEjPoXI = transformedTextFieldState.m3713mapToTransformedGEjPoXI(jM3710mapFromTransformedjx7JFs);
        return qVar.invoke((TextRange.m10540getCollapsedimpl(jM3710mapFromTransformedjx7JFs) && TextRange.m10540getCollapsedimpl(jM3713mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m10540getCollapsedimpl(jM3710mapFromTransformedjx7JFs) || TextRange.m10540getCollapsedimpl(jM3713mapToTransformedGEjPoXI)) ? (!TextRange.m10540getCollapsedimpl(jM3710mapFromTransformedjx7JFs) || TextRange.m10540getCollapsedimpl(jM3713mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement, TextRange.m10534boximpl(jM3710mapFromTransformedjx7JFs), TextRange.m10534boximpl(jM3713mapToTransformedGEjPoXI));
    }
}
