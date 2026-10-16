package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class njf {
    public static final defpackage.njf a;
    public static final defpackage.njf b;
    public static final defpackage.njf c;
    public static final defpackage.njf d;
    private static final /* synthetic */ defpackage.njf[] e;

    static {
        defpackage.njf njfVar = new defpackage.njf("DASHBOARD", 0);
        a = njfVar;
        defpackage.njf njfVar2 = new defpackage.njf("LAUNCHER", 1);
        b = njfVar2;
        defpackage.njf njfVar3 = new defpackage.njf("NOTIFICATION_CENTER", 2);
        c = njfVar3;
        defpackage.njf njfVar4 = new defpackage.njf("OTHER", 3);
        d = njfVar4;
        defpackage.njf[] njfVarArr = {njfVar, njfVar2, njfVar3, njfVar4};
        e = njfVarArr;
        defpackage.afga.p(njfVarArr);
    }

    public static defpackage.njf valueOf(java.lang.String str) {
        return (defpackage.njf) java.lang.Enum.valueOf(defpackage.njf.class, str);
    }

    public static defpackage.njf[] values() {
        return (defpackage.njf[]) e.clone();
    }
}
