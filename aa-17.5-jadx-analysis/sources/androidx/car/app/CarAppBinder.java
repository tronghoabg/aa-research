package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.util.Log;
import androidx.car.app.ICarApp;
import androidx.car.app.navigation.NavigationManager;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import defpackage.a;
import defpackage.epr;
import defpackage.eps;
import defpackage.ept;
import defpackage.eqc;
import defpackage.qg;
import defpackage.qn;
import defpackage.qr;
import defpackage.qx;
import defpackage.qz;
import defpackage.tr;
import defpackage.xr;
import defpackage.xy;
import defpackage.yj;
import defpackage.yk;
import defpackage.yl;
import java.security.InvalidParameterException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CarAppBinder extends ICarApp.Stub {
    private qz mCurrentSession;
    private final SessionInfo mCurrentSessionInfo;
    private HandshakeInfo mHandshakeInfo;
    private yk mHostValidator;
    private qg mService;

    public CarAppBinder(qg qgVar, SessionInfo sessionInfo) {
        this.mService = qgVar;
        this.mCurrentSessionInfo = sessionInfo;
    }

    private ept getCurrentLifecycle() {
        qz qzVar = this.mCurrentSession;
        if (qzVar == null) {
            return null;
        }
        return qzVar.a;
    }

    private yk getHostValidator() {
        yk ykVar = this.mHostValidator;
        if (ykVar != null) {
            return ykVar;
        }
        qg qgVar = this.mService;
        qgVar.getClass();
        yk ykVarD = qgVar.d();
        this.mHostValidator = ykVarD;
        return ykVarD;
    }

    private void onConfigurationChangedInternal(qz qzVar, Configuration configuration) {
        yj.a();
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(configuration);
            Log.d("CarApp", "onCarConfigurationChanged configuration: ".concat(String.valueOf(configuration)));
        }
        qn qnVar = qzVar.b;
        qnVar.d(configuration);
        qzVar.d(qnVar.getResources().getConfiguration());
    }

    private void onNewIntentInternal(qz qzVar, Intent intent) {
        yj.a();
        qzVar.e(intent);
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
            qg qgVar = this.mService;
            qgVar.getClass();
            tr.g(iOnDoneCallback, "getAppInfo", qgVar.a());
        } catch (IllegalArgumentException e) {
            tr.f(iOnDoneCallback, "getAppInfo", e);
        }
    }

    @Override // androidx.car.app.ICarApp
    public void getAppTheme(IOnDoneCallback iOnDoneCallback) {
        tr.d(getCurrentLifecycle(), iOnDoneCallback, "getAppTheme", new xy() { // from class: px
            @Override // defpackage.xy
            public final Object a() {
                return this.a.m125lambda$getAppTheme$8$androidxcarappCarAppBinder();
            }
        });
    }

    qg getCarAppService() {
        return this.mService;
    }

    qz getCurrentSession() {
        return this.mCurrentSession;
    }

    public SessionInfo getCurrentSessionInfo() {
        return this.mCurrentSessionInfo;
    }

    public HandshakeInfo getHandshakeInfo() {
        return this.mHandshakeInfo;
    }

    @Override // androidx.car.app.ICarApp
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.ICarApp
    public void getManager(final String str, final IOnDoneCallback iOnDoneCallback) {
        yj.b(new Runnable() { // from class: qc
            @Override // java.lang.Runnable
            public final void run() {
                this.a.m126lambda$getManager$7$androidxcarappCarAppBinder(str, iOnDoneCallback);
            }
        });
    }

    /* renamed from: lambda$getAppTheme$8$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m125lambda$getAppTheme$8$androidxcarappCarAppBinder() throws xr {
        return 0;
    }

    /* renamed from: lambda$getManager$7$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ void m126lambda$getManager$7$androidxcarappCarAppBinder(String str, IOnDoneCallback iOnDoneCallback) {
        qz qzVar = this.mCurrentSession;
        qzVar.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 96801) {
            if (iHashCode == 1862666772 && str.equals("navigation")) {
                tr.g(iOnDoneCallback, "getManager", ((NavigationManager) qzVar.a().a(NavigationManager.class)).a);
                return;
            }
        } else if (str.equals(CloudRecognizerProtocolStrings.APP)) {
            tr.g(iOnDoneCallback, "getManager", ((AppManager) qzVar.a().a(AppManager.class)).b);
            return;
        }
        Log.e("CarApp", String.valueOf(str).concat("%s is not a valid manager"));
        tr.f(iOnDoneCallback, "getManager", new InvalidParameterException(String.valueOf(str).concat(" is not a valid manager type")));
    }

    /* renamed from: lambda$onAppCreate$0$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m127lambda$onAppCreate$0$androidxcarappCarAppBinder(ICarHost iCarHost, Configuration configuration, Intent intent) throws xr {
        qg qgVar = this.mService;
        qgVar.getClass();
        qz qzVarC = this.mCurrentSession;
        if (qzVarC == null || qzVarC.a.e == eps.a) {
            SessionInfo sessionInfo = this.mCurrentSessionInfo;
            sessionInfo.getClass();
            qzVarC = qgVar.c(sessionInfo);
            this.mCurrentSession = qzVarC;
        }
        HandshakeInfo handshakeInfo = getHandshakeInfo();
        handshakeInfo.getClass();
        qgVar.b.getClass();
        qn qnVar = qzVarC.b;
        qnVar.d = handshakeInfo.getHostCarAppApiLevel();
        qnVar.b(qgVar, configuration);
        yj.a();
        qr qrVar = qnVar.a;
        iCarHost.getClass();
        yj.a();
        qrVar.d();
        qrVar.a = iCarHost;
        eqc eqcVar = qzVarC.a;
        eps epsVar = eqcVar.e;
        int size = ((qx) qzVarC.a().a(qx.class)).a.size();
        if (epsVar.a(eps.c) && size > 0) {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "onAppCreate the app was already created");
            }
            onNewIntentInternal(qzVarC, intent);
            return null;
        }
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate the app was not yet created or the screen stack was empty state: " + eqcVar.e + ", stack size: " + size);
        }
        qzVarC.c(epr.ON_CREATE);
        ((qx) qzVarC.a().a(qx.class)).f(qzVarC.b(intent));
        return null;
    }

    /* renamed from: lambda$onAppPause$3$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m128lambda$onAppPause$3$androidxcarappCarAppBinder() throws xr {
        qz qzVar = this.mCurrentSession;
        qzVar.getClass();
        qzVar.c(epr.ON_PAUSE);
        return null;
    }

    /* renamed from: lambda$onAppResume$2$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m129lambda$onAppResume$2$androidxcarappCarAppBinder() throws xr {
        qz qzVar = this.mCurrentSession;
        qzVar.getClass();
        qzVar.c(epr.ON_RESUME);
        return null;
    }

    /* renamed from: lambda$onAppStart$1$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m130lambda$onAppStart$1$androidxcarappCarAppBinder() throws xr {
        qz qzVar = this.mCurrentSession;
        qzVar.getClass();
        qzVar.c(epr.ON_START);
        return null;
    }

    /* renamed from: lambda$onAppStop$4$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m131lambda$onAppStop$4$androidxcarappCarAppBinder() throws xr {
        qz qzVar = this.mCurrentSession;
        qzVar.getClass();
        qzVar.c(epr.ON_STOP);
        return null;
    }

    /* renamed from: lambda$onConfigurationChanged$6$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m132lambda$onConfigurationChanged$6$androidxcarappCarAppBinder(Configuration configuration) throws xr {
        qz qzVar = this.mCurrentSession;
        qzVar.getClass();
        onConfigurationChangedInternal(qzVar, configuration);
        return null;
    }

    /* renamed from: lambda$onNewIntent$5$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m133lambda$onNewIntent$5$androidxcarappCarAppBinder(Intent intent) throws xr {
        qz qzVar = this.mCurrentSession;
        qzVar.getClass();
        onNewIntentInternal(qzVar, intent);
        return null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppCreate(final ICarHost iCarHost, final Intent intent, final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(intent);
            Log.d("CarApp", "onAppCreate intent: ".concat(String.valueOf(intent)));
        }
        tr.b(iOnDoneCallback, "onAppCreate", new xy() { // from class: qb
            @Override // defpackage.xy
            public final Object a() throws xr {
                this.a.m127lambda$onAppCreate$0$androidxcarappCarAppBinder(iCarHost, configuration, intent);
                return null;
            }
        });
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate completed");
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        tr.d(getCurrentLifecycle(), iOnDoneCallback, "onAppPause", new xy() { // from class: py
            @Override // defpackage.xy
            public final Object a() throws xr {
                this.a.m128lambda$onAppPause$3$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        tr.d(getCurrentLifecycle(), iOnDoneCallback, "onAppResume", new xy() { // from class: qe
            @Override // defpackage.xy
            public final Object a() throws xr {
                this.a.m129lambda$onAppResume$2$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        tr.d(getCurrentLifecycle(), iOnDoneCallback, "onAppStart", new xy() { // from class: pz
            @Override // defpackage.xy
            public final Object a() throws xr {
                this.a.m130lambda$onAppStart$1$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        tr.d(getCurrentLifecycle(), iOnDoneCallback, "onAppStop", new xy() { // from class: qa
            @Override // defpackage.xy
            public final Object a() throws xr {
                this.a.m131lambda$onAppStop$4$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    public void onAutoDriveEnabled() {
        qz qzVar = this.mCurrentSession;
        if (qzVar != null) {
            yj.a();
            if (Log.isLoggable("CarApp.Nav", 3)) {
                Log.d("CarApp.Nav", "Executing onAutoDriveEnabled");
            }
            Log.w("CarApp.Nav", "NavigationManagerCallback not set, skipping onAutoDriveEnabled");
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onConfigurationChanged(final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        tr.d(getCurrentLifecycle(), iOnDoneCallback, "onConfigurationChanged", new xy() { // from class: pw
            @Override // defpackage.xy
            public final Object a() throws xr {
                this.a.m132lambda$onConfigurationChanged$6$androidxcarappCarAppBinder(configuration);
                return null;
            }
        });
    }

    public void onDestroyLifecycle() {
        qz qzVar = this.mCurrentSession;
        if (qzVar != null) {
            qzVar.c(epr.ON_DESTROY);
        }
        this.mCurrentSession = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009c A[Catch: IllegalArgumentException | xr -> 0x0221, xr -> 0x0223, TryCatch #3 {IllegalArgumentException | xr -> 0x0221, blocks: (B:3:0x0013, B:5:0x0032, B:6:0x0042, B:8:0x0046, B:10:0x004c, B:98:0x01e0, B:101:0x01f6, B:103:0x0207, B:104:0x0216, B:11:0x0053, B:19:0x0074, B:97:0x01cf, B:21:0x007a, B:23:0x007e, B:30:0x009c, B:95:0x01b8, B:31:0x00a8, B:36:0x00ba, B:39:0x00bf, B:41:0x00c7, B:43:0x00cd, B:45:0x00d5, B:62:0x010a, B:71:0x0134, B:73:0x013a, B:75:0x0141, B:78:0x014c, B:80:0x0153, B:83:0x015d, B:85:0x0164, B:87:0x016c, B:89:0x0173, B:90:0x0179, B:65:0x0119, B:67:0x011e, B:70:0x012f, B:49:0x00e2, B:51:0x00e7, B:53:0x00ef, B:55:0x00f4, B:58:0x0101, B:91:0x0191, B:92:0x01aa, B:93:0x01ab, B:34:0x00b0, B:25:0x0089, B:28:0x0092, B:14:0x0061, B:17:0x006e), top: B:112:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8 A[Catch: IllegalArgumentException | xr -> 0x0221, xr -> 0x0223, TryCatch #3 {IllegalArgumentException | xr -> 0x0221, blocks: (B:3:0x0013, B:5:0x0032, B:6:0x0042, B:8:0x0046, B:10:0x004c, B:98:0x01e0, B:101:0x01f6, B:103:0x0207, B:104:0x0216, B:11:0x0053, B:19:0x0074, B:97:0x01cf, B:21:0x007a, B:23:0x007e, B:30:0x009c, B:95:0x01b8, B:31:0x00a8, B:36:0x00ba, B:39:0x00bf, B:41:0x00c7, B:43:0x00cd, B:45:0x00d5, B:62:0x010a, B:71:0x0134, B:73:0x013a, B:75:0x0141, B:78:0x014c, B:80:0x0153, B:83:0x015d, B:85:0x0164, B:87:0x016c, B:89:0x0173, B:90:0x0179, B:65:0x0119, B:67:0x011e, B:70:0x012f, B:49:0x00e2, B:51:0x00e7, B:53:0x00ef, B:55:0x00f4, B:58:0x0101, B:91:0x0191, B:92:0x01aa, B:93:0x01ab, B:34:0x00b0, B:25:0x0089, B:28:0x0092, B:14:0x0061, B:17:0x006e), top: B:112:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114 A[PHI: r0
  0x0114: PHI (r0v37 boolean) = (r0v17 boolean), (r0v18 boolean) binds: [B:63:0x0112, B:113:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0119 A[Catch: IllegalArgumentException | xr -> 0x0221, xr -> 0x0223, TryCatch #3 {IllegalArgumentException | xr -> 0x0221, blocks: (B:3:0x0013, B:5:0x0032, B:6:0x0042, B:8:0x0046, B:10:0x004c, B:98:0x01e0, B:101:0x01f6, B:103:0x0207, B:104:0x0216, B:11:0x0053, B:19:0x0074, B:97:0x01cf, B:21:0x007a, B:23:0x007e, B:30:0x009c, B:95:0x01b8, B:31:0x00a8, B:36:0x00ba, B:39:0x00bf, B:41:0x00c7, B:43:0x00cd, B:45:0x00d5, B:62:0x010a, B:71:0x0134, B:73:0x013a, B:75:0x0141, B:78:0x014c, B:80:0x0153, B:83:0x015d, B:85:0x0164, B:87:0x016c, B:89:0x0173, B:90:0x0179, B:65:0x0119, B:67:0x011e, B:70:0x012f, B:49:0x00e2, B:51:0x00e7, B:53:0x00ef, B:55:0x00f4, B:58:0x0101, B:91:0x0191, B:92:0x01aa, B:93:0x01ab, B:34:0x00b0, B:25:0x0089, B:28:0x0092, B:14:0x0061, B:17:0x006e), top: B:112:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013a A[Catch: IllegalArgumentException | xr -> 0x0221, xr -> 0x0223, TryCatch #3 {IllegalArgumentException | xr -> 0x0221, blocks: (B:3:0x0013, B:5:0x0032, B:6:0x0042, B:8:0x0046, B:10:0x004c, B:98:0x01e0, B:101:0x01f6, B:103:0x0207, B:104:0x0216, B:11:0x0053, B:19:0x0074, B:97:0x01cf, B:21:0x007a, B:23:0x007e, B:30:0x009c, B:95:0x01b8, B:31:0x00a8, B:36:0x00ba, B:39:0x00bf, B:41:0x00c7, B:43:0x00cd, B:45:0x00d5, B:62:0x010a, B:71:0x0134, B:73:0x013a, B:75:0x0141, B:78:0x014c, B:80:0x0153, B:83:0x015d, B:85:0x0164, B:87:0x016c, B:89:0x0173, B:90:0x0179, B:65:0x0119, B:67:0x011e, B:70:0x012f, B:49:0x00e2, B:51:0x00e7, B:53:0x00ef, B:55:0x00f4, B:58:0x0101, B:91:0x0191, B:92:0x01aa, B:93:0x01ab, B:34:0x00b0, B:25:0x0089, B:28:0x0092, B:14:0x0061, B:17:0x006e), top: B:112:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014a  */
    @Override // androidx.car.app.ICarApp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onHandshakeCompleted(androidx.car.app.serialization.Bundleable r21, androidx.car.app.IOnDoneCallback r22) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.car.app.CarAppBinder.onHandshakeCompleted(androidx.car.app.serialization.Bundleable, androidx.car.app.IOnDoneCallback):void");
    }

    @Override // androidx.car.app.ICarApp
    public void onNewIntent(final Intent intent, IOnDoneCallback iOnDoneCallback) {
        tr.d(getCurrentLifecycle(), iOnDoneCallback, "onNewIntent", new xy() { // from class: qd
            @Override // defpackage.xy
            public final Object a() throws xr {
                this.a.m133lambda$onNewIntent$5$androidxcarappCarAppBinder(intent);
                return null;
            }
        });
    }

    void setHandshakeInfo(HandshakeInfo handshakeInfo) {
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        int i = yl.a;
        if (hostCarAppApiLevel <= 0 || hostCarAppApiLevel > yl.a()) {
            throw new IllegalArgumentException(a.bp(hostCarAppApiLevel, "Invalid Car App API level received: "));
        }
        this.mHandshakeInfo = handshakeInfo;
    }
}
