package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class adjh {
    public static final adjh a;
    public static final adjh b;
    public static final adjh c;
    public static final adjh d;
    public static final adjh e;
    private static final /* synthetic */ adjh[] f;

    static {
        adjh adjhVar = new adjh("CONNECTING", 0);
        a = adjhVar;
        adjh adjhVar2 = new adjh("READY", 1);
        b = adjhVar2;
        adjh adjhVar3 = new adjh("TRANSIENT_FAILURE", 2);
        c = adjhVar3;
        adjh adjhVar4 = new adjh("IDLE", 3);
        d = adjhVar4;
        adjh adjhVar5 = new adjh("SHUTDOWN", 4);
        e = adjhVar5;
        f = new adjh[]{adjhVar, adjhVar2, adjhVar3, adjhVar4, adjhVar5};
    }

    public static adjh valueOf(String str) {
        return (adjh) Enum.valueOf(adjh.class, str);
    }

    public static adjh[] values() {
        return (adjh[]) f.clone();
    }
}
