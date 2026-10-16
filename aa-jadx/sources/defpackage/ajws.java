package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class ajws {
    public static final defpackage.ajws a;
    public static final defpackage.ajws b;
    public static final defpackage.ajws c;
    public static final defpackage.ajws d;
    public static final defpackage.ajws e;
    public static final defpackage.ajws f;
    private static final /* synthetic */ defpackage.ajws[] g;

    static {
        defpackage.ajws ajwsVar = new defpackage.ajws("UNINITIATED", 0);
        a = ajwsVar;
        defpackage.ajws ajwsVar2 = new defpackage.ajws("CHALLENGE_RECEIVED", 1);
        b = ajwsVar2;
        defpackage.ajws ajwsVar3 = new defpackage.ajws("MSG_TYPE1_GENERATED", 2);
        c = ajwsVar3;
        defpackage.ajws ajwsVar4 = new defpackage.ajws("MSG_TYPE2_RECEVIED", 3);
        d = ajwsVar4;
        defpackage.ajws ajwsVar5 = new defpackage.ajws("MSG_TYPE3_GENERATED", 4);
        e = ajwsVar5;
        defpackage.ajws ajwsVar6 = new defpackage.ajws("FAILED", 5);
        f = ajwsVar6;
        g = new defpackage.ajws[]{ajwsVar, ajwsVar2, ajwsVar3, ajwsVar4, ajwsVar5, ajwsVar6};
    }

    public static defpackage.ajws valueOf(java.lang.String str) {
        return (defpackage.ajws) java.lang.Enum.valueOf(defpackage.ajws.class, str);
    }

    public static defpackage.ajws[] values() {
        return (defpackage.ajws[]) g.clone();
    }
}
