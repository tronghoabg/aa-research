package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class phl {
    public static final defpackage.phl a;
    public static final defpackage.phl b;
    public static final defpackage.phl c;
    private static final /* synthetic */ defpackage.phl[] d;

    static {
        defpackage.phl phlVar = new defpackage.phl("NOT_REQUESTED", 0);
        a = phlVar;
        defpackage.phl phlVar2 = new defpackage.phl("REQUESTED", 1);
        b = phlVar2;
        defpackage.phl phlVar3 = new defpackage.phl("RECEIVED", 2);
        c = phlVar3;
        d = new defpackage.phl[]{phlVar, phlVar2, phlVar3};
    }

    public static defpackage.phl valueOf(java.lang.String str) {
        return (defpackage.phl) java.lang.Enum.valueOf(defpackage.phl.class, str);
    }

    public static defpackage.phl[] values() {
        return (defpackage.phl[]) d.clone();
    }
}
