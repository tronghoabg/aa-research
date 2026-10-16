package com.qonversion.android.sdk.internal.repository;

import com.google.android.gms.internal.consent_sdk.a;
import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import com.qonversion.android.sdk.dto.QRemoteConfig;
import com.qonversion.android.sdk.dto.QRemoteConfigList;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import com.qonversion.android.sdk.dto.properties.QUserProperty;
import com.qonversion.android.sdk.internal.CallBackKt;
import com.qonversion.android.sdk.internal.EnvironmentProvider;
import com.qonversion.android.sdk.internal.ErrorsKt;
import com.qonversion.android.sdk.internal.ExtensionsKt;
import com.qonversion.android.sdk.internal.IncrementalDelayCalculator;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.Api;
import com.qonversion.android.sdk.internal.api.ApiErrorMapper;
import com.qonversion.android.sdk.internal.api.RequestTrigger;
import com.qonversion.android.sdk.internal.billing.UtilsKt;
import com.qonversion.android.sdk.internal.dto.ActionPoints;
import com.qonversion.android.sdk.internal.dto.BaseResponse;
import com.qonversion.android.sdk.internal.dto.Data;
import com.qonversion.android.sdk.internal.dto.Environment;
import com.qonversion.android.sdk.internal.dto.ProviderData;
import com.qonversion.android.sdk.internal.dto.QLaunchResult;
import com.qonversion.android.sdk.internal.dto.Response;
import com.qonversion.android.sdk.internal.dto.SendPropertiesResult;
import com.qonversion.android.sdk.internal.dto.automations.ActionPointScreen;
import com.qonversion.android.sdk.internal.dto.automations.Screen;
import com.qonversion.android.sdk.internal.dto.eligibility.EligibilityResult;
import com.qonversion.android.sdk.internal.dto.eligibility.StoreProductInfo;
import com.qonversion.android.sdk.internal.dto.identity.IdentityResult;
import com.qonversion.android.sdk.internal.dto.purchase.History;
import com.qonversion.android.sdk.internal.dto.purchase.Inapp;
import com.qonversion.android.sdk.internal.dto.purchase.PurchaseDetails;
import com.qonversion.android.sdk.internal.dto.request.AttachUserRequest;
import com.qonversion.android.sdk.internal.dto.request.AttributionRequest;
import com.qonversion.android.sdk.internal.dto.request.CrashRequest;
import com.qonversion.android.sdk.internal.dto.request.EligibilityRequest;
import com.qonversion.android.sdk.internal.dto.request.IdentityRequest;
import com.qonversion.android.sdk.internal.dto.request.InitRequest;
import com.qonversion.android.sdk.internal.dto.request.PurchaseRequest;
import com.qonversion.android.sdk.internal.dto.request.RestoreRequest;
import com.qonversion.android.sdk.internal.dto.request.ViewsRequest;
import com.qonversion.android.sdk.internal.dto.request.data.InitRequestData;
import com.qonversion.android.sdk.internal.dto.request.data.UserPropertyRequestData;
import com.qonversion.android.sdk.internal.logger.Logger;
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
import ff.o;
import ff.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.apache.tika.metadata.ClimateForcast;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;
import zg.Q;

