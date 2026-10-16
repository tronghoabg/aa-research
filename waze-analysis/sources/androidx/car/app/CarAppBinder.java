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
import j$.util.Objects;
import java.security.InvalidParameterException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CarAppBinder extends ICarApp.Stub {
    private Session mCurrentSession;
    private final SessionInfo mCurrentSessionInfo;
    private HandshakeInfo mHandshakeInfo;
    private HostValidator mHostValidator;
    private CarAppService mService;

    CarAppBinder(CarAppService carAppService, SessionInfo sessionInfo) {
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
        HostValidator hostValidator = this.mHostValidator;
        if (hostValidator != null) {
            return hostValidator;
        }
        HostValidator hostValidatorCreateHostValidator = ((CarAppService) Objects.requireNonNull(this.mService)).createHostValidator();
        this.mHostValidator = hostValidatorCreateHostValidator;
        return hostValidatorCreateHostValidator;
    }

    private void onConfigurationChangedInternal(Session session, Configuration configuration) {
        ThreadUtils.checkMainThread();
        if (Log.isLoggable(LogTags.TAG, 3)) {
            java.util.Objects.toString(configuration);
            Log.d(LogTags.TAG, "onCarConfigurationChanged configuration: ".concat(String.valueOf(configuration)));
        }
        session.onCarConfigurationChangedInternal(configuration);
    }

    private void onNewIntentInternal(Session session, Intent intent) {
        ThreadUtils.checkMainThread();
        session.onNewIntent(intent);
    }

    void destroy() {
        onDestroyLifecycle();
        this.mCurrentSession = null;
        this.mHostValidator = null;
        this.mHandshakeInfo = null;
        this.mService = null;
    }

    @Override // androidx.car.app.ICarApp
    public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
        try {
            RemoteUtils.sendSuccessResponseToHost(iOnDoneCallback, "getAppInfo", ((CarAppService) Objects.requireNonNull(this.mService)).getAppInfo());
        } catch (IllegalArgumentException e2) {
            RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "getAppInfo", e2);
        }
    }

    CarAppService getCarAppService() {
        return this.mService;
    }

    Session getCurrentSession() {
        return this.mCurrentSession;
    }

    SessionInfo getCurrentSessionInfo() {
        return this.mCurrentSessionInfo;
    }

    HandshakeInfo getHandshakeInfo() {
        return this.mHandshakeInfo;
    }

    @Override // androidx.car.app.ICarApp
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.ICarApp
    public void getManager(final String str, final IOnDoneCallback iOnDoneCallback) {
        ThreadUtils.runOnMain(new Runnable() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1569lambda$getManager$7$androidxcarappCarAppBinder(str, iOnDoneCallback);
            }
        });
    }

    /* renamed from: lambda$getManager$7$androidx-car-app-CarAppBinder, reason: not valid java name */
    /* synthetic */ void m1569lambda$getManager$7$androidxcarappCarAppBinder(String str, IOnDoneCallback iOnDoneCallback) {
        Session session = (Session) Objects.requireNonNull(this.mCurrentSession);
        int iHashCode = str.hashCode();
        if (iHashCode != 96801) {
            if (iHashCode == 1862666772 && str.equals("navigation")) {
                RemoteUtils.sendSuccessResponseToHost(iOnDoneCallback, "getManager", ((NavigationManager) session.getCarContext().getCarService(NavigationManager.class)).getIInterface());
                return;
            }
        } else if (str.equals(CarContext.APP_SERVICE)) {
            RemoteUtils.sendSuccessResponseToHost(iOnDoneCallback, "getManager", ((AppManager) session.getCarContext().getCarService(AppManager.class)).getIInterface());
            return;
        }
        Log.e(LogTags.TAG, String.valueOf(str).concat("%s is not a valid manager"));
        RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "getManager", new InvalidParameterException(String.valueOf(str).concat(" is not a valid manager type")));
    }

    /* renamed from: lambda$onAppCreate$0$androidx-car-app-CarAppBinder, reason: not valid java name */
    /* synthetic */ Object m1570lambda$onAppCreate$0$androidxcarappCarAppBinder(ICarHost iCarHost, Configuration configuration, Intent intent) {
        CarAppService carAppService = (CarAppService) Objects.requireNonNull(this.mService);
        Session sessionOnCreateSession = this.mCurrentSession;
        if (sessionOnCreateSession == null || sessionOnCreateSession.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            sessionOnCreateSession = carAppService.onCreateSession((SessionInfo) Objects.requireNonNull(this.mCurrentSessionInfo));
            this.mCurrentSession = sessionOnCreateSession;
        }
        Session session = sessionOnCreateSession;
        session.configure(carAppService, (HandshakeInfo) Objects.requireNonNull(getHandshakeInfo()), (HostInfo) Objects.requireNonNull(carAppService.getHostInfo()), iCarHost, configuration);
        LifecycleRegistry lifecycleRegistry = (LifecycleRegistry) session.getLifecycle();
        Lifecycle.State currentState = lifecycleRegistry.getCurrentState();
        int size = ((ScreenManager) session.getCarContext().getCarService(ScreenManager.class)).getScreenStackInternal().size();
        if (currentState.isAtLeast(Lifecycle.State.CREATED) && size > 0) {
            if (Log.isLoggable(LogTags.TAG, 3)) {
                Log.d(LogTags.TAG, "onAppCreate the app was already created");
            }
            onNewIntentInternal(session, intent);
            return null;
        }
        if (Log.isLoggable(LogTags.TAG, 3)) {
            Log.d(LogTags.TAG, "onAppCreate the app was not yet created or the screen stack was empty state: " + lifecycleRegistry.getCurrentState() + ", stack size: " + size);
        }
        session.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        ((ScreenManager) session.getCarContext().getCarService(ScreenManager.class)).push(session.onCreateScreen(intent));
        return null;
    }

    /* renamed from: lambda$onAppPause$3$androidx-car-app-CarAppBinder, reason: not valid java name */
    /* synthetic */ Object m1571lambda$onAppPause$3$androidxcarappCarAppBinder() {
        ((Session) Objects.requireNonNull(this.mCurrentSession)).handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        return null;
    }

    /* renamed from: lambda$onAppResume$2$androidx-car-app-CarAppBinder, reason: not valid java name */
    /* synthetic */ Object m1572lambda$onAppResume$2$androidxcarappCarAppBinder() {
        ((Session) Objects.requireNonNull(this.mCurrentSession)).handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        return null;
    }

    /* renamed from: lambda$onAppStart$1$androidx-car-app-CarAppBinder, reason: not valid java name */
    /* synthetic */ Object m1573lambda$onAppStart$1$androidxcarappCarAppBinder() {
        ((Session) Objects.requireNonNull(this.mCurrentSession)).handleLifecycleEvent(Lifecycle.Event.ON_START);
        return null;
    }

    /* renamed from: lambda$onAppStop$4$androidx-car-app-CarAppBinder, reason: not valid java name */
    /* synthetic */ Object m1574lambda$onAppStop$4$androidxcarappCarAppBinder() {
        ((Session) Objects.requireNonNull(this.mCurrentSession)).handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        return null;
    }

    /* renamed from: lambda$onConfigurationChanged$6$androidx-car-app-CarAppBinder, reason: not valid java name */
    /* synthetic */ Object m1575lambda$onConfigurationChanged$6$androidxcarappCarAppBinder(Configuration configuration) {
        onConfigurationChangedInternal((Session) Objects.requireNonNull(this.mCurrentSession), configuration);
        return null;
    }

    /* renamed from: lambda$onNewIntent$5$androidx-car-app-CarAppBinder, reason: not valid java name */
    /* synthetic */ Object m1576lambda$onNewIntent$5$androidxcarappCarAppBinder(Intent intent) {
        onNewIntentInternal((Session) Objects.requireNonNull(this.mCurrentSession), intent);
        return null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppCreate(final ICarHost iCarHost, final Intent intent, final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        if (Log.isLoggable(LogTags.TAG, 3)) {
            java.util.Objects.toString(intent);
            Log.d(LogTags.TAG, "onAppCreate intent: ".concat(String.valueOf(intent)));
        }
        RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onAppCreate", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda4
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                this.f$0.m1570lambda$onAppCreate$0$androidxcarappCarAppBinder(iCarHost, configuration, intent);
                return null;
            }
        });
        if (Log.isLoggable(LogTags.TAG, 3)) {
            Log.d(LogTags.TAG, "onAppCreate completed");
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppPause", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda1
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                this.f$0.m1571lambda$onAppPause$3$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppResume", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda7
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                this.f$0.m1572lambda$onAppResume$2$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppStart", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda2
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                this.f$0.m1573lambda$onAppStart$1$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppStop", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda3
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                this.f$0.m1574lambda$onAppStop$4$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    void onAutoDriveEnabled() {
        Session session = this.mCurrentSession;
        if (session != null) {
            ((NavigationManager) session.getCarContext().getCarService(NavigationManager.class)).onAutoDriveEnabled();
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onConfigurationChanged(final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onConfigurationChanged", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda0
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                this.f$0.m1575lambda$onConfigurationChanged$6$androidxcarappCarAppBinder(configuration);
                return null;
            }
        });
    }

    void onDestroyLifecycle() {
        Session session = this.mCurrentSession;
        if (session != null) {
            session.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        }
        this.mCurrentSession = null;
    }

    @Override // androidx.car.app.ICarApp
    public void onHandshakeCompleted(Bundleable bundleable, IOnDoneCallback iOnDoneCallback) {
        CarAppService carAppService = (CarAppService) Objects.requireNonNull(this.mService);
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
        } catch (BundlerException | IllegalArgumentException e2) {
            carAppService.setHostInfo(null);
            RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "onHandshakeCompleted", e2);
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onNewIntent(final Intent intent, IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onNewIntent", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda6
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                this.f$0.m1576lambda$onNewIntent$5$androidxcarappCarAppBinder(intent);
                return null;
            }
        });
    }

    void setHandshakeInfo(HandshakeInfo handshakeInfo) {
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        if (CarAppApiLevels.isValid(hostCarAppApiLevel)) {
            this.mHandshakeInfo = handshakeInfo;
        } else {
            throw new IllegalArgumentException("Invalid Car App API level received: " + hostCarAppApiLevel);
        }
    }
}
