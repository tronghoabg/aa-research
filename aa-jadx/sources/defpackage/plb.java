package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class plb {
    public static final defpackage.plb a;

    @java.lang.Deprecated
    public static final defpackage.plb b;
    public static final defpackage.plb c;
    public static final defpackage.plb d;
    public static final defpackage.plb e;
    public static final defpackage.plb f;
    private static final /* synthetic */ defpackage.plb[] g;

    static {
        new defpackage.ple();
        defpackage.plb plbVar = new defpackage.plb("UNSUCCESSFUL_STARTUP", 0);
        a = plbVar;
        new defpackage.pll("java-crashloop", 3);
        defpackage.plb plbVar2 = new defpackage.plb("JAVA", 1);
        b = plbVar2;
        int i = defpackage.pla.a;
        new defpackage.pll("java-fg-crashloop", 5);
        defpackage.plb plbVar3 = new defpackage.plb("JAVA_FOREGROUND", 2);
        c = plbVar3;
        new defpackage.pll("java-bg-crashloop", 6);
        defpackage.plb plbVar4 = new defpackage.plb("JAVA_BACKGROUND", 3);
        d = plbVar4;
        defpackage.plb plbVar5 = new defpackage.plb("NATIVE", 4);
        e = plbVar5;
        new defpackage.pld() { // from class: pkz
            {
                new defpackage.pll("anr-crashloop", 7);
                int i2 = defpackage.pla.a;
            }

            @Override // defpackage.pld
            public final void a(android.content.Context context) {
            }
        };
        defpackage.plb plbVar6 = new defpackage.plb("ANR", 5);
        f = plbVar6;
        g = new defpackage.plb[]{plbVar, plbVar2, plbVar3, plbVar4, plbVar5, plbVar6};
    }

    public static defpackage.plb valueOf(java.lang.String str) {
        return (defpackage.plb) java.lang.Enum.valueOf(defpackage.plb.class, str);
    }

    public static defpackage.plb[] values() {
        return (defpackage.plb[]) g.clone();
    }
}
