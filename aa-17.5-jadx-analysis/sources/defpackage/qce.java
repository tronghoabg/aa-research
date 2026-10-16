package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class qce {
    public static final qce a;
    public static final qce b;
    private static final /* synthetic */ qce[] c;

    static {
        qce qceVar = new qce("PRIMARY_MAP", 0);
        a = qceVar;
        qce qceVar2 = new qce("AUXILIARY_CLUSTER_MAP", 1);
        b = qceVar2;
        c = new qce[]{qceVar, qceVar2};
    }

    public static qce valueOf(String str) {
        return (qce) Enum.valueOf(qce.class, str);
    }

    public static qce[] values() {
        return (qce[]) c.clone();
    }
}
