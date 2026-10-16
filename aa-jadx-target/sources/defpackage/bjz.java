package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bjz {
    public static final defpackage.bjz a;
    public static final defpackage.bjz b;
    public static final defpackage.bjz c;
    public static final defpackage.bjz d;
    private static final /* synthetic */ defpackage.bjz[] e;

    static {
        defpackage.bjz bjzVar = new defpackage.bjz("Up", 0);
        a = bjzVar;
        defpackage.bjz bjzVar2 = new defpackage.bjz("Drag", 1);
        b = bjzVar2;
        defpackage.bjz bjzVar3 = new defpackage.bjz("Timeout", 2);
        c = bjzVar3;
        defpackage.bjz bjzVar4 = new defpackage.bjz("Cancel", 3);
        d = bjzVar4;
        defpackage.bjz[] bjzVarArr = {bjzVar, bjzVar2, bjzVar3, bjzVar4};
        e = bjzVarArr;
        defpackage.afga.p(bjzVarArr);
    }

    public static defpackage.bjz valueOf(java.lang.String str) {
        return (defpackage.bjz) java.lang.Enum.valueOf(defpackage.bjz.class, str);
    }

    public static defpackage.bjz[] values() {
        return (defpackage.bjz[]) e.clone();
    }
}
