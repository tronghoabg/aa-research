package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface InputTransformation {
    public static final Companion Companion = Companion.$$INSTANCE;

    void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver);

    KeyboardOptions getKeyboardOptions();

    void transformInput(TextFieldBuffer textFieldBuffer);

    /* compiled from: WazeSource */
    public final class Companion implements InputTransformation {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.foundation.text.input.InputTransformation
        public /* synthetic */ KeyboardOptions getKeyboardOptions() {
            return null;
        }

        @Override // androidx.compose.foundation.text.input.InputTransformation
        public /* synthetic */ void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        }

        @Override // androidx.compose.foundation.text.input.InputTransformation
        public void transformInput(TextFieldBuffer textFieldBuffer) {
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.InputTransformation$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static KeyboardOptions $default$getKeyboardOptions(InputTransformation inputTransformation) {
            return null;
        }

        public static void $default$applySemantics(InputTransformation inputTransformation, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        }
    }
}
