package android.support.a;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface j extends IInterface {
    Bundle extraCommand(String str, Bundle bundle);

    int getInterfaceVersion();

    boolean isEngagementSignalsApiAvailable(f fVar, Bundle bundle);

    boolean mayLaunchUrl(f fVar, Uri uri, Bundle bundle, List<Bundle> list);

    boolean newAuthTabSession(c cVar, Bundle bundle);

    boolean newSession(f fVar);

    boolean newSessionWithExtras(f fVar, Bundle bundle);

    int postMessage(f fVar, String str, Bundle bundle);

    void prefetch(f fVar, Uri uri, Bundle bundle);

    void prefetchWithMultipleUrls(f fVar, List<Uri> list, Bundle bundle);

    boolean receiveFile(f fVar, Uri uri, int i2, Bundle bundle);

    boolean requestPostMessageChannel(f fVar, Uri uri);

    boolean requestPostMessageChannelWithExtras(f fVar, Uri uri, Bundle bundle);

    boolean setEngagementSignalsCallback(f fVar, IBinder iBinder, Bundle bundle);

    boolean updateVisuals(f fVar, Bundle bundle);

    boolean validateRelationship(f fVar, int i2, Uri uri, Bundle bundle);

    boolean warmup(long j2);
}
