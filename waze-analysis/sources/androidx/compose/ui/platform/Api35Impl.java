package androidx.compose.ui.platform;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class Api35Impl {
    public static final Api35Impl INSTANCE = new Api35Impl();

    private Api35Impl() {
    }

    public static final void setRequestedFrameRate(View view, float f2) {
        view.setRequestedFrameRate(f2);
    }
}
