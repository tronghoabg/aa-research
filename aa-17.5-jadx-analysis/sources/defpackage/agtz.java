package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public class agtz {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agtz[] $VALUES;
    public static final agtz MAP_GET_OR_DEFAULT;
    private final Object defaultValue;
    public static final agtz NULL = new agtz("NULL", 0, null);
    public static final agtz INDEX = new agtz("INDEX", 1, -1);
    public static final agtz FALSE = new agtz("FALSE", 2, false);

    private static final /* synthetic */ agtz[] $values() {
        return new agtz[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
    }

    static {
        final String str = "MAP_GET_OR_DEFAULT";
        final int i = 3;
        MAP_GET_OR_DEFAULT = new agtz(str, i) { // from class: agty
            {
                afeu afeuVar = null;
            }
        };
        agtz[] agtzVarArr$values = $values();
        $VALUES = agtzVarArr$values;
        $ENTRIES = affa.p(agtzVarArr$values);
    }

    private agtz(String str, int i, Object obj) {
        this.defaultValue = obj;
    }

    public static agtz valueOf(String str) {
        return (agtz) Enum.valueOf(agtz.class, str);
    }

    public static agtz[] values() {
        return (agtz[]) $VALUES.clone();
    }

    public /* synthetic */ agtz(String str, int i, Object obj, afeu afeuVar) {
        this(str, i, obj);
    }
}
