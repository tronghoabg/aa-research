package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class cja {
    public static final defpackage.cja a;
    public static final defpackage.cja b;
    public static final defpackage.cja c;
    public static final defpackage.cja d;
    private static final /* synthetic */ defpackage.cja[] e;

    static {
        defpackage.cja cjaVar = new defpackage.cja("Active", 0);
        a = cjaVar;
        defpackage.cja cjaVar2 = new defpackage.cja("ActiveParent", 1);
        b = cjaVar2;
        defpackage.cja cjaVar3 = new defpackage.cja("Captured", 2);
        c = cjaVar3;
        defpackage.cja cjaVar4 = new defpackage.cja("Inactive", 3);
        d = cjaVar4;
        defpackage.cja[] cjaVarArr = {cjaVar, cjaVar2, cjaVar3, cjaVar4};
        e = cjaVarArr;
        defpackage.afga.p(cjaVarArr);
    }

    public static defpackage.cja valueOf(java.lang.String str) {
        return (defpackage.cja) java.lang.Enum.valueOf(defpackage.cja.class, str);
    }

    public static defpackage.cja[] values() {
        return (defpackage.cja[]) e.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new defpackage.afas();
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
                throw new defpackage.afas();
            }
        }
        return true;
    }
}
