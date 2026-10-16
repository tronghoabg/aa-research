package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class nti {
    public static final defpackage.nti a;
    public static final defpackage.nti b;
    public static final defpackage.nti c;
    public static final defpackage.nti d;
    public static final defpackage.nti e;
    public static final defpackage.nti f;
    public static final defpackage.nti g;
    public static final defpackage.nti h;
    private static final /* synthetic */ defpackage.nti[] i;

    static {
        defpackage.nti ntiVar = new defpackage.nti("CANONICAL", 0);
        a = ntiVar;
        defpackage.nti ntiVar2 = new defpackage.nti("CLUSTER", 1);
        b = ntiVar2;
        defpackage.nti ntiVar3 = new defpackage.nti("CLUSTER_WITH_LAUNCHER", 2);
        c = ntiVar3;
        defpackage.nti ntiVar4 = new defpackage.nti("AUXILIARY", 3);
        d = ntiVar4;
        defpackage.nti ntiVar5 = new defpackage.nti("WIDESCREEN", 4);
        e = ntiVar5;
        defpackage.nti ntiVar6 = new defpackage.nti("PORTRAIT", 5);
        f = ntiVar6;
        defpackage.nti ntiVar7 = new defpackage.nti("PORTRAIT_SHORT", 6);
        g = ntiVar7;
        defpackage.nti ntiVar8 = new defpackage.nti("PORTRAIT_NARROW", 7);
        h = ntiVar8;
        i = new defpackage.nti[]{ntiVar, ntiVar2, ntiVar3, ntiVar4, ntiVar5, ntiVar6, ntiVar7, ntiVar8};
    }

    public static defpackage.nti valueOf(java.lang.String str) {
        return (defpackage.nti) java.lang.Enum.valueOf(defpackage.nti.class, str);
    }

    public static defpackage.nti[] values() {
        return (defpackage.nti[]) i.clone();
    }
}
