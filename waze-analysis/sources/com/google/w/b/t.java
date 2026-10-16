package com.google.w.b;

import androidx.compose.runtime.ComposeVersion;
import com.google.v.eg;
import com.google.v.eh;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum t implements eg {
    ST_NOT_SPECIFIED(0),
    ST_NOT_REQUIRED(999),
    ST_PSEUDONYMOUS_ID(1000),
    ST_ISOLATED_PSEUDONYMOUS_ID(DisplayStrings.DS_CUSTOM_PROMPT_KEEP_LEFT),
    ST_ISOLATED_REVERSIBLE_PSEUDONYMOUS_ID(DisplayStrings.DS_CUSTOM_PROMPT_KEEP_RIGHT),
    ST_ISOLATED_IRREVERSIBLE_PSEUDONYMOUS_ID(DisplayStrings.DS_CUSTOM_PROMPT_TURN_LEFT),
    ST_ZWIEBACK_ID(1001),
    ST_PREF_ID(1002),
    ST_BISCOTTI_ID(1003),
    ST_ANALYTICS_ID(1004),
    ST_MANDELBREAD_ID(1005),
    ST_ANDROID_LOGGING_ID2(1006),
    ST_ACSA_ID(1007),
    ST_HERREVAD_ID(1008),
    ST_YOUTUBE_VISITOR_ID(1009),
    ST_CLOUD_RESOURCE_NAME_PSEUDONYMOUS(1010),
    ST_IDENTIFYING_ID(DisplayStrings.DS_ADD_HOURS),
    ST_EMAIL_ID(DisplayStrings.DS_WHATS_WRONG_WITH_THIS_PLACEQ),
    ST_NAME(DisplayStrings.DS_IT_HAS_NOTHING_TO_DO_WITH_THIS_PLACE),
    ST_PHONE_NUMBER(DisplayStrings.DS_IT_IS_INAPPROPRIATE),
    ST_GAIA_ID(DisplayStrings.DS_IT_IS_IN_LOW_QUALITY),
    ST_USERNAME(DisplayStrings.DS_PLACE_CLOSED_MOVED),
    ST_GSERVICES_ANDROID_ID(DisplayStrings.DS_PLACE_DUPLICATE),
    ST_ARES_ID(DisplayStrings.DS_PLACE_INAPPROPRIATE),
    ST_MEDICAL_RECORD_NUMBER(DisplayStrings.DS_PLACE_WRONG),
    ST_PAYMENTS_RISK_DATA(DisplayStrings.DS_ADD_NAME),
    ST_CLOUD_PROJECT_ID(DisplayStrings.DS_EDIT_DETAILS),
    ST_CLOUD_PRINCIPAL_ID(DisplayStrings.DS_OKAY),
    ST_FITBIT_ID(DisplayStrings.DS_ADD_PS),
    ST_DUSI_ID(DisplayStrings.DS_TAP_TO_ADD_CATEGORIES),
    ST_CLOUD_RESOURCE_NAME(DisplayStrings.DS_THE_DETAILS_ARE_WRONG_BECAUSE___),
    ST_YOUTUBE_EXTERNAL_USER_ID(14001),
    ST_YOUTUBE_EXTERNAL_VIDEO_ID(14002),
    ST_YOUTUBE_EXTERNAL_VIDEO_DOC_ID(14003),
    ST_YOUTUBE_EXTERNAL_VIDEO_CONTENT_ID(14004),
    ST_YOUTUBE_EXTERNAL_VIDEO_RAW_ID(14005),
    ST_YOUTUBE_EXTERNAL_PLAYLIST_ID(14006),
    ST_YOUTUBE_EXTERNAL_CHANNEL_ID(14007),
    ST_YOUTUBE_OWNERSHIP_SNAPSHOT_ID(14008),
    ST_YOUTUBE_EXTERNAL_OWNERSHIP_FINGERPRINT(14009),
    ST_YOUTUBE_EXTERNAL_BROWSE_ID(14010),
    ST_YOUTUBE_EXTERNAL_OFFER_SHORT_ID(14011),
    ST_YOUTUBE_EXTERNAL_VANITY_ID(14012),
    ST_YOUTUBE_EXTERNAL_POST_ID(14013),
    ST_YOUTUBE_EXTERNAL_POST_COMMENT_ID(14014),
    ST_YOUTUBE_EXTERNAL_COMMENT_ID(14015),
    ST_YOUTUBE_EXTERNAL_CLAIM_ID(14016),
    ST_YOUTUBE_EXTERNAL_IMAGE_ID(14017),
    ST_YOUTUBE_EXTERNAL_ARTIST_ID(14018),
    ST_YOUTUBE_EFFECT_ID(14030),
    ST_GOOGLE_OBJECT_ID(12031),
    ST_FIFE_URL(DisplayStrings.DS_SELECT_PLACE),
    ST_BLOBSTORE_ID(DisplayStrings.DS_TELL_US_MORE),
    ST_WORKSPACE_OBJECT_ID(12001),
    ST_ORG_UNIT_ID(DisplayStrings.DS_WHAT_HAPPENEDQ),
    ST_SYSTEM_RESOURCE_IDENTIFIER(12015),
    ST_BIGSTORE_PATH(DisplayStrings.DS_PHOTO_BY_PS),
    ST_GOOGLE_FILE_PATH(DisplayStrings.DS_THIS_PLACE_IS_INAPPROPRIATE_BECAUSE___),
    ST_PROD_GROUP(DisplayStrings.DS_REPORT_PLACE_THANK_YOU),
    ST_SPII_ID(1200),
    ST_GOVERNMENT_ID_NUMBER(DisplayStrings.DS_CALENDAR_CONFIRM_BLOCK_ADDRESS_OK),
    ST_HEALTHCARE_INFO(DisplayStrings.DS_VERIFY_CALENDAR_MAP_TITLE),
    ST_FAROE_MBD_HFALD(DisplayStrings.DS_CALENDAR_SETTINGS_ADVANCED_HEADER),
    ST_SENSITIVE_BACKGROUND_INFO(DisplayStrings.DS_VERIFY_CALENDAR_SET_LOCATION),
    ST_RACE_ETHNICITY(DisplayStrings.DS_VERIFY_CALENDAR_REMOVE),
    ST_POLITICAL_BELIEFS(DisplayStrings.DS_VERIFY_CALENDAR_PREFERENCES),
    ST_RELIGIOUS_BELIEFS(DisplayStrings.DS_VERIFY_CALENDAR_AUTOCOMPLETE_TITLE),
    ST_GENDER_IDENTITY(DisplayStrings.DS_CALENDAR_SETTINGS_TITLE),
    ST_AGE(DisplayStrings.DS_CALENDAR_SETTINGS_MAIN_FOOTER_HTML),
    ST_CARDHOLDER_DATA(DisplayStrings.DS_CALENDAR_SELECTION_MAIN_CALENDAR),
    ST_CHD_PAN(DisplayStrings.DS_CALENDAR_SETTINGS_ADVANCED_FOOTER),
    ST_CHD_INFO(DisplayStrings.DS_CALENDAR_SETTINGS_SYNC),
    ST_PAYMENTS_INFO(DisplayStrings.DS_CALENDAR_SYNCED_OK),
    ST_CRITICAL_PAYMENT_INFO(DisplayStrings.DS_CALENDAR_SYNCED_LEARN_MORE),
    ST_PAYMENT_ID(DisplayStrings.DS_CALENDAR_SYNCED_LEARN_MORE_TITLE),
    ST_LIMITED_USE_PAYMENTS_INFO(DisplayStrings.DS_SETTINGS_RESTRICTED_AREAS_TITLE),
    ST_PAYMENTS_INFERRED_REAL_IDENTITY(DisplayStrings.DS_SETTINGS_RESTRICTED_AREAS_NOTE),
    ST_PAYMENTS_TRANSACTION_INFO(DisplayStrings.DS_SEARCH_RESULTS_PARKING_ARRIVAL_TIME_LOADING),
    ST_NETWORK_ENDPOINT(DisplayStrings.DS_LOCATION_PREVIEW_ADD_PHOTO),
    ST_IP_ADDRESS(DisplayStrings.DS_LOCATION_PREVIEW_CLOSED),
    ST_CHIME_REPRESENTATIVE_TARGET_ID(DisplayStrings.DS_LOCATION_PREVIEW_CLOSES_AT_PS),
    ST_HARDWARE_INFO(DisplayStrings.DS_FUTURE_DRIVES_PLAN_PD_HOUR_DRIVE),
    ST_HARDWARE_ID(DisplayStrings.DS_FUTURE_DRIVES_PLAN_TRAFFIC_LABEL),
    ST_ANDROID_LOGGING_ID(DisplayStrings.DS_FUTURE_DRIVES_PLAN_PD_MIN_DRIVE),
    ST_SOFTWARE_ID(1500),
    ST_USER_AGENT(DisplayStrings.DS_NEARING_DEST_TAKE_PHOTO),
    ST_CLIENT_TAG(DisplayStrings.DS_NEARING_ARRIVING_AT),
    ST_ANDROID_APP(DisplayStrings.DS_NEARING_ARRIVED_AT),
    ST_ANONYMOUS_DATA(1600),
    ST_DEMOGRAPHIC_INFO(1601),
    ST_LOCATION(DisplayStrings.DS_ETA_SCREEN_PLAN_FOOTER),
    ST_PRECISE_LOCATION(DisplayStrings.DS_ETA_SCREEN_OVERVIEW_BUTTON),
    ST_COARSE_LOCATION(DisplayStrings.DS_ETA_SCREEN_PLAN_DRIVE_BTN_NOW),
    ST_GOOGLE_RELATIONSHIP_ID(DisplayStrings.DS_BEACONS_GO_TO_SETTINGS_FOR_PERMISSIONS_BUTTON2),
    ST_CUSTOMER_ID(DisplayStrings.DS_BEACONS_BT_NOTIF_TITLE),
    ST_PARTNER_ID(DisplayStrings.DS_BEACONS_BT_NOTIF_TEXT),
    ST_PUBLISHER_ID(DisplayStrings.DS_BEACONS_BT_NOTIF_OPTOUT),
    ST_RTB_CUSTOMER_DATA(DisplayStrings.DS_BEACONS_BT_NOTIF_BUTTON0),
    ST_CLOUD_PROJECT_NUMBER(DisplayStrings.DS_REPORT_ALERT_QUOTA_TITLE),
    ST_CLOUD_FOLDER_ID(DisplayStrings.DS_REPORT_ALERT_QUOTA_BODY),
    ST_USER_CONTENT(DisplayStrings.DS_CUSTOM_PROMPT_800_METERS),
    ST_USER_QUERY(DisplayStrings.DS_CUSTOM_PROMPT_1000_METERS),
    ST_USER_QUERY_MODEL_RESPONSE(DisplayStrings.DS_CUSTOM_PROMPT_SIXTH),
    ST_PERSONAL_DATA_CROSS_PA_SOURCE(DisplayStrings.DS_CUSTOM_PROMPT_SEVENTH),
    ST_AUDIO(DisplayStrings.DS_CUSTOM_PROMPT_1500_METERS),
    ST_MUSIC(DisplayStrings.DS_CUSTOM_PROMPT_TENTH_MILE),
    ST_TEXT_TO_SPEECH(DisplayStrings.DS_CUSTOM_PROMPT_QUARTER_MILE),
    ST_USER_SECURITY_CONFIGURATION(DisplayStrings.DS_CUSTOM_PROMPT_HALF_MILE),
    ST_USER_CONFIGURATION(DisplayStrings.DS_CUSTOM_PROMPT_ONE_MILE),
    ST_UNSTRUCTURED_ADMIN_SETTING(12003),
    ST_STRUCTURED_ADMIN_SETTING(12024),
    ST_UNSTRUCTURED_USER_SETTING(12004),
    ST_STRUCTURED_USER_SETTING(12012),
    ST_USER_DEFINED_ATTRIBUTE(DisplayStrings.DS_CUSTOM_PROMPT_FIRST),
    ST_USER_LABEL(12005),
    ST_PERSONAL_DATA(DisplayStrings.DS_PRIVACY_SETTINGS_ACTIVITY_DRIVE_HISTORY_TITLE),
    ST_USER_CORE_CONTENT(DisplayStrings.DS_CUSTOM_PROMPT_SECOND),
    ST_DOCUMENT_CONTENT(DisplayStrings.DS_CUSTOM_PROMPT_FIFTH),
    ST_EMAIL_CONTENT(DisplayStrings.DS_PRIVACY_SETTINGS_ACCOUNT_AND_LOGIN_TITLE),
    ST_CALENDAR_CONTENT(DisplayStrings.DS_PRIVACY_SETTINGS_ACCOUNT_AND_LOGIN_DESCRIPTION),
    ST_CONTACT_CONTENT(DisplayStrings.DS_PRIVACY_CONCENT_BUMP_BG_LOCATION_TITLE),
    ST_USER_MESSAGE(DisplayStrings.DS_PRIVACY_CONCENT_BUMP_BG_LOCATION_TEXT),
    ST_TITLE(12030),
    ST_USER_GROUP_NAME(12036),
    ST_PERSONAL_RENDERED_OUTPUT(DisplayStrings.DS_PRIVACY_CONCENT_BUMP_BG_LOCATION_CONFIRM_BUTTON_ALLOW),
    ST_CREDIT_INFO(DisplayStrings.DS_PRIVACY_SETTINGS_ACTIVITY_DRIVE_HISTORY_DESCRIPTION),
    ST_BODY_SENSOR_DATA(DisplayStrings.DS_PRIVACY_CONCENT_BUMP_BG_LOCATION_CONFIRM_TITLE),
    ST_VOICE(DisplayStrings.DS_PRIVACY_CONCENT_BUMP_BG_LOCATION_CONFIRM_TEXT),
    ST_SMART_HOME(DisplayStrings.DS_PRIVACY_CONCENT_BUMP_BG_LOCATION_CONFIRM_BUTTON_DONT_ALLOW),
    ST_USER_IMAGE(DisplayStrings.DS_CUSTOM_PROMPT_THIRD),
    ST_USER_IMAGE_REF(DisplayStrings.DS_CUSTOM_PROMPT_FOURTH),
    ST_CONTENT_SUMMARY(12034),
    ST_THIRD_PARTY_DATA(2000),
    ST_TIMESTAMP(DisplayStrings.DS_ALERT_TITLE_ACCIDENT),
    ST_SENSITIVE_TIMESTAMP(DisplayStrings.DS_ALERT_TITLE_ACCIDENT_MINOR),
    ST_CALENDAR_EVENT_TIMESTAMP(12035),
    ST_DURATION(12025),
    ST_SESSION_ID(DisplayStrings.DS_REPORT_COMMENTS_DEFAULT_NAME),
    ST_EXPERIMENT_ID(DisplayStrings.DS_ALT_HOV_SUGGESTION_SAVE_PD_MINUTES),
    ST_CROSS_DEVICE_SESSION_ID(DisplayStrings.DS_ALT_HOV_SUGGESTION_ADD_PD_MINUTES),
    ST_AVOCADO_ID(DisplayStrings.DS_REPORT_ALERT_ON),
    ST_SECURITY_MATERIAL(DisplayStrings.DS_SHARE_DRIVE_MAP_MESSAGE_USER_PS),
    ST_SECURITY_KEY(DisplayStrings.DS_SHARE_DRIVE_ERROR_POPUP_TITLE),
    ST_ACCOUNT_CREDENTIAL(DisplayStrings.DS_SHARE_DRIVE_ERROR_POPUP_CLOSE_TEXT),
    ST_PAYMENTS_PCI_SAD(DisplayStrings.DS_SHARE_DRIVE_ERROR_POPUP_RETRY_TEXT),
    ST_CLOUD_IAM_PARENT(2701),
    ST_CLOUD_IAM_ROLE_ID(2702),
    ST_CLOUD_IAM_ROLE_NAME(2703),
    ST_CLOUD_IAM_PERMISSION(2704),
    ST_GOOGLE_OPERATIONAL_DATA(2800),
    ST_SYSTEM_DIAGNOSTIC_INFO(12017),
    ST_GOOGLE_OPERATIONAL_METRICS(2801),
    ST_GOOGLE_GENERATED_USER_METADATA(DisplayStrings.DS_EMAIL_SETTINGS_NOT_VERIFIED),
    ST_GOOGLE_GENERATED_USER_CONTENT_METADATA(DisplayStrings.DS_LOGOUT_WARNING_GUEST_DIALOG_TITLE),
    ST_GOOGLE_GENERATED_USER_CONTENT(DisplayStrings.DS_LOGOUT_WARNING_GUEST_DIALOG_BODY),
    ST_USER_CONTENT_EMBEDDING(DisplayStrings.DS_LOGOUT_WARNING_GUEST_DIALOG_NO),
    ST_FRAUD_ABUSE_INFO(DisplayStrings.DS_LOGOUT_WARNING_GUEST_DIALOG_YES),
    ST_SYSTEM_CONFIGURATION(12028),
    ST_GOOGLE_OBJECT_INFO(3000),
    ST_GOOGLE_OBJECT_VERSION(12016),
    ST_WORKSPACE_OBJECT_INFO(12033),
    ST_WORKSPACE_OBJECT_CONTENT_REFERENCE(12032),
    ST_METRICS(DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_ITEM_STATUS_OFF),
    ST_PER_USER_METRICS(12009),
    ST_CROSS_USER_METRICS(12010),
    ST_PER_CUSTOMER_METRICS(12038),
    ST_ACCESS_LEVEL(12023),
    ST_USER_ACTION(12008),
    ST_STRUCTURED_REQUEST_PARAMETER(12027),
    ST_CONTENT_DEPENDENT(9900),
    ST_DEBUG_INFO(9901),
    ST_KEY_VALUE_PAIR(9902),
    ST_KEY(9903),
    ST_VALUE(9904),
    ST_REFERER_URL(9905),
    ST_REMOTE_DEVICE_INFO(ComposeVersion.version),
    ST_SENSITIVE_SIZE(13100),
    ST_SENSITIVE_QUALITY_SIGNALS(13200),
    ST_PLATINUM_ID(1011),
    ST_ADWORDS_CUSTOMER_ID(DisplayStrings.DS_WEBSITE),
    ST_ADWORDS_USER_ID(DisplayStrings.DS_PLACE_ADD_ERROR),
    ST_DEVICE_ID(DisplayStrings.DS_FLAG_WRONG_PLACE),
    ST_PUBLISHER_PROVIDED_ID(DisplayStrings.DS_PLACE_IS_RESIDENCE),
    ST_ADVERTISER_USER_ID(DisplayStrings.DS_SERVICES),
    ST_SURROGATE_IP_ID(1012),
    ST_SURROGATE_PII_ID(1013),
    ST_NEBULA_CLUSTER_ID(1014),
    ST_REVERSIBLE_PSEUDONYMOUS_ID(1015),
    ST_IRREVERSIBLE_PSEUDONYMOUS_ID(1016),
    ST_SURROGATE_ID(1017),
    ST_YOUTUBE_SURROGATE_VIDEO_ID(14101),
    ST_YOUTUBE_SURROGATE_PLAYLIST_ID(14102),
    ST_YOUTUBE_SURROGATE_CHANNEL_ID(14103),
    ST_YOUTUBE_SURROGATE_OWNERSHIP_SNAPSHOT_ID(14104),
    ST_YOUTUBE_SURROGATE_USER_ID(14105),
    ST_YOUTUBE_SURROGATE_OFFER_SHORT_ID(14107),
    ST_YOUTUBE_SURROGATE_POST_ID(14108),
    ST_YOUTUBE_SURROGATE_POST_COMMENT_ID(14109),
    ST_YOUTUBE_SURROGATE_COMMENT_ID(14110),
    ST_YOUTUBE_SURROGATE_CLAIM_ID(14111),
    ST_YOUTUBE_SURROGATE_OWNERSHIP_FINGERPRINT(14112),
    ST_YOUTUBE_FEATURE(14201),
    ST_YOUTUBE_EVENT_ID(14202);

    private static final eh cV = new r(0);
    private final int cX;

    t(int i2) {
        this.cX = i2;
    }

    public static eh a() {
        return cV;
    }

    public static t b(int i2) {
        if (i2 != 0) {
            if (i2 == 1600) {
                return ST_ANONYMOUS_DATA;
            }
            if (i2 == 1601) {
                return ST_DEMOGRAPHIC_INFO;
            }
            switch (i2) {
                case 0:
                    break;
                case DisplayStrings.DS_ADD_HOURS /* 1100 */:
                    return ST_IDENTIFYING_ID;
                case DisplayStrings.DS_WHATS_WRONG_WITH_THIS_PLACEQ /* 1102 */:
                    return ST_EMAIL_ID;
                case DisplayStrings.DS_IT_HAS_NOTHING_TO_DO_WITH_THIS_PLACE /* 1103 */:
                    return ST_NAME;
                case DisplayStrings.DS_IT_IS_INAPPROPRIATE /* 1104 */:
                    return ST_PHONE_NUMBER;
                case DisplayStrings.DS_IT_IS_IN_LOW_QUALITY /* 1105 */:
                    return ST_GAIA_ID;
                case DisplayStrings.DS_PLACE_CLOSED_MOVED /* 1106 */:
                    return ST_USERNAME;
                case DisplayStrings.DS_PLACE_DUPLICATE /* 1107 */:
                    return ST_GSERVICES_ANDROID_ID;
                case DisplayStrings.DS_PLACE_INAPPROPRIATE /* 1108 */:
                    return ST_ARES_ID;
                case DisplayStrings.DS_PLACE_WRONG /* 1109 */:
                    return ST_MEDICAL_RECORD_NUMBER;
                case DisplayStrings.DS_ADD_NAME /* 1110 */:
                    return ST_PAYMENTS_RISK_DATA;
                case DisplayStrings.DS_EDIT_DETAILS /* 1111 */:
                    return ST_CLOUD_PROJECT_ID;
                case DisplayStrings.DS_OKAY /* 1112 */:
                    return ST_CLOUD_PRINCIPAL_ID;
                case DisplayStrings.DS_ADD_PS /* 1113 */:
                    return ST_FITBIT_ID;
                case DisplayStrings.DS_TAP_TO_ADD_CATEGORIES /* 1114 */:
                    return ST_DUSI_ID;
                case DisplayStrings.DS_SELECT_PLACE /* 1115 */:
                    return ST_FIFE_URL;
                case DisplayStrings.DS_PHOTO_BY_PS /* 1116 */:
                    return ST_BIGSTORE_PATH;
                case DisplayStrings.DS_TELL_US_MORE /* 1117 */:
                    return ST_BLOBSTORE_ID;
                case DisplayStrings.DS_THIS_PLACE_IS_INAPPROPRIATE_BECAUSE___ /* 1118 */:
                    return ST_GOOGLE_FILE_PATH;
                case DisplayStrings.DS_THE_DETAILS_ARE_WRONG_BECAUSE___ /* 1119 */:
                    return ST_CLOUD_RESOURCE_NAME;
                case DisplayStrings.DS_WHAT_HAPPENEDQ /* 1120 */:
                    return ST_ORG_UNIT_ID;
                case DisplayStrings.DS_REPORT_PLACE_THANK_YOU /* 1121 */:
                    return ST_PROD_GROUP;
                case DisplayStrings.DS_WEBSITE /* 1122 */:
                    return ST_ADWORDS_CUSTOMER_ID;
                case DisplayStrings.DS_PLACE_ADD_ERROR /* 1123 */:
                    return ST_ADWORDS_USER_ID;
                case DisplayStrings.DS_FLAG_WRONG_PLACE /* 1124 */:
                    return ST_DEVICE_ID;
                case DisplayStrings.DS_PLACE_IS_RESIDENCE /* 1125 */:
                    return ST_PUBLISHER_PROVIDED_ID;
                case DisplayStrings.DS_SERVICES /* 1126 */:
                    return ST_ADVERTISER_USER_ID;
                case DisplayStrings.DS_SEARCH_RESULTS_PARKING_ARRIVAL_TIME_LOADING /* 1240 */:
                    return ST_PAYMENTS_TRANSACTION_INFO;
                case DisplayStrings.DS_CUSTOM_PROMPT_800_METERS /* 1900 */:
                    return ST_USER_CONTENT;
                case DisplayStrings.DS_CUSTOM_PROMPT_1000_METERS /* 1901 */:
                    return ST_USER_QUERY;
                case DisplayStrings.DS_CUSTOM_PROMPT_1500_METERS /* 1902 */:
                    return ST_AUDIO;
                case DisplayStrings.DS_CUSTOM_PROMPT_TENTH_MILE /* 1903 */:
                    return ST_MUSIC;
                case DisplayStrings.DS_CUSTOM_PROMPT_QUARTER_MILE /* 1904 */:
                    return ST_TEXT_TO_SPEECH;
                case DisplayStrings.DS_CUSTOM_PROMPT_HALF_MILE /* 1905 */:
                    return ST_USER_SECURITY_CONFIGURATION;
                case DisplayStrings.DS_CUSTOM_PROMPT_ONE_MILE /* 1906 */:
                    return ST_USER_CONFIGURATION;
                case DisplayStrings.DS_CUSTOM_PROMPT_FIRST /* 1907 */:
                    return ST_USER_DEFINED_ATTRIBUTE;
                case DisplayStrings.DS_CUSTOM_PROMPT_SECOND /* 1908 */:
                    return ST_USER_CORE_CONTENT;
                case DisplayStrings.DS_CUSTOM_PROMPT_THIRD /* 1909 */:
                    return ST_USER_IMAGE;
                case DisplayStrings.DS_CUSTOM_PROMPT_FOURTH /* 1910 */:
                    return ST_USER_IMAGE_REF;
                case DisplayStrings.DS_CUSTOM_PROMPT_FIFTH /* 1911 */:
                    return ST_DOCUMENT_CONTENT;
                case DisplayStrings.DS_CUSTOM_PROMPT_SIXTH /* 1912 */:
                    return ST_USER_QUERY_MODEL_RESPONSE;
                case DisplayStrings.DS_CUSTOM_PROMPT_SEVENTH /* 1913 */:
                    return ST_PERSONAL_DATA_CROSS_PA_SOURCE;
                case DisplayStrings.DS_CUSTOM_PROMPT_KEEP_LEFT /* 1914 */:
                    return ST_ISOLATED_PSEUDONYMOUS_ID;
                case DisplayStrings.DS_CUSTOM_PROMPT_KEEP_RIGHT /* 1915 */:
                    return ST_ISOLATED_REVERSIBLE_PSEUDONYMOUS_ID;
                case DisplayStrings.DS_CUSTOM_PROMPT_TURN_LEFT /* 1916 */:
                    return ST_ISOLATED_IRREVERSIBLE_PSEUDONYMOUS_ID;
                case 2000:
                    return ST_THIRD_PARTY_DATA;
                case DisplayStrings.DS_ALERT_TITLE_ACCIDENT /* 2100 */:
                    return ST_TIMESTAMP;
                case DisplayStrings.DS_ALERT_TITLE_ACCIDENT_MINOR /* 2101 */:
                    return ST_SENSITIVE_TIMESTAMP;
                case DisplayStrings.DS_REPORT_COMMENTS_DEFAULT_NAME /* 2300 */:
                    return ST_SESSION_ID;
                case DisplayStrings.DS_ALT_HOV_SUGGESTION_SAVE_PD_MINUTES /* 2301 */:
                    return ST_EXPERIMENT_ID;
                case DisplayStrings.DS_ALT_HOV_SUGGESTION_ADD_PD_MINUTES /* 2302 */:
                    return ST_CROSS_DEVICE_SESSION_ID;
                case DisplayStrings.DS_PRIVACY_SETTINGS_ACTIVITY_DRIVE_HISTORY_TITLE /* 2400 */:
                    return ST_PERSONAL_DATA;
                case DisplayStrings.DS_PRIVACY_SETTINGS_ACTIVITY_DRIVE_HISTORY_DESCRIPTION /* 2401 */:
                    return ST_CREDIT_INFO;
                case DisplayStrings.DS_PRIVACY_SETTINGS_ACCOUNT_AND_LOGIN_TITLE /* 2402 */:
                    return ST_EMAIL_CONTENT;
                case DisplayStrings.DS_PRIVACY_SETTINGS_ACCOUNT_AND_LOGIN_DESCRIPTION /* 2403 */:
                    return ST_CALENDAR_CONTENT;
                case DisplayStrings.DS_PRIVACY_CONCENT_BUMP_BG_LOCATION_TITLE /* 2404 */:
                    return ST_CONTACT_CONTENT;
                case DisplayStrings.DS_PRIVACY_CONCENT_BUMP_BG_LOCATION_TEXT /* 2405 */:
                    return ST_USER_MESSAGE;
                case DisplayStrings.DS_PRIVACY_CONCENT_BUMP_BG_LOCATION_CONFIRM_TITLE /* 2406 */:
                    return ST_BODY_SENSOR_DATA;
                case DisplayStrings.DS_PRIVACY_CONCENT_BUMP_BG_LOCATION_CONFIRM_TEXT /* 2407 */:
                    return ST_VOICE;
                case DisplayStrings.DS_PRIVACY_CONCENT_BUMP_BG_LOCATION_CONFIRM_BUTTON_DONT_ALLOW /* 2408 */:
                    return ST_SMART_HOME;
                case DisplayStrings.DS_PRIVACY_CONCENT_BUMP_BG_LOCATION_CONFIRM_BUTTON_ALLOW /* 2409 */:
                    return ST_PERSONAL_RENDERED_OUTPUT;
                case DisplayStrings.DS_REPORT_ALERT_ON /* 2500 */:
                    return ST_AVOCADO_ID;
                case DisplayStrings.DS_SHARE_DRIVE_MAP_MESSAGE_USER_PS /* 2600 */:
                    return ST_SECURITY_MATERIAL;
                case DisplayStrings.DS_SHARE_DRIVE_ERROR_POPUP_TITLE /* 2601 */:
                    return ST_SECURITY_KEY;
                case DisplayStrings.DS_SHARE_DRIVE_ERROR_POPUP_CLOSE_TEXT /* 2602 */:
                    return ST_ACCOUNT_CREDENTIAL;
                case DisplayStrings.DS_SHARE_DRIVE_ERROR_POPUP_RETRY_TEXT /* 2603 */:
                    return ST_PAYMENTS_PCI_SAD;
                case 2701:
                    return ST_CLOUD_IAM_PARENT;
                case 2702:
                    return ST_CLOUD_IAM_ROLE_ID;
                case 2703:
                    return ST_CLOUD_IAM_ROLE_NAME;
                case 2704:
                    return ST_CLOUD_IAM_PERMISSION;
                case 2800:
                    return ST_GOOGLE_OPERATIONAL_DATA;
                case 2801:
                    return ST_GOOGLE_OPERATIONAL_METRICS;
                case DisplayStrings.DS_EMAIL_SETTINGS_NOT_VERIFIED /* 2901 */:
                    return ST_GOOGLE_GENERATED_USER_METADATA;
                case DisplayStrings.DS_LOGOUT_WARNING_GUEST_DIALOG_TITLE /* 2902 */:
                    return ST_GOOGLE_GENERATED_USER_CONTENT_METADATA;
                case DisplayStrings.DS_LOGOUT_WARNING_GUEST_DIALOG_BODY /* 2903 */:
                    return ST_GOOGLE_GENERATED_USER_CONTENT;
                case DisplayStrings.DS_LOGOUT_WARNING_GUEST_DIALOG_YES /* 2904 */:
                    return ST_FRAUD_ABUSE_INFO;
                case DisplayStrings.DS_LOGOUT_WARNING_GUEST_DIALOG_NO /* 2905 */:
                    return ST_USER_CONTENT_EMBEDDING;
                case 3000:
                    return ST_GOOGLE_OBJECT_INFO;
                case DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_ITEM_STATUS_OFF /* 3100 */:
                    return ST_METRICS;
                case 9900:
                    return ST_CONTENT_DEPENDENT;
                case 9901:
                    return ST_DEBUG_INFO;
                case 9902:
                    return ST_KEY_VALUE_PAIR;
                case 9903:
                    return ST_KEY;
                case 9904:
                    return ST_VALUE;
                case 9905:
                    return ST_REFERER_URL;
                case 12001:
                    return ST_WORKSPACE_OBJECT_ID;
                case 12003:
                    return ST_UNSTRUCTURED_ADMIN_SETTING;
                case 12004:
                    return ST_UNSTRUCTURED_USER_SETTING;
                case 12005:
                    return ST_USER_LABEL;
                case 12008:
                    return ST_USER_ACTION;
                case 12009:
                    return ST_PER_USER_METRICS;
                case 12010:
                    return ST_CROSS_USER_METRICS;
                case 12012:
                    return ST_STRUCTURED_USER_SETTING;
                case 12015:
                    return ST_SYSTEM_RESOURCE_IDENTIFIER;
                case 12016:
                    return ST_GOOGLE_OBJECT_VERSION;
                case 12017:
                    return ST_SYSTEM_DIAGNOSTIC_INFO;
                case 12023:
                    return ST_ACCESS_LEVEL;
                case 12024:
                    return ST_STRUCTURED_ADMIN_SETTING;
                case 12025:
                    return ST_DURATION;
                case 12027:
                    return ST_STRUCTURED_REQUEST_PARAMETER;
                case 12028:
                    return ST_SYSTEM_CONFIGURATION;
                case 12030:
                    return ST_TITLE;
                case 12031:
                    return ST_GOOGLE_OBJECT_ID;
                case 12032:
                    return ST_WORKSPACE_OBJECT_CONTENT_REFERENCE;
                case 12033:
                    return ST_WORKSPACE_OBJECT_INFO;
                case 12034:
                    return ST_CONTENT_SUMMARY;
                case 12035:
                    return ST_CALENDAR_EVENT_TIMESTAMP;
                case 12036:
                    return ST_USER_GROUP_NAME;
                case 12038:
                    return ST_PER_CUSTOMER_METRICS;
                case ComposeVersion.version /* 13000 */:
                    return ST_REMOTE_DEVICE_INFO;
                case 13100:
                    return ST_SENSITIVE_SIZE;
                case 13200:
                    return ST_SENSITIVE_QUALITY_SIGNALS;
                case 14001:
                    return ST_YOUTUBE_EXTERNAL_USER_ID;
                case 14002:
                    return ST_YOUTUBE_EXTERNAL_VIDEO_ID;
                case 14003:
                    return ST_YOUTUBE_EXTERNAL_VIDEO_DOC_ID;
                case 14004:
                    return ST_YOUTUBE_EXTERNAL_VIDEO_CONTENT_ID;
                case 14005:
                    return ST_YOUTUBE_EXTERNAL_VIDEO_RAW_ID;
                case 14006:
                    return ST_YOUTUBE_EXTERNAL_PLAYLIST_ID;
                case 14007:
                    return ST_YOUTUBE_EXTERNAL_CHANNEL_ID;
                case 14008:
                    return ST_YOUTUBE_OWNERSHIP_SNAPSHOT_ID;
                case 14009:
                    return ST_YOUTUBE_EXTERNAL_OWNERSHIP_FINGERPRINT;
                case 14010:
                    return ST_YOUTUBE_EXTERNAL_BROWSE_ID;
                case 14011:
                    return ST_YOUTUBE_EXTERNAL_OFFER_SHORT_ID;
                case 14012:
                    return ST_YOUTUBE_EXTERNAL_VANITY_ID;
                case 14013:
                    return ST_YOUTUBE_EXTERNAL_POST_ID;
                case 14014:
                    return ST_YOUTUBE_EXTERNAL_POST_COMMENT_ID;
                case 14015:
                    return ST_YOUTUBE_EXTERNAL_COMMENT_ID;
                case 14016:
                    return ST_YOUTUBE_EXTERNAL_CLAIM_ID;
                case 14017:
                    return ST_YOUTUBE_EXTERNAL_IMAGE_ID;
                case 14018:
                    return ST_YOUTUBE_EXTERNAL_ARTIST_ID;
                case 14030:
                    return ST_YOUTUBE_EFFECT_ID;
                case 14101:
                    return ST_YOUTUBE_SURROGATE_VIDEO_ID;
                case 14102:
                    return ST_YOUTUBE_SURROGATE_PLAYLIST_ID;
                case 14103:
                    return ST_YOUTUBE_SURROGATE_CHANNEL_ID;
                case 14104:
                    return ST_YOUTUBE_SURROGATE_OWNERSHIP_SNAPSHOT_ID;
                case 14105:
                    return ST_YOUTUBE_SURROGATE_USER_ID;
                case 14107:
                    return ST_YOUTUBE_SURROGATE_OFFER_SHORT_ID;
                case 14108:
                    return ST_YOUTUBE_SURROGATE_POST_ID;
                case 14109:
                    return ST_YOUTUBE_SURROGATE_POST_COMMENT_ID;
                case 14110:
                    return ST_YOUTUBE_SURROGATE_COMMENT_ID;
                case 14111:
                    return ST_YOUTUBE_SURROGATE_CLAIM_ID;
                case 14112:
                    return ST_YOUTUBE_SURROGATE_OWNERSHIP_FINGERPRINT;
                case 14201:
                    return ST_YOUTUBE_FEATURE;
                case 14202:
                    return ST_YOUTUBE_EVENT_ID;
                default:
                    switch (i2) {
                        case 999:
                            return ST_NOT_REQUIRED;
                        case 1000:
                            return ST_PSEUDONYMOUS_ID;
                        case 1001:
                            return ST_ZWIEBACK_ID;
                        case 1002:
                            return ST_PREF_ID;
                        case 1003:
                            return ST_BISCOTTI_ID;
                        case 1004:
                            return ST_ANALYTICS_ID;
                        case 1005:
                            return ST_MANDELBREAD_ID;
                        case 1006:
                            return ST_ANDROID_LOGGING_ID2;
                        case 1007:
                            return ST_ACSA_ID;
                        case 1008:
                            return ST_HERREVAD_ID;
                        case 1009:
                            return ST_YOUTUBE_VISITOR_ID;
                        case 1010:
                            return ST_CLOUD_RESOURCE_NAME_PSEUDONYMOUS;
                        case 1011:
                            return ST_PLATINUM_ID;
                        case 1012:
                            return ST_SURROGATE_IP_ID;
                        case 1013:
                            return ST_SURROGATE_PII_ID;
                        case 1014:
                            return ST_NEBULA_CLUSTER_ID;
                        case 1015:
                            return ST_REVERSIBLE_PSEUDONYMOUS_ID;
                        case 1016:
                            return ST_IRREVERSIBLE_PSEUDONYMOUS_ID;
                        case 1017:
                            return ST_SURROGATE_ID;
                        default:
                            switch (i2) {
                                case 1200:
                                    return ST_SPII_ID;
                                case DisplayStrings.DS_CALENDAR_CONFIRM_BLOCK_ADDRESS_OK /* 1201 */:
                                    return ST_GOVERNMENT_ID_NUMBER;
                                case DisplayStrings.DS_CALENDAR_SELECTION_MAIN_CALENDAR /* 1202 */:
                                    return ST_CARDHOLDER_DATA;
                                case DisplayStrings.DS_VERIFY_CALENDAR_MAP_TITLE /* 1203 */:
                                    return ST_HEALTHCARE_INFO;
                                case DisplayStrings.DS_VERIFY_CALENDAR_SET_LOCATION /* 1204 */:
                                    return ST_SENSITIVE_BACKGROUND_INFO;
                                case DisplayStrings.DS_VERIFY_CALENDAR_REMOVE /* 1205 */:
                                    return ST_RACE_ETHNICITY;
                                case DisplayStrings.DS_VERIFY_CALENDAR_PREFERENCES /* 1206 */:
                                    return ST_POLITICAL_BELIEFS;
                                case DisplayStrings.DS_VERIFY_CALENDAR_AUTOCOMPLETE_TITLE /* 1207 */:
                                    return ST_RELIGIOUS_BELIEFS;
                                case DisplayStrings.DS_CALENDAR_SETTINGS_TITLE /* 1208 */:
                                    return ST_GENDER_IDENTITY;
                                case DisplayStrings.DS_CALENDAR_SETTINGS_MAIN_FOOTER_HTML /* 1209 */:
                                    return ST_AGE;
                                case DisplayStrings.DS_CALENDAR_SETTINGS_ADVANCED_HEADER /* 1210 */:
                                    return ST_FAROE_MBD_HFALD;
                                case DisplayStrings.DS_CALENDAR_SETTINGS_ADVANCED_FOOTER /* 1211 */:
                                    return ST_CHD_PAN;
                                case DisplayStrings.DS_CALENDAR_SETTINGS_SYNC /* 1212 */:
                                    return ST_CHD_INFO;
                                default:
                                    switch (i2) {
                                        case DisplayStrings.DS_CALENDAR_SYNCED_OK /* 1220 */:
                                            return ST_PAYMENTS_INFO;
                                        case DisplayStrings.DS_CALENDAR_SYNCED_LEARN_MORE /* 1221 */:
                                            return ST_CRITICAL_PAYMENT_INFO;
                                        case DisplayStrings.DS_CALENDAR_SYNCED_LEARN_MORE_TITLE /* 1222 */:
                                            return ST_PAYMENT_ID;
                                        case DisplayStrings.DS_SETTINGS_RESTRICTED_AREAS_TITLE /* 1223 */:
                                            return ST_LIMITED_USE_PAYMENTS_INFO;
                                        case DisplayStrings.DS_SETTINGS_RESTRICTED_AREAS_NOTE /* 1224 */:
                                            return ST_PAYMENTS_INFERRED_REAL_IDENTITY;
                                        default:
                                            switch (i2) {
                                                case DisplayStrings.DS_LOCATION_PREVIEW_ADD_PHOTO /* 1300 */:
                                                    return ST_NETWORK_ENDPOINT;
                                                case DisplayStrings.DS_LOCATION_PREVIEW_CLOSED /* 1301 */:
                                                    return ST_IP_ADDRESS;
                                                case DisplayStrings.DS_LOCATION_PREVIEW_CLOSES_AT_PS /* 1302 */:
                                                    return ST_CHIME_REPRESENTATIVE_TARGET_ID;
                                                default:
                                                    switch (i2) {
                                                        case DisplayStrings.DS_FUTURE_DRIVES_PLAN_TRAFFIC_LABEL /* 1400 */:
                                                            return ST_HARDWARE_ID;
                                                        case DisplayStrings.DS_FUTURE_DRIVES_PLAN_PD_MIN_DRIVE /* 1401 */:
                                                            return ST_ANDROID_LOGGING_ID;
                                                        case DisplayStrings.DS_FUTURE_DRIVES_PLAN_PD_HOUR_DRIVE /* 1402 */:
                                                            return ST_HARDWARE_INFO;
                                                        default:
                                                            switch (i2) {
                                                                case 1500:
                                                                    return ST_SOFTWARE_ID;
                                                                case DisplayStrings.DS_NEARING_DEST_TAKE_PHOTO /* 1501 */:
                                                                    return ST_USER_AGENT;
                                                                case DisplayStrings.DS_NEARING_ARRIVING_AT /* 1502 */:
                                                                    return ST_CLIENT_TAG;
                                                                case DisplayStrings.DS_NEARING_ARRIVED_AT /* 1503 */:
                                                                    return ST_ANDROID_APP;
                                                                default:
                                                                    switch (i2) {
                                                                        case DisplayStrings.DS_ETA_SCREEN_PLAN_FOOTER /* 1700 */:
                                                                            return ST_LOCATION;
                                                                        case DisplayStrings.DS_ETA_SCREEN_OVERVIEW_BUTTON /* 1701 */:
                                                                            return ST_PRECISE_LOCATION;
                                                                        case DisplayStrings.DS_ETA_SCREEN_PLAN_DRIVE_BTN_NOW /* 1702 */:
                                                                            return ST_COARSE_LOCATION;
                                                                        default:
                                                                            switch (i2) {
                                                                                case DisplayStrings.DS_BEACONS_GO_TO_SETTINGS_FOR_PERMISSIONS_BUTTON2 /* 1800 */:
                                                                                    return ST_GOOGLE_RELATIONSHIP_ID;
                                                                                case DisplayStrings.DS_BEACONS_BT_NOTIF_TITLE /* 1801 */:
                                                                                    return ST_CUSTOMER_ID;
                                                                                case DisplayStrings.DS_BEACONS_BT_NOTIF_TEXT /* 1802 */:
                                                                                    return ST_PARTNER_ID;
                                                                                case DisplayStrings.DS_BEACONS_BT_NOTIF_OPTOUT /* 1803 */:
                                                                                    return ST_PUBLISHER_ID;
                                                                                case DisplayStrings.DS_BEACONS_BT_NOTIF_BUTTON0 /* 1804 */:
                                                                                    return ST_RTB_CUSTOMER_DATA;
                                                                                case DisplayStrings.DS_REPORT_ALERT_QUOTA_TITLE /* 1805 */:
                                                                                    return ST_CLOUD_PROJECT_NUMBER;
                                                                                case DisplayStrings.DS_REPORT_ALERT_QUOTA_BODY /* 1806 */:
                                                                                    return ST_CLOUD_FOLDER_ID;
                                                                                default:
                                                                                    return null;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return ST_NOT_SPECIFIED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.cX;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.cX);
    }
}
