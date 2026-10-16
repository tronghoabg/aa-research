package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tag {
    public static final defpackage.ypg a = defpackage.ypg.c("com/google/android/libraries/assistant/auto/aaptransport/util/ApiProtoConverter");

    public static final defpackage.tbo a(int i) {
        switch (i) {
            case 2:
                return defpackage.tbo.KEY_OPA_ENABLED;
            case 3:
                return defpackage.tbo.KEY_CURRENT_ACCOUNT_NAME;
            case 4:
            case 6:
            default:
                return defpackage.tbo.KEY_UNKNOWN_SETTING;
            case 5:
                return defpackage.tbo.KEY_OPA_PRIMARY_LANGUAGE;
            case 7:
                return defpackage.tbo.KEY_RAIL_INVOKED_MEDIA_REC_ENABLED;
            case 8:
                return defpackage.tbo.KEY_TRANSCRIPTION_ENABLED;
            case 9:
                return defpackage.tbo.KEY_DIRECT_REPLY_ENABLED;
            case 10:
                return defpackage.tbo.KEY_PROACTIVE_READ_MESSAGE_SUPPORTED;
            case 11:
                return defpackage.tbo.KEY_MESSAGE_SUMMARY_ENABLED;
        }
    }

    public static final int b(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 1 : 6;
        }
        return 5;
    }
}
