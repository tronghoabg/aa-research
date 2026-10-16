package androidx.car.app.media;

import android.support.v4.media.session.MediaSessionCompat;
import androidx.car.app.CarContext;
import androidx.car.app.HostDispatcher;
import androidx.car.app.managers.Manager;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.ThreadUtils;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import defpackage.s0;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class MediaPlaybackManager implements Manager {
    private final HostDispatcher mHostDispatcher;

    public MediaPlaybackManager(CarContext carContext, HostDispatcher hostDispatcher, final Lifecycle lifecycle) {
        Objects.requireNonNull(carContext);
        Objects.requireNonNull(hostDispatcher);
        this.mHostDispatcher = hostDispatcher;
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: androidx.car.app.media.MediaPlaybackManager.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                lifecycle.removeObserver(this);
            }
        });
    }

    public static MediaPlaybackManager create(CarContext carContext, HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        Objects.requireNonNull(carContext);
        Objects.requireNonNull(hostDispatcher);
        Objects.requireNonNull(lifecycle);
        return new MediaPlaybackManager(carContext, hostDispatcher, lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$registerMediaPlaybackToken$0(Bundleable bundleable, IMediaPlaybackHost iMediaPlaybackHost) {
        iMediaPlaybackHost.registerMediaSessionToken(bundleable);
        return null;
    }

    public void registerMediaPlaybackToken(MediaSessionCompat.Token token) {
        ThreadUtils.checkMainThread();
        try {
            this.mHostDispatcher.dispatch(CarContext.MEDIA_PLAYBACK_SERVICE, "registerMediaSessionToken", new s0(Bundleable.create(token), 1));
        } catch (BundlerException e) {
            throw new IllegalArgumentException("Serialization failure", e);
        }
    }
}
