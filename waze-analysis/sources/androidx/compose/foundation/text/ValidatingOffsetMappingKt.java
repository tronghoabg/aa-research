package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ValidatingOffsetMappingKt {
    private static final OffsetMapping ValidatingEmptyOffsetMappingIdentity = new ValidatingOffsetMapping(OffsetMapping.Companion.getIdentity(), 0, 0);

    public static final TransformedText filterWithValidation(VisualTransformation visualTransformation, AnnotatedString annotatedString) {
        TransformedText transformedTextFilter = visualTransformation.filter(annotatedString);
        throwIfNotValidTransform$default(transformedTextFilter, annotatedString.length(), 0, 2, null);
        return new TransformedText(transformedTextFilter.getText(), new ValidatingOffsetMapping(transformedTextFilter.getOffsetMapping(), annotatedString.length(), transformedTextFilter.getText().length()));
    }

    public static final OffsetMapping getValidatingEmptyOffsetMappingIdentity() {
        return ValidatingEmptyOffsetMappingIdentity;
    }

    public static final void throwIfNotValidTransform(TransformedText transformedText, int i2, int i3) {
        int length = transformedText.getText().length();
        int iMin = Math.min(i2, i3);
        for (int i4 = 0; i4 < iMin; i4++) {
            validateOriginalToTransformed(transformedText.getOffsetMapping().originalToTransformed(i4), length, i4);
        }
        validateOriginalToTransformed(transformedText.getOffsetMapping().originalToTransformed(i2), length, i2);
        int iMin2 = Math.min(length, i3);
        for (int i5 = 0; i5 < iMin2; i5++) {
            validateTransformedToOriginal(transformedText.getOffsetMapping().transformedToOriginal(i5), i2, i5);
        }
        validateTransformedToOriginal(transformedText.getOffsetMapping().transformedToOriginal(length), i2, length);
    }

    public static /* synthetic */ void throwIfNotValidTransform$default(TransformedText transformedText, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 100;
        }
        throwIfNotValidTransform(transformedText, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOriginalToTransformed(int i2, int i3, int i4) {
        if (i2 < 0 || i2 > i3) {
            InlineClassHelperKt.throwIllegalStateException("OffsetMapping.originalToTransformed returned invalid mapping: " + i4 + " -> " + i2 + " is not in range of transformed text [0, " + i3 + ']');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateTransformedToOriginal(int i2, int i3, int i4) {
        if (i2 < 0 || i2 > i3) {
            InlineClassHelperKt.throwIllegalStateException("OffsetMapping.transformedToOriginal returned invalid mapping: " + i4 + " -> " + i2 + " is not in range of original text [0, " + i3 + ']');
        }
    }
}
