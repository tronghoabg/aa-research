package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class iky {
    public static final defpackage.iky a;
    public static final defpackage.iky b;
    private static final /* synthetic */ defpackage.iky[] c;

    static {
        defpackage.iky ikyVar = new defpackage.iky("IDLE", 0);
        a = ikyVar;
        defpackage.iky ikyVar2 = new defpackage.iky("IN_FLIGHT", 1);
        b = ikyVar2;
        c = new defpackage.iky[]{ikyVar, ikyVar2};
    }

    public static defpackage.iky valueOf(java.lang.String str) {
        return (defpackage.iky) java.lang.Enum.valueOf(defpackage.iky.class, str);
    }

    public static defpackage.iky[] values() {
        return (defpackage.iky[]) c.clone();
    }
}
