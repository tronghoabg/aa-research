package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class InputTransformationByValue implements InputTransformation {
    private final p<CharSequence, CharSequence, CharSequence> transformation;

    /* JADX WARN: Multi-variable type inference failed */
    public InputTransformationByValue(p<? super CharSequence, ? super CharSequence, ? extends CharSequence> pVar) {
        this.transformation = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputTransformationByValue copy$default(InputTransformationByValue inputTransformationByValue, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = inputTransformationByValue.transformation;
        }
        return inputTransformationByValue.copy(pVar);
    }

    public final p<CharSequence, CharSequence, CharSequence> component1() {
        return this.transformation;
    }

    public final InputTransformationByValue copy(p<? super CharSequence, ? super CharSequence, ? extends CharSequence> pVar) {
        return new InputTransformationByValue(pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputTransformationByValue) && x.n(this.transformation, ((InputTransformationByValue) obj).transformation);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public /* synthetic */ KeyboardOptions getKeyboardOptions() {
        return null;
    }

    public final p<CharSequence, CharSequence, CharSequence> getTransformation() {
        return this.transformation;
    }

    public int hashCode() {
        return this.transformation.hashCode();
    }

    public String toString() {
        return "InputTransformation.byValue(transformation=" + this.transformation + ')';
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(TextFieldBuffer textFieldBuffer) {
        TextFieldCharSequence textFieldCharSequenceM3472toTextFieldCharSequencewFTz33Y$foundation$default = TextFieldBuffer.m3472toTextFieldCharSequencewFTz33Y$foundation$default(textFieldBuffer, 0L, null, null, null, 15, null);
        CharSequence charSequenceInvoke = this.transformation.invoke(textFieldBuffer.getOriginalValue$foundation(), textFieldCharSequenceM3472toTextFieldCharSequencewFTz33Y$foundation$default);
        if (charSequenceInvoke == textFieldCharSequenceM3472toTextFieldCharSequencewFTz33Y$foundation$default) {
            return;
        }
        if (charSequenceInvoke == textFieldBuffer.getOriginalValue$foundation()) {
            textFieldBuffer.revertAllChanges();
        } else {
            textFieldBuffer.setTextIfChanged$foundation(charSequenceInvoke);
        }
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public /* synthetic */ void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }
}
