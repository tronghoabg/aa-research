package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class aglr implements aglo {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ aglr[] $VALUES;
    public static final aglr FROM_IDE = new aglr("FROM_IDE", 0);
    public static final aglr FROM_BACKEND = new aglr("FROM_BACKEND", 1);
    public static final aglr FROM_TEST = new aglr("FROM_TEST", 2);
    public static final aglr FROM_BUILTINS = new aglr("FROM_BUILTINS", 3);
    public static final aglr WHEN_CHECK_DECLARATION_CONFLICTS = new aglr("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
    public static final aglr WHEN_CHECK_OVERRIDES = new aglr("WHEN_CHECK_OVERRIDES", 5);
    public static final aglr FOR_SCRIPT = new aglr("FOR_SCRIPT", 6);
    public static final aglr FROM_REFLECTION = new aglr("FROM_REFLECTION", 7);
    public static final aglr WHEN_RESOLVE_DECLARATION = new aglr("WHEN_RESOLVE_DECLARATION", 8);
    public static final aglr WHEN_GET_DECLARATION_SCOPE = new aglr("WHEN_GET_DECLARATION_SCOPE", 9);
    public static final aglr WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS = new aglr("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
    public static final aglr FOR_ALREADY_TRACKED = new aglr("FOR_ALREADY_TRACKED", 11);
    public static final aglr WHEN_GET_ALL_DESCRIPTORS = new aglr("WHEN_GET_ALL_DESCRIPTORS", 12);
    public static final aglr WHEN_TYPING = new aglr("WHEN_TYPING", 13);
    public static final aglr WHEN_GET_SUPER_MEMBERS = new aglr("WHEN_GET_SUPER_MEMBERS", 14);
    public static final aglr FOR_NON_TRACKED_SCOPE = new aglr("FOR_NON_TRACKED_SCOPE", 15);
    public static final aglr FROM_SYNTHETIC_SCOPE = new aglr("FROM_SYNTHETIC_SCOPE", 16);
    public static final aglr FROM_DESERIALIZATION = new aglr("FROM_DESERIALIZATION", 17);
    public static final aglr FROM_JAVA_LOADER = new aglr("FROM_JAVA_LOADER", 18);
    public static final aglr WHEN_GET_LOCAL_VARIABLE = new aglr("WHEN_GET_LOCAL_VARIABLE", 19);
    public static final aglr WHEN_FIND_BY_FQNAME = new aglr("WHEN_FIND_BY_FQNAME", 20);
    public static final aglr WHEN_GET_COMPANION_OBJECT = new aglr("WHEN_GET_COMPANION_OBJECT", 21);
    public static final aglr FOR_DEFAULT_IMPORTS = new aglr("FOR_DEFAULT_IMPORTS", 22);

    private static final /* synthetic */ aglr[] $values() {
        return new aglr[]{FROM_IDE, FROM_BACKEND, FROM_TEST, FROM_BUILTINS, WHEN_CHECK_DECLARATION_CONFLICTS, WHEN_CHECK_OVERRIDES, FOR_SCRIPT, FROM_REFLECTION, WHEN_RESOLVE_DECLARATION, WHEN_GET_DECLARATION_SCOPE, WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS, FOR_ALREADY_TRACKED, WHEN_GET_ALL_DESCRIPTORS, WHEN_TYPING, WHEN_GET_SUPER_MEMBERS, FOR_NON_TRACKED_SCOPE, FROM_SYNTHETIC_SCOPE, FROM_DESERIALIZATION, FROM_JAVA_LOADER, WHEN_GET_LOCAL_VARIABLE, WHEN_FIND_BY_FQNAME, WHEN_GET_COMPANION_OBJECT, FOR_DEFAULT_IMPORTS};
    }

    static {
        aglr[] aglrVarArr$values = $values();
        $VALUES = aglrVarArr$values;
        $ENTRIES = affa.p(aglrVarArr$values);
    }

    private aglr(String str, int i) {
    }

    public static aglr valueOf(String str) {
        return (aglr) Enum.valueOf(aglr.class, str);
    }

    public static aglr[] values() {
        return (aglr[]) $VALUES.clone();
    }

    @Override // defpackage.aglo
    public agln getLocation() {
        return null;
    }
}
