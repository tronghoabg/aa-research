package androidx.compose.ui.autofill;

import android.view.ViewStructure;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AutofillApi28Helper {
    public static final int $stable = 0;
    public static final AutofillApi28Helper INSTANCE = new AutofillApi28Helper();

    private AutofillApi28Helper() {
    }

    public final void setMaxTextLength(ViewStructure viewStructure, int i2) {
        viewStructure.setMaxTextLength(i2);
    }
}
