package androidx.compose.ui.platform;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidComposeViewVerificationHelperMethodsO {
    public static final AndroidComposeViewVerificationHelperMethodsO INSTANCE = new AndroidComposeViewVerificationHelperMethodsO();

    private AndroidComposeViewVerificationHelperMethodsO() {
    }

    public final void focusable(View view, int i2, boolean z) {
        view.setFocusable(i2);
        view.setDefaultFocusHighlightEnabled(z);
    }
}
