package android.support.v4.media;

import android.media.browse.MediaBrowser;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes2.dex */
public class d {
    final MediaBrowser.ConnectionCallback mConnectionCallbackFwk = new b(this);
    c mConnectionCallbackInternal;

    void setInternalConnectionCallback(c cVar) {
        this.mConnectionCallbackInternal = cVar;
    }

    public void onConnected() {
    }

    public void onConnectionFailed() {
    }

    public void onConnectionSuspended() {
    }
}
