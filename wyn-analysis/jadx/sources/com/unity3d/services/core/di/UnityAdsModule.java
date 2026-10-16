package com.unity3d.services.core.di;

import Ef.A;
import Ef.C;
import Ef.C0505o0;
import Ef.D;
import Ef.E;
import Ef.H;
import Ef.InterfaceC0501m0;
import Ef.S;
import Jf.n;
import Lf.d;
import Lf.e;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.ByteStringSerializer;
import com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryAsyncTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import gatewayprotocol.v1.AdOperationsConfigurationKt;
import gatewayprotocol.v1.DiagnosticEventsConfigurationKt;
import gatewayprotocol.v1.FeatureFlagsKt;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;
import tf.a;
import u1.C4221j;
import u1.InterfaceC4215d;
import u1.InterfaceC4220i;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0019J%\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u0019J%\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u0019J%\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u0019J%\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u0019J%\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010\u0019J%\u0010 \u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b \u0010\u0019J%\u0010!\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\u0019J%\u0010\"\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010\u0019J\u0015\u0010%\u001a\u00020\u00152\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J#\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0007¢\u0006\u0004\b+\u0010,J#\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0007¢\u0006\u0004\b-\u0010,J#\u0010.\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0007¢\u0006\u0004\b.\u0010,J#\u0010/\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0007¢\u0006\u0004\b/\u0010,J1\u00102\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00072\f\u00101\u001a\b\u0012\u0004\u0012\u00020*00¢\u0006\u0004\b2\u00103J#\u00104\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0007¢\u0006\u0004\b4\u0010,J#\u00106\u001a\b\u0012\u0004\u0012\u0002050)2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0007¢\u0006\u0004\b6\u0010,J\u001d\u0010;\u001a\u00020:2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u000f¢\u0006\u0004\b;\u0010<J\u0015\u0010@\u001a\u00020?2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b@\u0010AJ\r\u0010C\u001a\u00020B¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020B¢\u0006\u0004\bE\u0010DJ\r\u0010F\u001a\u00020B¢\u0006\u0004\bF\u0010DJ\r\u0010H\u001a\u00020G¢\u0006\u0004\bH\u0010IJ\u001b\u0010L\u001a\u00020K2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020*0)¢\u0006\u0004\bL\u0010MJ\u001b\u0010-\u001a\u00020K2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020*0)¢\u0006\u0004\b-\u0010MJ\u001b\u0010N\u001a\u00020K2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020*0)¢\u0006\u0004\bN\u0010MJ\u001b\u0010O\u001a\u00020K2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020*0)¢\u0006\u0004\bO\u0010MJ\u001b\u0010.\u001a\u00020K2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020*0)¢\u0006\u0004\b.\u0010MJ\u001b\u0010/\u001a\u00020K2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020*0)¢\u0006\u0004\b/\u0010MJ\u001b\u00102\u001a\u00020K2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020*0)¢\u0006\u0004\b2\u0010MJ\u001b\u00104\u001a\u00020K2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020*0)¢\u0006\u0004\b4\u0010MJ\u001d\u0010Q\u001a\u00020P2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\bQ\u0010RJ\u001d\u0010T\u001a\u00020S2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\bT\u0010UJ\u0017\u0010X\u001a\u00020B2\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0004\bX\u0010YJ\u001d\u0010Z\u001a\u00020K2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002¢\u0006\u0004\bZ\u0010MJ-\u0010]\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00072\u0006\u0010\\\u001a\u00020[H\u0002¢\u0006\u0004\b]\u0010^J\u000f\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\b`\u0010aJ\u000f\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\bc\u0010dJ\u000f\u0010f\u001a\u00020eH\u0002¢\u0006\u0004\bf\u0010gJ\u000f\u0010i\u001a\u00020hH\u0002¢\u0006\u0004\bi\u0010j¨\u0006k"}, d2 = {"Lcom/unity3d/services/core/di/UnityAdsModule;", "", "<init>", "()V", "Landroid/content/Context;", "androidContext", "()Landroid/content/Context;", "LEf/A;", "mainDispatcher", "()LEf/A;", "defaultDispatcher", "ioDispatcher", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "sdkDispatchers", "()Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "sdkMetrics", "()Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "dispatchers", "LEf/C;", "errorHandler", "LEf/m0;", "parentJob", "LEf/E;", "initCoroutineScope", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;LEf/C;LEf/m0;)LEf/E;", "loadCoroutineScope", "showCoroutineScope", "transactionCoroutineScope", "ilrdCoroutineScope", "lifecycleCoroutineScope", "getTokenCoroutineScope", "scarSignalsCoroutineScope", "offerwallSignalsCoroutineScope", "omidCoroutineScope", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "diagnosticEventRepository", "publicApiJob", "(Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;)LEf/m0;", "context", "dispatcher", "Lu1/i;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "gatewayDataStore", "(Landroid/content/Context;LEf/A;)Lu1/i;", "privacyDataStore", "privacyFsmDataStore", "nativeConfigurationDataStore", "Lu1/d;", "fetchGLInfo", "glInfoDataStore", "(Landroid/content/Context;LEf/A;Lu1/d;)Lu1/i;", "iapTransactionDataStore", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "webViewConfigurationDataStore", "Lcom/unity3d/services/ads/token/TokenStorage;", "tokenStorage", "sdkMetricsSender", "Lcom/unity3d/services/ads/token/AsyncTokenStorage;", "asyncTokenStorage", "(Lcom/unity3d/services/ads/token/TokenStorage;Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;)Lcom/unity3d/services/ads/token/AsyncTokenStorage;", "Lcom/unity3d/services/core/device/VolumeChange;", "volumeChange", "Lcom/unity3d/services/core/device/VolumeChangeMonitor;", "volumeChangeMonitor", "(Lcom/unity3d/services/core/device/VolumeChange;)Lcom/unity3d/services/core/device/VolumeChangeMonitor;", "Lcom/unity3d/services/core/misc/JsonStorage;", "publicJsonStorage", "()Lcom/unity3d/services/core/misc/JsonStorage;", "privateJsonStorage", "memoryJsonStorage", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "defaultNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "dataStore", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "gatewayCacheDataStore", "(Lu1/i;)Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "idfiDataStore", "auidDataStore", "Lcom/unity3d/services/ads/measurements/MeasurementsService;", "measurementService", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;)Lcom/unity3d/services/ads/measurements/MeasurementsService;", "Lcom/unity3d/services/ads/topics/TopicsService;", "topicsService", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;)Lcom/unity3d/services/ads/topics/TopicsService;", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "storageType", "provideJsonStorage", "(Lcom/unity3d/services/core/device/StorageManager$StorageType;)Lcom/unity3d/services/core/misc/JsonStorage;", "provideByteStringDataSource", "", "dataStoreFile", "provideByteStringDataStore", "(Landroid/content/Context;LEf/A;Ljava/lang/String;)Lu1/i;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "getDefaultAdOperations", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "getDefaultRequestPolicy", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "getDefaultRequestRetryPolicy", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestRetryPolicy;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "getDefaultRequestTimeoutPolicy", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestTimeoutPolicy;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UnityAdsModule {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.services.core.di.UnityAdsModule$glInfoDataStore$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // tf.a
        @NotNull
        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, ServiceProvider.DATA_STORE_GL_INFO);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.services.core.di.UnityAdsModule$provideByteStringDataStore$1, reason: invalid class name and case insensitive filesystem */
    public static final class C23711 extends AbstractC3343n implements a {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $dataStoreFile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23711(Context context, String str) {
            super(0);
            this.$context = context;
            this.$dataStoreFile = str;
        }

        @Override // tf.a
        @NotNull
        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, this.$dataStoreFile);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.services.core.di.UnityAdsModule$webViewConfigurationDataStore$1, reason: invalid class name and case insensitive filesystem */
    public static final class C23721 extends AbstractC3343n implements a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23721(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // tf.a
        @NotNull
        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, ServiceProvider.DATA_STORE_WEBVIEW_CONFIG);
        }
    }

    private final NativeConfigurationOuterClass.AdOperationsConfiguration getDefaultAdOperations() {
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        AbstractC3340k.d(builderNewBuilder, "newBuilder()");
        AdOperationsConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setLoadTimeoutMs(30000);
        dsl_create.setShowTimeoutMs(10000);
        dsl_create.setGetTokenTimeoutMs(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestPolicy getDefaultRequestPolicy() {
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        AbstractC3340k.d(builderNewBuilder, "newBuilder()");
        RequestPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setRetryPolicy(getDefaultRequestRetryPolicy());
        dsl_create.setTimeoutPolicy(getDefaultRequestTimeoutPolicy());
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestRetryPolicy getDefaultRequestRetryPolicy() {
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        AbstractC3340k.d(builderNewBuilder, "newBuilder()");
        RequestRetryPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setMaxDuration(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        dsl_create.setRetryWaitBase(500);
        dsl_create.setRetryJitterPct(0.1f);
        dsl_create.setShouldStoreLocally(false);
        dsl_create.setRetryMaxInterval(UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL);
        dsl_create.setRetryScalingFactor(2.0f);
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestTimeoutPolicy getDefaultRequestTimeoutPolicy() {
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder();
        AbstractC3340k.d(builderNewBuilder, "newBuilder()");
        RequestTimeoutPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setConnectTimeoutMs(30000);
        dsl_create.setReadTimeoutMs(30000);
        dsl_create.setWriteTimeoutMs(30000);
        dsl_create.setOverallTimeoutMs(30000);
        return dsl_create._build();
    }

    private final ByteStringDataSource provideByteStringDataSource(InterfaceC4220i dataStore) {
        return new AndroidByteStringDataSource(dataStore);
    }

    private final InterfaceC4220i provideByteStringDataStore(Context context, A dispatcher, String dataStoreFile) {
        return C4221j.a(new ByteStringSerializer(), null, null, H.c(dispatcher.plus(H.f())), new C23711(context, dataStoreFile), 4);
    }

    private final JsonStorage provideJsonStorage(StorageManager.StorageType storageType) {
        if (!StorageManager.init(ClientProperties.getApplicationContext())) {
            throw new IllegalStateException("StorageManager failed to initialize");
        }
        Storage storage = StorageManager.getStorage(storageType);
        AbstractC3340k.d(storage, "getStorage(storageType)");
        return storage;
    }

    @NotNull
    public final Context androidContext() {
        Context applicationContext = ClientProperties.getApplicationContext();
        AbstractC3340k.d(applicationContext, "getApplicationContext()");
        return applicationContext;
    }

    @NotNull
    public final AsyncTokenStorage asyncTokenStorage(@NotNull TokenStorage tokenStorage, @NotNull SDKMetricsSender sdkMetricsSender) {
        AbstractC3340k.e(tokenStorage, "tokenStorage");
        AbstractC3340k.e(sdkMetricsSender, "sdkMetricsSender");
        return new InMemoryAsyncTokenStorage(null, new Handler(Looper.getMainLooper()), sdkMetricsSender, tokenStorage);
    }

    @NotNull
    public final ByteStringDataSource auidDataStore(@NotNull InterfaceC4220i dataStore) {
        AbstractC3340k.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final A defaultDispatcher() {
        return S.f3698a;
    }

    @NotNull
    public final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration() {
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.NativeConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        AbstractC3340k.d(builderNewBuilder, "newBuilder()");
        NativeConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setAdOperations(getDefaultAdOperations());
        dsl_create.setInitPolicy(getDefaultRequestPolicy());
        dsl_create.setAdPolicy(getDefaultRequestPolicy());
        dsl_create.setOtherPolicy(getDefaultRequestPolicy());
        dsl_create.setOperativeEventPolicy(getDefaultRequestPolicy());
        DiagnosticEventsConfigurationKt.Dsl.Companion companion2 = DiagnosticEventsConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builderNewBuilder2 = NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        AbstractC3340k.d(builderNewBuilder2, "newBuilder()");
        DiagnosticEventsConfigurationKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setEnabled(true);
        dsl_create2.setMaxBatchSize(10);
        dsl_create2.setMaxBatchIntervalMs(30000);
        dsl_create2.setTtmEnabled(false);
        dsl_create.setDiagnosticEvents(dsl_create2._build());
        FeatureFlagsKt.Dsl.Companion companion3 = FeatureFlagsKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.FeatureFlags.Builder builderNewBuilder3 = NativeConfigurationOuterClass.FeatureFlags.newBuilder();
        AbstractC3340k.d(builderNewBuilder3, "newBuilder()");
        FeatureFlagsKt.Dsl dsl_create3 = companion3._create(builderNewBuilder3);
        dsl_create3.setBoldSdkNextSessionEnabled(true);
        dsl_create.setFeatureFlags(dsl_create3._build());
        dsl_create.setMaxExtrasSizeKb(4);
        return dsl_create._build();
    }

    @NotNull
    public final ByteStringDataSource gatewayCacheDataStore(@NotNull InterfaceC4220i dataStore) {
        AbstractC3340k.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final InterfaceC4220i gatewayDataStore(@NotNull Context context, @NotNull A dispatcher) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_GATEWAY_CACHE);
    }

    @NotNull
    public final E getTokenCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull C errorHandler, @NotNull InterfaceC0501m0 parentJob) {
        AbstractC3340k.e(dispatchers, "dispatchers");
        AbstractC3340k.e(errorHandler, "errorHandler");
        AbstractC3340k.e(parentJob, "parentJob");
        return H.c(parentJob.plus(dispatchers.getDefault()).plus(new D(ServiceProvider.NAMED_GET_TOKEN_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final InterfaceC4220i glInfoDataStore(@NotNull Context context, @NotNull A dispatcher, @NotNull InterfaceC4215d fetchGLInfo) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(dispatcher, "dispatcher");
        AbstractC3340k.e(fetchGLInfo, "fetchGLInfo");
        return C4221j.a(new ByteStringSerializer(), null, AbstractC3935e.C(fetchGLInfo), H.c(dispatcher.plus(H.f())), new AnonymousClass1(context), 2);
    }

    @NotNull
    public final InterfaceC4220i iapTransactionDataStore(@NotNull Context context, @NotNull A dispatcher) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_IAP_TRANSACTION);
    }

    @NotNull
    public final ByteStringDataSource idfiDataStore(@NotNull InterfaceC4220i dataStore) {
        AbstractC3340k.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final E ilrdCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull C errorHandler, @NotNull InterfaceC0501m0 parentJob) {
        AbstractC3340k.e(dispatchers, "dispatchers");
        AbstractC3340k.e(errorHandler, "errorHandler");
        AbstractC3340k.e(parentJob, "parentJob");
        return H.c(parentJob.plus(dispatchers.getDefault()).plus(new D(ServiceProvider.NAMED_ILRD_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final E initCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull C errorHandler, @NotNull InterfaceC0501m0 parentJob) {
        AbstractC3340k.e(dispatchers, "dispatchers");
        AbstractC3340k.e(errorHandler, "errorHandler");
        AbstractC3340k.e(parentJob, "parentJob");
        return H.c(parentJob.plus(dispatchers.getDefault()).plus(new D(ServiceProvider.NAMED_INIT_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final A ioDispatcher() {
        e eVar = S.f3698a;
        return d.f7120b;
    }

    @NotNull
    public final E lifecycleCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull C errorHandler, @NotNull InterfaceC0501m0 parentJob) {
        AbstractC3340k.e(dispatchers, "dispatchers");
        AbstractC3340k.e(errorHandler, "errorHandler");
        AbstractC3340k.e(parentJob, "parentJob");
        return H.c(parentJob.plus(dispatchers.getDefault()).plus(new D(ServiceProvider.NAMED_LIFECYCLE_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final E loadCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull C errorHandler, @NotNull InterfaceC0501m0 parentJob) {
        AbstractC3340k.e(dispatchers, "dispatchers");
        AbstractC3340k.e(errorHandler, "errorHandler");
        AbstractC3340k.e(parentJob, "parentJob");
        return H.c(parentJob.plus(dispatchers.getDefault()).plus(new D(ServiceProvider.NAMED_LOAD_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final A mainDispatcher() {
        e eVar = S.f3698a;
        return n.f6132a;
    }

    @NotNull
    public final MeasurementsService measurementService(@NotNull Context context, @NotNull ISDKDispatchers dispatchers) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(dispatchers, "dispatchers");
        return new MeasurementsService(context, dispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    @NotNull
    public final JsonStorage memoryJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.MEMORY);
    }

    @NotNull
    public final InterfaceC4220i nativeConfigurationDataStore(@NotNull Context context, @NotNull A dispatcher) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_NATIVE_CONFIG);
    }

    @NotNull
    public final E offerwallSignalsCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull C errorHandler, @NotNull InterfaceC0501m0 parentJob) {
        AbstractC3340k.e(dispatchers, "dispatchers");
        AbstractC3340k.e(errorHandler, "errorHandler");
        AbstractC3340k.e(parentJob, "parentJob");
        return H.c(parentJob.plus(dispatchers.getDefault()).plus(new D(ServiceProvider.NAMED_OFFERWALL_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final E omidCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull C errorHandler, @NotNull InterfaceC0501m0 parentJob) {
        AbstractC3340k.e(dispatchers, "dispatchers");
        AbstractC3340k.e(errorHandler, "errorHandler");
        AbstractC3340k.e(parentJob, "parentJob");
        return H.c(parentJob.plus(dispatchers.getDefault()).plus(new D(ServiceProvider.NAMED_OMID_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final InterfaceC4220i privacyDataStore(@NotNull Context context, @NotNull A dispatcher) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_PRIVACY);
    }

    @NotNull
    public final InterfaceC4220i privacyFsmDataStore(@NotNull Context context, @NotNull A dispatcher) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_PRIVACY_FSM);
    }

    @NotNull
    public final JsonStorage privateJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PRIVATE);
    }

    @NotNull
    public final InterfaceC0501m0 publicApiJob(@NotNull DiagnosticEventRepository diagnosticEventRepository) {
        AbstractC3340k.e(diagnosticEventRepository, "diagnosticEventRepository");
        C0505o0 c0505o0D = H.d();
        c0505o0D.invokeOnCompletion(new UnityAdsModule$publicApiJob$1$1(diagnosticEventRepository));
        return c0505o0D;
    }

    @NotNull
    public final JsonStorage publicJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PUBLIC);
    }

    @NotNull
    public final E scarSignalsCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull C errorHandler, @NotNull InterfaceC0501m0 parentJob) {
        AbstractC3340k.e(dispatchers, "dispatchers");
        AbstractC3340k.e(errorHandler, "errorHandler");
        AbstractC3340k.e(parentJob, "parentJob");
        return H.c(parentJob.plus(dispatchers.getDefault()).plus(new D(ServiceProvider.NAMED_SCAR_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final ISDKDispatchers sdkDispatchers() {
        return new SDKDispatchers();
    }

    @NotNull
    public final SDKMetricsSender sdkMetrics() {
        SDKMetricsSender sDKMetrics = SDKMetrics.getInstance();
        AbstractC3340k.d(sDKMetrics, "getInstance()");
        return sDKMetrics;
    }

    @NotNull
    public final E showCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull C errorHandler, @NotNull InterfaceC0501m0 parentJob) {
        AbstractC3340k.e(dispatchers, "dispatchers");
        AbstractC3340k.e(errorHandler, "errorHandler");
        AbstractC3340k.e(parentJob, "parentJob");
        return H.c(parentJob.plus(dispatchers.getDefault()).plus(new D(ServiceProvider.NAMED_SHOW_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final TopicsService topicsService(@NotNull Context context, @NotNull ISDKDispatchers dispatchers) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(dispatchers, "dispatchers");
        return new TopicsService(context, dispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    @NotNull
    public final E transactionCoroutineScope(@NotNull ISDKDispatchers dispatchers, @NotNull C errorHandler, @NotNull InterfaceC0501m0 parentJob) {
        AbstractC3340k.e(dispatchers, "dispatchers");
        AbstractC3340k.e(errorHandler, "errorHandler");
        AbstractC3340k.e(parentJob, "parentJob");
        return H.c(parentJob.plus(dispatchers.getDefault()).plus(new D(ServiceProvider.NAMED_TRANSACTION_SCOPE)).plus(errorHandler));
    }

    @NotNull
    public final VolumeChangeMonitor volumeChangeMonitor(@NotNull VolumeChange volumeChange) {
        AbstractC3340k.e(volumeChange, "volumeChange");
        return new VolumeChangeMonitor(SharedInstances.INSTANCE.getWebViewEventSender(), volumeChange);
    }

    @NotNull
    public final InterfaceC4220i webViewConfigurationDataStore(@NotNull Context context, @NotNull A dispatcher) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(dispatcher, "dispatcher");
        return C4221j.a(new WebViewConfigurationStoreSerializer(), null, null, H.c(dispatcher.plus(H.f())), new C23721(context), 4);
    }

    @NotNull
    public final ByteStringDataSource iapTransactionDataStore(@NotNull InterfaceC4220i dataStore) {
        AbstractC3340k.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource nativeConfigurationDataStore(@NotNull InterfaceC4220i dataStore) {
        AbstractC3340k.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource privacyDataStore(@NotNull InterfaceC4220i dataStore) {
        AbstractC3340k.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource privacyFsmDataStore(@NotNull InterfaceC4220i dataStore) {
        AbstractC3340k.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource glInfoDataStore(@NotNull InterfaceC4220i dataStore) {
        AbstractC3340k.e(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }
}
