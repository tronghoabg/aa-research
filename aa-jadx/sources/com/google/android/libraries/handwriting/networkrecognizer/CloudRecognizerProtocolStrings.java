package com.google.android.libraries.handwriting.networkrecognizer;

/* JADX INFO: loaded from: classes3.dex */
public class CloudRecognizerProtocolStrings {
    public static final java.lang.String API_LEVEL = "api_level";
    public static final java.lang.String APP_VERSION = "app_version";
    public static final java.lang.String DEBUG_INFO = "debug_info";
    public static final java.lang.String DEVICE = "device";
    public static final java.lang.String ENABLE_PRE_SPACE = "enable_pre_space";
    public static final java.lang.String FEEDBACK = "feedback";
    public static final java.lang.String INK_HASH = "ink_hash";
    public static final java.lang.String INPUT_TYPE = "input_type";
    public static final java.lang.String LANGUAGE = "language";
    public static final java.lang.String OPTIONS = "options";
    public static final java.lang.String OPTION_RETURN_SEGMENTATION = "return_segmentation";
    public static final java.lang.String PRE_CONTEXT = "pre_context";
    public static final java.lang.String REQUESTS = "requests";
    public static final java.lang.String SELECT_TYPE = "select_type";
    public static final java.lang.String SUCCESS = "SUCCESS";
    public static final java.lang.String USER_ID = "user_id";
    public static final java.lang.String IME = "ime";
    public static final java.lang.String HANDWRITING = "handwriting";
    public static final java.lang.String APP = "app";
    public static final java.lang.String DBG = "dbg";
    public static final java.lang.String DBG_VALUE = "0";
    public static final java.lang.String CLIENT_SOURCE = "cs";
    public static final java.lang.String CLIENT_SOURCE_VALUE = "1";
    public static final java.lang.String OUTPUT_ENCODING = "oe";
    public static final java.lang.String OUTPUT_ENCODING_VALUE = "UTF-8";
    private static final java.lang.String URL_TEMPLATE_WITHOUT_LANGUAGE = java.lang.String.format("%%s%%s?%s=%s&%s=%%s&%s=%s&%s=%s&%s=%s", IME, HANDWRITING, APP, DBG, DBG_VALUE, CLIENT_SOURCE, CLIENT_SOURCE_VALUE, OUTPUT_ENCODING, OUTPUT_ENCODING_VALUE);

    public static java.lang.String recognitionUrl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return java.lang.String.format(URL_TEMPLATE_WITHOUT_LANGUAGE, str, str2, str3);
    }
}
