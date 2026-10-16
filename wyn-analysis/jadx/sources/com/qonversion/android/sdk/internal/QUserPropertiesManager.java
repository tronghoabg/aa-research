package com.qonversion.android.sdk.internal;

import android.app.Application;
import android.content.ContentResolver;
import android.os.Handler;
import android.os.HandlerThread;
import com.applovin.adview.a;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import com.qonversion.android.sdk.dto.properties.QUserProperties;
import com.qonversion.android.sdk.dto.properties.QUserProperty;
import com.qonversion.android.sdk.dto.properties.QUserPropertyKey;
import com.qonversion.android.sdk.internal.api.RequestTrigger;
import com.qonversion.android.sdk.internal.dto.QLaunchResult;
import com.qonversion.android.sdk.internal.dto.SendPropertiesResult;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.storage.PropertiesStorage;
import com.qonversion.android.sdk.listeners.QonversionEmptyCallback;
import com.qonversion.android.sdk.listeners.QonversionLaunchCallback;
import com.qonversion.android.sdk.listeners.QonversionUserPropertiesCallback;
import ef.C2515C;
import ff.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u0000 G2\u00020\u0001:\u0001GB9\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0012J\u0019\u0010\u0018\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00102\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001e\u0010\u0012J\u001d\u0010\"\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R$\u00104\u001a\u0004\u0018\u0001038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010?R\u0016\u0010A\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010BR\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001a0D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;", "Lcom/qonversion/android/sdk/internal/FacebookAttributionListener;", "Landroid/app/Application;", "context", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "repository", "Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;", "propertiesStorage", "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;", "delayCalculator", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "appStateProvider", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "logger", "<init>", "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/logger/Logger;)V", "Lef/C;", "fireCallbacks", "()V", "onAppBackground", "onAppForeground", "sendFacebookAttribution", "", "id", "onFbAttributionIdResult", "(Ljava/lang/String;)V", "Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;", "callback", "forceSendProperties", "(Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;)V", "retryPropertiesRequest", "Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "setUserProperty", "(Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;Ljava/lang/String;)V", "setCustomUserProperty", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;", "userProperties", "(Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;)V", "", "delaySec", "sendPropertiesWithDelay", "(I)V", "Landroid/app/Application;", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;", "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "Lcom/qonversion/android/sdk/internal/QProductCenterManager;", "productCenterManager", "Lcom/qonversion/android/sdk/internal/QProductCenterManager;", "getProductCenterManager$sdk_release", "()Lcom/qonversion/android/sdk/internal/QProductCenterManager;", "setProductCenterManager$sdk_release", "(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "", "isRequestInProgress", "Z", "isSendingScheduled", "retryDelay", "I", "retriesCounter", "", "completions", "Ljava/util/List;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QUserPropertiesManager implements FacebookAttributionListener {

    @NotNull
    private static final String LOOPER_THREAD_NAME = "userPropertiesThread";
    private static final int PROPERTY_UPLOAD_MIN_DELAY = 5;

    @NotNull
    private final AppStateProvider appStateProvider;

    @NotNull
    private List<QonversionEmptyCallback> completions;

    @NotNull
    private final Application context;

    @NotNull
    private final IncrementalDelayCalculator delayCalculator;

    @Nullable
    private Handler handler;
    private boolean isRequestInProgress;
    private boolean isSendingScheduled;

    @NotNull
    private final Logger logger;

    @Nullable
    private QProductCenterManager productCenterManager;

    @NotNull
    private PropertiesStorage propertiesStorage;

    @NotNull
    private final QRepository repository;
    private int retriesCounter;
    private int retryDelay;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;", "result", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QUserPropertiesManager$forceSendProperties$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        final /* synthetic */ Map<String, String> $properties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Map<String, String> map) {
            super(1);
            this.$properties = map;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SendPropertiesResult) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull SendPropertiesResult result) {
            AbstractC3340k.e(result, "result");
            QUserPropertiesManager.this.fireCallbacks();
            List<SendPropertiesResult.PropertyError> propertyErrors = result.getPropertyErrors();
            QUserPropertiesManager qUserPropertiesManager = QUserPropertiesManager.this;
            for (SendPropertiesResult.PropertyError propertyError : propertyErrors) {
                qUserPropertiesManager.logger.error("Failed to save property " + propertyError.getKey() + ": " + propertyError.getError());
            }
            QUserPropertiesManager.this.isRequestInProgress = false;
            QUserPropertiesManager.this.retriesCounter = 0;
            QUserPropertiesManager.this.retryDelay = 5;
            QUserPropertiesManager.this.propertiesStorage.clear(this.$properties);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "it", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QUserPropertiesManager$forceSendProperties$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements l {
        public AnonymousClass2() {
            super(1);
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((QonversionError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull QonversionError it) {
            AbstractC3340k.e(it, "it");
            QUserPropertiesManager.this.fireCallbacks();
            QUserPropertiesManager.this.isRequestInProgress = false;
            if (it.getCode() != QonversionErrorCode.InvalidClientUid) {
                QUserPropertiesManager.this.retryPropertiesRequest();
                return;
            }
            QProductCenterManager productCenterManager = QUserPropertiesManager.this.getProductCenterManager();
            if (productCenterManager != null) {
                RequestTrigger requestTrigger = RequestTrigger.UserProperties;
                final QUserPropertiesManager qUserPropertiesManager = QUserPropertiesManager.this;
                productCenterManager.launch(requestTrigger, new QonversionLaunchCallback() { // from class: com.qonversion.android.sdk.internal.QUserPropertiesManager.forceSendProperties.2.1
                    @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                    public void onError(@NotNull QonversionError error) {
                        AbstractC3340k.e(error, "error");
                        qUserPropertiesManager.retryPropertiesRequest();
                    }

                    @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                    public void onSuccess(@NotNull QLaunchResult launchResult) {
                        AbstractC3340k.e(launchResult, "launchResult");
                        qUserPropertiesManager.retryPropertiesRequest();
                    }
                });
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;", "properties", "Lef/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QUserPropertiesManager$userProperties$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21711 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionUserPropertiesCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21711(QonversionUserPropertiesCallback qonversionUserPropertiesCallback) {
            super(1);
            this.$callback = qonversionUserPropertiesCallback;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<QUserProperty>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull List<QUserProperty> properties) {
            AbstractC3340k.e(properties, "properties");
            this.$callback.onSuccess(new QUserProperties(properties));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QUserPropertiesManager$userProperties$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21722 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionUserPropertiesCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21722(QonversionUserPropertiesCallback qonversionUserPropertiesCallback) {
            super(1);
            this.$callback = qonversionUserPropertiesCallback;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((QonversionError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull QonversionError error) {
            AbstractC3340k.e(error, "error");
            this.$callback.onError(error);
        }
    }

    public QUserPropertiesManager(@NotNull Application context, @NotNull QRepository repository, @NotNull PropertiesStorage propertiesStorage, @NotNull IncrementalDelayCalculator delayCalculator, @NotNull AppStateProvider appStateProvider, @NotNull Logger logger) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(repository, "repository");
        AbstractC3340k.e(propertiesStorage, "propertiesStorage");
        AbstractC3340k.e(delayCalculator, "delayCalculator");
        AbstractC3340k.e(appStateProvider, "appStateProvider");
        AbstractC3340k.e(logger, "logger");
        this.context = context;
        this.repository = repository;
        this.propertiesStorage = propertiesStorage;
        this.delayCalculator = delayCalculator;
        this.appStateProvider = appStateProvider;
        this.logger = logger;
        this.retryDelay = 5;
        this.completions = new ArrayList();
        HandlerThread handlerThread = new HandlerThread(LOOPER_THREAD_NAME);
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireCallbacks() {
        List listS0 = o.S0(this.completions);
        this.completions.clear();
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            ((QonversionEmptyCallback) it.next()).onComplete();
        }
    }

    public static /* synthetic */ void forceSendProperties$default(QUserPropertiesManager qUserPropertiesManager, QonversionEmptyCallback qonversionEmptyCallback, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            qonversionEmptyCallback = null;
        }
        qUserPropertiesManager.forceSendProperties(qonversionEmptyCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendPropertiesWithDelay$lambda$1(QUserPropertiesManager this$0) {
        AbstractC3340k.e(this$0, "this$0");
        forceSendProperties$default(this$0, null, 1, null);
    }

    public final void forceSendProperties(@Nullable QonversionEmptyCallback callback) {
        if (this.isRequestInProgress) {
            if (callback != null) {
                this.completions.add(callback);
                return;
            }
            return;
        }
        Map<String, String> properties = this.propertiesStorage.getProperties();
        if (properties.isEmpty()) {
            if (callback != null) {
                callback.onComplete();
            }
        } else {
            if (callback != null) {
                this.completions.add(callback);
            }
            this.isRequestInProgress = true;
            this.isSendingScheduled = false;
            this.repository.sendProperties(properties, new AnonymousClass1(properties), new AnonymousClass2());
        }
    }

    @Nullable
    /* renamed from: getProductCenterManager$sdk_release, reason: from getter */
    public final QProductCenterManager getProductCenterManager() {
        return this.productCenterManager;
    }

    public final void onAppBackground() {
        forceSendProperties$default(this, null, 1, null);
    }

    public final void onAppForeground() {
        if (this.propertiesStorage.getProperties().isEmpty()) {
            return;
        }
        sendPropertiesWithDelay(this.retryDelay);
    }

    @Override // com.qonversion.android.sdk.internal.FacebookAttributionListener
    public void onFbAttributionIdResult(@Nullable String id2) {
        if (id2 == null) {
            return;
        }
        setCustomUserProperty(QUserPropertyKey.FacebookAttribution.getUserPropertyCode(), id2);
    }

    public final void retryPropertiesRequest() {
        int i5 = this.retriesCounter + 1;
        this.retriesCounter = i5;
        try {
            int iCountDelay = this.delayCalculator.countDelay(5, i5);
            this.retryDelay = iCountDelay;
            sendPropertiesWithDelay(iCountDelay);
        } catch (IllegalArgumentException e7) {
            this.logger.error("The error occurred during properties sending. " + e7);
        }
    }

    public final void sendFacebookAttribution() {
        try {
            FacebookAttribution facebookAttribution = new FacebookAttribution();
            ContentResolver contentResolver = this.context.getContentResolver();
            AbstractC3340k.d(contentResolver, "getContentResolver(...)");
            facebookAttribution.getAttributionId(contentResolver, this);
        } catch (IllegalStateException e7) {
            this.logger.error("Failed to retrieve facebook attribution " + e7.getLocalizedMessage());
        }
    }

    public final void sendPropertiesWithDelay(int delaySec) {
        if (this.appStateProvider.getAppState().isBackground()) {
            return;
        }
        long jSecondsToMilliSeconds = ExtensionsKt.secondsToMilliSeconds(delaySec);
        this.isSendingScheduled = true;
        Handler handler = this.handler;
        if (handler != null) {
            handler.postDelayed(new a(this, 12), jSecondsToMilliSeconds);
        }
    }

    public final void setCustomUserProperty(@NotNull String key, @NotNull String value) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(value, "value");
        if (value.length() == 0) {
            return;
        }
        this.propertiesStorage.save(key, value);
        if (this.isSendingScheduled) {
            return;
        }
        sendPropertiesWithDelay(this.retryDelay);
    }

    public final void setProductCenterManager$sdk_release(@Nullable QProductCenterManager qProductCenterManager) {
        this.productCenterManager = qProductCenterManager;
    }

    public final void setUserProperty(@NotNull QUserPropertyKey key, @NotNull String value) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(value, "value");
        if (key == QUserPropertyKey.Custom) {
            this.logger.error("Can not set user property with the key `QUserPropertyKey.Custom`. To set custom user property, use the `setCustomUserProperty` method.");
        } else {
            setCustomUserProperty(key.getUserPropertyCode(), value);
        }
    }

    public final void userProperties(@NotNull QonversionUserPropertiesCallback callback) {
        AbstractC3340k.e(callback, "callback");
        this.repository.getProperties(new C21711(callback), new C21722(callback));
    }
}
