package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class lzh {
    public static final defpackage.lzh a;
    public static final defpackage.lzh b;
    public static final defpackage.lzh c;
    public static final defpackage.lzh d;
    private static final /* synthetic */ defpackage.lzh[] e;

    static {
        defpackage.lzh lzhVar = new defpackage.lzh("LOCKED", 0);
        a = lzhVar;
        defpackage.lzh lzhVar2 = new defpackage.lzh("RESTRICTED", 1);
        b = lzhVar2;
        defpackage.lzh lzhVar3 = new defpackage.lzh("MODERATED", 2);
        c = lzhVar3;
        defpackage.lzh lzhVar4 = new defpackage.lzh("UNLIMITED", 3);
        d = lzhVar4;
        e = new defpackage.lzh[]{lzhVar, lzhVar2, lzhVar3, lzhVar4};
    }

    public static defpackage.lzh valueOf(java.lang.String str) {
        return (defpackage.lzh) java.lang.Enum.valueOf(defpackage.lzh.class, str);
    }

    public static defpackage.lzh[] values() {
        return (defpackage.lzh[]) e.clone();
    }
}
