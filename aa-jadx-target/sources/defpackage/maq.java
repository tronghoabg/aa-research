package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class maq {
    public static final defpackage.maq a;
    public static final defpackage.maq b;
    public static final defpackage.maq c;
    public static final defpackage.maq d;
    public static final defpackage.maq e;
    private static final /* synthetic */ defpackage.maq[] f;

    static {
        defpackage.maq maqVar = new defpackage.maq("UNKNOWN", 0);
        a = maqVar;
        defpackage.maq maqVar2 = new defpackage.maq("RELEASED", 1);
        b = maqVar2;
        defpackage.maq maqVar3 = new defpackage.maq("RELEASING", 2);
        c = maqVar3;
        defpackage.maq maqVar4 = new defpackage.maq("REQUESTED", 3);
        d = maqVar4;
        defpackage.maq maqVar5 = new defpackage.maq("GRANTED", 4);
        e = maqVar5;
        f = new defpackage.maq[]{maqVar, maqVar2, maqVar3, maqVar4, maqVar5};
    }

    public static defpackage.maq valueOf(java.lang.String str) {
        return (defpackage.maq) java.lang.Enum.valueOf(defpackage.maq.class, str);
    }

    public static defpackage.maq[] values() {
        return (defpackage.maq[]) f.clone();
    }
}
