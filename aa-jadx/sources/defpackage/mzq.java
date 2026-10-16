package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mzq {
    public static final defpackage.mzq a;
    public static final defpackage.mzq b;
    public static final defpackage.mzq c;
    public static final defpackage.mzq d;
    public static final defpackage.mzq e;
    private static final /* synthetic */ defpackage.mzq[] f;

    static {
        defpackage.mzq mzqVar = new defpackage.mzq("NO_APP", 0);
        a = mzqVar;
        defpackage.mzq mzqVar2 = new defpackage.mzq("LOADING", 1);
        b = mzqVar2;
        defpackage.mzq mzqVar3 = new defpackage.mzq("VALID_MEDIA", 2);
        c = mzqVar3;
        defpackage.mzq mzqVar4 = new defpackage.mzq("INVALID_MEDIA", 3);
        d = mzqVar4;
        defpackage.mzq mzqVar5 = new defpackage.mzq("SUGGESTION_AVAILABLE", 4);
        e = mzqVar5;
        defpackage.mzq[] mzqVarArr = {mzqVar, mzqVar2, mzqVar3, mzqVar4, mzqVar5};
        f = mzqVarArr;
        defpackage.afga.p(mzqVarArr);
    }

    public static defpackage.mzq valueOf(java.lang.String str) {
        return (defpackage.mzq) java.lang.Enum.valueOf(defpackage.mzq.class, str);
    }

    public static defpackage.mzq[] values() {
        return (defpackage.mzq[]) f.clone();
    }
}
