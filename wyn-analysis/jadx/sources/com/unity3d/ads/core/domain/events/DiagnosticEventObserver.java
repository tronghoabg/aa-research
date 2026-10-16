package com.unity3d.ads.core.domain.events;

import Ef.A;
import Ef.B;
import Ef.E;
import Ef.H;
import Fe.e;
import Hf.InterfaceC0592c0;
import Hf.Z;
import Hf.k0;
import Hf.x0;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import ef.C2515C;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014H\u0086Bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;", "", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventBatchRequest;", "getDiagnosticEventBatchRequest", "LEf/A;", "defaultDispatcher", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "diagnosticEventRepository", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "universalRequestDataSource", "Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "backgroundWorker", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "universalRequestEventSender", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "diagnosticRequestPolicy", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventBatchRequest;LEf/A;Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;Lcom/unity3d/ads/core/domain/work/BackgroundWorker;Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;Lcom/unity3d/ads/core/domain/GetRequestPolicy;)V", "Lef/C;", "invoke", "(Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventBatchRequest;", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "LHf/c0;", "", "isRunning", "LHf/c0;", "LEf/E;", "scope", "LEf/E;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DiagnosticEventObserver {

    @NotNull
    private final BackgroundWorker backgroundWorker;

    @NotNull
    private final DiagnosticEventRepository diagnosticEventRepository;

    @NotNull
    private final GetRequestPolicy diagnosticRequestPolicy;

    @NotNull
    private final GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest;

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    @NotNull
    private final InterfaceC0592c0 isRunning;

    @NotNull
    private final E scope;

    @NotNull
    private final UniversalRequestDataSource universalRequestDataSource;

    @NotNull
    private final UniversalRequestEventSender universalRequestEventSender;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2", f = "DiagnosticEventObserver.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3471j implements p {
        int label;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "currentDiagnosticEventRequest", "Lef/C;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
        @InterfaceC3466e(c = "com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2$2", f = "DiagnosticEventObserver.kt", l = {45, 49, 54}, m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.domain.events.DiagnosticEventObserver$invoke$2$2, reason: invalid class name and collision with other inner class name */
        public static final class C01992 extends AbstractC3471j implements p {
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ DiagnosticEventObserver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01992(DiagnosticEventObserver diagnosticEventObserver, InterfaceC3103c<? super C01992> interfaceC3103c) {
                super(2, interfaceC3103c);
                this.this$0 = diagnosticEventObserver;
            }

            @Override // lf.AbstractC3462a
            @NotNull
            public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
                C01992 c01992 = new C01992(this.this$0, interfaceC3103c);
                c01992.L$0 = obj;
                return c01992;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:(1:(3:7|28|29)(2:8|9))(6:10|33|11|22|28|29))(1:13))(3:14|(0)|27)|17|31|18|(4:21|22|28|29)|27|(1:(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
            
                r3 = r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00e7, code lost:
            
                if (r9.invoke(r3, r1, r8) == r0) goto L27;
             */
            @Override // lf.AbstractC3462a
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
                /*
                    r8 = this;
                    kf.a r0 = kf.a.f39711a
                    int r1 = r8.label
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r4) goto L28
                    if (r1 == r3) goto L1c
                    if (r1 != r2) goto L14
                    Fe.e.U(r9)
                    goto Lea
                L14:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1c:
                    java.lang.Object r1 = r8.L$1
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.Object r3 = r8.L$0
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r3 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r3
                    Fe.e.U(r9)     // Catch: java.lang.Throwable -> Lcc
                    goto L95
                L28:
                    Fe.e.U(r9)
                    goto L65
                L2c:
                    Fe.e.U(r9)
                    java.lang.Object r9 = r8.L$0
                    java.util.List r9 = (java.util.List) r9
                    gatewayprotocol.v1.UniversalRequestKt r1 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE
                    com.unity3d.ads.core.domain.events.DiagnosticEventObserver r1 = r8.this$0
                    gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r5 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r6 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()
                    java.lang.String r7 = "newBuilder()"
                    kotlin.jvm.internal.AbstractC3340k.d(r6, r7)
                    gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r5 = r5._create(r6)
                    com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest r1 = com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getGetDiagnosticEventBatchRequest$p(r1)
                    gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventRequest r9 = r1.invoke(r9)
                    r5.setDiagnosticEventRequest(r9)
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r9 = r5._build()
                    com.unity3d.ads.core.domain.events.DiagnosticEventObserver r1 = r8.this$0
                    com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r1 = com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getGetUniversalRequestForPayLoad$p(r1)
                    r8.label = r4
                    java.lang.Object r9 = r1.invoke(r9, r8)
                    if (r9 != r0) goto L65
                    goto Le9
                L65:
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r9 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r9
                    java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> Lcb
                    java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lcb
                    java.lang.String r4 = "randomUUID().toString()"
                    kotlin.jvm.internal.AbstractC3340k.d(r1, r4)     // Catch: java.lang.Throwable -> Lcb
                    com.unity3d.ads.core.domain.events.DiagnosticEventObserver r4 = r8.this$0     // Catch: java.lang.Throwable -> Lcb
                    com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r4 = com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getUniversalRequestDataSource$p(r4)     // Catch: java.lang.Throwable -> Lcb
                    byte[] r5 = r9.toByteArray()     // Catch: java.lang.Throwable -> Lcb
                    java.lang.String r6 = "fullRequest.toByteArray()"
                    kotlin.jvm.internal.AbstractC3340k.d(r5, r6)     // Catch: java.lang.Throwable -> Lcb
                    com.google.protobuf.ByteString r5 = com.google.protobuf.kotlin.ByteStringsKt.toByteString(r5)     // Catch: java.lang.Throwable -> Lcb
                    r8.L$0 = r9     // Catch: java.lang.Throwable -> Lcb
                    r8.L$1 = r1     // Catch: java.lang.Throwable -> Lcb
                    r8.label = r3     // Catch: java.lang.Throwable -> Lcb
                    java.lang.Object r3 = r4.set(r1, r5, r8)     // Catch: java.lang.Throwable -> Lcb
                    if (r3 != r0) goto L94
                    goto Le9
                L94:
                    r3 = r9
                L95:
                    com.unity3d.ads.core.domain.work.UniversalRequestWorkerData r9 = new com.unity3d.ads.core.domain.work.UniversalRequestWorkerData     // Catch: java.lang.Throwable -> Lcc
                    r9.<init>(r1)     // Catch: java.lang.Throwable -> Lcc
                    com.unity3d.ads.core.domain.events.DiagnosticEventObserver r1 = r8.this$0     // Catch: java.lang.Throwable -> Lcc
                    com.unity3d.ads.core.domain.work.BackgroundWorker r1 = com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getBackgroundWorker$p(r1)     // Catch: java.lang.Throwable -> Lcc
                    A7.b0 r4 = new A7.b0     // Catch: java.lang.Throwable -> Lcc
                    java.lang.Class<com.unity3d.ads.core.domain.work.DiagnosticEventJob> r5 = com.unity3d.ads.core.domain.work.DiagnosticEventJob.class
                    r4.<init>(r5)     // Catch: java.lang.Throwable -> Lcc
                    J3.h r9 = r9.invoke()     // Catch: java.lang.Throwable -> Lcc
                    java.lang.String r5 = "inputData"
                    kotlin.jvm.internal.AbstractC3340k.e(r9, r5)     // Catch: java.lang.Throwable -> Lcc
                    java.lang.Object r5 = r4.f814d     // Catch: java.lang.Throwable -> Lcc
                    S3.p r5 = (S3.p) r5     // Catch: java.lang.Throwable -> Lcc
                    r5.f10981e = r9     // Catch: java.lang.Throwable -> Lcc
                    java.lang.String r9 = "UnityAdsBackgroundWorker"
                    java.lang.Object r5 = r4.f815e     // Catch: java.lang.Throwable -> Lcc
                    java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> Lcc
                    r5.add(r9)     // Catch: java.lang.Throwable -> Lcc
                    J3.s r9 = r4.i()     // Catch: java.lang.Throwable -> Lcc
                    J3.x r1 = r1.getWorkManager()     // Catch: java.lang.Throwable -> Lcc
                    r1.a(r9)     // Catch: java.lang.Throwable -> Lcc
                    goto Lea
                Lcb:
                    r3 = r9
                Lcc:
                    com.unity3d.ads.core.domain.events.DiagnosticEventObserver r9 = r8.this$0
                    com.unity3d.ads.core.domain.events.UniversalRequestEventSender r9 = com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getUniversalRequestEventSender$p(r9)
                    com.unity3d.ads.core.domain.events.DiagnosticEventObserver r1 = r8.this$0
                    com.unity3d.ads.core.domain.GetRequestPolicy r1 = com.unity3d.ads.core.domain.events.DiagnosticEventObserver.access$getDiagnosticRequestPolicy$p(r1)
                    com.unity3d.ads.gatewayclient.RequestPolicy r1 = r1.invoke()
                    r4 = 0
                    r8.L$0 = r4
                    r8.L$1 = r4
                    r8.label = r2
                    java.lang.Object r9 = r9.invoke(r3, r1, r8)
                    if (r9 != r0) goto Lea
                Le9:
                    return r0
                Lea:
                    ef.C r9 = ef.C2515C.f34653a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.DiagnosticEventObserver.AnonymousClass2.C01992.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // tf.p
            @Nullable
            public final Object invoke(@NotNull List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
                return ((C01992) create(list, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
            }
        }

        public AnonymousClass2(InterfaceC3103c<? super AnonymousClass2> interfaceC3103c) {
            super(2, interfaceC3103c);
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return DiagnosticEventObserver.this.new AnonymousClass2(interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass2) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            x0 x0Var;
            Object value;
            Boolean bool;
            a aVar = a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            InterfaceC0592c0 interfaceC0592c0 = DiagnosticEventObserver.this.isRunning;
            do {
                x0Var = (x0) interfaceC0592c0;
                value = x0Var.getValue();
                bool = (Boolean) value;
                bool.getClass();
            } while (!x0Var.i(value, Boolean.TRUE));
            boolean zBooleanValue = bool.booleanValue();
            C2515C c2515c = C2515C.f34653a;
            if (zBooleanValue) {
                return c2515c;
            }
            k0.u(new Z(DiagnosticEventObserver.this.diagnosticEventRepository.getDiagnosticEvents(), new C01992(DiagnosticEventObserver.this, null), 0), DiagnosticEventObserver.this.scope);
            return c2515c;
        }
    }

    public DiagnosticEventObserver(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull GetDiagnosticEventBatchRequest getDiagnosticEventBatchRequest, @NotNull A defaultDispatcher, @NotNull DiagnosticEventRepository diagnosticEventRepository, @NotNull UniversalRequestDataSource universalRequestDataSource, @NotNull BackgroundWorker backgroundWorker, @NotNull UniversalRequestEventSender universalRequestEventSender, @NotNull GetRequestPolicy diagnosticRequestPolicy) {
        AbstractC3340k.e(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        AbstractC3340k.e(getDiagnosticEventBatchRequest, "getDiagnosticEventBatchRequest");
        AbstractC3340k.e(defaultDispatcher, "defaultDispatcher");
        AbstractC3340k.e(diagnosticEventRepository, "diagnosticEventRepository");
        AbstractC3340k.e(universalRequestDataSource, "universalRequestDataSource");
        AbstractC3340k.e(backgroundWorker, "backgroundWorker");
        AbstractC3340k.e(universalRequestEventSender, "universalRequestEventSender");
        AbstractC3340k.e(diagnosticRequestPolicy, "diagnosticRequestPolicy");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.getDiagnosticEventBatchRequest = getDiagnosticEventBatchRequest;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.universalRequestEventSender = universalRequestEventSender;
        this.diagnosticRequestPolicy = diagnosticRequestPolicy;
        this.isRunning = k0.c(Boolean.FALSE);
        this.scope = H.c(defaultDispatcher.plus(new DiagnosticEventObserver$special$$inlined$CoroutineExceptionHandler$1(B.f3657a)));
    }

    @Nullable
    public final Object invoke(@NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) throws Throwable {
        Object objP = H.P(this.scope.getCoroutineContext(), new AnonymousClass2(null), interfaceC3103c);
        return objP == a.f39711a ? objP : C2515C.f34653a;
    }
}
