package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class epr {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ epr[] $VALUES;
    public static final epq Companion;
    public static final epr ON_ANY;
    public static final epr ON_CREATE;
    public static final epr ON_DESTROY;
    public static final epr ON_PAUSE;
    public static final epr ON_RESUME;
    public static final epr ON_START;
    public static final epr ON_STOP;

    static {
        epr eprVar = new epr("ON_CREATE", 0);
        ON_CREATE = eprVar;
        epr eprVar2 = new epr("ON_START", 1);
        ON_START = eprVar2;
        epr eprVar3 = new epr("ON_RESUME", 2);
        ON_RESUME = eprVar3;
        epr eprVar4 = new epr("ON_PAUSE", 3);
        ON_PAUSE = eprVar4;
        epr eprVar5 = new epr("ON_STOP", 4);
        ON_STOP = eprVar5;
        epr eprVar6 = new epr("ON_DESTROY", 5);
        ON_DESTROY = eprVar6;
        epr eprVar7 = new epr("ON_ANY", 6);
        ON_ANY = eprVar7;
        epr[] eprVarArr = {eprVar, eprVar2, eprVar3, eprVar4, eprVar5, eprVar6, eprVar7};
        $VALUES = eprVarArr;
        $ENTRIES = affa.p(eprVarArr);
        Companion = new epq();
    }

    public static epr valueOf(String str) {
        return (epr) Enum.valueOf(epr.class, str);
    }

    public static epr[] values() {
        return (epr[]) $VALUES.clone();
    }

    public final eps a() {
        switch (ordinal()) {
            case 0:
            case 4:
                return eps.c;
            case 1:
            case 3:
                return eps.d;
            case 2:
                return eps.e;
            case 5:
                return eps.a;
            case 6:
                toString();
                throw new IllegalArgumentException(toString().concat(" has no target state"));
            default:
                throw new aezs();
        }
    }
}
