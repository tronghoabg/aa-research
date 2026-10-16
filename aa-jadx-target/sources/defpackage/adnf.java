package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adnf {
    public static final defpackage.adnf a;
    public static final defpackage.adnf b;
    public static final defpackage.adnf c;
    public static final defpackage.adnf d;
    public static final defpackage.adnf e;
    private static final /* synthetic */ defpackage.adnf[] f;

    static {
        defpackage.adnf adnfVar = new defpackage.adnf("UNARY", 0);
        a = adnfVar;
        defpackage.adnf adnfVar2 = new defpackage.adnf("CLIENT_STREAMING", 1);
        b = adnfVar2;
        defpackage.adnf adnfVar3 = new defpackage.adnf("SERVER_STREAMING", 2);
        c = adnfVar3;
        defpackage.adnf adnfVar4 = new defpackage.adnf("BIDI_STREAMING", 3);
        d = adnfVar4;
        defpackage.adnf adnfVar5 = new defpackage.adnf("UNKNOWN", 4);
        e = adnfVar5;
        f = new defpackage.adnf[]{adnfVar, adnfVar2, adnfVar3, adnfVar4, adnfVar5};
    }

    public static defpackage.adnf valueOf(java.lang.String str) {
        return (defpackage.adnf) java.lang.Enum.valueOf(defpackage.adnf.class, str);
    }

    public static defpackage.adnf[] values() {
        return (defpackage.adnf[]) f.clone();
    }

    public final boolean a() {
        return this == a || this == c;
    }

    public final boolean b() {
        return this == a || this == b;
    }
}
