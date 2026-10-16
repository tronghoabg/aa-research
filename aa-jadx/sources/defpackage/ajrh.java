package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ajrh {
    public static final defpackage.ajrh a;
    public static final defpackage.ajrh b;
    private static final /* synthetic */ defpackage.ajrh[] c;

    static {
        defpackage.ajrh ajrhVar = new defpackage.ajrh("TARGET", 0);
        a = ajrhVar;
        defpackage.ajrh ajrhVar2 = new defpackage.ajrh("PROXY", 1);
        b = ajrhVar2;
        c = new defpackage.ajrh[]{ajrhVar, ajrhVar2};
    }

    public static defpackage.ajrh valueOf(java.lang.String str) {
        return (defpackage.ajrh) java.lang.Enum.valueOf(defpackage.ajrh.class, str);
    }

    public static defpackage.ajrh[] values() {
        return (defpackage.ajrh[]) c.clone();
    }
}
