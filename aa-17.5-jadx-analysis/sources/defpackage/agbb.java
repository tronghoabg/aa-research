package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agbb {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agbb[] $VALUES;
    private final String codeRepresentation;
    public static final agbb CLASS = new agbb("CLASS", 0, "class");
    public static final agbb INTERFACE = new agbb("INTERFACE", 1, "interface");
    public static final agbb ENUM_CLASS = new agbb("ENUM_CLASS", 2, "enum class");
    public static final agbb ENUM_ENTRY = new agbb("ENUM_ENTRY", 3, null);
    public static final agbb ANNOTATION_CLASS = new agbb("ANNOTATION_CLASS", 4, "annotation class");
    public static final agbb OBJECT = new agbb("OBJECT", 5, "object");

    private static final /* synthetic */ agbb[] $values() {
        return new agbb[]{CLASS, INTERFACE, ENUM_CLASS, ENUM_ENTRY, ANNOTATION_CLASS, OBJECT};
    }

    static {
        agbb[] agbbVarArr$values = $values();
        $VALUES = agbbVarArr$values;
        $ENTRIES = affa.p(agbbVarArr$values);
    }

    private agbb(String str, int i, String str2) {
        this.codeRepresentation = str2;
    }

    public static agbb valueOf(String str) {
        return (agbb) Enum.valueOf(agbb.class, str);
    }

    public static agbb[] values() {
        return (agbb[]) $VALUES.clone();
    }

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
