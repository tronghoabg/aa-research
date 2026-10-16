package defpackage;

/* loaded from: classes.dex */
final class jqc implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ int b;
    final /* synthetic */ tgu c;
    final /* synthetic */ rwy d;
    final /* synthetic */ String e;
    final /* synthetic */ jqj f;

    public jqc(jqj jqjVar, long j, int i, tgu tguVar, rwy rwyVar, String str) {
        this.a = j;
        this.b = i;
        this.c = tguVar;
        this.d = rwyVar;
        this.e = str;
        this.f = jqjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.e.c(this.a, this.b, this.c, this.d, this.e, null);
    }
}