@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 \u0095\u00012\u00020\u0001:\u0002\u0095\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010 \u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010\"J'\u0010&\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020%H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010-J1\u00102\u001a\u00020\u00122\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u000204H\u0016¢\u0006\u0004\b2\u00105J5\u0010:\u001a\u00020\u00122\u0006\u00100\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u001b2\u0006\u0010\u0018\u001a\u0002042\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;JQ\u0010E\u001a\u00020\u00122\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020=0<2\u0006\u0010?\u001a\u00020\u00152\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010@2\u0014\u0010D\u001a\u0010\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u0012\u0018\u00010BH\u0016¢\u0006\u0004\bE\u0010FJK\u0010I\u001a\u00020\u00122\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150<2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u00120B2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00120BH\u0016¢\u0006\u0004\bI\u0010JJ=\u0010L\u001a\u00020\u00122\u0018\u0010A\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\u001b\u0012\u0004\u0012\u00020\u00120B2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00120BH\u0016¢\u0006\u0004\bL\u0010MJ-\u0010P\u001a\u00020\u00122\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00150\u001b2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0018\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJG\u0010T\u001a\u00020\u00122\u0006\u0010R\u001a\u00020\u00152\u0006\u0010S\u001a\u00020\u00152\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120B2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00120BH\u0016¢\u0006\u0004\bT\u0010UJ?\u0010X\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\u00152\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u00120B2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00120BH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\u0015H\u0016¢\u0006\u0004\bZ\u0010[JM\u0010^\u001a\u00020\u00122\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150<2\u0014\u0010A\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010]\u0012\u0004\u0012\u00020\u00120B2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00120BH\u0016¢\u0006\u0004\b^\u0010JJ9\u0010a\u001a\u00020\u00122\u0006\u0010`\u001a\u00020_2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00120@2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00120BH\u0016¢\u0006\u0004\ba\u0010bJ5\u0010g\u001a\u00020\u00122\u0006\u00100\u001a\u00020/2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020c0\u001b2\u0006\u0010\u0018\u001a\u0002042\u0006\u0010e\u001a\u000208H\u0001¢\u0006\u0004\bf\u0010;J+\u0010i\u001a\u00020h2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020=0<2\u0006\u0010?\u001a\u00020\u0015H\u0002¢\u0006\u0004\bi\u0010jJ;\u0010m\u001a\u00020\u00122\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u0002042\b\b\u0002\u0010l\u001a\u00020kH\u0002¢\u0006\u0004\bm\u0010nJE\u0010r\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u0002042\u0006\u0010o\u001a\u00020C2\b\u0010p\u001a\u0004\u0018\u00010k2\u0006\u0010l\u001a\u00020k2\u0012\u0010q\u001a\u000e\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020\u00120BH\u0002¢\u0006\u0004\br\u0010sJ%\u0010v\u001a\b\u0012\u0004\u0012\u00020u0\u001b2\u000e\u0010t\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u001bH\u0002¢\u0006\u0004\bv\u0010wJ#\u0010y\u001a\u00020x2\u0006\u00102\u001a\u0002012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\by\u0010zJ#\u0010{\u001a\b\u0012\u0004\u0012\u00020c0\u001b2\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u001bH\u0002¢\u0006\u0004\b{\u0010wJ0\u0010\u0080\u0001\u001a\u00020\u00122\u0012\u0010\u007f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020~0}0|2\b\u0010\u0018\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J#\u0010\u0083\u0001\u001a\u00020\u0015\"\u0005\b\u0000\u0010\u0082\u0001*\b\u0012\u0004\u0012\u00028\u00000|H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0085\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0086\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0087\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0088\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0089\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u008a\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b0\u0010\u008d\u0001R\u0017\u0010\u008e\u0001\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008c\u0001R\u0017\u0010\u008f\u0001\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0017\u0010\u0091\u0001\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008c\u0001R\u0017\u0010\u0094\u0001\u001a\u00020\u00158BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001¨\u0006\u0096\u0001"}, d2 = {"Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "Lcom/qonversion/android/sdk/internal/api/Api;", "api", "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;", "environmentProvider", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "config", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "logger", "Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;", "errorMapper", "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;", "delayCalculator", "<init>", "(Lcom/qonversion/android/sdk/internal/api/Api;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;)V", "Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;", "requestData", "Lef/C;", "init", "(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V", "", "contextKey", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;", "callback", "remoteConfig", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V", "", "contextKeys", "", "includeEmptyContextKey", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "remoteConfigList", "(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V", "(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V", "experimentId", "groupId", "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;", "attachUserToExperiment", "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V", "detachUserFromExperiment", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V", "remoteConfigurationId", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;", "attachUserToRemoteConfiguration", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V", "detachUserFromRemoteConfiguration", "", "installDate", "Lcom/qonversion/android/sdk/internal/purchase/Purchase;", "purchase", "qProductId", "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;", "(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V", "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;", "historyRecords", "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;", "requestTrigger", "restore", "(JLjava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V", "", "", "conversionInfo", "from", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/dto/QonversionError;", "onError", "attribution", "(Ljava/util/Map;Ljava/lang/String;Ltf/a;Ltf/l;)V", "properties", "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;", "sendProperties", "(Ljava/util/Map;Ltf/l;Ltf/l;)V", "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;", "getProperties", "(Ltf/l;Ltf/l;)V", "productIds", "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;", "eligibilityForProductIds", "(Ljava/util/List;JLcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V", "userID", "currentUserID", "identify", "(Ljava/lang/String;Ljava/lang/String;Ltf/l;Ltf/l;)V", ScreenActivity.INTENT_SCREEN_ID, "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;", "screens", "(Ljava/lang/String;Ltf/l;Ltf/l;)V", AdUnitActivity.EXTRA_VIEWS, "(Ljava/lang/String;)V", "queryParams", "Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;", "actionPoints", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;", "crashData", "crashReport", "(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Ltf/a;Ltf/l;)V", "Lcom/qonversion/android/sdk/internal/dto/purchase/History;", ClimateForcast.HISTORY, "trigger", "restoreRequest$sdk_release", "restoreRequest", "Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;", "createAttributionRequest", "(Ljava/util/Map;Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;", "", "attemptIndex", "purchaseRequest", "(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;I)V", "error", "errorCode", "retry", "handlePurchaseError", "(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/dto/QonversionError;Ljava/lang/Integer;ILtf/l;)V", "purchases", "Lcom/qonversion/android/sdk/internal/dto/purchase/Inapp;", "convertPurchases", "(Ljava/util/List;)Ljava/util/List;", "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;", "convertPurchaseDetails", "(Lcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;", "convertHistory", "Lzg/Q;", "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;", "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "response", "handlePermissionsResponse", "(Lzg/Q;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V", "T", "getLogMessage", "(Lzg/Q;)Ljava/lang/String;", "Lcom/qonversion/android/sdk/internal/api/Api;", "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;", "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;", "advertisingId", "Ljava/lang/String;", "J", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "isDebugMode", "Z", "sdkVersion", "getUid", "()Ljava/lang/String;", "uid", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultRepository implements QRepository {
    private static final int MAX_RETRIES_COUNT = 3;

    @Nullable
    private String advertisingId;

    @NotNull
    private final Api api;

    @NotNull
    private final InternalConfig config;

    @NotNull
    private final IncrementalDelayCalculator delayCalculator;

    @NotNull
    private final EnvironmentProvider environmentProvider;

    @NotNull
    private final ApiErrorMapper errorMapper;
    private long installDate;
    private final boolean isDebugMode;

    @NotNull
    private final String key;

    @NotNull
    private final Logger logger;

    @NotNull
    private final String sdkVersion;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "Lcom/qonversion/android/sdk/internal/dto/Data;", "Lcom/qonversion/android/sdk/internal/dto/ActionPoints;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$actionPoints$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        final /* synthetic */ l $onError;
        final /* synthetic */ l $onSuccess;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzg/Q;", "Lcom/qonversion/android/sdk/internal/dto/Data;", "Lcom/qonversion/android/sdk/internal/dto/ActionPoints;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$actionPoints$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01761 extends AbstractC3343n implements l {
            final /* synthetic */ l $onError;
            final /* synthetic */ l $onSuccess;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01761(DefaultRepository defaultRepository, l lVar, l lVar2) {
                super(1);
                this.this$0 = defaultRepository;
                this.$onSuccess = lVar;
                this.$onError = lVar2;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Q<Data<ActionPoints>>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Q<Data<ActionPoints>> it) {
                AbstractC3340k.e(it, "it");
                a.z("actionPointsRequest - ", this.this$0.getLogMessage(it), this.this$0.logger);
                Data data = (Data) it.f48596b;
                if (data == null || !it.f48595a.d()) {
                    this.$onError.invoke(this.this$0.errorMapper.getErrorFromResponse(it));
                    return;
                }
                l lVar = this.$onSuccess;
                Data data2 = (Data) o.z0(((ActionPoints) data.getData()).getItems());
                lVar.invoke(data2 != null ? (ActionPointScreen) data2.getData() : null);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$actionPoints$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements l {
            final /* synthetic */ l $onError;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DefaultRepository defaultRepository, l lVar) {
                super(1);
                this.this$0 = defaultRepository;
                this.$onError = lVar;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Throwable it) {
                AbstractC3340k.e(it, "it");
                this.this$0.logger.error("actionPointsRequest - failure - " + ErrorsKt.toQonversionError(it));
                this.$onError.invoke(ErrorsKt.toQonversionError(it));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, l lVar2) {
            super(1);
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CallBackKt<Data<ActionPoints>>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull CallBackKt<Data<ActionPoints>> enqueue) {
            AbstractC3340k.e(enqueue, "$this$enqueue");
            enqueue.setOnResponse(new C01761(DefaultRepository.this, this.$onSuccess, this.$onError));
            enqueue.setOnFailure(new AnonymousClass2(DefaultRepository.this, this.$onError));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "Ljava/lang/Void;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$attachUserToExperiment$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22041 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionExperimentAttachCallback $callback;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzg/Q;", "Ljava/lang/Void;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$attachUserToExperiment$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01771 extends AbstractC3343n implements l {
            final /* synthetic */ QonversionExperimentAttachCallback $callback;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01771(DefaultRepository defaultRepository, QonversionExperimentAttachCallback qonversionExperimentAttachCallback) {
                super(1);
                this.this$0 = defaultRepository;
                this.$callback = qonversionExperimentAttachCallback;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Q<Void>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Q<Void> it) {
                AbstractC3340k.e(it, "it");
                a.z("attachUserToExperimentRequest - ", this.this$0.getLogMessage(it), this.this$0.logger);
                if (it.f48595a.d()) {
                    this.$callback.onSuccess();
                } else {
                    this.$callback.onError(this.this$0.errorMapper.getErrorFromResponse(it));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$attachUserToExperiment$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements l {
            final /* synthetic */ QonversionExperimentAttachCallback $callback;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DefaultRepository defaultRepository, QonversionExperimentAttachCallback qonversionExperimentAttachCallback) {
                super(1);
                this.this$0 = defaultRepository;
                this.$callback = qonversionExperimentAttachCallback;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Throwable it) {
                AbstractC3340k.e(it, "it");
                this.this$0.logger.error("attachUserToExperimentRequest - failure - " + ErrorsKt.toQonversionError(it));
                this.$callback.onError(ErrorsKt.toQonversionError(it));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22041(QonversionExperimentAttachCallback qonversionExperimentAttachCallback) {
            super(1);
            this.$callback = qonversionExperimentAttachCallback;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CallBackKt<Void>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull CallBackKt<Void> enqueue) {
            AbstractC3340k.e(enqueue, "$this$enqueue");
            enqueue.setOnResponse(new C01771(DefaultRepository.this, this.$callback));
            enqueue.setOnFailure(new AnonymousClass2(DefaultRepository.this, this.$callback));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "Ljava/lang/Void;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$attachUserToRemoteConfiguration$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22051 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionRemoteConfigurationAttachCallback $callback;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzg/Q;", "Ljava/lang/Void;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$attachUserToRemoteConfiguration$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01781 extends AbstractC3343n implements l {
            final /* synthetic */ QonversionRemoteConfigurationAttachCallback $callback;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01781(DefaultRepository defaultRepository, QonversionRemoteConfigurationAttachCallback qonversionRemoteConfigurationAttachCallback) {
                super(1);
                this.this$0 = defaultRepository;
                this.$callback = qonversionRemoteConfigurationAttachCallback;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Q<Void>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Q<Void> it) {
                AbstractC3340k.e(it, "it");
                a.z("attachUserToRemoteConfigurationRequest - ", this.this$0.getLogMessage(it), this.this$0.logger);
                if (it.f48595a.d()) {
                    this.$callback.onSuccess();
                } else {
                    this.$callback.onError(this.this$0.errorMapper.getErrorFromResponse(it));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$attachUserToRemoteConfiguration$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements l {
            final /* synthetic */ QonversionRemoteConfigurationAttachCallback $callback;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DefaultRepository defaultRepository, QonversionRemoteConfigurationAttachCallback qonversionRemoteConfigurationAttachCallback) {
                super(1);
                this.this$0 = defaultRepository;
                this.$callback = qonversionRemoteConfigurationAttachCallback;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Throwable it) {
                AbstractC3340k.e(it, "it");
                this.this$0.logger.error("attachUserToRemoteConfigurationRequest - failure - " + ErrorsKt.toQonversionError(it));
                this.$callback.onError(ErrorsKt.toQonversionError(it));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22051(QonversionRemoteConfigurationAttachCallback qonversionRemoteConfigurationAttachCallback) {
            super(1);
            this.$callback = qonversionRemoteConfigurationAttachCallback;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CallBackKt<Void>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull CallBackKt<Void> enqueue) {
            AbstractC3340k.e(enqueue, "$this$enqueue");
            enqueue.setOnResponse(new C01781(DefaultRepository.this, this.$callback));
            enqueue.setOnFailure(new AnonymousClass2(DefaultRepository.this, this.$callback));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;", "Lcom/qonversion/android/sdk/internal/dto/Response;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$attribution$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22061 extends AbstractC3343n implements l {
        final /* synthetic */ l $onError;
        final /* synthetic */ tf.a $onSuccess;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzg/Q;", "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;", "Lcom/qonversion/android/sdk/internal/dto/Response;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$attribution$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01791 extends AbstractC3343n implements l {
            final /* synthetic */ l $onError;
            final /* synthetic */ tf.a $onSuccess;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01791(DefaultRepository defaultRepository, tf.a aVar, l lVar) {
                super(1);
                this.this$0 = defaultRepository;
                this.$onSuccess = aVar;
                this.$onError = lVar;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Q<BaseResponse<Response>>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Q<BaseResponse<Response>> it) {
                AbstractC3340k.e(it, "it");
                a.z("AttributionRequest - ", this.this$0.getLogMessage(it), this.this$0.logger);
                if (it.f48595a.d()) {
                    tf.a aVar = this.$onSuccess;
                    if (aVar != null) {
                        aVar.invoke();
                        return;
                    }
                    return;
                }
                l lVar = this.$onError;
                if (lVar != null) {
                    lVar.invoke(this.this$0.errorMapper.getErrorFromResponse(it));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$attribution$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements l {
            final /* synthetic */ l $onError;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DefaultRepository defaultRepository, l lVar) {
                super(1);
                this.this$0 = defaultRepository;
                this.$onError = lVar;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Throwable it) {
                AbstractC3340k.e(it, "it");
                this.this$0.logger.error("AttributionRequest - failure - " + ErrorsKt.toQonversionError(it));
                l lVar = this.$onError;
                if (lVar != null) {
                    lVar.invoke(ErrorsKt.toQonversionError(it));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22061(tf.a aVar, l lVar) {
            super(1);
            this.$onSuccess = aVar;
            this.$onError = lVar;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CallBackKt<BaseResponse<Response>>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull CallBackKt<BaseResponse<Response>> enqueue) {
            AbstractC3340k.e(enqueue, "$this$enqueue");
            enqueue.setOnResponse(new C01791(DefaultRepository.this, this.$onSuccess, this.$onError));
            enqueue.setOnFailure(new AnonymousClass2(DefaultRepository.this, this.$onError));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "Ljava/lang/Void;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$crashReport$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22071 extends AbstractC3343n implements l {
        final /* synthetic */ l $onError;
        final /* synthetic */ tf.a $onSuccess;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzg/Q;", "Ljava/lang/Void;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$crashReport$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01801 extends AbstractC3343n implements l {
            final /* synthetic */ l $onError;
            final /* synthetic */ tf.a $onSuccess;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01801(DefaultRepository defaultRepository, tf.a aVar, l lVar) {
                super(1);
                this.this$0 = defaultRepository;
                this.$onSuccess = aVar;
                this.$onError = lVar;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Q<Void>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Q<Void> it) {
                AbstractC3340k.e(it, "it");
                a.z("crashReportRequest - ", this.this$0.getLogMessage(it), this.this$0.logger);
                if (it.f48595a.d()) {
                    this.$onSuccess.invoke();
                } else {
                    this.$onError.invoke(this.this$0.errorMapper.getErrorFromResponse(it));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$crashReport$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements l {
            final /* synthetic */ l $onError;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DefaultRepository defaultRepository, l lVar) {
                super(1);
                this.this$0 = defaultRepository;
                this.$onError = lVar;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Throwable it) {
                AbstractC3340k.e(it, "it");
                this.this$0.logger.warn("crashReportRequest - failure - " + ErrorsKt.toQonversionError(it));
                this.$onError.invoke(ErrorsKt.toQonversionError(it));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22071(tf.a aVar, l lVar) {
            super(1);
            this.$onSuccess = aVar;
            this.$onError = lVar;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CallBackKt<Void>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull CallBackKt<Void> enqueue) {
            AbstractC3340k.e(enqueue, "$this$enqueue");
            enqueue.setOnResponse(new C01801(DefaultRepository.this, this.$onSuccess, this.$onError));
            enqueue.setOnFailure(new AnonymousClass2(DefaultRepository.this, this.$onError));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "Ljava/lang/Void;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$detachUserFromExperiment$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22081 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionExperimentAttachCallback $callback;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzg/Q;", "Ljava/lang/Void;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$detachUserFromExperiment$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01811 extends AbstractC3343n implements l {
            final /* synthetic */ QonversionExperimentAttachCallback $callback;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01811(DefaultRepository defaultRepository, QonversionExperimentAttachCallback qonversionExperimentAttachCallback) {
                super(1);
                this.this$0 = defaultRepository;
                this.$callback = qonversionExperimentAttachCallback;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Q<Void>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Q<Void> it) {
                AbstractC3340k.e(it, "it");
                a.z("detachUserFromExperimentRequest - ", this.this$0.getLogMessage(it), this.this$0.logger);
                if (it.f48595a.d()) {
                    this.$callback.onSuccess();
                } else {
                    this.$callback.onError(this.this$0.errorMapper.getErrorFromResponse(it));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$detachUserFromExperiment$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements l {
            final /* synthetic */ QonversionExperimentAttachCallback $callback;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DefaultRepository defaultRepository, QonversionExperimentAttachCallback qonversionExperimentAttachCallback) {
                super(1);
                this.this$0 = defaultRepository;
                this.$callback = qonversionExperimentAttachCallback;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Throwable it) {
                AbstractC3340k.e(it, "it");
                this.this$0.logger.error("detachUserFromExperimentRequest - failure - " + ErrorsKt.toQonversionError(it));
                this.$callback.onError(ErrorsKt.toQonversionError(it));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22081(QonversionExperimentAttachCallback qonversionExperimentAttachCallback) {
            super(1);
            this.$callback = qonversionExperimentAttachCallback;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CallBackKt<Void>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull CallBackKt<Void> enqueue) {
            AbstractC3340k.e(enqueue, "$this$enqueue");
            enqueue.setOnResponse(new C01811(DefaultRepository.this, this.$callback));
            enqueue.setOnFailure(new AnonymousClass2(DefaultRepository.this, this.$callback));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "Ljava/lang/Void;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$detachUserFromRemoteConfiguration$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22091 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionRemoteConfigurationAttachCallback $callback;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzg/Q;", "Ljava/lang/Void;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$detachUserFromRemoteConfiguration$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01821 extends AbstractC3343n implements l {
            final /* synthetic */ QonversionRemoteConfigurationAttachCallback $callback;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01821(DefaultRepository defaultRepository, QonversionRemoteConfigurationAttachCallback qonversionRemoteConfigurationAttachCallback) {
                super(1);
                this.this$0 = defaultRepository;
                this.$callback = qonversionRemoteConfigurationAttachCallback;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Q<Void>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Q<Void> it) {
                AbstractC3340k.e(it, "it");
                a.z("detachUserFromRemoteConfigurationRequest - ", this.this$0.getLogMessage(it), this.this$0.logger);
                if (it.f48595a.d()) {
                    this.$callback.onSuccess();
                } else {
                    this.$callback.onError(this.this$0.errorMapper.getErrorFromResponse(it));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$detachUserFromRemoteConfiguration$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements l {
            final /* synthetic */ QonversionRemoteConfigurationAttachCallback $callback;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DefaultRepository defaultRepository, QonversionRemoteConfigurationAttachCallback qonversionRemoteConfigurationAttachCallback) {
                super(1);
                this.this$0 = defaultRepository;
                this.$callback = qonversionRemoteConfigurationAttachCallback;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Throwable it) {
                AbstractC3340k.e(it, "it");
                this.this$0.logger.error("detachUserFromRemoteConfigurationRequest - failure - " + ErrorsKt.toQonversionError(it));
                this.$callback.onError(ErrorsKt.toQonversionError(it));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22091(QonversionRemoteConfigurationAttachCallback qonversionRemoteConfigurationAttachCallback) {
            super(1);
            this.$callback = qonversionRemoteConfigurationAttachCallback;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CallBackKt<Void>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull CallBackKt<Void> enqueue) {
            AbstractC3340k.e(enqueue, "$this$enqueue");
            enqueue.setOnResponse(new C01821(DefaultRepository.this, this.$callback));
            enqueue.setOnFailure(new AnonymousClass2(DefaultRepository.this, this.$callback));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;", "Lcom/qonversion/android/sdk/internal/dto/eligibility/EligibilityResult;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$eligibilityForProductIds$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22101 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionEligibilityCallback $callback;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzg/Q;", "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;", "Lcom/qonversion/android/sdk/internal/dto/eligibility/EligibilityResult;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$eligibilityForProductIds$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01831 extends AbstractC3343n implements l {
            final /* synthetic */ QonversionEligibilityCallback $callback;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01831(DefaultRepository defaultRepository, QonversionEligibilityCallback qonversionEligibilityCallback) {
                super(1);
                this.this$0 = defaultRepository;
                this.$callback = qonversionEligibilityCallback;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Q<BaseResponse<EligibilityResult>>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Q<BaseResponse<EligibilityResult>> it) {
                AbstractC3340k.e(it, "it");
                a.z("eligibilityRequest - ", this.this$0.getLogMessage(it), this.this$0.logger);
                BaseResponse baseResponse = (BaseResponse) it.f48596b;
                if (baseResponse == null || !baseResponse.getSuccess()) {
                    this.$callback.onError(this.this$0.errorMapper.getErrorFromResponse(it));
                } else {
                    this.$callback.onSuccess(((EligibilityResult) baseResponse.getData()).getProductsEligibility());
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$eligibilityForProductIds$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements l {
            final /* synthetic */ QonversionEligibilityCallback $callback;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DefaultRepository defaultRepository, QonversionEligibilityCallback qonversionEligibilityCallback) {
                super(1);
                this.this$0 = defaultRepository;
                this.$callback = qonversionEligibilityCallback;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Throwable it) {
                AbstractC3340k.e(it, "it");
                this.this$0.logger.error("eligibilityRequest - failure - " + ErrorsKt.toQonversionError(it));
                this.$callback.onError(ErrorsKt.toQonversionError(it));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22101(QonversionEligibilityCallback qonversionEligibilityCallback) {
            super(1);
            this.$callback = qonversionEligibilityCallback;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CallBackKt<BaseResponse<EligibilityResult>>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull CallBackKt<BaseResponse<EligibilityResult>> enqueue) {
            AbstractC3340k.e(enqueue, "$this$enqueue");
            enqueue.setOnResponse(new C01831(DefaultRepository.this, this.$callback));
            enqueue.setOnFailure(new AnonymousClass2(DefaultRepository.this, this.$callback));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "", "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$getProperties$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22111 extends AbstractC3343n implements l {
        final /* synthetic */ l $onError;
        final /* synthetic */ l $onSuccess;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzg/Q;", "", "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$getProperties$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01841 extends AbstractC3343n implements l {
            final /* synthetic */ l $onError;
            final /* synthetic */ l $onSuccess;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01841(DefaultRepository defaultRepository, l lVar, l lVar2) {
                super(1);
                this.this$0 = defaultRepository;
                this.$onSuccess = lVar;
                this.$onError = lVar2;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Q<List<QUserProperty>>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Q<List<QUserProperty>> it) {
                AbstractC3340k.e(it, "it");
                a.z("getPropertiesRequest - ", this.this$0.getLogMessage(it), this.this$0.logger);
                List list = (List) it.f48596b;
                if (!it.f48595a.d() || list == null) {
                    this.$onError.invoke(this.this$0.errorMapper.getErrorFromResponse(it));
                } else {
                    this.$onSuccess.invoke(list);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$getProperties$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements l {
            final /* synthetic */ l $onError;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DefaultRepository defaultRepository, l lVar) {
                super(1);
                this.this$0 = defaultRepository;
                this.$onError = lVar;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Throwable it) {
                AbstractC3340k.e(it, "it");
                this.this$0.logger.error("getPropertiesRequest - failure - " + ErrorsKt.toQonversionError(it));
                this.$onError.invoke(ErrorsKt.toQonversionError(it));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22111(l lVar, l lVar2) {
            super(1);
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CallBackKt<List<QUserProperty>>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull CallBackKt<List<QUserProperty>> enqueue) {
            AbstractC3340k.e(enqueue, "$this$enqueue");
            enqueue.setOnResponse(new C01841(DefaultRepository.this, this.$onSuccess, this.$onError));
            enqueue.setOnFailure(new AnonymousClass2(DefaultRepository.this, this.$onError));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "Lcom/qonversion/android/sdk/internal/dto/Data;", "Lcom/qonversion/android/sdk/internal/dto/identity/IdentityResult;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$identify$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22131 extends AbstractC3343n implements l {
        final /* synthetic */ l $onError;
        final /* synthetic */ l $onSuccess;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzg/Q;", "Lcom/qonversion/android/sdk/internal/dto/Data;", "Lcom/qonversion/android/sdk/internal/dto/identity/IdentityResult;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$identify$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01851 extends AbstractC3343n implements l {
            final /* synthetic */ l $onError;
            final /* synthetic */ l $onSuccess;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01851(DefaultRepository defaultRepository, l lVar, l lVar2) {
                super(1);
                this.this$0 = defaultRepository;
                this.$onSuccess = lVar;
                this.$onError = lVar2;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Q<Data<IdentityResult>>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Q<Data<IdentityResult>> it) {
                AbstractC3340k.e(it, "it");
                a.z("identityRequest - ", this.this$0.getLogMessage(it), this.this$0.logger);
                Data data = (Data) it.f48596b;
                if (data == null || !it.f48595a.d()) {
                    this.$onError.invoke(this.this$0.errorMapper.getErrorFromResponse(it));
                } else {
                    this.$onSuccess.invoke(((IdentityResult) data.getData()).getUserID());
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$identify$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements l {
            final /* synthetic */ l $onError;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DefaultRepository defaultRepository, l lVar) {
                super(1);
                this.this$0 = defaultRepository;
                this.$onError = lVar;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Throwable it) {
                AbstractC3340k.e(it, "it");
                this.this$0.logger.error("identityRequest - failure - " + ErrorsKt.toQonversionError(it));
                this.$onError.invoke(ErrorsKt.toQonversionError(it));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22131(l lVar, l lVar2) {
            super(1);
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CallBackKt<Data<IdentityResult>>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull CallBackKt<Data<IdentityResult>> enqueue) {
            AbstractC3340k.e(enqueue, "$this$enqueue");
            enqueue.setOnResponse(new C01851(DefaultRepository.this, this.$onSuccess, this.$onError));
            enqueue.setOnFailure(new AnonymousClass2(DefaultRepository.this, this.$onError));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;", "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$init$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22141 extends AbstractC3343n implements l {
        final /* synthetic */ InitRequestData $requestData;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzg/Q;", "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;", "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$init$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01861 extends AbstractC3343n implements l {
            final /* synthetic */ InitRequestData $requestData;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01861(DefaultRepository defaultRepository, InitRequestData initRequestData) {
                super(1);
                this.this$0 = defaultRepository;
                this.$requestData = initRequestData;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Q<BaseResponse<QLaunchResult>>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Q<BaseResponse<QLaunchResult>> it) {
                AbstractC3340k.e(it, "it");
                a.z("initRequest - ", this.this$0.getLogMessage(it), this.this$0.logger);
                BaseResponse baseResponse = (BaseResponse) it.f48596b;
                if (baseResponse == null || !baseResponse.getSuccess()) {
                    QonversionLaunchCallback callback = this.$requestData.getCallback();
                    if (callback != null) {
                        callback.onError(this.this$0.errorMapper.getErrorFromResponse(it));
                        return;
                    }
                    return;
                }
                QonversionLaunchCallback callback2 = this.$requestData.getCallback();
                if (callback2 != null) {
                    callback2.onSuccess((QLaunchResult) baseResponse.getData());
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$init$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements l {
            final /* synthetic */ InitRequestData $requestData;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DefaultRepository defaultRepository, InitRequestData initRequestData) {
                super(1);
                this.this$0 = defaultRepository;
                this.$requestData = initRequestData;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Throwable it) {
                AbstractC3340k.e(it, "it");
                this.this$0.logger.error("initRequest - failure - " + ErrorsKt.toQonversionError(it));
                QonversionLaunchCallback callback = this.$requestData.getCallback();
                if (callback != null) {
                    callback.onError(ErrorsKt.toQonversionError(it));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22141(InitRequestData initRequestData) {
            super(1);
            this.$requestData = initRequestData;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CallBackKt<BaseResponse<QLaunchResult>>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull CallBackKt<BaseResponse<QLaunchResult>> enqueue) {
            AbstractC3340k.e(enqueue, "$this$enqueue");
            enqueue.setOnResponse(new C01861(DefaultRepository.this, this.$requestData));
            enqueue.setOnFailure(new AnonymousClass2(DefaultRepository.this, this.$requestData));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;", "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$purchaseRequest$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22151 extends AbstractC3343n implements l {
        final /* synthetic */ int $attemptIndex;
        final /* synthetic */ QonversionLaunchCallback $callback;
        final /* synthetic */ long $installDate;
        final /* synthetic */ Purchase $purchase;
        final /* synthetic */ String $qProductId;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzg/Q;", "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;", "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$purchaseRequest$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01871 extends AbstractC3343n implements l {
            final /* synthetic */ int $attemptIndex;
            final /* synthetic */ QonversionLaunchCallback $callback;
            final /* synthetic */ long $installDate;
            final /* synthetic */ Purchase $purchase;
            final /* synthetic */ String $qProductId;
            final /* synthetic */ DefaultRepository this$0;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "nextAttemptIndex", "Lef/C;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$purchaseRequest$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C01881 extends AbstractC3343n implements l {
                final /* synthetic */ QonversionLaunchCallback $callback;
                final /* synthetic */ long $installDate;
                final /* synthetic */ Purchase $purchase;
                final /* synthetic */ String $qProductId;
                final /* synthetic */ DefaultRepository this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01881(DefaultRepository defaultRepository, long j8, Purchase purchase, String str, QonversionLaunchCallback qonversionLaunchCallback) {
                    super(1);
                    this.this$0 = defaultRepository;
                    this.$installDate = j8;
                    this.$purchase = purchase;
                    this.$qProductId = str;
                    this.$callback = qonversionLaunchCallback;
                }

                @Override // tf.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).intValue());
                    return C2515C.f34653a;
                }

                public final void invoke(int i5) {
                    this.this$0.purchaseRequest(this.$installDate, this.$purchase, this.$qProductId, this.$callback, i5);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01871(DefaultRepository defaultRepository, QonversionLaunchCallback qonversionLaunchCallback, int i5, long j8, Purchase purchase, String str) {
                super(1);
                this.this$0 = defaultRepository;
                this.$callback = qonversionLaunchCallback;
                this.$attemptIndex = i5;
                this.$installDate = j8;
                this.$purchase = purchase;
                this.$qProductId = str;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Q<BaseResponse<QLaunchResult>>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Q<BaseResponse<QLaunchResult>> it) {
                AbstractC3340k.e(it, "it");
                a.z("purchaseRequest - ", this.this$0.getLogMessage(it), this.this$0.logger);
                BaseResponse baseResponse = (BaseResponse) it.f48596b;
                if (baseResponse != null && baseResponse.getSuccess()) {
                    this.$callback.onSuccess((QLaunchResult) baseResponse.getData());
                } else {
                    DefaultRepository defaultRepository = this.this$0;
                    defaultRepository.handlePurchaseError(this.$callback, defaultRepository.errorMapper.getErrorFromResponse(it), Integer.valueOf(it.f48595a.f42398d), this.$attemptIndex, new C01881(this.this$0, this.$installDate, this.$purchase, this.$qProductId, this.$callback));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$purchaseRequest$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements l {
            final /* synthetic */ int $attemptIndex;
            final /* synthetic */ QonversionLaunchCallback $callback;
            final /* synthetic */ long $installDate;
            final /* synthetic */ Purchase $purchase;
            final /* synthetic */ String $qProductId;
            final /* synthetic */ DefaultRepository this$0;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "nextAttemptIndex", "Lef/C;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$purchaseRequest$1$2$1, reason: invalid class name and collision with other inner class name */
            public static final class C01891 extends AbstractC3343n implements l {
                final /* synthetic */ QonversionLaunchCallback $callback;
                final /* synthetic */ long $installDate;
                final /* synthetic */ Purchase $purchase;
                final /* synthetic */ String $qProductId;
                final /* synthetic */ DefaultRepository this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01891(DefaultRepository defaultRepository, long j8, Purchase purchase, String str, QonversionLaunchCallback qonversionLaunchCallback) {
                    super(1);
                    this.this$0 = defaultRepository;
                    this.$installDate = j8;
                    this.$purchase = purchase;
                    this.$qProductId = str;
                    this.$callback = qonversionLaunchCallback;
                }

                @Override // tf.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).intValue());
                    return C2515C.f34653a;
                }

                public final void invoke(int i5) {
                    this.this$0.purchaseRequest(this.$installDate, this.$purchase, this.$qProductId, this.$callback, i5);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DefaultRepository defaultRepository, QonversionLaunchCallback qonversionLaunchCallback, int i5, long j8, Purchase purchase, String str) {
                super(1);
                this.this$0 = defaultRepository;
                this.$callback = qonversionLaunchCallback;
                this.$attemptIndex = i5;
                this.$installDate = j8;
                this.$purchase = purchase;
                this.$qProductId = str;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Throwable it) {
                AbstractC3340k.e(it, "it");
                this.this$0.logger.error("purchaseRequest - failure - " + ErrorsKt.toQonversionError(it));
                this.this$0.handlePurchaseError(this.$callback, ErrorsKt.toQonversionError(it), null, this.$attemptIndex, new C01891(this.this$0, this.$installDate, this.$purchase, this.$qProductId, this.$callback));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22151(QonversionLaunchCallback qonversionLaunchCallback, int i5, long j8, Purchase purchase, String str) {
            super(1);
            this.$callback = qonversionLaunchCallback;
            this.$attemptIndex = i5;
            this.$installDate = j8;
            this.$purchase = purchase;
            this.$qProductId = str;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CallBackKt<BaseResponse<QLaunchResult>>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull CallBackKt<BaseResponse<QLaunchResult>> enqueue) {
            AbstractC3340k.e(enqueue, "$this$enqueue");
            enqueue.setOnResponse(new C01871(DefaultRepository.this, this.$callback, this.$attemptIndex, this.$installDate, this.$purchase, this.$qProductId));
            enqueue.setOnFailure(new AnonymousClass2(DefaultRepository.this, this.$callback, this.$attemptIndex, this.$installDate, this.$purchase, this.$qProductId));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$remoteConfig$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22161 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionRemoteConfigCallback $callback;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzg/Q;", "Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$remoteConfig$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01901 extends AbstractC3343n implements l {
            final /* synthetic */ QonversionRemoteConfigCallback $callback;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01901(DefaultRepository defaultRepository, QonversionRemoteConfigCallback qonversionRemoteConfigCallback) {
                super(1);
                this.this$0 = defaultRepository;
                this.$callback = qonversionRemoteConfigCallback;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Q<QRemoteConfig>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Q<QRemoteConfig> it) {
                AbstractC3340k.e(it, "it");
                a.z("remoteConfigRequest - ", this.this$0.getLogMessage(it), this.this$0.logger);
                QRemoteConfig qRemoteConfig = (QRemoteConfig) it.f48596b;
                if (qRemoteConfig == null) {
                    this.$callback.onError(this.this$0.errorMapper.getErrorFromResponse(it));
                } else if (qRemoteConfig.getIsCorrect()) {
                    this.$callback.onSuccess(qRemoteConfig);
                } else {
                    this.$callback.onError(new QonversionError(QonversionErrorCode.RemoteConfigurationNotAvailable, null, null, 6, null));
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$remoteConfig$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements l {
            final /* synthetic */ QonversionRemoteConfigCallback $callback;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DefaultRepository defaultRepository, QonversionRemoteConfigCallback qonversionRemoteConfigCallback) {
                super(1);
                this.this$0 = defaultRepository;
                this.$callback = qonversionRemoteConfigCallback;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Throwable it) {
                AbstractC3340k.e(it, "it");
                this.this$0.logger.error("remoteConfigRequest - failure - " + ErrorsKt.toQonversionError(it));
                this.$callback.onError(ErrorsKt.toQonversionError(it));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22161(QonversionRemoteConfigCallback qonversionRemoteConfigCallback) {
            super(1);
            this.$callback = qonversionRemoteConfigCallback;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CallBackKt<QRemoteConfig>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull CallBackKt<QRemoteConfig> enqueue) {
            AbstractC3340k.e(enqueue, "$this$enqueue");
            enqueue.setOnResponse(new C01901(DefaultRepository.this, this.$callback));
            enqueue.setOnFailure(new AnonymousClass2(DefaultRepository.this, this.$callback));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "", "Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$remoteConfigList$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22171 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionRemoteConfigListCallback $callback;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzg/Q;", "", "Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$remoteConfigList$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01911 extends AbstractC3343n implements l {
            final /* synthetic */ QonversionRemoteConfigListCallback $callback;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01911(DefaultRepository defaultRepository, QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback) {
                super(1);
                this.this$0 = defaultRepository;
                this.$callback = qonversionRemoteConfigListCallback;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Q<List<QRemoteConfig>>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Q<List<QRemoteConfig>> it) {
                AbstractC3340k.e(it, "it");
                a.z("remoteConfigListRequest for specific context keys - ", this.this$0.getLogMessage(it), this.this$0.logger);
                List list = (List) it.f48596b;
                if (list == null) {
                    this.$callback.onError(this.this$0.errorMapper.getErrorFromResponse(it));
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((QRemoteConfig) obj).getIsCorrect()) {
                        arrayList.add(obj);
                    }
                }
                this.$callback.onSuccess(new QRemoteConfigList(arrayList));
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$remoteConfigList$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements l {
            final /* synthetic */ QonversionRemoteConfigListCallback $callback;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DefaultRepository defaultRepository, QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback) {
                super(1);
                this.this$0 = defaultRepository;
                this.$callback = qonversionRemoteConfigListCallback;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Throwable it) {
                AbstractC3340k.e(it, "it");
                this.this$0.logger.error("remoteConfigRequest for specific context keys - failure - " + ErrorsKt.toQonversionError(it));
                this.$callback.onError(ErrorsKt.toQonversionError(it));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22171(QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback) {
            super(1);
            this.$callback = qonversionRemoteConfigListCallback;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CallBackKt<List<QRemoteConfig>>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull CallBackKt<List<QRemoteConfig>> enqueue) {
            AbstractC3340k.e(enqueue, "$this$enqueue");
            enqueue.setOnResponse(new C01911(DefaultRepository.this, this.$callback));
            enqueue.setOnFailure(new AnonymousClass2(DefaultRepository.this, this.$callback));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "", "Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$remoteConfigList$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements l {
        final /* synthetic */ QonversionRemoteConfigListCallback $callback;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzg/Q;", "", "Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$remoteConfigList$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC3343n implements l {
            final /* synthetic */ QonversionRemoteConfigListCallback $callback;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DefaultRepository defaultRepository, QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback) {
                super(1);
                this.this$0 = defaultRepository;
                this.$callback = qonversionRemoteConfigListCallback;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Q<List<QRemoteConfig>>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Q<List<QRemoteConfig>> it) {
                AbstractC3340k.e(it, "it");
                a.z("remoteConfigListRequest for all context keys - ", this.this$0.getLogMessage(it), this.this$0.logger);
                List list = (List) it.f48596b;
                if (list == null) {
                    this.$callback.onError(this.this$0.errorMapper.getErrorFromResponse(it));
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((QRemoteConfig) obj).getIsCorrect()) {
                        arrayList.add(obj);
                    }
                }
                this.$callback.onSuccess(new QRemoteConfigList(arrayList));
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$remoteConfigList$2$2, reason: invalid class name and collision with other inner class name */
        public static final class C01922 extends AbstractC3343n implements l {
            final /* synthetic */ QonversionRemoteConfigListCallback $callback;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01922(DefaultRepository defaultRepository, QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback) {
                super(1);
                this.this$0 = defaultRepository;
                this.$callback = qonversionRemoteConfigListCallback;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Throwable it) {
                AbstractC3340k.e(it, "it");
                this.this$0.logger.error("remoteConfigRequest for all context keys - failure - " + ErrorsKt.toQonversionError(it));
                this.$callback.onError(ErrorsKt.toQonversionError(it));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(QonversionRemoteConfigListCallback qonversionRemoteConfigListCallback) {
            super(1);
            this.$callback = qonversionRemoteConfigListCallback;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CallBackKt<List<QRemoteConfig>>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull CallBackKt<List<QRemoteConfig>> enqueue) {
            AbstractC3340k.e(enqueue, "$this$enqueue");
            enqueue.setOnResponse(new AnonymousClass1(DefaultRepository.this, this.$callback));
            enqueue.setOnFailure(new C01922(DefaultRepository.this, this.$callback));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "Lcom/qonversion/android/sdk/internal/dto/Data;", "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$screens$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22181 extends AbstractC3343n implements l {
        final /* synthetic */ l $onError;
        final /* synthetic */ l $onSuccess;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzg/Q;", "Lcom/qonversion/android/sdk/internal/dto/Data;", "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$screens$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01931 extends AbstractC3343n implements l {
            final /* synthetic */ l $onError;
            final /* synthetic */ l $onSuccess;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01931(DefaultRepository defaultRepository, l lVar, l lVar2) {
                super(1);
                this.this$0 = defaultRepository;
                this.$onSuccess = lVar;
                this.$onError = lVar2;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Q<Data<Screen>>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Q<Data<Screen>> it) {
                AbstractC3340k.e(it, "it");
                a.z("screensRequest - ", this.this$0.getLogMessage(it), this.this$0.logger);
                Data data = (Data) it.f48596b;
                if (data == null || !it.f48595a.d()) {
                    this.$onError.invoke(this.this$0.errorMapper.getErrorFromResponse(it));
                } else {
                    this.$onSuccess.invoke(data.getData());
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$screens$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements l {
            final /* synthetic */ l $onError;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DefaultRepository defaultRepository, l lVar) {
                super(1);
                this.this$0 = defaultRepository;
                this.$onError = lVar;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Throwable it) {
                AbstractC3340k.e(it, "it");
                this.this$0.logger.error("screensRequest - failure - " + ErrorsKt.toQonversionError(it));
                this.$onError.invoke(ErrorsKt.toQonversionError(it));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22181(l lVar, l lVar2) {
            super(1);
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CallBackKt<Data<Screen>>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull CallBackKt<Data<Screen>> enqueue) {
            AbstractC3340k.e(enqueue, "$this$enqueue");
            enqueue.setOnResponse(new C01931(DefaultRepository.this, this.$onSuccess, this.$onError));
            enqueue.setOnFailure(new AnonymousClass2(DefaultRepository.this, this.$onError));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$sendProperties$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22191 extends AbstractC3343n implements l {
        final /* synthetic */ l $onError;
        final /* synthetic */ l $onSuccess;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzg/Q;", "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$sendProperties$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01941 extends AbstractC3343n implements l {
            final /* synthetic */ l $onError;
            final /* synthetic */ l $onSuccess;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01941(DefaultRepository defaultRepository, l lVar, l lVar2) {
                super(1);
                this.this$0 = defaultRepository;
                this.$onSuccess = lVar;
                this.$onError = lVar2;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Q<SendPropertiesResult>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Q<SendPropertiesResult> it) {
                AbstractC3340k.e(it, "it");
                a.z("sendPropertiesRequest - ", this.this$0.getLogMessage(it), this.this$0.logger);
                SendPropertiesResult sendPropertiesResult = (SendPropertiesResult) it.f48596b;
                if (!it.f48595a.d() || sendPropertiesResult == null) {
                    this.$onError.invoke(this.this$0.errorMapper.getErrorFromResponse(it));
                } else {
                    this.$onSuccess.invoke(sendPropertiesResult);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$sendProperties$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements l {
            final /* synthetic */ l $onError;
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DefaultRepository defaultRepository, l lVar) {
                super(1);
                this.this$0 = defaultRepository;
                this.$onError = lVar;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Throwable it) {
                AbstractC3340k.e(it, "it");
                this.this$0.logger.error("sendPropertiesRequest - failure - " + ErrorsKt.toQonversionError(it));
                this.$onError.invoke(ErrorsKt.toQonversionError(it));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22191(l lVar, l lVar2) {
            super(1);
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CallBackKt<SendPropertiesResult>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull CallBackKt<SendPropertiesResult> enqueue) {
            AbstractC3340k.e(enqueue, "$this$enqueue");
            enqueue.setOnResponse(new C01941(DefaultRepository.this, this.$onSuccess, this.$onError));
            enqueue.setOnFailure(new AnonymousClass2(DefaultRepository.this, this.$onError));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "Ljava/lang/Void;", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$views$1, reason: invalid class name and case insensitive filesystem */
    public static final class C22201 extends AbstractC3343n implements l {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzg/Q;", "Ljava/lang/Void;", "it", "Lef/C;", "invoke", "(Lzg/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$views$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01951 extends AbstractC3343n implements l {
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01951(DefaultRepository defaultRepository) {
                super(1);
                this.this$0 = defaultRepository;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Q<Void>) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Q<Void> it) {
                AbstractC3340k.e(it, "it");
                a.z("viewsRequest - ", this.this$0.getLogMessage(it), this.this$0.logger);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.qonversion.android.sdk.internal.repository.DefaultRepository$views$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements l {
            final /* synthetic */ DefaultRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DefaultRepository defaultRepository) {
                super(1);
                this.this$0 = defaultRepository;
            }

            @Override // tf.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C2515C.f34653a;
            }

            public final void invoke(@NotNull Throwable it) {
                AbstractC3340k.e(it, "it");
                this.this$0.logger.error("viewsRequest - failure - " + ErrorsKt.toQonversionError(it));
            }
        }

        public C22201() {
            super(1);
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CallBackKt<Void>) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull CallBackKt<Void> enqueue) {
            AbstractC3340k.e(enqueue, "$this$enqueue");
            enqueue.setOnResponse(new C01951(DefaultRepository.this));
            enqueue.setOnFailure(new AnonymousClass2(DefaultRepository.this));
        }
    }

    public DefaultRepository(@NotNull Api api, @NotNull EnvironmentProvider environmentProvider, @NotNull InternalConfig config, @NotNull Logger logger, @NotNull ApiErrorMapper errorMapper, @NotNull IncrementalDelayCalculator delayCalculator) {
        AbstractC3340k.e(api, "api");
        AbstractC3340k.e(environmentProvider, "environmentProvider");
        AbstractC3340k.e(config, "config");
        AbstractC3340k.e(logger, "logger");
        AbstractC3340k.e(errorMapper, "errorMapper");
        AbstractC3340k.e(delayCalculator, "delayCalculator");
        this.api = api;
        this.environmentProvider = environmentProvider;
        this.config = config;
        this.logger = logger;
        this.errorMapper = errorMapper;
        this.delayCalculator = delayCalculator;
        this.key = config.getPrimaryConfig().getProjectKey();
        this.isDebugMode = config.isSandbox();
        this.sdkVersion = config.getPrimaryConfig().getSdkVersion();
    }

    private final List<History> convertHistory(List<PurchaseHistory> historyRecords) {
        History history;
        ArrayList arrayList = new ArrayList();
        for (PurchaseHistory purchaseHistory : historyRecords) {
            String productId = UtilsKt.getProductId(purchaseHistory.getHistoryRecord());
            if (productId == null) {
                history = null;
            } else {
                String purchaseToken = purchaseHistory.getHistoryRecord().getPurchaseToken();
                AbstractC3340k.d(purchaseToken, "getPurchaseToken(...)");
                history = new History(productId, purchaseToken, ExtensionsKt.milliSecondsToSeconds(purchaseHistory.getHistoryRecord().getPurchaseTime()));
            }
            if (history != null) {
                arrayList.add(history);
            }
        }
        return arrayList;
    }

    private final PurchaseDetails convertPurchaseDetails(Purchase purchase, String qProductId) {
        String purchaseToken = purchase.getPurchaseToken();
        long purchaseTime = purchase.getPurchaseTime();
        String orderId = purchase.getOrderId();
        String originalOrderId = purchase.getOriginalOrderId();
        String storeProductId = purchase.getStoreProductId();
        if (storeProductId == null) {
            storeProductId = "";
        }
        return new PurchaseDetails(purchaseToken, purchaseTime, orderId, originalOrderId, storeProductId, qProductId != null ? qProductId : "", purchase.getContextKeys(), purchase.getScreenUid());
    }

    public static /* synthetic */ PurchaseDetails convertPurchaseDetails$default(DefaultRepository defaultRepository, Purchase purchase, String str, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = null;
        }
        return defaultRepository.convertPurchaseDetails(purchase, str);
    }

    private final List<Inapp> convertPurchases(List<Purchase> purchases) {
        ArrayList arrayList = new ArrayList();
        if (purchases != null) {
            Iterator<T> it = purchases.iterator();
            while (it.hasNext()) {
                arrayList.add(new Inapp(convertPurchaseDetails$default(this, (Purchase) it.next(), null, 2, null)));
            }
        }
        return o.S0(arrayList);
    }

    private final AttributionRequest createAttributionRequest(Map<String, ? extends Object> conversionInfo, String from) {
        return new AttributionRequest(EnvironmentProvider.getInfo$default(this.environmentProvider, null, 1, null), this.sdkVersion, this.key, new ProviderData(conversionInfo, from), getUid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> String getLogMessage(Q<T> q4) {
        StringBuilder sb2;
        if (q4.f48595a.d()) {
            sb2 = new StringBuilder("success - ");
        } else {
            q4 = (Q<T>) this.errorMapper.getErrorFromResponse(q4);
            sb2 = new StringBuilder("failure - ");
        }
        sb2.append(q4);
        return sb2.toString();
    }

    private final String getUid() {
        return this.config.getUid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePermissionsResponse(Q<BaseResponse<QLaunchResult>> response, QonversionLaunchCallback callback) {
        BaseResponse baseResponse = (BaseResponse) response.f48596b;
        if (baseResponse == null || !baseResponse.getSuccess()) {
            if (callback != null) {
                callback.onError(this.errorMapper.getErrorFromResponse(response));
            }
        } else if (callback != null) {
            callback.onSuccess((QLaunchResult) baseResponse.getData());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePurchaseError(QonversionLaunchCallback callback, QonversionError error, Integer errorCode, int attemptIndex, final l retry) {
        if (attemptIndex >= 3 || !(errorCode == null || ExtensionsKt.isInternalServerError(errorCode.intValue()))) {
            callback.onError(error);
            return;
        }
        final int i5 = attemptIndex + 1;
        if (attemptIndex == 0) {
            retry.invoke(Integer.valueOf(i5));
            return;
        }
        try {
            new Timer("Delayed retry", false).schedule(new TimerTask() { // from class: com.qonversion.android.sdk.internal.repository.DefaultRepository.handlePurchaseError.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    retry.invoke(Integer.valueOf(i5));
                }
            }, ExtensionsKt.secondsToMilliSeconds(this.delayCalculator.countDelay(0, attemptIndex - 1)));
        } catch (RuntimeException unused) {
            retry.invoke(Integer.valueOf(i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void purchaseRequest(long installDate, Purchase purchase, String qProductId, QonversionLaunchCallback callback, int attemptIndex) {
        ExtensionsKt.enqueue(this.api.purchase(new PurchaseRequest(installDate, this.environmentProvider.getInfo(this.advertisingId), this.sdkVersion, this.key, getUid(), null, ExtensionsKt.stringValue(this.isDebugMode), convertPurchaseDetails(purchase, qProductId), 32, null), RequestTrigger.Purchase.getKey(), attemptIndex + 1), new C22151(callback, attemptIndex, installDate, purchase, qProductId));
    }

    public static /* synthetic */ void purchaseRequest$default(DefaultRepository defaultRepository, long j8, Purchase purchase, String str, QonversionLaunchCallback qonversionLaunchCallback, int i5, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            i5 = 0;
        }
        defaultRepository.purchaseRequest(j8, purchase, str, qonversionLaunchCallback, i5);
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void actionPoints(@NotNull Map<String, String> queryParams, @NotNull l onSuccess, @NotNull l onError) {
        AbstractC3340k.e(queryParams, "queryParams");
        AbstractC3340k.e(onSuccess, "onSuccess");
        AbstractC3340k.e(onError, "onError");
        ExtensionsKt.enqueue(this.api.actionPoints(getUid(), queryParams), new AnonymousClass1(onSuccess, onError));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void attachUserToExperiment(@NotNull String experimentId, @NotNull String groupId, @NotNull QonversionExperimentAttachCallback callback) {
        AbstractC3340k.e(experimentId, "experimentId");
        AbstractC3340k.e(groupId, "groupId");
        AbstractC3340k.e(callback, "callback");
        ExtensionsKt.enqueue(this.api.attachUserToExperiment(experimentId, getUid(), new AttachUserRequest(groupId)), new C22041(callback));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void attachUserToRemoteConfiguration(@NotNull String remoteConfigurationId, @NotNull QonversionRemoteConfigurationAttachCallback callback) {
        AbstractC3340k.e(remoteConfigurationId, "remoteConfigurationId");
        AbstractC3340k.e(callback, "callback");
        ExtensionsKt.enqueue(this.api.attachUserToRemoteConfiguration(remoteConfigurationId, getUid()), new C22051(callback));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void attribution(@NotNull Map<String, ? extends Object> conversionInfo, @NotNull String from, @Nullable tf.a onSuccess, @Nullable l onError) {
        AbstractC3340k.e(conversionInfo, "conversionInfo");
        AbstractC3340k.e(from, "from");
        ExtensionsKt.enqueue(this.api.attribution(createAttributionRequest(conversionInfo, from)), new C22061(onSuccess, onError));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void crashReport(@NotNull CrashRequest crashData, @NotNull tf.a onSuccess, @NotNull l onError) {
        AbstractC3340k.e(crashData, "crashData");
        AbstractC3340k.e(onSuccess, "onSuccess");
        AbstractC3340k.e(onError, "onError");
        ExtensionsKt.enqueue(Api.DefaultImpls.crashLogs$default(this.api, crashData, null, 2, null), new C22071(onSuccess, onError));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void detachUserFromExperiment(@NotNull String experimentId, @NotNull QonversionExperimentAttachCallback callback) {
        AbstractC3340k.e(experimentId, "experimentId");
        AbstractC3340k.e(callback, "callback");
        ExtensionsKt.enqueue(this.api.detachUserFromExperiment(experimentId, getUid()), new C22081(callback));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void detachUserFromRemoteConfiguration(@NotNull String remoteConfigurationId, @NotNull QonversionRemoteConfigurationAttachCallback callback) {
        AbstractC3340k.e(remoteConfigurationId, "remoteConfigurationId");
        AbstractC3340k.e(callback, "callback");
        ExtensionsKt.enqueue(this.api.detachUserFromRemoteConfiguration(remoteConfigurationId, getUid()), new C22091(callback));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void eligibilityForProductIds(@NotNull List<String> productIds, long installDate, @NotNull QonversionEligibilityCallback callback) {
        AbstractC3340k.e(productIds, "productIds");
        AbstractC3340k.e(callback, "callback");
        Environment info = this.environmentProvider.getInfo(this.advertisingId);
        String str = this.sdkVersion;
        String str2 = this.key;
        String uid = getUid();
        String strStringValue = ExtensionsKt.stringValue(this.isDebugMode);
        List<String> list = productIds;
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new StoreProductInfo((String) it.next()));
        }
        ExtensionsKt.enqueue(this.api.eligibility(new EligibilityRequest(installDate, info, str, str2, uid, null, strStringValue, arrayList, 32, null)), new C22101(callback));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void getProperties(@NotNull l onSuccess, @NotNull l onError) {
        AbstractC3340k.e(onSuccess, "onSuccess");
        AbstractC3340k.e(onError, "onError");
        ExtensionsKt.enqueue(this.api.getProperties(getUid()), new C22111(onSuccess, onError));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void identify(@NotNull String userID, @NotNull String currentUserID, @NotNull l onSuccess, @NotNull l onError) {
        AbstractC3340k.e(userID, "userID");
        AbstractC3340k.e(currentUserID, "currentUserID");
        AbstractC3340k.e(onSuccess, "onSuccess");
        AbstractC3340k.e(onError, "onError");
        ExtensionsKt.enqueue(this.api.identify(new IdentityRequest(currentUserID, userID)), new C22131(onSuccess, onError));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void init(@NotNull InitRequestData requestData) {
        AbstractC3340k.e(requestData, "requestData");
        this.advertisingId = requestData.getIdfa();
        this.installDate = requestData.getInstallDate();
        ExtensionsKt.enqueue(this.api.init(new InitRequest(this.installDate, this.environmentProvider.getInfo(this.advertisingId), this.sdkVersion, this.key, getUid(), null, ExtensionsKt.stringValue(this.isDebugMode), convertPurchases(requestData.getPurchases()), 32, null), requestData.getRequestTrigger().getKey()), new C22141(requestData));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void purchase(long installDate, @NotNull Purchase purchase, @Nullable String qProductId, @NotNull QonversionLaunchCallback callback) {
        AbstractC3340k.e(purchase, "purchase");
        AbstractC3340k.e(callback, "callback");
        purchaseRequest$default(this, installDate, purchase, qProductId, callback, 0, 16, null);
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void remoteConfig(@Nullable String contextKey, @NotNull QonversionRemoteConfigCallback callback) {
        AbstractC3340k.e(callback, "callback");
        ExtensionsKt.enqueue(this.api.remoteConfig(getUid(), contextKey), new C22161(callback));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void remoteConfigList(@NotNull List<String> contextKeys, boolean includeEmptyContextKey, @NotNull QonversionRemoteConfigListCallback callback) {
        AbstractC3340k.e(contextKeys, "contextKeys");
        AbstractC3340k.e(callback, "callback");
        ExtensionsKt.enqueue(this.api.remoteConfigList(getUid(), contextKeys, includeEmptyContextKey), new C22171(callback));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void restore(long installDate, @NotNull List<PurchaseHistory> historyRecords, @NotNull QonversionLaunchCallback callback, @NotNull RequestTrigger requestTrigger) {
        AbstractC3340k.e(historyRecords, "historyRecords");
        AbstractC3340k.e(callback, "callback");
        AbstractC3340k.e(requestTrigger, "requestTrigger");
        restoreRequest$sdk_release(installDate, convertHistory(historyRecords), callback, requestTrigger);
    }

    public final void restoreRequest$sdk_release(long installDate, @NotNull List<History> history, @NotNull QonversionLaunchCallback callback, @NotNull RequestTrigger trigger) {
        AbstractC3340k.e(history, "history");
        AbstractC3340k.e(callback, "callback");
        AbstractC3340k.e(trigger, "trigger");
        ExtensionsKt.enqueue(this.api.restore(new RestoreRequest(installDate, this.environmentProvider.getInfo(this.advertisingId), this.sdkVersion, this.key, getUid(), null, ExtensionsKt.stringValue(this.isDebugMode), history, 32, null), trigger.getKey()), new DefaultRepository$restoreRequest$1(this, callback));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void screens(@NotNull String screenId, @NotNull l onSuccess, @NotNull l onError) {
        AbstractC3340k.e(screenId, "screenId");
        AbstractC3340k.e(onSuccess, "onSuccess");
        AbstractC3340k.e(onError, "onError");
        ExtensionsKt.enqueue(this.api.screens(screenId), new C22181(onSuccess, onError));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void sendProperties(@NotNull Map<String, String> properties, @NotNull l onSuccess, @NotNull l onError) {
        AbstractC3340k.e(properties, "properties");
        AbstractC3340k.e(onSuccess, "onSuccess");
        AbstractC3340k.e(onError, "onError");
        ArrayList arrayList = new ArrayList(properties.size());
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            arrayList.add(new UserPropertyRequestData(entry.getKey(), entry.getValue()));
        }
        ExtensionsKt.enqueue(this.api.sendProperties(getUid(), arrayList), new C22191(onSuccess, onError));
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void views(@NotNull String screenId) {
        AbstractC3340k.e(screenId, "screenId");
        ExtensionsKt.enqueue(this.api.views(screenId, new ViewsRequest(getUid())), new C22201());
    }

    @Override // com.qonversion.android.sdk.internal.repository.QRepository
    public void remoteConfigList(@NotNull QonversionRemoteConfigListCallback callback) {
        AbstractC3340k.e(callback, "callback");
        ExtensionsKt.enqueue(Api.DefaultImpls.remoteConfigList$default(this.api, getUid(), false, 2, null), new AnonymousClass2(callback));
    }
}
