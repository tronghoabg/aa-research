package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gkz {
    public static final gkz a;
    public static final gkz b;
    public static final gkz c;
    public static final /* synthetic */ afdf d;
    private static final /* synthetic */ gkz[] f;
    public final String e;

    static {
        gkz gkzVar = new gkz("TOLLS", 0, "t");
        a = gkzVar;
        gkz gkzVar2 = new gkz("HIGHWAYS", 1, "h");
        b = gkzVar2;
        gkz gkzVar3 = new gkz("FERRIES", 2, "f");
        c = gkzVar3;
        gkz[] gkzVarArr = {gkzVar, gkzVar2, gkzVar3};
        f = gkzVarArr;
        d = affa.p(gkzVarArr);
    }

    private gkz(String str, int i, String str2) {
        this.e = str2;
    }

    public static gkz valueOf(String str) {
        return (gkz) Enum.valueOf(gkz.class, str);
    }

    public static gkz[] values() {
        return (gkz[]) f.clone();
    }
}
