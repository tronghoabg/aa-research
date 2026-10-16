package defpackage;

/* loaded from: classes2.dex */
public enum oxe {
    NONE(0),
    MODAL(1),
    MULTIMOVE_MODAL(2);

    private final int e;

    oxe(int i) {
        this.e = i;
    }

    public static int a(oxe oxeVar) {
        int iOrdinal = oxeVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 2;
        }
        throw new IllegalArgumentException("Unsupported type: ".concat(String.valueOf(String.valueOf(oxeVar))));
    }

    public static oxe b(int i, oxe oxeVar) {
        for (oxe oxeVar2 : values()) {
            if (oxeVar2.e == i) {
                return oxeVar2;
            }
        }
        return oxeVar;
    }
}
