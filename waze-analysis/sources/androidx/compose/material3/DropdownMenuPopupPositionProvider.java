package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.window.PopupPositionProvider;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface DropdownMenuPopupPositionProvider extends PopupPositionProvider {
    MutableState<TransformOrigin> getTransformOriginState();
}
