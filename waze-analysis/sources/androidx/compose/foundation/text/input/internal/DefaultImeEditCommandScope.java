package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.collection.MutableVector;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DefaultImeEditCommandScope implements ImeEditCommandScope {
    public static final int $stable = 8;
    private int batchDepth;
    private TextFieldBuffer batchEditTextFieldBuffer;
    private final MutableVector<l<TextFieldBuffer, ab>> editCommands = new MutableVector<>(new l[16], 0);
    private final TransformedTextFieldState transformedTextFieldState;

    public DefaultImeEditCommandScope(TransformedTextFieldState transformedTextFieldState) {
        this.transformedTextFieldState = transformedTextFieldState;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public boolean beginBatchEdit() {
        this.batchDepth++;
        return true;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public void edit(l<? super TextFieldBuffer, ab> lVar) {
        beginBatchEdit();
        this.editCommands.add(lVar);
        endBatchEdit();
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public boolean endBatchEdit() {
        int i2 = this.batchDepth - 1;
        this.batchDepth = i2;
        if (i2 == 0 && this.editCommands.getSize() != 0) {
            TransformedTextFieldState transformedTextFieldState = this.transformedTextFieldState;
            TextFieldState textFieldState = transformedTextFieldState.textFieldState;
            InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
            textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
            TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
            if (!this.transformedTextFieldState.isTransformed()) {
                this.batchEditTextFieldBuffer = mainBuffer$foundation;
            }
            MutableVector<l<TextFieldBuffer, ab>> mutableVector = this.editCommands;
            l<TextFieldBuffer, ab>[] lVarArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i3 = 0; i3 < size; i3++) {
                lVarArr[i3].invoke(mainBuffer$foundation);
            }
            transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation);
            textFieldState.commitEditAsUser(inputTransformation, false, textFieldEditUndoBehavior);
            textFieldState.setUserCommit(true);
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public int getTransformedLength() {
        TextFieldBuffer textFieldBuffer = this.batchEditTextFieldBuffer;
        return textFieldBuffer != null ? textFieldBuffer.getLength() : this.transformedTextFieldState.getVisualText().length();
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapFromTransformed-GEjPoXI */
    public long mo3512mapFromTransformedGEjPoXI(long j2) {
        return this.transformedTextFieldState.isTransformed() ? this.transformedTextFieldState.m3711mapFromTransformedGEjPoXI(j2) : j2;
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    /* renamed from: mapToTransformed-GEjPoXI */
    public long mo3513mapToTransformedGEjPoXI(long j2) {
        return this.transformedTextFieldState.isTransformed() ? this.transformedTextFieldState.m3713mapToTransformedGEjPoXI(j2) : j2;
    }
}
