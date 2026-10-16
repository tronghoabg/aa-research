package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lor {
    public static final defpackage.lor a;
    public static final defpackage.lor b;
    public static final defpackage.lor c;
    public static final defpackage.lor d;
    public static final defpackage.lor e;
    public static final defpackage.lor f;
    private static final /* synthetic */ defpackage.lor[] g;

    static {
        defpackage.lor lorVar = new defpackage.lor("CONNECTING", 0);
        a = lorVar;
        defpackage.lor lorVar2 = new defpackage.lor("CONNECTED", 1);
        b = lorVar2;
        defpackage.lor lorVar3 = new defpackage.lor("FAILED_TO_CONNECT", 2);
        c = lorVar3;
        defpackage.lor lorVar4 = new defpackage.lor("SUSPENDED", 3);
        d = lorVar4;
        defpackage.lor lorVar5 = new defpackage.lor("RECONNECTING", 4);
        e = lorVar5;
        defpackage.lor lorVar6 = new defpackage.lor("DISCONNECTED_OUT_OF_CONNECTION_LIFECYCLE", 5);
        f = lorVar6;
        g = new defpackage.lor[]{lorVar, lorVar2, lorVar3, lorVar4, lorVar5, lorVar6};
    }

    public static defpackage.lor valueOf(java.lang.String str) {
        return (defpackage.lor) java.lang.Enum.valueOf(defpackage.lor.class, str);
    }

    public static defpackage.lor[] values() {
        return (defpackage.lor[]) g.clone();
    }
}
