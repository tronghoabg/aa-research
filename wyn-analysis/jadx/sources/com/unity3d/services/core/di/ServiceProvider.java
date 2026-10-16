package com.unity3d.services.core.di;

import Ef.A;
import Ef.C;
import Ef.E;
import Ef.InterfaceC0501m0;
import Fe.c;
import Fe.e;
import android.content.Context;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import com.unity3d.ads.core.configuration.CommonAlternativeFlowReader;
import com.unity3d.ads.core.configuration.ForceAlternativeFlow;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAdQualityVersionDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyConfigStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLocalCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.datasource.CachedFIdDataSource;
import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.FIdDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration;
import com.unity3d.ads.core.data.datasource.ForegroundDurationReader;
import com.unity3d.ads.core.data.datasource.InstallReferrerDataSource;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StoreDataSource;
import com.unity3d.ads.core.data.datasource.TcfDataSource;
import com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.manager.AndroidOfferwallManager;
import com.unity3d.ads.core.data.manager.AndroidOmidManager;
import com.unity3d.ads.core.data.manager.AndroidSDKPropertiesManager;
import com.unity3d.ads.core.data.manager.AndroidScarManager;
import com.unity3d.ads.core.data.manager.AndroidStorageManager;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRevenueRepository;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.data.repository.AndroidCampaignRepository;
import com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.AndroidSessionRepository;
import com.unity3d.ads.core.data.repository.AndroidTcfRepository;
import com.unity3d.ads.core.data.repository.AndroidTransactionEventRepository;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.AdRefresh;
import com.unity3d.ads.core.domain.AndroidAdRefresh;
import com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.AndroidCacheAssets;
import com.unity3d.ads.core.domain.AndroidCacheWebViewAssets;
import com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.AndroidGenerateByteStringId;
import com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.AndroidGetAdRequest;
import com.unity3d.ads.core.domain.AndroidGetAdRequestPolicy;
import com.unity3d.ads.core.domain.AndroidGetClientInfo;
import com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationData;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload;
import com.unity3d.ads.core.domain.AndroidGetIsAdActivity;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken;
import com.unity3d.ads.core.domain.AndroidGetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.AndroidGetSafeguardedInitializationPolicy;
import com.unity3d.ads.core.domain.AndroidGetSharedDataTimestamps;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.AndroidHandleFocusCounters;
import com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.AndroidHandleOpenUrl;
import com.unity3d.ads.core.domain.AndroidHttpClientProvider;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.ads.core.domain.AndroidIntentCreation;
import com.unity3d.ads.core.domain.AndroidLoad;
import com.unity3d.ads.core.domain.AndroidRefresh;
import com.unity3d.ads.core.domain.AndroidRemoveUrlQuery;
import com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent;
import com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.AndroidShow;
import com.unity3d.ads.core.domain.AndroidTestDataInfo;
import com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.BuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.CacheAssets;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.CacheWebViewAssets;
import com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CleanAssets;
import com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires;
import com.unity3d.ads.core.domain.CommonAwaitInitialization;
import com.unity3d.ads.core.domain.CommonCacheFile;
import com.unity3d.ads.core.domain.CommonCheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CommonCleanAssets;
import com.unity3d.ads.core.domain.CommonCreateFile;
import com.unity3d.ads.core.domain.CommonGetAdObject;
import com.unity3d.ads.core.domain.CommonGetAdPlayer;
import com.unity3d.ads.core.domain.CommonGetCacheDirectory;
import com.unity3d.ads.core.domain.CommonGetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.CommonGetGameId;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonGetInitializationState;
import com.unity3d.ads.core.domain.CommonGetIsFileCache;
import com.unity3d.ads.core.domain.CommonGetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonMediationInfoConverter;
import com.unity3d.ads.core.domain.CommonMediationProviderParser;
import com.unity3d.ads.core.domain.CommonSafeCallbackInvoke;
import com.unity3d.ads.core.domain.CommonSetGameId;
import com.unity3d.ads.core.domain.CommonSetInitializationState;
import com.unity3d.ads.core.domain.CommonShouldAllowInitialization;
import com.unity3d.ads.core.domain.CommonTokenNumberProvider;
import com.unity3d.ads.core.domain.CommonValidateGameId;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAdPlayer;
import com.unity3d.ads.core.domain.GetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAdRequest;
import com.unity3d.ads.core.domain.GetAssetFileName;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetClientInfo;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitRequestPolicy;
import com.unity3d.ads.core.domain.GetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetInitializationData;
import com.unity3d.ads.core.domain.GetInitializationRequest;
import com.unity3d.ads.core.domain.GetInitializationRequestPayload;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy;
import com.unity3d.ads.core.domain.GetOtherRequestPolicy;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.HandleDebugSettings;
import com.unity3d.ads.core.domain.HandleGatewayAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.IntentCreation;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.Load;
import com.unity3d.ads.core.domain.MediationInfoConverter;
import com.unity3d.ads.core.domain.MediationProviderParser;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.RemoveUrlQuery;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.SetGameId;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.Show;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.domain.ValidateExtrasSize;
import com.unity3d.ads.core.domain.ValidateGameId;
import com.unity3d.ads.core.domain.adload.AndroidWebViewLessLoadStrategy;
import com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy;
import com.unity3d.ads.core.domain.adquality.AndroidInitializeAdQuality;
import com.unity3d.ads.core.domain.adquality.InitializeAdQuality;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback;
import com.unity3d.ads.core.domain.events.AdRevenueObserver;
import com.unity3d.ads.core.domain.events.AndroidGetAdRevenueEventData;
import com.unity3d.ads.core.domain.events.AndroidGetTransactionData;
import com.unity3d.ads.core.domain.events.AndroidHandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.CommonGetTransactionRequest;
import com.unity3d.ads.core.domain.events.CommonUniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.events.DiagnosticEventObserver;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.events.GetAdRevenueEventData;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.events.GetOperativeEventRequest;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.domain.events.HandleAdRevenueEvent;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.LifecycleEventObserver;
import com.unity3d.ads.core.domain.events.MaxAdRevenueCommunicatorProxyFactory;
import com.unity3d.ads.core.domain.events.MaxAdRevenueObserver;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.ads.core.domain.events.TransactionEventObserver;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK;
import com.unity3d.ads.core.domain.om.AndroidOmFinishSession;
import com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.CommonGetOmData;
import com.unity3d.ads.core.domain.om.CommonIsOMActivated;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.privacy.DeveloperConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.LegacyUserConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.CommonScarEligibleEffectiveUseCase;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.GetAndroidTokenEventRequest;
import com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest;
import com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest;
import com.unity3d.ads.core.domain.scar.HandleGetTokenRequest;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.core.log.UnityLogger;
import com.unity3d.ads.core.utils.CommonCoroutineTimer;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.ads.gatewayclient.AndroidRequestUrlFactory;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestUrlFactory;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeContentObserver;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import com.unity3d.services.core.fid.Constants;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.reflection.AppLovinCommunicatorBridge;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.core.GatewayStoreExceptionHandler;
import com.unity3d.services.store.core.StoreEventListenerFactory;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapterFactory;
import ef.C2515C;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import jf.C3109i;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.I;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.a;
import tf.l;
import tf.p;
import u1.InterfaceC4215d;
import u1.InterfaceC4220i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u00103\u001a\u000202H\u0016J\b\u00104\u001a\u000202H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/unity3d/services/core/di/ServiceProvider;", "Lcom/unity3d/services/core/di/IServiceProvider;", "()V", "CDN_CREATIVES_HOST", "", "CDN_CREATIVES_PORT", "", "DATA_STORE_GATEWAY_CACHE", "DATA_STORE_GL_INFO", "DATA_STORE_IAP_TRANSACTION", "DATA_STORE_NATIVE_CONFIG", "DATA_STORE_PRIVACY", "DATA_STORE_PRIVACY_FSM", "DATA_STORE_UNIVERSAL_REQUEST", "DATA_STORE_WEBVIEW_CONFIG", "DEFAULT_DISPATCHER", "DEV_CONSENT_PRIVACY_RULES", "DIAGNOSTICS_EVENT_SENDER", "GATEWAY_HOST", "GATEWAY_PORT", "HTTP_CACHE_DISK_SIZE", "", "HTTP_CLIENT_FETCH_TIMEOUT", "IO_DISPATCHER", "LEGACY_PRIVACY_RULES", "MAIN_DISPATCHER", "NAMED_AD_REQ", "NAMED_GET_TOKEN_SCOPE", "NAMED_ILRD_SCOPE", "NAMED_INIT_REQ", "NAMED_INIT_SCOPE", "NAMED_LIFECYCLE_SCOPE", "NAMED_LOAD_SCOPE", "NAMED_LOCAL", "NAMED_OFFERWALL_SCOPE", "NAMED_OMID_SCOPE", "NAMED_OPERATIVE_REQ", "NAMED_OTHER_REQ", "NAMED_PUBLIC_JOB", "NAMED_REMOTE", "NAMED_SCAR_SCOPE", "NAMED_SDK", "NAMED_SHOW_SCOPE", "NAMED_TRANSACTION_SCOPE", "OPERATIVE_EVENT_SENDER", "PREF_GL_INFO", "SCAR_SIGNALS_FETCH_TIMEOUT", "SCAR_VERSION_FETCH_TIMEOUT", "UNIVERSAL_EVENT_SENDER", "serviceRegistry", "Lcom/unity3d/services/core/di/IServicesRegistry;", "getRegistry", MobileAdsBridgeBase.initializeMethodName, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ServiceProvider implements IServiceProvider {

    @NotNull
    public static final String CDN_CREATIVES_HOST = "cdn-creatives-cf-prd.acquire.unity3dusercontent.com";
    public static final int CDN_CREATIVES_PORT = 443;

    @NotNull
    public static final String DATA_STORE_GATEWAY_CACHE = "gateway_cache.pb";

    @NotNull
    public static final String DATA_STORE_GL_INFO = "glinfo.pb";

    @NotNull
    public static final String DATA_STORE_IAP_TRANSACTION = "iap_transaction.pb";

    @NotNull
    public static final String DATA_STORE_NATIVE_CONFIG = "native_configuration.pb";

    @NotNull
    public static final String DATA_STORE_PRIVACY = "privacy.pb";

    @NotNull
    public static final String DATA_STORE_PRIVACY_FSM = "privacy_fsm.pb";

    @NotNull
    public static final String DATA_STORE_UNIVERSAL_REQUEST = "universal_request.pb";

    @NotNull
    public static final String DATA_STORE_WEBVIEW_CONFIG = "webview_config.pb";

    @NotNull
    public static final String DEFAULT_DISPATCHER = "default_dispatcher";

    @NotNull
    public static final String DEV_CONSENT_PRIVACY_RULES = "dev_consent_privacy_rules";

    @NotNull
    public static final String DIAGNOSTICS_EVENT_SENDER = "diagnostics";

    @NotNull
    public static final String GATEWAY_HOST = "gateway.unityads.unity3d.com";
    public static final int GATEWAY_PORT = 443;
    public static final long HTTP_CACHE_DISK_SIZE = 20971520;
    public static final long HTTP_CLIENT_FETCH_TIMEOUT = 500;

    @NotNull
    public static final ServiceProvider INSTANCE;

    @NotNull
    public static final String IO_DISPATCHER = "io_dispatcher";

    @NotNull
    public static final String LEGACY_PRIVACY_RULES = "legacy_privacy_rules";

    @NotNull
    public static final String MAIN_DISPATCHER = "main_dispatcher";

    @NotNull
    public static final String NAMED_AD_REQ = "ad_req";

    @NotNull
    public static final String NAMED_GET_TOKEN_SCOPE = "get_token_scope";

    @NotNull
    public static final String NAMED_ILRD_SCOPE = "ilrd_scope";

    @NotNull
    public static final String NAMED_INIT_REQ = "init_req";

    @NotNull
    public static final String NAMED_INIT_SCOPE = "init_scope";

    @NotNull
    public static final String NAMED_LIFECYCLE_SCOPE = "lifecycle_scope";

    @NotNull
    public static final String NAMED_LOAD_SCOPE = "load_scope";

    @NotNull
    public static final String NAMED_LOCAL = "local";

    @NotNull
    public static final String NAMED_OFFERWALL_SCOPE = "offerwall_scope";

    @NotNull
    public static final String NAMED_OMID_SCOPE = "omid_scope";

    @NotNull
    public static final String NAMED_OPERATIVE_REQ = "op_event_req";

    @NotNull
    public static final String NAMED_OTHER_REQ = "other_req";

    @NotNull
    public static final String NAMED_PUBLIC_JOB = "public_job";

    @NotNull
    public static final String NAMED_REMOTE = "remote";

    @NotNull
    public static final String NAMED_SCAR_SCOPE = "scar_scope";

    @NotNull
    public static final String NAMED_SDK = "sdk";

    @NotNull
    public static final String NAMED_SHOW_SCOPE = "show_scope";

    @NotNull
    public static final String NAMED_TRANSACTION_SCOPE = "transaction_scope";

    @NotNull
    public static final String OPERATIVE_EVENT_SENDER = "operative";

    @NotNull
    public static final String PREF_GL_INFO = "glinfo";
    public static final long SCAR_SIGNALS_FETCH_TIMEOUT = 50000;
    public static final long SCAR_VERSION_FETCH_TIMEOUT = 5000;

    @NotNull
    public static final String UNIVERSAL_EVENT_SENDER = "universal";

    @NotNull
    private static final IServicesRegistry serviceRegistry;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/unity3d/services/core/di/ServicesRegistry;", "Lef/C;", "invoke", "(Lcom/unity3d/services/core/di/ServicesRegistry;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02031 extends AbstractC3343n implements a {
            public static final C02031 INSTANCE = new C02031();

            public C02031() {
                super(0);
            }

            @Override // tf.a
            public final Context invoke() {
                return ClientProperties.getApplicationContext();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LEf/E;", "invoke", "()LEf/E;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$10, reason: invalid class name */
        public static final class AnonymousClass10 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass10(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final E invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.transactionCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))), (C) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, i5.getOrCreateKotlinClass(C.class))), (InterfaceC0501m0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, i5.getOrCreateKotlinClass(InterfaceC0501m0.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/Show;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$100, reason: invalid class name */
        public static final class AnonymousClass100 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass100(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final Show invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidShow((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AdRepository.class))), (GameServerIdReader) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GameServerIdReader.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (ValidateExtrasSize) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ValidateExtrasSize.class))), (HandleGatewayAdResponse) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(HandleGatewayAdResponse.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/CacheFile;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$101, reason: invalid class name */
        public static final class AnonymousClass101 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass101(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final CacheFile invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new CommonCacheFile((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/CleanAssets;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$102, reason: invalid class name */
        public static final class AnonymousClass102 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass102(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final CleanAssets invoke() {
                return new CommonCleanAssets((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(CacheRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetAdObject;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$103, reason: invalid class name */
        public static final class AnonymousClass103 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass103(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetAdObject invoke() {
                return new CommonGetAdObject((AdRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(AdRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$104, reason: invalid class name */
        public static final class AnonymousClass104 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass104(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final ScarEligibleEffectiveUseCase invoke() {
                return new CommonScarEligibleEffectiveUseCase((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$105, reason: invalid class name */
        public static final class AnonymousClass105 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass105(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetHeaderBiddingToken invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new CommonGetHeaderBiddingToken((BuildHeaderBiddingToken) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(BuildHeaderBiddingToken.class))), (FetchSignalsAndSendUseCase) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(FetchSignalsAndSendUseCase.class))), (ScarEligibleEffectiveUseCase) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ScarEligibleEffectiveUseCase.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$106, reason: invalid class name */
        public static final class AnonymousClass106 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass106(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final BuildHeaderBiddingToken invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidBuildHeaderBiddingToken((GetByteStringId) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetByteStringId.class))), (GetClientInfo) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetClientInfo.class))), (GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetSharedDataTimestamps.class))), (GetLimitedSessionToken) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetLimitedSessionToken.class))), (GetInitializationData) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetInitializationData.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CampaignRepository.class))), (TcfRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(TcfRepository.class))), (AndroidTestDataInfo) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AndroidTestDataInfo.class))), (OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(OfferwallManager.class))), (MediationInfoConverter) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(MediationInfoConverter.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/TokenNumberProvider;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$107, reason: invalid class name */
        public static final class AnonymousClass107 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass107(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final TokenNumberProvider invoke() {
                return new CommonTokenNumberProvider((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetInitializationData;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$108, reason: invalid class name */
        public static final class AnonymousClass108 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass108(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetInitializationData invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidGetInitializationData((GetInitializationRequestPayload) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetInitializationRequestPayload.class))), (GetUniversalRequestSharedData) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetUniversalRequestSharedData.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$109, reason: invalid class name */
        public static final class AnonymousClass109 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass109(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final MediationInitBlobMetadataReader invoke() {
                return new MediationInitBlobMetadataReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("MEMORY", H.f39741a.getOrCreateKotlinClass(JsonStorage.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LEf/E;", "invoke", "()LEf/E;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$11, reason: invalid class name */
        public static final class AnonymousClass11 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass11(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final E invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.ilrdCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))), (C) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, i5.getOrCreateKotlinClass(C.class))), (InterfaceC0501m0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, i5.getOrCreateKotlinClass(InterfaceC0501m0.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$110, reason: invalid class name */
        public static final class AnonymousClass110 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass110(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetInitializationRequestPayload invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidGetInitializationRequestPayload((GetClientInfo) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetClientInfo.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DeviceInfoRepository.class))), (LegacyUserConsentRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(LegacyUserConsentRepository.class))), (MediationInitBlobMetadataReader) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(MediationInitBlobMetadataReader.class))), (InstallReferrerDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(InstallReferrerDataSource.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$111, reason: invalid class name */
        public static final class AnonymousClass111 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass111(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetInitializationState invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new CommonGetInitializationState((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SDKPropertiesManager.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetIsFileCache;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$112, reason: invalid class name */
        public static final class AnonymousClass112 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass112(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetIsFileCache invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new CommonGetIsFileCache((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CacheRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetAssetFileName) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetAssetFileName.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/SetInitializationState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$113, reason: invalid class name */
        public static final class AnonymousClass113 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass113(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final SetInitializationState invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new CommonSetInitializationState((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SDKPropertiesManager.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$114, reason: invalid class name */
        public static final class AnonymousClass114 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass114(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetRequestPolicy invoke() {
                return new AndroidGetAdRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetAdDataRefreshRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$115, reason: invalid class name */
        public static final class AnonymousClass115 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass115(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetAdDataRefreshRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidGetAdDataRefreshRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DeviceInfoRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CampaignRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$116, reason: invalid class name */
        public static final class AnonymousClass116 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass116(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetAdPlayerConfigRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidGetAdPlayerConfigRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (MediationInfoConverter) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(MediationInfoConverter.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerContext;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$117, reason: invalid class name */
        public static final class AnonymousClass117 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass117(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AndroidGetAdPlayerContext invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidGetAdPlayerContext((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetAdRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$118, reason: invalid class name */
        public static final class AnonymousClass118 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass118(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetAdRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidGetAdRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DeviceInfoRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CampaignRepository.class))), (WebviewConfigurationDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(WebviewConfigurationDataSource.class))), (TcfRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(TcfRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/scar/GetHbTokenEventRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$119, reason: invalid class name */
        public static final class AnonymousClass119 extends AbstractC3343n implements a {
            public static final AnonymousClass119 INSTANCE = new AnonymousClass119();

            public AnonymousClass119() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final GetHbTokenEventRequest invoke() {
                return new GetAndroidTokenEventRequest();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LEf/E;", "invoke", "()LEf/E;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$12, reason: invalid class name */
        public static final class AnonymousClass12 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass12(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final E invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.lifecycleCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))), (C) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, i5.getOrCreateKotlinClass(C.class))), (InterfaceC0501m0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, i5.getOrCreateKotlinClass(InterfaceC0501m0.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/scar/CommonScarEventReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$120, reason: invalid class name */
        public static final class AnonymousClass120 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass120(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final CommonScarEventReceiver invoke() {
                return new CommonScarEventReceiver((E) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, H.f39741a.getOrCreateKotlinClass(E.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/ads/gmascar/GMAScarAdapterBridge;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$121, reason: invalid class name */
        public static final class AnonymousClass121 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass121(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GMAScarAdapterBridge invoke() {
                GMAScarAdapterBridge bridge = GMA.getInstance(new GMAEventSender((IEventSender) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(CommonScarEventReceiver.class))))).getBridge();
                AbstractC3340k.d(bridge, "getInstance(GMAEventSend…EventReceiver>())).bridge");
                return bridge;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/scar/ScarTimeHackFixer;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$122, reason: invalid class name */
        public static final class AnonymousClass122 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass122(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final ScarTimeHackFixer invoke() {
                return new ScarTimeHackFixer((SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$123, reason: invalid class name */
        public static final class AnonymousClass123 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass123(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final ScarManager invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidScarManager((CommonScarEventReceiver) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CommonScarEventReceiver.class))), (GMAScarAdapterBridge) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GMAScarAdapterBridge.class))), (ScarTimeHackFixer) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ScarTimeHackFixer.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/scar/FetchSignalsAndSendUseCase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$124, reason: invalid class name */
        public static final class AnonymousClass124 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass124(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final FetchSignalsAndSendUseCase invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidFetchSignalsAndSendUseCase((E) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, i5.getOrCreateKotlinClass(E.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ScarManager.class))), (HandleGetTokenRequest) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(HandleGetTokenRequest.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (ScarEligibleEffectiveUseCase) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ScarEligibleEffectiveUseCase.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/scar/LoadScarAd;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$125, reason: invalid class name */
        public static final class AnonymousClass125 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass125(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final LoadScarAd invoke() {
                return new LoadScarAd((ScarManager) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(ScarManager.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/scar/HandleGetTokenRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$126, reason: invalid class name */
        public static final class AnonymousClass126 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass126(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final HandleGetTokenRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new HandleAndroidGetTokenRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (GetHbTokenEventRequest) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetHbTokenEventRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, i5.getOrCreateKotlinClass(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GatewayClient.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$127, reason: invalid class name */
        public static final class AnonymousClass127 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass127(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetClientInfo invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidGetClientInfo((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (MediationRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(MediationRepository.class))), (OmidManager) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(OmidManager.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ScarManager.class))), (OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(OfferwallManager.class))), (FIdExistenceDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(FIdExistenceDataSource.class))), (AdQualityVersionDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AdQualityVersionDataSource.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$128, reason: invalid class name */
        public static final class AnonymousClass128 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass128(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetInitializationCompletedRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidGetInitializationCompletedRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DeviceInfoRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetInitializationRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$129, reason: invalid class name */
        public static final class AnonymousClass129 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass129(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetInitializationRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidGetInitializationRequest((GetInitializationRequestPayload) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetInitializationRequestPayload.class))), (GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LEf/E;", "invoke", "()LEf/E;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$13, reason: invalid class name */
        public static final class AnonymousClass13 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass13(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final E invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.getTokenCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))), (C) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, i5.getOrCreateKotlinClass(C.class))), (InterfaceC0501m0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, i5.getOrCreateKotlinClass(InterfaceC0501m0.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$130, reason: invalid class name */
        public static final class AnonymousClass130 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass130(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetLimitedSessionToken invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidGetLimitedSessionToken((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (MediationRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(MediationRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetOpenGLRendererInfo;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$131, reason: invalid class name */
        public static final class AnonymousClass131 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass131(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetOpenGLRendererInfo invoke() {
                return new AndroidGetOpenGLRendererInfo((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$132, reason: invalid class name */
        public static final class AnonymousClass132 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass132(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetSharedDataTimestamps invoke() {
                return new AndroidGetSharedDataTimestamps((ForegroundDurationReader) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(ForegroundDurationReader.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$133, reason: invalid class name */
        public static final class AnonymousClass133 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass133(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetUniversalRequestForPayLoad invoke() {
                return new AndroidGetUniversalRequestForPayLoad((GetUniversalRequestSharedData) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(GetUniversalRequestSharedData.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$134, reason: invalid class name */
        public static final class AnonymousClass134 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass134(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetUniversalRequestSharedData invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidGetUniversalRequestSharedData((GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetSharedDataTimestamps.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DeviceInfoRepository.class))), (GetLimitedSessionToken) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetLimitedSessionToken.class))), (DeveloperConsentRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DeveloperConsentRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$135, reason: invalid class name */
        public static final class AnonymousClass135 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass135(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetCachedAsset invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new GetCachedAsset((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CacheRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (CacheWebViewAssets) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CacheWebViewAssets.class))), (GetAssetFileName) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetAssetFileName.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$136, reason: invalid class name */
        public static final class AnonymousClass136 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass136(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetWebViewBridgeUseCase invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new CommonGetWebViewBridgeUseCase((A) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Logger.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$137, reason: invalid class name */
        public static final class AnonymousClass137 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass137(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetRequestPolicy invoke() {
                return new GetInitRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$138, reason: invalid class name */
        public static final class AnonymousClass138 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass138(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetLatestWebViewConfiguration invoke() {
                return new GetLatestWebViewConfiguration((WebviewConfigurationDataSource) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(WebviewConfigurationDataSource.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$139, reason: invalid class name */
        public static final class AnonymousClass139 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass139(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetRequestPolicy invoke() {
                return new GetOperativeEventRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LEf/E;", "invoke", "()LEf/E;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$14, reason: invalid class name */
        public static final class AnonymousClass14 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass14(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final E invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.scarSignalsCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))), (C) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, i5.getOrCreateKotlinClass(C.class))), (InterfaceC0501m0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, i5.getOrCreateKotlinClass(InterfaceC0501m0.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$140, reason: invalid class name */
        public static final class AnonymousClass140 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass140(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetRequestPolicy invoke() {
                return new GetOtherRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetPrivacyUpdateRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$141, reason: invalid class name */
        public static final class AnonymousClass141 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass141(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetPrivacyUpdateRequest invoke() {
                return new GetPrivacyUpdateRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$142, reason: invalid class name */
        public static final class AnonymousClass142 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass142(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final HandleGatewayInitializationResponse invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidHandleGatewayInitializationResponse((TransactionEventManager) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(TransactionEventManager.class))), (AdRevenueObserver) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AdRevenueObserver.class))), (MaxAdRevenueObserver) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(MaxAdRevenueObserver.class))), (LifecycleEventObserver) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(LifecycleEventObserver.class))), (TriggerInitializationCompletedRequest) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(TriggerInitializationCompletedRequest.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (E) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, i5.getOrCreateKotlinClass(E.class))), (HandleDebugSettings) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(HandleDebugSettings.class))), (GetSafeguardedInitializationPolicy) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetSafeguardedInitializationPolicy.class))), (NativeConfigurationOuterClass.NativeConfiguration) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(NativeConfigurationOuterClass.NativeConfiguration.class))), (InitializeAdQuality) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(InitializeAdQuality.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$143, reason: invalid class name */
        public static final class AnonymousClass143 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass143(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final HandleGatewayUniversalResponse invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidHandleGatewayUniversalResponse((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DeviceInfoRepository.class))), (AndroidAppSetIdDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AndroidAppSetIdDataSource.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/InitializeBoldSDK;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$144, reason: invalid class name */
        public static final class AnonymousClass144 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass144(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InitializeBoldSDK invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidInitializeBoldSDK((A) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (InitializeOMSDK) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(InitializeOMSDK.class))), (GetInitializationRequest) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetInitializationRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, i5.getOrCreateKotlinClass(GetRequestPolicy.class))), (CleanAssets) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CleanAssets.class))), (HandleGatewayInitializationResponse) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(HandleGatewayInitializationResponse.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GatewayClient.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (EventObservers) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(EventObservers.class))), (TriggerInitializeListener) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(TriggerInitializeListener.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DiagnosticEventRepository.class))), (StorageManager) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(StorageManager.class))), (ConfigurationReader) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ConfigurationReader.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SDKPropertiesManager.class))), (GetGameId) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetGameId.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Logger.class))), (AndroidHandleFocusCounters) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AndroidHandleFocusCounters.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/LegacyShowUseCase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$145, reason: invalid class name */
        public static final class AnonymousClass145 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass145(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final LegacyShowUseCase invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new LegacyShowUseCase((Show) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Show.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AdRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetOperativeEventApi) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetOperativeEventApi.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetInitializationState.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (SafeCallbackInvoke) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SafeCallbackInvoke.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Logger.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/SendPrivacyUpdateRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$146, reason: invalid class name */
        public static final class AnonymousClass146 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass146(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final SendPrivacyUpdateRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new SendPrivacyUpdateRequest((GetPrivacyUpdateRequest) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetPrivacyUpdateRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, i5.getOrCreateKotlinClass(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GatewayClient.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$147, reason: invalid class name */
        public static final class AnonymousClass147 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass147(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final TriggerInitializationCompletedRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidTriggerInitializationCompletedRequest((GetInitializationCompletedRequest) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetInitializationCompletedRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, i5.getOrCreateKotlinClass(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GatewayClient.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/TriggerInitializeListener;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$148, reason: invalid class name */
        public static final class AnonymousClass148 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass148(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final TriggerInitializeListener invoke() {
                return new TriggerInitializeListener((A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, H.f39741a.getOrCreateKotlinClass(A.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/DiagnosticEventObserver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$149, reason: invalid class name */
        public static final class AnonymousClass149 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass149(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final DiagnosticEventObserver invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new DiagnosticEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (GetDiagnosticEventBatchRequest) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetDiagnosticEventBatchRequest.class))), (A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DiagnosticEventRepository.class))), (UniversalRequestDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(UniversalRequestDataSource.class))), (BackgroundWorker) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(BackgroundWorker.class))), (UniversalRequestEventSender) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DIAGNOSTICS_EVENT_SENDER, i5.getOrCreateKotlinClass(UniversalRequestEventSender.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, i5.getOrCreateKotlinClass(GetRequestPolicy.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LEf/E;", "invoke", "()LEf/E;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$15, reason: invalid class name */
        public static final class AnonymousClass15 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass15(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final E invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.offerwallSignalsCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))), (C) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, i5.getOrCreateKotlinClass(C.class))), (InterfaceC0501m0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, i5.getOrCreateKotlinClass(InterfaceC0501m0.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/EventObservers;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$150, reason: invalid class name */
        public static final class AnonymousClass150 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass150(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final EventObservers invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new EventObservers((OperativeEventObserver) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(OperativeEventObserver.class))), (DiagnosticEventObserver) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DiagnosticEventObserver.class))), (TransactionEventObserver) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(TransactionEventObserver.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/GetTransactionData;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$151, reason: invalid class name */
        public static final class AnonymousClass151 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass151(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetTransactionData invoke() {
                return new AndroidGetTransactionData((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(GetByteStringId.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$152, reason: invalid class name */
        public static final class AnonymousClass152 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass152(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetTransactionRequest invoke() {
                return new CommonGetTransactionRequest((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(DeviceInfoRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/GetAdRevenueEventData;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$153, reason: invalid class name */
        public static final class AnonymousClass153 extends AbstractC3343n implements a {
            public static final AnonymousClass153 INSTANCE = new AnonymousClass153();

            public AnonymousClass153() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final GetAdRevenueEventData invoke() {
                return new AndroidGetAdRevenueEventData();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/HandleAdRevenueEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$154, reason: invalid class name */
        public static final class AnonymousClass154 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass154(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final HandleAdRevenueEvent invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new HandleAdRevenueEvent((AdRevenueRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AdRevenueRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DeviceInfoRepository.class))), (GetAdRevenueEventData) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetAdRevenueEventData.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventBatchRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$155, reason: invalid class name */
        public static final class AnonymousClass155 extends AbstractC3343n implements a {
            public static final AnonymousClass155 INSTANCE = new AnonymousClass155();

            public AnonymousClass155() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final GetDiagnosticEventBatchRequest invoke() {
                return new GetDiagnosticEventBatchRequest();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$156, reason: invalid class name */
        public static final class AnonymousClass156 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass156(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetDiagnosticEventRequest invoke() {
                return new GetDiagnosticEventRequest((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(GetSharedDataTimestamps.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$157, reason: invalid class name */
        public static final class AnonymousClass157 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass157(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetOperativeEventApi invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new GetOperativeEventApi((OperativeEventRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(OperativeEventRepository.class))), (GetOperativeEventRequest) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetOperativeEventRequest.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$158, reason: invalid class name */
        public static final class AnonymousClass158 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass158(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetOperativeEventRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new GetOperativeEventRequest((GetByteStringId) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetByteStringId.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CampaignRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$159, reason: invalid class name */
        public static final class AnonymousClass159 extends AbstractC3343n implements a {
            public static final AnonymousClass159 INSTANCE = new AnonymousClass159();

            public AnonymousClass159() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final HandleGatewayEventResponse invoke() {
                return new AndroidHandleGatewayEventResponse();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LEf/E;", "invoke", "()LEf/E;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$16, reason: invalid class name */
        public static final class AnonymousClass16 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass16(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final E invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.omidCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))), (C) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, i5.getOrCreateKotlinClass(C.class))), (InterfaceC0501m0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, i5.getOrCreateKotlinClass(InterfaceC0501m0.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/OperativeEventObserver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$160, reason: invalid class name */
        public static final class AnonymousClass160 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass160(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final OperativeEventObserver invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new OperativeEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (OperativeEventRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(OperativeEventRepository.class))), (UniversalRequestDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(UniversalRequestDataSource.class))), (BackgroundWorker) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(BackgroundWorker.class))), (UniversalRequestEventSender) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.OPERATIVE_EVENT_SENDER, i5.getOrCreateKotlinClass(UniversalRequestEventSender.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OPERATIVE_REQ, i5.getOrCreateKotlinClass(GetRequestPolicy.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/TransactionEventObserver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$161, reason: invalid class name */
        public static final class AnonymousClass161 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass161(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final TransactionEventObserver invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new TransactionEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (E) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, i5.getOrCreateKotlinClass(E.class))), (TransactionEventRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(TransactionEventRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GatewayClient.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, i5.getOrCreateKotlinClass(GetRequestPolicy.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, i5.getOrCreateKotlinClass(ByteStringDataSource.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$162, reason: invalid class name */
        public static final class AnonymousClass162 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass162(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AdRevenueObserver invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AdRevenueObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (E) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_ILRD_SCOPE, i5.getOrCreateKotlinClass(E.class))), (AdRevenueRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AdRevenueRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GatewayClient.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, i5.getOrCreateKotlinClass(GetRequestPolicy.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Logger.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/LifecycleEventObserver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$163, reason: invalid class name */
        public static final class AnonymousClass163 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass163(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final LifecycleEventObserver invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new LifecycleEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (E) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_LIFECYCLE_SCOPE, i5.getOrCreateKotlinClass(E.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(LifecycleDataSource.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DeviceInfoRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GatewayClient.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, i5.getOrCreateKotlinClass(GetRequestPolicy.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Logger.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/reflection/AppLovinCommunicatorBridge;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$164, reason: invalid class name */
        public static final class AnonymousClass164 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass164(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AppLovinCommunicatorBridge invoke() {
                return new AppLovinCommunicatorBridge((Context) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(Context.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/MaxAdRevenueCommunicatorProxyFactory;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$165, reason: invalid class name */
        public static final class AnonymousClass165 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass165(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final MaxAdRevenueCommunicatorProxyFactory invoke() {
                return new MaxAdRevenueCommunicatorProxyFactory((Logger) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(Logger.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/MaxAdRevenueListener;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$166, reason: invalid class name */
        public static final class AnonymousClass166 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass166(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final MaxAdRevenueListener invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new MaxAdRevenueListener((HandleAdRevenueEvent) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(HandleAdRevenueEvent.class))), (E) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_ILRD_SCOPE, i5.getOrCreateKotlinClass(E.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Logger.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/MaxAdRevenueObserver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$167, reason: invalid class name */
        public static final class AnonymousClass167 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass167(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final MaxAdRevenueObserver invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new MaxAdRevenueObserver((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Logger.class))), (AppLovinCommunicatorBridge) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AppLovinCommunicatorBridge.class))), (MaxAdRevenueListener) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(MaxAdRevenueListener.class))), (MaxAdRevenueCommunicatorProxyFactory) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(MaxAdRevenueCommunicatorProxyFactory.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/UniversalRequestTtlValidator;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$168, reason: invalid class name */
        public static final class AnonymousClass168 extends AbstractC3343n implements a {
            public static final AnonymousClass168 INSTANCE = new AnonymousClass168();

            public AnonymousClass168() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final UniversalRequestTtlValidator invoke() {
                return new CommonUniversalRequestTtlValidator();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$169, reason: invalid class name */
        public static final class AnonymousClass169 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass169(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final UniversalRequestEventSender invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new UniversalRequestEventSender((GatewayClient) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GatewayClient.class))), (HandleGatewayEventResponse) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(UniversalRequestTtlValidator.class))), null, 8, null);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LEf/m0;", "invoke", "()LEf/m0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$17, reason: invalid class name */
        public static final class AnonymousClass17 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass17(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InterfaceC0501m0 invoke() {
                return this.$moduleInstance.publicApiJob((DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(DiagnosticEventRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$170, reason: invalid class name */
        public static final class AnonymousClass170 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass170(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final UniversalRequestEventSender invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new UniversalRequestEventSender((GatewayClient) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GatewayClient.class))), (HandleGatewayEventResponse) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(UniversalRequestTtlValidator.class))), OperationType.DIAGNOSTIC_EVENT);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$171, reason: invalid class name */
        public static final class AnonymousClass171 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass171(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final UniversalRequestEventSender invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new UniversalRequestEventSender((GatewayClient) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GatewayClient.class))), (HandleGatewayEventResponse) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(UniversalRequestTtlValidator.class))), OperationType.OPERATIVE_EVENT);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/om/OmFinishSession;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$172, reason: invalid class name */
        public static final class AnonymousClass172 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass172(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final OmFinishSession invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidOmFinishSession((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/om/OmImpressionOccurred;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$173, reason: invalid class name */
        public static final class AnonymousClass173 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass173(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final OmImpressionOccurred invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidOmImpressionOccurred((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/om/AndroidOmInteraction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$174, reason: invalid class name */
        public static final class AnonymousClass174 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass174(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AndroidOmInteraction invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidOmStartSession((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/om/GetOmData;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$175, reason: invalid class name */
        public static final class AnonymousClass175 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass175(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetOmData invoke() {
                return new CommonGetOmData((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(OpenMeasurementRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/om/IsOMActivated;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$176, reason: invalid class name */
        public static final class AnonymousClass176 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass176(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final IsOMActivated invoke() {
                return new CommonIsOMActivated((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(OpenMeasurementRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$177, reason: invalid class name */
        public static final class AnonymousClass177 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass177(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InitializeOMSDK invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidInitializeOMSDK((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(OpenMeasurementRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/adquality/InitializeAdQuality;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$178, reason: invalid class name */
        public static final class AnonymousClass178 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass178(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InitializeAdQuality invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidInitializeAdQuality((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Logger.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$179, reason: invalid class name */
        public static final class AnonymousClass179 extends AbstractC3343n implements a {
            public static final AnonymousClass179 INSTANCE = new AnonymousClass179();

            public AnonymousClass179() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final FlattenerRulesUseCase invoke() {
                return new DeveloperConsentFlattenerRulesUseCase();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/configuration/ForceAlternativeFlow;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$18, reason: invalid class name */
        public static final class AnonymousClass18 extends AbstractC3343n implements a {
            public static final AnonymousClass18 INSTANCE = new AnonymousClass18();

            public AnonymousClass18() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final ForceAlternativeFlow invoke() {
                return new ForceAlternativeFlow();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/privacy/FlattenerRulesUseCase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$180, reason: invalid class name */
        public static final class AnonymousClass180 extends AbstractC3343n implements a {
            public static final AnonymousClass180 INSTANCE = new AnonymousClass180();

            public AnonymousClass180() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final FlattenerRulesUseCase invoke() {
                return new LegacyUserConsentFlattenerRulesUseCase();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$181, reason: invalid class name */
        public static final class AnonymousClass181 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass181(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final BackgroundWorker invoke() {
                return new BackgroundWorker((Context) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(Context.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/work/DiagnosticEventRequestWorkModifier;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$182, reason: invalid class name */
        public static final class AnonymousClass182 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass182(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final DiagnosticEventRequestWorkModifier invoke() {
                return new DiagnosticEventRequestWorkModifier((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$183, reason: invalid class name */
        public static final class AnonymousClass183 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass183(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GatewayClient invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new CommonGatewayClient((HttpClientProvider) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(HttpClientProvider.class))), (HandleGatewayUniversalResponse) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(HandleGatewayUniversalResponse.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (RequestUrlFactory) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(RequestUrlFactory.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Logger.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LEf/C;", "invoke", "()LEf/C;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$184, reason: invalid class name */
        public static final class AnonymousClass184 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass184(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final C invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new SDKErrorHandler((A) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AlternativeFlowReader.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SDKMetricsSender.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/ads/token/TokenStorage;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$185, reason: invalid class name */
        public static final class AnonymousClass185 extends AbstractC3343n implements a {
            public static final AnonymousClass185 INSTANCE = new AnonymousClass185();

            public AnonymousClass185() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final TokenStorage invoke() {
                return new InMemoryTokenStorage();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/device/VolumeChange;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$186, reason: invalid class name */
        public static final class AnonymousClass186 extends AbstractC3343n implements a {
            public static final AnonymousClass186 INSTANCE = new AnonymousClass186();

            public AnonymousClass186() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final VolumeChange invoke() {
                return new VolumeChangeContentObserver();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$187, reason: invalid class name */
        public static final class AnonymousClass187 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass187(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final ConfigFileFromLocalStorage invoke() {
                return new ConfigFileFromLocalStorage((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeSDK;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$188, reason: invalid class name */
        public static final class AnonymousClass188 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass188(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InitializeSDK invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new InitializeSDK((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))), (ConfigFileFromLocalStorage) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ConfigFileFromLocalStorage.class))), (InitializeStateReset) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(InitializeStateReset.class))), (InitializeStateError) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(InitializeStateError.class))), (InitializeStateConfig) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(InitializeStateConfig.class))), (InitializeStateCreate) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(InitializeStateCreate.class))), (InitializeStateLoadCache) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(InitializeStateLoadCache.class))), (InitializeStateLoadWeb) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(InitializeStateLoadWeb.class))), (InitializeStateComplete) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(InitializeStateComplete.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateComplete;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$189, reason: invalid class name */
        public static final class AnonymousClass189 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass189(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InitializeStateComplete invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new InitializeStateComplete((InterfaceC4220i) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, i5.getOrCreateKotlinClass(InterfaceC4220i.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$19, reason: invalid class name */
        public static final class AnonymousClass19 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass19(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final ByteStringDataSource invoke() {
                return new AndroidLegacyConfigStoreDataSource((StorageManager) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(StorageManager.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateConfig;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$190, reason: invalid class name */
        public static final class AnonymousClass190 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass190(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InitializeStateConfig invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new InitializeStateConfig((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))), (InitializeStateConfigWithLoader) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(InitializeStateConfigWithLoader.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateConfigWithLoader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$191, reason: invalid class name */
        public static final class AnonymousClass191 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass191(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InitializeStateConfigWithLoader invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new InitializeStateConfigWithLoader((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(InitializeStateNetworkError.class))), (TokenStorage) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SDKMetricsSender.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateCreate;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$192, reason: invalid class name */
        public static final class AnonymousClass192 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass192(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InitializeStateCreate invoke() {
                return new InitializeStateCreate((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateError;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$193, reason: invalid class name */
        public static final class AnonymousClass193 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass193(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InitializeStateError invoke() {
                return new InitializeStateError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$194, reason: invalid class name */
        public static final class AnonymousClass194 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass194(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InitializeStateLoadCache invoke() {
                return new InitializeStateLoadCache((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$195, reason: invalid class name */
        public static final class AnonymousClass195 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass195(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InitializeStateLoadWeb invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new InitializeStateLoadWeb((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(InitializeStateNetworkError.class))), (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(HttpClientProvider.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateReset;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$196, reason: invalid class name */
        public static final class AnonymousClass196 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass196(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InitializeStateReset invoke() {
                return new InitializeStateReset((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/store/StoreMonitor;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$197, reason: invalid class name */
        public static final class AnonymousClass197 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass197(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final StoreMonitor invoke() {
                return new StoreMonitor((StoreExceptionHandler) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(StoreExceptionHandler.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/store/StoreWebViewEventSender;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$198, reason: invalid class name */
        public static final class AnonymousClass198 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass198(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final StoreWebViewEventSender invoke() {
                return new StoreWebViewEventSender((IEventSender) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(IEventSender.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/store/core/StoreExceptionHandler;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$199, reason: invalid class name */
        public static final class AnonymousClass199 extends AbstractC3343n implements a {
            public static final AnonymousClass199 INSTANCE = new AnonymousClass199();

            public AnonymousClass199() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final StoreExceptionHandler invoke() {
                return new GatewayStoreExceptionHandler();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LEf/A;", "invoke", "()LEf/A;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // tf.a
            @NotNull
            public final A invoke() {
                return this.$moduleInstance.mainDispatcher();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu1/i;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "invoke", "()Lu1/i;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$20, reason: invalid class name */
        public static final class AnonymousClass20 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass20(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InterfaceC4220i invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.privacyDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, i5.getOrCreateKotlinClass(A.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/store/core/StoreEventListenerFactory;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$200, reason: invalid class name */
        public static final class AnonymousClass200 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass200(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final StoreEventListenerFactory invoke() {
                return new StoreEventListenerFactory((StoreWebViewEventSender) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(StoreWebViewEventSender.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/configuration/ConfigurationReader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$201, reason: invalid class name */
        public static final class AnonymousClass201 extends AbstractC3343n implements a {
            public static final AnonymousClass201 INSTANCE = new AnonymousClass201();

            public AnonymousClass201() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final ConfigurationReader invoke() {
                return new ConfigurationReader();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/attribution/AndroidAttribution;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$202, reason: invalid class name */
        public static final class AnonymousClass202 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass202(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AndroidAttribution invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidAttribution((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/AdPlayerScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$203, reason: invalid class name */
        public static final class AnonymousClass203 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass203(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AdPlayerScope invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AdPlayerScope((A) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (C) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, i5.getOrCreateKotlinClass(C.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$204, reason: invalid class name */
        public static final class AnonymousClass204 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass204(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AndroidWebViewClient invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidWebViewClient((GetCachedAsset) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetCachedAsset.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$205, reason: invalid class name */
        public static final class AnonymousClass205 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass205(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AndroidGetWebViewContainerUseCase invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidGetWebViewContainerUseCase((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (AndroidWebViewClient) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AndroidWebViewClient.class))), (SendWebViewClientErrorDiagnostics) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendWebViewClientErrorDiagnostics.class))), (A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/Load;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$206, reason: invalid class name */
        public static final class AnonymousClass206 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass206(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final Load invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidLoad((A) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (GetAdRequest) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetAdRequest.class))), (GetAdPlayerConfigRequest) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetAdPlayerConfigRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, i5.getOrCreateKotlinClass(GetRequestPolicy.class))), (HandleGatewayAdResponse) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(HandleGatewayAdResponse.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GatewayClient.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AdRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (ValidateExtrasSize) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ValidateExtrasSize.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$207, reason: invalid class name */
        public static final class AnonymousClass207 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass207(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AwaitInitialization invoke() {
                return new CommonAwaitInitialization((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetAsyncHeaderBiddingToken;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$208, reason: invalid class name */
        public static final class AnonymousClass208 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass208(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetAsyncHeaderBiddingToken invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new CommonInitAwaitingGetHeaderBiddingToken((GetHeaderBiddingToken) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetHeaderBiddingToken.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetInitializationState.class))), (AwaitInitialization) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AwaitInitialization.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (SafeCallbackInvoke) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SafeCallbackInvoke.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Logger.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetAdPlayer;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$209, reason: invalid class name */
        public static final class AnonymousClass209 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass209(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetAdPlayer invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new CommonGetAdPlayer((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ScarManager.class))), (OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(OfferwallManager.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AdRepository.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(LifecycleDataSource.class))), (OrientationRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(OrientationRepository.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$21, reason: invalid class name */
        public static final class AnonymousClass21 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass21(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.privacyDataStore((InterfaceC4220i) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, H.f39741a.getOrCreateKotlinClass(InterfaceC4220i.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$210, reason: invalid class name */
        public static final class AnonymousClass210 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass210(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final CacheWebViewAssets invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidCacheWebViewAssets((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CacheRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$211, reason: invalid class name */
        public static final class AnonymousClass211 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass211(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final HandleGatewayAdResponse invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidHandleGatewayAdResponse((AdRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AdRepository.class))), (AndroidGetWebViewContainerUseCase) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AndroidGetWebViewContainerUseCase.class))), (GetWebViewBridgeUseCase) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetWebViewBridgeUseCase.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DeviceInfoRepository.class))), (HandleInvocationsFromAdViewer) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(HandleInvocationsFromAdViewer.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CampaignRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetOperativeEventApi) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetOperativeEventApi.class))), (GetLatestWebViewConfiguration) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetLatestWebViewConfiguration.class))), (AdPlayerScope) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AdPlayerScope.class))), (GetAdPlayer) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetAdPlayer.class))), (CacheWebViewAssets) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CacheWebViewAssets.class))), (WebViewLessLoadStrategy) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(WebViewLessLoadStrategy.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$212, reason: invalid class name */
        public static final class AnonymousClass212 extends AbstractC3343n implements a {
            public static final AnonymousClass212 INSTANCE = new AnonymousClass212();

            public AnonymousClass212() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final HandleInvocationsFromAdViewer invoke() {
                return new HandleInvocationsFromAdViewer();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/LegacyLoadUseCase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$213, reason: invalid class name */
        public static final class AnonymousClass213 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass213(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final LegacyLoadUseCase invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new LegacyLoadUseCase((Load) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Load.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetInitializationState.class))), (AwaitInitialization) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AwaitInitialization.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AdRepository.class))), (SafeCallbackInvoke) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SafeCallbackInvoke.class))), (CleanUpWhenOpportunityExpires) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CleanUpWhenOpportunityExpires.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Logger.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/adload/WebViewLessLoadStrategy;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$214, reason: invalid class name */
        public static final class AnonymousClass214 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass214(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final WebViewLessLoadStrategy invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidWebViewLessLoadStrategy((AdRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AdRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CampaignRepository.class))), (CacheAssets) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CacheAssets.class))), (AdRefresh) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AdRefresh.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$215, reason: invalid class name */
        public static final class AnonymousClass215 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass215(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final SafeCallbackInvoke invoke() {
                return new CommonSafeCallbackInvoke((A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, H.f39741a.getOrCreateKotlinClass(A.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/task/InitializeStateNetworkError;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$216, reason: invalid class name */
        public static final class AnonymousClass216 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass216(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InitializeStateNetworkError invoke() {
                return new InitializeStateNetworkError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/utils/CoroutineTimer;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$217, reason: invalid class name */
        public static final class AnonymousClass217 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass217(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final CoroutineTimer invoke() {
                return new CommonCoroutineTimer((A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, H.f39741a.getOrCreateKotlinClass(A.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$218, reason: invalid class name */
        public static final class AnonymousClass218 extends AbstractC3343n implements a {
            public static final AnonymousClass218 INSTANCE = new AnonymousClass218();

            public AnonymousClass218() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final IEventSender invoke() {
                return SharedInstances.INSTANCE.getWebViewEventSender();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/SetGameId;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$219, reason: invalid class name */
        public static final class AnonymousClass219 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass219(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final SetGameId invoke() {
                return new CommonSetGameId((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu1/i;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "invoke", "()Lu1/i;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$22, reason: invalid class name */
        public static final class AnonymousClass22 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass22(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InterfaceC4220i invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.privacyFsmDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, i5.getOrCreateKotlinClass(A.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetGameId;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$220, reason: invalid class name */
        public static final class AnonymousClass220 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass220(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetGameId invoke() {
                return new CommonGetGameId((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/ValidateGameId;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$221, reason: invalid class name */
        public static final class AnonymousClass221 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass221(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final ValidateGameId invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new CommonValidateGameId((GetGameId) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetGameId.class))), (SetGameId) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SetGameId.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/ValidateExtrasSize;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$222, reason: invalid class name */
        public static final class AnonymousClass222 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass222(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final ValidateExtrasSize invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new ValidateExtrasSize((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/ShouldAllowInitialization;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$223, reason: invalid class name */
        public static final class AnonymousClass223 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass223(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final ShouldAllowInitialization invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new CommonShouldAllowInitialization((AlternativeFlowReader) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AlternativeFlowReader.class))), (CheckForGameIdAndTestModeChanges) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CheckForGameIdAndTestModeChanges.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetInitializationState.class))), (SetInitializationState) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SetInitializationState.class))), (ValidateGameId) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ValidateGameId.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/CheckForGameIdAndTestModeChanges;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$224, reason: invalid class name */
        public static final class AnonymousClass224 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass224(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final CheckForGameIdAndTestModeChanges invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new CommonCheckForGameIdAndTestModeChanges((GetGameId) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetGameId.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$225, reason: invalid class name */
        public static final class AnonymousClass225 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass225(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final DownloadPriorityQueue invoke() {
                return new DownloadPriorityQueue((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$226, reason: invalid class name */
        public static final class AnonymousClass226 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass226(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final CleanupDirectory invoke() {
                return new CleanupDirectory((Logger) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(Logger.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/FocusRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$227, reason: invalid class name */
        public static final class AnonymousClass227 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass227(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final FocusRepository invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new FocusRepository((AndroidGetLifecycleFlow) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AndroidGetLifecycleFlow.class))), (A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Logger.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$228, reason: invalid class name */
        public static final class AnonymousClass228 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass228(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AndroidGetIsAdActivity invoke() {
                return new AndroidGetIsAdActivity((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$229, reason: invalid class name */
        public static final class AnonymousClass229 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass229(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AndroidGetLifecycleFlow invoke() {
                return new AndroidGetLifecycleFlow((Context) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(Context.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$23, reason: invalid class name */
        public static final class AnonymousClass23 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass23(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.privacyFsmDataStore((InterfaceC4220i) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, H.f39741a.getOrCreateKotlinClass(InterfaceC4220i.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$230, reason: invalid class name */
        public static final class AnonymousClass230 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass230(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AndroidHandleFocusCounters invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidHandleFocusCounters((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (FocusRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(FocusRepository.class))), (AndroidGetIsAdActivity) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AndroidGetIsAdActivity.class))), (A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), null, 16, null);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$231, reason: invalid class name */
        public static final class AnonymousClass231 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass231(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final OfferwallAdapterBridge invoke() {
                return new OfferwallAdapterBridge((E) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OFFERWALL_SCOPE, H.f39741a.getOrCreateKotlinClass(E.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$232, reason: invalid class name */
        public static final class AnonymousClass232 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass232(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final OfferwallManager invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidOfferwallManager((OfferwallAdapterBridge) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(OfferwallAdapterBridge.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Logger.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/offerwall/LoadOfferwallAd;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$233, reason: invalid class name */
        public static final class AnonymousClass233 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass233(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final LoadOfferwallAd invoke() {
                return new LoadOfferwallAd((OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(OfferwallManager.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/offerwall/GetIsOfferwallAdReady;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$234, reason: invalid class name */
        public static final class AnonymousClass234 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass234(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetIsOfferwallAdReady invoke() {
                return new GetIsOfferwallAdReady((OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(OfferwallManager.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/FIdDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$235, reason: invalid class name */
        public static final class AnonymousClass235 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass235(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final FIdDataSource invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new CachedFIdDataSource((A) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), new AndroidFIdDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class)))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$236, reason: invalid class name */
        public static final class AnonymousClass236 extends AbstractC3343n implements a {
            public static final AnonymousClass236 INSTANCE = new AnonymousClass236();

            public AnonymousClass236() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final FIdExistenceDataSource invoke() {
                return new AndroidFIdExistenceDataSource(Constants.FID_CLASS);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$237, reason: invalid class name */
        public static final class AnonymousClass237 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass237(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AdQualityVersionDataSource invoke() {
                return new AndroidAdQualityVersionDataSource((Logger) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(Logger.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$238, reason: invalid class name */
        public static final class AnonymousClass238 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass238(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final CleanUpWhenOpportunityExpires invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new CleanUpWhenOpportunityExpires((A) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Logger.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/OrientationRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$239, reason: invalid class name */
        public static final class AnonymousClass239 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass239(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final OrientationRepository invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new OrientationRepository((AndroidGetLifecycleFlow) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AndroidGetLifecycleFlow.class))), (A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, i5.getOrCreateKotlinClass(A.class))));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu1/i;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "invoke", "()Lu1/i;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$24, reason: invalid class name */
        public static final class AnonymousClass24 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass24(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InterfaceC4220i invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.nativeConfigurationDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, i5.getOrCreateKotlinClass(A.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$240, reason: invalid class name */
        public static final class AnonymousClass240 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass240(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AndroidAppSetIdDataSource invoke() {
                return new AndroidAppSetIdDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(Context.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$241, reason: invalid class name */
        public static final class AnonymousClass241 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass241(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AndroidUnityInfoDataSource invoke() {
                return new AndroidUnityInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(Context.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$242, reason: invalid class name */
        public static final class AnonymousClass242 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass242(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InstallReferrerDataSource invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidInstallReferrerDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/HandleDebugSettings;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$243, reason: invalid class name */
        public static final class AnonymousClass243 extends AbstractC3343n implements a {
            public static final AnonymousClass243 INSTANCE = new AnonymousClass243();

            public AnonymousClass243() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final HandleDebugSettings invoke() {
                return new HandleDebugSettings();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/log/Logger;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$244, reason: invalid class name */
        public static final class AnonymousClass244 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass244(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final Logger invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new UnityLogger((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (CreateFile) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CreateFile.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/billing/IsBillingClientAvailable;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$245, reason: invalid class name */
        public static final class AnonymousClass245 extends AbstractC3343n implements a {
            public static final AnonymousClass245 INSTANCE = new AnonymousClass245();

            public AnonymousClass245() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final IsBillingClientAvailable invoke() {
                return new IsBillingClientAvailable();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$246, reason: invalid class name */
        public static final class AnonymousClass246 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass246(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final UnityBootConfigDataSource invoke() {
                return new AndroidUnityBootConfigDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(Context.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$247, reason: invalid class name */
        public static final class AnonymousClass247 extends AbstractC3343n implements a {
            public static final AnonymousClass247 INSTANCE = new AnonymousClass247();

            public AnonymousClass247() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final GetSafeguardedInitializationPolicy invoke() {
                return new AndroidGetSafeguardedInitializationPolicy();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/gatewayclient/RequestUrlFactory;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$248, reason: invalid class name */
        public static final class AnonymousClass248 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass248(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final RequestUrlFactory invoke() {
                return new AndroidRequestUrlFactory((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$25, reason: invalid class name */
        public static final class AnonymousClass25 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass25(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.nativeConfigurationDataStore((InterfaceC4220i) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, H.f39741a.getOrCreateKotlinClass(InterfaceC4220i.class))));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu1/i;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "invoke", "()Lu1/i;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$26, reason: invalid class name */
        public static final class AnonymousClass26 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass26(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InterfaceC4220i invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.glInfoDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (InterfaceC4215d) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.PREF_GL_INFO, i5.getOrCreateKotlinClass(InterfaceC4215d.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$27, reason: invalid class name */
        public static final class AnonymousClass27 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass27(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.glInfoDataStore((InterfaceC4220i) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, H.f39741a.getOrCreateKotlinClass(InterfaceC4220i.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataStoreProvider;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$28, reason: invalid class name */
        public static final class AnonymousClass28 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass28(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final UniversalRequestDataStoreProvider invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new UniversalRequestDataStoreProvider((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, i5.getOrCreateKotlinClass(A.class))));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu1/i;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "invoke", "()Lu1/i;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$29, reason: invalid class name */
        public static final class AnonymousClass29 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass29(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InterfaceC4220i invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.iapTransactionDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, i5.getOrCreateKotlinClass(A.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LEf/A;", "invoke", "()LEf/A;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // tf.a
            @NotNull
            public final A invoke() {
                return this.$moduleInstance.defaultDispatcher();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$30, reason: invalid class name */
        public static final class AnonymousClass30 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass30(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.iapTransactionDataStore((InterfaceC4220i) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, H.f39741a.getOrCreateKotlinClass(InterfaceC4220i.class))));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu1/i;", "Lcom/unity3d/ads/datastore/WebviewConfigurationStore$WebViewConfigurationStore;", "invoke", "()Lu1/i;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$31, reason: invalid class name */
        public static final class AnonymousClass31 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass31(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InterfaceC4220i invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.webViewConfigurationDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, i5.getOrCreateKotlinClass(A.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/ads/token/AsyncTokenStorage;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$32, reason: invalid class name */
        public static final class AnonymousClass32 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass32(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AsyncTokenStorage invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.asyncTokenStorage((TokenStorage) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SDKMetricsSender.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/device/VolumeChangeMonitor;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$33, reason: invalid class name */
        public static final class AnonymousClass33 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass33(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final VolumeChangeMonitor invoke() {
                return this.$moduleInstance.volumeChangeMonitor((VolumeChange) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(VolumeChange.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/misc/JsonStorage;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$34, reason: invalid class name */
        public static final class AnonymousClass34 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass34(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // tf.a
            @NotNull
            public final JsonStorage invoke() {
                return this.$moduleInstance.publicJsonStorage();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/misc/JsonStorage;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$35, reason: invalid class name */
        public static final class AnonymousClass35 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass35(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // tf.a
            @NotNull
            public final JsonStorage invoke() {
                return this.$moduleInstance.privateJsonStorage();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/misc/JsonStorage;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$36, reason: invalid class name */
        public static final class AnonymousClass36 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass36(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // tf.a
            @NotNull
            public final JsonStorage invoke() {
                return this.$moduleInstance.memoryJsonStorage();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$37, reason: invalid class name */
        public static final class AnonymousClass37 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass37(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // tf.a
            @NotNull
            public final NativeConfigurationOuterClass.NativeConfiguration invoke() {
                return this.$moduleInstance.defaultNativeConfiguration();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/ads/measurements/MeasurementsService;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$38, reason: invalid class name */
        public static final class AnonymousClass38 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass38(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final MeasurementsService invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.measurementService((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/ads/topics/TopicsService;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$39, reason: invalid class name */
        public static final class AnonymousClass39 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass39(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final TopicsService invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.topicsService((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LEf/A;", "invoke", "()LEf/A;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // tf.a
            @NotNull
            public final A invoke() {
                return this.$moduleInstance.ioDispatcher();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$40, reason: invalid class name */
        public static final class AnonymousClass40 extends AbstractC3343n implements a {
            public static final AnonymousClass40 INSTANCE = new AnonymousClass40();

            public AnonymousClass40() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final CronetEngineBuilderFactory invoke() {
                return new CronetEngineBuilderFactory();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$41, reason: invalid class name */
        public static final class AnonymousClass41 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass41(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final HttpClientProvider invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidHttpClientProvider((AlternativeFlowReader) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AlternativeFlowReader.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (CronetEngineBuilderFactory) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CronetEngineBuilderFactory.class))), (MediationTraitsMetadataReader) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(MediationTraitsMetadataReader.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/core/HttpClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$42, reason: invalid class name */
        public static final class AnonymousClass42 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LEf/E;", "Lcom/unity3d/services/core/network/core/HttpClient;", "<anonymous>", "(LEf/E;)Lcom/unity3d/services/core/network/core/HttpClient;"}, k = 3, mv = {1, 8, 0})
            @InterfaceC3466e(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$42$1", f = "ServiceProvider.kt", l = {520}, m = "invokeSuspend")
            /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$42$1, reason: invalid class name and collision with other inner class name */
            public static final class C02041 extends AbstractC3471j implements p {
                final /* synthetic */ ServicesRegistry $this_registry;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C02041(ServicesRegistry servicesRegistry, InterfaceC3103c<? super C02041> interfaceC3103c) {
                    super(2, interfaceC3103c);
                    this.$this_registry = servicesRegistry;
                }

                @Override // lf.AbstractC3462a
                @NotNull
                public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
                    return new C02041(this.$this_registry, interfaceC3103c);
                }

                @Override // tf.p
                @Nullable
                public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super HttpClient> interfaceC3103c) {
                    return ((C02041) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
                }

                @Override // lf.AbstractC3462a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kf.a aVar = kf.a.f39711a;
                    int i5 = this.label;
                    if (i5 != 0) {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e.U(obj);
                        return obj;
                    }
                    e.U(obj);
                    HttpClientProvider httpClientProvider = (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(HttpClientProvider.class)));
                    this.label = 1;
                    Object objInvoke = httpClientProvider.invoke(this);
                    return objInvoke == aVar ? aVar : objInvoke;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass42(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final HttpClient invoke() {
                return (HttpClient) Ef.H.I(C3109i.f38759a, new C02041(this.$this_registry, null));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$43, reason: invalid class name */
        public static final class AnonymousClass43 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass43(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final MediationTraitsMetadataReader invoke() {
                return new MediationTraitsMetadataReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("MEMORY", H.f39741a.getOrCreateKotlinClass(JsonStorage.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$44, reason: invalid class name */
        public static final class AnonymousClass44 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass44(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AlternativeFlowReader invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new CommonAlternativeFlowReader((ConfigurationReader) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ConfigurationReader.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (MediationTraitsMetadataReader) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(MediationTraitsMetadataReader.class))), (ForceAlternativeFlow) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ForceAlternativeFlow.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/TcfDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$45, reason: invalid class name */
        public static final class AnonymousClass45 extends AbstractC3343n implements a {
            public static final AnonymousClass45 INSTANCE = new AnonymousClass45();

            public AnonymousClass45() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final TcfDataSource invoke() {
                return new AndroidTcfDataSource();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$46, reason: invalid class name */
        public static final class AnonymousClass46 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass46(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final TcfRepository invoke() {
                return new AndroidTcfRepository((TcfDataSource) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(TcfDataSource.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/configuration/AndroidManifestIntPropertyReader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$47, reason: invalid class name */
        public static final class AnonymousClass47 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass47(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AndroidManifestIntPropertyReader invoke() {
                return new AndroidManifestIntPropertyReader((Context) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(Context.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/AndroidTestDataInfo;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$48, reason: invalid class name */
        public static final class AnonymousClass48 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass48(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AndroidTestDataInfo invoke() {
                return new AndroidTestDataInfo((AndroidManifestIntPropertyReader) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(AndroidManifestIntPropertyReader.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/configuration/GameServerIdReader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$49, reason: invalid class name */
        public static final class AnonymousClass49 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass49(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GameServerIdReader invoke() {
                return new GameServerIdReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", H.f39741a.getOrCreateKotlinClass(JsonStorage.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$5, reason: invalid class name */
        public static final class AnonymousClass5 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // tf.a
            @NotNull
            public final ISDKDispatchers invoke() {
                return this.$moduleInstance.sdkDispatchers();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/StoreDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$50, reason: invalid class name */
        public static final class AnonymousClass50 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass50(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final StoreDataSource invoke() {
                return new AndroidStoreDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(Context.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$51, reason: invalid class name */
        public static final class AnonymousClass51 extends AbstractC3343n implements a {
            public static final AnonymousClass51 INSTANCE = new AnonymousClass51();

            public AnonymousClass51() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final AnalyticsDataSource invoke() {
                return new AndroidAnalyticsDataSource();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/DeveloperConsentDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$52, reason: invalid class name */
        public static final class AnonymousClass52 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass52(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final DeveloperConsentDataSource invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidDeveloperConsentDataSource((FlattenerRulesUseCase) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, i5.getOrCreateKotlinClass(FlattenerRulesUseCase.class))), (JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", i5.getOrCreateKotlinClass(JsonStorage.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/DynamicDeviceInfoDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$53, reason: invalid class name */
        public static final class AnonymousClass53 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass53(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final DynamicDeviceInfoDataSource invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidDynamicDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(LifecycleDataSource.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Logger.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/LegacyUserConsentDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$54, reason: invalid class name */
        public static final class AnonymousClass54 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass54(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final LegacyUserConsentDataSource invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidLegacyUserConsentDataSource((FlattenerRulesUseCase) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, i5.getOrCreateKotlinClass(FlattenerRulesUseCase.class))), (JsonStorage) this.$this_registry.resolveService(new ServiceKey("PRIVATE", i5.getOrCreateKotlinClass(JsonStorage.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$55, reason: invalid class name */
        public static final class AnonymousClass55 extends AbstractC3343n implements a {
            public static final AnonymousClass55 INSTANCE = new AnonymousClass55();

            public AnonymousClass55() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final LifecycleDataSource invoke() {
                return new AndroidLifecycleDataSource();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/ForegroundDurationReader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$56, reason: invalid class name */
        public static final class AnonymousClass56 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass56(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final ForegroundDurationReader invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                AppForegroundDurationObserver appForegroundDurationObserver = new AppForegroundDurationObserver((LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(LifecycleDataSource.class))), (A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), null, null, 12, null);
                appForegroundDurationObserver.invoke();
                return appForegroundDurationObserver;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$57, reason: invalid class name */
        public static final class AnonymousClass57 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass57(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final CacheDataSource invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidLocalCacheDataSource((CreateFile) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CreateFile.class))), (GetFileExtensionFromUrl) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetFileExtensionFromUrl.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/CreateFile;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$58, reason: invalid class name */
        public static final class AnonymousClass58 extends AbstractC3343n implements a {
            public static final AnonymousClass58 INSTANCE = new AnonymousClass58();

            public AnonymousClass58() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final CreateFile invoke() {
                return new CommonCreateFile();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$59, reason: invalid class name */
        public static final class AnonymousClass59 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass59(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final GetFileExtensionFromUrl invoke() {
                return new CommonGetFileExtensionFromUrl((RemoveUrlQuery) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(RemoveUrlQuery.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$6, reason: invalid class name */
        public static final class AnonymousClass6 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // tf.a
            @NotNull
            public final SDKMetricsSender invoke() {
                return this.$moduleInstance.sdkMetrics();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/RemoveUrlQuery;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$60, reason: invalid class name */
        public static final class AnonymousClass60 extends AbstractC3343n implements a {
            public static final AnonymousClass60 INSTANCE = new AnonymousClass60();

            public AnonymousClass60() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final RemoveUrlQuery invoke() {
                return new AndroidRemoveUrlQuery();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/MediationDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$61, reason: invalid class name */
        public static final class AnonymousClass61 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass61(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final MediationDataSource invoke() {
                return new AndroidMediationDataSource((JsonStorage) this.$this_registry.resolveService(new ServiceKey("MEMORY", H.f39741a.getOrCreateKotlinClass(JsonStorage.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/PrivacyDeviceInfoDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$62, reason: invalid class name */
        public static final class AnonymousClass62 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass62(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final PrivacyDeviceInfoDataSource invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidPrivacyDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (FIdDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(FIdDataSource.class))), (AndroidAppSetIdDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AndroidAppSetIdDataSource.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$63, reason: invalid class name */
        public static final class AnonymousClass63 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass63(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final CacheDataSource invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidRemoteCacheDataSource((A) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (CreateFile) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CreateFile.class))), (GetFileExtensionFromUrl) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetFileExtensionFromUrl.class))), (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(HttpClientProvider.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$64, reason: invalid class name */
        public static final class AnonymousClass64 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass64(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final StaticDeviceInfoDataSource invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidStaticDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, i5.getOrCreateKotlinClass(ByteStringDataSource.class))), (AnalyticsDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AnalyticsDataSource.class))), (StoreDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(StoreDataSource.class))), (UnityBootConfigDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(UnityBootConfigDataSource.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Logger.class))));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu1/d;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "invoke", "()Lu1/d;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$65, reason: invalid class name */
        public static final class AnonymousClass65 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass65(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final InterfaceC4215d invoke() {
                return new FetchGLInfoDataMigration((GetOpenGLRendererInfo) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(GetOpenGLRendererInfo.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/UniversalRequestDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$66, reason: invalid class name */
        public static final class AnonymousClass66 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass66(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final UniversalRequestDataSource invoke() {
                return new UniversalRequestDataSource((UniversalRequestDataStoreProvider) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(UniversalRequestDataStoreProvider.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$67, reason: invalid class name */
        public static final class AnonymousClass67 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass67(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final WebviewConfigurationDataSource invoke() {
                return new WebviewConfigurationDataSource((InterfaceC4220i) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, H.f39741a.getOrCreateKotlinClass(InterfaceC4220i.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$68, reason: invalid class name */
        public static final class AnonymousClass68 extends AbstractC3343n implements a {
            public static final AnonymousClass68 INSTANCE = new AnonymousClass68();

            public AnonymousClass68() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final OmidManager invoke() {
                return new AndroidOmidManager();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$69, reason: invalid class name */
        public static final class AnonymousClass69 extends AbstractC3343n implements a {
            public static final AnonymousClass69 INSTANCE = new AnonymousClass69();

            public AnonymousClass69() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final SDKPropertiesManager invoke() {
                return new AndroidSDKPropertiesManager();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LEf/E;", "invoke", "()LEf/E;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$7, reason: invalid class name */
        public static final class AnonymousClass7 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final E invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.initCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))), (C) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, i5.getOrCreateKotlinClass(C.class))), (InterfaceC0501m0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, i5.getOrCreateKotlinClass(InterfaceC0501m0.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/manager/StorageManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$70, reason: invalid class name */
        public static final class AnonymousClass70 extends AbstractC3343n implements a {
            public static final AnonymousClass70 INSTANCE = new AnonymousClass70();

            public AnonymousClass70() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final StorageManager invoke() {
                return new AndroidStorageManager();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$71, reason: invalid class name */
        public static final class AnonymousClass71 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass71(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @Nullable
            public final BillingClientAdapter invoke() {
                return new BillingClientAdapterFactory().createBillingClientAdapter((Context) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(Context.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$72, reason: invalid class name */
        public static final class AnonymousClass72 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass72(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final ProductDetailsFetcher invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new ProductDetailsFetcherWithFallback(new CommonProductDetailsFetcher((BillingClientAdapter) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(BillingClientAdapter.class))), "inapp"), new CommonProductDetailsFetcher((BillingClientAdapter) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(BillingClientAdapter.class))), "subs"));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/manager/TransactionEventManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$73, reason: invalid class name */
        public static final class AnonymousClass73 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass73(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final TransactionEventManager invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new TransactionEventManager((E) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, i5.getOrCreateKotlinClass(E.class))), (BillingClientAdapter) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(BillingClientAdapter.class))), (GetTransactionData) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetTransactionData.class))), (GetTransactionRequest) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetTransactionRequest.class))), (TransactionEventRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(TransactionEventRepository.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, i5.getOrCreateKotlinClass(ByteStringDataSource.class))), (IsBillingClientAvailable) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(IsBillingClientAvailable.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (ProductDetailsFetcher) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ProductDetailsFetcher.class))), (Logger) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Logger.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$74, reason: invalid class name */
        public static final class AnonymousClass74 extends AbstractC3343n implements a {
            public static final AnonymousClass74 INSTANCE = new AnonymousClass74();

            public AnonymousClass74() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final AdRepository invoke() {
                return new AndroidAdRepository();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$75, reason: invalid class name */
        public static final class AnonymousClass75 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass75(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final CacheRepository invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidCacheRepository((A) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (GetCacheDirectory) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetCacheDirectory.class))), (CacheDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_LOCAL, i5.getOrCreateKotlinClass(CacheDataSource.class))), (CacheDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_REMOTE, i5.getOrCreateKotlinClass(CacheDataSource.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))), (CleanupDirectory) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CleanupDirectory.class))), (DownloadPriorityQueue) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DownloadPriorityQueue.class))), (CreateFile) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CreateFile.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetAssetFileName) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetAssetFileName.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetCacheDirectory;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$76, reason: invalid class name */
        public static final class AnonymousClass76 extends AbstractC3343n implements a {
            public static final AnonymousClass76 INSTANCE = new AnonymousClass76();

            public AnonymousClass76() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final GetCacheDirectory invoke() {
                return new CommonGetCacheDirectory();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetAssetFileName;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$77, reason: invalid class name */
        public static final class AnonymousClass77 extends AbstractC3343n implements a {
            public static final AnonymousClass77 INSTANCE = new AnonymousClass77();

            public AnonymousClass77() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final GetAssetFileName invoke() {
                return new GetAssetFileName();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$78, reason: invalid class name */
        public static final class AnonymousClass78 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass78(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final CampaignRepository invoke() {
                return new AndroidCampaignRepository((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(GetSharedDataTimestamps.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/DeveloperConsentRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$79, reason: invalid class name */
        public static final class AnonymousClass79 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass79(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final DeveloperConsentRepository invoke() {
                return new AndroidDeveloperConsentRepository((DeveloperConsentDataSource) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(DeveloperConsentDataSource.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LEf/E;", "invoke", "()LEf/E;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$8, reason: invalid class name */
        public static final class AnonymousClass8 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final E invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.loadCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))), (C) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, i5.getOrCreateKotlinClass(C.class))), (InterfaceC0501m0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, i5.getOrCreateKotlinClass(InterfaceC0501m0.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$80, reason: invalid class name */
        public static final class AnonymousClass80 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass80(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final DeviceInfoRepository invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidDeviceInfoRepository((StaticDeviceInfoDataSource) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(StaticDeviceInfoDataSource.class))), (DynamicDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DynamicDeviceInfoDataSource.class))), (PrivacyDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(PrivacyDeviceInfoDataSource.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SessionRepository.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$81, reason: invalid class name */
        public static final class AnonymousClass81 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass81(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final DiagnosticEventRepository invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidDiagnosticEventRepository((CoroutineTimer) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CoroutineTimer.class))), (GetDiagnosticEventRequest) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetDiagnosticEventRequest.class))), (A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, i5.getOrCreateKotlinClass(A.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$82, reason: invalid class name */
        public static final class AnonymousClass82 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass82(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final LegacyUserConsentRepository invoke() {
                return new AndroidLegacyUserConsentRepository((LegacyUserConsentDataSource) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(LegacyUserConsentDataSource.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/MediationProviderParser;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$83, reason: invalid class name */
        public static final class AnonymousClass83 extends AbstractC3343n implements a {
            public static final AnonymousClass83 INSTANCE = new AnonymousClass83();

            public AnonymousClass83() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final MediationProviderParser invoke() {
                return new CommonMediationProviderParser();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/MediationInfoConverter;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$84, reason: invalid class name */
        public static final class AnonymousClass84 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass84(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final MediationInfoConverter invoke() {
                return new CommonMediationInfoConverter((MediationProviderParser) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(MediationProviderParser.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$85, reason: invalid class name */
        public static final class AnonymousClass85 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass85(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final MediationRepository invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidMediationRepository((MediationDataSource) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(MediationDataSource.class))), (MediationProviderParser) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(MediationProviderParser.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$86, reason: invalid class name */
        public static final class AnonymousClass86 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass86(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final OpenMeasurementRepository invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidOpenMeasurementRepository((A) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (OmidManager) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(OmidManager.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$87, reason: invalid class name */
        public static final class AnonymousClass87 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass87(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final SessionRepository invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidSessionRepository((ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, i5.getOrCreateKotlinClass(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, i5.getOrCreateKotlinClass(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, i5.getOrCreateKotlinClass(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, i5.getOrCreateKotlinClass(ByteStringDataSource.class))), (AndroidUnityInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AndroidUnityInfoDataSource.class))), (NativeConfigurationOuterClass.NativeConfiguration) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(NativeConfigurationOuterClass.NativeConfiguration.class))), (A) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$88, reason: invalid class name */
        public static final class AnonymousClass88 extends AbstractC3343n implements a {
            public static final AnonymousClass88 INSTANCE = new AnonymousClass88();

            public AnonymousClass88() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final TransactionEventRepository invoke() {
                return new AndroidTransactionEventRepository();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$89, reason: invalid class name */
        public static final class AnonymousClass89 extends AbstractC3343n implements a {
            public static final AnonymousClass89 INSTANCE = new AnonymousClass89();

            public AnonymousClass89() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final AdRevenueRepository invoke() {
                return new AndroidAdRevenueRepository();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LEf/E;", "invoke", "()LEf/E;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$9, reason: invalid class name */
        public static final class AnonymousClass9 extends AbstractC3343n implements a {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass9(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final E invoke() {
                UnityAdsModule unityAdsModule = this.$moduleInstance;
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return unityAdsModule.showCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(ISDKDispatchers.class))), (C) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, i5.getOrCreateKotlinClass(C.class))), (InterfaceC0501m0) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, i5.getOrCreateKotlinClass(InterfaceC0501m0.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$90, reason: invalid class name */
        public static final class AnonymousClass90 extends AbstractC3343n implements a {
            public static final AnonymousClass90 INSTANCE = new AnonymousClass90();

            public AnonymousClass90() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final OperativeEventRepository invoke() {
                return new OperativeEventRepository();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/ExecuteAdViewerRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$91, reason: invalid class name */
        public static final class AnonymousClass91 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass91(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final ExecuteAdViewerRequest invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidExecuteAdViewerRequest((A) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(HttpClientProvider.class))), (GetCachedAsset) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetCachedAsset.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$92, reason: invalid class name */
        public static final class AnonymousClass92 extends AbstractC3343n implements a {
            public static final AnonymousClass92 INSTANCE = new AnonymousClass92();

            public AnonymousClass92() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final GetByteStringId invoke() {
                return new AndroidGenerateByteStringId();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/IntentCreation;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$93, reason: invalid class name */
        public static final class AnonymousClass93 extends AbstractC3343n implements a {
            public static final AnonymousClass93 INSTANCE = new AnonymousClass93();

            public AnonymousClass93() {
                super(0);
            }

            @Override // tf.a
            @NotNull
            public final IntentCreation invoke() {
                return new AndroidIntentCreation();
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/HandleOpenUrl;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$94, reason: invalid class name */
        public static final class AnonymousClass94 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass94(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final HandleOpenUrl invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidHandleOpenUrl((Context) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Context.class))), (IntentCreation) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(IntentCreation.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/Refresh;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$95, reason: invalid class name */
        public static final class AnonymousClass95 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass95(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final Refresh invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidRefresh((A) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, i5.getOrCreateKotlinClass(A.class))), (GetAdDataRefreshRequest) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetAdDataRefreshRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, i5.getOrCreateKotlinClass(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GatewayClient.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/CacheAssets;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$96, reason: invalid class name */
        public static final class AnonymousClass96 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass96(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final CacheAssets invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidCacheAssets((E) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, i5.getOrCreateKotlinClass(E.class))), (CacheFile) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CacheFile.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/AdRefresh;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$97, reason: invalid class name */
        public static final class AnonymousClass97 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass97(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final AdRefresh invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidAdRefresh((AdRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(AdRepository.class))), (CacheAssets) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(CacheAssets.class))), (Refresh) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(Refresh.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$98, reason: invalid class name */
        public static final class AnonymousClass98 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass98(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final SendDiagnosticEvent invoke() {
                ServicesRegistry servicesRegistry = this.$this_registry;
                I i5 = H.f39741a;
                return new AndroidSendDiagnosticEvent((DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(DiagnosticEventRepository.class))), (GetDiagnosticEventRequest) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(GetDiagnosticEventRequest.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", i5.getOrCreateKotlinClass(LifecycleDataSource.class))));
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$99, reason: invalid class name */
        public static final class AnonymousClass99 extends AbstractC3343n implements a {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass99(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // tf.a
            @NotNull
            public final SendWebViewClientErrorDiagnostics invoke() {
                return new AndroidSendWebViewClientErrorDiagnostics((SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", H.f39741a.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
            }
        }

        public AnonymousClass1() {
            super(1);
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ServicesRegistry) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull ServicesRegistry registry) {
            AbstractC3340k.e(registry, "$this$registry");
            UnityAdsModule unityAdsModule = new UnityAdsModule();
            registry.updateService(new ServiceKey("", H.a(Context.class)), c.z(C02031.INSTANCE));
            registry.updateService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, H.a(A.class)), c.z(new AnonymousClass2(unityAdsModule)));
            registry.updateService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, H.a(A.class)), c.z(new AnonymousClass3(unityAdsModule)));
            registry.updateService(new ServiceKey(ServiceProvider.IO_DISPATCHER, H.a(A.class)), c.z(new AnonymousClass4(unityAdsModule)));
            registry.updateService(new ServiceKey("", H.a(ISDKDispatchers.class)), c.z(new AnonymousClass5(unityAdsModule)));
            registry.updateService(new ServiceKey("", H.a(SDKMetricsSender.class)), c.z(new AnonymousClass6(unityAdsModule)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, H.a(E.class)), ServiceFactoryKt.factoryOf(new AnonymousClass7(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, H.a(E.class)), ServiceFactoryKt.factoryOf(new AnonymousClass8(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, H.a(E.class)), ServiceFactoryKt.factoryOf(new AnonymousClass9(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, H.a(E.class)), ServiceFactoryKt.factoryOf(new AnonymousClass10(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_ILRD_SCOPE, H.a(E.class)), ServiceFactoryKt.factoryOf(new AnonymousClass11(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_LIFECYCLE_SCOPE, H.a(E.class)), ServiceFactoryKt.factoryOf(new AnonymousClass12(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_GET_TOKEN_SCOPE, H.a(E.class)), ServiceFactoryKt.factoryOf(new AnonymousClass13(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, H.a(E.class)), ServiceFactoryKt.factoryOf(new AnonymousClass14(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_OFFERWALL_SCOPE, H.a(E.class)), ServiceFactoryKt.factoryOf(new AnonymousClass15(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_OMID_SCOPE, H.a(E.class)), ServiceFactoryKt.factoryOf(new AnonymousClass16(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, H.a(InterfaceC0501m0.class)), ServiceFactoryKt.factoryOf(new AnonymousClass17(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", H.a(ForceAlternativeFlow.class)), c.z(AnonymousClass18.INSTANCE));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, H.a(ByteStringDataSource.class)), c.z(new AnonymousClass19(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, H.a(InterfaceC4220i.class)), c.z(new AnonymousClass20(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, H.a(ByteStringDataSource.class)), c.z(new AnonymousClass21(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, H.a(InterfaceC4220i.class)), c.z(new AnonymousClass22(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, H.a(ByteStringDataSource.class)), c.z(new AnonymousClass23(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, H.a(InterfaceC4220i.class)), c.z(new AnonymousClass24(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, H.a(ByteStringDataSource.class)), c.z(new AnonymousClass25(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, H.a(InterfaceC4220i.class)), c.z(new AnonymousClass26(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, H.a(ByteStringDataSource.class)), c.z(new AnonymousClass27(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", H.a(UniversalRequestDataStoreProvider.class)), c.z(new AnonymousClass28(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, H.a(InterfaceC4220i.class)), c.z(new AnonymousClass29(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, H.a(ByteStringDataSource.class)), c.z(new AnonymousClass30(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, H.a(InterfaceC4220i.class)), c.z(new AnonymousClass31(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", H.a(AsyncTokenStorage.class)), c.z(new AnonymousClass32(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", H.a(VolumeChangeMonitor.class)), c.z(new AnonymousClass33(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("PUBLIC", H.a(JsonStorage.class)), c.z(new AnonymousClass34(unityAdsModule)));
            registry.updateService(new ServiceKey("PRIVATE", H.a(JsonStorage.class)), c.z(new AnonymousClass35(unityAdsModule)));
            registry.updateService(new ServiceKey("MEMORY", H.a(JsonStorage.class)), c.z(new AnonymousClass36(unityAdsModule)));
            registry.updateService(new ServiceKey("", H.a(NativeConfigurationOuterClass.NativeConfiguration.class)), c.z(new AnonymousClass37(unityAdsModule)));
            registry.updateService(new ServiceKey("", H.a(MeasurementsService.class)), c.z(new AnonymousClass38(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", H.a(TopicsService.class)), c.z(new AnonymousClass39(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", H.a(CronetEngineBuilderFactory.class)), c.z(AnonymousClass40.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(HttpClientProvider.class)), c.z(new AnonymousClass41(registry)));
            registry.updateService(new ServiceKey("", H.a(HttpClient.class)), c.z(new AnonymousClass42(registry)));
            registry.updateService(new ServiceKey("", H.a(MediationTraitsMetadataReader.class)), ServiceFactoryKt.factoryOf(new AnonymousClass43(registry)));
            registry.updateService(new ServiceKey("", H.a(AlternativeFlowReader.class)), c.z(new AnonymousClass44(registry)));
            registry.updateService(new ServiceKey("", H.a(TcfDataSource.class)), c.z(AnonymousClass45.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(TcfRepository.class)), c.z(new AnonymousClass46(registry)));
            registry.updateService(new ServiceKey("", H.a(AndroidManifestIntPropertyReader.class)), c.z(new AnonymousClass47(registry)));
            registry.updateService(new ServiceKey("", H.a(AndroidTestDataInfo.class)), c.z(new AnonymousClass48(registry)));
            registry.updateService(new ServiceKey("", H.a(GameServerIdReader.class)), c.z(new AnonymousClass49(registry)));
            registry.updateService(new ServiceKey("", H.a(StoreDataSource.class)), c.z(new AnonymousClass50(registry)));
            registry.updateService(new ServiceKey("", H.a(AnalyticsDataSource.class)), c.z(AnonymousClass51.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(DeveloperConsentDataSource.class)), c.z(new AnonymousClass52(registry)));
            registry.updateService(new ServiceKey("", H.a(DynamicDeviceInfoDataSource.class)), c.z(new AnonymousClass53(registry)));
            registry.updateService(new ServiceKey("", H.a(LegacyUserConsentDataSource.class)), c.z(new AnonymousClass54(registry)));
            registry.updateService(new ServiceKey("", H.a(LifecycleDataSource.class)), c.z(AnonymousClass55.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(ForegroundDurationReader.class)), c.z(new AnonymousClass56(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_LOCAL, H.a(CacheDataSource.class)), c.z(new AnonymousClass57(registry)));
            registry.updateService(new ServiceKey("", H.a(CreateFile.class)), c.z(AnonymousClass58.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(GetFileExtensionFromUrl.class)), c.z(new AnonymousClass59(registry)));
            registry.updateService(new ServiceKey("", H.a(RemoveUrlQuery.class)), c.z(AnonymousClass60.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(MediationDataSource.class)), c.z(new AnonymousClass61(registry)));
            registry.updateService(new ServiceKey("", H.a(PrivacyDeviceInfoDataSource.class)), c.z(new AnonymousClass62(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_REMOTE, H.a(CacheDataSource.class)), c.z(new AnonymousClass63(registry)));
            registry.updateService(new ServiceKey("", H.a(StaticDeviceInfoDataSource.class)), c.z(new AnonymousClass64(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.PREF_GL_INFO, H.a(InterfaceC4215d.class)), c.z(new AnonymousClass65(registry)));
            registry.updateService(new ServiceKey("", H.a(UniversalRequestDataSource.class)), c.z(new AnonymousClass66(registry)));
            registry.updateService(new ServiceKey("", H.a(WebviewConfigurationDataSource.class)), c.z(new AnonymousClass67(registry)));
            registry.updateService(new ServiceKey("", H.a(OmidManager.class)), c.z(AnonymousClass68.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(SDKPropertiesManager.class)), c.z(AnonymousClass69.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(StorageManager.class)), c.z(AnonymousClass70.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(BillingClientAdapter.class)), c.z(new AnonymousClass71(registry)));
            registry.updateService(new ServiceKey("", H.a(ProductDetailsFetcher.class)), c.z(new AnonymousClass72(registry)));
            registry.updateService(new ServiceKey("", H.a(TransactionEventManager.class)), c.z(new AnonymousClass73(registry)));
            registry.updateService(new ServiceKey("", H.a(AdRepository.class)), c.z(AnonymousClass74.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(CacheRepository.class)), c.z(new AnonymousClass75(registry)));
            registry.updateService(new ServiceKey("", H.a(GetCacheDirectory.class)), c.z(AnonymousClass76.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(GetAssetFileName.class)), c.z(AnonymousClass77.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(CampaignRepository.class)), c.z(new AnonymousClass78(registry)));
            registry.updateService(new ServiceKey("", H.a(DeveloperConsentRepository.class)), c.z(new AnonymousClass79(registry)));
            registry.updateService(new ServiceKey("", H.a(DeviceInfoRepository.class)), c.z(new AnonymousClass80(registry)));
            registry.updateService(new ServiceKey("", H.a(DiagnosticEventRepository.class)), c.z(new AnonymousClass81(registry)));
            registry.updateService(new ServiceKey("", H.a(LegacyUserConsentRepository.class)), c.z(new AnonymousClass82(registry)));
            registry.updateService(new ServiceKey("", H.a(MediationProviderParser.class)), c.z(AnonymousClass83.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(MediationInfoConverter.class)), c.z(new AnonymousClass84(registry)));
            registry.updateService(new ServiceKey("", H.a(MediationRepository.class)), c.z(new AnonymousClass85(registry)));
            registry.updateService(new ServiceKey("", H.a(OpenMeasurementRepository.class)), c.z(new AnonymousClass86(registry)));
            registry.updateService(new ServiceKey("", H.a(SessionRepository.class)), c.z(new AnonymousClass87(registry)));
            registry.updateService(new ServiceKey("", H.a(TransactionEventRepository.class)), c.z(AnonymousClass88.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(AdRevenueRepository.class)), c.z(AnonymousClass89.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(OperativeEventRepository.class)), c.z(AnonymousClass90.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(ExecuteAdViewerRequest.class)), c.z(new AnonymousClass91(registry)));
            registry.updateService(new ServiceKey("", H.a(GetByteStringId.class)), c.z(AnonymousClass92.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(IntentCreation.class)), ServiceFactoryKt.factoryOf(AnonymousClass93.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(HandleOpenUrl.class)), ServiceFactoryKt.factoryOf(new AnonymousClass94(registry)));
            registry.updateService(new ServiceKey("", H.a(Refresh.class)), c.z(new AnonymousClass95(registry)));
            registry.updateService(new ServiceKey("", H.a(CacheAssets.class)), c.z(new AnonymousClass96(registry)));
            registry.updateService(new ServiceKey("", H.a(AdRefresh.class)), ServiceFactoryKt.factoryOf(new AnonymousClass97(registry)));
            registry.updateService(new ServiceKey("", H.a(SendDiagnosticEvent.class)), c.z(new AnonymousClass98(registry)));
            registry.updateService(new ServiceKey("", H.a(SendWebViewClientErrorDiagnostics.class)), c.z(new AnonymousClass99(registry)));
            registry.updateService(new ServiceKey("", H.a(Show.class)), ServiceFactoryKt.factoryOf(new AnonymousClass100(registry)));
            registry.updateService(new ServiceKey("", H.a(CacheFile.class)), c.z(new AnonymousClass101(registry)));
            registry.updateService(new ServiceKey("", H.a(CleanAssets.class)), c.z(new AnonymousClass102(registry)));
            registry.updateService(new ServiceKey("", H.a(GetAdObject.class)), c.z(new AnonymousClass103(registry)));
            registry.updateService(new ServiceKey("", H.a(ScarEligibleEffectiveUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass104(registry)));
            registry.updateService(new ServiceKey("", H.a(GetHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass105(registry)));
            registry.updateService(new ServiceKey("", H.a(BuildHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass106(registry)));
            registry.updateService(new ServiceKey("", H.a(TokenNumberProvider.class)), ServiceFactoryKt.factoryOf(new AnonymousClass107(registry)));
            registry.updateService(new ServiceKey("", H.a(GetInitializationData.class)), c.z(new AnonymousClass108(registry)));
            registry.updateService(new ServiceKey("", H.a(MediationInitBlobMetadataReader.class)), ServiceFactoryKt.factoryOf(new AnonymousClass109(registry)));
            registry.updateService(new ServiceKey("", H.a(GetInitializationRequestPayload.class)), c.z(new AnonymousClass110(registry)));
            registry.updateService(new ServiceKey("", H.a(GetInitializationState.class)), c.z(new AnonymousClass111(registry)));
            registry.updateService(new ServiceKey("", H.a(GetIsFileCache.class)), c.z(new AnonymousClass112(registry)));
            registry.updateService(new ServiceKey("", H.a(SetInitializationState.class)), c.z(new AnonymousClass113(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, H.a(GetRequestPolicy.class)), c.z(new AnonymousClass114(registry)));
            registry.updateService(new ServiceKey("", H.a(GetAdDataRefreshRequest.class)), c.z(new AnonymousClass115(registry)));
            registry.updateService(new ServiceKey("", H.a(GetAdPlayerConfigRequest.class)), c.z(new AnonymousClass116(registry)));
            registry.updateService(new ServiceKey("", H.a(AndroidGetAdPlayerContext.class)), c.z(new AnonymousClass117(registry)));
            registry.updateService(new ServiceKey("", H.a(GetAdRequest.class)), c.z(new AnonymousClass118(registry)));
            registry.updateService(new ServiceKey("", H.a(GetHbTokenEventRequest.class)), c.z(AnonymousClass119.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(CommonScarEventReceiver.class)), c.z(new AnonymousClass120(registry)));
            registry.updateService(new ServiceKey("", H.a(GMAScarAdapterBridge.class)), c.z(new AnonymousClass121(registry)));
            registry.updateService(new ServiceKey("", H.a(ScarTimeHackFixer.class)), c.z(new AnonymousClass122(registry)));
            registry.updateService(new ServiceKey("", H.a(ScarManager.class)), c.z(new AnonymousClass123(registry)));
            registry.updateService(new ServiceKey("", H.a(FetchSignalsAndSendUseCase.class)), c.z(new AnonymousClass124(registry)));
            registry.updateService(new ServiceKey("", H.a(LoadScarAd.class)), c.z(new AnonymousClass125(registry)));
            registry.updateService(new ServiceKey("", H.a(HandleGetTokenRequest.class)), c.z(new AnonymousClass126(registry)));
            registry.updateService(new ServiceKey("", H.a(GetClientInfo.class)), c.z(new AnonymousClass127(registry)));
            registry.updateService(new ServiceKey("", H.a(GetInitializationCompletedRequest.class)), c.z(new AnonymousClass128(registry)));
            registry.updateService(new ServiceKey("", H.a(GetInitializationRequest.class)), c.z(new AnonymousClass129(registry)));
            registry.updateService(new ServiceKey("", H.a(GetLimitedSessionToken.class)), c.z(new AnonymousClass130(registry)));
            registry.updateService(new ServiceKey("", H.a(GetOpenGLRendererInfo.class)), c.z(new AnonymousClass131(registry)));
            registry.updateService(new ServiceKey("", H.a(GetSharedDataTimestamps.class)), c.z(new AnonymousClass132(registry)));
            registry.updateService(new ServiceKey("", H.a(GetUniversalRequestForPayLoad.class)), c.z(new AnonymousClass133(registry)));
            registry.updateService(new ServiceKey("", H.a(GetUniversalRequestSharedData.class)), c.z(new AnonymousClass134(registry)));
            registry.updateService(new ServiceKey("", H.a(GetCachedAsset.class)), c.z(new AnonymousClass135(registry)));
            registry.updateService(new ServiceKey("", H.a(GetWebViewBridgeUseCase.class)), c.z(new AnonymousClass136(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, H.a(GetRequestPolicy.class)), c.z(new AnonymousClass137(registry)));
            registry.updateService(new ServiceKey("", H.a(GetLatestWebViewConfiguration.class)), c.z(new AnonymousClass138(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_OPERATIVE_REQ, H.a(GetRequestPolicy.class)), c.z(new AnonymousClass139(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, H.a(GetRequestPolicy.class)), c.z(new AnonymousClass140(registry)));
            registry.updateService(new ServiceKey("", H.a(GetPrivacyUpdateRequest.class)), c.z(new AnonymousClass141(registry)));
            registry.updateService(new ServiceKey("", H.a(HandleGatewayInitializationResponse.class)), c.z(new AnonymousClass142(registry)));
            registry.updateService(new ServiceKey("", H.a(HandleGatewayUniversalResponse.class)), c.z(new AnonymousClass143(registry)));
            registry.updateService(new ServiceKey("", H.a(InitializeBoldSDK.class)), c.z(new AnonymousClass144(registry)));
            registry.updateService(new ServiceKey("", H.a(LegacyShowUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass145(registry)));
            registry.updateService(new ServiceKey("", H.a(SendPrivacyUpdateRequest.class)), c.z(new AnonymousClass146(registry)));
            registry.updateService(new ServiceKey("", H.a(TriggerInitializationCompletedRequest.class)), c.z(new AnonymousClass147(registry)));
            registry.updateService(new ServiceKey("", H.a(TriggerInitializeListener.class)), c.z(new AnonymousClass148(registry)));
            registry.updateService(new ServiceKey("", H.a(DiagnosticEventObserver.class)), c.z(new AnonymousClass149(registry)));
            registry.updateService(new ServiceKey("", H.a(EventObservers.class)), c.z(new AnonymousClass150(registry)));
            registry.updateService(new ServiceKey("", H.a(GetTransactionData.class)), c.z(new AnonymousClass151(registry)));
            registry.updateService(new ServiceKey("", H.a(GetTransactionRequest.class)), c.z(new AnonymousClass152(registry)));
            registry.updateService(new ServiceKey("", H.a(GetAdRevenueEventData.class)), c.z(AnonymousClass153.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(HandleAdRevenueEvent.class)), c.z(new AnonymousClass154(registry)));
            registry.updateService(new ServiceKey("", H.a(GetDiagnosticEventBatchRequest.class)), c.z(AnonymousClass155.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(GetDiagnosticEventRequest.class)), c.z(new AnonymousClass156(registry)));
            registry.updateService(new ServiceKey("", H.a(GetOperativeEventApi.class)), c.z(new AnonymousClass157(registry)));
            registry.updateService(new ServiceKey("", H.a(GetOperativeEventRequest.class)), c.z(new AnonymousClass158(registry)));
            registry.updateService(new ServiceKey("", H.a(HandleGatewayEventResponse.class)), c.z(AnonymousClass159.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(OperativeEventObserver.class)), c.z(new AnonymousClass160(registry)));
            registry.updateService(new ServiceKey("", H.a(TransactionEventObserver.class)), c.z(new AnonymousClass161(registry)));
            registry.updateService(new ServiceKey("", H.a(AdRevenueObserver.class)), c.z(new AnonymousClass162(registry)));
            registry.updateService(new ServiceKey("", H.a(LifecycleEventObserver.class)), c.z(new AnonymousClass163(registry)));
            registry.updateService(new ServiceKey("", H.a(AppLovinCommunicatorBridge.class)), c.z(new AnonymousClass164(registry)));
            registry.updateService(new ServiceKey("", H.a(MaxAdRevenueCommunicatorProxyFactory.class)), c.z(new AnonymousClass165(registry)));
            registry.updateService(new ServiceKey("", H.a(MaxAdRevenueListener.class)), ServiceFactoryKt.factoryOf(new AnonymousClass166(registry)));
            registry.updateService(new ServiceKey("", H.a(MaxAdRevenueObserver.class)), c.z(new AnonymousClass167(registry)));
            registry.updateService(new ServiceKey("", H.a(UniversalRequestTtlValidator.class)), c.z(AnonymousClass168.INSTANCE));
            registry.updateService(new ServiceKey("universal", H.a(UniversalRequestEventSender.class)), ServiceFactoryKt.factoryOf(new AnonymousClass169(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DIAGNOSTICS_EVENT_SENDER, H.a(UniversalRequestEventSender.class)), ServiceFactoryKt.factoryOf(new AnonymousClass170(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.OPERATIVE_EVENT_SENDER, H.a(UniversalRequestEventSender.class)), ServiceFactoryKt.factoryOf(new AnonymousClass171(registry)));
            registry.updateService(new ServiceKey("", H.a(OmFinishSession.class)), c.z(new AnonymousClass172(registry)));
            registry.updateService(new ServiceKey("", H.a(OmImpressionOccurred.class)), c.z(new AnonymousClass173(registry)));
            registry.updateService(new ServiceKey("", H.a(AndroidOmInteraction.class)), c.z(new AnonymousClass174(registry)));
            registry.updateService(new ServiceKey("", H.a(GetOmData.class)), c.z(new AnonymousClass175(registry)));
            registry.updateService(new ServiceKey("", H.a(IsOMActivated.class)), c.z(new AnonymousClass176(registry)));
            registry.updateService(new ServiceKey("", H.a(InitializeOMSDK.class)), c.z(new AnonymousClass177(registry)));
            registry.updateService(new ServiceKey("", H.a(InitializeAdQuality.class)), c.z(new AnonymousClass178(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, H.a(FlattenerRulesUseCase.class)), c.z(AnonymousClass179.INSTANCE));
            registry.updateService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, H.a(FlattenerRulesUseCase.class)), c.z(AnonymousClass180.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(BackgroundWorker.class)), c.z(new AnonymousClass181(registry)));
            registry.updateService(new ServiceKey("", H.a(DiagnosticEventRequestWorkModifier.class)), c.z(new AnonymousClass182(registry)));
            registry.updateService(new ServiceKey("", H.a(GatewayClient.class)), c.z(new AnonymousClass183(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_SDK, H.a(C.class)), c.z(new AnonymousClass184(registry)));
            registry.updateService(new ServiceKey("", H.a(TokenStorage.class)), c.z(AnonymousClass185.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(VolumeChange.class)), c.z(AnonymousClass186.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(ConfigFileFromLocalStorage.class)), c.z(new AnonymousClass187(registry)));
            registry.updateService(new ServiceKey("", H.a(InitializeSDK.class)), c.z(new AnonymousClass188(registry)));
            registry.updateService(new ServiceKey("", H.a(InitializeStateComplete.class)), c.z(new AnonymousClass189(registry)));
            registry.updateService(new ServiceKey("", H.a(InitializeStateConfig.class)), c.z(new AnonymousClass190(registry)));
            registry.updateService(new ServiceKey("", H.a(InitializeStateConfigWithLoader.class)), c.z(new AnonymousClass191(registry)));
            registry.updateService(new ServiceKey("", H.a(InitializeStateCreate.class)), c.z(new AnonymousClass192(registry)));
            registry.updateService(new ServiceKey("", H.a(InitializeStateError.class)), c.z(new AnonymousClass193(registry)));
            registry.updateService(new ServiceKey("", H.a(InitializeStateLoadCache.class)), c.z(new AnonymousClass194(registry)));
            registry.updateService(new ServiceKey("", H.a(InitializeStateLoadWeb.class)), c.z(new AnonymousClass195(registry)));
            registry.updateService(new ServiceKey("", H.a(InitializeStateReset.class)), c.z(new AnonymousClass196(registry)));
            registry.updateService(new ServiceKey("", H.a(StoreMonitor.class)), c.z(new AnonymousClass197(registry)));
            registry.updateService(new ServiceKey("", H.a(StoreWebViewEventSender.class)), c.z(new AnonymousClass198(registry)));
            registry.updateService(new ServiceKey("", H.a(StoreExceptionHandler.class)), c.z(AnonymousClass199.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(StoreEventListenerFactory.class)), c.z(new AnonymousClass200(registry)));
            registry.updateService(new ServiceKey("", H.a(ConfigurationReader.class)), c.z(AnonymousClass201.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(AndroidAttribution.class)), c.z(new AnonymousClass202(registry)));
            registry.updateService(new ServiceKey("", H.a(AdPlayerScope.class)), ServiceFactoryKt.factoryOf(new AnonymousClass203(registry)));
            registry.updateService(new ServiceKey("", H.a(AndroidWebViewClient.class)), ServiceFactoryKt.factoryOf(new AnonymousClass204(registry)));
            registry.updateService(new ServiceKey("", H.a(AndroidGetWebViewContainerUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass205(registry)));
            registry.updateService(new ServiceKey("", H.a(Load.class)), ServiceFactoryKt.factoryOf(new AnonymousClass206(registry)));
            registry.updateService(new ServiceKey("", H.a(AwaitInitialization.class)), ServiceFactoryKt.factoryOf(new AnonymousClass207(registry)));
            registry.updateService(new ServiceKey("", H.a(GetAsyncHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass208(registry)));
            registry.updateService(new ServiceKey("", H.a(GetAdPlayer.class)), ServiceFactoryKt.factoryOf(new AnonymousClass209(registry)));
            registry.updateService(new ServiceKey("", H.a(CacheWebViewAssets.class)), c.z(new AnonymousClass210(registry)));
            registry.updateService(new ServiceKey("", H.a(HandleGatewayAdResponse.class)), ServiceFactoryKt.factoryOf(new AnonymousClass211(registry)));
            registry.updateService(new ServiceKey("", H.a(HandleInvocationsFromAdViewer.class)), ServiceFactoryKt.factoryOf(AnonymousClass212.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(LegacyLoadUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass213(registry)));
            registry.updateService(new ServiceKey("", H.a(WebViewLessLoadStrategy.class)), c.z(new AnonymousClass214(registry)));
            registry.updateService(new ServiceKey("", H.a(SafeCallbackInvoke.class)), c.z(new AnonymousClass215(registry)));
            registry.updateService(new ServiceKey("", H.a(InitializeStateNetworkError.class)), ServiceFactoryKt.factoryOf(new AnonymousClass216(registry)));
            registry.updateService(new ServiceKey("", H.a(CoroutineTimer.class)), ServiceFactoryKt.factoryOf(new AnonymousClass217(registry)));
            registry.updateService(new ServiceKey("", H.a(IEventSender.class)), c.z(AnonymousClass218.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(SetGameId.class)), c.z(new AnonymousClass219(registry)));
            registry.updateService(new ServiceKey("", H.a(GetGameId.class)), c.z(new AnonymousClass220(registry)));
            registry.updateService(new ServiceKey("", H.a(ValidateGameId.class)), c.z(new AnonymousClass221(registry)));
            registry.updateService(new ServiceKey("", H.a(ValidateExtrasSize.class)), c.z(new AnonymousClass222(registry)));
            registry.updateService(new ServiceKey("", H.a(ShouldAllowInitialization.class)), c.z(new AnonymousClass223(registry)));
            registry.updateService(new ServiceKey("", H.a(CheckForGameIdAndTestModeChanges.class)), c.z(new AnonymousClass224(registry)));
            registry.updateService(new ServiceKey("", H.a(DownloadPriorityQueue.class)), c.z(new AnonymousClass225(registry)));
            registry.updateService(new ServiceKey("", H.a(CleanupDirectory.class)), c.z(new AnonymousClass226(registry)));
            registry.updateService(new ServiceKey("", H.a(FocusRepository.class)), c.z(new AnonymousClass227(registry)));
            registry.updateService(new ServiceKey("", H.a(AndroidGetIsAdActivity.class)), c.z(new AnonymousClass228(registry)));
            registry.updateService(new ServiceKey("", H.a(AndroidGetLifecycleFlow.class)), c.z(new AnonymousClass229(registry)));
            registry.updateService(new ServiceKey("", H.a(AndroidHandleFocusCounters.class)), c.z(new AnonymousClass230(registry)));
            registry.updateService(new ServiceKey("", H.a(OfferwallAdapterBridge.class)), c.z(new AnonymousClass231(registry)));
            registry.updateService(new ServiceKey("", H.a(OfferwallManager.class)), c.z(new AnonymousClass232(registry)));
            registry.updateService(new ServiceKey("", H.a(LoadOfferwallAd.class)), c.z(new AnonymousClass233(registry)));
            registry.updateService(new ServiceKey("", H.a(GetIsOfferwallAdReady.class)), c.z(new AnonymousClass234(registry)));
            registry.updateService(new ServiceKey("", H.a(FIdDataSource.class)), c.z(new AnonymousClass235(registry)));
            registry.updateService(new ServiceKey("", H.a(FIdExistenceDataSource.class)), c.z(AnonymousClass236.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(AdQualityVersionDataSource.class)), c.z(new AnonymousClass237(registry)));
            registry.updateService(new ServiceKey("", H.a(CleanUpWhenOpportunityExpires.class)), c.z(new AnonymousClass238(registry)));
            registry.updateService(new ServiceKey("", H.a(OrientationRepository.class)), c.z(new AnonymousClass239(registry)));
            registry.updateService(new ServiceKey("", H.a(AndroidAppSetIdDataSource.class)), c.z(new AnonymousClass240(registry)));
            registry.updateService(new ServiceKey("", H.a(AndroidUnityInfoDataSource.class)), c.z(new AnonymousClass241(registry)));
            registry.updateService(new ServiceKey("", H.a(InstallReferrerDataSource.class)), c.z(new AnonymousClass242(registry)));
            registry.updateService(new ServiceKey("", H.a(HandleDebugSettings.class)), c.z(AnonymousClass243.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(Logger.class)), c.z(new AnonymousClass244(registry)));
            registry.updateService(new ServiceKey("", H.a(IsBillingClientAvailable.class)), c.z(AnonymousClass245.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(UnityBootConfigDataSource.class)), c.z(new AnonymousClass246(registry)));
            registry.updateService(new ServiceKey("", H.a(GetSafeguardedInitializationPolicy.class)), c.z(AnonymousClass247.INSTANCE));
            registry.updateService(new ServiceKey("", H.a(RequestUrlFactory.class)), ServiceFactoryKt.factoryOf(new AnonymousClass248(registry)));
        }
    }

    static {
        ServiceProvider serviceProvider = new ServiceProvider();
        INSTANCE = serviceProvider;
        serviceRegistry = serviceProvider.initialize();
    }

    private ServiceProvider() {
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    @NotNull
    public IServicesRegistry getRegistry() {
        return serviceRegistry;
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    @NotNull
    public IServicesRegistry initialize() {
        return ServicesRegistryKt.registry(AnonymousClass1.INSTANCE);
    }
}
