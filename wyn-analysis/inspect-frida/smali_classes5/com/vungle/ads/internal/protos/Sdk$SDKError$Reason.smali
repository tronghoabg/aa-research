.class public final enum Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/Internal$EnumLite;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/vungle/ads/internal/protos/Sdk$SDKError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Reason"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason$ReasonVerifier;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;",
        ">;",
        "Lcom/google/protobuf/Internal$EnumLite;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final enum AD_ALREADY_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_ALREADY_FAILED_VALUE:I = 0xce

.field public static final enum AD_ALREADY_LOADED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_ALREADY_LOADED_VALUE:I = 0xcc

.field public static final enum AD_CLOSED_MISSING_HEARTBEAT:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final AD_CLOSED_MISSING_HEARTBEAT_VALUE:I = 0x13e
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum AD_CLOSED_TEMPLATE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_CLOSED_TEMPLATE_ERROR_VALUE:I = 0x13d

.field public static final enum AD_CONSUMED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_CONSUMED_VALUE:I = 0xca

.field public static final enum AD_EXPIRED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final enum AD_EXPIRED_ON_PLAY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_EXPIRED_ON_PLAY_VALUE:I = 0x133

.field public static final AD_EXPIRED_VALUE:I = 0x130

.field public static final enum AD_HTML_FAILED_TO_LOAD:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_HTML_FAILED_TO_LOAD_VALUE:I = 0x136

.field public static final enum AD_INTERNAL_INTEGRATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_INTERNAL_INTEGRATION_ERROR_VALUE:I = 0x7532

.field public static final enum AD_IS_LOADING:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_IS_LOADING_VALUE:I = 0xcb

.field public static final enum AD_IS_PLAYING:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_IS_PLAYING_VALUE:I = 0xcd

.field public static final enum AD_LOAD_FAIL_EMPTY_BID_PAYLOAD:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE:I = 0xe0

.field public static final enum AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:I = 0xe1

.field public static final enum AD_LOAD_FAIL_RETRY_AFTER:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_LOAD_FAIL_RETRY_AFTER_VALUE:I = 0xdd

.field public static final enum AD_LOAD_TOO_FREQUENTLY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_LOAD_TOO_FREQUENTLY_VALUE:I = 0x2712

.field public static final enum AD_NOT_LOADED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_NOT_LOADED_VALUE:I = 0xd2

.field public static final enum AD_NO_FILL:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_NO_FILL_VALUE:I = 0x2711

.field public static final enum AD_PUBLISHER_MISMATCH:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_PUBLISHER_MISMATCH_VALUE:I = 0x7531

.field public static final enum AD_RESPONSE_EMPTY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_RESPONSE_EMPTY_VALUE:I = 0xd7

.field public static final enum AD_RESPONSE_INVALID_TEMPLATE_TYPE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:I = 0xd8

.field public static final enum AD_RESPONSE_RETRY_AFTER:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_RESPONSE_RETRY_AFTER_VALUE:I = 0xdc

.field public static final enum AD_RESPONSE_TIMED_OUT:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_RESPONSE_TIMED_OUT_VALUE:I = 0xd9

.field public static final enum AD_SERVER_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final AD_SERVER_ERROR_VALUE:I = 0x4e21

.field public static final enum AD_WIN_NOTIFICATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final AD_WIN_NOTIFICATION_ERROR_VALUE:I = 0x134
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum ALREADY_INITIALIZED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ALREADY_INITIALIZED_VALUE:I = 0x4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum API_FAILED_STATUS_CODE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final API_FAILED_STATUS_CODE_VALUE:I = 0x68

.field public static final enum API_REQUEST_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final API_REQUEST_ERROR_VALUE:I = 0x65

.field public static final enum API_RESPONSE_DATA_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final API_RESPONSE_DATA_ERROR_VALUE:I = 0x66

.field public static final enum API_RESPONSE_DECODE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final API_RESPONSE_DECODE_ERROR_VALUE:I = 0x67

.field public static final enum APP_IMPRESSION_CREATION_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final APP_IMPRESSION_CREATION_FAILED_VALUE:I = 0x7dc

.field public static final enum ASSET_FAILED_INSUFFICIENT_SPACE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:I = 0x7e

.field public static final enum ASSET_FAILED_MAX_SPACE_EXCEEDED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:I = 0x7f
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum ASSET_FAILED_STATUS_CODE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ASSET_FAILED_STATUS_CODE_VALUE:I = 0x75
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum ASSET_FAILED_TO_DELETE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final ASSET_FAILED_TO_DELETE_VALUE:I = 0x135

.field public static final enum ASSET_REQUEST_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final ASSET_REQUEST_ERROR_VALUE:I = 0x70

.field public static final enum ASSET_RESPONSE_DATA_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ASSET_RESPONSE_DATA_ERROR_VALUE:I = 0x71
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum ASSET_WRITE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final ASSET_WRITE_ERROR_VALUE:I = 0x72

.field public static final enum BANNER_VIEW_INVALID_SIZE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final BANNER_VIEW_INVALID_SIZE_VALUE:I = 0x1f4

.field public static final enum BLACK_SCREEN_DETECTION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final BLACK_SCREEN_DETECTION_ERROR_VALUE:I = 0x141

.field public static final enum CONCURRENT_PLAYBACK_UNSUPPORTED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE:I = 0x190

.field public static final enum CONFIG_NOT_FOUND_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final CONFIG_NOT_FOUND_ERROR_VALUE:I = 0x7533

.field public static final enum CONFIG_REFRESH_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final CONFIG_REFRESH_FAILED_VALUE:I = 0x8a

.field public static final enum CURRENTLY_INITIALIZING:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final CURRENTLY_INITIALIZING_VALUE:I = 0x3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum DEEPLINK_OPEN_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final DEEPLINK_OPEN_FAILED_VALUE:I = 0x138

.field public static final enum EMPTY_TPAT_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final EMPTY_TPAT_ERROR_VALUE:I = 0x81

.field public static final enum EVALUATE_JAVASCRIPT_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final EVALUATE_JAVASCRIPT_FAILED_VALUE:I = 0x139

.field public static final enum GENERATE_JSON_DATA_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final GENERATE_JSON_DATA_ERROR_VALUE:I = 0x13c

.field public static final enum GZIP_ENCODE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final GZIP_ENCODE_ERROR_VALUE:I = 0x74

.field public static final enum HANDLE_TAP_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final HANDLE_TAP_FAILED_VALUE:I = 0x7dd

.field public static final enum HAPTIC_ENGINE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final HAPTIC_ENGINE_ERROR_VALUE:I = 0x7de

.field public static final enum INLINE_INSTALL_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INLINE_INSTALL_ERROR_VALUE:I = 0xbba

.field public static final enum INVALID_ADS_ENDPOINT:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_ADS_ENDPOINT_VALUE:I = 0x7a

.field public static final enum INVALID_ADUNIT_BID_PAYLOAD:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_ADUNIT_BID_PAYLOAD_VALUE:I = 0xd5

.field public static final enum INVALID_APP_ID:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_APP_ID_VALUE:I = 0x2

.field public static final enum INVALID_ASSET_URL:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_ASSET_URL_VALUE:I = 0x6f

.field public static final enum INVALID_BID_PAYLOAD:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_BID_PAYLOAD_VALUE:I = 0xd0

.field public static final enum INVALID_CONFIG_RESPONSE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_CONFIG_RESPONSE_VALUE:I = 0x87

.field public static final enum INVALID_CSB_DATA:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_CSB_DATA_VALUE:I = 0xe3

.field public static final enum INVALID_CTA_URL:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_CTA_URL_VALUE:I = 0x6e

.field public static final enum INVALID_EVENT_ID_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_EVENT_ID_ERROR_VALUE:I = 0xc8

.field public static final enum INVALID_GZIP_BID_PAYLOAD:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_GZIP_BID_PAYLOAD_VALUE:I = 0xd6

.field public static final enum INVALID_IFA_STATUS:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_IFA_STATUS_VALUE:I = 0x12e

.field public static final enum INVALID_INDEX_URL:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_INDEX_URL_VALUE:I = 0x73

.field public static final enum INVALID_JSON_BID_PAYLOAD:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_JSON_BID_PAYLOAD_VALUE:I = 0xd1

.field public static final enum INVALID_LOG_ERROR_ENDPOINT:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_LOG_ERROR_ENDPOINT_VALUE:I = 0x7c

.field public static final enum INVALID_METRICS_ENDPOINT:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_METRICS_ENDPOINT_VALUE:I = 0x7d

.field public static final enum INVALID_PLACEMENT_ID:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_PLACEMENT_ID_VALUE:I = 0xc9

.field public static final enum INVALID_PLAY_PARAMETER:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_PLAY_PARAMETER_VALUE:I = 0x7d9

.field public static final enum INVALID_REQUEST_BUILDER_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_REQUEST_BUILDER_ERROR_VALUE:I = 0x6a

.field public static final enum INVALID_RI_ENDPOINT:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_RI_ENDPOINT_VALUE:I = 0x7b

.field public static final enum INVALID_TEMPLATE_URL:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_TEMPLATE_URL_VALUE:I = 0x69

.field public static final enum INVALID_TPAT_KEY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final INVALID_TPAT_KEY_VALUE:I = 0x80

.field public static final enum INVALID_WATERFALL_PLACEMENT_ID:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final INVALID_WATERFALL_PLACEMENT_ID_VALUE:I = 0xde
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum JSON_ENCODE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final JSON_ENCODE_ERROR_VALUE:I = 0x77

.field public static final enum JSON_PARAMS_ENCODE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final JSON_PARAMS_ENCODE_ERROR_VALUE:I = 0x13b

.field public static final enum LINK_COMMAND_OPEN_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final LINK_COMMAND_OPEN_FAILED_VALUE:I = 0x13a

.field public static final enum MEDIATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final MEDIATION_ERROR_VALUE:I = 0x1388

.field public static final enum MRAID_BRIDGE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final MRAID_BRIDGE_ERROR_VALUE:I = 0x131

.field public static final enum MRAID_DOWNLOAD_JS_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final MRAID_DOWNLOAD_JS_ERROR_VALUE:I = 0x82

.field public static final enum MRAID_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final MRAID_ERROR_VALUE:I = 0x12d

.field public static final enum MRAID_JS_CALL_EMPTY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final MRAID_JS_CALL_EMPTY_VALUE:I = 0x137

.field public static final enum MRAID_JS_COPY_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final MRAID_JS_COPY_FAILED_VALUE:I = 0xdb

.field public static final enum MRAID_JS_DOES_NOT_EXIST:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final MRAID_JS_DOES_NOT_EXIST_VALUE:I = 0xda

.field public static final enum MRAID_JS_WRITE_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final MRAID_JS_WRITE_FAILED_VALUE:I = 0x83

.field public static final enum MRAID_UNRECOGNIZED_COMMAND:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final MRAID_UNRECOGNIZED_COMMAND_VALUE:I = 0x142

.field public static final enum NATIVE_ASSET_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final NATIVE_ASSET_ERROR_VALUE:I = 0x258

.field public static final enum NATIVE_VIDEO_PLAYBACK_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final NATIVE_VIDEO_PLAYBACK_ERROR_VALUE:I = 0x259

.field public static final enum OMSDK_COPY_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final OMSDK_COPY_ERROR_VALUE:I = 0x7d3

.field public static final enum OMSDK_DOWNLOAD_JS_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final OMSDK_DOWNLOAD_JS_ERROR_VALUE:I = 0x84

.field public static final enum OMSDK_JS_WRITE_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final OMSDK_JS_WRITE_FAILED_VALUE:I = 0x85

.field public static final enum OUT_OF_MEMORY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final OUT_OF_MEMORY_VALUE:I = 0xbb9

.field public static final enum PLACEMENT_AD_TYPE_MISMATCH:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final PLACEMENT_AD_TYPE_MISMATCH_VALUE:I = 0xcf

.field public static final enum PLACEMENT_SLEEP:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final PLACEMENT_SLEEP_VALUE:I = 0xd4

.field public static final enum PRESENTER_DEALLOCATED_BEFORE_LOAD_COMPLETION:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final PRESENTER_DEALLOCATED_BEFORE_LOAD_COMPLETION_VALUE:I = 0x7db

.field public static final enum PRIVACY_ICON_FALLBACK_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final PRIVACY_ICON_FALLBACK_ERROR_VALUE:I = 0xe2

.field public static final enum PRIVACY_URL_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final PRIVACY_URL_ERROR_VALUE:I = 0x88

