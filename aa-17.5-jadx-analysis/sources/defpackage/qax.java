package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class qax {
    public static final qax a;
    public static final qax b;
    private static final /* synthetic */ qax[] c;

    static {
        qax qaxVar = new qax("MAIN", 0);
        a = qaxVar;
        qax qaxVar2 = new qax("AUXILIARY", 1);
        b = qaxVar2;
        c = new qax[]{qaxVar, qaxVar2};
    }

    public static qax valueOf(String str) {
        return (qax) Enum.valueOf(qax.class, str);
    }

    public static qax[] values() {
        return (qax[]) c.clone();
    }
}
