package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@zje(a = zjc.a)
/* loaded from: classes.dex */
public final class kin {
    public static final kin a;
    public static final kin b;
    public static final kin c;
    public static final kin d;
    public static final kin e;
    public static final kin f;
    private static final /* synthetic */ kin[] g;

    static {
        kin kinVar = new kin("UNINITIALIZED", 0);
        a = kinVar;
        kin kinVar2 = new kin("CLIENT_CONNECTION_FAILED", 1);
        b = kinVar2;
        kin kinVar3 = new kin("CLIENT_CONNECTED", 2);
        c = kinVar3;
        kin kinVar4 = new kin("CLIENT_CONNECTED_AND_CAR_CONNECTED", 3);
        d = kinVar4;
        kin kinVar5 = new kin("CLIENT_CONNECTED_AND_CAR_DISCONNECTED", 4);
        e = kinVar5;
        kin kinVar6 = new kin("CLIENT_CONNECTION_SUSPENDED", 5);
        f = kinVar6;
        g = new kin[]{kinVar, kinVar2, kinVar3, kinVar4, kinVar5, kinVar6};
    }

    public static kin valueOf(String str) {
        return (kin) Enum.valueOf(kin.class, str);
    }

    public static kin[] values() {
        return (kin[]) g.clone();
    }
}
