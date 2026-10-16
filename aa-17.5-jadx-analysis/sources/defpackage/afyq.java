package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class afyq {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ afyq[] $VALUES;
    private final ahnd classId;
    private final ahnj typeName;
    public static final afyq UBYTEARRAY = new afyq("UBYTEARRAY", 0, ahnd.Companion.fromString("kotlin/UByteArray", false & ((2 & 2) == 0)));
    public static final afyq USHORTARRAY = new afyq("USHORTARRAY", 1, ahnd.Companion.fromString("kotlin/UShortArray", false & ((2 & 2) == 0)));
    public static final afyq UINTARRAY = new afyq("UINTARRAY", 2, ahnd.Companion.fromString("kotlin/UIntArray", false & ((2 & 2) == 0)));
    public static final afyq ULONGARRAY = new afyq("ULONGARRAY", 3, ahnd.Companion.fromString("kotlin/ULongArray", false & ((2 & 2) == 0)));

    private static final /* synthetic */ afyq[] $values() {
        return new afyq[]{UBYTEARRAY, USHORTARRAY, UINTARRAY, ULONGARRAY};
    }

    static {
        afyq[] afyqVarArr$values = $values();
        $VALUES = afyqVarArr$values;
        $ENTRIES = affa.p(afyqVarArr$values);
    }

    private afyq(String str, int i, ahnd ahndVar) {
        this.classId = ahndVar;
        this.typeName = ahndVar.getShortClassName();
    }

    public static afyq valueOf(String str) {
        return (afyq) Enum.valueOf(afyq.class, str);
    }

    public static afyq[] values() {
        return (afyq[]) $VALUES.clone();
    }

    public final ahnj getTypeName() {
        return this.typeName;
    }
}
