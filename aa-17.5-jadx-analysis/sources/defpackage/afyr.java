package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class afyr {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ afyr[] $VALUES;
    private final ahnd arrayClassId;
    private final ahnd classId;
    private final ahnj typeName;
    public static final afyr UBYTE = new afyr("UBYTE", 0, ahnd.Companion.fromString("kotlin/UByte", false & ((2 & 2) == 0)));
    public static final afyr USHORT = new afyr("USHORT", 1, ahnd.Companion.fromString("kotlin/UShort", false & ((2 & 2) == 0)));
    public static final afyr UINT = new afyr("UINT", 2, ahnd.Companion.fromString("kotlin/UInt", false & ((2 & 2) == 0)));
    public static final afyr ULONG = new afyr("ULONG", 3, ahnd.Companion.fromString("kotlin/ULong", false & ((2 & 2) == 0)));

    private static final /* synthetic */ afyr[] $values() {
        return new afyr[]{UBYTE, USHORT, UINT, ULONG};
    }

    static {
        afyr[] afyrVarArr$values = $values();
        $VALUES = afyrVarArr$values;
        $ENTRIES = affa.p(afyrVarArr$values);
    }

    private afyr(String str, int i, ahnd ahndVar) {
        this.classId = ahndVar;
        ahnj shortClassName = ahndVar.getShortClassName();
        this.typeName = shortClassName;
        this.arrayClassId = new ahnd(ahndVar.getPackageFqName(), ahnj.identifier(String.valueOf(shortClassName.asString()).concat("Array")));
    }

    public static afyr valueOf(String str) {
        return (afyr) Enum.valueOf(afyr.class, str);
    }

    public static afyr[] values() {
        return (afyr[]) $VALUES.clone();
    }

    public final ahnd getArrayClassId() {
        return this.arrayClassId;
    }

    public final ahnd getClassId() {
        return this.classId;
    }

    public final ahnj getTypeName() {
        return this.typeName;
    }
}
