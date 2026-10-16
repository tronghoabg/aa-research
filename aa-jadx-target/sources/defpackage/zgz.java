package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class zgz {
    public static final defpackage.zgz a;
    public static final defpackage.zgz b;
    public static final defpackage.zgz c;
    private static final /* synthetic */ defpackage.zgz[] d;

    static {
        defpackage.zgz zgzVar = new defpackage.zgz("NOT_RUN", 0);
        a = zgzVar;
        defpackage.zgz zgzVar2 = new defpackage.zgz("WILL_NOT_RUN", 1);
        b = zgzVar2;
        defpackage.zgz zgzVar3 = new defpackage.zgz("STARTED", 2);
        c = zgzVar3;
        d = new defpackage.zgz[]{zgzVar, zgzVar2, zgzVar3};
    }

    public static defpackage.zgz valueOf(java.lang.String str) {
        return (defpackage.zgz) java.lang.Enum.valueOf(defpackage.zgz.class, str);
    }

    public static defpackage.zgz[] values() {
        return (defpackage.zgz[]) d.clone();
    }
}
