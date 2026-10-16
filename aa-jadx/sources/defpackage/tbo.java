package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum tbo implements defpackage.abpb {
    KEY_UNKNOWN_SETTING(0),
    KEY_HOTWORD_ENABLED(1),
    KEY_OPA_ENABLED(2),
    KEY_CURRENT_ACCOUNT_NAME(3),
    KEY_OPA_PRIMARY_LANGUAGE(4),
    KEY_RAIL_INVOKED_MEDIA_REC_ENABLED(5),
    KEY_TRANSCRIPTION_ENABLED(6),
    KEY_DIRECT_REPLY_ENABLED(7),
    KEY_PROACTIVE_READ_MESSAGE_SUPPORTED(8),
    KEY_MESSAGE_SUMMARY_ENABLED(9);

    public final int k;

    tbo(int i) {
        this.k = i;
    }

    public static defpackage.tbo b(int i) {
        switch (i) {
            case 0:
                return KEY_UNKNOWN_SETTING;
            case 1:
                return KEY_HOTWORD_ENABLED;
            case 2:
                return KEY_OPA_ENABLED;
            case 3:
                return KEY_CURRENT_ACCOUNT_NAME;
            case 4:
                return KEY_OPA_PRIMARY_LANGUAGE;
            case 5:
                return KEY_RAIL_INVOKED_MEDIA_REC_ENABLED;
            case 6:
                return KEY_TRANSCRIPTION_ENABLED;
            case 7:
                return KEY_DIRECT_REPLY_ENABLED;
            case 8:
                return KEY_PROACTIVE_READ_MESSAGE_SUPPORTED;
            case 9:
                return KEY_MESSAGE_SUMMARY_ENABLED;
            default:
                return null;
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.k);
    }
}
