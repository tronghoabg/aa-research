package defpackage;

import android.os.SystemClock;
import java.util.function.Consumer;

/* loaded from: classes.dex */
final class jns implements zge {
    final /* synthetic */ Consumer a;
    final /* synthetic */ Consumer b;
    final /* synthetic */ jnv c;

    public jns(jnv jnvVar, Consumer consumer, Consumer consumer2) {
        this.a = consumer;
        this.b = consumer2;
        this.c = jnvVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jnv jnvVar = this.c;
            if (jnvVar.j.compareAndSet(-1L, jElapsedRealtime)) {
                ype ypeVar = (ype) ((ype) jnv.a.f()).ai(2421);
                Long lValueOf = Long.valueOf(jElapsedRealtime);
                zjc zjcVar = zjc.a;
                ypeVar.M("Failed acquisition recorded at %s. [Generation: %s]", new zjd(zjcVar, lValueOf), new zjd(zjcVar, Integer.valueOf(jnvVar.g)));
            }
            ((ype) ((ype) ((ype) jnv.a.f()).p(th)).ai(2418)).y("Failed to supply ICar. %s", new zjd(zjc.a, th));
            this.b.accept(th);
            yop yopVarF = jnv.a.f();
            jnv jnvVar2 = this.c;
            ((ype) ((ype) yopVarF).ai((char) 2419)).y("Opening acquisitionComplete latch. [Generation: %s]", new zjd(zjc.a, Integer.valueOf(jnvVar2.g)));
            jnvVar2.i.countDown();
        } catch (Throwable th2) {
            yop yopVarF2 = jnv.a.f();
            jnv jnvVar3 = this.c;
            ((ype) ((ype) yopVarF2).ai((char) 2420)).y("Opening acquisitionComplete latch. [Generation: %s]", new zjd(zjc.a, Integer.valueOf(jnvVar3.g)));
            jnvVar3.i.countDown();
            throw th2;
        }
    }

    @Override // defpackage.zge
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        qup qupVar = (qup) obj;
        try {
            yph yphVar = jnv.a;
            ype ypeVar = (ype) ((ype) yphVar.f()).ai(2422);
            zjc zjcVar = zjc.a;
            ypeVar.y("Supplied ICar: %s", new zjd(zjcVar, qupVar));
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jnv jnvVar = this.c;
            if (jnvVar.j.compareAndSet(-1L, jElapsedRealtime)) {
                ((ype) ((ype) yphVar.f()).ai(2425)).M("Successful acquisition recorded at %s. [Generation: %s]", new zjd(zjcVar, Long.valueOf(jElapsedRealtime)), new zjd(zjcVar, Integer.valueOf(jnvVar.g)));
            }
            this.a.accept(qupVar);
            yop yopVarF = jnv.a.f();
            jnv jnvVar2 = this.c;
            ((ype) ((ype) yopVarF).ai((char) 2423)).y("Opening acquisitionComplete latch. [Generation: %s]", new zjd(zjc.a, Integer.valueOf(jnvVar2.g)));
            jnvVar2.i.countDown();
        } catch (Throwable th) {
            yop yopVarF2 = jnv.a.f();
            jnv jnvVar3 = this.c;
            ((ype) ((ype) yopVarF2).ai((char) 2424)).y("Opening acquisitionComplete latch. [Generation: %s]", new zjd(zjc.a, Integer.valueOf(jnvVar3.g)));
            jnvVar3.i.countDown();
            throw th;
        }
    }
}
