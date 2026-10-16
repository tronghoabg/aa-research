package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class mjh {
    public static final mjh a;
    public static final mjh b;
    public static final mjh c;
    public static final mjh d;
    private static final /* synthetic */ mjh[] e;

    static {
        mjh mjhVar = new mjh("STATE_CONNECTED", 0);
        a = mjhVar;
        mjh mjhVar2 = new mjh("STATE_NOT_SUPPORTED", 1);
        b = mjhVar2;
        mjh mjhVar3 = new mjh("STATE_DISCONNECTED", 2);
        c = mjhVar3;
        mjh mjhVar4 = new mjh("STATE_ERROR", 3);
        d = mjhVar4;
        e = new mjh[]{mjhVar, mjhVar2, mjhVar3, mjhVar4};
    }

    public static mjh valueOf(String str) {
        return (mjh) Enum.valueOf(mjh.class, str);
    }

    public static mjh[] values() {
        return (mjh[]) e.clone();
    }
}
