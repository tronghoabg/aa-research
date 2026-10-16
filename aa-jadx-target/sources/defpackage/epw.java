package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class epw {
    private static final /* synthetic */ defpackage.afef $ENTRIES;
    private static final /* synthetic */ defpackage.epw[] $VALUES;
    public static final defpackage.epv Companion;
    public static final defpackage.epw ON_ANY;
    public static final defpackage.epw ON_CREATE;
    public static final defpackage.epw ON_DESTROY;
    public static final defpackage.epw ON_PAUSE;
    public static final defpackage.epw ON_RESUME;
    public static final defpackage.epw ON_START;
    public static final defpackage.epw ON_STOP;

    static {
        defpackage.epw epwVar = new defpackage.epw("ON_CREATE", 0);
        ON_CREATE = epwVar;
        defpackage.epw epwVar2 = new defpackage.epw("ON_START", 1);
        ON_START = epwVar2;
        defpackage.epw epwVar3 = new defpackage.epw("ON_RESUME", 2);
        ON_RESUME = epwVar3;
        defpackage.epw epwVar4 = new defpackage.epw("ON_PAUSE", 3);
        ON_PAUSE = epwVar4;
        defpackage.epw epwVar5 = new defpackage.epw("ON_STOP", 4);
        ON_STOP = epwVar5;
        defpackage.epw epwVar6 = new defpackage.epw("ON_DESTROY", 5);
        ON_DESTROY = epwVar6;
        defpackage.epw epwVar7 = new defpackage.epw("ON_ANY", 6);
        ON_ANY = epwVar7;
        defpackage.epw[] epwVarArr = {epwVar, epwVar2, epwVar3, epwVar4, epwVar5, epwVar6, epwVar7};
        $VALUES = epwVarArr;
        $ENTRIES = defpackage.afga.p(epwVarArr);
        Companion = new defpackage.epv();
    }

    public static defpackage.epw valueOf(java.lang.String str) {
        return (defpackage.epw) java.lang.Enum.valueOf(defpackage.epw.class, str);
    }

    public static defpackage.epw[] values() {
        return (defpackage.epw[]) $VALUES.clone();
    }

    public final defpackage.epx a() {
        switch (ordinal()) {
            case defpackage.abnt.b /* 0 */:
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.epx.c;
            case 1:
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return defpackage.epx.d;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return defpackage.epx.e;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.epx.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                toString();
                throw new java.lang.IllegalArgumentException(toString().concat(" has no target state"));
            default:
                throw new defpackage.afas();
        }
    }
}
