package com.google.android.libraries.assistant.appintegration.shared.grpc;

import e.a.cn;
import e.a.cp;
import e.a.cq;
import e.a.dt;
import e.a.dw;
import e.a.dx;
import e.a.dy;
import e.a.g.a.c;
import e.a.h;
import e.a.h.a;
import e.a.h.ad;
import e.a.h.ae;
import e.a.h.b;
import e.a.h.d;
import e.a.h.g;
import e.a.h.s;
import e.a.h.x;
import e.a.h.y;
import e.a.i;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class AppIntegrationServiceGrpc {
    private static final int METHODID_START_SESSION = 0;
    public static final String SERVICE_NAME = "java.com.google.android.libraries.assistant.appintegration.shared.grpc.AppIntegrationService";
    private static volatile cq<Request, Response> getStartSessionMethod;
    private static volatile dy serviceDescriptor;

    /* compiled from: WazeSource */
    public abstract class AppIntegrationServiceImplBase implements AsyncService {
        public final dw bindService() {
            return AppIntegrationServiceGrpc.bindService(this);
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.AppIntegrationServiceGrpc.AsyncService
        public /* synthetic */ ae startSession(ae aeVar) {
            return AsyncService.CC.$default$startSession(this, aeVar);
        }
    }

    /* compiled from: WazeSource */
    public interface AsyncService {

        /* compiled from: WazeSource */
        /* renamed from: com.google.android.libraries.assistant.appintegration.shared.grpc.AppIntegrationServiceGrpc$AsyncService$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static ae $default$startSession(AsyncService asyncService, ae aeVar) {
                return ad.b(AppIntegrationServiceGrpc.getStartSessionMethod(), aeVar);
            }
        }

        ae<Request> startSession(ae<Response> aeVar);
    }

    private AppIntegrationServiceGrpc() {
    }

    public static final dw bindService(AsyncService asyncService) {
        dy serviceDescriptor2 = getServiceDescriptor();
        HashMap map = new HashMap();
        dt.a(getStartSessionMethod(), ad.a(new MethodHandlers(asyncService, 0)), serviceDescriptor2.a(), map);
        return dt.b(serviceDescriptor2, map);
    }

    public static dy getServiceDescriptor() {
        dy dyVarA;
        dy dyVar = serviceDescriptor;
        if (dyVar != null) {
            return dyVar;
        }
        synchronized (AppIntegrationServiceGrpc.class) {
            dyVarA = serviceDescriptor;
            if (dyVarA == null) {
                dx dxVarC = dy.c();
                dxVarC.d(getStartSessionMethod());
                dyVarA = dxVarC.a();
                serviceDescriptor = dyVarA;
            }
        }
        return dyVarA;
    }

    public static cq<Request, Response> getStartSessionMethod() {
        cq cqVarA;
        cq<Request, Response> cqVar = getStartSessionMethod;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (AppIntegrationServiceGrpc.class) {
            cqVarA = getStartSessionMethod;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46547d);
                cnVarA.b(cq.e(SERVICE_NAME, "StartSession"));
                cnVarA.e();
                cnVarA.c(c.a(Request.getDefaultInstance()));
                cnVarA.d(c.a(Response.getDefaultInstance()));
                cqVarA = cnVarA.a();
                getStartSessionMethod = cqVarA;
            }
        }
        return cqVarA;
    }

    public static AppIntegrationServiceBlockingStub newBlockingStub(i iVar) {
        return (AppIntegrationServiceBlockingStub) AppIntegrationServiceBlockingStub.newStub(new d<AppIntegrationServiceBlockingStub>() { // from class: com.google.android.libraries.assistant.appintegration.shared.grpc.AppIntegrationServiceGrpc.3
            @Override // e.a.h.d
            public AppIntegrationServiceBlockingStub newStub(i iVar2, h hVar) {
                return new AppIntegrationServiceBlockingStub(iVar2, hVar);
            }
        }, iVar);
    }

    public static AppIntegrationServiceBlockingV2Stub newBlockingV2Stub(i iVar) {
        return (AppIntegrationServiceBlockingV2Stub) AppIntegrationServiceBlockingV2Stub.newStub(new d<AppIntegrationServiceBlockingV2Stub>() { // from class: com.google.android.libraries.assistant.appintegration.shared.grpc.AppIntegrationServiceGrpc.2
            @Override // e.a.h.d
            public AppIntegrationServiceBlockingV2Stub newStub(i iVar2, h hVar) {
                return new AppIntegrationServiceBlockingV2Stub(iVar2, hVar);
            }
        }, iVar);
    }

    public static AppIntegrationServiceFutureStub newFutureStub(i iVar) {
        return (AppIntegrationServiceFutureStub) AppIntegrationServiceFutureStub.newStub(new d<AppIntegrationServiceFutureStub>() { // from class: com.google.android.libraries.assistant.appintegration.shared.grpc.AppIntegrationServiceGrpc.4
            @Override // e.a.h.d
            public AppIntegrationServiceFutureStub newStub(i iVar2, h hVar) {
                return new AppIntegrationServiceFutureStub(iVar2, hVar);
            }
        }, iVar);
    }

    public static AppIntegrationServiceStub newStub(i iVar) {
        return (AppIntegrationServiceStub) AppIntegrationServiceStub.newStub(new d<AppIntegrationServiceStub>() { // from class: com.google.android.libraries.assistant.appintegration.shared.grpc.AppIntegrationServiceGrpc.1
            @Override // e.a.h.d
            public AppIntegrationServiceStub newStub(i iVar2, h hVar) {
                return new AppIntegrationServiceStub(iVar2, hVar);
            }
        }, iVar);
    }

    /* compiled from: WazeSource */
    public final class AppIntegrationServiceBlockingStub extends b<AppIntegrationServiceBlockingStub> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // e.a.h.e
        public AppIntegrationServiceBlockingStub build(i iVar, h hVar) {
            return new AppIntegrationServiceBlockingStub(iVar, hVar);
        }

        private AppIntegrationServiceBlockingStub(i iVar, h hVar) {
            super(iVar, hVar);
        }
    }

    /* compiled from: WazeSource */
    public final class AppIntegrationServiceBlockingV2Stub extends b<AppIntegrationServiceBlockingV2Stub> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // e.a.h.e
        public AppIntegrationServiceBlockingV2Stub build(i iVar, h hVar) {
            return new AppIntegrationServiceBlockingV2Stub(iVar, hVar);
        }

        public g<Request, Response> startSession() {
            return s.a(getChannel(), AppIntegrationServiceGrpc.getStartSessionMethod(), getCallOptions());
        }

        private AppIntegrationServiceBlockingV2Stub(i iVar, h hVar) {
            super(iVar, hVar);
        }
    }

    /* compiled from: WazeSource */
    public final class AppIntegrationServiceFutureStub extends e.a.h.c<AppIntegrationServiceFutureStub> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // e.a.h.e
        public AppIntegrationServiceFutureStub build(i iVar, h hVar) {
            return new AppIntegrationServiceFutureStub(iVar, hVar);
        }

        private AppIntegrationServiceFutureStub(i iVar, h hVar) {
            super(iVar, hVar);
        }
    }

    /* compiled from: WazeSource */
    public final class AppIntegrationServiceStub extends a<AppIntegrationServiceStub> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // e.a.h.e
        public AppIntegrationServiceStub build(i iVar, h hVar) {
            return new AppIntegrationServiceStub(iVar, hVar);
        }

        public ae<Request> startSession(ae<Response> aeVar) {
            return s.b(getChannel().a(AppIntegrationServiceGrpc.getStartSessionMethod(), getCallOptions()), aeVar);
        }

        private AppIntegrationServiceStub(i iVar, h hVar) {
            super(iVar, hVar);
        }
    }

    /* compiled from: WazeSource */
    final class MethodHandlers<Req, Resp> implements y, x {
        private final int methodId;
        private final AsyncService serviceImpl;

        MethodHandlers(AsyncService asyncService, int i2) {
            this.serviceImpl = asyncService;
            this.methodId = i2;
        }

        @Override // e.a.h.aa
        public ae<Req> invoke(ae<Resp> aeVar) {
            if (this.methodId == 0) {
                return (ae<Req>) this.serviceImpl.startSession(aeVar);
            }
            throw new AssertionError();
        }

        public void invoke(Req req, ae<Resp> aeVar) {
            throw new AssertionError();
        }
    }
}
