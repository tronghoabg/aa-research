package androidx.media3.exoplayer.upstream.contentsteering;

import android.net.Uri;
import androidx.media3.exoplayer.source.MediaSourceEventListener;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface ContentSteeringTracker {
    boolean excludeCurrentPathway(long j2);

    boolean isActive();

    void start(Uri uri, String str, MediaSourceEventListener.EventDispatcher eventDispatcher);

    void stop();
}
