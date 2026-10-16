package androidx.compose.ui.platform;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class Api30Impl {
    public static final Api30Impl INSTANCE = new Api30Impl();

    private Api30Impl() {
    }

    public final boolean isShowingLayoutBounds(View view) {
        return view.isShowingLayoutBounds();
    }
}
