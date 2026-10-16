package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class knt implements ryb, knu {
    public static final yph a = yph.c("CAR.USBMON.MENDELDETECT");
    public final Context b;
    public final ScheduledExecutorService c;
    public final ryg d;
    public yfq e;
    public zgp f;
    private xwx g;
    private final mdd h = new kns(this);

    public knt(Context context, ScheduledExecutorService scheduledExecutorService, ryg rygVar) {
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = rygVar;
    }

    private static void g(Iterable iterable) {
        if (iterable == null) {
            return;
        }
        ynp ynpVarListIterator = ((yfq) iterable).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            ((knw) ynpVarListIterator.next()).b();
        }
    }

    @Override // defpackage.ryb
    public final void b(ryv ryvVar) {
        if (ryvVar.a) {
            return;
        }
        g(this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ryb
    public final void d() {
        Context context;
        int i;
        this.g = new ikk(this, 8);
        zhc zhcVar = new zhc();
        qsz qszVar = (qsz) this.g.a(new knr(qszVarArr, zhcVar));
        qsz[] qszVarArr = {qszVar};
        qszVar.e();
        this.f = zhcVar;
        aboh abohVar = acxv.i().b;
        int i2 = yfq.d;
        yfl yflVar = new yfl(4);
        Iterator<E> it = abohVar.iterator();
        while (true) {
            context = this.b;
            if (!it.hasNext()) {
                break;
            }
            rrm rrmVar = (rrm) it.next();
            if ((rrmVar.b & 1) != 0) {
                rrj rrjVar = rrmVar.c;
                if (rrjVar == null) {
                    rrjVar = rrj.a;
                }
                yflVar.i(new knv(context, this, rrjVar, this.c));
            }
        }
        this.e = yflVar.g();
        IntentFilter intentFilter = new IntentFilter();
        yfq yfqVar = this.e;
        int i3 = ((yls) yfqVar).c;
        int i4 = 0;
        while (i4 < i3) {
            ynp ynpVarListIterator = ((yfq) ((knw) yfqVar.get(i4)).a()).listIterator(0);
            while (true) {
                i = i4 + 1;
                if (ynpVarListIterator.hasNext()) {
                    intentFilter.addAction(((htm) ynpVarListIterator.next()).r());
                }
            }
            i4 = i;
        }
        etb.a(context).b(this.h, intentFilter);
    }

    @Override // defpackage.ryb
    public final void e() {
        g(this.e);
        etb.a(this.b).c(this.h);
        zgp zgpVar = this.f;
        if (zgpVar != null) {
            boolean zIsDone = zgpVar.isDone();
            zgp zgpVar2 = this.f;
            if (zIsDone) {
                ((qsz) wub.ag(zgpVar2)).g();
            } else {
                zgpVar2.cancel(false);
            }
        }
        ((ype) a.l().ai((char) 3254)).u("Stopped");
    }

    @Override // defpackage.ryb
    public final /* synthetic */ String[] f() {
        return roc.g();
    }

    @Override // defpackage.ryb
    public final void c(ryx ryxVar) {
    }

    @Override // defpackage.ryb
    public final /* synthetic */ void v(String str, xxh xxhVar) {
    }
}
