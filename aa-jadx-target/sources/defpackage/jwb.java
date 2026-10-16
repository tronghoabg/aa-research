package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jwb {
    public static final defpackage.jwb a;
    public static final defpackage.jwb b;
    public static final defpackage.jwb c;
    public static final defpackage.jwb d;
    public static final defpackage.jwb e;
    public static final defpackage.jwb f;
    private static final /* synthetic */ defpackage.jwb[] g;

    static {
        defpackage.jwb jwbVar = new defpackage.jwb("OK", 0);
        a = jwbVar;
        defpackage.jwb jwbVar2 = new defpackage.jwb("NOT_STARTED", 1);
        b = jwbVar2;
        defpackage.jwb jwbVar3 = new defpackage.jwb("CAR_ERROR", 2);
        c = jwbVar3;
        defpackage.jwb jwbVar4 = new defpackage.jwb("NOT_ALLOWED", 3);
        d = jwbVar4;
        defpackage.jwb jwbVar5 = new defpackage.jwb("REPEATED", 4);
        e = jwbVar5;
        defpackage.jwb jwbVar6 = new defpackage.jwb("INVALID_TYPE", 5);
        f = jwbVar6;
        g = new defpackage.jwb[]{jwbVar, jwbVar2, jwbVar3, jwbVar4, jwbVar5, jwbVar6};
    }

    public static defpackage.jwb valueOf(java.lang.String str) {
        return (defpackage.jwb) java.lang.Enum.valueOf(defpackage.jwb.class, str);
    }

    public static defpackage.jwb[] values() {
        return (defpackage.jwb[]) g.clone();
    }
}
