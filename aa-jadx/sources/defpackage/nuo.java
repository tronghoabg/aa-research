package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nuo {
    public static final defpackage.nuo a;
    public static final defpackage.nuo b;
    public static final defpackage.nuo c;
    private static final /* synthetic */ defpackage.nuo[] d;

    static {
        defpackage.nuo nuoVar = new defpackage.nuo("HIDDEN", 0);
        a = nuoVar;
        defpackage.nuo nuoVar2 = new defpackage.nuo("RELATIVE", 1);
        b = nuoVar2;
        defpackage.nuo nuoVar3 = new defpackage.nuo("CHRONOMETER", 2);
        c = nuoVar3;
        d = new defpackage.nuo[]{nuoVar, nuoVar2, nuoVar3};
    }

    public static defpackage.nuo valueOf(java.lang.String str) {
        return (defpackage.nuo) java.lang.Enum.valueOf(defpackage.nuo.class, str);
    }

    public static defpackage.nuo[] values() {
        return (defpackage.nuo[]) d.clone();
    }
}
