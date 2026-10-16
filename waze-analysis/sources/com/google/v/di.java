package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum di {
    DOUBLE(0, 1, fa.f12938e),
    FLOAT(1, 1, fa.f12937d),
    INT64(2, 1, fa.f12936c),
    UINT64(3, 1, fa.f12936c),
    INT32(4, 1, fa.f12935b),
    FIXED64(5, 1, fa.f12936c),
    FIXED32(6, 1, fa.f12935b),
    BOOL(7, 1, fa.f12939f),
    STRING(8, 1, fa.f12940g),
    MESSAGE(9, 1, fa.f12943j),
    BYTES(10, 1, fa.f12941h),
    UINT32(11, 1, fa.f12935b),
    ENUM(12, 1, fa.f12942i),
    SFIXED32(13, 1, fa.f12935b),
    SFIXED64(14, 1, fa.f12936c),
    SINT32(15, 1, fa.f12935b),
    SINT64(16, 1, fa.f12936c),
    GROUP(17, 1, fa.f12943j),
    DOUBLE_LIST(18, 2, fa.f12938e),
    FLOAT_LIST(19, 2, fa.f12937d),
    INT64_LIST(20, 2, fa.f12936c),
    UINT64_LIST(21, 2, fa.f12936c),
    INT32_LIST(22, 2, fa.f12935b),
    FIXED64_LIST(23, 2, fa.f12936c),
    FIXED32_LIST(24, 2, fa.f12935b),
    BOOL_LIST(25, 2, fa.f12939f),
    STRING_LIST(26, 2, fa.f12940g),
    MESSAGE_LIST(27, 2, fa.f12943j),
    BYTES_LIST(28, 2, fa.f12941h),
    UINT32_LIST(29, 2, fa.f12935b),
    ENUM_LIST(30, 2, fa.f12942i),
    SFIXED32_LIST(31, 2, fa.f12935b),
    SFIXED64_LIST(32, 2, fa.f12936c),
    SINT32_LIST(33, 2, fa.f12935b),
    SINT64_LIST(34, 2, fa.f12936c),
    DOUBLE_LIST_PACKED(35, 3, fa.f12938e),
    FLOAT_LIST_PACKED(36, 3, fa.f12937d),
    INT64_LIST_PACKED(37, 3, fa.f12936c),
    UINT64_LIST_PACKED(38, 3, fa.f12936c),
    INT32_LIST_PACKED(39, 3, fa.f12935b),
    FIXED64_LIST_PACKED(40, 3, fa.f12936c),
    FIXED32_LIST_PACKED(41, 3, fa.f12935b),
    BOOL_LIST_PACKED(42, 3, fa.f12939f),
    UINT32_LIST_PACKED(43, 3, fa.f12935b),
    ENUM_LIST_PACKED(44, 3, fa.f12942i),
    SFIXED32_LIST_PACKED(45, 3, fa.f12935b),
    SFIXED64_LIST_PACKED(46, 3, fa.f12936c),
    SINT32_LIST_PACKED(47, 3, fa.f12935b),
    SINT64_LIST_PACKED(48, 3, fa.f12936c),
    GROUP_LIST(49, 2, fa.f12943j),
    MAP(50, 4, fa.f12934a);

    private static final di[] Z;
    private final int ab;

    static {
        di[] diVarArrValues = values();
        Z = new di[diVarArrValues.length];
        for (di diVar : diVarArrValues) {
            Z[diVar.ab] = diVar;
        }
    }

    di(int i2, int i3, fa faVar) {
        this.ab = i2;
        if (i3 == 1) {
            fa faVar2 = fa.f12934a;
            faVar.ordinal();
        }
    }

    public final int a() {
        return this.ab;
    }
}
