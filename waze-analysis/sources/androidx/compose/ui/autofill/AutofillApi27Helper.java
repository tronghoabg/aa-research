package androidx.compose.ui.autofill;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AutofillApi27Helper {
    public static final int $stable = 0;
    public static final AutofillApi27Helper INSTANCE = new AutofillApi27Helper();

    private AutofillApi27Helper() {
    }

    public final void notifyViewVisibilityChanged(View view, android.view.autofill.AutofillManager autofillManager, int i2, boolean z) {
        autofillManager.notifyViewVisibilityChanged(view, i2, z);
    }
}
