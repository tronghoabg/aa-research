package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class afjf {
    public static final defpackage.afjf a;
    public static final defpackage.afjf b;
    public static final defpackage.afjf c;
    public static final defpackage.afjf d;
    private static final /* synthetic */ defpackage.afjf[] e;

    static {
        defpackage.afjf afjfVar = new defpackage.afjf("PUBLIC", 0);
        a = afjfVar;
        defpackage.afjf afjfVar2 = new defpackage.afjf("PROTECTED", 1);
        b = afjfVar2;
        defpackage.afjf afjfVar3 = new defpackage.afjf("INTERNAL", 2);
        c = afjfVar3;
        defpackage.afjf afjfVar4 = new defpackage.afjf("PRIVATE", 3);
        d = afjfVar4;
        defpackage.afjf[] afjfVarArr = {afjfVar, afjfVar2, afjfVar3, afjfVar4};
        e = afjfVarArr;
        defpackage.afga.p(afjfVarArr);
    }

    public static defpackage.afjf valueOf(java.lang.String str) {
        return (defpackage.afjf) java.lang.Enum.valueOf(defpackage.afjf.class, str);
    }

    public static defpackage.afjf[] values() {
        return (defpackage.afjf[]) e.clone();
    }
}
