package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class qbb {
    public static final qbb a;
    public static final qbb b;
    private static final /* synthetic */ qbb[] c;

    static {
        qbb qbbVar = new qbb("LOWEST", 0);
        a = qbbVar;
        qbb qbbVar2 = new qbb("HIGH", 1);
        b = qbbVar2;
        c = new qbb[]{qbbVar, qbbVar2};
    }

    public static qbb valueOf(String str) {
        return (qbb) Enum.valueOf(qbb.class, str);
    }

    public static qbb[] values() {
        return (qbb[]) c.clone();
    }
}
