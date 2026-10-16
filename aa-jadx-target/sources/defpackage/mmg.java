package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum mmg {
    DRIVER_ALIGNED(defpackage.zbd.dP),
    PASSENGER_ALIGNED(defpackage.zbd.dQ);

    public static final defpackage.mmg c = PASSENGER_ALIGNED;
    public static final defpackage.ygw d;
    public final defpackage.zbd e;

    static {
        j$.util.stream.Stream map = j$.util.DesugarArrays.stream(values()).map(new defpackage.mmf(0));
        int i = defpackage.ygw.d;
        d = (defpackage.ygw) map.collect(defpackage.yds.a);
    }

    mmg(defpackage.zbd zbdVar) {
        this.e = zbdVar;
    }

    public static defpackage.mmg a(java.lang.String str) {
        defpackage.mmg mmgVar = DRIVER_ALIGNED;
        return mmgVar.name().equals(str) ? mmgVar : c;
    }
}
