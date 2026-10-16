package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cis {
    public static final cis a;
    public static final cis b;
    public static final cis c;
    public static final cis d;
    private static final /* synthetic */ cis[] e;

    static {
        cis cisVar = new cis("Active", 0);
        a = cisVar;
        cis cisVar2 = new cis("ActiveParent", 1);
        b = cisVar2;
        cis cisVar3 = new cis("Captured", 2);
        c = cisVar3;
        cis cisVar4 = new cis("Inactive", 3);
        d = cisVar4;
        cis[] cisVarArr = {cisVar, cisVar2, cisVar3, cisVar4};
        e = cisVarArr;
        affa.p(cisVarArr);
    }

    public static cis valueOf(String str) {
        return (cis) Enum.valueOf(cis.class, str);
    }

    public static cis[] values() {
        return (cis[]) e.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new aezs();
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new aezs();
            }
        }
        return true;
    }
}
