package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gme {
    public static final defpackage.gme a;
    public static final defpackage.gme b;
    public static final defpackage.gme c;
    private static final /* synthetic */ defpackage.gme[] d;

    static {
        defpackage.gme gmeVar = new defpackage.gme("UNBOUND", 0);
        a = gmeVar;
        defpackage.gme gmeVar2 = new defpackage.gme("BINDING", 1);
        b = gmeVar2;
        defpackage.gme gmeVar3 = new defpackage.gme("BOUND", 2);
        c = gmeVar3;
        d = new defpackage.gme[]{gmeVar, gmeVar2, gmeVar3};
    }

    public static defpackage.gme valueOf(java.lang.String str) {
        return (defpackage.gme) java.lang.Enum.valueOf(defpackage.gme.class, str);
    }

    public static defpackage.gme[] values() {
        return (defpackage.gme[]) d.clone();
    }
}
