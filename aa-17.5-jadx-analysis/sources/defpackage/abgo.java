package defpackage;

/* loaded from: classes3.dex */
public enum abgo implements abnz {
    STATUS_OK(0),
    STATUS_NOT_FOUND(1),
    STATUS_BAD_REQUEST(2),
    STATUS_SERVER_ERROR(3),
    STATUS_IVSERVER_AMBIGUOUS_RESPONSE(4),
    STATUS_OK_EMPTY(5),
    STATUS_OK_DATA_UNCHANGED(6),
    STATUS_SERVICE_UNAVAILABLE(7),
    STATUS_INVALID_EPOCH(8);

    private final int k;

    abgo(int i) {
        this.k = i;
    }

    public static abgo b(int i) {
        switch (i) {
            case 0:
                return STATUS_OK;
            case 1:
                return STATUS_NOT_FOUND;
            case 2:
                return STATUS_BAD_REQUEST;
            case 3:
                return STATUS_SERVER_ERROR;
            case 4:
                return STATUS_IVSERVER_AMBIGUOUS_RESPONSE;
            case 5:
                return STATUS_OK_EMPTY;
            case 6:
                return STATUS_OK_DATA_UNCHANGED;
            case 7:
                return STATUS_SERVICE_UNAVAILABLE;
            case 8:
                return STATUS_INVALID_EPOCH;
            default:
                return null;
        }
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
