package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class adkz extends defpackage.adky {
    protected adkz() {
    }

    @Override // defpackage.adky
    @java.lang.Deprecated
    public abstract defpackage.admp b();

    public final void c(long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.admp admpVarB = b();
        defpackage.ysr.bb(true, "idle timeout is %s, but must be positive", j);
        if (timeUnit.toDays(j) >= 30) {
            ((defpackage.adxc) admpVarB).p = -1L;
        } else {
            ((defpackage.adxc) admpVarB).p = java.lang.Math.max(timeUnit.toMillis(j), defpackage.adxc.c);
        }
    }
}
