package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class oay {
    public static final defpackage.oay a;
    public static final defpackage.oay b;
    public static final defpackage.oay c;
    public static final defpackage.oay d;
    private static final /* synthetic */ defpackage.oay[] e;

    static {
        defpackage.oay oayVar = new defpackage.oay("DO_NOT_DISTURB", 0);
        a = oayVar;
        defpackage.oay oayVar2 = new defpackage.oay("BADGE", 1);
        b = oayVar2;
        defpackage.oay oayVar3 = new defpackage.oay("AUTOMATION", 2);
        c = oayVar3;
        defpackage.oay oayVar4 = new defpackage.oay("HIDDEN", 3);
        d = oayVar4;
        defpackage.oay[] oayVarArr = {oayVar, oayVar2, oayVar3, oayVar4};
        e = oayVarArr;
        defpackage.afga.p(oayVarArr);
    }

    public static defpackage.oay valueOf(java.lang.String str) {
        return (defpackage.oay) java.lang.Enum.valueOf(defpackage.oay.class, str);
    }

    public static defpackage.oay[] values() {
        return (defpackage.oay[]) e.clone();
    }
}
