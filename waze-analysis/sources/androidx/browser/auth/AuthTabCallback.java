package androidx.browser.auth;

import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface AuthTabCallback {
    void onExtraCallback(String str, Bundle bundle);

    Bundle onExtraCallbackWithResult(String str, Bundle bundle);

    void onNavigationEvent(int i2, Bundle bundle);

    void onWarmupCompleted(Bundle bundle);
}
