package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ajth {
    public static final defpackage.ajth a;
    public static final defpackage.ajth b;
    private static final /* synthetic */ defpackage.ajth[] c;

    static {
        defpackage.ajth ajthVar = new defpackage.ajth("DROP_FRAGMENT", 0);
        a = ajthVar;
        defpackage.ajth ajthVar2 = new defpackage.ajth("NORMALIZE", 1);
        b = ajthVar2;
        c = new defpackage.ajth[]{ajthVar, ajthVar2};
    }

    public static defpackage.ajth valueOf(java.lang.String str) {
        return (defpackage.ajth) java.lang.Enum.valueOf(defpackage.ajth.class, str);
    }

    public static defpackage.ajth[] values() {
        return (defpackage.ajth[]) c.clone();
    }
}