.field public static final enum PROTOBUF_SERIALIZATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final PROTOBUF_SERIALIZATION_ERROR_VALUE:I = 0x76

.field public static final enum REACHABILITY_INITIALIZATION_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final REACHABILITY_INITIALIZATION_FAILED_VALUE:I = 0x7d5

.field public static final enum SDK_NOT_INITIALIZED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final SDK_NOT_INITIALIZED_VALUE:I = 0x6

.field public static final enum SILENT_MODE_MONITOR_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final SILENT_MODE_MONITOR_ERROR_VALUE:I = 0x13f

.field public static final enum STALE_CACHED_RESPONSE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final STALE_CACHED_RESPONSE_VALUE:I = 0xdf

.field public static final enum STORE_KIT_LOAD_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final STORE_KIT_LOAD_ERROR_VALUE:I = 0x7d2

.field public static final enum STORE_KIT_PRESENTATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final STORE_KIT_PRESENTATION_ERROR_VALUE:I = 0x7d7

.field public static final enum STORE_OVERLAY_DISMISSAL_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final STORE_OVERLAY_DISMISSAL_ERROR_VALUE:I = 0x7da

.field public static final enum STORE_OVERLAY_LOAD_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final STORE_OVERLAY_LOAD_ERROR_VALUE:I = 0x7d4

.field public static final enum STORE_OVERLAY_PRESENTATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final STORE_OVERLAY_PRESENTATION_ERROR_VALUE:I = 0x7d8

.field public static final enum STORE_REGION_CODE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final STORE_REGION_CODE_ERROR_VALUE:I = 0x86

.field public static final enum TEMPLATE_UNZIP_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final TEMPLATE_UNZIP_ERROR_VALUE:I = 0x6d

.field public static final enum TPAT_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final TPAT_ERROR_VALUE:I = 0x79

.field public static final enum TPAT_RETRY_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final TPAT_RETRY_FAILED_VALUE:I = 0x89

.field public static final enum UNKNOWN_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final UNKNOWN_ERROR_VALUE:I = 0x0

.field public static final enum UNKNOWN_RADIO_ACCESS_TECHNOLOGY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final UNKNOWN_RADIO_ACCESS_TECHNOLOGY_VALUE:I = 0x7d6

.field public static final enum UNRECOGNIZED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final enum USER_AGENT_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final USER_AGENT_ERROR_VALUE:I = 0x7

.field public static final enum VUNGLE_OIT_CREATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final VUNGLE_OIT_CREATION_ERROR_VALUE:I = 0xfa0

.field public static final enum WEBVIEW_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final WEBVIEW_ERROR_VALUE:I = 0x140

.field public static final enum WEB_VIEW_FAILED_NAVIGATION:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final WEB_VIEW_FAILED_NAVIGATION_VALUE:I = 0x7d1

.field public static final enum WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

.field public static final WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE_VALUE:I = 0x7d0

