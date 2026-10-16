package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class iko {
    public static final iko a;
    public static final iko b;
    private static final /* synthetic */ iko[] c;

    static {
        iko ikoVar = new iko("IDLE", 0);
        a = ikoVar;
        iko ikoVar2 = new iko("IN_FLIGHT", 1);
        b = ikoVar2;
        c = new iko[]{ikoVar, ikoVar2};
    }

    public static iko valueOf(String str) {
        return (iko) Enum.valueOf(iko.class, str);
    }

    public static iko[] values() {
        return (iko[]) c.clone();
    }
}
