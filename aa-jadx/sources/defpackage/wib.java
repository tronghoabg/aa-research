package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wib {
    public static final defpackage.wib a;
    public static final defpackage.wib b;
    public static final defpackage.wib c;
    private static final /* synthetic */ defpackage.wib[] d;

    static {
        defpackage.wib wibVar = new defpackage.wib("CARD", 0);
        a = wibVar;
        defpackage.wib wibVar2 = new defpackage.wib("TOAST", 1);
        b = wibVar2;
        defpackage.wib wibVar3 = new defpackage.wib("SILENT", 2);
        c = wibVar3;
        d = new defpackage.wib[]{wibVar, wibVar2, wibVar3};
    }

    public static defpackage.wib valueOf(java.lang.String str) {
        return (defpackage.wib) java.lang.Enum.valueOf(defpackage.wib.class, str);
    }

    public static defpackage.wib[] values() {
        return (defpackage.wib[]) d.clone();
    }
}
