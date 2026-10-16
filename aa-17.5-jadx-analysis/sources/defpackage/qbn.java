package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class qbn {
    public static final qbn a;
    public static final qbn b;
    public static final qbn c;
    public static final qbn d;
    public static final qbn e;
    public static final qbn f;
    private static final /* synthetic */ qbn[] g;

    static {
        qbn qbnVar = new qbn("NOT_CACHED", 0);
        a = qbnVar;
        qbn qbnVar2 = new qbn("MEMORY", 1);
        b = qbnVar2;
        qbn qbnVar3 = new qbn("SQLITE", 2);
        c = qbnVar3;
        qbn qbnVar4 = new qbn("OFFROAD", 3);
        d = qbnVar4;
        qbn qbnVar5 = new qbn("NETWORK", 4);
        e = qbnVar5;
        qbn qbnVar6 = new qbn("NETWORK_UPDATE", 5);
        f = qbnVar6;
        g = new qbn[]{qbnVar, qbnVar2, qbnVar3, qbnVar4, qbnVar5, qbnVar6};
    }

    public static qbn valueOf(String str) {
        return (qbn) Enum.valueOf(qbn.class, str);
    }

    public static qbn[] values() {
        return (qbn[]) g.clone();
    }
}
