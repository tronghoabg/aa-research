package defpackage;

import android.content.Context;
import com.google.android.apps.auto.components.bugreport.BugreportRequester;
import j$.time.Instant;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class kge implements rbt {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Context c;
    final /* synthetic */ Instant d;

    public kge(AtomicReference atomicReference, boolean z, Context context, Instant instant) {
        this.a = atomicReference;
        this.b = z;
        this.c = context;
        this.d = instant;
    }

    @Override // defpackage.rbt
    public final void a() {
        qsz qszVar = (qsz) this.a.get();
        qszVar.getClass();
        boolean z = this.b;
        Context context = this.c;
        if (z) {
            Instant instant = this.d;
            yph yphVar = BugreportRequester.a;
            mki mkiVar = mki.a;
            if (mkiVar != null) {
                mkiVar.d.execute(new kea(context, 7));
                BugreportRequester.f(context, instant, qszVar, true);
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            if (mki.a != null) {
                if (kgi.h(context)) {
                    countDownLatch.countDown();
                } else {
                    mki.a.d.execute(new xx(context, instant, (qrn) qszVar, countDownLatch, 12));
                    mki.a.d.execute(new kea(context, 8));
                }
            }
            try {
                if (!countDownLatch.await(5L, TimeUnit.SECONDS)) {
                    ((ype) ((ype) BugreportRequester.a.h()).ai(3012)).u("Timed out waiting for latch");
                }
            } catch (InterruptedException e) {
                ((ype) ((ype) ((ype) BugreportRequester.a.h()).p(e)).ai((char) 3013)).u("Interrupted waiting for latch");
            }
        } else {
            BugreportRequester.f(context, this.d, qszVar, false);
        }
        qszVar.g();
    }

    @Override // defpackage.rbt
    public final void b(rbs rbsVar) {
        ((ype) BugreportRequester.a.l().ai((char) 3014)).u("Token suspended");
    }
}
