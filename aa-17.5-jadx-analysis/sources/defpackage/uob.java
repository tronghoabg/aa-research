package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uob {
    public static final uob a;
    public static final uob b;
    public static final uob c;
    public static final uob d;
    public static final uob e;
    private static final /* synthetic */ uob[] f;

    static {
        uob uobVar = new uob("IDLE", 0);
        a = uobVar;
        uob uobVar2 = new uob("QUEUED_SLOW", 1);
        b = uobVar2;
        uob uobVar3 = new uob("QUEUED_IMMEDIATE", 2);
        c = uobVar3;
        uob uobVar4 = new uob("RUNNING_WILL_FINISH", 3);
        d = uobVar4;
        uob uobVar5 = new uob("RUNNING_NEEDS_LOOP", 4);
        e = uobVar5;
        f = new uob[]{uobVar, uobVar2, uobVar3, uobVar4, uobVar5};
    }

    public static uob valueOf(String str) {
        return (uob) Enum.valueOf(uob.class, str);
    }

    public static uob[] values() {
        return (uob[]) f.clone();
    }
}
