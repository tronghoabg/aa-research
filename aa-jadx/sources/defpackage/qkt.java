package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class qkt {
    public static final defpackage.qkt a;
    public static final defpackage.qkt b;
    public static final defpackage.qkt c;
    public static final defpackage.qkt d;
    public static final defpackage.qkt e;
    public static final defpackage.qkt f;
    private static final /* synthetic */ defpackage.qkt[] g;

    static {
        defpackage.qkt qktVar = new defpackage.qkt("GOTO_APP", 0);
        a = qktVar;
        defpackage.qkt qktVar2 = new defpackage.qkt("MUTE_CALL", 1);
        b = qktVar2;
        defpackage.qkt qktVar3 = new defpackage.qkt("UNMUTE_CALL", 2);
        c = qktVar3;
        defpackage.qkt qktVar4 = new defpackage.qkt("END_CALL", 3);
        d = qktVar4;
        defpackage.qkt qktVar5 = new defpackage.qkt("ACCEPT_CALL", 4);
        e = qktVar5;
        defpackage.qkt qktVar6 = new defpackage.qkt("REJECT_CALL", 5);
        f = qktVar6;
        g = new defpackage.qkt[]{qktVar, qktVar2, qktVar3, qktVar4, qktVar5, qktVar6};
    }

    public static defpackage.qkt valueOf(java.lang.String str) {
        return (defpackage.qkt) java.lang.Enum.valueOf(defpackage.qkt.class, str);
    }

    public static defpackage.qkt[] values() {
        return (defpackage.qkt[]) g.clone();
    }
}
