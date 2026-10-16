package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class rbs {
    public static final rbs a;
    public static final rbs b;
    public static final rbs c;
    private static final /* synthetic */ rbs[] d;

    static {
        rbs rbsVar = new rbs("UNKNOWN", 0);
        a = rbsVar;
        rbs rbsVar2 = new rbs("SERVICE_DISCONNECTED", 1);
        b = rbsVar2;
        rbs rbsVar3 = new rbs("NETWORK_LOST", 2);
        c = rbsVar3;
        d = new rbs[]{rbsVar, rbsVar2, rbsVar3};
    }

    public static rbs valueOf(String str) {
        return (rbs) Enum.valueOf(rbs.class, str);
    }

    public static rbs[] values() {
        return (rbs[]) d.clone();
    }
}
