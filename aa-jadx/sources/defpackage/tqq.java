package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tqq {
    public static final defpackage.tqq a;
    public static final defpackage.tqq b;
    private static final /* synthetic */ defpackage.tqq[] c;

    static {
        defpackage.tqq tqqVar = new defpackage.tqq("PIXEL", 0);
        a = tqqVar;
        defpackage.tqq tqqVar2 = new defpackage.tqq("WORLD", 1);
        b = tqqVar2;
        c = new defpackage.tqq[]{tqqVar, tqqVar2};
    }

    public static defpackage.tqq valueOf(java.lang.String str) {
        return (defpackage.tqq) java.lang.Enum.valueOf(defpackage.tqq.class, str);
    }

    public static defpackage.tqq[] values() {
        return (defpackage.tqq[]) c.clone();
    }
}
