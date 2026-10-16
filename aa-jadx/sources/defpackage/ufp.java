package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ufp {
    public static final defpackage.ufp a;
    public static final defpackage.ufp b;
    private static final /* synthetic */ defpackage.ufp[] c;

    static {
        defpackage.ufp ufpVar = new defpackage.ufp("PHONES_AND_TABLETS", 0);
        a = ufpVar;
        defpackage.ufp ufpVar2 = new defpackage.ufp("CAR_HEAD_UNIT", 1);
        b = ufpVar2;
        c = new defpackage.ufp[]{ufpVar, ufpVar2};
    }

    public static defpackage.ufp valueOf(java.lang.String str) {
        return (defpackage.ufp) java.lang.Enum.valueOf(defpackage.ufp.class, str);
    }

    public static defpackage.ufp[] values() {
        return (defpackage.ufp[]) c.clone();
    }
}
