package defpackage;

/* loaded from: classes2.dex */
public final class pml extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public pml(int i, Throwable th) {
        String str;
        switch (i) {
            case 2:
                str = "SUCCESS_CHECKSUM_DISABLED";
                break;
            case 3:
                str = "FAILED_BAD_CHECKSUM";
                break;
            case 4:
                str = "FAILED_ERROR_READING_CHECKSUM";
                break;
            case 5:
                str = "FAILED_PARSE_ERROR";
                break;
            case 6:
                str = "FAILED_NO_FILE";
                break;
            case 7:
                str = "SUCCESS_WITH_CHECKSUM_V1";
                break;
            case 8:
                str = "FAILED_IO_ERROR";
                break;
            default:
                str = "FAILED_NO_CHECKSUM";
                break;
        }
        super("Error loading: ".concat(str), th);
    }
}
