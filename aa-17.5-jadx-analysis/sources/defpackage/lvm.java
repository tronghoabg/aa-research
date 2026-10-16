package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class lvm implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ lvm(Object obj, long j, int i, int i2) {
        this.d = i2;
        this.c = obj;
        this.a = j;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        if (i == 0) {
            lvo lvoVar = (lvo) this.c;
            Map map = lvoVar.c;
            Long lValueOf = Long.valueOf(this.a);
            lvg lvgVar = (lvg) map.get(lValueOf);
            if (lvgVar == null) {
                ((ype) ((ype) lvo.a.h()).ai((char) 4296)).u("There is no matching Conversation.");
                return;
            }
            lvg lvgVarC = lvgVar.c(this.b);
            if (lup.e().i(lvgVar.f())) {
                luv.a().b(lvgVar.f(), mqa.b).f(lvgVar.k);
            } else {
                ((ype) lvo.a.l().ai((char) 4298)).y("Can't find package:%s in launcher app.", lvgVar.f());
            }
            map.put(lValueOf, lvgVarC);
            lvoVar.k(lvgVarC);
            lvoVar.e(lvgVarC);
            return;
        }
        if (i != 1) {
            moa moaVarA = mlq.e().a((yzr) this.c, this.a);
            if (moaVarA == null) {
                ((ype) ((ype) lvq.a.h()).ai((char) 4322)).u("There is no matching StreamItem.");
                return;
            }
            lue lueVar = (lue) moaVarA;
            lue lueVarD = lueVar.d(this.b);
            String str = lueVar.l;
            if (lup.e().i(str)) {
                luv.a().b(str, mqa.b).f(lueVar.s);
            } else {
                ((ype) lvq.a.l().ai((char) 4324)).y("Can't find package:%s in launcher app.", str);
            }
            mlq.e().l(lueVarD);
            return;
        }
        jnj jnjVar = ((jqj) this.c).e;
        xhv xhvVarB = xhv.b(this.b);
        jou jouVar = (jou) jnjVar;
        jouVar.f();
        yph yphVar = jou.a;
        boolean Z = ((ype) yphVar.f()).Z();
        long j = this.a;
        if (Z) {
            ((ype) ((ype) yphVar.f()).ai(2530)).H("sendByeByeRequest called for session %d, current session is %d", j, jouVar.e());
        }
        if (jouVar.k(j)) {
            jouVar.e.post(new jor(jouVar.d(), j, xhvVarB, 0));
        }
    }

    public lvm(jqj jqjVar, long j, int i, int i2) {
        this.d = i2;
        this.a = j;
        this.b = i;
        this.c = jqjVar;
    }
}
