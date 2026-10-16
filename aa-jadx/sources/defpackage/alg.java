package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class alg {
    public final android.widget.Magnifier a;

    public alg(android.widget.Magnifier magnifier) {
        this.a = magnifier;
    }

    public final long a() {
        android.widget.Magnifier magnifier = this.a;
        return (((long) magnifier.getWidth()) << 32) | (((long) magnifier.getHeight()) & 4294967295L);
    }

    public final void b() {
        this.a.dismiss();
    }

    public void c(long j, float f) {
        this.a.show(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & j)));
    }
}
