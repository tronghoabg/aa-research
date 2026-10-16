package defpackage;

/* loaded from: classes.dex */
public enum abnm {
    DOUBLE(0, 1, abop.DOUBLE),
    FLOAT(1, 1, abop.FLOAT),
    INT64(2, 1, abop.LONG),
    UINT64(3, 1, abop.LONG),
    INT32(4, 1, abop.INT),
    FIXED64(5, 1, abop.LONG),
    FIXED32(6, 1, abop.INT),
    BOOL(7, 1, abop.BOOLEAN),
    STRING(8, 1, abop.STRING),
    MESSAGE(9, 1, abop.MESSAGE),
    BYTES(10, 1, abop.BYTE_STRING),
    UINT32(11, 1, abop.INT),
    ENUM(12, 1, abop.ENUM),
    SFIXED32(13, 1, abop.INT),
    SFIXED64(14, 1, abop.LONG),
    SINT32(15, 1, abop.INT),
    SINT64(16, 1, abop.LONG),
    GROUP(17, 1, abop.MESSAGE),
    DOUBLE_LIST(18, 2, abop.DOUBLE),
    FLOAT_LIST(19, 2, abop.FLOAT),
    INT64_LIST(20, 2, abop.LONG),
    UINT64_LIST(21, 2, abop.LONG),
    INT32_LIST(22, 2, abop.INT),
    FIXED64_LIST(23, 2, abop.LONG),
    FIXED32_LIST(24, 2, abop.INT),
    BOOL_LIST(25, 2, abop.BOOLEAN),
    STRING_LIST(26, 2, abop.STRING),
    MESSAGE_LIST(27, 2, abop.MESSAGE),
    BYTES_LIST(28, 2, abop.BYTE_STRING),
    UINT32_LIST(29, 2, abop.INT),
    ENUM_LIST(30, 2, abop.ENUM),
    SFIXED32_LIST(31, 2, abop.INT),
    SFIXED64_LIST(32, 2, abop.LONG),
    SINT32_LIST(33, 2, abop.INT),
    SINT64_LIST(34, 2, abop.LONG),
    DOUBLE_LIST_PACKED(35, 3, abop.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, abop.FLOAT),
    INT64_LIST_PACKED(37, 3, abop.LONG),
    UINT64_LIST_PACKED(38, 3, abop.LONG),
    INT32_LIST_PACKED(39, 3, abop.INT),
    FIXED64_LIST_PACKED(40, 3, abop.LONG),
    FIXED32_LIST_PACKED(41, 3, abop.INT),
    BOOL_LIST_PACKED(42, 3, abop.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, abop.INT),
    ENUM_LIST_PACKED(44, 3, abop.ENUM),
    SFIXED32_LIST_PACKED(45, 3, abop.INT),
    SFIXED64_LIST_PACKED(46, 3, abop.LONG),
    SINT32_LIST_PACKED(47, 3, abop.INT),
    SINT64_LIST_PACKED(48, 3, abop.LONG),
    GROUP_LIST(49, 2, abop.MESSAGE),
    MAP(50, 4, abop.VOID);

    private static final abnm[] aa;
    public final int Z;

    static {
        abnm[] abnmVarArrValues = values();
        aa = new abnm[abnmVarArrValues.length];
        for (abnm abnmVar : abnmVarArrValues) {
            aa[abnmVar.Z] = abnmVar;
        }
    }

    abnm(int i, int i2, abop abopVar) {
        this.Z = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            Class cls = abopVar.k;
        }
        if (i2 == 1) {
            abop abopVar2 = abop.VOID;
            abopVar.ordinal();
        }
    }
}
