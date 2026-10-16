package androidx.car.app.media;

import android.support.v4.media.a.u;
import androidx.car.app.CarContext;
import androidx.car.app.HostCall;
import androidx.car.app.HostDispatcher;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.managers.Manager;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.ThreadUtils;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import h.g.b.x;
import j$.util.Objects;

/* compiled from: WazeSource */
@RequiresCarApi(8)
/* loaded from: classes2.dex */
public class MediaPlaybackManager implements Manager {
    private final HostDispatcher mHostDispatcher;

    protected MediaPlaybackManager(CarContext carContext, HostDispatcher hostDispatcher, final Lifecycle lifecycle) {
        Objects.requireNonNull(carContext);
        this.mHostDispatcher = (HostDispatcher) Objects.requireNonNull(hostDispatcher);
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: androidx.car.app.media.MediaPlaybackManager.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                x.f(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                lifecycle.removeObserver(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                x.f(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                x.f(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                x.f(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                x.f(lifecycleOwner, "owner");
            }
        });
    }

    public static MediaPlaybackManager create(CarContext carContext, HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        Objects.requireNonNull(carContext);
        Objects.requireNonNull(hostDispatcher);
        Objects.requireNonNull(lifecycle);
        return new MediaPlaybackManager(carContext, hostDispatcher, lifecycle);
    }

    static /* synthetic */ Object lambda$registerMediaPlaybackToken$0(Bundleable bundleable, IMediaPlaybackHost iMediaPlaybackHost) {
        iMediaPlaybackHost.registerMediaSessionToken(bundleable);
        return null;
    }

    public void registerMediaPlaybackToken(u uVar) {
        ThreadUtils.checkMainThread();
        try {
            final Bundleable bundleableCreate = Bundleable.create(uVar);
            this.mHostDispatcher.dispatch(CarContext.MEDIA_PLAYBACK_SERVICE, "registerMediaSessionToken", new HostCall() { // from class: androidx.car.app.media.MediaPlaybackManager$$ExternalSyntheticLambda0
                @Override // androidx.car.app.HostCall
                public final Object dispatch(Object obj) {
                    MediaPlaybackManager.lambda$registerMediaPlaybackToken$0(bundleableCreate, (IMediaPlaybackHost) obj);
                    return null;
                }
            });
        } catch (BundlerException e2) {
            throw new IllegalArgumentException("Serialization failure", e2);
        }
    }
}
