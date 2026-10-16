package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.StringsHelpers_jvmAndAndroidKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CodepointTransformationKt {
    public static final CodepointTransformation mask(CodepointTransformation.Companion companion, char c2) {
        return new MaskCodepointTransformation(c2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    public static final CharSequence toVisualText(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation, OffsetMappingCalculator offsetMappingCalculator) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        while (i2 < textFieldCharSequence.length()) {
            int iCodePointAt = CodepointHelpers_jvmAndAndroidKt.codePointAt(textFieldCharSequence, i2);
            int iTransform = codepointTransformation.transform(i3, iCodePointAt);
            int iCharCount = CodepointHelpers_jvmAndAndroidKt.charCount(iCodePointAt);
            if (iTransform != iCodePointAt) {
                offsetMappingCalculator.recordEditOperation(sb.length(), sb.length() + iCharCount, CodepointHelpers_jvmAndAndroidKt.charCount(iTransform));
                z = true;
            }
            StringsHelpers_jvmAndAndroidKt.appendCodePointX(sb, iTransform);
            i2 += iCharCount;
            i3++;
        }
        ?? string = sb.toString();
        if (true == z) {
            textFieldCharSequence = string;
        }
        return textFieldCharSequence;
    }
}
