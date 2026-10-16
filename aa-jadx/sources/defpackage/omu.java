package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class omu {
    public static final defpackage.omu a;
    public static final defpackage.omu b;
    private static final /* synthetic */ defpackage.omu[] c;

    static {
        defpackage.omu omuVar = new defpackage.omu("LEFT", 0);
        a = omuVar;
        defpackage.omu omuVar2 = new defpackage.omu("RIGHT", 1);
        b = omuVar2;
        c = new defpackage.omu[]{omuVar, omuVar2};
    }

    public static defpackage.omu valueOf(java.lang.String str) {
        return (defpackage.omu) java.lang.Enum.valueOf(defpackage.omu.class, str);
    }

    public static defpackage.omu[] values() {
        return (defpackage.omu[]) c.clone();
    }
}
