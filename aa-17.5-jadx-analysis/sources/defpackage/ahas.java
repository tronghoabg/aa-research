package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ahas {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ ahas[] $VALUES;
    public static final ahas READ_ONLY = new ahas("READ_ONLY", 0);
    public static final ahas MUTABLE = new ahas("MUTABLE", 1);

    private static final /* synthetic */ ahas[] $values() {
        return new ahas[]{READ_ONLY, MUTABLE};
    }

    static {
        ahas[] ahasVarArr$values = $values();
        $VALUES = ahasVarArr$values;
        $ENTRIES = affa.p(ahasVarArr$values);
    }

    private ahas(String str, int i) {
    }

    public static ahas valueOf(String str) {
        return (ahas) Enum.valueOf(ahas.class, str);
    }

    public static ahas[] values() {
        return (ahas[]) $VALUES.clone();
    }
}
