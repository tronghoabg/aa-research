package android.support.a;

import android.os.Bundle;
import android.os.IInterface;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface p extends IInterface {
    int getInterfaceVersion();

    void onMessageChannelReady(f fVar, Bundle bundle);

    void onPostMessage(f fVar, String str, Bundle bundle);
}
