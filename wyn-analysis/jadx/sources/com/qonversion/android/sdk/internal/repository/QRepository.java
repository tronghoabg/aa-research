package com.qonversion.android.sdk.internal.repository;

import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import com.qonversion.android.sdk.internal.api.RequestTrigger;
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
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.a;
import tf.l;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0012\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0014J'\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0017H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u001dH&¢\u0006\u0004\b \u0010\u001fJ1\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020&H&¢\u0006\u0004\b$\u0010'J5\u0010,\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\r2\u0006\u0010\n\u001a\u00020&2\u0006\u0010+\u001a\u00020*H&¢\u0006\u0004\b,\u0010-JU\u00106\u001a\u00020\u00042\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010.2\u0006\u00100\u001a\u00020\u00072\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001012\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0004\u0018\u000103H&¢\u0006\u0004\b6\u00107JK\u0010:\u001a\u00020\u00042\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070.2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u0004032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000403H&¢\u0006\u0004\b:\u0010;J=\u0010=\u001a\u00020\u00042\u0018\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\r\u0012\u0004\u0012\u00020\u0004032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000403H&¢\u0006\u0004\b=\u0010>J-\u0010A\u001a\u00020\u00042\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\n\u001a\u00020@H&¢\u0006\u0004\bA\u0010BJG\u0010E\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u00072\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000403H&¢\u0006\u0004\bE\u0010FJ?\u0010I\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u00072\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u0004032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000403H&¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u0007H&¢\u0006\u0004\bK\u0010LJM\u0010O\u001a\u00020\u00042\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070.2\u0014\u00102\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010N\u0012\u0004\u0012\u00020\u0004032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000403H&¢\u0006\u0004\bO\u0010;J9\u0010R\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020P2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0004012\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000403H&¢\u0006\u0004\bR\u0010S¨\u0006T"}, d2 = {"Lcom/qonversion/android/sdk/internal/repository/QRepository;", "", "Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;", "requestData", "Lef/C;", "init", "(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V", "", "contextKey", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;", "callback", "remoteConfig", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V", "", "contextKeys", "", "includeEmptyContextKey", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "remoteConfigList", "(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V", "(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V", "experimentId", "groupId", "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;", "attachUserToExperiment", "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V", "detachUserFromExperiment", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V", "remoteConfigurationId", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;", "attachUserToRemoteConfiguration", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V", "detachUserFromRemoteConfiguration", "", "installDate", "Lcom/qonversion/android/sdk/internal/purchase/Purchase;", "purchase", "qProductId", "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;", "(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V", "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;", "historyRecords", "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;", "requestTrigger", "restore", "(JLjava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V", "", "conversionInfo", "from", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/dto/QonversionError;", "onError", "attribution", "(Ljava/util/Map;Ljava/lang/String;Ltf/a;Ltf/l;)V", "properties", "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;", "sendProperties", "(Ljava/util/Map;Ltf/l;Ltf/l;)V", "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;", "getProperties", "(Ltf/l;Ltf/l;)V", "productIds", "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;", "eligibilityForProductIds", "(Ljava/util/List;JLcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V", "userID", "currentUserID", "identify", "(Ljava/lang/String;Ljava/lang/String;Ltf/l;Ltf/l;)V", ScreenActivity.INTENT_SCREEN_ID, "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;", "screens", "(Ljava/lang/String;Ltf/l;Ltf/l;)V", AdUnitActivity.EXTRA_VIEWS, "(Ljava/lang/String;)V", "queryParams", "Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;", "actionPoints", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;", "crashData", "crashReport", "(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Ltf/a;Ltf/l;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface QRepository {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void attribution$default(QRepository qRepository, Map map, String str, a aVar, l lVar, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attribution");
            }
            if ((i5 & 4) != 0) {
                aVar = null;
            }
            if ((i5 & 8) != 0) {
                lVar = null;
            }
            qRepository.attribution(map, str, aVar, lVar);
        }
    }

    void actionPoints(@NotNull Map<String, String> queryParams, @NotNull l onSuccess, @NotNull l onError);

    void attachUserToExperiment(@NotNull String experimentId, @NotNull String groupId, @NotNull QonversionExperimentAttachCallback callback);

    void attachUserToRemoteConfiguration(@NotNull String remoteConfigurationId, @NotNull QonversionRemoteConfigurationAttachCallback callback);

    void attribution(@NotNull Map<String, ? extends Object> conversionInfo, @NotNull String from, @Nullable a onSuccess, @Nullable l onError);

    void crashReport(@NotNull CrashRequest crashData, @NotNull a onSuccess, @NotNull l onError);

    void detachUserFromExperiment(@NotNull String experimentId, @NotNull QonversionExperimentAttachCallback callback);

    void detachUserFromRemoteConfiguration(@NotNull String remoteConfigurationId, @NotNull QonversionRemoteConfigurationAttachCallback callback);

    void eligibilityForProductIds(@NotNull List<String> productIds, long installDate, @NotNull QonversionEligibilityCallback callback);

    void getProperties(@NotNull l onSuccess, @NotNull l onError);

    void identify(@NotNull String userID, @NotNull String currentUserID, @NotNull l onSuccess, @NotNull l onError);

    void init(@NotNull InitRequestData requestData);

    void purchase(long installDate, @NotNull Purchase purchase, @Nullable String qProductId, @NotNull QonversionLaunchCallback callback);

    void remoteConfig(@Nullable String contextKey, @NotNull QonversionRemoteConfigCallback callback);

    void remoteConfigList(@NotNull QonversionRemoteConfigListCallback callback);

    void remoteConfigList(@NotNull List<String> contextKeys, boolean includeEmptyContextKey, @NotNull QonversionRemoteConfigListCallback callback);

    void restore(long installDate, @NotNull List<PurchaseHistory> historyRecords, @NotNull QonversionLaunchCallback callback, @NotNull RequestTrigger requestTrigger);

    void screens(@NotNull String screenId, @NotNull l onSuccess, @NotNull l onError);

    void sendProperties(@NotNull Map<String, String> properties, @NotNull l onSuccess, @NotNull l onError);

    void views(@NotNull String screenId);
}
