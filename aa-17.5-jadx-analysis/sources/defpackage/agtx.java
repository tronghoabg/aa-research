package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class agtx {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ agtx[] $VALUES;
    private final boolean isObjectReplacedWithTypeParameter;
    private final String valueParametersSignature;
    public static final agtx ONE_COLLECTION_PARAMETER = new agtx("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);
    public static final agtx OBJECT_PARAMETER_NON_GENERIC = new agtx("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);
    public static final agtx OBJECT_PARAMETER_GENERIC = new agtx("OBJECT_PARAMETER_GENERIC", 2, "Ljava/lang/Object;", true);

    private static final /* synthetic */ agtx[] $values() {
        return new agtx[]{ONE_COLLECTION_PARAMETER, OBJECT_PARAMETER_NON_GENERIC, OBJECT_PARAMETER_GENERIC};
    }

    static {
        agtx[] agtxVarArr$values = $values();
        $VALUES = agtxVarArr$values;
        $ENTRIES = affa.p(agtxVarArr$values);
    }

    private agtx(String str, int i, String str2, boolean z) {
        this.valueParametersSignature = str2;
        this.isObjectReplacedWithTypeParameter = z;
    }

    public static agtx valueOf(String str) {
        return (agtx) Enum.valueOf(agtx.class, str);
    }

    public static agtx[] values() {
        return (agtx[]) $VALUES.clone();
    }
}
