package defpackage;

import android.content.Context;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pkh {
    public static final pkh a;

    @Deprecated
    public static final pkh b;
    public static final pkh c;
    public static final pkh d;
    public static final pkh e;
    public static final pkh f;
    private static final /* synthetic */ pkh[] g;

    static {
        new pkk();
        pkh pkhVar = new pkh("UNSUCCESSFUL_STARTUP", 0);
        a = pkhVar;
        new pkr("java-crashloop", 3);
        pkh pkhVar2 = new pkh("JAVA", 1);
        b = pkhVar2;
        int i = pkg.a;
        new pkr("java-fg-crashloop", 5);
        pkh pkhVar3 = new pkh("JAVA_FOREGROUND", 2);
        c = pkhVar3;
        new pkr("java-bg-crashloop", 6);
        pkh pkhVar4 = new pkh("JAVA_BACKGROUND", 3);
        d = pkhVar4;
        pkh pkhVar5 = new pkh("NATIVE", 4);
        e = pkhVar5;
        new pkj() { // from class: pkf
            {
                new pkr("anr-crashloop", 7);
                int i2 = pkg.a;
            }

            @Override // defpackage.pkj
            public final void a(Context context) {
            }
        };
        pkh pkhVar6 = new pkh("ANR", 5);
        f = pkhVar6;
        g = new pkh[]{pkhVar, pkhVar2, pkhVar3, pkhVar4, pkhVar5, pkhVar6};
    }

    public static pkh valueOf(String str) {
        return (pkh) Enum.valueOf(pkh.class, str);
    }

    public static pkh[] values() {
        return (pkh[]) g.clone();
    }
}
