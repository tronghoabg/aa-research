package androidx.compose.ui.platform;

import android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidComposeViewTranslationCallbackS {
    public static final int $stable = 0;
    public static final AndroidComposeViewTranslationCallbackS INSTANCE = new AndroidComposeViewTranslationCallbackS();

    private AndroidComposeViewTranslationCallbackS() {
    }

    public final void clearViewTranslationCallback(View view) {
        view.clearViewTranslationCallback();
    }

    public final void setViewTranslationCallback(View view) {
        view.setViewTranslationCallback(bi$$ExternalSyntheticApiModelOutline0.m132m((Object) AndroidComposeViewTranslationCallback.INSTANCE));
    }
}
