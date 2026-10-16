package com.unity3d.services;

import Ef.A;
import Ef.B;
import Ef.C;
import Ef.D;
import Ef.E;
import Ef.H;
import Fe.e;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CoroutineOpportunity;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import ef.C2515C;
import gf.C2759f;
import java.util.Map;
import jf.InterfaceC3103c;
import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 /2\u00020\u0001:\u0001/B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/unity3d/services/SDKErrorHandler;", "LEf/C;", "LEf/A;", "defaultDispatcher", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "alternativeFlowReader", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "sdkMetricsSender", "<init>", "(LEf/A;Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;)V", "", MediationMetaData.KEY_NAME, "reason", "scopeName", "stackTrace", "Lcom/google/protobuf/ByteString;", "opportunityId", "Lef/C;", "sendDiagnostic", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/ByteString;)V", "Lcom/unity3d/services/core/request/metrics/Metric;", "metric", "sendMetric", "(Lcom/unity3d/services/core/request/metrics/Metric;)V", "Ljf/h;", "context", "retrieveCoroutineName", "(Ljf/h;)Ljava/lang/String;", "retrieveOpportunityId", "(Ljf/h;)Lcom/google/protobuf/ByteString;", "", "exception", "handleException", "(Ljf/h;Ljava/lang/Throwable;)V", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "LEf/E;", "scope", "LEf/E;", "LEf/B;", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "LEf/B;", "getKey", "()LEf/B;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SDKErrorHandler implements C {

    @NotNull
    public static final String UNITY_PACKAGE = "com.unity3d";

    @NotNull
    public static final String UNKNOWN_FILE = "unknown";

    @NotNull
    private final AlternativeFlowReader alternativeFlowReader;

    @NotNull
    private final B key;

    @NotNull
    private final E scope;

    @NotNull
    private final SDKMetricsSender sdkMetricsSender;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.services.SDKErrorHandler$handleException$1", f = "SDKErrorHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.services.SDKErrorHandler$handleException$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3471j implements p {
        final /* synthetic */ InterfaceC3108h $context;
        final /* synthetic */ Throwable $exception;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC3108h interfaceC3108h, Throwable th, InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$context = interfaceC3108h;
            this.$exception = th;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return SDKErrorHandler.this.new AnonymousClass1(this.$context, this.$exception, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        @Override // lf.AbstractC3462a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.f39711a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
            String strRetrieveCoroutineName = SDKErrorHandler.this.retrieveCoroutineName(this.$context);
            ByteString byteStringRetrieveOpportunityId = SDKErrorHandler.this.retrieveOpportunityId(this.$context);
            Throwable th = this.$exception;
            String str = th instanceof NullPointerException ? "native_exception_npe" : th instanceof OutOfMemoryError ? "native_exception_oom" : th instanceof IllegalStateException ? "native_exception_ise" : th instanceof SecurityException ? "native_exception_se" : th instanceof RuntimeException ? "native_exception_re" : "native_exception";
            boolean zInvoke = SDKErrorHandler.this.alternativeFlowReader.invoke();
            String strRetrieveUnityCrashValue = ExceptionExtensionsKt.retrieveUnityCrashValue(this.$exception);
            DeviceLog.error("Unity Ads SDK encountered an exception: " + strRetrieveUnityCrashValue);
            if (zInvoke) {
                SDKErrorHandler.this.sendDiagnostic(str, strRetrieveUnityCrashValue, strRetrieveCoroutineName, ExceptionExtensionsKt.getShortenedStackTrace(this.$exception, 15), byteStringRetrieveOpportunityId);
            } else {
                SDKErrorHandler.this.sendMetric(new Metric(str, strRetrieveUnityCrashValue, null, 4, null));
            }
            return C2515C.f34653a;
        }
    }

    public SDKErrorHandler(@NotNull A defaultDispatcher, @NotNull AlternativeFlowReader alternativeFlowReader, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull SDKMetricsSender sdkMetricsSender) {
        AbstractC3340k.e(defaultDispatcher, "defaultDispatcher");
        AbstractC3340k.e(alternativeFlowReader, "alternativeFlowReader");
        AbstractC3340k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC3340k.e(sdkMetricsSender, "sdkMetricsSender");
        this.alternativeFlowReader = alternativeFlowReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sdkMetricsSender = sdkMetricsSender;
        Kd.a aVarF = H.F(H.c(defaultDispatcher), new D("SDKErrorHandler"));
        B b5 = B.f3657a;
        this.scope = H.F(aVarF, new SDKErrorHandler$special$$inlined$CoroutineExceptionHandler$1(b5));
        this.key = b5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String retrieveCoroutineName(InterfaceC3108h context) {
        String str;
        D d3 = (D) context.get(D.f3659b);
        return (d3 == null || (str = d3.f3660a) == null) ? "unknown" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ByteString retrieveOpportunityId(InterfaceC3108h context) {
        CoroutineOpportunity coroutineOpportunity = (CoroutineOpportunity) context.get(CoroutineOpportunity.INSTANCE);
        if (coroutineOpportunity != null) {
            return coroutineOpportunity.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendDiagnostic(String name, String reason, String scopeName, String stackTrace, ByteString opportunityId) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        C2759f c2759f = new C2759f();
        c2759f.put("reason", reason);
        c2759f.put("reason_debug", stackTrace);
        c2759f.put("coroutine_name", scopeName);
        if (opportunityId != null) {
            String string = ProtobufExtensionsKt.toUUID(opportunityId).toString();
            AbstractC3340k.d(string, "it.toUUID().toString()");
            c2759f.put("impressionOpportunityId", string);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, name, (Double) null, c2759f.c(), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMetric(Metric metric) {
        this.sdkMetricsSender.sendMetric(metric);
    }

    @Override // jf.InterfaceC3108h
    public <R> R fold(R r10, @NotNull p pVar) {
        return (R) e.B(this, r10, pVar);
    }

    @Override // jf.InterfaceC3108h
    @Nullable
    public <E extends InterfaceC3106f> E get(@NotNull InterfaceC3107g interfaceC3107g) {
        return (E) e.C(this, interfaceC3107g);
    }

    @Override // Ef.C
    public void handleException(@NotNull InterfaceC3108h context, @NotNull Throwable exception) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(exception, "exception");
        H.D(this.scope, null, new AnonymousClass1(context, exception, null), 3);
    }

    @Override // jf.InterfaceC3108h
    @NotNull
    public InterfaceC3108h minusKey(@NotNull InterfaceC3107g interfaceC3107g) {
        return e.N(this, interfaceC3107g);
    }

    @Override // jf.InterfaceC3108h
    @NotNull
    public InterfaceC3108h plus(@NotNull InterfaceC3108h interfaceC3108h) {
        return e.O(this, interfaceC3108h);
    }

    @Override // jf.InterfaceC3106f
    @NotNull
    public B getKey() {
        return this.key;
    }
}
