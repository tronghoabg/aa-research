package android.support.v4.media.a;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.KeyEvent;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Set f408a;

    /* renamed from: b, reason: collision with root package name */
    private final k f409b;

    public r(Context context, u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f408a = DesugarCollections.synchronizedSet(new HashSet());
        this.f409b = new l(context, uVar);
    }

    public final MediaMetadataCompat a() {
        MediaMetadata metadata = this.f409b.f402a.getMetadata();
        if (metadata != null) {
            return MediaMetadataCompat.fromMediaMetadata(metadata);
        }
        return null;
    }

    public final m b() {
        return new q(this.f409b.f402a.getTransportControls());
    }

    public final z c() {
        k kVar = this.f409b;
        u uVar = kVar.f404c;
        if (uVar.a() != null) {
            try {
                return uVar.a().a();
            } catch (RemoteException e2) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e2);
            }
        }
        PlaybackState playbackState = kVar.f402a.getPlaybackState();
        if (playbackState == null) {
            return null;
        }
        return z.e(playbackState);
    }

    public final void d(h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!this.f408a.add(hVar)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        hVar.d(handler);
        this.f409b.b(hVar, handler);
    }

    public final void e(h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!this.f408a.remove(hVar)) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            this.f409b.c(hVar);
        } finally {
            hVar.d(null);
        }
    }

    public final void f(KeyEvent keyEvent) {
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        this.f409b.f402a.dispatchMediaButtonEvent(keyEvent);
    }
}
