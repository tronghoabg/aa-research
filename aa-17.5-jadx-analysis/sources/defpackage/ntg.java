package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class ntg {
    public static final ntg a;
    public static final ntg b;
    private static final /* synthetic */ ntg[] c;

    static {
        ntg ntgVar = new ntg("SHOW_4G_FOR_LTE", 0);
        a = ntgVar;
        ntg ntgVar2 = new ntg("HIDE_LTE_PLUS", 1);
        b = ntgVar2;
        c = new ntg[]{ntgVar, ntgVar2};
    }

    public static ntg valueOf(String str) {
        return (ntg) Enum.valueOf(ntg.class, str);
    }

    public static ntg[] values() {
        return (ntg[]) c.clone();
    }
}
