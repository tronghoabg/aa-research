package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jgk extends defpackage.xzo {
    public long a;
    public long b;
    public final defpackage.xzo c;

    public jgk(defpackage.xzo xzoVar) {
        this.c = xzoVar;
        long jB = xzoVar.b();
        long j = defpackage.jgq.b;
        this.b = jB - j;
        this.a = -j;
    }

    public final long a(long j) {
        return java.lang.Math.min(j - this.b, defpackage.jgq.b);
    }

    @Override // defpackage.xzo
    public final long b() {
        return a(this.c.b()) + this.a;
    }
}
