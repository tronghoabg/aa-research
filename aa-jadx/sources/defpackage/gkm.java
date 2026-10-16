package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gkm {
    public static final defpackage.gkm a;
    public static final defpackage.gkm b;
    public static final defpackage.gkm c;
    public static final defpackage.gkm d;
    public static final defpackage.gkm e;
    private static final /* synthetic */ defpackage.gkm[] f;

    static {
        defpackage.gkm gkmVar = new defpackage.gkm("SMALL", 0);
        a = gkmVar;
        defpackage.gkm gkmVar2 = new defpackage.gkm("MEDIUM", 1);
        b = gkmVar2;
        defpackage.gkm gkmVar3 = new defpackage.gkm("LARGE", 2);
        c = gkmVar3;
        defpackage.gkm gkmVar4 = new defpackage.gkm("EXTRA_LARGE", 3);
        d = gkmVar4;
        defpackage.gkm gkmVar5 = new defpackage.gkm("LEGACY_PLACEHOLDER", 4);
        e = gkmVar5;
        defpackage.gkm[] gkmVarArr = {gkmVar, gkmVar2, gkmVar3, gkmVar4, gkmVar5};
        f = gkmVarArr;
        defpackage.afga.p(gkmVarArr);
    }

    public static defpackage.gkm valueOf(java.lang.String str) {
        return (defpackage.gkm) java.lang.Enum.valueOf(defpackage.gkm.class, str);
    }

    public static defpackage.gkm[] values() {
        return (defpackage.gkm[]) f.clone();
    }
}
