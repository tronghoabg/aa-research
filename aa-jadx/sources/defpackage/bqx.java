package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class bqx {
    public static final defpackage.bqx a;
    public static final defpackage.bqx b;
    public static final defpackage.bqx c;
    private static final /* synthetic */ defpackage.bqx[] d;

    static {
        defpackage.bqx bqxVar = new defpackage.bqx("StartToEnd", 0);
        a = bqxVar;
        defpackage.bqx bqxVar2 = new defpackage.bqx("EndToStart", 1);
        b = bqxVar2;
        defpackage.bqx bqxVar3 = new defpackage.bqx("Settled", 2);
        c = bqxVar3;
        defpackage.bqx[] bqxVarArr = {bqxVar, bqxVar2, bqxVar3};
        d = bqxVarArr;
        defpackage.afga.p(bqxVarArr);
    }

    public static defpackage.bqx valueOf(java.lang.String str) {
        return (defpackage.bqx) java.lang.Enum.valueOf(defpackage.bqx.class, str);
    }

    public static defpackage.bqx[] values() {
        return (defpackage.bqx[]) d.clone();
    }
}
