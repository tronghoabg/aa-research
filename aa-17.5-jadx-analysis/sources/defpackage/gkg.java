package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gkg {
    public static final gkg a;
    public static final gkg b;
    private static final /* synthetic */ gkg[] c;

    static {
        gkg gkgVar = new gkg("CENTER", 0);
        a = gkgVar;
        gkg gkgVar2 = new gkg("START", 1);
        b = gkgVar2;
        gkg[] gkgVarArr = {gkgVar, gkgVar2};
        c = gkgVarArr;
        affa.p(gkgVarArr);
    }

    public static gkg valueOf(String str) {
        return (gkg) Enum.valueOf(gkg.class, str);
    }

    public static gkg[] values() {
        return (gkg[]) c.clone();
    }
}
