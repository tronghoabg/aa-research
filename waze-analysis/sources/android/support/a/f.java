package android.support.a;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface f extends IInterface {
    void extraCallback(String str, Bundle bundle);

    Bundle extraCallbackWithResult(String str, Bundle bundle);

    int getInterfaceVersion();

    void onActivityLayout(int i2, int i3, int i4, int i5, int i6, Bundle bundle);

    void onActivityResized(int i2, int i3, Bundle bundle);

    void onMessageChannelReady(Bundle bundle);

    void onMinimized(Bundle bundle);

    void onNavigationEvent(int i2, Bundle bundle);

    void onPostMessage(String str, Bundle bundle);

    void onRelationshipValidationResult(int i2, Uri uri, boolean z, Bundle bundle);

    void onUnminimized(Bundle bundle);

    void onWarmupCompleted(Bundle bundle);
}
