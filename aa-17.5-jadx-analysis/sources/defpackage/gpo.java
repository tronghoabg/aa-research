package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gpo {
    public static final gpo a;
    public static final gpo b;
    public static final gpo c;
    private static final /* synthetic */ gpo[] d;

    static {
        gpo gpoVar = new gpo("WIDE", 0);
        a = gpoVar;
        gpo gpoVar2 = new gpo("VERY_WIDE", 1);
        b = gpoVar2;
        gpo gpoVar3 = new gpo("NORMAL", 2);
        c = gpoVar3;
        gpo[] gpoVarArr = {gpoVar, gpoVar2, gpoVar3};
        d = gpoVarArr;
        affa.p(gpoVarArr);
    }

    public static gpo valueOf(String str) {
        return (gpo) Enum.valueOf(gpo.class, str);
    }

    public static gpo[] values() {
        return (gpo[]) d.clone();
    }
}
