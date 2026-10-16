package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillValue;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PlatformAutofillManager {
    void cancel();

    void commit();

    void notifyValueChanged(View view, int i2, AutofillValue autofillValue);

    void notifyViewEntered(View view, int i2, Rect rect);

    void notifyViewExited(View view, int i2);

    void notifyViewVisibilityChanged(View view, int i2, boolean z);

    void requestAutofill(View view, int i2, Rect rect);
}
