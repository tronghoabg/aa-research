package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class huh {
    public static final defpackage.huh a;
    public static final defpackage.huh b;
    public static final defpackage.huh c;
    public static final defpackage.huh d;
    private static final /* synthetic */ defpackage.huh[] e;

    static {
        defpackage.huh huhVar = new defpackage.huh("CLEARED", 0);
        a = huhVar;
        defpackage.huh huhVar2 = new defpackage.huh("RUNNING", 1);
        b = huhVar2;
        defpackage.huh huhVar3 = new defpackage.huh("SUCCEEDED", 2);
        c = huhVar3;
        defpackage.huh huhVar4 = new defpackage.huh("FAILED", 3);
        d = huhVar4;
        defpackage.huh[] huhVarArr = {huhVar, huhVar2, huhVar3, huhVar4};
        e = huhVarArr;
        defpackage.afga.p(huhVarArr);
    }

    public static defpackage.huh valueOf(java.lang.String str) {
        return (defpackage.huh) java.lang.Enum.valueOf(defpackage.huh.class, str);
    }

    public static defpackage.huh[] values() {
        return (defpackage.huh[]) e.clone();
    }
}
