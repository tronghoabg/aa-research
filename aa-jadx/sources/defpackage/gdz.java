package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gdz {
    public static final defpackage.gdz a;
    public static final defpackage.gdz b;
    private static final /* synthetic */ defpackage.gdz[] c;

    static {
        defpackage.gdz gdzVar = new defpackage.gdz("RECORDING", 0);
        a = gdzVar;
        defpackage.gdz gdzVar2 = new defpackage.gdz("NOT_RECORDING", 1);
        b = gdzVar2;
        c = new defpackage.gdz[]{gdzVar, gdzVar2};
    }

    public static defpackage.gdz valueOf(java.lang.String str) {
        return (defpackage.gdz) java.lang.Enum.valueOf(defpackage.gdz.class, str);
    }

    public static defpackage.gdz[] values() {
        return (defpackage.gdz[]) c.clone();
    }
}
