package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
abstract class aikt {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ aikt[] $VALUES;
    public static final aikt ACCEPT_NULL;
    public static final aikt NOT_NULL;
    public static final aikt START;
    public static final aikt UNKNOWN;

    private static final /* synthetic */ aikt[] $values() {
        return new aikt[]{START, ACCEPT_NULL, UNKNOWN, NOT_NULL};
    }

    static {
        final String str = "START";
        final int i = 0;
        START = new aikt(str, i) { // from class: aikr
            {
                afeu afeuVar = null;
            }

            @Override // defpackage.aikt
            public aikt combine(aijf aijfVar) {
                aijfVar.getClass();
                return getResultNullability(aijfVar);
            }
        };
        final String str2 = "ACCEPT_NULL";
        final int i2 = 1;
        ACCEPT_NULL = new aikt(str2, i2) { // from class: aikp
            {
                afeu afeuVar = null;
            }

            @Override // defpackage.aikt
            public aikt combine(aijf aijfVar) {
                aijfVar.getClass();
                return getResultNullability(aijfVar);
            }
        };
        final String str3 = "UNKNOWN";
        final int i3 = 2;
        UNKNOWN = new aikt(str3, i3) { // from class: aiks
            {
                afeu afeuVar = null;
            }

            @Override // defpackage.aikt
            public aikt combine(aijf aijfVar) {
                aijfVar.getClass();
                aikt resultNullability = getResultNullability(aijfVar);
                return resultNullability == aikt.ACCEPT_NULL ? this : resultNullability;
            }
        };
        final String str4 = "NOT_NULL";
        final int i4 = 3;
        NOT_NULL = new aikt(str4, i4) { // from class: aikq
            {
                afeu afeuVar = null;
            }

            @Override // defpackage.aikt
            public aikq combine(aijf aijfVar) {
                aijfVar.getClass();
                return this;
            }

            @Override // defpackage.aikt
            public /* bridge */ /* synthetic */ aikt combine(aijf aijfVar) {
                combine(aijfVar);
                return this;
            }
        };
        aikt[] aiktVarArr$values = $values();
        $VALUES = aiktVarArr$values;
        $ENTRIES = affa.p(aiktVarArr$values);
    }

    public /* synthetic */ aikt(String str, int i, afeu afeuVar) {
        this(str, i);
    }

    public static aikt valueOf(String str) {
        return (aikt) Enum.valueOf(aikt.class, str);
    }

    public static aikt[] values() {
        return (aikt[]) $VALUES.clone();
    }

    public abstract aikt combine(aijf aijfVar);

    protected final aikt getResultNullability(aijf aijfVar) {
        aijfVar.getClass();
        return aijfVar.isMarkedNullable() ? ACCEPT_NULL : ((aijfVar instanceof aifo) && (((aifo) aijfVar).getOriginal() instanceof aihg)) ? NOT_NULL : aijfVar instanceof aihg ? UNKNOWN : aikh.INSTANCE.isSubtypeOfAny(aijfVar) ? NOT_NULL : UNKNOWN;
    }

    private aikt(String str, int i) {
    }
}
