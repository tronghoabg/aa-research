package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nnk {
    public static final defpackage.nnk a;
    public static final defpackage.nnk b;
    public static final defpackage.nnk c;
    public static final defpackage.nnk d;
    public static final defpackage.nnk e;
    private static final /* synthetic */ defpackage.nnk[] f;

    static {
        defpackage.nnk nnkVar = new defpackage.nnk("NONE", 0);
        a = nnkVar;
        defpackage.nnk nnkVar2 = new defpackage.nnk("PRIMARY", 1);
        b = nnkVar2;
        defpackage.nnk nnkVar3 = new defpackage.nnk("LEFT", 2);
        c = nnkVar3;
        defpackage.nnk nnkVar4 = new defpackage.nnk("CENTER", 3);
        d = nnkVar4;
        defpackage.nnk nnkVar5 = new defpackage.nnk("RIGHT", 4);
        e = nnkVar5;
        defpackage.nnk[] nnkVarArr = {nnkVar, nnkVar2, nnkVar3, nnkVar4, nnkVar5};
        f = nnkVarArr;
        defpackage.afga.p(nnkVarArr);
    }

    public static defpackage.nnk valueOf(java.lang.String str) {
        return (defpackage.nnk) java.lang.Enum.valueOf(defpackage.nnk.class, str);
    }

    public static defpackage.nnk[] values() {
        return (defpackage.nnk[]) f.clone();
    }
}
