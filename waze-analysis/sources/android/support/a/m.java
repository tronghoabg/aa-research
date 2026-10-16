package android.support.a;

import android.os.Bundle;
import android.os.IInterface;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface m extends IInterface {
    int getInterfaceVersion();

    void onGreatestScrollPercentageIncreased(int i2, Bundle bundle);

    void onSessionEnded(boolean z, Bundle bundle);

    void onVerticalScrollEvent(boolean z, Bundle bundle);
}
