package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class uoz {
    public static final defpackage.uoz a;
    public static final defpackage.uoz b;
    public static final defpackage.uoz c;
    public static final defpackage.uoz d;
    public static final defpackage.uoz e;
    private static final /* synthetic */ defpackage.uoz[] f;

    static {
        defpackage.uoz uozVar = new defpackage.uoz("IDLE", 0);
        a = uozVar;
        defpackage.uoz uozVar2 = new defpackage.uoz("QUEUED_SLOW", 1);
        b = uozVar2;
        defpackage.uoz uozVar3 = new defpackage.uoz("QUEUED_IMMEDIATE", 2);
        c = uozVar3;
        defpackage.uoz uozVar4 = new defpackage.uoz("RUNNING_WILL_FINISH", 3);
        d = uozVar4;
        defpackage.uoz uozVar5 = new defpackage.uoz("RUNNING_NEEDS_LOOP", 4);
        e = uozVar5;
        f = new defpackage.uoz[]{uozVar, uozVar2, uozVar3, uozVar4, uozVar5};
    }

    public static defpackage.uoz valueOf(java.lang.String str) {
        return (defpackage.uoz) java.lang.Enum.valueOf(defpackage.uoz.class, str);
    }

    public static defpackage.uoz[] values() {
        return (defpackage.uoz[]) f.clone();
    }
}
