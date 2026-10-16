package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.util.Log;
import androidx.car.app.ICarApp;
import androidx.car.app.navigation.NavigationManager;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.LogTags;
import androidx.car.app.utils.RemoteUtils;
import androidx.car.app.utils.ThreadUtils;
import androidx.car.app.validation.HostValidator;
import androidx.car.app.versioning.CarAppApiLevels;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import defpackage.ad;
import java.security.InvalidParameterException;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
final class CarAppBinder extends ICarApp.Stub {
    private Session mCurrentSession;
    private final SessionInfo mCurrentSessionInfo;
    private HandshakeInfo mHandshakeInfo;
    private HostValidator mHostValidator;
    private CarAppService mService;

    public CarAppBinder(CarAppService carAppService, SessionInfo sessionInfo) {
        this.mService = carAppService;
        this.mCurrentSessionInfo = sessionInfo;
    }

    private Lifecycle getCurrentLifecycle() {
        Session session = this.mCurrentSession;
        if (session == null) {
            return null;
        }
        return session.getLifecycle();
    }

    private HostValidator getHostValidator() {
        if (this.mHostValidator == null) {
            CarAppService carAppService = this.mService;
            Objects.requireNonNull(carAppService);
            this.mHostValidator = carAppService.createHostValidator();
        }
        return this.mHostValidator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getManager$7(String str, IOnDoneCallback iOnDoneCallback) {
        Session session = this.mCurrentSession;
        Objects.requireNonNull(session);
        str.getClass();
        if (str.equals(CarContext.APP_SERVICE)) {
            RemoteUtils.sendSuccessResponseToHost(iOnDoneCallback, "getManager", ((AppManager) session.getCarContext().getCarService(AppManager.class)).getIInterface());
        } else if (str.equals("navigation")) {
            RemoteUtils.sendSuccessResponseToHost(iOnDoneCallback, "getManager", ((NavigationManager) session.getCarContext().getCarService(NavigationManager.class)).getIInterface());
        } else {
            RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "getManager", new InvalidParameterException(str.concat(" is not a valid manager type")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppCreate$0(ICarHost iCarHost, Configuration configuration, Intent intent) {
        CarAppService carAppService = this.mService;
        Objects.requireNonNull(carAppService);
        Session sessionOnCreateSession = this.mCurrentSession;
        if (sessionOnCreateSession == null || sessionOnCreateSession.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            SessionInfo sessionInfo = this.mCurrentSessionInfo;
            Objects.requireNonNull(sessionInfo);
            sessionOnCreateSession = carAppService.onCreateSession(sessionInfo);
            this.mCurrentSession = sessionOnCreateSession;
        }
        HandshakeInfo handshakeInfo = getHandshakeInfo();
        Objects.requireNonNull(handshakeInfo);
        HostInfo hostInfo = carAppService.getHostInfo();
        Objects.requireNonNull(hostInfo);
        sessionOnCreateSession.configure(carAppService, handshakeInfo, hostInfo, iCarHost, configuration);
        LifecycleRegistry lifecycleRegistry = (LifecycleRegistry) sessionOnCreateSession.getLifecycle();
        Lifecycle.State currentState = lifecycleRegistry.getCurrentState();
        int size = ((ScreenManager) sessionOnCreateSession.getCarContext().getCarService(ScreenManager.class)).getScreenStackInternal().size();
        if (currentState.isAtLeast(Lifecycle.State.CREATED) && size >= 1) {
            Log.isLoggable(LogTags.TAG, 3);
            onNewIntentInternal(sessionOnCreateSession, intent);
            return null;
        }
        if (Log.isLoggable(LogTags.TAG, 3)) {
            Objects.toString(lifecycleRegistry.getCurrentState());
        }
        sessionOnCreateSession.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        ((ScreenManager) sessionOnCreateSession.getCarContext().getCarService(ScreenManager.class)).push(sessionOnCreateSession.onCreateScreen(intent));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppPause$3() {
        Session session = this.mCurrentSession;
        Objects.requireNonNull(session);
        session.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppResume$2() {
        Session session = this.mCurrentSession;
        Objects.requireNonNull(session);
        session.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppStart$1() {
        Session session = this.mCurrentSession;
        Objects.requireNonNull(session);
        session.handleLifecycleEvent(Lifecycle.Event.ON_START);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppStop$4() {
        Session session = this.mCurrentSession;
        Objects.requireNonNull(session);
        session.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onConfigurationChanged$6(Configuration configuration) {
        Session session = this.mCurrentSession;
        Objects.requireNonNull(session);
        onConfigurationChangedInternal(session, configuration);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onNewIntent$5(Intent intent) {
        Session session = this.mCurrentSession;
        Objects.requireNonNull(session);
        onNewIntentInternal(session, intent);
        return null;
    }

    private void onConfigurationChangedInternal(Session session, Configuration configuration) {
        ThreadUtils.checkMainThread();
        if (Log.isLoggable(LogTags.TAG, 3)) {
            Objects.toString(configuration);
        }
        session.onCarConfigurationChangedInternal(configuration);
    }

    private void onNewIntentInternal(Session session, Intent intent) {
        ThreadUtils.checkMainThread();
        session.onNewIntent(intent);
    }

    public void destroy() {
        onDestroyLifecycle();
        this.mCurrentSession = null;
        this.mHostValidator = null;
        this.mHandshakeInfo = null;
        this.mService = null;
    }

    @Override // androidx.car.app.ICarApp
    public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
        try {
            CarAppService carAppService = this.mService;
            Objects.requireNonNull(carAppService);
            RemoteUtils.sendSuccessResponseToHost(iOnDoneCallback, "getAppInfo", carAppService.getAppInfo());
        } catch (IllegalArgumentException e) {
            RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "getAppInfo", e);
        }
    }

    public CarAppService getCarAppService() {
        return this.mService;
    }

    public Session getCurrentSession() {
        return this.mCurrentSession;
    }

    public SessionInfo getCurrentSessionInfo() {
        return this.mCurrentSessionInfo;
    }

    public HandshakeInfo getHandshakeInfo() {
        return this.mHandshakeInfo;
    }

    @Override // androidx.car.app.ICarApp
    public void getManager(String str, IOnDoneCallback iOnDoneCallback) {
        ThreadUtils.runOnMain(new e(this, str, iOnDoneCallback, 0));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppCreate(final ICarHost iCarHost, final Intent intent, final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        if (Log.isLoggable(LogTags.TAG, 3)) {
            Objects.toString(intent);
        }
        RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onAppCreate", new RemoteUtils.HostCall() { // from class: androidx.car.app.d
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                return this.a.lambda$onAppCreate$0(iCarHost, configuration, intent);
            }
        });
        Log.isLoggable(LogTags.TAG, 3);
    }

    @Override // androidx.car.app.ICarApp
    public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppPause", new c(this, 0));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppResume", new c(this, 3));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppStart", new c(this, 1));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppStop", new c(this, 2));
    }

    public void onAutoDriveEnabled() {
        Session session = this.mCurrentSession;
        if (session != null) {
            ((NavigationManager) session.getCarContext().getCarService(NavigationManager.class)).onAutoDriveEnabled();
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onConfigurationChanged", new b(this, configuration, 0));
    }

    public void onDestroyLifecycle() {
        Session session = this.mCurrentSession;
        if (session != null) {
            session.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        }
        this.mCurrentSession = null;
    }

    @Override // androidx.car.app.ICarApp
    public void onHandshakeCompleted(Bundleable bundleable, IOnDoneCallback iOnDoneCallback) {
        CarAppService carAppService = this.mService;
        Objects.requireNonNull(carAppService);
        try {
            HandshakeInfo handshakeInfo = (HandshakeInfo) bundleable.get();
            String hostPackageName = handshakeInfo.getHostPackageName();
            int callingUid = Binder.getCallingUid();
            HostInfo hostInfo = new HostInfo(hostPackageName, callingUid);
            if (!getHostValidator().isValidHost(hostInfo)) {
                RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "onHandshakeCompleted", new IllegalArgumentException("Unknown host '" + hostPackageName + "', uid:" + callingUid));
                return;
            }
            AppInfo appInfo = carAppService.getAppInfo();
            int minCarAppApiLevel = appInfo.getMinCarAppApiLevel();
            int latestCarAppApiLevel = appInfo.getLatestCarAppApiLevel();
            int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
            if (minCarAppApiLevel > hostCarAppApiLevel) {
                RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "onHandshakeCompleted", new IllegalArgumentException("Host API level (" + hostCarAppApiLevel + ") is less than the app's min API level (" + minCarAppApiLevel + ")"));
                return;
            }
            if (latestCarAppApiLevel >= hostCarAppApiLevel) {
                carAppService.setHostInfo(hostInfo);
                this.mHandshakeInfo = handshakeInfo;
                RemoteUtils.sendSuccessResponseToHost(iOnDoneCallback, "onHandshakeCompleted", null);
            } else {
                RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "onHandshakeCompleted", new IllegalArgumentException("Host API level (" + hostCarAppApiLevel + ") is greater than the app's max API level (" + latestCarAppApiLevel + ")"));
            }
        } catch (BundlerException e) {
            e = e;
            carAppService.setHostInfo(null);
            RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "onHandshakeCompleted", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            carAppService.setHostInfo(null);
            RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "onHandshakeCompleted", e);
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onNewIntent", new b(this, intent, 1));
    }

    public void setHandshakeInfo(HandshakeInfo handshakeInfo) {
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        if (!CarAppApiLevels.isValid(hostCarAppApiLevel)) {
            throw new IllegalArgumentException(ad.b(hostCarAppApiLevel, "Invalid Car App API level received: "));
        }
        this.mHandshakeInfo = handshakeInfo;
    }
}
