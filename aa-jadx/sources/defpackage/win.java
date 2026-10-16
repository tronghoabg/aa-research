package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class win {
    public static final defpackage.win a;
    public static final defpackage.win b;
    private static final /* synthetic */ defpackage.win[] c;

    static {
        defpackage.win winVar = new defpackage.win("EMBEDDED", 0);
        a = winVar;
        defpackage.win winVar2 = new defpackage.win("POPUP", 1);
        b = winVar2;
        c = new defpackage.win[]{winVar, winVar2};
    }

    public static defpackage.win valueOf(java.lang.String str) {
        return (defpackage.win) java.lang.Enum.valueOf(defpackage.win.class, str);
    }

    public static defpackage.win[] values() {
        return (defpackage.win[]) c.clone();
    }
}
