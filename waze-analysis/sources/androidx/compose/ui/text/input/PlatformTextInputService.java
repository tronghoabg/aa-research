package androidx.compose.ui.text.input;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.text.TextLayoutResult;
import h.ab;
import h.g.a.l;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PlatformTextInputService {
    void hideSoftwareKeyboard();

    void notifyFocusedRect(Rect rect);

    void showSoftwareKeyboard();

    void startInput();

    void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, l<? super List<? extends EditCommand>, ab> lVar, l<? super ImeAction, ab> lVar2);

    void stopInput();

    void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2);

    void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, l<? super Matrix, ab> lVar, Rect rect, Rect rect2);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.text.input.PlatformTextInputService$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$startInput(PlatformTextInputService platformTextInputService) {
        }

        public static void $default$notifyFocusedRect(PlatformTextInputService platformTextInputService, Rect rect) {
        }

        public static void $default$updateTextLayoutResult(PlatformTextInputService platformTextInputService, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, l lVar, Rect rect, Rect rect2) {
        }
    }
}
