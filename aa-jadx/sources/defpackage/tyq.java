package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tyq {
    public static final defpackage.tyq a;
    public static final defpackage.tyq b;
    public static final defpackage.tyq c;
    private static final /* synthetic */ defpackage.tyq[] d;

    static {
        defpackage.tyq tyqVar = new defpackage.tyq("ENABLE_AT_STARTUP", 0);
        a = tyqVar;
        defpackage.tyq tyqVar2 = new defpackage.tyq("ENABLE_AFTER_STARTUP", 1);
        b = tyqVar2;
        defpackage.tyq tyqVar3 = new defpackage.tyq("ENABLE_WHEN_INTENTED", 2);
        c = tyqVar3;
        d = new defpackage.tyq[]{tyqVar, tyqVar2, tyqVar3};
    }

    public static defpackage.tyq valueOf(java.lang.String str) {
        return (defpackage.tyq) java.lang.Enum.valueOf(defpackage.tyq.class, str);
    }

    public static defpackage.tyq[] values() {
        return (defpackage.tyq[]) d.clone();
    }
}
