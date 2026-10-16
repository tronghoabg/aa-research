package com.qonversion.android.sdk.internal.repository;

import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import com.qonversion.android.sdk.internal.api.RateLimiter;
import com.qonversion.android.sdk.internal.api.RequestTrigger;
import com.qonversion.android.sdk.internal.api.RequestType;
import com.qonversion.android.sdk.internal.dto.request.CrashRequest;
import com.qonversion.android.sdk.internal.dto.request.data.InitRequestData;
import com.qonversion.android.sdk.internal.purchase.Purchase;
import com.qonversion.android.sdk.internal.purchase.PurchaseHistory;
import com.qonversion.android.sdk.listeners.QonversionEligibilityCallback;
import com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback;
import com.qonversion.android.sdk.listeners.QonversionLaunchCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import ef.C2515C;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.a;
import tf.l;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JA\u0010\u0011\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\"\u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010\"\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010$J'\u0010(\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020-H\u0016¢\u0006\u0004\b0\u0010/J1\u00104\u001a\u00020\r2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u000206H\u0016¢\u0006\u0004\b4\u00107J5\u0010<\u001a\u00020\r2\u0006\u00102\u001a\u0002012\f\u00109\u001a\b\u0012\u0004\u0012\u0002080\u001d2\u0006\u0010\u001a\u001a\u0002062\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=JQ\u0010B\u001a\u00020\r2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020?0>2\u0006\u0010A\u001a\u00020\u00172\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bH\u0016¢\u0006\u0004\bB\u0010CJK\u0010F\u001a\u00020\r2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170>2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\bF\u0010GJ=\u0010I\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u001d\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\bI\u0010JJ-\u0010M\u001a\u00020\r2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d2\u0006\u00102\u001a\u0002012\u0006\u0010\u001a\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJG\u0010Q\u001a\u00020\r2\u0006\u0010O\u001a\u00020\u00172\u0006\u0010P\u001a\u00020\u00172\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\bQ\u0010RJ?\u0010U\u001a\u00020\r2\u0006\u0010S\u001a\u00020\u00172\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020\r2\u0006\u0010S\u001a\u00020\u0017H\u0016¢\u0006\u0004\bW\u0010XJM\u0010[\u001a\u00020\r2\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170>2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010Z\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b[\u0010GJ9\u0010^\u001a\u00020\r2\u0006\u0010]\u001a\u00020\\2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b^\u0010_R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010`R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010a¨\u0006b"}, d2 = {"Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "repository", "Lcom/qonversion/android/sdk/internal/api/RateLimiter;", "rateLimiter", "<init>", "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/api/RateLimiter;)V", "Lcom/qonversion/android/sdk/internal/api/RequestType;", "requestType", "", "hash", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/dto/QonversionError;", "Lef/C;", "onError", "Lkotlin/Function0;", "onSuccess", "withRateLimitCheck", "(Lcom/qonversion/android/sdk/internal/api/RequestType;ILtf/l;Ltf/a;)V", "Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;", "requestData", "init", "(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V", "", "contextKey", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;", "callback", "remoteConfig", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V", "", "contextKeys", "", "includeEmptyContextKey", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "remoteConfigList", "(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V", "(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V", "experimentId", "groupId", "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;", "attachUserToExperiment", "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V", "detachUserFromExperiment", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V", "remoteConfigurationId", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;", "attachUserToRemoteConfiguration", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V", "detachUserFromRemoteConfiguration", "", "installDate", "Lcom/qonversion/android/sdk/internal/purchase/Purchase;", "purchase", "qProductId", "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;", "(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V", "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;", "historyRecords", "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;", "requestTrigger", "restore", "(JLjava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V", "", "", "conversionInfo", "from", "attribution", "(Ljava/util/Map;Ljava/lang/String;Ltf/a;Ltf/l;)V", "properties", "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;", "sendProperties", "(Ljava/util/Map;Ltf/l;Ltf/l;)V", "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;", "getProperties", "(Ltf/l;Ltf/l;)V", "productIds", "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;", "eligibilityForProductIds", "(Ljava/util/List;JLcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V", "userID", "currentUserID", "identify", "(Ljava/lang/String;Ljava/lang/String;Ltf/l;Ltf/l;)V", ScreenActivity.INTENT_SCREEN_ID, "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;", "screens", "(Ljava/lang/String;Ltf/l;Ltf/l;)V", AdUnitActivity.EXTRA_VIEWS, "(Ljava/lang/String;)V", "queryParams", "Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;", "actionPoints", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;", "crashData", "crashReport", "(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Ltf/a;Ltf/l;)V", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "Lcom/qonversion/android/sdk/internal/api/RateLimiter;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RepositoryWithRateLimits implements QRepository {

    @NotNull
    private final RateLimiter rateLimiter;

    @NotNull
    private final QRepository repository;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$attachUserToExperiment$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionExperimentAttachCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(QonversionExperimentAttachCallback qonversionExperimentAttachCallback) {
            super(1);
            this.$callback = qonversionExperimentAttachCallback;
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$attachUserToExperiment$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements a {
        final /* synthetic */ QonversionExperimentAttachCallback $callback;
        final /* synthetic */ String $experimentId;
        final /* synthetic */ String $groupId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, QonversionExperimentAttachCallback qonversionExperimentAttachCallback) {
            super(0);
            this.$experimentId = str;
            this.$groupId = str2;
            this.$callback = qonversionExperimentAttachCallback;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m225invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m225invoke() {
            RepositoryWithRateLimits.this.repository.attachUserToExperiment(this.$experimentId, this.$groupId, this.$callback);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$attachUserToRemoteConfiguration$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22211 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionRemoteConfigurationAttachCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22211(QonversionRemoteConfigurationAttachCallback qonversionRemoteConfigurationAttachCallback) {
            super(1);
            this.$callback = qonversionRemoteConfigurationAttachCallback;
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$attachUserToRemoteConfiguration$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22222 extends AbstractC3343n implements a {
        final /* synthetic */ QonversionRemoteConfigurationAttachCallback $callback;
        final /* synthetic */ String $remoteConfigurationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22222(String str, QonversionRemoteConfigurationAttachCallback qonversionRemoteConfigurationAttachCallback) {
            super(0);
            this.$remoteConfigurationId = str;
            this.$callback = qonversionRemoteConfigurationAttachCallback;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m226invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m226invoke() {
            RepositoryWithRateLimits.this.repository.attachUserToRemoteConfiguration(this.$remoteConfigurationId, this.$callback);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$attribution$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22231 extends AbstractC3343n implements l {
        final /* synthetic */ l $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22231(l lVar) {
            super(1);
            this.$onError = lVar;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((QonversionError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull QonversionError error) {
            AbstractC3340k.e(error, "error");
            l lVar = this.$onError;
            if (lVar != null) {
                lVar.invoke(error);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$attribution$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22242 extends AbstractC3343n implements a {
        final /* synthetic */ Map<String, Object> $conversionInfo;
        final /* synthetic */ String $from;
        final /* synthetic */ l $onError;
        final /* synthetic */ a $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22242(Map<String, ? extends Object> map, String str, a aVar, l lVar) {
            super(0);
            this.$conversionInfo = map;
            this.$from = str;
            this.$onSuccess = aVar;
            this.$onError = lVar;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m227invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m227invoke() {
            RepositoryWithRateLimits.this.repository.attribution(this.$conversionInfo, this.$from, this.$onSuccess, this.$onError);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$detachUserFromExperiment$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22251 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionExperimentAttachCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22251(QonversionExperimentAttachCallback qonversionExperimentAttachCallback) {
            super(1);
            this.$callback = qonversionExperimentAttachCallback;
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$detachUserFromExperiment$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22262 extends AbstractC3343n implements a {
        final /* synthetic */ QonversionExperimentAttachCallback $callback;
        final /* synthetic */ String $experimentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22262(String str, QonversionExperimentAttachCallback qonversionExperimentAttachCallback) {
            super(0);
            this.$experimentId = str;
            this.$callback = qonversionExperimentAttachCallback;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m228invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m228invoke() {
            RepositoryWithRateLimits.this.repository.detachUserFromExperiment(this.$experimentId, this.$callback);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$detachUserFromRemoteConfiguration$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22271 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionRemoteConfigurationAttachCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22271(QonversionRemoteConfigurationAttachCallback qonversionRemoteConfigurationAttachCallback) {
            super(1);
            this.$callback = qonversionRemoteConfigurationAttachCallback;
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$detachUserFromRemoteConfiguration$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22282 extends AbstractC3343n implements a {
        final /* synthetic */ QonversionRemoteConfigurationAttachCallback $callback;
        final /* synthetic */ String $remoteConfigurationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22282(String str, QonversionRemoteConfigurationAttachCallback qonversionRemoteConfigurationAttachCallback) {
            super(0);
            this.$remoteConfigurationId = str;
            this.$callback = qonversionRemoteConfigurationAttachCallback;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m229invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m229invoke() {
            RepositoryWithRateLimits.this.repository.detachUserFromRemoteConfiguration(this.$remoteConfigurationId, this.$callback);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$eligibilityForProductIds$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22291 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionEligibilityCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22291(QonversionEligibilityCallback qonversionEligibilityCallback) {
            super(1);
            this.$callback = qonversionEligibilityCallback;
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$eligibilityForProductIds$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22302 extends AbstractC3343n implements a {
        final /* synthetic */ QonversionEligibilityCallback $callback;
        final /* synthetic */ long $installDate;
        final /* synthetic */ List<String> $productIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22302(List<String> list, long j8, QonversionEligibilityCallback qonversionEligibilityCallback) {
            super(0);
            this.$productIds = list;
            this.$installDate = j8;
            this.$callback = qonversionEligibilityCallback;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m230invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m230invoke() {
            RepositoryWithRateLimits.this.repository.eligibilityForProductIds(this.$productIds, this.$installDate, this.$callback);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$getProperties$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22311 extends AbstractC3343n implements a {
        final /* synthetic */ l $onError;
        final /* synthetic */ l $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22311(l lVar, l lVar2) {
            super(0);
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m231invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m231invoke() {
            RepositoryWithRateLimits.this.repository.getProperties(this.$onSuccess, this.$onError);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$identify$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22321 extends AbstractC3343n implements a {
        final /* synthetic */ String $currentUserID;
        final /* synthetic */ l $onError;
        final /* synthetic */ l $onSuccess;
        final /* synthetic */ String $userID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22321(String str, String str2, l lVar, l lVar2) {
            super(0);
            this.$userID = str;
            this.$currentUserID = str2;
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m232invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m232invoke() {
            RepositoryWithRateLimits.this.repository.identify(this.$userID, this.$currentUserID, this.$onSuccess, this.$onError);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$init$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22331 extends AbstractC3343n implements l {
        final /* synthetic */ InitRequestData $requestData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22331(InitRequestData initRequestData) {
            super(1);
            this.$requestData = initRequestData;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((QonversionError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull QonversionError error) {
            AbstractC3340k.e(error, "error");
            QonversionLaunchCallback callback = this.$requestData.getCallback();
            if (callback != null) {
                callback.onError(error);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$init$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22342 extends AbstractC3343n implements a {
        final /* synthetic */ InitRequestData $requestData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22342(InitRequestData initRequestData) {
            super(0);
            this.$requestData = initRequestData;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m233invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m233invoke() {
            RepositoryWithRateLimits.this.repository.init(this.$requestData);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$purchase$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22351 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionLaunchCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22351(QonversionLaunchCallback qonversionLaunchCallback) {
            super(1);
            this.$callback = qonversionLaunchCallback;
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$purchase$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22362 extends AbstractC3343n implements a {
        final /* synthetic */ QonversionLaunchCallback $callback;
        final /* synthetic */ long $installDate;
        final /* synthetic */ Purchase $purchase;
        final /* synthetic */ String $qProductId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22362(long j8, Purchase purchase, String str, QonversionLaunchCallback qonversionLaunchCallback) {
            super(0);
            this.$installDate = j8;
            this.$purchase = purchase;
            this.$qProductId = str;
            this.$callback = qonversionLaunchCallback;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m234invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m234invoke() {
            RepositoryWithRateLimits.this.repository.purchase(this.$installDate, this.$purchase, this.$qProductId, this.$callback);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$remoteConfig$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22371 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionRemoteConfigCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22371(QonversionRemoteConfigCallback qonversionRemoteConfigCallback) {
            super(1);
            this.$callback = qonversionRemoteConfigCallback;
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$remoteConfig$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22382 extends AbstractC3343n implements a {
        final /* synthetic */ QonversionRemoteConfigCallback $callback;
        final /* synthetic */ String $contextKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22382(String str, QonversionRemoteConfigCallback qonversionRemoteConfigCallback) {
            super(0);
            this.$contextKey = str;
            this.$callback = qonversionRemoteConfigCallback;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m235invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m235invoke() {
            RepositoryWithRateLimits.this.repository.remoteConfig(this.$contextKey, this.$callback);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$remoteConfigList$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22391 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionRemoteConfigListCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22391(QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback) {
            super(1);
            this.$callback = qonversionRemoteConfigListCallback;
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$remoteConfigList$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22402 extends AbstractC3343n implements a {
        final /* synthetic */ QonversionRemoteConfigListCallback $callback;
        final /* synthetic */ List<String> $contextKeys;
        final /* synthetic */ boolean $includeEmptyContextKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22402(List<String> list, boolean z2, QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback) {
            super(0);
            this.$contextKeys = list;
            this.$includeEmptyContextKey = z2;
            this.$callback = qonversionRemoteConfigListCallback;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m236invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m236invoke() {
            RepositoryWithRateLimits.this.repository.remoteConfigList(this.$contextKeys, this.$includeEmptyContextKey, this.$callback);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$remoteConfigList$3, reason: invalid class name */
    public static final class AnonymousClass3 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionRemoteConfigListCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback) {
            super(1);
            this.$callback = qonversionRemoteConfigListCallback;
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$remoteConfigList$4, reason: invalid class name */
    public static final class AnonymousClass4 extends AbstractC3343n implements a {
        final /* synthetic */ QonversionRemoteConfigListCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback) {
            super(0);
            this.$callback = qonversionRemoteConfigListCallback;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m237invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m237invoke() {
            RepositoryWithRateLimits.this.repository.remoteConfigList(this.$callback);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$restore$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22411 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionLaunchCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22411(QonversionLaunchCallback qonversionLaunchCallback) {
            super(1);
            this.$callback = qonversionLaunchCallback;
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.RepositoryWithRateLimits$restore$2, reason: invalid class name and case insensitive filesystem */
    public static final class C22422 extends AbstractC3343n implements a {
        final /* synthetic */ QonversionLaunchCallback $callback;
        final /* synthetic */ List<PurchaseHistory> $historyRecords;
        final /* synthetic */ long $installDate;
        final /* synthetic */ RequestTrigger $requestTrigger;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22422(long j8, List<PurchaseHistory> list, QonversionLaunchCallback qonversionLaunchCallback, RequestTrigger requestTrigger) {
            super(0);
            this.$installDate = j8;
            this.$historyRecords = list;
            this.$callback = qonversionLaunchCallback;
            this.$requestTrigger = requestTrigger;
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m238invoke();
            return C2515C.f34653a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m238invoke() {
            RepositoryWithRateLimits.this.repository.restore(this.$installDate, this.$historyRecords, this.$callback, this.$requestTrigger);
        }
    }

    public RepositoryWithRateLimits(@NotNull QRepository repository, @NotNull RateLimiter rateLimiter) {
        AbstractC3340k.e(repository, "repository");
        AbstractC3340k.e(rateLimiter, "rateLimiter");
        this.repository = repository;
        this.rateLimiter = rateLimiter;
    }

    private final void withRateLimitCheck(RequestType requestType, int hash, l onError, a onSuccess) {
        if (this.rateLimiter.isRateLimitExceeded(requestType, hash)) {
            onError.invoke(new QonversionError(QonversionErrorCode.ApiRateLimitExceeded, null, null, 6, null));
        } else {
            this.rateLimiter.saveRequest(requestType, hash);
            onSuccess.invoke();
        }
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void actionPoints(@NotNull Map<String, String> queryParams, @NotNull l onSuccess, @NotNull l onError) {
        AbstractC3340k.e(queryParams, "queryParams");
        AbstractC3340k.e(onSuccess, "onSuccess");
        AbstractC3340k.e(onError, "onError");
        this.repository.actionPoints(queryParams, onSuccess, onError);
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void attachUserToExperiment(@NotNull String experimentId, @NotNull String groupId, @NotNull QonversionExperimentAttachCallback callback) {
        AbstractC3340k.e(experimentId, "experimentId");
        AbstractC3340k.e(groupId, "groupId");
        AbstractC3340k.e(callback, "callback");
        withRateLimitCheck(RequestType.AttachUserToExperiment, experimentId.concat(groupId).hashCode(), new AnonymousClass1(callback), new AnonymousClass2(experimentId, groupId, callback));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void attachUserToRemoteConfiguration(@NotNull String remoteConfigurationId, @NotNull QonversionRemoteConfigurationAttachCallback callback) {
        AbstractC3340k.e(remoteConfigurationId, "remoteConfigurationId");
        AbstractC3340k.e(callback, "callback");
        withRateLimitCheck(RequestType.AttachUserToRemoteConfiguration, remoteConfigurationId.hashCode(), new C22211(callback), new C22222(remoteConfigurationId, callback));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void attribution(@NotNull Map<String, ? extends Object> conversionInfo, @NotNull String from, @Nullable a onSuccess, @Nullable l onError) {
        AbstractC3340k.e(conversionInfo, "conversionInfo");
        AbstractC3340k.e(from, "from");
        withRateLimitCheck(RequestType.Attribution, from.hashCode() + conversionInfo.hashCode(), new C22231(onError), new C22242(conversionInfo, from, onSuccess, onError));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void crashReport(@NotNull CrashRequest crashData, @NotNull a onSuccess, @NotNull l onError) {
        AbstractC3340k.e(crashData, "crashData");
        AbstractC3340k.e(onSuccess, "onSuccess");
        AbstractC3340k.e(onError, "onError");
        this.repository.crashReport(crashData, onSuccess, onError);
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void detachUserFromExperiment(@NotNull String experimentId, @NotNull QonversionExperimentAttachCallback callback) {
        AbstractC3340k.e(experimentId, "experimentId");
        AbstractC3340k.e(callback, "callback");
        withRateLimitCheck(RequestType.DetachUserFromExperiment, experimentId.hashCode(), new C22251(callback), new C22262(experimentId, callback));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void detachUserFromRemoteConfiguration(@NotNull String remoteConfigurationId, @NotNull QonversionRemoteConfigurationAttachCallback callback) {
        AbstractC3340k.e(remoteConfigurationId, "remoteConfigurationId");
        AbstractC3340k.e(callback, "callback");
        withRateLimitCheck(RequestType.DetachUserFromRemoteConfiguration, remoteConfigurationId.hashCode(), new C22271(callback), new C22282(remoteConfigurationId, callback));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void eligibilityForProductIds(@NotNull List<String> productIds, long installDate, @NotNull QonversionEligibilityCallback callback) {
        AbstractC3340k.e(productIds, "productIds");
        AbstractC3340k.e(callback, "callback");
        withRateLimitCheck(RequestType.EligibilityForProductIds, productIds.hashCode() + ((int) ((installDate >>> 32) ^ installDate)), new C22291(callback), new C22302(productIds, installDate, callback));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void getProperties(@NotNull l onSuccess, @NotNull l onError) {
        AbstractC3340k.e(onSuccess, "onSuccess");
        AbstractC3340k.e(onError, "onError");
        withRateLimitCheck(RequestType.GetProperties, 0, onError, new C22311(onSuccess, onError));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void identify(@NotNull String userID, @NotNull String currentUserID, @NotNull l onSuccess, @NotNull l onError) {
        AbstractC3340k.e(userID, "userID");
        AbstractC3340k.e(currentUserID, "currentUserID");
        AbstractC3340k.e(onSuccess, "onSuccess");
        AbstractC3340k.e(onError, "onError");
        withRateLimitCheck(RequestType.Identify, userID.concat(currentUserID).hashCode(), onError, new C22321(userID, currentUserID, onSuccess, onError));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void init(@NotNull InitRequestData requestData) {
        AbstractC3340k.e(requestData, "requestData");
        withRateLimitCheck(RequestType.Init, requestData.hashCode(), new C22331(requestData), new C22342(requestData));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void purchase(long installDate, @NotNull Purchase purchase, @Nullable String qProductId, @NotNull QonversionLaunchCallback callback) {
        AbstractC3340k.e(purchase, "purchase");
        AbstractC3340k.e(callback, "callback");
        withRateLimitCheck(RequestType.Purchase, (qProductId + installDate).hashCode() + purchase.hashCode(), new C22351(callback), new C22362(installDate, purchase, qProductId, callback));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void remoteConfig(@Nullable String contextKey, @NotNull QonversionRemoteConfigCallback callback) {
        AbstractC3340k.e(callback, "callback");
        withRateLimitCheck(RequestType.RemoteConfig, contextKey != null ? contextKey.hashCode() : 0, new C22371(callback), new C22382(contextKey, callback));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void remoteConfigList(@NotNull List<String> contextKeys, boolean includeEmptyContextKey, @NotNull QonversionRemoteConfigListCallback callback) {
        AbstractC3340k.e(contextKeys, "contextKeys");
        AbstractC3340k.e(callback, "callback");
        withRateLimitCheck(RequestType.RemoteConfigList, contextKeys.hashCode(), new C22391(callback), new C22402(contextKeys, includeEmptyContextKey, callback));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void restore(long installDate, @NotNull List<PurchaseHistory> historyRecords, @NotNull QonversionLaunchCallback callback, @NotNull RequestTrigger requestTrigger) {
        AbstractC3340k.e(historyRecords, "historyRecords");
        AbstractC3340k.e(callback, "callback");
        AbstractC3340k.e(requestTrigger, "requestTrigger");
        withRateLimitCheck(RequestType.Restore, historyRecords.hashCode() + ((int) ((installDate >>> 32) ^ installDate)), new C22411(callback), new C22422(installDate, historyRecords, callback, requestTrigger));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void screens(@NotNull String screenId, @NotNull l onSuccess, @NotNull l onError) {
        AbstractC3340k.e(screenId, "screenId");
        AbstractC3340k.e(onSuccess, "onSuccess");
        AbstractC3340k.e(onError, "onError");
        this.repository.screens(screenId, onSuccess, onError);
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void sendProperties(@NotNull Map<String, String> properties, @NotNull l onSuccess, @NotNull l onError) {
        AbstractC3340k.e(properties, "properties");
        AbstractC3340k.e(onSuccess, "onSuccess");
        AbstractC3340k.e(onError, "onError");
        this.repository.sendProperties(properties, onSuccess, onError);
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void views(@NotNull String screenId) {
        AbstractC3340k.e(screenId, "screenId");
        this.repository.views(screenId);
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void remoteConfigList(@NotNull QonversionRemoteConfigListCallback callback) {
        AbstractC3340k.e(callback, "callback");
        withRateLimitCheck(RequestType.RemoteConfigList, 0, new AnonymousClass3(callback), new AnonymousClass4(callback));
    }
}
