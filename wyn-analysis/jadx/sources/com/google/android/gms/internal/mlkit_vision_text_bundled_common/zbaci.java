package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes4.dex */
final class zbaci implements zbuj {
    static final zbuj zba = new zbaci();

    private zbaci() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuj
    public final boolean zba(int i5) {
        if (i5 == 200 || i5 == 300 || i5 == 302 || i5 == 312 || i5 == 15000 || i5 == 304 || i5 == 305) {
            return true;
        }
        switch (i5) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                switch (i5) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        return true;
                    default:
                        switch (i5) {
                            case 43:
                            case 44:
                            case 45:
                                return true;
                            default:
                                switch (i5) {
                                    case AD_RESPONSE_RETRY_AFTER_VALUE:
                                    case AD_LOAD_FAIL_RETRY_AFTER_VALUE:
                                    case INVALID_WATERFALL_PLACEMENT_ID_VALUE:
                                    case STALE_CACHED_RESPONSE_VALUE:
                                    case AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE:
                                    case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                                    case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                                    case INVALID_CSB_DATA_VALUE:
                                        return true;
                                    default:
                                        switch (i5) {
                                            case 238:
                                            case 239:
                                            case 240:
                                            case 241:
                                            case 242:
                                            case 243:
                                                return true;
                                            default:
                                                switch (i5) {
                                                    case LINK_COMMAND_OPEN_FAILED_VALUE:
                                                    case JSON_PARAMS_ENCODE_ERROR_VALUE:
                                                    case GENERATE_JSON_DATA_ERROR_VALUE:
                                                        return true;
                                                    default:
                                                        return false;
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
