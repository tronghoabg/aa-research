package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ahht implements defpackage.ahpr {
    BYTE(0, 0),
    CHAR(1, 1),
    SHORT(2, 2),
    INT(3, 3),
    LONG(4, 4),
    FLOAT(5, 5),
    DOUBLE(6, 6),
    BOOLEAN(7, 7),
    STRING(8, 8),
    CLASS(9, 9),
    ENUM(10, 10),
    ANNOTATION(11, 11),
    ARRAY(12, 12);

    private static defpackage.ahps<defpackage.ahht> internalValueMap = new defpackage.ahps() { // from class: ahhs
        @Override // defpackage.ahps
        public defpackage.ahht findValueByNumber(int i) {
            return defpackage.ahht.valueOf(i);
        }
    };
    private final int value;

    ahht(int i, int i2) {
        this.value = i2;
    }

    public static defpackage.ahht valueOf(int i) {
        switch (i) {
            case 0:
                return BYTE;
            case 1:
                return CHAR;
            case 2:
                return SHORT;
            case 3:
                return INT;
            case 4:
                return LONG;
            case 5:
                return FLOAT;
            case 6:
                return DOUBLE;
            case 7:
                return BOOLEAN;
            case 8:
                return STRING;
            case 9:
                return CLASS;
            case 10:
                return ENUM;
            case 11:
                return ANNOTATION;
            case 12:
                return ARRAY;
            default:
                return null;
        }
    }

    @Override // defpackage.ahpr
    public final int getNumber() {
        return this.value;
    }
}
