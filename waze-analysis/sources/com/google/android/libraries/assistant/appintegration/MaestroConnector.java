package com.google.android.libraries.assistant.appintegration;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.apps.search.assistant.platform.appintegration.a.a;
import com.google.android.gms.common.ah;
import com.google.android.libraries.assistant.appintegration.api.standard.callback.IAppIntegrationSessionCallbackStub;
import com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationService;
import com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSession;
import com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationService;
import com.google.android.libraries.assistant.appintegration.shared.util.AppIntegrationContract;
import com.google.d.b.an;
import com.google.d.f.aa;
import com.google.d.f.h;
import com.google.d.f.i;
import com.google.d.f.x;
import com.google.d.m.a.cf;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class MaestroConnector implements a {
    public static final String AGSA_PACKAGE = "com.google.android.googlequicksearchbox";
    private static final long RESET_DELAY_IN_MS = 2000;
    private static final i logger = i.l("com/google/android/libraries/assistant/appintegration/MaestroConnector");
    private IAppIntegrationSession appIntegrationSession;
    private final AssistantIntegrationClient assistantIntegrationClient;
    protected IAppIntegrationSessionCallbackStub callbackStub;
    private final AppIntegrationServiceConnection connection = new AppIntegrationServiceConnection(this);
    private final Context context;
    private final ah googleSignatureVerifier;
    private IBinder token;

    /* compiled from: WazeSource */
    public class AppIntegrationServiceConnection implements ServiceConnection {
        private volatile int connectionState;
        final /* synthetic */ MaestroConnector this$0;

        public AppIntegrationServiceConnection(MaestroConnector maestroConnector) {
            Objects.requireNonNull(maestroConnector);
            this.this$0 = maestroConnector;
            this.connectionState = 0;
        }

        private void resetAndNotifyDisconnected() {
            this.this$0.appIntegrationSession = null;
            this.this$0.token = null;
            this.connectionState = 1;
            this.this$0.callbackStub.resetStatesDelayed(2000L);
            if (this.this$0.callbackStub.getCallback() == null) {
                ((h) ((h) MaestroConnector.logger.g().g(com.google.d.f.a.a.f7667a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "resetAndNotifyDisconnected", 201, "MaestroConnector.java")).o("#resetAndNotifyDisconnected(): callback is null when try to notify onServiceDisconnected.");
            } else {
                this.this$0.callbackStub.getCallback().onServiceDisconnected();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: verifyAndCallback, reason: merged with bridge method [inline-methods] */
        public void lambda$onServiceConnected$0(ComponentName componentName, IBinder iBinder) {
            if (componentName == null || !verifyServicePackageAndSignature(componentName.getPackageName())) {
                ((h) ((h) MaestroConnector.logger.g().g(com.google.d.f.a.a.f7667a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "verifyAndCallback", 166, "MaestroConnector.java")).o("#onServiceConnected(): Service signature is not matched");
                resetAndNotifyDisconnected();
                return;
            }
            IAppIntegrationService iAppIntegrationServiceAsInterface = IAppIntegrationService.Stub.asInterface(iBinder);
            try {
                MaestroConnector maestroConnector = this.this$0;
                maestroConnector.appIntegrationSession = iAppIntegrationServiceAsInterface.startSession(maestroConnector.context.getPackageName(), this.this$0.callbackStub);
                if (this.this$0.appIntegrationSession == null) {
                    resetAndNotifyDisconnected();
                    return;
                }
                this.connectionState = 3;
                this.this$0.assistantIntegrationClient.sendCurrentVoicePlateParamsAndCapabilities();
                if (this.this$0.callbackStub.getCallback() == null) {
                    ((h) ((h) MaestroConnector.logger.g().g(com.google.d.f.a.a.f7667a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "verifyAndCallback", 187, "MaestroConnector.java")).o("#onServiceConnected(): callback is null when try to notify onServiceConnected.");
                } else {
                    sendToken();
                    this.this$0.callbackStub.getCallback().onServiceConnected();
                }
            } catch (RemoteException unused) {
                ((h) ((h) MaestroConnector.logger.g().g(com.google.d.f.a.a.f7667a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "verifyAndCallback", 180, "MaestroConnector.java")).o("#onServiceConnected(): Failed to start session");
                resetAndNotifyDisconnected();
            }
        }

        private boolean verifyServicePackageAndSignature(String str) {
            return "com.google.android.googlequicksearchbox".equals(str) && this.this$0.googleSignatureVerifier.c(str);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
            ((h) ((h) MaestroConnector.logger.d().g(com.google.d.f.a.a.f7667a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "onServiceConnected", 142, "MaestroConnector.java")).p("#onServiceConnected(): %s", componentName);
            cf.y().execute(com.google.b.d.b.ah.d(new Runnable() { // from class: com.google.android.libraries.assistant.appintegration.MaestroConnector$AppIntegrationServiceConnection$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onServiceConnected$0(componentName, iBinder);
                }
            }));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ((h) ((h) MaestroConnector.logger.d().g(com.google.d.f.a.a.f7667a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "onServiceDisconnected", 149, "MaestroConnector.java")).p("#onServiceDisconnected(): %s", componentName);
            resetAndNotifyDisconnected();
        }

        public void sendToken() {
            ((h) ((h) MaestroConnector.logger.c().g(com.google.d.f.a.a.f7667a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "sendToken", 154, "MaestroConnector.java")).o("#sendToken()");
            if (this.this$0.token != null) {
                try {
                    IAppIntegrationSession iAppIntegrationSession = this.this$0.appIntegrationSession;
                    IBinder iBinder = this.this$0.token;
                    an.B(iBinder);
                    iAppIntegrationSession.sendToken(iBinder);
                } catch (RemoteException e2) {
                    ((h) ((h) ((h) MaestroConnector.logger.g().g(com.google.d.f.a.a.f7667a, "MaestroConnector")).h(e2)).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "sendToken", 159, "MaestroConnector.java")).o("#sendToken(): failed to send token.");
                }
            }
        }
    }

    MaestroConnector(Context context, IAppIntegrationSessionCallbackStub iAppIntegrationSessionCallbackStub, AssistantIntegrationClient assistantIntegrationClient, ah ahVar) {
        this.context = context;
        this.assistantIntegrationClient = assistantIntegrationClient;
        this.googleSignatureVerifier = ahVar;
        this.callbackStub = iAppIntegrationSessionCallbackStub;
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.a
    public boolean connect(AppIntegrationService.AppIntegrationData appIntegrationData) {
        i iVar = logger;
        x xVarB = iVar.b();
        aa aaVar = com.google.d.f.a.a.f7667a;
        ((h) ((h) xVarB.g(aaVar, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector", "connect", 61, "MaestroConnector.java")).o("#connect()");
        Intent intent = new Intent();
        intent.setAction(AppIntegrationContract.INTENT_ACTION_BIND_SERVICE);
        intent.setPackage("com.google.android.googlequicksearchbox");
        if (!this.context.bindService(intent, this.connection, 1)) {
            ((h) ((h) iVar.g().g(aaVar, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector", "connect", 70, "MaestroConnector.java")).o("#bindService(): failed to bind service.");
            return false;
        }
        ((h) ((h) iVar.d().g(aaVar, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector", "connect", 66, "MaestroConnector.java")).o("#bindService(): binding service.");
        this.connection.connectionState = 2;
        return true;
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.a
    public void disconnect() {
        ((h) ((h) logger.b().g(com.google.d.f.a.a.f7667a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector", "disconnect", 81, "MaestroConnector.java")).o("#disconnect()");
        if (getConnectionState() == 3) {
            AssistantIntegrationClient assistantIntegrationClient = this.assistantIntegrationClient;
            AppIntegrationService.AppIntegrationClientEvent.Builder builderNewBuilder = AppIntegrationService.AppIntegrationClientEvent.newBuilder();
            builderNewBuilder.setClientEventId(AppIntegrationService.AppIntegrationClientEvent.ClientEventId.UNBIND_INTEGRATION_SERVICE);
            assistantIntegrationClient.sendClientEvent(builderNewBuilder);
        }
        this.context.unbindService(this.connection);
        this.connection.connectionState = 0;
        this.appIntegrationSession = null;
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.a
    public int getConnectionState() {
        return this.connection.connectionState;
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.a
    public IBinder getToken() {
        return this.token;
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.a
    public boolean isSessionInitialized() {
        return this.appIntegrationSession != null;
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.a
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.connection.onServiceConnected(componentName, iBinder);
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.a
    public void onServiceDisconnected(ComponentName componentName) {
        this.connection.onServiceDisconnected(componentName);
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.a
    public void sendData(AppIntegrationService.AppIntegrationData appIntegrationData) throws RemoteException {
        ((h) ((h) logger.b().g(com.google.d.f.a.a.f7667a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector", "sendData", 99, "MaestroConnector.java")).o("#sendData()");
        if (getConnectionState() != 3 || !isSessionInitialized()) {
            throw new RemoteException("Maestro service not connected yet");
        }
        if (this.token != null && appIntegrationData.hasAppIntegrationClientEvent() && appIntegrationData.getAppIntegrationClientEvent().getClientEventId().equals(AppIntegrationService.AppIntegrationClientEvent.ClientEventId.NAVIGATION_STATE_CHANGED)) {
            this.connection.sendToken();
        }
        this.appIntegrationSession.sendData(appIntegrationData.toByteArray());
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.a
    public void setToken(IBinder iBinder) {
        ((h) ((h) logger.c().g(com.google.d.f.a.a.f7667a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector", "setToken", 115, "MaestroConnector.java")).o("#setToken");
        this.token = iBinder;
    }
}
