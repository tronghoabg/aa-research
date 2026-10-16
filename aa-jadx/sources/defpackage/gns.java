package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gns {
    public static final defpackage.gns a;
    public static final defpackage.gns b;
    public static final defpackage.gns c;
    public static final defpackage.gns d;
    public static final defpackage.gns e;
    public static final defpackage.gns f;
    public static final defpackage.gns g;
    public static final defpackage.gns h;
    private static final /* synthetic */ defpackage.gns[] i;

    static {
        defpackage.gns gnsVar = new defpackage.gns("UNKNOWN_ERROR", 0);
        a = gnsVar;
        defpackage.gns gnsVar2 = new defpackage.gns("BUNDLER_EXCEPTION", 1);
        b = gnsVar2;
        defpackage.gns gnsVar3 = new defpackage.gns("ILLEGAL_STATE_EXCEPTION", 2);
        c = gnsVar3;
        defpackage.gns gnsVar4 = new defpackage.gns("INVALID_PARAMETER_EXCEPTION", 3);
        d = gnsVar4;
        defpackage.gns gnsVar5 = new defpackage.gns("SECURITY_EXCEPTION", 4);
        e = gnsVar5;
        defpackage.gns gnsVar6 = new defpackage.gns("RUNTIME_EXCEPTION", 5);
        f = gnsVar6;
        defpackage.gns gnsVar7 = new defpackage.gns("REMOTE_EXCEPTION", 6);
        g = gnsVar7;
        defpackage.gns gnsVar8 = new defpackage.gns("ANR", 7);
        h = gnsVar8;
        i = new defpackage.gns[]{gnsVar, gnsVar2, gnsVar3, gnsVar4, gnsVar5, gnsVar6, gnsVar7, gnsVar8};
    }

    public static defpackage.gns valueOf(java.lang.String str) {
        return (defpackage.gns) java.lang.Enum.valueOf(defpackage.gns.class, str);
    }

    public static defpackage.gns[] values() {
        return (defpackage.gns[]) i.clone();
    }
}
