package com.unity3d.services.core.request.metrics;

import Bf.k;
import Ef.B;
import Ef.E;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.IServicesRegistry;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.properties.InitializationStatusReader;
import ef.C2515C;
import java.util.List;
import java.util.Map;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.I;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;
import tf.p;
import vf.AbstractC4345a;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010$\u001a\n #*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/unity3d/services/core/request/metrics/MetricSender;", "Lcom/unity3d/services/core/request/metrics/MetricSenderBase;", "Lcom/unity3d/services/core/di/IServiceComponent;", "Lcom/unity3d/services/core/configuration/Configuration;", "configuration", "Lcom/unity3d/services/core/properties/InitializationStatusReader;", "initializationStatusReader", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/services/core/configuration/Configuration;Lcom/unity3d/services/core/properties/InitializationStatusReader;Lcom/unity3d/ads/core/log/Logger;)V", "", "event", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "", "tags", "Lef/C;", "sendEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/unity3d/services/core/request/metrics/Metric;", "metric", "sendMetric", "(Lcom/unity3d/services/core/request/metrics/Metric;)V", "", "metrics", "sendMetrics", "(Ljava/util/List;)V", "shutdown", "()V", "Lcom/unity3d/ads/core/log/Logger;", "Lcom/unity3d/services/core/request/metrics/MetricCommonTags;", "commonTags", "Lcom/unity3d/services/core/request/metrics/MetricCommonTags;", "metricSampleRate", "Ljava/lang/String;", "kotlin.jvm.PlatformType", "sessionToken", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "httpClientProvider", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "LEf/E;", "scope", "LEf/E;", "metricEndPoint", "getMetricEndPoint", "()Ljava/lang/String;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public class MetricSender extends MetricSenderBase implements IServiceComponent {

    @NotNull
    private final MetricCommonTags commonTags;

    @NotNull
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final HttpClientProvider httpClientProvider;

    @NotNull
    private final Logger logger;

    @Nullable
    private final String metricEndPoint;

    @NotNull
    private final String metricSampleRate;

    @NotNull
    private final E scope;
    private final String sessionToken;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lef/C;", "<anonymous>", "(LEf/E;)V"}, k = 3, mv = {1, 8, 0})
    @InterfaceC3466e(c = "com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1", f = "MetricSender.kt", l = {66, 66}, m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.request.metrics.MetricSender$sendMetrics$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3471j implements p {
        final /* synthetic */ List<Metric> $metrics;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<Metric> list, InterfaceC3103c<? super AnonymousClass1> interfaceC3103c) {
            super(2, interfaceC3103c);
            this.$metrics = list;
        }

        @Override // lf.AbstractC3462a
        @NotNull
        public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
            return MetricSender.this.new AnonymousClass1(this.$metrics, interfaceC3103c);
        }

        @Override // tf.p
        @Nullable
        public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
            return ((AnonymousClass1) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
        
            if (r0 == r6) goto L19;
         */
        @Override // lf.AbstractC3462a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r30) {
            /*
                Method dump skipped, instructions count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.request.metrics.MetricSender.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender(@NotNull Configuration configuration, @NotNull InitializationStatusReader initializationStatusReader, @NotNull Logger logger) {
        super(initializationStatusReader);
        AbstractC3340k.e(configuration, "configuration");
        AbstractC3340k.e(initializationStatusReader, "initializationStatusReader");
        AbstractC3340k.e(logger, "logger");
        this.logger = logger;
        MetricCommonTags metricCommonTags = new MetricCommonTags();
        metricCommonTags.updateWithConfig(configuration);
        this.commonTags = metricCommonTags;
        this.metricSampleRate = String.valueOf(AbstractC4345a.G(configuration.getMetricSampleRate()));
        this.sessionToken = configuration.getSessionToken();
        IServicesRegistry registry = getServiceProvider().getRegistry();
        I i5 = H.f39741a;
        ISDKDispatchers iSDKDispatchers = (ISDKDispatchers) registry.getService("", i5.getOrCreateKotlinClass(ISDKDispatchers.class));
        this.dispatchers = iSDKDispatchers;
        this.httpClientProvider = (HttpClientProvider) getServiceProvider().getRegistry().getService("", i5.getOrCreateKotlinClass(HttpClientProvider.class));
        this.scope = Ef.H.c(iSDKDispatchers.getIo());
        this.metricEndPoint = configuration.getMetricsUrl();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    @Nullable
    public String getMetricEndPoint() {
        return this.metricEndPoint;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(@NotNull String event, @Nullable String value, @NotNull Map<String, String> tags) {
        AbstractC3340k.e(event, "event");
        AbstractC3340k.e(tags, "tags");
        if (event.length() == 0) {
            Logger.DefaultImpls.trace$default(this.logger, "Metric event not sent due to being null or empty: ".concat(event), null, 2, null);
        } else {
            sendMetrics(AbstractC3935e.C(new Metric(event, value, tags)));
        }
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(@NotNull Metric metric) {
        AbstractC3340k.e(metric, "metric");
        sendMetrics(AbstractC3935e.C(metric));
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetrics(@NotNull List<Metric> metrics) {
        AbstractC3340k.e(metrics, "metrics");
        if (metrics.isEmpty()) {
            Logger.DefaultImpls.trace$default(this.logger, "Metrics event not send due to being empty", null, 2, null);
            return;
        }
        String metricEndPoint = getMetricEndPoint();
        if (metricEndPoint != null && !k.y0(metricEndPoint)) {
            Ef.H.D(this.scope, new MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(B.f3657a, this, metrics), new AnonymousClass1(metrics, null), 2);
            return;
        }
        Logger.DefaultImpls.trace$default(this.logger, "Metrics: " + metrics + " was not sent to null or empty endpoint: " + getMetricEndPoint(), null, 2, null);
    }

    public final void shutdown() {
        this.commonTags.shutdown();
    }
}
