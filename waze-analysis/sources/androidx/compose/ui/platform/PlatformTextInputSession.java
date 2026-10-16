package androidx.compose.ui.platform;

import android.view.View;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PlatformTextInputSession {
    View getView();

    Object startInputMethod(PlatformTextInputMethodRequest platformTextInputMethodRequest, e<?> eVar);
}
