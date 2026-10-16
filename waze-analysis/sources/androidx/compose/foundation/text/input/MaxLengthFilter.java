package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MaxLengthFilter implements InputTransformation {
    private final int maxLength;

    public MaxLengthFilter(int i2) {
        this.maxLength = i2;
        if (i2 >= 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("maxLength must be at least zero");
    }

    private final int component1() {
        return this.maxLength;
    }

    public static /* synthetic */ MaxLengthFilter copy$default(MaxLengthFilter maxLengthFilter, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = maxLengthFilter.maxLength;
        }
        return maxLengthFilter.copy(i2);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setMaxTextLength(semanticsPropertyReceiver, this.maxLength);
    }

    public final MaxLengthFilter copy(int i2) {
        return new MaxLengthFilter(i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MaxLengthFilter) && this.maxLength == ((MaxLengthFilter) obj).maxLength;
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public /* synthetic */ KeyboardOptions getKeyboardOptions() {
        return null;
    }

    public int hashCode() {
        return this.maxLength;
    }

    public String toString() {
        return "InputTransformation.maxLength(" + this.maxLength + ')';
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.getLength() > this.maxLength) {
            textFieldBuffer.revertAllChanges();
        }
    }
}
