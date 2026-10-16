package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ajuj {
    public static final defpackage.ajuj a;
    public static final defpackage.ajuj b;
    private static final /* synthetic */ defpackage.ajuj[] c;

    static {
        defpackage.ajuj ajujVar = new defpackage.ajuj("PLAIN", 0);
        a = ajujVar;
        defpackage.ajuj ajujVar2 = new defpackage.ajuj("TUNNELLED", 1);
        b = ajujVar2;
        c = new defpackage.ajuj[]{ajujVar, ajujVar2};
    }

    public static defpackage.ajuj valueOf(java.lang.String str) {
        return (defpackage.ajuj) java.lang.Enum.valueOf(defpackage.ajuj.class, str);
    }

    public static defpackage.ajuj[] values() {
        return (defpackage.ajuj[]) c.clone();
    }
}
