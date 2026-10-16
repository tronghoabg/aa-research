package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class irl {
    public final defpackage.jfe a;
    public final boolean b;
    public final boolean c;
    public final defpackage.tmy d;
    public final long e;
    public final boolean f;

    public irl(com.google.android.gms.car.CarInfo carInfo, int i, defpackage.jfe jfeVar, boolean z) {
        defpackage.tnc tncVar = new defpackage.tnc();
        this.a = jfeVar;
        boolean z2 = i == 3;
        this.b = z2;
        this.c = z;
        this.d = tncVar;
        j$.util.stream.Stream streamD = defpackage.tht.d(new defpackage.ilz(5), z2 ? defpackage.acnl.a.fF().k() : defpackage.acnl.a.fF().m());
        int i2 = defpackage.ygw.d;
        long jA = defpackage.kjl.a((defpackage.ygw) streamD.collect(defpackage.yds.a), carInfo, -1L);
        this.e = jA;
        this.f = jA != -1;
    }
}
