package com.google.android.libraries.handwriting.networkrecognizer;

/* loaded from: classes3.dex */
public class CloudRecognizerProtocolStrings {
    public static final String API_LEVEL = "api_level";
    public static final String APP_VERSION = "app_version";
    public static final String DEBUG_INFO = "debug_info";
    public static final String DEVICE = "device";
    public static final String ENABLE_PRE_SPACE = "enable_pre_space";
    public static final String FEEDBACK = "feedback";
    public static final String INK_HASH = "ink_hash";
    public static final String INPUT_TYPE = "input_type";
    public static final String LANGUAGE = "language";
    public static final String OPTIONS = "options";
    public static final String OPTION_RETURN_SEGMENTATION = "return_segmentation";
    public static final String PRE_CONTEXT = "pre_context";
    public static final String REQUESTS = "requests";
    public static final String SELECT_TYPE = "select_type";
    public static final String SUCCESS = "SUCCESS";
    public static final String USER_ID = "user_id";
    public static final String IME = "ime";
    public static final String HANDWRITING = "handwriting";
    public static final String APP = "app";
    public static final String DBG = "dbg";
    public static final String DBG_VALUE = "0";
    public static final String CLIENT_SOURCE = "cs";
    public static final String CLIENT_SOURCE_VALUE = "1";
    public static final String OUTPUT_ENCODING = "oe";
    public static final String OUTPUT_ENCODING_VALUE = "UTF-8";
    private static final String URL_TEMPLATE_WITHOUT_LANGUAGE = String.format("%%s%%s?%s=%s&%s=%%s&%s=%s&%s=%s&%s=%s", IME, HANDWRITING, APP, DBG, DBG_VALUE, CLIENT_SOURCE, CLIENT_SOURCE_VALUE, OUTPUT_ENCODING, OUTPUT_ENCODING_VALUE);

    public static String recognitionUrl(String str, String str2, String str3) {
        return String.format(URL_TEMPLATE_WITHOUT_LANGUAGE, str, str2, str3);
    }
}