.field private static final internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Internal$EnumLiteMap<",
            "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method public static constructor <clinit>()V
    .locals 143

    .line 1
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 2
    .line 3
    const-string v1, "UNKNOWN_ERROR"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->UNKNOWN_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 10
    .line 11
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 12
    .line 13
    const-string v3, "INVALID_APP_ID"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    const/4 v5, 0x2

    .line 17
    invoke-direct {v1, v3, v4, v5}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_APP_ID:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 21
    .line 22
    new-instance v3, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 23
    .line 24
    const-string v6, "CURRENTLY_INITIALIZING"

    .line 25
    .line 26
    const/4 v7, 0x3

    .line 27
    invoke-direct {v3, v6, v5, v7}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v3, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->CURRENTLY_INITIALIZING:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 31
    .line 32
    new-instance v6, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 33
    .line 34
    const-string v8, "ALREADY_INITIALIZED"

    .line 35
    .line 36
    const/4 v9, 0x4

    .line 37
    invoke-direct {v6, v8, v7, v9}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    sput-object v6, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->ALREADY_INITIALIZED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 41
    .line 42
    new-instance v8, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 43
    .line 44
    const-string v10, "SDK_NOT_INITIALIZED"

    .line 45
    .line 46
    const/4 v11, 0x6

    .line 47
    invoke-direct {v8, v10, v9, v11}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 48
    .line 49
    .line 50
    sput-object v8, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->SDK_NOT_INITIALIZED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 51
    .line 52
    new-instance v10, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 53
    .line 54
    const-string v12, "USER_AGENT_ERROR"

    .line 55
    .line 56
    const/4 v13, 0x5

    .line 57
    const/4 v14, 0x7

    .line 58
    invoke-direct {v10, v12, v13, v14}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 59
    .line 60
    .line 61
    sput-object v10, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->USER_AGENT_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 62
    .line 63
    new-instance v12, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 64
    .line 65
    const-string v15, "API_REQUEST_ERROR"

    .line 66
    .line 67
    move/from16 v16, v2

    .line 68
    .line 69
    const/16 v2, 0x65

    .line 70
    .line 71
    invoke-direct {v12, v15, v11, v2}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 72
    .line 73
    .line 74
    sput-object v12, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->API_REQUEST_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 75
    .line 76
    new-instance v15, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 77
    .line 78
    move/from16 v17, v4

    .line 79
    .line 80
    const-string v4, "API_RESPONSE_DATA_ERROR"

    .line 81
    .line 82
    move/from16 v18, v5

    .line 83
    .line 84
    const/16 v5, 0x66

    .line 85
    .line 86
    invoke-direct {v15, v4, v14, v5}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 87
    .line 88
    .line 89
    sput-object v15, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->API_RESPONSE_DATA_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 90
    .line 91
    new-instance v4, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 92
    .line 93
    move/from16 v19, v7

    .line 94
    .line 95
    const-string v7, "API_RESPONSE_DECODE_ERROR"

    .line 96
    .line 97
    move/from16 v20, v9

    .line 98
    .line 99
    const/16 v9, 0x8

    .line 100
    .line 101
    move/from16 v21, v11

    .line 102
    .line 103
    const/16 v11, 0x67

    .line 104
    .line 105
    invoke-direct {v4, v7, v9, v11}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 106
    .line 107
    .line 108
    sput-object v4, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->API_RESPONSE_DECODE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 109
    .line 110
    new-instance v7, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 111
    .line 112
    move/from16 v22, v9

    .line 113
    .line 114
    const-string v9, "API_FAILED_STATUS_CODE"

    .line 115
    .line 116
    move/from16 v23, v13

    .line 117
    .line 118
    const/16 v13, 0x9

    .line 119
    .line 120
    move/from16 v24, v14

    .line 121
    .line 122
    const/16 v14, 0x68

    .line 123
    .line 124
    invoke-direct {v7, v9, v13, v14}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 125
    .line 126
    .line 127
    sput-object v7, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->API_FAILED_STATUS_CODE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 128
    .line 129
    new-instance v9, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 130
    .line 131
    move/from16 v25, v13

    .line 132
    .line 133
    const-string v13, "INVALID_TEMPLATE_URL"

    .line 134
    .line 135
    const/16 v14, 0xa

    .line 136
    .line 137
    const/16 v11, 0x69

    .line 138
    .line 139
    invoke-direct {v9, v13, v14, v11}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 140
    .line 141
    .line 142
    sput-object v9, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_TEMPLATE_URL:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 143
    .line 144
    new-instance v13, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 145
    .line 146
    move/from16 v28, v14

    .line 147
    .line 148
    const-string v14, "INVALID_REQUEST_BUILDER_ERROR"

    .line 149
    .line 150
    const/16 v11, 0xb

    .line 151
    .line 152
    const/16 v5, 0x6a

    .line 153
    .line 154
    invoke-direct {v13, v14, v11, v5}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 155
    .line 156
    .line 157
    sput-object v13, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_REQUEST_BUILDER_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 158
    .line 159
    new-instance v14, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 160
    .line 161
    move/from16 v31, v11

    .line 162
    .line 163
    const-string v11, "TEMPLATE_UNZIP_ERROR"

    .line 164
    .line 165
    const/16 v5, 0xc

    .line 166
    .line 167
    const/16 v2, 0x6d

    .line 168
    .line 169
    invoke-direct {v14, v11, v5, v2}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 170
    .line 171
    .line 172
    sput-object v14, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->TEMPLATE_UNZIP_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 173
    .line 174
    new-instance v11, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 175
    .line 176
    move/from16 v34, v5

    .line 177
    .line 178
    const-string v5, "INVALID_CTA_URL"

    .line 179
    .line 180
    const/16 v2, 0xd

    .line 181
    .line 182
    move-object/from16 v36, v0

    .line 183
    .line 184
    const/16 v0, 0x6e

    .line 185
    .line 186
    invoke-direct {v11, v5, v2, v0}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 187
    .line 188
    .line 189
    sput-object v11, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_CTA_URL:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 190
    .line 191
    new-instance v5, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 192
    .line 193
    move/from16 v37, v2

    .line 194
    .line 195
    const-string v2, "INVALID_ASSET_URL"

    .line 196
    .line 197
    const/16 v0, 0xe

    .line 198
    .line 199
    move-object/from16 v39, v1

    .line 200
    .line 201
    const/16 v1, 0x6f

    .line 202
    .line 203
    invoke-direct {v5, v2, v0, v1}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 204
    .line 205
    .line 206
    sput-object v5, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_ASSET_URL:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 207
    .line 208
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 209
    .line 210
    const-string v2, "ASSET_REQUEST_ERROR"

    .line 211
    .line 212
    const/16 v1, 0xf

    .line 213
    .line 214
    move-object/from16 v41, v3

    .line 215
    .line 216
    const/16 v3, 0x70

    .line 217
    .line 218
    invoke-direct {v0, v2, v1, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 219
    .line 220
    .line 221
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->ASSET_REQUEST_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 222
    .line 223
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 224
    .line 225
    const-string v2, "ASSET_RESPONSE_DATA_ERROR"

    .line 226
    .line 227
    const/16 v3, 0x10

    .line 228
    .line 229
    move-object/from16 v43, v0

    .line 230
    .line 231
    const/16 v0, 0x71

    .line 232
    .line 233
    invoke-direct {v1, v2, v3, v0}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 234
    .line 235
    .line 236
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->ASSET_RESPONSE_DATA_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 237
    .line 238
    new-instance v2, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 239
    .line 240
    const-string v3, "ASSET_WRITE_ERROR"

    .line 241
    .line 242
    const/16 v0, 0x11

    .line 243
    .line 244
    move-object/from16 v45, v1

    .line 245
    .line 246
    const/16 v1, 0x72

    .line 247
    .line 248
    invoke-direct {v2, v3, v0, v1}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 249
    .line 250
    .line 251
    sput-object v2, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->ASSET_WRITE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 252
    .line 253
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 254
    .line 255
    const-string v3, "INVALID_INDEX_URL"

    .line 256
    .line 257
    const/16 v1, 0x12

    .line 258
    .line 259
    move-object/from16 v47, v2

    .line 260
    .line 261
    const/16 v2, 0x73

    .line 262
    .line 263
    invoke-direct {v0, v3, v1, v2}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 264
    .line 265
    .line 266
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_INDEX_URL:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 267
    .line 268
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 269
    .line 270
    const-string v3, "GZIP_ENCODE_ERROR"

    .line 271
    .line 272
    const/16 v2, 0x13

    .line 273
    .line 274
    move-object/from16 v49, v0

    .line 275
    .line 276
    const/16 v0, 0x74

    .line 277
    .line 278
    invoke-direct {v1, v3, v2, v0}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 279
    .line 280
    .line 281
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->GZIP_ENCODE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 282
    .line 283
    new-instance v2, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 284
    .line 285
    const-string v3, "ASSET_FAILED_STATUS_CODE"

    .line 286
    .line 287
    const/16 v0, 0x14

    .line 288
    .line 289
    move-object/from16 v51, v1

    .line 290
    .line 291
    const/16 v1, 0x75

    .line 292
    .line 293
    invoke-direct {v2, v3, v0, v1}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 294
    .line 295
    .line 296
    sput-object v2, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->ASSET_FAILED_STATUS_CODE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 297
    .line 298
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 299
    .line 300
    const/16 v3, 0x15

    .line 301
    .line 302
    const/16 v1, 0x76

    .line 303
    .line 304
    move-object/from16 v52, v2

    .line 305
    .line 306
    const-string v2, "PROTOBUF_SERIALIZATION_ERROR"

    .line 307
    .line 308
    invoke-direct {v0, v2, v3, v1}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 309
    .line 310
    .line 311
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->PROTOBUF_SERIALIZATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 312
    .line 313
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 314
    .line 315
    const/16 v2, 0x16

    .line 316
    .line 317
    const/16 v3, 0x77

    .line 318
    .line 319
    move-object/from16 v53, v0

    .line 320
    .line 321
    const-string v0, "JSON_ENCODE_ERROR"

    .line 322
    .line 323
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 324
    .line 325
    .line 326
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->JSON_ENCODE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 327
    .line 328
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 329
    .line 330
    const/16 v2, 0x17

    .line 331
    .line 332
    const/16 v3, 0x79

    .line 333
    .line 334
    move-object/from16 v54, v1

    .line 335
    .line 336
    const-string v1, "TPAT_ERROR"

    .line 337
    .line 338
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 339
    .line 340
    .line 341
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->TPAT_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 342
    .line 343
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 344
    .line 345
    const/16 v2, 0x18

    .line 346
    .line 347
    const/16 v3, 0x7a

    .line 348
    .line 349
    move-object/from16 v55, v0

    .line 350
    .line 351
    const-string v0, "INVALID_ADS_ENDPOINT"

    .line 352
    .line 353
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 354
    .line 355
    .line 356
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_ADS_ENDPOINT:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 357
    .line 358
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 359
    .line 360
    const/16 v2, 0x19

    .line 361
    .line 362
    const/16 v3, 0x7b

    .line 363
    .line 364
    move-object/from16 v56, v1

    .line 365
    .line 366
    const-string v1, "INVALID_RI_ENDPOINT"

    .line 367
    .line 368
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 369
    .line 370
    .line 371
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_RI_ENDPOINT:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 372
    .line 373
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 374
    .line 375
    const/16 v2, 0x1a

    .line 376
    .line 377
    const/16 v3, 0x7c

    .line 378
    .line 379
    move-object/from16 v57, v0

    .line 380
    .line 381
    const-string v0, "INVALID_LOG_ERROR_ENDPOINT"

    .line 382
    .line 383
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 384
    .line 385
    .line 386
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_LOG_ERROR_ENDPOINT:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 387
    .line 388
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 389
    .line 390
    const/16 v2, 0x1b

    .line 391
    .line 392
    const/16 v3, 0x7d

    .line 393
    .line 394
    move-object/from16 v58, v1

    .line 395
    .line 396
    const-string v1, "INVALID_METRICS_ENDPOINT"

    .line 397
    .line 398
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 399
    .line 400
    .line 401
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_METRICS_ENDPOINT:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 402
    .line 403
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 404
    .line 405
    const/16 v2, 0x1c

    .line 406
    .line 407
    const/16 v3, 0x7e

    .line 408
    .line 409
    move-object/from16 v59, v0

    .line 410
    .line 411
    const-string v0, "ASSET_FAILED_INSUFFICIENT_SPACE"

    .line 412
    .line 413
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 414
    .line 415
    .line 416
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->ASSET_FAILED_INSUFFICIENT_SPACE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 417
    .line 418
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 419
    .line 420
    const/16 v2, 0x1d

    .line 421
    .line 422
    const/16 v3, 0x7f

    .line 423
    .line 424
    move-object/from16 v60, v1

    .line 425
    .line 426
    const-string v1, "ASSET_FAILED_MAX_SPACE_EXCEEDED"

    .line 427
    .line 428
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 429
    .line 430
    .line 431
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->ASSET_FAILED_MAX_SPACE_EXCEEDED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 432
    .line 433
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 434
    .line 435
    const/16 v2, 0x1e

    .line 436
    .line 437
    const/16 v3, 0x80

    .line 438
    .line 439
    move-object/from16 v61, v0

    .line 440
    .line 441
    const-string v0, "INVALID_TPAT_KEY"

    .line 442
    .line 443
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 444
    .line 445
    .line 446
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_TPAT_KEY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 447
    .line 448
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 449
    .line 450
    const/16 v2, 0x1f

    .line 451
    .line 452
    const/16 v3, 0x81

    .line 453
    .line 454
    move-object/from16 v62, v1

    .line 455
    .line 456
    const-string v1, "EMPTY_TPAT_ERROR"

    .line 457
    .line 458
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 459
    .line 460
    .line 461
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->EMPTY_TPAT_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 462
    .line 463
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 464
    .line 465
    const/16 v2, 0x20

    .line 466
    .line 467
    const/16 v3, 0x82

    .line 468
    .line 469
    move-object/from16 v63, v0

    .line 470
    .line 471
    const-string v0, "MRAID_DOWNLOAD_JS_ERROR"

    .line 472
    .line 473
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 474
    .line 475
    .line 476
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->MRAID_DOWNLOAD_JS_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 477
    .line 478
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 479
    .line 480
    const/16 v2, 0x21

    .line 481
    .line 482
    const/16 v3, 0x83

    .line 483
    .line 484
    move-object/from16 v64, v1

    .line 485
    .line 486
    const-string v1, "MRAID_JS_WRITE_FAILED"

    .line 487
    .line 488
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 489
    .line 490
    .line 491
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->MRAID_JS_WRITE_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 492
    .line 493
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 494
    .line 495
    const/16 v2, 0x22

    .line 496
    .line 497
    const/16 v3, 0x84

    .line 498
    .line 499
    move-object/from16 v65, v0

    .line 500
    .line 501
    const-string v0, "OMSDK_DOWNLOAD_JS_ERROR"

    .line 502
    .line 503
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 504
    .line 505
    .line 506
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->OMSDK_DOWNLOAD_JS_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 507
    .line 508
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 509
    .line 510
    const/16 v2, 0x23

    .line 511
    .line 512
    const/16 v3, 0x85

    .line 513
    .line 514
    move-object/from16 v66, v1

    .line 515
    .line 516
    const-string v1, "OMSDK_JS_WRITE_FAILED"

    .line 517
    .line 518
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 519
    .line 520
    .line 521
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->OMSDK_JS_WRITE_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 522
    .line 523
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 524
    .line 525
    const/16 v2, 0x24

    .line 526
    .line 527
    const/16 v3, 0x86

    .line 528
    .line 529
    move-object/from16 v67, v0

    .line 530
    .line 531
    const-string v0, "STORE_REGION_CODE_ERROR"

    .line 532
    .line 533
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 534
    .line 535
    .line 536
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->STORE_REGION_CODE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 537
    .line 538
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 539
    .line 540
    const/16 v2, 0x25

    .line 541
    .line 542
    const/16 v3, 0x87

    .line 543
    .line 544
    move-object/from16 v68, v1

    .line 545
    .line 546
    const-string v1, "INVALID_CONFIG_RESPONSE"

    .line 547
    .line 548
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 549
    .line 550
    .line 551
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_CONFIG_RESPONSE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 552
    .line 553
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 554
    .line 555
    const/16 v2, 0x26

    .line 556
    .line 557
    const/16 v3, 0x88

    .line 558
    .line 559
    move-object/from16 v69, v0

    .line 560
    .line 561
    const-string v0, "PRIVACY_URL_ERROR"

    .line 562
    .line 563
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 564
    .line 565
    .line 566
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->PRIVACY_URL_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 567
    .line 568
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 569
    .line 570
    const/16 v2, 0x27

    .line 571
    .line 572
    const/16 v3, 0x89

    .line 573
    .line 574
    move-object/from16 v70, v1

    .line 575
    .line 576
    const-string v1, "TPAT_RETRY_FAILED"

    .line 577
    .line 578
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 579
    .line 580
    .line 581
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->TPAT_RETRY_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 582
    .line 583
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 584
    .line 585
    const/16 v2, 0x28

    .line 586
    .line 587
    const/16 v3, 0x8a

    .line 588
    .line 589
    move-object/from16 v71, v0

    .line 590
    .line 591
    const-string v0, "CONFIG_REFRESH_FAILED"

    .line 592
    .line 593
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 594
    .line 595
    .line 596
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->CONFIG_REFRESH_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 597
    .line 598
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 599
    .line 600
    const/16 v2, 0x29

    .line 601
    .line 602
    const/16 v3, 0xc8

    .line 603
    .line 604
    move-object/from16 v72, v1

    .line 605
    .line 606
    const-string v1, "INVALID_EVENT_ID_ERROR"

    .line 607
    .line 608
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 609
    .line 610
    .line 611
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_EVENT_ID_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 612
    .line 613
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 614
    .line 615
    const/16 v2, 0x2a

    .line 616
    .line 617
    const/16 v3, 0xc9

    .line 618
    .line 619
    move-object/from16 v73, v0

    .line 620
    .line 621
    const-string v0, "INVALID_PLACEMENT_ID"

    .line 622
    .line 623
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 624
    .line 625
    .line 626
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_PLACEMENT_ID:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 627
    .line 628
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 629
    .line 630
    const/16 v2, 0x2b

    .line 631
    .line 632
    const/16 v3, 0xca

    .line 633
    .line 634
    move-object/from16 v74, v1

    .line 635
    .line 636
    const-string v1, "AD_CONSUMED"

    .line 637
    .line 638
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 639
    .line 640
    .line 641
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_CONSUMED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 642
    .line 643
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 644
    .line 645
    const/16 v2, 0x2c

    .line 646
    .line 647
    const/16 v3, 0xcb

    .line 648
    .line 649
    move-object/from16 v75, v0

    .line 650
    .line 651
    const-string v0, "AD_IS_LOADING"

    .line 652
    .line 653
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 654
    .line 655
    .line 656
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_IS_LOADING:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 657
    .line 658
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 659
    .line 660
    const/16 v2, 0x2d

    .line 661
    .line 662
    const/16 v3, 0xcc

    .line 663
    .line 664
    move-object/from16 v76, v1

    .line 665
    .line 666
    const-string v1, "AD_ALREADY_LOADED"

    .line 667
    .line 668
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 669
    .line 670
    .line 671
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_ALREADY_LOADED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 672
    .line 673
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 674
    .line 675
    const/16 v2, 0x2e

    .line 676
    .line 677
    const/16 v3, 0xcd

    .line 678
    .line 679
    move-object/from16 v77, v0

    .line 680
    .line 681
    const-string v0, "AD_IS_PLAYING"

    .line 682
    .line 683
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 684
    .line 685
    .line 686
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_IS_PLAYING:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 687
    .line 688
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 689
    .line 690
    const/16 v2, 0x2f

    .line 691
    .line 692
    const/16 v3, 0xce

    .line 693
    .line 694
    move-object/from16 v78, v1

    .line 695
    .line 696
    const-string v1, "AD_ALREADY_FAILED"

    .line 697
    .line 698
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 699
    .line 700
    .line 701
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_ALREADY_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 702
    .line 703
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 704
    .line 705
    const/16 v2, 0x30

    .line 706
    .line 707
    const/16 v3, 0xcf

    .line 708
    .line 709
    move-object/from16 v79, v0

    .line 710
    .line 711
    const-string v0, "PLACEMENT_AD_TYPE_MISMATCH"

    .line 712
    .line 713
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 714
    .line 715
    .line 716
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->PLACEMENT_AD_TYPE_MISMATCH:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 717
    .line 718
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 719
    .line 720
    const/16 v2, 0x31

    .line 721
    .line 722
    const/16 v3, 0xd0

    .line 723
    .line 724
    move-object/from16 v80, v1

    .line 725
    .line 726
    const-string v1, "INVALID_BID_PAYLOAD"

    .line 727
    .line 728
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 729
    .line 730
    .line 731
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_BID_PAYLOAD:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 732
    .line 733
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 734
    .line 735
    const/16 v2, 0x32

    .line 736
    .line 737
    const/16 v3, 0xd1

    .line 738
    .line 739
    move-object/from16 v81, v0

    .line 740
    .line 741
    const-string v0, "INVALID_JSON_BID_PAYLOAD"

    .line 742
    .line 743
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 744
    .line 745
    .line 746
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_JSON_BID_PAYLOAD:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 747
    .line 748
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 749
    .line 750
    const/16 v2, 0x33

    .line 751
    .line 752
    const/16 v3, 0xd2

    .line 753
    .line 754
    move-object/from16 v82, v1

    .line 755
    .line 756
    const-string v1, "AD_NOT_LOADED"

    .line 757
    .line 758
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 759
    .line 760
    .line 761
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_NOT_LOADED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 762
    .line 763
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 764
    .line 765
    const/16 v2, 0x34

    .line 766
    .line 767
    const/16 v3, 0xd4

    .line 768
    .line 769
    move-object/from16 v83, v0

    .line 770
    .line 771
    const-string v0, "PLACEMENT_SLEEP"

    .line 772
    .line 773
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 774
    .line 775
    .line 776
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->PLACEMENT_SLEEP:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 777
    .line 778
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 779
    .line 780
    const/16 v2, 0x35

    .line 781
    .line 782
    const/16 v3, 0xd5

    .line 783
    .line 784
    move-object/from16 v84, v1

    .line 785
    .line 786
    const-string v1, "INVALID_ADUNIT_BID_PAYLOAD"

    .line 787
    .line 788
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 789
    .line 790
    .line 791
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_ADUNIT_BID_PAYLOAD:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 792
    .line 793
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 794
    .line 795
    const/16 v2, 0x36

    .line 796
    .line 797
    const/16 v3, 0xd6

    .line 798
    .line 799
    move-object/from16 v85, v0

    .line 800
    .line 801
    const-string v0, "INVALID_GZIP_BID_PAYLOAD"

    .line 802
    .line 803
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 804
    .line 805
    .line 806
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_GZIP_BID_PAYLOAD:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 807
    .line 808
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 809
    .line 810
    const/16 v2, 0x37

    .line 811
    .line 812
    const/16 v3, 0xd7

    .line 813
    .line 814
    move-object/from16 v86, v1

    .line 815
    .line 816
    const-string v1, "AD_RESPONSE_EMPTY"

    .line 817
    .line 818
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 819
    .line 820
    .line 821
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_RESPONSE_EMPTY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 822
    .line 823
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 824
    .line 825
    const/16 v2, 0x38

    .line 826
    .line 827
    const/16 v3, 0xd8

    .line 828
    .line 829
    move-object/from16 v87, v0

    .line 830
    .line 831
    const-string v0, "AD_RESPONSE_INVALID_TEMPLATE_TYPE"

    .line 832
    .line 833
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 834
    .line 835
    .line 836
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_RESPONSE_INVALID_TEMPLATE_TYPE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 837
    .line 838
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 839
    .line 840
    const/16 v2, 0x39

    .line 841
    .line 842
    const/16 v3, 0xd9

    .line 843
    .line 844
    move-object/from16 v88, v1

    .line 845
    .line 846
    const-string v1, "AD_RESPONSE_TIMED_OUT"

    .line 847
    .line 848
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 849
    .line 850
    .line 851
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_RESPONSE_TIMED_OUT:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 852
    .line 853
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 854
    .line 855
    const/16 v2, 0x3a

    .line 856
    .line 857
    const/16 v3, 0xda

    .line 858
    .line 859
    move-object/from16 v89, v0

    .line 860
    .line 861
    const-string v0, "MRAID_JS_DOES_NOT_EXIST"

    .line 862
    .line 863
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 864
    .line 865
    .line 866
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->MRAID_JS_DOES_NOT_EXIST:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 867
    .line 868
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 869
    .line 870
    const/16 v2, 0x3b

    .line 871
    .line 872
    const/16 v3, 0xdb

    .line 873
    .line 874
    move-object/from16 v90, v1

    .line 875
    .line 876
    const-string v1, "MRAID_JS_COPY_FAILED"

    .line 877
    .line 878
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 879
    .line 880
    .line 881
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->MRAID_JS_COPY_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 882
    .line 883
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 884
    .line 885
    const/16 v2, 0x3c

    .line 886
    .line 887
    const/16 v3, 0xdc

    .line 888
    .line 889
    move-object/from16 v91, v0

    .line 890
    .line 891
    const-string v0, "AD_RESPONSE_RETRY_AFTER"

    .line 892
    .line 893
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 894
    .line 895
    .line 896
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_RESPONSE_RETRY_AFTER:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 897
    .line 898
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 899
    .line 900
    const/16 v2, 0x3d

    .line 901
    .line 902
    const/16 v3, 0xdd

    .line 903
    .line 904
    move-object/from16 v92, v1

    .line 905
    .line 906
    const-string v1, "AD_LOAD_FAIL_RETRY_AFTER"

    .line 907
    .line 908
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 909
    .line 910
    .line 911
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_LOAD_FAIL_RETRY_AFTER:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 912
    .line 913
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 914
    .line 915
    const/16 v2, 0x3e

    .line 916
    .line 917
    const/16 v3, 0xde

    .line 918
    .line 919
    move-object/from16 v93, v0

    .line 920
    .line 921
    const-string v0, "INVALID_WATERFALL_PLACEMENT_ID"

    .line 922
    .line 923
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 924
    .line 925
    .line 926
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_WATERFALL_PLACEMENT_ID:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 927
    .line 928
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 929
    .line 930
    const/16 v2, 0x3f

    .line 931
    .line 932
    const/16 v3, 0xdf

    .line 933
    .line 934
    move-object/from16 v94, v1

    .line 935
    .line 936
    const-string v1, "STALE_CACHED_RESPONSE"

    .line 937
    .line 938
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 939
    .line 940
    .line 941
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->STALE_CACHED_RESPONSE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 942
    .line 943
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 944
    .line 945
    const/16 v2, 0x40

    .line 946
    .line 947
    const/16 v3, 0xe0

    .line 948
    .line 949
    move-object/from16 v95, v0

    .line 950
    .line 951
    const-string v0, "AD_LOAD_FAIL_EMPTY_BID_PAYLOAD"

    .line 952
    .line 953
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 954
    .line 955
    .line 956
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_LOAD_FAIL_EMPTY_BID_PAYLOAD:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 957
    .line 958
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 959
    .line 960
    const/16 v2, 0x41

    .line 961
    .line 962
    const/16 v3, 0xe1

    .line 963
    .line 964
    move-object/from16 v96, v1

    .line 965
    .line 966
    const-string v1, "AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH"

    .line 967
    .line 968
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 969
    .line 970
    .line 971
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 972
    .line 973
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 974
    .line 975
    const/16 v2, 0x42

    .line 976
    .line 977
    const/16 v3, 0xe2

    .line 978
    .line 979
    move-object/from16 v97, v0

    .line 980
    .line 981
    const-string v0, "PRIVACY_ICON_FALLBACK_ERROR"

    .line 982
    .line 983
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 984
    .line 985
    .line 986
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->PRIVACY_ICON_FALLBACK_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 987
    .line 988
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 989
    .line 990
    const/16 v2, 0x43

    .line 991
    .line 992
    const/16 v3, 0xe3

    .line 993
    .line 994
    move-object/from16 v98, v1

    .line 995
    .line 996
    const-string v1, "INVALID_CSB_DATA"

    .line 997
    .line 998
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 999
    .line 1000
    .line 1001
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_CSB_DATA:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1002
    .line 1003
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1004
    .line 1005
    const/16 v2, 0x44

    .line 1006
    .line 1007
    const/16 v3, 0x12d

    .line 1008
    .line 1009
    move-object/from16 v99, v0

    .line 1010
    .line 1011
    const-string v0, "MRAID_ERROR"

    .line 1012
    .line 1013
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1014
    .line 1015
    .line 1016
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->MRAID_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1017
    .line 1018
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1019
    .line 1020
    const/16 v2, 0x45

    .line 1021
    .line 1022
    const/16 v3, 0x12e

    .line 1023
    .line 1024
    move-object/from16 v100, v1

    .line 1025
    .line 1026
    const-string v1, "INVALID_IFA_STATUS"

    .line 1027
    .line 1028
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1029
    .line 1030
    .line 1031
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_IFA_STATUS:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1032
    .line 1033
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1034
    .line 1035
    const/16 v2, 0x46

    .line 1036
    .line 1037
    const/16 v3, 0x130

    .line 1038
    .line 1039
    move-object/from16 v101, v0

    .line 1040
    .line 1041
    const-string v0, "AD_EXPIRED"

    .line 1042
    .line 1043
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1044
    .line 1045
    .line 1046
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_EXPIRED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1047
    .line 1048
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1049
    .line 1050
    const/16 v2, 0x47

    .line 1051
    .line 1052
    const/16 v3, 0x131

    .line 1053
    .line 1054
    move-object/from16 v102, v1

    .line 1055
    .line 1056
    const-string v1, "MRAID_BRIDGE_ERROR"

    .line 1057
    .line 1058
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1059
    .line 1060
    .line 1061
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->MRAID_BRIDGE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1062
    .line 1063
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1064
    .line 1065
    const/16 v2, 0x48

    .line 1066
    .line 1067
    const/16 v3, 0x133

    .line 1068
    .line 1069
    move-object/from16 v103, v0

    .line 1070
    .line 1071
    const-string v0, "AD_EXPIRED_ON_PLAY"

    .line 1072
    .line 1073
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1074
    .line 1075
    .line 1076
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_EXPIRED_ON_PLAY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1077
    .line 1078
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1079
    .line 1080
    const/16 v2, 0x49

    .line 1081
    .line 1082
    const/16 v3, 0x134

    .line 1083
    .line 1084
    move-object/from16 v104, v1

    .line 1085
    .line 1086
    const-string v1, "AD_WIN_NOTIFICATION_ERROR"

    .line 1087
    .line 1088
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1089
    .line 1090
    .line 1091
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_WIN_NOTIFICATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1092
    .line 1093
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1094
    .line 1095
    const/16 v2, 0x4a

    .line 1096
    .line 1097
    const/16 v3, 0x135

    .line 1098
    .line 1099
    move-object/from16 v105, v0

    .line 1100
    .line 1101
    const-string v0, "ASSET_FAILED_TO_DELETE"

    .line 1102
    .line 1103
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1104
    .line 1105
    .line 1106
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->ASSET_FAILED_TO_DELETE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1107
    .line 1108
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1109
    .line 1110
    const/16 v2, 0x4b

    .line 1111
    .line 1112
    const/16 v3, 0x136

    .line 1113
    .line 1114
    move-object/from16 v106, v1

    .line 1115
    .line 1116
    const-string v1, "AD_HTML_FAILED_TO_LOAD"

    .line 1117
    .line 1118
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1119
    .line 1120
    .line 1121
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_HTML_FAILED_TO_LOAD:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1122
    .line 1123
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1124
    .line 1125
    const/16 v2, 0x4c

    .line 1126
    .line 1127
    const/16 v3, 0x137

    .line 1128
    .line 1129
    move-object/from16 v107, v0

    .line 1130
    .line 1131
    const-string v0, "MRAID_JS_CALL_EMPTY"

    .line 1132
    .line 1133
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1134
    .line 1135
    .line 1136
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->MRAID_JS_CALL_EMPTY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1137
    .line 1138
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1139
    .line 1140
    const/16 v2, 0x4d

    .line 1141
    .line 1142
    const/16 v3, 0x138

    .line 1143
    .line 1144
    move-object/from16 v108, v1

    .line 1145
    .line 1146
    const-string v1, "DEEPLINK_OPEN_FAILED"

    .line 1147
    .line 1148
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1149
    .line 1150
    .line 1151
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->DEEPLINK_OPEN_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1152
    .line 1153
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1154
    .line 1155
    const/16 v2, 0x4e

    .line 1156
    .line 1157
    const/16 v3, 0x139

    .line 1158
    .line 1159
    move-object/from16 v109, v0

    .line 1160
    .line 1161
    const-string v0, "EVALUATE_JAVASCRIPT_FAILED"

    .line 1162
    .line 1163
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1164
    .line 1165
    .line 1166
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->EVALUATE_JAVASCRIPT_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1167
    .line 1168
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1169
    .line 1170
    const/16 v2, 0x4f

    .line 1171
    .line 1172
    const/16 v3, 0x13a

    .line 1173
    .line 1174
    move-object/from16 v110, v1

    .line 1175
    .line 1176
    const-string v1, "LINK_COMMAND_OPEN_FAILED"

    .line 1177
    .line 1178
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1179
    .line 1180
    .line 1181
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->LINK_COMMAND_OPEN_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1182
    .line 1183
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1184
    .line 1185
    const/16 v2, 0x50

    .line 1186
    .line 1187
    const/16 v3, 0x13b

    .line 1188
    .line 1189
    move-object/from16 v111, v0

    .line 1190
    .line 1191
    const-string v0, "JSON_PARAMS_ENCODE_ERROR"

    .line 1192
    .line 1193
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1194
    .line 1195
    .line 1196
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->JSON_PARAMS_ENCODE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1197
    .line 1198
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1199
    .line 1200
    const/16 v2, 0x51

    .line 1201
    .line 1202
    const/16 v3, 0x13c

    .line 1203
    .line 1204
    move-object/from16 v112, v1

    .line 1205
    .line 1206
    const-string v1, "GENERATE_JSON_DATA_ERROR"

    .line 1207
    .line 1208
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1209
    .line 1210
    .line 1211
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->GENERATE_JSON_DATA_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1212
    .line 1213
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1214
    .line 1215
    const/16 v2, 0x52

    .line 1216
    .line 1217
    const/16 v3, 0x13d

    .line 1218
    .line 1219
    move-object/from16 v113, v0

    .line 1220
    .line 1221
    const-string v0, "AD_CLOSED_TEMPLATE_ERROR"

    .line 1222
    .line 1223
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1224
    .line 1225
    .line 1226
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_CLOSED_TEMPLATE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1227
    .line 1228
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1229
    .line 1230
    const/16 v2, 0x53

    .line 1231
    .line 1232
    const/16 v3, 0x13e

    .line 1233
    .line 1234
    move-object/from16 v114, v1

    .line 1235
    .line 1236
    const-string v1, "AD_CLOSED_MISSING_HEARTBEAT"

    .line 1237
    .line 1238
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1239
    .line 1240
    .line 1241
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_CLOSED_MISSING_HEARTBEAT:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1242
    .line 1243
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1244
    .line 1245
    const/16 v2, 0x54

    .line 1246
    .line 1247
    const/16 v3, 0x13f

    .line 1248
    .line 1249
    move-object/from16 v115, v0

    .line 1250
    .line 1251
    const-string v0, "SILENT_MODE_MONITOR_ERROR"

    .line 1252
    .line 1253
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1254
    .line 1255
    .line 1256
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->SILENT_MODE_MONITOR_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1257
    .line 1258
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1259
    .line 1260
    const/16 v2, 0x55

    .line 1261
    .line 1262
    const/16 v3, 0x140

    .line 1263
    .line 1264
    move-object/from16 v116, v1

    .line 1265
    .line 1266
    const-string v1, "WEBVIEW_ERROR"

    .line 1267
    .line 1268
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1269
    .line 1270
    .line 1271
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->WEBVIEW_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1272
    .line 1273
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1274
    .line 1275
    const/16 v2, 0x56

    .line 1276
    .line 1277
    const/16 v3, 0x141

    .line 1278
    .line 1279
    move-object/from16 v117, v0

    .line 1280
    .line 1281
    const-string v0, "BLACK_SCREEN_DETECTION_ERROR"

    .line 1282
    .line 1283
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1284
    .line 1285
    .line 1286
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->BLACK_SCREEN_DETECTION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1287
    .line 1288
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1289
    .line 1290
    const/16 v2, 0x57

    .line 1291
    .line 1292
    const/16 v3, 0x142

    .line 1293
    .line 1294
    move-object/from16 v118, v1

    .line 1295
    .line 1296
    const-string v1, "MRAID_UNRECOGNIZED_COMMAND"

    .line 1297
    .line 1298
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1299
    .line 1300
    .line 1301
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->MRAID_UNRECOGNIZED_COMMAND:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1302
    .line 1303
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1304
    .line 1305
    const/16 v2, 0x58

    .line 1306
    .line 1307
    const/16 v3, 0x190

    .line 1308
    .line 1309
    move-object/from16 v119, v0

    .line 1310
    .line 1311
    const-string v0, "CONCURRENT_PLAYBACK_UNSUPPORTED"

    .line 1312
    .line 1313
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1314
    .line 1315
    .line 1316
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->CONCURRENT_PLAYBACK_UNSUPPORTED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1317
    .line 1318
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1319
    .line 1320
    const/16 v2, 0x59

    .line 1321
    .line 1322
    const/16 v3, 0x1f4

    .line 1323
    .line 1324
    move-object/from16 v120, v1

    .line 1325
    .line 1326
    const-string v1, "BANNER_VIEW_INVALID_SIZE"

    .line 1327
    .line 1328
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1329
    .line 1330
    .line 1331
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->BANNER_VIEW_INVALID_SIZE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1332
    .line 1333
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1334
    .line 1335
    const/16 v2, 0x5a

    .line 1336
    .line 1337
    const/16 v3, 0x258

    .line 1338
    .line 1339
    move-object/from16 v121, v0

    .line 1340
    .line 1341
    const-string v0, "NATIVE_ASSET_ERROR"

    .line 1342
    .line 1343
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1344
    .line 1345
    .line 1346
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->NATIVE_ASSET_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1347
    .line 1348
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1349
    .line 1350
    const/16 v2, 0x5b

    .line 1351
    .line 1352
    const/16 v3, 0x259

    .line 1353
    .line 1354
    move-object/from16 v122, v1

    .line 1355
    .line 1356
    const-string v1, "NATIVE_VIDEO_PLAYBACK_ERROR"

    .line 1357
    .line 1358
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1359
    .line 1360
    .line 1361
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->NATIVE_VIDEO_PLAYBACK_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1362
    .line 1363
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1364
    .line 1365
    const/16 v2, 0x5c

    .line 1366
    .line 1367
    const/16 v3, 0x7d0

    .line 1368
    .line 1369
    move-object/from16 v123, v0

    .line 1370
    .line 1371
    const-string v0, "WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE"

    .line 1372
    .line 1373
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1374
    .line 1375
    .line 1376
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1377
    .line 1378
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1379
    .line 1380
    const/16 v2, 0x5d

    .line 1381
    .line 1382
    const/16 v3, 0x7d1

    .line 1383
    .line 1384
    move-object/from16 v124, v1

    .line 1385
    .line 1386
    const-string v1, "WEB_VIEW_FAILED_NAVIGATION"

    .line 1387
    .line 1388
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1389
    .line 1390
    .line 1391
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->WEB_VIEW_FAILED_NAVIGATION:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1392
    .line 1393
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1394
    .line 1395
    const/16 v2, 0x5e

    .line 1396
    .line 1397
    const/16 v3, 0x7d2

    .line 1398
    .line 1399
    move-object/from16 v125, v0

    .line 1400
    .line 1401
    const-string v0, "STORE_KIT_LOAD_ERROR"

    .line 1402
    .line 1403
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1404
    .line 1405
    .line 1406
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->STORE_KIT_LOAD_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1407
    .line 1408
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1409
    .line 1410
    const/16 v2, 0x5f

    .line 1411
    .line 1412
    const/16 v3, 0x7d3

    .line 1413
    .line 1414
    move-object/from16 v126, v1

    .line 1415
    .line 1416
    const-string v1, "OMSDK_COPY_ERROR"

    .line 1417
    .line 1418
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1419
    .line 1420
    .line 1421
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->OMSDK_COPY_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1422
    .line 1423
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1424
    .line 1425
    const/16 v2, 0x60

    .line 1426
    .line 1427
    const/16 v3, 0x7d4

    .line 1428
    .line 1429
    move-object/from16 v127, v0

    .line 1430
    .line 1431
    const-string v0, "STORE_OVERLAY_LOAD_ERROR"

    .line 1432
    .line 1433
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1434
    .line 1435
    .line 1436
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->STORE_OVERLAY_LOAD_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1437
    .line 1438
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1439
    .line 1440
    const/16 v2, 0x61

    .line 1441
    .line 1442
    const/16 v3, 0x7d5

    .line 1443
    .line 1444
    move-object/from16 v128, v1

    .line 1445
    .line 1446
    const-string v1, "REACHABILITY_INITIALIZATION_FAILED"

    .line 1447
    .line 1448
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1449
    .line 1450
    .line 1451
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->REACHABILITY_INITIALIZATION_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1452
    .line 1453
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1454
    .line 1455
    const/16 v2, 0x62

    .line 1456
    .line 1457
    const/16 v3, 0x7d6

    .line 1458
    .line 1459
    move-object/from16 v129, v0

    .line 1460
    .line 1461
    const-string v0, "UNKNOWN_RADIO_ACCESS_TECHNOLOGY"

    .line 1462
    .line 1463
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1464
    .line 1465
    .line 1466
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->UNKNOWN_RADIO_ACCESS_TECHNOLOGY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1467
    .line 1468
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1469
    .line 1470
    const/16 v2, 0x63

    .line 1471
    .line 1472
    const/16 v3, 0x7d7

    .line 1473
    .line 1474
    move-object/from16 v130, v1

    .line 1475
    .line 1476
    const-string v1, "STORE_KIT_PRESENTATION_ERROR"

    .line 1477
    .line 1478
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1479
    .line 1480
    .line 1481
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->STORE_KIT_PRESENTATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1482
    .line 1483
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1484
    .line 1485
    const/16 v2, 0x64

    .line 1486
    .line 1487
    const/16 v3, 0x7d8

    .line 1488
    .line 1489
    move-object/from16 v131, v0

    .line 1490
    .line 1491
    const-string v0, "STORE_OVERLAY_PRESENTATION_ERROR"

    .line 1492
    .line 1493
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1494
    .line 1495
    .line 1496
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->STORE_OVERLAY_PRESENTATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1497
    .line 1498
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1499
    .line 1500
    const-string v2, "INVALID_PLAY_PARAMETER"

    .line 1501
    .line 1502
    const/16 v3, 0x7d9

    .line 1503
    .line 1504
    move-object/from16 v132, v1

    .line 1505
    .line 1506
    const/16 v1, 0x65

    .line 1507
    .line 1508
    invoke-direct {v0, v2, v1, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1509
    .line 1510
    .line 1511
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_PLAY_PARAMETER:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1512
    .line 1513
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1514
    .line 1515
    const-string v2, "STORE_OVERLAY_DISMISSAL_ERROR"

    .line 1516
    .line 1517
    const/16 v3, 0x7da

    .line 1518
    .line 1519
    move-object/from16 v133, v0

    .line 1520
    .line 1521
    const/16 v0, 0x66

    .line 1522
    .line 1523
    invoke-direct {v1, v2, v0, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1524
    .line 1525
    .line 1526
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->STORE_OVERLAY_DISMISSAL_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1527
    .line 1528
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1529
    .line 1530
    const-string v2, "PRESENTER_DEALLOCATED_BEFORE_LOAD_COMPLETION"

    .line 1531
    .line 1532
    const/16 v3, 0x7db

    .line 1533
    .line 1534
    move-object/from16 v134, v1

    .line 1535
    .line 1536
    const/16 v1, 0x67

    .line 1537
    .line 1538
    invoke-direct {v0, v2, v1, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1539
    .line 1540
    .line 1541
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->PRESENTER_DEALLOCATED_BEFORE_LOAD_COMPLETION:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1542
    .line 1543
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1544
    .line 1545
    const-string v2, "APP_IMPRESSION_CREATION_FAILED"

    .line 1546
    .line 1547
    const/16 v3, 0x7dc

    .line 1548
    .line 1549
    move-object/from16 v135, v0

    .line 1550
    .line 1551
    const/16 v0, 0x68

    .line 1552
    .line 1553
    invoke-direct {v1, v2, v0, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1554
    .line 1555
    .line 1556
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->APP_IMPRESSION_CREATION_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1557
    .line 1558
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1559
    .line 1560
    const-string v2, "HANDLE_TAP_FAILED"

    .line 1561
    .line 1562
    const/16 v3, 0x7dd

    .line 1563
    .line 1564
    move-object/from16 v136, v1

    .line 1565
    .line 1566
    const/16 v1, 0x69

    .line 1567
    .line 1568
    invoke-direct {v0, v2, v1, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1569
    .line 1570
    .line 1571
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->HANDLE_TAP_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1572
    .line 1573
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1574
    .line 1575
    const-string v2, "HAPTIC_ENGINE_ERROR"

    .line 1576
    .line 1577
    const/16 v3, 0x7de

    .line 1578
    .line 1579
    move-object/from16 v137, v0

    .line 1580
    .line 1581
    const/16 v0, 0x6a

    .line 1582
    .line 1583
    invoke-direct {v1, v2, v0, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1584
    .line 1585
    .line 1586
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->HAPTIC_ENGINE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1587
    .line 1588
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1589
    .line 1590
    const/16 v2, 0x6b

    .line 1591
    .line 1592
    const/16 v3, 0xbb9

    .line 1593
    .line 1594
    move-object/from16 v138, v1

    .line 1595
    .line 1596
    const-string v1, "OUT_OF_MEMORY"

    .line 1597
    .line 1598
    invoke-direct {v0, v1, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1599
    .line 1600
    .line 1601
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->OUT_OF_MEMORY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1602
    .line 1603
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1604
    .line 1605
    const/16 v2, 0x6c

    .line 1606
    .line 1607
    const/16 v3, 0xbba

    .line 1608
    .line 1609
    move-object/from16 v139, v0

    .line 1610
    .line 1611
    const-string v0, "INLINE_INSTALL_ERROR"

    .line 1612
    .line 1613
    invoke-direct {v1, v0, v2, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1614
    .line 1615
    .line 1616
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INLINE_INSTALL_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1617
    .line 1618
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1619
    .line 1620
    const-string v2, "VUNGLE_OIT_CREATION_ERROR"

    .line 1621
    .line 1622
    const/16 v3, 0xfa0

    .line 1623
    .line 1624
    move-object/from16 v140, v1

    .line 1625
    .line 1626
    const/16 v1, 0x6d

    .line 1627
    .line 1628
    invoke-direct {v0, v2, v1, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1629
    .line 1630
    .line 1631
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->VUNGLE_OIT_CREATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1632
    .line 1633
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1634
    .line 1635
    const-string v2, "MEDIATION_ERROR"

    .line 1636
    .line 1637
    const/16 v3, 0x1388

    .line 1638
    .line 1639
    move-object/from16 v141, v0

    .line 1640
    .line 1641
    const/16 v0, 0x6e

    .line 1642
    .line 1643
    invoke-direct {v1, v2, v0, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1644
    .line 1645
    .line 1646
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->MEDIATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1647
    .line 1648
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1649
    .line 1650
    const-string v2, "AD_NO_FILL"

    .line 1651
    .line 1652
    const/16 v3, 0x2711

    .line 1653
    .line 1654
    move-object/from16 v142, v1

    .line 1655
    .line 1656
    const/16 v1, 0x6f

    .line 1657
    .line 1658
    invoke-direct {v0, v2, v1, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1659
    .line 1660
    .line 1661
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_NO_FILL:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1662
    .line 1663
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1664
    .line 1665
    const-string v2, "AD_LOAD_TOO_FREQUENTLY"

    .line 1666
    .line 1667
    const/16 v3, 0x2712

    .line 1668
    .line 1669
    move-object/from16 v40, v0

    .line 1670
    .line 1671
    const/16 v0, 0x70

    .line 1672
    .line 1673
    invoke-direct {v1, v2, v0, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1674
    .line 1675
    .line 1676
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_LOAD_TOO_FREQUENTLY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1677
    .line 1678
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1679
    .line 1680
    const-string v2, "AD_SERVER_ERROR"

    .line 1681
    .line 1682
    const/16 v3, 0x4e21

    .line 1683
    .line 1684
    move-object/from16 v42, v1

    .line 1685
    .line 1686
    const/16 v1, 0x71

    .line 1687
    .line 1688
    invoke-direct {v0, v2, v1, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1689
    .line 1690
    .line 1691
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_SERVER_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1692
    .line 1693
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1694
    .line 1695
    const-string v2, "AD_PUBLISHER_MISMATCH"

    .line 1696
    .line 1697
    const/16 v3, 0x7531

    .line 1698
    .line 1699
    move-object/from16 v44, v0

    .line 1700
    .line 1701
    const/16 v0, 0x72

    .line 1702
    .line 1703
    invoke-direct {v1, v2, v0, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1704
    .line 1705
    .line 1706
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_PUBLISHER_MISMATCH:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1707
    .line 1708
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1709
    .line 1710
    const-string v2, "AD_INTERNAL_INTEGRATION_ERROR"

    .line 1711
    .line 1712
    const/16 v3, 0x7532

    .line 1713
    .line 1714
    move-object/from16 v46, v1

    .line 1715
    .line 1716
    const/16 v1, 0x73

    .line 1717
    .line 1718
    invoke-direct {v0, v2, v1, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1719
    .line 1720
    .line 1721
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_INTERNAL_INTEGRATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1722
    .line 1723
    new-instance v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1724
    .line 1725
    const-string v2, "CONFIG_NOT_FOUND_ERROR"

    .line 1726
    .line 1727
    const/16 v3, 0x7533

    .line 1728
    .line 1729
    move-object/from16 v48, v0

    .line 1730
    .line 1731
    const/16 v0, 0x74

    .line 1732
    .line 1733
    invoke-direct {v1, v2, v0, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1734
    .line 1735
    .line 1736
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->CONFIG_NOT_FOUND_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1737
    .line 1738
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1739
    .line 1740
    const-string v2, "UNRECOGNIZED"

    .line 1741
    .line 1742
    const/4 v3, -0x1

    .line 1743
    move-object/from16 v50, v1

    .line 1744
    .line 1745
    const/16 v1, 0x75

    .line 1746
    .line 1747
    invoke-direct {v0, v2, v1, v3}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;-><init>(Ljava/lang/String;II)V

    .line 1748
    .line 1749
    .line 1750
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->UNRECOGNIZED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1751
    .line 1752
    const/16 v1, 0x76

    .line 1753
    .line 1754
    new-array v1, v1, [Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 1755
    .line 1756
    aput-object v36, v1, v16

    .line 1757
    .line 1758
    aput-object v39, v1, v17

    .line 1759
    .line 1760
    aput-object v41, v1, v18

    .line 1761
    .line 1762
    aput-object v6, v1, v19

    .line 1763
    .line 1764
    aput-object v8, v1, v20

    .line 1765
    .line 1766
    aput-object v10, v1, v23

    .line 1767
    .line 1768
    aput-object v12, v1, v21

    .line 1769
    .line 1770
    aput-object v15, v1, v24

    .line 1771
    .line 1772
    aput-object v4, v1, v22

    .line 1773
    .line 1774
    aput-object v7, v1, v25

    .line 1775
    .line 1776
    aput-object v9, v1, v28

    .line 1777
    .line 1778
    aput-object v13, v1, v31

    .line 1779
    .line 1780
    aput-object v14, v1, v34

    .line 1781
    .line 1782
    aput-object v11, v1, v37

    .line 1783
    .line 1784
    const/16 v2, 0xe

    .line 1785
    .line 1786
    aput-object v5, v1, v2

    .line 1787
    .line 1788
    const/16 v2, 0xf

    .line 1789
    .line 1790
    aput-object v43, v1, v2

    .line 1791
    .line 1792
    const/16 v2, 0x10

    .line 1793
    .line 1794
    aput-object v45, v1, v2

    .line 1795
    .line 1796
    const/16 v2, 0x11

    .line 1797
    .line 1798
    aput-object v47, v1, v2

    .line 1799
    .line 1800
    const/16 v2, 0x12

    .line 1801
    .line 1802
    aput-object v49, v1, v2

    .line 1803
    .line 1804
    const/16 v2, 0x13

    .line 1805
    .line 1806
    aput-object v51, v1, v2

    .line 1807
    .line 1808
    const/16 v2, 0x14

    .line 1809
    .line 1810
    aput-object v52, v1, v2

    .line 1811
    .line 1812
    const/16 v2, 0x15

    .line 1813
    .line 1814
    aput-object v53, v1, v2

    .line 1815
    .line 1816
    const/16 v2, 0x16

    .line 1817
    .line 1818
    aput-object v54, v1, v2

    .line 1819
    .line 1820
    const/16 v2, 0x17

    .line 1821
    .line 1822
    aput-object v55, v1, v2

    .line 1823
    .line 1824
    const/16 v2, 0x18

    .line 1825
    .line 1826
    aput-object v56, v1, v2

    .line 1827
    .line 1828
    const/16 v2, 0x19

    .line 1829
    .line 1830
    aput-object v57, v1, v2

    .line 1831
    .line 1832
    const/16 v2, 0x1a

    .line 1833
    .line 1834
    aput-object v58, v1, v2

    .line 1835
    .line 1836
    const/16 v2, 0x1b

    .line 1837
    .line 1838
    aput-object v59, v1, v2

    .line 1839
    .line 1840
    const/16 v2, 0x1c

    .line 1841
    .line 1842
    aput-object v60, v1, v2

    .line 1843
    .line 1844
    const/16 v2, 0x1d

    .line 1845
    .line 1846
    aput-object v61, v1, v2

    .line 1847
    .line 1848
    const/16 v2, 0x1e

    .line 1849
    .line 1850
    aput-object v62, v1, v2

    .line 1851
    .line 1852
    const/16 v2, 0x1f

    .line 1853
    .line 1854
    aput-object v63, v1, v2

    .line 1855
    .line 1856
    const/16 v2, 0x20

    .line 1857
    .line 1858
    aput-object v64, v1, v2

    .line 1859
    .line 1860
    const/16 v2, 0x21

    .line 1861
    .line 1862
    aput-object v65, v1, v2

    .line 1863
    .line 1864
    const/16 v2, 0x22

    .line 1865
    .line 1866
    aput-object v66, v1, v2

    .line 1867
    .line 1868
    const/16 v2, 0x23

    .line 1869
    .line 1870
    aput-object v67, v1, v2

    .line 1871
    .line 1872
    const/16 v2, 0x24

    .line 1873
    .line 1874
    aput-object v68, v1, v2

    .line 1875
    .line 1876
    const/16 v2, 0x25

    .line 1877
    .line 1878
    aput-object v69, v1, v2

    .line 1879
    .line 1880
    const/16 v2, 0x26

    .line 1881
    .line 1882
    aput-object v70, v1, v2

    .line 1883
    .line 1884
    const/16 v2, 0x27

    .line 1885
    .line 1886
    aput-object v71, v1, v2

    .line 1887
    .line 1888
    const/16 v2, 0x28

    .line 1889
    .line 1890
    aput-object v72, v1, v2

    .line 1891
    .line 1892
    const/16 v2, 0x29

    .line 1893
    .line 1894
    aput-object v73, v1, v2

    .line 1895
    .line 1896
    const/16 v2, 0x2a

    .line 1897
    .line 1898
    aput-object v74, v1, v2

    .line 1899
    .line 1900
    const/16 v2, 0x2b

    .line 1901
    .line 1902
    aput-object v75, v1, v2

    .line 1903
    .line 1904
    const/16 v2, 0x2c

    .line 1905
    .line 1906
    aput-object v76, v1, v2

    .line 1907
    .line 1908
    const/16 v2, 0x2d

    .line 1909
    .line 1910
    aput-object v77, v1, v2

    .line 1911
    .line 1912
    const/16 v2, 0x2e

    .line 1913
    .line 1914
    aput-object v78, v1, v2

    .line 1915
    .line 1916
    const/16 v2, 0x2f

    .line 1917
    .line 1918
    aput-object v79, v1, v2

    .line 1919
    .line 1920
    const/16 v2, 0x30

    .line 1921
    .line 1922
    aput-object v80, v1, v2

    .line 1923
    .line 1924
    const/16 v2, 0x31

    .line 1925
    .line 1926
    aput-object v81, v1, v2

    .line 1927
    .line 1928
    const/16 v2, 0x32

    .line 1929
    .line 1930
    aput-object v82, v1, v2

    .line 1931
    .line 1932
    const/16 v2, 0x33

    .line 1933
    .line 1934
    aput-object v83, v1, v2

    .line 1935
    .line 1936
    const/16 v2, 0x34

    .line 1937
    .line 1938
    aput-object v84, v1, v2

    .line 1939
    .line 1940
    const/16 v2, 0x35

    .line 1941
    .line 1942
    aput-object v85, v1, v2

    .line 1943
    .line 1944
    const/16 v2, 0x36

    .line 1945
    .line 1946
    aput-object v86, v1, v2

    .line 1947
    .line 1948
    const/16 v2, 0x37

    .line 1949
    .line 1950
    aput-object v87, v1, v2

    .line 1951
    .line 1952
    const/16 v2, 0x38

    .line 1953
    .line 1954
    aput-object v88, v1, v2

    .line 1955
    .line 1956
    const/16 v2, 0x39

    .line 1957
    .line 1958
    aput-object v89, v1, v2

    .line 1959
    .line 1960
    const/16 v2, 0x3a

    .line 1961
    .line 1962
    aput-object v90, v1, v2

    .line 1963
    .line 1964
    const/16 v2, 0x3b

    .line 1965
    .line 1966
    aput-object v91, v1, v2

    .line 1967
    .line 1968
    const/16 v2, 0x3c

    .line 1969
    .line 1970
    aput-object v92, v1, v2

    .line 1971
    .line 1972
    const/16 v2, 0x3d

    .line 1973
    .line 1974
    aput-object v93, v1, v2

    .line 1975
    .line 1976
    const/16 v2, 0x3e

    .line 1977
    .line 1978
    aput-object v94, v1, v2

    .line 1979
    .line 1980
    const/16 v2, 0x3f

    .line 1981
    .line 1982
    aput-object v95, v1, v2

    .line 1983
    .line 1984
    const/16 v2, 0x40

    .line 1985
    .line 1986
    aput-object v96, v1, v2

    .line 1987
    .line 1988
    const/16 v2, 0x41

    .line 1989
    .line 1990
    aput-object v97, v1, v2

    .line 1991
    .line 1992
    const/16 v2, 0x42

    .line 1993
    .line 1994
    aput-object v98, v1, v2

    .line 1995
    .line 1996
    const/16 v2, 0x43

    .line 1997
    .line 1998
    aput-object v99, v1, v2

    .line 1999
    .line 2000
    const/16 v2, 0x44

    .line 2001
    .line 2002
    aput-object v100, v1, v2

    .line 2003
    .line 2004
    const/16 v2, 0x45

    .line 2005
    .line 2006
    aput-object v101, v1, v2

    .line 2007
    .line 2008
    const/16 v2, 0x46

    .line 2009
    .line 2010
    aput-object v102, v1, v2

    .line 2011
    .line 2012
    const/16 v2, 0x47

    .line 2013
    .line 2014
    aput-object v103, v1, v2

    .line 2015
    .line 2016
    const/16 v2, 0x48

    .line 2017
    .line 2018
    aput-object v104, v1, v2

    .line 2019
    .line 2020
    const/16 v2, 0x49

    .line 2021
    .line 2022
    aput-object v105, v1, v2

    .line 2023
    .line 2024
    const/16 v2, 0x4a

    .line 2025
    .line 2026
    aput-object v106, v1, v2

    .line 2027
    .line 2028
    const/16 v2, 0x4b

    .line 2029
    .line 2030
    aput-object v107, v1, v2

    .line 2031
    .line 2032
    const/16 v2, 0x4c

    .line 2033
    .line 2034
    aput-object v108, v1, v2

    .line 2035
    .line 2036
    const/16 v2, 0x4d

    .line 2037
    .line 2038
    aput-object v109, v1, v2

    .line 2039
    .line 2040
    const/16 v2, 0x4e

    .line 2041
    .line 2042
    aput-object v110, v1, v2

    .line 2043
    .line 2044
    const/16 v2, 0x4f

    .line 2045
    .line 2046
    aput-object v111, v1, v2

    .line 2047
    .line 2048
    const/16 v2, 0x50

    .line 2049
    .line 2050
    aput-object v112, v1, v2

    .line 2051
    .line 2052
    const/16 v2, 0x51

    .line 2053
    .line 2054
    aput-object v113, v1, v2

    .line 2055
    .line 2056
    const/16 v2, 0x52

    .line 2057
    .line 2058
    aput-object v114, v1, v2

    .line 2059
    .line 2060
    const/16 v2, 0x53

    .line 2061
    .line 2062
    aput-object v115, v1, v2

    .line 2063
    .line 2064
    const/16 v2, 0x54

    .line 2065
    .line 2066
    aput-object v116, v1, v2

    .line 2067
    .line 2068
    const/16 v2, 0x55

    .line 2069
    .line 2070
    aput-object v117, v1, v2

    .line 2071
    .line 2072
    const/16 v2, 0x56

    .line 2073
    .line 2074
    aput-object v118, v1, v2

    .line 2075
    .line 2076
    const/16 v2, 0x57

    .line 2077
    .line 2078
    aput-object v119, v1, v2

    .line 2079
    .line 2080
    const/16 v2, 0x58

    .line 2081
    .line 2082
    aput-object v120, v1, v2

    .line 2083
    .line 2084
    const/16 v2, 0x59

    .line 2085
    .line 2086
    aput-object v121, v1, v2

    .line 2087
    .line 2088
    const/16 v2, 0x5a

    .line 2089
    .line 2090
    aput-object v122, v1, v2

    .line 2091
    .line 2092
    const/16 v2, 0x5b

    .line 2093
    .line 2094
    aput-object v123, v1, v2

    .line 2095
    .line 2096
    const/16 v2, 0x5c

    .line 2097
    .line 2098
    aput-object v124, v1, v2

    .line 2099
    .line 2100
    const/16 v2, 0x5d

    .line 2101
    .line 2102
    aput-object v125, v1, v2

    .line 2103
    .line 2104
    const/16 v2, 0x5e

    .line 2105
    .line 2106
    aput-object v126, v1, v2

    .line 2107
    .line 2108
    const/16 v2, 0x5f

    .line 2109
    .line 2110
    aput-object v127, v1, v2

    .line 2111
    .line 2112
    const/16 v2, 0x60

    .line 2113
    .line 2114
    aput-object v128, v1, v2

    .line 2115
    .line 2116
    const/16 v2, 0x61

    .line 2117
    .line 2118
    aput-object v129, v1, v2

    .line 2119
    .line 2120
    const/16 v2, 0x62

    .line 2121
    .line 2122
    aput-object v130, v1, v2

    .line 2123
    .line 2124
    const/16 v2, 0x63

    .line 2125
    .line 2126
    aput-object v131, v1, v2

    .line 2127
    .line 2128
    const/16 v2, 0x64

    .line 2129
    .line 2130
    aput-object v132, v1, v2

    .line 2131
    .line 2132
    const/16 v33, 0x65

    .line 2133
    .line 2134
    aput-object v133, v1, v33

    .line 2135
    .line 2136
    const/16 v30, 0x66

    .line 2137
    .line 2138
    aput-object v134, v1, v30

    .line 2139
    .line 2140
    const/16 v27, 0x67

    .line 2141
    .line 2142
    aput-object v135, v1, v27

    .line 2143
    .line 2144
    const/16 v26, 0x68

    .line 2145
    .line 2146
    aput-object v136, v1, v26

    .line 2147
    .line 2148
    const/16 v29, 0x69

    .line 2149
    .line 2150
    aput-object v137, v1, v29

    .line 2151
    .line 2152
    const/16 v32, 0x6a

    .line 2153
    .line 2154
    aput-object v138, v1, v32

    .line 2155
    .line 2156
    const/16 v2, 0x6b

    .line 2157
    .line 2158
    aput-object v139, v1, v2

    .line 2159
    .line 2160
    const/16 v2, 0x6c

    .line 2161
    .line 2162
    aput-object v140, v1, v2

    .line 2163
    .line 2164
    const/16 v35, 0x6d

    .line 2165
    .line 2166
    aput-object v141, v1, v35

    .line 2167
    .line 2168
    const/16 v38, 0x6e

    .line 2169
    .line 2170
    aput-object v142, v1, v38

    .line 2171
    .line 2172
    const/16 v2, 0x6f

    .line 2173
    .line 2174
    aput-object v40, v1, v2

    .line 2175
    .line 2176
    const/16 v2, 0x70

    .line 2177
    .line 2178
    aput-object v42, v1, v2

    .line 2179
    .line 2180
    const/16 v2, 0x71

    .line 2181
    .line 2182
    aput-object v44, v1, v2

    .line 2183
    .line 2184
    const/16 v2, 0x72

    .line 2185
    .line 2186
    aput-object v46, v1, v2

    .line 2187
    .line 2188
    const/16 v2, 0x73

    .line 2189
    .line 2190
    aput-object v48, v1, v2

    .line 2191
    .line 2192
    const/16 v2, 0x74

    .line 2193
    .line 2194
    aput-object v50, v1, v2

    .line 2195
    .line 2196
    const/16 v2, 0x75

    .line 2197
    .line 2198
    aput-object v0, v1, v2

    .line 2199
    .line 2200
    sput-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->$VALUES:[Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 2201
    .line 2202
    new-instance v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason$1;

    .line 2203
    .line 2204
    invoke-direct {v0}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason$1;-><init>()V

    .line 2205
    .line 2206
    .line 2207
    sput-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    .line 2208
    .line 2209
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->value:I

    .line 5
    .line 6
    return-void
.end method

.method public static forNumber(I)Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eq p0, v0, :cond_14

    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    if-eq p0, v0, :cond_13

    .line 6
    .line 7
    const/4 v0, 0x4

    .line 8
    if-eq p0, v0, :cond_12

    .line 9
    .line 10
    const/4 v0, 0x6

    .line 11
    if-eq p0, v0, :cond_11

    .line 12
    .line 13
    const/4 v0, 0x7

    .line 14
    if-eq p0, v0, :cond_10

    .line 15
    .line 16
    const/16 v0, 0x12d

    .line 17
    .line 18
    if-eq p0, v0, :cond_f

    .line 19
    .line 20
    const/16 v0, 0x12e

    .line 21
    .line 22
    if-eq p0, v0, :cond_e

    .line 23
    .line 24
    const/16 v0, 0x130

    .line 25
    .line 26
    if-eq p0, v0, :cond_d

    .line 27
    .line 28
    const/16 v0, 0x131

    .line 29
    .line 30
    if-eq p0, v0, :cond_c

    .line 31
    .line 32
    if-eqz p0, :cond_b

    .line 33
    .line 34
    const/16 v0, 0x190

    .line 35
    .line 36
    if-eq p0, v0, :cond_a

    .line 37
    .line 38
    const/16 v0, 0x1f4

    .line 39
    .line 40
    if-eq p0, v0, :cond_9

    .line 41
    .line 42
    const/16 v0, 0xfa0

    .line 43
    .line 44
    if-eq p0, v0, :cond_8

    .line 45
    .line 46
    const/16 v0, 0x1388

    .line 47
    .line 48
    if-eq p0, v0, :cond_7

    .line 49
    .line 50
    const/16 v0, 0x4e21

    .line 51
    .line 52
    if-eq p0, v0, :cond_6

    .line 53
    .line 54
    const/16 v0, 0x258

    .line 55
    .line 56
    if-eq p0, v0, :cond_5

    .line 57
    .line 58
    const/16 v0, 0x259

    .line 59
    .line 60
    if-eq p0, v0, :cond_4

    .line 61
    .line 62
    const/16 v0, 0xbb9

    .line 63
    .line 64
    if-eq p0, v0, :cond_3

    .line 65
    .line 66
    const/16 v0, 0xbba

    .line 67
    .line 68
    if-eq p0, v0, :cond_2

    .line 69
    .line 70
    const/16 v0, 0x2711

    .line 71
    .line 72
    if-eq p0, v0, :cond_1

    .line 73
    .line 74
    const/16 v0, 0x2712

    .line 75
    .line 76
    if-eq p0, v0, :cond_0

    .line 77
    .line 78
    packed-switch p0, :pswitch_data_0

    .line 79
    .line 80
    .line 81
    packed-switch p0, :pswitch_data_1

    .line 82
    .line 83
    .line 84
    packed-switch p0, :pswitch_data_2

    .line 85
    .line 86
    .line 87
    packed-switch p0, :pswitch_data_3

    .line 88
    .line 89
    .line 90
    packed-switch p0, :pswitch_data_4

    .line 91
    .line 92
    .line 93
    packed-switch p0, :pswitch_data_5

    .line 94
    .line 95
    .line 96
    packed-switch p0, :pswitch_data_6

    .line 97
    .line 98
    .line 99
    packed-switch p0, :pswitch_data_7

    .line 100
    .line 101
    .line 102
    const/4 p0, 0x0

    .line 103
    return-object p0

    .line 104
    :pswitch_0
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->MRAID_UNRECOGNIZED_COMMAND:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_1
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->BLACK_SCREEN_DETECTION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_2
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->WEBVIEW_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_3
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->SILENT_MODE_MONITOR_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 114
    .line 115
    return-object p0

    .line 116
    :pswitch_4
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_CLOSED_MISSING_HEARTBEAT:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_5
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_CLOSED_TEMPLATE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_6
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->GENERATE_JSON_DATA_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 123
    .line 124
    return-object p0

    .line 125
    :pswitch_7
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->JSON_PARAMS_ENCODE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 126
    .line 127
    return-object p0

    .line 128
    :pswitch_8
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->LINK_COMMAND_OPEN_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_9
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->EVALUATE_JAVASCRIPT_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 132
    .line 133
    return-object p0

    .line 134
    :pswitch_a
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->DEEPLINK_OPEN_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_b
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->MRAID_JS_CALL_EMPTY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_c
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_HTML_FAILED_TO_LOAD:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 141
    .line 142
    return-object p0

    .line 143
    :pswitch_d
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->ASSET_FAILED_TO_DELETE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 144
    .line 145
    return-object p0

    .line 146
    :pswitch_e
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_WIN_NOTIFICATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_f
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_EXPIRED_ON_PLAY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 150
    .line 151
    return-object p0

    .line 152
    :pswitch_10
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_CSB_DATA:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_11
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->PRIVACY_ICON_FALLBACK_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 156
    .line 157
    return-object p0

    .line 158
    :pswitch_12
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_13
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_LOAD_FAIL_EMPTY_BID_PAYLOAD:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 162
    .line 163
    return-object p0

    .line 164
    :pswitch_14
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->STALE_CACHED_RESPONSE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_15
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_WATERFALL_PLACEMENT_ID:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 168
    .line 169
    return-object p0

    .line 170
    :pswitch_16
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_LOAD_FAIL_RETRY_AFTER:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 171
    .line 172
    return-object p0

    .line 173
    :pswitch_17
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_RESPONSE_RETRY_AFTER:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 174
    .line 175
    return-object p0

    .line 176
    :pswitch_18
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->MRAID_JS_COPY_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 177
    .line 178
    return-object p0

    .line 179
    :pswitch_19
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->MRAID_JS_DOES_NOT_EXIST:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 180
    .line 181
    return-object p0

    .line 182
    :pswitch_1a
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_RESPONSE_TIMED_OUT:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 183
    .line 184
    return-object p0

    .line 185
    :pswitch_1b
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_RESPONSE_INVALID_TEMPLATE_TYPE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 186
    .line 187
    return-object p0

    .line 188
    :pswitch_1c
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_RESPONSE_EMPTY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_1d
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_GZIP_BID_PAYLOAD:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 192
    .line 193
    return-object p0

    .line 194
    :pswitch_1e
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_ADUNIT_BID_PAYLOAD:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 195
    .line 196
    return-object p0

    .line 197
    :pswitch_1f
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->PLACEMENT_SLEEP:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_20
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_NOT_LOADED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 201
    .line 202
    return-object p0

    .line 203
    :pswitch_21
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_JSON_BID_PAYLOAD:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 204
    .line 205
    return-object p0

    .line 206
    :pswitch_22
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_BID_PAYLOAD:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_23
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->PLACEMENT_AD_TYPE_MISMATCH:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 210
    .line 211
    return-object p0

    .line 212
    :pswitch_24
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_ALREADY_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 213
    .line 214
    return-object p0

    .line 215
    :pswitch_25
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_IS_PLAYING:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 216
    .line 217
    return-object p0

    .line 218
    :pswitch_26
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_ALREADY_LOADED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 219
    .line 220
    return-object p0

    .line 221
    :pswitch_27
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_IS_LOADING:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 222
    .line 223
    return-object p0

    .line 224
    :pswitch_28
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_CONSUMED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 225
    .line 226
    return-object p0

    .line 227
    :pswitch_29
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_PLACEMENT_ID:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 228
    .line 229
    return-object p0

    .line 230
    :pswitch_2a
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_EVENT_ID_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 231
    .line 232
    return-object p0

    .line 233
    :pswitch_2b
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->JSON_ENCODE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 234
    .line 235
    return-object p0

    .line 236
    :pswitch_2c
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->PROTOBUF_SERIALIZATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 237
    .line 238
    return-object p0

    .line 239
    :pswitch_2d
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->ASSET_FAILED_STATUS_CODE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 240
    .line 241
    return-object p0

    .line 242
    :pswitch_2e
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->GZIP_ENCODE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 243
    .line 244
    return-object p0

    .line 245
    :pswitch_2f
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_INDEX_URL:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 246
    .line 247
    return-object p0

    .line 248
    :pswitch_30
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->ASSET_WRITE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 249
    .line 250
    return-object p0

    .line 251
    :pswitch_31
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->ASSET_RESPONSE_DATA_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 252
    .line 253
    return-object p0

    .line 254
    :pswitch_32
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->ASSET_REQUEST_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 255
    .line 256
    return-object p0

    .line 257
    :pswitch_33
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_ASSET_URL:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 258
    .line 259
    return-object p0

    .line 260
    :pswitch_34
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_CTA_URL:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 261
    .line 262
    return-object p0

    .line 263
    :pswitch_35
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->TEMPLATE_UNZIP_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 264
    .line 265
    return-object p0

    .line 266
    :pswitch_36
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_REQUEST_BUILDER_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 267
    .line 268
    return-object p0

    .line 269
    :pswitch_37
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_TEMPLATE_URL:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 270
    .line 271
    return-object p0

    .line 272
    :pswitch_38
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->API_FAILED_STATUS_CODE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 273
    .line 274
    return-object p0

    .line 275
    :pswitch_39
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->API_RESPONSE_DECODE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 276
    .line 277
    return-object p0

    .line 278
    :pswitch_3a
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->API_RESPONSE_DATA_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 279
    .line 280
    return-object p0

    .line 281
    :pswitch_3b
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->API_REQUEST_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 282
    .line 283
    return-object p0

    .line 284
    :pswitch_3c
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->CONFIG_NOT_FOUND_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 285
    .line 286
    return-object p0

    .line 287
    :pswitch_3d
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_INTERNAL_INTEGRATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 288
    .line 289
    return-object p0

    .line 290
    :pswitch_3e
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_PUBLISHER_MISMATCH:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 291
    .line 292
    return-object p0

    .line 293
    :pswitch_3f
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->HAPTIC_ENGINE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 294
    .line 295
    return-object p0

    .line 296
    :pswitch_40
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->HANDLE_TAP_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 297
    .line 298
    return-object p0

    .line 299
    :pswitch_41
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->APP_IMPRESSION_CREATION_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 300
    .line 301
    return-object p0

    .line 302
    :pswitch_42
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->PRESENTER_DEALLOCATED_BEFORE_LOAD_COMPLETION:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 303
    .line 304
    return-object p0

    .line 305
    :pswitch_43
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->STORE_OVERLAY_DISMISSAL_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 306
    .line 307
    return-object p0

    .line 308
    :pswitch_44
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_PLAY_PARAMETER:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 309
    .line 310
    return-object p0

    .line 311
    :pswitch_45
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->STORE_OVERLAY_PRESENTATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 312
    .line 313
    return-object p0

    .line 314
    :pswitch_46
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->STORE_KIT_PRESENTATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 315
    .line 316
    return-object p0

    .line 317
    :pswitch_47
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->UNKNOWN_RADIO_ACCESS_TECHNOLOGY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 318
    .line 319
    return-object p0

    .line 320
    :pswitch_48
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->REACHABILITY_INITIALIZATION_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 321
    .line 322
    return-object p0

    .line 323
    :pswitch_49
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->STORE_OVERLAY_LOAD_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 324
    .line 325
    return-object p0

    .line 326
    :pswitch_4a
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->OMSDK_COPY_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 327
    .line 328
    return-object p0

    .line 329
    :pswitch_4b
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->STORE_KIT_LOAD_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 330
    .line 331
    return-object p0

    .line 332
    :pswitch_4c
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->WEB_VIEW_FAILED_NAVIGATION:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 333
    .line 334
    return-object p0

    .line 335
    :pswitch_4d
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 336
    .line 337
    return-object p0

    .line 338
    :pswitch_4e
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->CONFIG_REFRESH_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 339
    .line 340
    return-object p0

    .line 341
    :pswitch_4f
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->TPAT_RETRY_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 342
    .line 343
    return-object p0

    .line 344
    :pswitch_50
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->PRIVACY_URL_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 345
    .line 346
    return-object p0

    .line 347
    :pswitch_51
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_CONFIG_RESPONSE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 348
    .line 349
    return-object p0

    .line 350
    :pswitch_52
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->STORE_REGION_CODE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 351
    .line 352
    return-object p0

    .line 353
    :pswitch_53
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->OMSDK_JS_WRITE_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 354
    .line 355
    return-object p0

    .line 356
    :pswitch_54
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->OMSDK_DOWNLOAD_JS_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 357
    .line 358
    return-object p0

    .line 359
    :pswitch_55
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->MRAID_JS_WRITE_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 360
    .line 361
    return-object p0

    .line 362
    :pswitch_56
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->MRAID_DOWNLOAD_JS_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 363
    .line 364
    return-object p0

    .line 365
    :pswitch_57
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->EMPTY_TPAT_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 366
    .line 367
    return-object p0

    .line 368
    :pswitch_58
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_TPAT_KEY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 369
    .line 370
    return-object p0

    .line 371
    :pswitch_59
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->ASSET_FAILED_MAX_SPACE_EXCEEDED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 372
    .line 373
    return-object p0

    .line 374
    :pswitch_5a
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->ASSET_FAILED_INSUFFICIENT_SPACE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 375
    .line 376
    return-object p0

    .line 377
    :pswitch_5b
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_METRICS_ENDPOINT:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 378
    .line 379
    return-object p0

    .line 380
    :pswitch_5c
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_LOG_ERROR_ENDPOINT:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 381
    .line 382
    return-object p0

    .line 383
    :pswitch_5d
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_RI_ENDPOINT:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 384
    .line 385
    return-object p0

    .line 386
    :pswitch_5e
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_ADS_ENDPOINT:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 387
    .line 388
    return-object p0

    .line 389
    :pswitch_5f
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->TPAT_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 390
    .line 391
    return-object p0

    .line 392
    :cond_0
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_LOAD_TOO_FREQUENTLY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 393
    .line 394
    return-object p0

    .line 395
    :cond_1
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_NO_FILL:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 396
    .line 397
    return-object p0

    .line 398
    :cond_2
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INLINE_INSTALL_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 399
    .line 400
    return-object p0

    .line 401
    :cond_3
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->OUT_OF_MEMORY:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 402
    .line 403
    return-object p0

    .line 404
    :cond_4
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->NATIVE_VIDEO_PLAYBACK_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 405
    .line 406
    return-object p0

    .line 407
    :cond_5
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->NATIVE_ASSET_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 408
    .line 409
    return-object p0

    .line 410
    :cond_6
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_SERVER_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 411
    .line 412
    return-object p0

    .line 413
    :cond_7
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->MEDIATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 414
    .line 415
    return-object p0

    .line 416
    :cond_8
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->VUNGLE_OIT_CREATION_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 417
    .line 418
    return-object p0

    .line 419
    :cond_9
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->BANNER_VIEW_INVALID_SIZE:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 420
    .line 421
    return-object p0

    .line 422
    :cond_a
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->CONCURRENT_PLAYBACK_UNSUPPORTED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 423
    .line 424
    return-object p0

    .line 425
    :cond_b
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->UNKNOWN_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 426
    .line 427
    return-object p0

    .line 428
    :cond_c
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->MRAID_BRIDGE_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 429
    .line 430
    return-object p0

    .line 431
    :cond_d
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_EXPIRED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 432
    .line 433
    return-object p0

    .line 434
    :cond_e
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_IFA_STATUS:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 435
    .line 436
    return-object p0

    .line 437
    :cond_f
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->MRAID_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 438
    .line 439
    return-object p0

    .line 440
    :cond_10
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->USER_AGENT_ERROR:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 441
    .line 442
    return-object p0

    .line 443
    :cond_11
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->SDK_NOT_INITIALIZED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 444
    .line 445
    return-object p0

    .line 446
    :cond_12
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->ALREADY_INITIALIZED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 447
    .line 448
    return-object p0

    .line 449
    :cond_13
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->CURRENTLY_INITIALIZING:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 450
    .line 451
    return-object p0

    .line 452
    :cond_14
    sget-object p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->INVALID_APP_ID:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 453
    .line 454
    return-object p0

    .line 455
    :pswitch_data_0
    .packed-switch 0x79
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
    .end packed-switch

    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    :pswitch_data_1
    .packed-switch 0x7d0
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x7531
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x65
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x6d
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0xc8
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0xd4
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x133
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static internalGetValueMap()Lcom/google/protobuf/Internal$EnumLiteMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Internal$EnumLiteMap<",
            "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public static internalGetVerifier()Lcom/google/protobuf/Internal$EnumVerifier;
    .locals 1

    .line 1
    sget-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason$ReasonVerifier;->INSTANCE:Lcom/google/protobuf/Internal$EnumVerifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(I)Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p0}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->forNumber(I)Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;
    .locals 1

    .line 1
    const-class v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    return-object p0
.end method

.method public static values()[Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;
    .locals 1

    .line 1
    sget-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->$VALUES:[Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 2

    .line 1
    sget-object v0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->UNRECOGNIZED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->value:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string v1, "Can\'t get the number of an unknown enum value."

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
.end method
