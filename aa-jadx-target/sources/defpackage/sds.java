package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sds {
    public static final defpackage.sds a;
    public static final defpackage.sds b;
    public static final defpackage.sds c;
    private static final /* synthetic */ defpackage.sds[] d;

    static {
        defpackage.sds sdsVar = new defpackage.sds("USB", 0);
        a = sdsVar;
        defpackage.sds sdsVar2 = new defpackage.sds("WIFI", 1);
        b = sdsVar2;
        defpackage.sds sdsVar3 = new defpackage.sds("CHROMECAST", 2);
        c = sdsVar3;
        d = new defpackage.sds[]{sdsVar, sdsVar2, sdsVar3};
    }

    public static defpackage.sds valueOf(java.lang.String str) {
        return (defpackage.sds) java.lang.Enum.valueOf(defpackage.sds.class, str);
    }

    public static defpackage.sds[] values() {
        return (defpackage.sds[]) d.clone();
    }
}
