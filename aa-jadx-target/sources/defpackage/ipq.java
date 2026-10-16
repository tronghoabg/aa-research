package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.zkg(a = defpackage.zke.a)
public final class ipq {
    public static final defpackage.ipq a;
    public static final defpackage.ipq b;
    public static final defpackage.ipq c;
    public static final defpackage.ipq d;
    private static final /* synthetic */ defpackage.ipq[] e;

    static {
        defpackage.ipq ipqVar = new defpackage.ipq("STARTED", 0);
        a = ipqVar;
        defpackage.ipq ipqVar2 = new defpackage.ipq("STOPPED", 1);
        b = ipqVar2;
        defpackage.ipq ipqVar3 = new defpackage.ipq("RESUMED", 2);
        c = ipqVar3;
        defpackage.ipq ipqVar4 = new defpackage.ipq("DESTROYED", 3);
        d = ipqVar4;
        defpackage.ipq[] ipqVarArr = {ipqVar, ipqVar2, ipqVar3, ipqVar4};
        e = ipqVarArr;
        defpackage.afga.p(ipqVarArr);
    }

    public static defpackage.ipq valueOf(java.lang.String str) {
        return (defpackage.ipq) java.lang.Enum.valueOf(defpackage.ipq.class, str);
    }

    public static defpackage.ipq[] values() {
        return (defpackage.ipq[]) e.clone();
    }
}
