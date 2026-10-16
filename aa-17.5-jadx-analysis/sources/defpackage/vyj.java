package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class vyj {
    public volatile vym a = vyl.a;
    public volatile boolean b = true;
    public volatile vye c = new vyg();

    public vyj(final Context context, final Executor executor, final vyl vylVar, final ackk ackkVar, boolean z, xxh xxhVar, aezk aezkVar, final zgh zghVar) {
        final aezk aezkVar2 = (!z || xxhVar.f()) ? null : aezkVar;
        executor.execute(new Runnable() { // from class: vyi
            @Override // java.lang.Runnable
            public final void run() {
                vyj vyjVar = this.a;
                ackk ackkVar2 = ackkVar;
                zgh zghVar2 = zghVar;
                Context context2 = context;
                int i = 1;
                if (tmz.e(context2)) {
                    vyjVar.a(ackkVar2, zghVar2);
                } else {
                    Callable callable = Executors.callable(new saq(vyjVar, ackkVar2, zghVar2, executor, 11, (char[]) null), null);
                    tmz.b(context2, new vtb(callable, i), zfq.a);
                }
                if (vyjVar.b) {
                    aezk aezkVar3 = aezkVar2;
                    vyl vylVar2 = vylVar;
                    if (aezkVar3 == null) {
                        abnp abnpVarN = ajfz.a.n();
                        abnpVarN.t();
                        ajfz ajfzVar = (ajfz) abnpVarN.b;
                        ajfzVar.e = 2;
                        ajfzVar.b = 2 | ajfzVar.b;
                        vyjVar.a = vylVar2.a((ajfz) abnpVarN.q());
                        return;
                    }
                    try {
                        vyjVar.a = vylVar2.a((ajfz) aezkVar3.a());
                    } catch (Throwable th) {
                        ((ynz) ((ynz) ((ynz) vlj.a.h()).p(th)).ai((char) 9884)).u("Couldn't get sampling strategy");
                        abnp abnpVarN2 = ajfz.a.n();
                        abnpVarN2.t();
                        ajfz ajfzVar2 = (ajfz) abnpVarN2.b;
                        ajfzVar2.c = 2;
                        ajfzVar2.d = 1;
                        abnpVarN2.t();
                        ajfz ajfzVar3 = (ajfz) abnpVarN2.b;
                        ajfzVar3.e = 3;
                        ajfzVar3.b = 2 | ajfzVar3.b;
                        vyjVar.a = vylVar2.a((ajfz) abnpVarN2.q());
                    }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, tmb] */
    public final void a(ackk ackkVar, zgh zghVar) {
        try {
            vqu vquVar = (vqu) ackkVar.a();
            this.b = vquVar.c();
            final int iA = vquVar.a();
            this.c = zghVar.a ? new vyg() : new vyh(new aezk() { // from class: vyf
                @Override // defpackage.aezk, defpackage.aezj
                public final Object a() {
                    return Integer.valueOf(iA);
                }
            }, zghVar.b);
        } catch (Throwable th) {
            ((ynz) ((ynz) ((ynz) vlj.a.h()).p(th)).ai((char) 9883)).u("Couldn't get config");
            this.b = false;
        }
    }
}
