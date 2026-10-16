package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class iwd {
    public static final defpackage.iwd a;
    public static final defpackage.iwd b;
    public static final defpackage.iwd c;
    public static final defpackage.iwd d;
    private static final /* synthetic */ defpackage.iwd[] e;

    static {
        defpackage.iwd iwdVar = new defpackage.iwd("HIGH", 0);
        a = iwdVar;
        defpackage.iwd iwdVar2 = new defpackage.iwd("MEDIUM", 1);
        b = iwdVar2;
        defpackage.iwd iwdVar3 = new defpackage.iwd("LOW", 2);
        c = iwdVar3;
        defpackage.iwd iwdVar4 = new defpackage.iwd("NONE", 3);
        d = iwdVar4;
        e = new defpackage.iwd[]{iwdVar, iwdVar2, iwdVar3, iwdVar4};
    }

    public static defpackage.iwd valueOf(java.lang.String str) {
        return (defpackage.iwd) java.lang.Enum.valueOf(defpackage.iwd.class, str);
    }

    public static defpackage.iwd[] values() {
        return (defpackage.iwd[]) e.clone();
    }
}
