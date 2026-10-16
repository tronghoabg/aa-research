package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ajui {
    public static final defpackage.ajui a;
    public static final defpackage.ajui b;
    private static final /* synthetic */ defpackage.ajui[] c;

    static {
        defpackage.ajui ajuiVar = new defpackage.ajui("PLAIN", 0);
        a = ajuiVar;
        defpackage.ajui ajuiVar2 = new defpackage.ajui("LAYERED", 1);
        b = ajuiVar2;
        c = new defpackage.ajui[]{ajuiVar, ajuiVar2};
    }

    public static defpackage.ajui valueOf(java.lang.String str) {
        return (defpackage.ajui) java.lang.Enum.valueOf(defpackage.ajui.class, str);
    }

    public static defpackage.ajui[] values() {
        return (defpackage.ajui[]) c.clone();
    }
}
