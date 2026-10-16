package android.support.a;

import android.os.Bundle;
import android.os.IInterface;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface c extends IInterface {
    int getInterfaceVersion();

    void onExtraCallback(String str, Bundle bundle);

    Bundle onExtraCallbackWithResult(String str, Bundle bundle);

    void onNavigationEvent(int i2, Bundle bundle);

    void onWarmupCompleted(Bundle bundle);
}
