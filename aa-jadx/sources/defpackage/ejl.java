package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ejl {
    DOUBLE(0, 1, defpackage.ejy.DOUBLE),
    FLOAT(1, 1, defpackage.ejy.FLOAT),
    INT64(2, 1, defpackage.ejy.LONG),
    UINT64(3, 1, defpackage.ejy.LONG),
    INT32(4, 1, defpackage.ejy.INT),
    FIXED64(5, 1, defpackage.ejy.LONG),
    FIXED32(6, 1, defpackage.ejy.INT),
    BOOL(7, 1, defpackage.ejy.BOOLEAN),
    STRING(8, 1, defpackage.ejy.STRING),
    MESSAGE(9, 1, defpackage.ejy.MESSAGE),
    BYTES(10, 1, defpackage.ejy.BYTE_STRING),
    UINT32(11, 1, defpackage.ejy.INT),
    ENUM(12, 1, defpackage.ejy.ENUM),
    SFIXED32(13, 1, defpackage.ejy.INT),
    SFIXED64(14, 1, defpackage.ejy.LONG),
    SINT32(15, 1, defpackage.ejy.INT),
    SINT64(16, 1, defpackage.ejy.LONG),
    GROUP(17, 1, defpackage.ejy.MESSAGE),
    DOUBLE_LIST(18, 2, defpackage.ejy.DOUBLE),
    FLOAT_LIST(19, 2, defpackage.ejy.FLOAT),
    INT64_LIST(20, 2, defpackage.ejy.LONG),
    UINT64_LIST(21, 2, defpackage.ejy.LONG),
    INT32_LIST(22, 2, defpackage.ejy.INT),
    FIXED64_LIST(23, 2, defpackage.ejy.LONG),
    FIXED32_LIST(24, 2, defpackage.ejy.INT),
    BOOL_LIST(25, 2, defpackage.ejy.BOOLEAN),
    STRING_LIST(26, 2, defpackage.ejy.STRING),
    MESSAGE_LIST(27, 2, defpackage.ejy.MESSAGE),
    BYTES_LIST(28, 2, defpackage.ejy.BYTE_STRING),
    UINT32_LIST(29, 2, defpackage.ejy.INT),
    ENUM_LIST(30, 2, defpackage.ejy.ENUM),
    SFIXED32_LIST(31, 2, defpackage.ejy.INT),
    SFIXED64_LIST(32, 2, defpackage.ejy.LONG),
    SINT32_LIST(33, 2, defpackage.ejy.INT),
    SINT64_LIST(34, 2, defpackage.ejy.LONG),
    DOUBLE_LIST_PACKED(35, 3, defpackage.ejy.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, defpackage.ejy.FLOAT),
    INT64_LIST_PACKED(37, 3, defpackage.ejy.LONG),
    UINT64_LIST_PACKED(38, 3, defpackage.ejy.LONG),
    INT32_LIST_PACKED(39, 3, defpackage.ejy.INT),
    FIXED64_LIST_PACKED(40, 3, defpackage.ejy.LONG),
    FIXED32_LIST_PACKED(41, 3, defpackage.ejy.INT),
    BOOL_LIST_PACKED(42, 3, defpackage.ejy.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, defpackage.ejy.INT),
    ENUM_LIST_PACKED(44, 3, defpackage.ejy.ENUM),
    SFIXED32_LIST_PACKED(45, 3, defpackage.ejy.INT),
    SFIXED64_LIST_PACKED(46, 3, defpackage.ejy.LONG),
    SINT32_LIST_PACKED(47, 3, defpackage.ejy.INT),
    SINT64_LIST_PACKED(48, 3, defpackage.ejy.LONG),
    GROUP_LIST(49, 2, defpackage.ejy.MESSAGE),
    MAP(50, 4, defpackage.ejy.VOID);

    private static final defpackage.ejl[] aa;
    public final int Z;

    static {
        defpackage.ejl[] ejlVarArrValues = values();
        aa = new defpackage.ejl[ejlVarArrValues.length];
        for (defpackage.ejl ejlVar : ejlVarArrValues) {
            aa[ejlVar.Z] = ejlVar;
        }
    }

    ejl(int i, int i2, defpackage.ejy ejyVar) {
        this.Z = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            java.lang.Class cls = ejyVar.k;
        }
        if (i2 == 1) {
            defpackage.ejy ejyVar2 = defpackage.ejy.VOID;
            ejyVar.ordinal();
        }
    }
}
