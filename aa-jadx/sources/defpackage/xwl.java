package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class xwl {
    public static final defpackage.xwl a;
    public static final defpackage.xwl b;
    public static final defpackage.xwl c;
    private static final /* synthetic */ defpackage.xwl[] d;

    static {
        defpackage.xwl xwlVar = new defpackage.xwl("NEW", 0);
        a = xwlVar;
        defpackage.xwl xwlVar2 = new defpackage.xwl("ENQUEUED", 1);
        b = xwlVar2;
        defpackage.xwl xwlVar3 = new defpackage.xwl("EARLY_COMPLETED", 2);
        c = xwlVar3;
        d = new defpackage.xwl[]{xwlVar, xwlVar2, xwlVar3};
    }

    public static defpackage.xwl valueOf(java.lang.String str) {
        return (defpackage.xwl) java.lang.Enum.valueOf(defpackage.xwl.class, str);
    }

    public static defpackage.xwl[] values() {
        return (defpackage.xwl[]) d.clone();
    }
}
