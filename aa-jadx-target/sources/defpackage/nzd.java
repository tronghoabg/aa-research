package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nzd {
    public static final defpackage.nzd a;
    public static final defpackage.nzd b;
    public static final defpackage.nzd c;
    private static final /* synthetic */ defpackage.nzd[] d;

    static {
        defpackage.nzd nzdVar = new defpackage.nzd("LAUNCHER_CUSTOMIZATION_ENABLED", 0);
        a = nzdVar;
        defpackage.nzd nzdVar2 = new defpackage.nzd("COMPATIBLE_WITH_VEHICLE", 1);
        b = nzdVar2;
        defpackage.nzd nzdVar3 = new defpackage.nzd("IGNORE_CACHE", 2);
        c = nzdVar3;
        d = new defpackage.nzd[]{nzdVar, nzdVar2, nzdVar3};
    }

    public static defpackage.nzd valueOf(java.lang.String str) {
        return (defpackage.nzd) java.lang.Enum.valueOf(defpackage.nzd.class, str);
    }

    public static defpackage.nzd[] values() {
        return (defpackage.nzd[]) d.clone();
    }
}
