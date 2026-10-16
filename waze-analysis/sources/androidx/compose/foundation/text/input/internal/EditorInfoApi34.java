package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.core.view.DisplayCompat$$ExternalSyntheticApiModelOutline1;
import e.c.d.a;
import h.a.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class EditorInfoApi34 {
    public static final EditorInfoApi34 INSTANCE = new EditorInfoApi34();

    private EditorInfoApi34() {
    }

    public final void setHandwritingGestures(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(i.i(DisplayCompat$$ExternalSyntheticApiModelOutline1.m11799m$1(), DisplayCompat$$ExternalSyntheticApiModelOutline1.m$4(), DisplayCompat$$ExternalSyntheticApiModelOutline1.m$2(), DisplayCompat$$ExternalSyntheticApiModelOutline1.m$3(), DisplayCompat$$ExternalSyntheticApiModelOutline1.m$5(), DisplayCompat$$ExternalSyntheticApiModelOutline1.m$6(), DisplayCompat$$ExternalSyntheticApiModelOutline1.m$7()));
        editorInfo.setSupportedHandwritingGesturePreviews(a.r(DisplayCompat$$ExternalSyntheticApiModelOutline1.m11799m$1(), DisplayCompat$$ExternalSyntheticApiModelOutline1.m$4(), DisplayCompat$$ExternalSyntheticApiModelOutline1.m$2(), DisplayCompat$$ExternalSyntheticApiModelOutline1.m$3()));
    }
}
