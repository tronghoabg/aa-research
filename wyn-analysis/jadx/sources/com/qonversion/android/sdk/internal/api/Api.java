package com.qonversion.android.sdk.internal.api;

import Bg.a;
import Bg.b;
import Bg.f;
import Bg.i;
import Bg.k;
import Bg.o;
import Bg.s;
import Bg.t;
import Bg.u;
import Bg.y;
import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import com.qonversion.android.sdk.dto.QRemoteConfig;
import com.qonversion.android.sdk.dto.properties.QUserProperty;
import com.qonversion.android.sdk.internal.Constants;
import com.qonversion.android.sdk.internal.dto.ActionPoints;
import com.qonversion.android.sdk.internal.dto.BaseResponse;
import com.qonversion.android.sdk.internal.dto.Data;
import com.qonversion.android.sdk.internal.dto.QLaunchResult;
import com.qonversion.android.sdk.internal.dto.Response;
import com.qonversion.android.sdk.internal.dto.SendPropertiesResult;
import com.qonversion.android.sdk.internal.dto.automations.Screen;
import com.qonversion.android.sdk.internal.dto.eligibility.EligibilityResult;
import com.qonversion.android.sdk.internal.dto.identity.IdentityResult;
import com.qonversion.android.sdk.internal.dto.request.AttachUserRequest;
import com.qonversion.android.sdk.internal.dto.request.AttributionRequest;
import com.qonversion.android.sdk.internal.dto.request.CrashRequest;
import com.qonversion.android.sdk.internal.dto.request.EligibilityRequest;
import com.qonversion.android.sdk.internal.dto.request.IdentityRequest;
import com.qonversion.android.sdk.internal.dto.request.InitRequest;
import com.qonversion.android.sdk.internal.dto.request.PurchaseRequest;
import com.qonversion.android.sdk.internal.dto.request.RestoreRequest;
import com.qonversion.android.sdk.internal.dto.request.ViewsRequest;
import com.qonversion.android.sdk.internal.dto.request.data.UserPropertyRequestData;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zg.InterfaceC4664c;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ9\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00102\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u001bH'¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001c0\u00062\b\b\u0001\u0010 \u001a\u00020\u0004H'¢\u0006\u0004\b\"\u0010#J)\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00062\b\b\u0001\u0010 \u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020$H'¢\u0006\u0004\b&\u0010'J;\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001c0\u00062\b\b\u0001\u0010(\u001a\u00020\u00042\u0014\b\u0001\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040)H'¢\u0006\u0004\b,\u0010-J)\u00100\u001a\b\u0012\u0004\u0012\u00020%0\u00062\b\b\u0001\u0010\u0003\u001a\u00020.2\b\b\u0003\u0010/\u001a\u00020\u0004H'¢\u0006\u0004\b0\u00101J+\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00062\b\b\u0001\u0010(\u001a\u00020\u00042\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b4\u00105J/\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000203080\u00062\b\b\u0001\u0010(\u001a\u00020\u00042\b\b\u0003\u00107\u001a\u000206H'¢\u0006\u0004\b9\u0010:J?\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000203080\u00062\b\b\u0001\u0010(\u001a\u00020\u00042\u000e\b\u0001\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0004082\b\b\u0001\u0010<\u001a\u000206H'¢\u0006\u0004\b9\u0010=J3\u0010@\u001a\b\u0012\u0004\u0012\u00020%0\u00062\b\b\u0001\u0010>\u001a\u00020\u00042\b\b\u0001\u0010(\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020?H'¢\u0006\u0004\b@\u0010AJ)\u0010B\u001a\b\u0012\u0004\u0012\u00020%0\u00062\b\b\u0001\u0010>\u001a\u00020\u00042\b\b\u0001\u0010(\u001a\u00020\u0004H'¢\u0006\u0004\bB\u00105J)\u0010C\u001a\b\u0012\u0004\u0012\u00020%0\u00062\b\b\u0001\u0010>\u001a\u00020\u00042\b\b\u0001\u0010(\u001a\u00020\u0004H'¢\u0006\u0004\bC\u00105J)\u0010D\u001a\b\u0012\u0004\u0012\u00020%0\u00062\b\b\u0001\u0010>\u001a\u00020\u00042\b\b\u0001\u0010(\u001a\u00020\u0004H'¢\u0006\u0004\bD\u00105J/\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00062\b\b\u0001\u0010(\u001a\u00020\u00042\u000e\b\u0001\u0010F\u001a\b\u0012\u0004\u0012\u00020E08H'¢\u0006\u0004\bH\u0010IJ%\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J080\u00062\b\b\u0001\u0010(\u001a\u00020\u0004H'¢\u0006\u0004\bK\u0010#¨\u0006L"}, d2 = {"Lcom/qonversion/android/sdk/internal/api/Api;", "", "Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;", "request", "", "trigger", "Lzg/c;", "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;", "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "init", "(Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;Ljava/lang/String;)Lzg/c;", "Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;", "", "attemptNumber", "purchase", "(Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;Ljava/lang/String;I)Lzg/c;", "Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;", "restore", "(Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;Ljava/lang/String;)Lzg/c;", "Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;", "Lcom/qonversion/android/sdk/internal/dto/Response;", "attribution", "(Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;)Lzg/c;", "Lcom/qonversion/android/sdk/internal/dto/request/EligibilityRequest;", "Lcom/qonversion/android/sdk/internal/dto/eligibility/EligibilityResult;", "eligibility", "(Lcom/qonversion/android/sdk/internal/dto/request/EligibilityRequest;)Lzg/c;", "Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;", "Lcom/qonversion/android/sdk/internal/dto/Data;", "Lcom/qonversion/android/sdk/internal/dto/identity/IdentityResult;", "identify", "(Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;)Lzg/c;", ScreenActivity.INTENT_SCREEN_ID, "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;", "screens", "(Ljava/lang/String;)Lzg/c;", "Lcom/qonversion/android/sdk/internal/dto/request/ViewsRequest;", "Ljava/lang/Void;", AdUnitActivity.EXTRA_VIEWS, "(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/request/ViewsRequest;)Lzg/c;", "userId", "", "params", "Lcom/qonversion/android/sdk/internal/dto/ActionPoints;", "actionPoints", "(Ljava/lang/String;Ljava/util/Map;)Lzg/c;", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;", "url", "crashLogs", "(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Ljava/lang/String;)Lzg/c;", "contextKey", "Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "remoteConfig", "(Ljava/lang/String;Ljava/lang/String;)Lzg/c;", "", "allContextKeys", "", "remoteConfigList", "(Ljava/lang/String;Z)Lzg/c;", "contextKeys", "includeEmptyContextKey", "(Ljava/lang/String;Ljava/util/List;Z)Lzg/c;", "experimentId", "Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;", "attachUserToExperiment", "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;)Lzg/c;", "detachUserFromExperiment", "attachUserToRemoteConfiguration", "detachUserFromRemoteConfiguration", "Lcom/qonversion/android/sdk/internal/dto/request/data/UserPropertyRequestData;", "properties", "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;", "sendProperties", "(Ljava/lang/String;Ljava/util/List;)Lzg/c;", "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;", "getProperties", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Api {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ InterfaceC4664c crashLogs$default(Api api, CrashRequest crashRequest, String str, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: crashLogs");
            }
            if ((i5 & 2) != 0) {
                str = Constants.CRASH_LOGS_URL;
            }
            return api.crashLogs(crashRequest, str);
        }

        public static /* synthetic */ InterfaceC4664c remoteConfigList$default(Api api, String str, boolean z2, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: remoteConfigList");
            }
            if ((i5 & 2) != 0) {
                z2 = true;
            }
            return api.remoteConfigList(str, z2);
        }
    }

    @f("v2/users/{id}/action-points")
    @NotNull
    InterfaceC4664c<Data<ActionPoints>> actionPoints(@s("id") @NotNull String userId, @u @NotNull Map<String, String> params);

    @o("v3/experiments/{id}/users/{user_id}")
    @NotNull
    InterfaceC4664c<Void> attachUserToExperiment(@s("id") @NotNull String experimentId, @s("user_id") @NotNull String userId, @a @NotNull AttachUserRequest request);

    @o("v3/remote-configurations/{id}/users/{user_id}")
    @NotNull
    InterfaceC4664c<Void> attachUserToRemoteConfiguration(@s("id") @NotNull String experimentId, @s("user_id") @NotNull String userId);

    @o("attribution")
    @NotNull
    InterfaceC4664c<BaseResponse<Response>> attribution(@a @NotNull AttributionRequest request);

    @k({"Content-Type: application/json"})
    @o
    @NotNull
    InterfaceC4664c<Void> crashLogs(@a @NotNull CrashRequest request, @y @NotNull String url);

    @b("v3/experiments/{id}/users/{user_id}")
    @NotNull
    InterfaceC4664c<Void> detachUserFromExperiment(@s("id") @NotNull String experimentId, @s("user_id") @NotNull String userId);

    @b("v3/remote-configurations/{id}/users/{user_id}")
    @NotNull
    InterfaceC4664c<Void> detachUserFromRemoteConfiguration(@s("id") @NotNull String experimentId, @s("user_id") @NotNull String userId);

    @o("v1/products/get")
    @NotNull
    InterfaceC4664c<BaseResponse<EligibilityResult>> eligibility(@a @NotNull EligibilityRequest request);

    @f("v3/users/{user_id}/properties")
    @NotNull
    InterfaceC4664c<List<QUserProperty>> getProperties(@s("user_id") @NotNull String userId);

    @o("v2/identities")
    @NotNull
    InterfaceC4664c<Data<IdentityResult>> identify(@a @NotNull IdentityRequest request);

    @o("v1/user/init")
    @NotNull
    InterfaceC4664c<BaseResponse<QLaunchResult>> init(@a @NotNull InitRequest request, @i("Trigger") @NotNull String trigger);

    @o("v1/user/purchase")
    @NotNull
    InterfaceC4664c<BaseResponse<QLaunchResult>> purchase(@a @NotNull PurchaseRequest request, @i("Trigger") @NotNull String trigger, @i("Attempt") int attemptNumber);

    @f("v3/remote-config")
    @NotNull
    InterfaceC4664c<QRemoteConfig> remoteConfig(@t("user_id") @NotNull String userId, @t("context_key") @Nullable String contextKey);

    @f("v3/remote-configs")
    @NotNull
    InterfaceC4664c<List<QRemoteConfig>> remoteConfigList(@t("user_id") @NotNull String userId, @t("context_key") @NotNull List<String> contextKeys, @t("with_empty_context_key") boolean includeEmptyContextKey);

    @f("v3/remote-configs")
    @NotNull
    InterfaceC4664c<List<QRemoteConfig>> remoteConfigList(@t("user_id") @NotNull String userId, @t("all_context_keys") boolean allContextKeys);

    @o("v1/user/restore")
    @NotNull
    InterfaceC4664c<BaseResponse<QLaunchResult>> restore(@a @NotNull RestoreRequest request, @i("Trigger") @NotNull String trigger);

    @f("v2/screens/{id}")
    @NotNull
    InterfaceC4664c<Data<Screen>> screens(@s("id") @NotNull String screenId);

    @o("v3/users/{user_id}/properties")
    @NotNull
    InterfaceC4664c<SendPropertiesResult> sendProperties(@s("user_id") @NotNull String userId, @a @NotNull List<UserPropertyRequestData> properties);

    @o("/v2/screens/{id}/views")
    @NotNull
    InterfaceC4664c<Void> views(@s("id") @NotNull String screenId, @a @NotNull ViewsRequest request);
}
