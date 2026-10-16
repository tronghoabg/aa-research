package androidx.compose.ui.semantics;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class InputTextSuggestionState {
    public static final int $stable = 0;
    private final boolean isCommittedByInputMethodEditor;

    public /* synthetic */ InputTextSuggestionState(boolean z, int i2, o oVar) {
        this(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputTextSuggestionState) && this.isCommittedByInputMethodEditor == ((InputTextSuggestionState) obj).isCommittedByInputMethodEditor;
    }

    public int hashCode() {
        return InputTextSuggestionState$$ExternalSyntheticBackport0.m(this.isCommittedByInputMethodEditor) * 31;
    }

    public final boolean isCommittedByInputMethodEditor() {
        return this.isCommittedByInputMethodEditor;
    }

    public String toString() {
        return "InputTextSuggestionState(isCommittedByInputMethodEditor=" + this.isCommittedByInputMethodEditor;
    }

    public InputTextSuggestionState(boolean z) {
        this.isCommittedByInputMethodEditor = z;
    }

    public InputTextSuggestionState() {
        this(false, 1, null);
    }
}
