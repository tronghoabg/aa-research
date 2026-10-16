package com.qonversion.android.sdk.automations.internal;

import N0.a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.qonversion.android.sdk.automations.AutomationsDelegate;
import com.qonversion.android.sdk.automations.ScreenCustomizationDelegate;
import com.qonversion.android.sdk.automations.dto.AutomationsEvent;
import com.qonversion.android.sdk.automations.dto.QActionResult;
import com.qonversion.android.sdk.automations.dto.QScreenPresentationConfig;
import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import com.qonversion.android.sdk.internal.ExtensionsKt;
import com.qonversion.android.sdk.internal.dto.automations.ActionPointScreen;
import com.qonversion.android.sdk.internal.dto.automations.Screen;
import com.qonversion.android.sdk.internal.logger.ConsoleLogger;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.listeners.QonversionShowScreenCallback;
import com.unity3d.services.UnityAdsConstants;
import ef.C2515C;
import ef.C2527k;
import ff.AbstractC2640A;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import tf.l;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001=B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0013¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b%\u0010$J\u0015\u0010&\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b&\u0010$J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b'\u0010\u0010J\r\u0010(\u001a\u00020\u000e¢\u0006\u0004\b(\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R:\u00100\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R:\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010-2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010-8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;", "", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "repository", "Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;", "eventMapper", "Landroid/app/Application;", "appContext", "Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;", "activityProvider", "<init>", "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;Landroid/app/Application;Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;)V", "", "functionName", "Lef/C;", "logDelegateErrorForFunctionName", "(Ljava/lang/String;)V", "loadScreenIfPossible", "()V", "", "getQueryParams", "()Ljava/util/Map;", "messageData", "", "handlePushIfPossible", "(Ljava/util/Map;)Z", "getNotificationCustomPayload", "(Ljava/util/Map;)Ljava/util/Map;", ScreenActivity.INTENT_SCREEN_ID, "Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;", "callback", "loadScreen", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V", "Lcom/qonversion/android/sdk/automations/dto/QActionResult;", "actionResult", "automationsDidStartExecuting", "(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V", "automationsDidFailExecuting", "automationsDidFinishExecuting", "automationsDidShowScreen", "automationsFinished", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;", "Landroid/app/Application;", "Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;", "Ljava/lang/ref/WeakReference;", "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;", "<set-?>", "automationsDelegate", "Ljava/lang/ref/WeakReference;", "getAutomationsDelegate", "()Ljava/lang/ref/WeakReference;", "setAutomationsDelegate", "(Ljava/lang/ref/WeakReference;)V", "Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;", "screenCustomizationDelegate", "getScreenCustomizationDelegate", "setScreenCustomizationDelegate", "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;", "logger", "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QAutomationsManager {

    @NotNull
    private static final String KEY_CUSTOM_PAYLOAD = "qonv.custom_payload";

    @NotNull
    private static final String PICK_SCREEN = "qonv.pick_screen";

    @NotNull
    private static final String QUERY_PARAM_ACTIVE = "active";
    private static final int QUERY_PARAM_ACTIVE_VALUE = 1;

    @NotNull
    private static final String QUERY_PARAM_TYPE = "type";

    @NotNull
    private static final String QUERY_PARAM_TYPE_VALUE = "screen_view";

    @NotNull
    private final ActivityProvider activityProvider;

    @NotNull
    private final Application appContext;

    @Nullable
    private volatile WeakReference<AutomationsDelegate> automationsDelegate;

    @NotNull
    private final AutomationsEventMapper eventMapper;

    @NotNull
    private final ConsoleLogger logger;

    @NotNull
    private final QRepository repository;

    @Nullable
    private volatile WeakReference<ScreenCustomizationDelegate> screenCustomizationDelegate;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/automations/Screen;", "screen", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/dto/automations/Screen;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.automations.internal.QAutomationsManager$loadScreen$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21491 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionShowScreenCallback $callback;
        final /* synthetic */ String $screenId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21491(String str, QonversionShowScreenCallback qonversionShowScreenCallback) {
            super(1);
            this.$screenId = str;
            this.$callback = qonversionShowScreenCallback;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Screen) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull Screen screen) {
            QScreenPresentationConfig qScreenPresentationConfig;
            ScreenCustomizationDelegate screenCustomizationDelegate;
            AbstractC3340k.e(screen, "screen");
            Context currentActivity = QAutomationsManager.this.activityProvider.getCurrentActivity();
            if (currentActivity == null) {
                currentActivity = QAutomationsManager.this.appContext;
            }
            WeakReference<ScreenCustomizationDelegate> screenCustomizationDelegate2 = QAutomationsManager.this.getScreenCustomizationDelegate();
            if (screenCustomizationDelegate2 == null || (screenCustomizationDelegate = screenCustomizationDelegate2.get()) == null || (qScreenPresentationConfig = screenCustomizationDelegate.getPresentationConfigurationForScreen(this.$screenId)) == null) {
                qScreenPresentationConfig = new QScreenPresentationConfig(null, 1, null);
            }
            Intent callingIntent = ScreenActivity.INSTANCE.getCallingIntent(currentActivity, this.$screenId, screen.getHtmlPage(), qScreenPresentationConfig.getPresentationStyle());
            if (!(currentActivity instanceof Activity)) {
                callingIntent.addFlags(268435456);
                QAutomationsManager.this.logger.debug("loadScreen() -> Screen intent will process with a non-Activity context");
            }
            try {
                currentActivity.startActivity(callingIntent);
                C2527k screenTransactionAnimations = UtilsKt.getScreenTransactionAnimations(qScreenPresentationConfig.getPresentationStyle());
                if (screenTransactionAnimations != null) {
                    QAutomationsManager qAutomationsManager = QAutomationsManager.this;
                    if (currentActivity instanceof Activity) {
                        ((Activity) currentActivity).overridePendingTransition(((Number) screenTransactionAnimations.f34671a).intValue(), ((Number) screenTransactionAnimations.f34672b).intValue());
                    } else {
                        qAutomationsManager.logger.debug("Can't use transition animations, cause the provided context is not an activity. To override default animation, please, provide an activity context to AutomationsDelegate.contextForScreenIntent");
                    }
                }
                QonversionShowScreenCallback qonversionShowScreenCallback = this.$callback;
                if (qonversionShowScreenCallback != null) {
                    qonversionShowScreenCallback.onSuccess();
                }
            } catch (Exception e7) {
                String str = "Failed to start screen with id " + this.$screenId + " with exception: " + e7;
                QAutomationsManager.this.logger.error("loadScreen() -> " + str);
                QonversionShowScreenCallback qonversionShowScreenCallback2 = this.$callback;
                if (qonversionShowScreenCallback2 != null) {
                    qonversionShowScreenCallback2.onError(new QonversionError(QonversionErrorCode.Unknown, str, null, 4, null));
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "it", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.automations.internal.QAutomationsManager$loadScreen$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionShowScreenCallback $callback;
        final /* synthetic */ String $screenId;
        final /* synthetic */ QAutomationsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, QAutomationsManager qAutomationsManager, QonversionShowScreenCallback qonversionShowScreenCallback) {
            super(1);
            this.$screenId = str;
            this.this$0 = qAutomationsManager;
            this.$callback = qonversionShowScreenCallback;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((QonversionError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull QonversionError it) {
            AbstractC3340k.e(it, "it");
            String strH = a.h("Failed to load screen with id ", this.$screenId, ". ", it.getAdditionalMessage());
            this.this$0.logger.error("loadScreen() -> " + strH);
            QonversionShowScreenCallback qonversionShowScreenCallback = this.$callback;
            if (qonversionShowScreenCallback != null) {
                qonversionShowScreenCallback.onError(new QonversionError(it.getCode(), strH, null, 4, null));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;", "actionPoint", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.automations.internal.QAutomationsManager$loadScreenIfPossible$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21501 extends AbstractC3343n implements l {
        public C21501() {
            super(1);
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ActionPointScreen) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@Nullable ActionPointScreen actionPointScreen) {
            C2515C c2515c = null;
            if (actionPointScreen != null) {
                QAutomationsManager qAutomationsManager = QAutomationsManager.this;
                qAutomationsManager.logger.debug("loadScreenIfPossible() ->  Screen with id " + actionPointScreen.getScreenId() + " was found to show");
                QAutomationsManager.loadScreen$default(qAutomationsManager, actionPointScreen.getScreenId(), null, 2, null);
                c2515c = C2515C.f34653a;
            }
            if (c2515c == null) {
                QAutomationsManager.this.logger.warn("loadScreenIfPossible() ->  No screens to show");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "it", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.automations.internal.QAutomationsManager$loadScreenIfPossible$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21512 extends AbstractC3343n implements l {
        public C21512() {
            super(1);
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((QonversionError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull QonversionError it) {
            AbstractC3340k.e(it, "it");
            QAutomationsManager.this.logger.error("loadScreenIfPossible() -> Failed to retrieve screenId to show");
        }
    }

    public QAutomationsManager(@NotNull QRepository repository, @NotNull AutomationsEventMapper eventMapper, @NotNull Application appContext, @NotNull ActivityProvider activityProvider) {
        AbstractC3340k.e(repository, "repository");
        AbstractC3340k.e(eventMapper, "eventMapper");
        AbstractC3340k.e(appContext, "appContext");
        AbstractC3340k.e(activityProvider, "activityProvider");
        this.repository = repository;
        this.eventMapper = eventMapper;
        this.appContext = appContext;
        this.activityProvider = activityProvider;
        this.logger = new ConsoleLogger();
    }

    private final Map<String, String> getQueryParams() {
        return AbstractC2640A.R(new C2527k("type", QUERY_PARAM_TYPE_VALUE), new C2527k(QUERY_PARAM_ACTIVE, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION));
    }

    public static /* synthetic */ void loadScreen$default(QAutomationsManager qAutomationsManager, String str, QonversionShowScreenCallback qonversionShowScreenCallback, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            qonversionShowScreenCallback = null;
        }
        qAutomationsManager.loadScreen(str, qonversionShowScreenCallback);
    }

    private final void loadScreenIfPossible() {
        this.repository.actionPoints(getQueryParams(), new C21501(), new C21512());
    }

    private final void logDelegateErrorForFunctionName(String functionName) {
        this.logger.error("AutomationsDelegate." + functionName + "() function can not be executed. It looks like Automations.setDelegate() was not called or delegate has been destroyed by GC");
    }

    public final void automationsDidFailExecuting(@NotNull QActionResult actionResult) {
        C2515C c2515c;
        AutomationsDelegate automationsDelegate;
        AbstractC3340k.e(actionResult, "actionResult");
        WeakReference<AutomationsDelegate> weakReference = this.automationsDelegate;
        if (weakReference == null || (automationsDelegate = weakReference.get()) == null) {
            c2515c = null;
        } else {
            automationsDelegate.automationsDidFailExecuting(actionResult);
            c2515c = C2515C.f34653a;
        }
        if (c2515c == null) {
            new Object() { // from class: com.qonversion.android.sdk.automations.internal.QAutomationsManager.automationsDidFailExecuting.1
            };
            Method enclosingMethod = AnonymousClass1.class.getEnclosingMethod();
            logDelegateErrorForFunctionName(enclosingMethod != null ? enclosingMethod.getName() : null);
        }
    }

    public final void automationsDidFinishExecuting(@NotNull QActionResult actionResult) {
        C2515C c2515c;
        AutomationsDelegate automationsDelegate;
        AbstractC3340k.e(actionResult, "actionResult");
        WeakReference<AutomationsDelegate> weakReference = this.automationsDelegate;
        if (weakReference == null || (automationsDelegate = weakReference.get()) == null) {
            c2515c = null;
        } else {
            automationsDelegate.automationsDidFinishExecuting(actionResult);
            c2515c = C2515C.f34653a;
        }
        if (c2515c == null) {
            new Object() { // from class: com.qonversion.android.sdk.automations.internal.QAutomationsManager.automationsDidFinishExecuting.1
            };
            Method enclosingMethod = C21451.class.getEnclosingMethod();
            logDelegateErrorForFunctionName(enclosingMethod != null ? enclosingMethod.getName() : null);
        }
    }

    public final void automationsDidShowScreen(@NotNull String screenId) {
        C2515C c2515c;
        AutomationsDelegate automationsDelegate;
        AbstractC3340k.e(screenId, "screenId");
        WeakReference<AutomationsDelegate> weakReference = this.automationsDelegate;
        if (weakReference == null || (automationsDelegate = weakReference.get()) == null) {
            c2515c = null;
        } else {
            automationsDelegate.automationsDidShowScreen(screenId);
            c2515c = C2515C.f34653a;
        }
        if (c2515c == null) {
            new Object() { // from class: com.qonversion.android.sdk.automations.internal.QAutomationsManager.automationsDidShowScreen.1
            };
            Method enclosingMethod = C21461.class.getEnclosingMethod();
            logDelegateErrorForFunctionName(enclosingMethod != null ? enclosingMethod.getName() : null);
        }
    }

    public final void automationsDidStartExecuting(@NotNull QActionResult actionResult) {
        C2515C c2515c;
        AutomationsDelegate automationsDelegate;
        AbstractC3340k.e(actionResult, "actionResult");
        WeakReference<AutomationsDelegate> weakReference = this.automationsDelegate;
        if (weakReference == null || (automationsDelegate = weakReference.get()) == null) {
            c2515c = null;
        } else {
            automationsDelegate.automationsDidStartExecuting(actionResult);
            c2515c = C2515C.f34653a;
        }
        if (c2515c == null) {
            new Object() { // from class: com.qonversion.android.sdk.automations.internal.QAutomationsManager.automationsDidStartExecuting.1
            };
            Method enclosingMethod = C21471.class.getEnclosingMethod();
            logDelegateErrorForFunctionName(enclosingMethod != null ? enclosingMethod.getName() : null);
        }
    }

    public final void automationsFinished() {
        C2515C c2515c;
        AutomationsDelegate automationsDelegate;
        WeakReference<AutomationsDelegate> weakReference = this.automationsDelegate;
        if (weakReference == null || (automationsDelegate = weakReference.get()) == null) {
            c2515c = null;
        } else {
            automationsDelegate.automationsFinished();
            c2515c = C2515C.f34653a;
        }
        if (c2515c == null) {
            new Object() { // from class: com.qonversion.android.sdk.automations.internal.QAutomationsManager.automationsFinished.1
            };
            Method enclosingMethod = C21481.class.getEnclosingMethod();
            logDelegateErrorForFunctionName(enclosingMethod != null ? enclosingMethod.getName() : null);
        }
    }

    @Nullable
    public final synchronized WeakReference<AutomationsDelegate> getAutomationsDelegate() {
        return this.automationsDelegate;
    }

    @Nullable
    public final Map<String, Object> getNotificationCustomPayload(@NotNull Map<String, String> messageData) {
        AbstractC3340k.e(messageData, "messageData");
        String str = messageData.get(KEY_CUSTOM_PAYLOAD);
        if (str == null) {
            return null;
        }
        try {
            return ExtensionsKt.toMap(new JSONObject(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    public final synchronized WeakReference<ScreenCustomizationDelegate> getScreenCustomizationDelegate() {
        return this.screenCustomizationDelegate;
    }

    public final boolean handlePushIfPossible(@NotNull Map<String, String> messageData) {
        AutomationsDelegate automationsDelegate;
        AbstractC3340k.e(messageData, "messageData");
        boolean z2 = ExtensionsKt.toBoolean(messageData.get(PICK_SCREEN));
        if (z2) {
            this.logger.release("handlePushIfPossible() -> Qonversion push notification was received");
            AutomationsEvent eventFromRemoteMessage = this.eventMapper.getEventFromRemoteMessage(messageData);
            boolean zBooleanValue = true;
            if (eventFromRemoteMessage != null) {
                WeakReference<AutomationsDelegate> weakReference = this.automationsDelegate;
                Boolean boolShouldHandleEvent = (weakReference == null || (automationsDelegate = weakReference.get()) == null) ? null : automationsDelegate.shouldHandleEvent(eventFromRemoteMessage, messageData);
                if (boolShouldHandleEvent != null) {
                    zBooleanValue = boolShouldHandleEvent.booleanValue();
                }
            }
            if (zBooleanValue) {
                loadScreenIfPossible();
            }
        }
        return z2;
    }

    public final void loadScreen(@NotNull String screenId, @Nullable QonversionShowScreenCallback callback) {
        AbstractC3340k.e(screenId, "screenId");
        this.repository.screens(screenId, new C21491(screenId, callback), new AnonymousClass2(screenId, this, callback));
    }

    public final synchronized void setAutomationsDelegate(@Nullable WeakReference<AutomationsDelegate> weakReference) {
        this.automationsDelegate = weakReference;
    }

    public final synchronized void setScreenCustomizationDelegate(@Nullable WeakReference<ScreenCustomizationDelegate> weakReference) {
        this.screenCustomizationDelegate = weakReference;
    }
}
