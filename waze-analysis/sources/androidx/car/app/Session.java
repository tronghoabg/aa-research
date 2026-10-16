package androidx.car.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class Session implements LifecycleOwner {
    private CarContext mCarContext;
    private final LifecycleObserver mLifecycleObserver;
    private LifecycleRegistry mRegistry;
    final LifecycleRegistry mRegistryPublic;

    /* compiled from: WazeSource */
    class LifecycleObserverImpl implements DefaultLifecycleObserver {
        LifecycleObserverImpl() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(LifecycleOwner lifecycleOwner) {
            Session.this.mRegistryPublic.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            Session.this.mRegistryPublic.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
            lifecycleOwner.getLifecycle().removeObserver(this);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(LifecycleOwner lifecycleOwner) {
            Session.this.mRegistryPublic.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner lifecycleOwner) {
            Session.this.mRegistryPublic.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(LifecycleOwner lifecycleOwner) {
            Session.this.mRegistryPublic.handleLifecycleEvent(Lifecycle.Event.ON_START);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(LifecycleOwner lifecycleOwner) {
            Session.this.mRegistryPublic.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        }
    }

    public Session() {
        LifecycleObserverImpl lifecycleObserverImpl = new LifecycleObserverImpl();
        this.mLifecycleObserver = lifecycleObserverImpl;
        this.mRegistry = new LifecycleRegistry(this);
        this.mRegistryPublic = new LifecycleRegistry(this);
        this.mRegistry.addObserver(lifecycleObserverImpl);
        this.mCarContext = CarContext.create(this.mRegistry);
    }

    void configure(Context context, HandshakeInfo handshakeInfo, HostInfo hostInfo, ICarHost iCarHost, Configuration configuration) {
        this.mCarContext.updateHandshakeInfo(handshakeInfo);
        this.mCarContext.updateHostInfo(hostInfo);
        this.mCarContext.attachBaseContext(context, configuration);
        this.mCarContext.setCarHost(iCarHost);
    }

    public final CarContext getCarContext() {
        return (CarContext) Objects.requireNonNull(this.mCarContext);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mRegistryPublic;
    }

    Lifecycle getLifecycleInternal() {
        return this.mRegistry;
    }

    void handleLifecycleEvent(Lifecycle.Event event) {
        this.mRegistry.handleLifecycleEvent(event);
    }

    void onCarConfigurationChangedInternal(Configuration configuration) {
        this.mCarContext.onCarConfigurationChanged(configuration);
        onCarConfigurationChanged(this.mCarContext.getResources().getConfiguration());
    }

    public abstract Screen onCreateScreen(Intent intent);

    public void setCarContextInternal(CarContext carContext) {
        this.mCarContext = carContext;
    }

    public void setLifecycleRegistryInternal(LifecycleRegistry lifecycleRegistry) {
        this.mRegistry = lifecycleRegistry;
        lifecycleRegistry.addObserver(this.mLifecycleObserver);
    }

    public void onCarConfigurationChanged(Configuration configuration) {
    }

    public void onNewIntent(Intent intent) {
    }
}
