package android.support.v4.media;

import android.media.browse.MediaBrowser;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class b extends MediaBrowser.ConnectionCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f447a;

    b(d dVar) {
        this.f447a = dVar;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        d dVar = this.f447a;
        c cVar = dVar.mConnectionCallbackInternal;
        if (cVar != null) {
            cVar.a();
        }
        dVar.onConnected();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        this.f447a.onConnectionFailed();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        d dVar = this.f447a;
        c cVar = dVar.mConnectionCallbackInternal;
        if (cVar != null) {
            cVar.b();
        }
        dVar.onConnectionSuspended();
    }
}
