package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.zkg(a = defpackage.zke.a)
public final class jmk {
    public static final defpackage.jmk a;
    public static final defpackage.jmk b;
    public static final defpackage.jmk c;
    public static final defpackage.jmk d;
    public static final defpackage.jmk e;
    private static final /* synthetic */ defpackage.jmk[] f;

    static {
        defpackage.jmk jmkVar = new defpackage.jmk("ASSOCIATING", 0);
        a = jmkVar;
        defpackage.jmk jmkVar2 = new defpackage.jmk("ABSENT", 1);
        b = jmkVar2;
        defpackage.jmk jmkVar3 = new defpackage.jmk("APPEARING", 2);
        c = jmkVar3;
        defpackage.jmk jmkVar4 = new defpackage.jmk("PRESENT", 3);
        d = jmkVar4;
        defpackage.jmk jmkVar5 = new defpackage.jmk("DISAPPEARING", 4);
        e = jmkVar5;
        defpackage.jmk[] jmkVarArr = {jmkVar, jmkVar2, jmkVar3, jmkVar4, jmkVar5};
        f = jmkVarArr;
        defpackage.afga.p(jmkVarArr);
    }

    public static defpackage.jmk valueOf(java.lang.String str) {
        return (defpackage.jmk) java.lang.Enum.valueOf(defpackage.jmk.class, str);
    }

    public static defpackage.jmk[] values() {
        return (defpackage.jmk[]) f.clone();
    }
}
