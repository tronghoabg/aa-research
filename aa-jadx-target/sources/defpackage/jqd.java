package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jqd implements java.lang.Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ j$.time.Duration b;
    final /* synthetic */ int c;
    final /* synthetic */ defpackage.thq d;
    final /* synthetic */ defpackage.rxr e;
    final /* synthetic */ java.lang.String f;
    final /* synthetic */ defpackage.jqk g;

    public jqd(defpackage.jqk jqkVar, long j, j$.time.Duration duration, int i, defpackage.thq thqVar, defpackage.rxr rxrVar, java.lang.String str) {
        this.a = j;
        this.b = duration;
        this.c = i;
        this.d = thqVar;
        this.e = rxrVar;
        this.f = str;
        this.g = jqkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.e.c(this.a, this.b, this.c, this.d, this.e, this.f, null);
    }
}
