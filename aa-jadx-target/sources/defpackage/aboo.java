package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum aboo {
    DOUBLE(0, 1, defpackage.abpr.DOUBLE),
    FLOAT(1, 1, defpackage.abpr.FLOAT),
    INT64(2, 1, defpackage.abpr.LONG),
    UINT64(3, 1, defpackage.abpr.LONG),
    INT32(4, 1, defpackage.abpr.INT),
    FIXED64(5, 1, defpackage.abpr.LONG),
    FIXED32(6, 1, defpackage.abpr.INT),
    BOOL(7, 1, defpackage.abpr.BOOLEAN),
    STRING(8, 1, defpackage.abpr.STRING),
    MESSAGE(9, 1, defpackage.abpr.MESSAGE),
    BYTES(10, 1, defpackage.abpr.BYTE_STRING),
    UINT32(11, 1, defpackage.abpr.INT),
    ENUM(12, 1, defpackage.abpr.ENUM),
    SFIXED32(13, 1, defpackage.abpr.INT),
    SFIXED64(14, 1, defpackage.abpr.LONG),
    SINT32(15, 1, defpackage.abpr.INT),
    SINT64(16, 1, defpackage.abpr.LONG),
    GROUP(17, 1, defpackage.abpr.MESSAGE),
    DOUBLE_LIST(18, 2, defpackage.abpr.DOUBLE),
    FLOAT_LIST(19, 2, defpackage.abpr.FLOAT),
    INT64_LIST(20, 2, defpackage.abpr.LONG),
    UINT64_LIST(21, 2, defpackage.abpr.LONG),
    INT32_LIST(22, 2, defpackage.abpr.INT),
    FIXED64_LIST(23, 2, defpackage.abpr.LONG),
    FIXED32_LIST(24, 2, defpackage.abpr.INT),
    BOOL_LIST(25, 2, defpackage.abpr.BOOLEAN),
    STRING_LIST(26, 2, defpackage.abpr.STRING),
    MESSAGE_LIST(27, 2, defpackage.abpr.MESSAGE),
    BYTES_LIST(28, 2, defpackage.abpr.BYTE_STRING),
    UINT32_LIST(29, 2, defpackage.abpr.INT),
    ENUM_LIST(30, 2, defpackage.abpr.ENUM),
    SFIXED32_LIST(31, 2, defpackage.abpr.INT),
    SFIXED64_LIST(32, 2, defpackage.abpr.LONG),
    SINT32_LIST(33, 2, defpackage.abpr.INT),
    SINT64_LIST(34, 2, defpackage.abpr.LONG),
    DOUBLE_LIST_PACKED(35, 3, defpackage.abpr.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, defpackage.abpr.FLOAT),
    INT64_LIST_PACKED(37, 3, defpackage.abpr.LONG),
    UINT64_LIST_PACKED(38, 3, defpackage.abpr.LONG),
    INT32_LIST_PACKED(39, 3, defpackage.abpr.INT),
    FIXED64_LIST_PACKED(40, 3, defpackage.abpr.LONG),
    FIXED32_LIST_PACKED(41, 3, defpackage.abpr.INT),
    BOOL_LIST_PACKED(42, 3, defpackage.abpr.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, defpackage.abpr.INT),
    ENUM_LIST_PACKED(44, 3, defpackage.abpr.ENUM),
    SFIXED32_LIST_PACKED(45, 3, defpackage.abpr.INT),
    SFIXED64_LIST_PACKED(46, 3, defpackage.abpr.LONG),
    SINT32_LIST_PACKED(47, 3, defpackage.abpr.INT),
    SINT64_LIST_PACKED(48, 3, defpackage.abpr.LONG),
    GROUP_LIST(49, 2, defpackage.abpr.MESSAGE),
    MAP(50, 4, defpackage.abpr.VOID);

    private static final defpackage.aboo[] aa;
    public final int Z;

    static {
        defpackage.aboo[] abooVarArrValues = values();
        aa = new defpackage.aboo[abooVarArrValues.length];
        for (defpackage.aboo abooVar : abooVarArrValues) {
            aa[abooVar.Z] = abooVar;
        }
    }

    aboo(int i, int i2, defpackage.abpr abprVar) {
        this.Z = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            java.lang.Class cls = abprVar.k;
        }
        if (i2 == 1) {
            defpackage.abpr abprVar2 = defpackage.abpr.VOID;
            abprVar.ordinal();
        }
    }
}
