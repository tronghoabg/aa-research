package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rqu {
    public static final defpackage.rqu a;
    public static final defpackage.rqu b;
    public static final defpackage.rqu c;
    private static final /* synthetic */ defpackage.rqu[] d;

    static {
        defpackage.rqu rquVar = new defpackage.rqu("UNKNOWN", 0);
        a = rquVar;
        defpackage.rqu rquVar2 = new defpackage.rqu("ENABLED", 1);
        b = rquVar2;
        defpackage.rqu rquVar3 = new defpackage.rqu("DISABLED", 2);
        c = rquVar3;
        d = new defpackage.rqu[]{rquVar, rquVar2, rquVar3};
    }

    public static defpackage.rqu valueOf(java.lang.String str) {
        return (defpackage.rqu) java.lang.Enum.valueOf(defpackage.rqu.class, str);
    }

    public static defpackage.rqu[] values() {
        return (defpackage.rqu[]) d.clone();
    }
}
