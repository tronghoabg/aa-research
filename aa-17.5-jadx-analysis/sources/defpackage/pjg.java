package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class pjg {
    public static final pjg a;
    public static final pjg b;
    public static final pjg c;
    public static final pjg d;
    private static final /* synthetic */ pjg[] e;

    static {
        pjg pjgVar = new pjg("NEW", 0);
        a = pjgVar;
        pjg pjgVar2 = new pjg("REGISTERING", 1);
        b = pjgVar2;
        pjg pjgVar3 = new pjg("ACTIVE", 2);
        c = pjgVar3;
        pjg pjgVar4 = new pjg("DESTROYED", 3);
        d = pjgVar4;
        e = new pjg[]{pjgVar, pjgVar2, pjgVar3, pjgVar4};
    }

    public static pjg valueOf(String str) {
        return (pjg) Enum.valueOf(pjg.class, str);
    }

    public static pjg[] values() {
        return (pjg[]) e.clone();
    }
}
