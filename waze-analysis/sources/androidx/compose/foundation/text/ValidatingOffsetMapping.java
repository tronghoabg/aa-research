package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.OffsetMapping;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ValidatingOffsetMapping implements OffsetMapping {
    private final OffsetMapping delegate;
    private final int originalLength;
    private final int transformedLength;

    public ValidatingOffsetMapping(OffsetMapping offsetMapping, int i2, int i3) {
        this.delegate = offsetMapping;
        this.originalLength = i2;
        this.transformedLength = i3;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int originalToTransformed(int i2) {
        int iOriginalToTransformed = this.delegate.originalToTransformed(i2);
        if (i2 >= 0 && i2 <= this.originalLength) {
            ValidatingOffsetMappingKt.validateOriginalToTransformed(iOriginalToTransformed, this.transformedLength, i2);
        }
        return iOriginalToTransformed;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int transformedToOriginal(int i2) {
        int iTransformedToOriginal = this.delegate.transformedToOriginal(i2);
        if (i2 >= 0 && i2 <= this.transformedLength) {
            ValidatingOffsetMappingKt.validateTransformedToOriginal(iTransformedToOriginal, this.originalLength, i2);
        }
        return iTransformedToOriginal;
    }
}
