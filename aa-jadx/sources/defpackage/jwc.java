package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jwc {
    public static final defpackage.jwc a;
    public static final defpackage.jwc b;
    public static final defpackage.jwc c;
    public static final defpackage.jwc d;
    public static final defpackage.jwc e;
    private static final /* synthetic */ defpackage.jwc[] f;

    static {
        defpackage.jwc jwcVar = new defpackage.jwc("START", 0);
        a = jwcVar;
        defpackage.jwc jwcVar2 = new defpackage.jwc("FETCH", 1);
        b = jwcVar2;
        defpackage.jwc jwcVar3 = new defpackage.jwc("SUBSCRIBE", 2);
        c = jwcVar3;
        defpackage.jwc jwcVar4 = new defpackage.jwc("UNSUBSCRIBE", 3);
        d = jwcVar4;
        defpackage.jwc jwcVar5 = new defpackage.jwc("STOP", 4);
        e = jwcVar5;
        f = new defpackage.jwc[]{jwcVar, jwcVar2, jwcVar3, jwcVar4, jwcVar5};
    }

    public static defpackage.jwc valueOf(java.lang.String str) {
        return (defpackage.jwc) java.lang.Enum.valueOf(defpackage.jwc.class, str);
    }

    public static defpackage.jwc[] values() {
        return (defpackage.jwc[]) f.clone();
    }
}
