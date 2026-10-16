package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum go implements com.google.v.eg {
    NOT_ALLOWED(1),
    LOGGED(2),
    UPDATED(3),
    APPROVED(4),
    REJECTED(5),
    CREATED(6),
    DELETED(7),
    MOVED(8),
    CREATED_PENDING_APPROVAL(9),
    NOT_FOUND(10),
    ALREADY_APPROVED(11),
    NO_CHANGE(12),
    ERROR(13);

    private final int o;

    go(int i2) {
        this.o = i2;
    }

    public static go a(int i2) {
        switch (i2) {
            case 1:
                return NOT_ALLOWED;
            case 2:
                return LOGGED;
            case 3:
                return UPDATED;
            case 4:
                return APPROVED;
            case 5:
                return REJECTED;
            case 6:
                return CREATED;
            case 7:
                return DELETED;
            case 8:
                return MOVED;
            case 9:
                return CREATED_PENDING_APPROVAL;
            case 10:
                return NOT_FOUND;
            case 11:
                return ALREADY_APPROVED;
            case 12:
                return NO_CHANGE;
            case 13:
                return ERROR;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
