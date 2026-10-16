package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class alg {
    public final android.widget.Magnifier a;

    public alg(android.widget.Magnifier magnifier) {
        this.a = magnifier;
    }

    public final long a() {
        android.widget.Magnifier magnifier = this.a;
        return (((long) hh$.ExternalSyntheticApiModelOutline0.m(magnifier)) << 32) | (((long) hh$.ExternalSyntheticApiModelOutline0.m$1(magnifier)) & 4294967295L);
    }

    public final void b() {
        hh$.ExternalSyntheticApiModelOutline0.m$1(this.a);
    }

    public void c(long j, float f) {
        hh$.ExternalSyntheticApiModelOutline0.m(this.a, java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & j)));
    }
}
