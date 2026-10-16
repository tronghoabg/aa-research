package androidx.compose.ui.autofill;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.app.j$$ExternalSyntheticApiModelOutline1;
import android.view.View;
import android.view.autofill.AutofillValue;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PlatformAutofillManagerImpl implements PlatformAutofillManager {
    public static final int $stable = 8;
    private android.view.autofill.AutofillManager _platformAndroidManager;
    private final Context context;

    public PlatformAutofillManagerImpl(Context context) {
        this.context = context;
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void cancel() {
        getPlatformAndroidManager().cancel();
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void commit() {
        getPlatformAndroidManager().commit();
    }

    public final Context getContext() {
        return this.context;
    }

    public final android.view.autofill.AutofillManager getPlatformAndroidManager() {
        android.view.autofill.AutofillManager autofillManager = this._platformAndroidManager;
        if (autofillManager != null) {
            return autofillManager;
        }
        android.view.autofill.AutofillManager autofillManagerM63m = j$$ExternalSyntheticApiModelOutline1.m63m(this.context.getSystemService(j$$ExternalSyntheticApiModelOutline1.m81m$2()));
        if (autofillManagerM63m == null) {
            throw new IllegalStateException("Could not locate AutofillManager from context");
        }
        this._platformAndroidManager = autofillManagerM63m;
        return autofillManagerM63m;
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void notifyValueChanged(View view, int i2, AutofillValue autofillValue) {
        getPlatformAndroidManager().notifyValueChanged(view, i2, autofillValue);
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void notifyViewEntered(View view, int i2, Rect rect) {
        getPlatformAndroidManager().notifyViewEntered(view, i2, rect);
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void notifyViewExited(View view, int i2) {
        getPlatformAndroidManager().notifyViewExited(view, i2);
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void notifyViewVisibilityChanged(View view, int i2, boolean z) {
        AutofillApi27Helper.INSTANCE.notifyViewVisibilityChanged(view, getPlatformAndroidManager(), i2, z);
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void requestAutofill(View view, int i2, Rect rect) {
        getPlatformAndroidManager().requestAutofill(view, i2, rect);
    }
}
