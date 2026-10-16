package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class joa implements defpackage.zhh {
    final /* synthetic */ java.util.function.Consumer a;
    final /* synthetic */ java.util.function.Consumer b;
    final /* synthetic */ defpackage.jod c;

    public joa(defpackage.jod jodVar, java.util.function.Consumer consumer, java.util.function.Consumer consumer2) {
        this.a = consumer;
        this.b = consumer2;
        this.c = jodVar;
    }

    @Override // defpackage.zhh
    public final void a(java.lang.Throwable th) {
        defpackage.ypu ypuVarF;
        try {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            defpackage.jod jodVar = this.c;
            if (jodVar.j.compareAndSet(-1L, jElapsedRealtime)) {
                defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) defpackage.jod.a.f()).ai(2422);
                java.lang.Long lValueOf = java.lang.Long.valueOf(jElapsedRealtime);
                defpackage.zke zkeVar = defpackage.zke.a;
                yqjVar.M("Failed acquisition recorded at %s. [Generation: %s]", new defpackage.zkf(zkeVar, lValueOf), new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(jodVar.g)));
            }
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.jod.a.f()).p(th)).ai(2419)).y("Failed to supply ICar. %s", new defpackage.zkf(defpackage.zke.a, th));
            a$.ExternalSyntheticApiModelOutline2.m(this.b, th);
            ypuVarF = defpackage.jod.a.f();
            defpackage.zkf zkfVar = new defpackage.zkf(defpackage.zke.a, java.lang.Integer.valueOf(this.c.g));
        } finally {
            ypuVarF = defpackage.jod.a.f();
            defpackage.jod jodVar2 = this.c;
            ((defpackage.yqj) ((defpackage.yqj) ypuVarF).ai((char) 2421)).y("Opening acquisitionComplete latch. [Generation: %s]", new defpackage.zkf(defpackage.zke.a, java.lang.Integer.valueOf(jodVar2.g)));
            jodVar2.i.countDown();
        }
    }

    @Override // defpackage.zhh
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        defpackage.ypu ypuVarF;
        defpackage.qvl qvlVar = (defpackage.qvl) obj;
        try {
            defpackage.yqm yqmVar = defpackage.jod.a;
            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(2423);
            defpackage.zke zkeVar = defpackage.zke.a;
            yqjVar.y("Supplied ICar: %s", new defpackage.zkf(zkeVar, qvlVar));
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            defpackage.jod jodVar = this.c;
            if (jodVar.j.compareAndSet(-1L, jElapsedRealtime)) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(2426)).M("Successful acquisition recorded at %s. [Generation: %s]", new defpackage.zkf(zkeVar, java.lang.Long.valueOf(jElapsedRealtime)), new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(jodVar.g)));
            }
            a$.ExternalSyntheticApiModelOutline2.m(this.a, qvlVar);
            ypuVarF = defpackage.jod.a.f();
            defpackage.zkf zkfVar = new defpackage.zkf(defpackage.zke.a, java.lang.Integer.valueOf(this.c.g));
        } finally {
            ypuVarF = defpackage.jod.a.f();
            defpackage.jod jodVar2 = this.c;
            ((defpackage.yqj) ((defpackage.yqj) ypuVarF).ai((char) 2425)).y("Opening acquisitionComplete latch. [Generation: %s]", new defpackage.zkf(defpackage.zke.a, java.lang.Integer.valueOf(jodVar2.g)));
            jodVar2.i.countDown();
        }
    }
}
