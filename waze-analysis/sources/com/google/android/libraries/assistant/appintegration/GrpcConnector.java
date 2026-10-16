package com.google.android.libraries.assistant.appintegration;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.google.android.apps.search.assistant.platform.appintegration.a.a;
import com.google.android.apps.search.assistant.platform.appintegration.a.b;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.ParcelableBinder;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.WindowTokenKeys;
import com.google.android.libraries.assistant.appintegration.shared.grpc.AppIntegrationServiceGrpc;
import com.google.android.libraries.assistant.appintegration.shared.grpc.Request;
import com.google.android.libraries.assistant.appintegration.shared.grpc.Response;
import com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationService;
import com.google.android.libraries.assistant.appintegration.shared.util.ExtensionRegistryUtils;
import com.google.d.f.h;
import com.google.d.f.i;
import e.a.b.g;
import e.a.bx;
import e.a.cm;
import e.a.h.ad;
import e.a.h.ae;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class GrpcConnector implements a {
    private AppIntegrationServiceGrpc.AppIntegrationServiceStub appIntegrationStub;
    private final b callbackStub;
    private final boolean isTngMorris;
    private final String packageName;
    private ae<Request> requestObserver;
    private final ae<Response> responseObserver;
    private IBinder token;
    private static final i logger = i.l("com/google/android/libraries/assistant/appintegration/GrpcConnector");
    private static final e.a.b.b APP_INTEGRATION_SERVICE_ADDRESS = e.a.b.b.e("com.google.android.apps.search.assistant.platform.appintegration.endpoint.AppIntegrationService");
    private static final e.a.b.b LEGACY_TO_MOSAIC_SERVICE_ADDRESS = e.a.b.b.e("com.google.android.apps.search.assistant.platform.appintegration.mosaic.endpoint.MosaicService");

    GrpcConnector(bx bxVar, String str, b bVar, boolean z) {
        this.responseObserver = new ae<Response>(this) { // from class: com.google.android.libraries.assistant.appintegration.GrpcConnector.1
            final /* synthetic */ GrpcConnector this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            private void forwardUpdateToClientsStream(AppIntegrationService.AppIntegrationCallbackEvent appIntegrationCallbackEvent) {
                this.this$0.callbackStub.onUpdate(appIntegrationCallbackEvent);
            }

            @Override // e.a.h.ae
            public void onCompleted() {
                ((h) ((h) GrpcConnector.logger.b()).i("com/google/android/libraries/assistant/appintegration/GrpcConnector$1", "onCompleted", 74, "GrpcConnector.java")).o("onCompleted()");
            }

            @Override // e.a.h.ae
            public void onError(Throwable th) {
                ((h) ((h) ((h) GrpcConnector.logger.g()).h(th)).i("com/google/android/libraries/assistant/appintegration/GrpcConnector$1", "onError", 68, "GrpcConnector.java")).o("onError()");
                this.this$0.callbackStub.onServiceDisconnected();
            }

            @Override // e.a.h.ae
            public void onNext(Response response) {
                ((h) ((h) GrpcConnector.logger.b()).i("com/google/android/libraries/assistant/appintegration/GrpcConnector$1", "onNext", 59, "GrpcConnector.java")).p("onNext(%s)", response);
                if (response.hasOnUpdate()) {
                    forwardUpdateToClientsStream(response.getOnUpdate());
                }
            }
        };
        this.appIntegrationStub = AppIntegrationServiceGrpc.newStub(bxVar);
        this.packageName = str;
        this.callbackStub = bVar;
        this.isTngMorris = z;
    }

    private static bx createChannel(Context context, boolean z) {
        Application application = (Application) context.getApplicationContext();
        g gVarR = g.r(getAddress(z), application);
        gVarR.t(com.google.h.a.a.a.a.b.a(application));
        return gVarR.a();
    }

    private static e.a.b.b getAddress(boolean z) {
        return z ? LEGACY_TO_MOSAIC_SERVICE_ADDRESS : APP_INTEGRATION_SERVICE_ADDRESS;
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.a
    public boolean connect(AppIntegrationService.AppIntegrationData appIntegrationData) {
        ((h) ((h) logger.b()).i("com/google/android/libraries/assistant/appintegration/GrpcConnector", "connect", 103, "GrpcConnector.java")).o("#connect");
        ExtensionRegistryUtils.setRegistry();
        ae<Request> aeVarStartSession = this.appIntegrationStub.startSession(this.responseObserver);
        this.requestObserver = aeVarStartSession;
        Request.Builder builderNewBuilder = Request.newBuilder();
        builderNewBuilder.setSentData(appIntegrationData);
        builderNewBuilder.setPackageName(this.packageName);
        builderNewBuilder.setIsTngMorris(this.isTngMorris);
        builderNewBuilder.setSendToken(this.token != null);
        aeVarStartSession.onNext(builderNewBuilder.build());
        this.callbackStub.onServiceConnected();
        return true;
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.a
    public void disconnect() {
        ae<Request> aeVar = this.requestObserver;
        if (aeVar != null) {
            aeVar.onCompleted();
            this.requestObserver = null;
        }
        this.token = null;
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.a
    public int getConnectionState() {
        return isSessionInitialized() ? 3 : 0;
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.a
    public IBinder getToken() {
        return this.token;
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.a
    public boolean isSessionInitialized() {
        return this.requestObserver != null;
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.a
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.a
    public void onServiceDisconnected(ComponentName componentName) {
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.a
    public void sendData(AppIntegrationService.AppIntegrationData appIntegrationData) {
        Request.Builder builderNewBuilder = Request.newBuilder();
        builderNewBuilder.setSentData(appIntegrationData);
        builderNewBuilder.setIsTngMorris(this.isTngMorris);
        if (appIntegrationData.hasAppIntegrationClientEvent() && appIntegrationData.getAppIntegrationClientEvent().getClientEventId().equals(AppIntegrationService.AppIntegrationClientEvent.ClientEventId.NAVIGATION_STATE_CHANGED)) {
            builderNewBuilder.setSendToken(true);
        }
        this.requestObserver.onNext(builderNewBuilder.build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.a
    public void setToken(IBinder iBinder) {
        ((h) ((h) logger.c()).i("com/google/android/libraries/assistant/appintegration/GrpcConnector", "setToken", 150, "GrpcConnector.java")).o("#setToken");
        this.token = iBinder;
        ParcelableBinder parcelableBinder = new ParcelableBinder(iBinder);
        cm cmVar = new cm();
        cmVar.i(WindowTokenKeys.METADATA_KEY, parcelableBinder);
        this.appIntegrationStub = (AppIntegrationServiceGrpc.AppIntegrationServiceStub) this.appIntegrationStub.withInterceptors(ad.d(cmVar));
    }

    public GrpcConnector(Context context, b bVar, boolean z) {
        this(createChannel(context, z), context.getPackageName(), bVar, z);
    }
}
