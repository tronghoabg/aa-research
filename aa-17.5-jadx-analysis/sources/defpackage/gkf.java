package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gkf {
    public static final gkf a;
    public static final gkf b;
    public static final gkf c;
    public static final gkf d;
    public static final gkf e;
    private static final /* synthetic */ gkf[] f;

    static {
        gkf gkfVar = new gkf("SMALL", 0);
        a = gkfVar;
        gkf gkfVar2 = new gkf("MEDIUM", 1);
        b = gkfVar2;
        gkf gkfVar3 = new gkf("LARGE", 2);
        c = gkfVar3;
        gkf gkfVar4 = new gkf("EXTRA_LARGE", 3);
        d = gkfVar4;
        gkf gkfVar5 = new gkf("LEGACY_PLACEHOLDER", 4);
        e = gkfVar5;
        gkf[] gkfVarArr = {gkfVar, gkfVar2, gkfVar3, gkfVar4, gkfVar5};
        f = gkfVarArr;
        affa.p(gkfVarArr);
    }

    public static gkf valueOf(String str) {
        return (gkf) Enum.valueOf(gkf.class, str);
    }

    public static gkf[] values() {
        return (gkf[]) f.clone();
    }
}
