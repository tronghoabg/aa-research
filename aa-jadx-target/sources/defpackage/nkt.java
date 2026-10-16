package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class nkt {
    public static final defpackage.nkt a;
    public static final defpackage.nkt b;
    private static final /* synthetic */ defpackage.nkt[] c;

    static {
        defpackage.nkt nktVar = new defpackage.nkt("Hotseat", 0);
        a = nktVar;
        defpackage.nkt nktVar2 = new defpackage.nkt("RailWidget", 1);
        b = nktVar2;
        defpackage.nkt[] nktVarArr = {nktVar, nktVar2};
        c = nktVarArr;
        defpackage.afga.p(nktVarArr);
    }

    public static defpackage.nkt valueOf(java.lang.String str) {
        return (defpackage.nkt) java.lang.Enum.valueOf(defpackage.nkt.class, str);
    }

    public static defpackage.nkt[] values() {
        return (defpackage.nkt[]) c.clone();
    }
}
