package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.clearcut.BatchedLogEventParcelable;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class sjm {
    public static final ScheduledExecutorService a;
    public final sji b = new sji();

    static {
        spu spuVar = ssr.a;
        a = spu.aE();
    }

    public static boolean b(List list) {
        return ((sjk) list.get(0)).d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Queue] */
    public final void a(sjd sjdVar, String str) {
        while (true) {
            sji sjiVar = this.b;
            Context context = sjdVar.b;
            ArrayList arrayList = new ArrayList();
            long jD = adco.a.gu().d(context);
            synchronized (sjiVar.a) {
                ?? r5 = sjiVar.d;
                if (r5.isEmpty()) {
                    long length = 0;
                    while (true) {
                        ?? r8 = sjiVar.c;
                        if (!r8.isEmpty()) {
                            if (((sjk) r8.element()).a.b != null) {
                                length += r9.length;
                                if (!arrayList.isEmpty() && length > jD) {
                                    break;
                                } else {
                                    arrayList.add((sjk) r8.remove());
                                }
                            } else if (arrayList.isEmpty()) {
                                arrayList.add((sjk) r8.remove());
                            }
                        } else {
                            break;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        sjiVar.b = false;
                    }
                } else {
                    arrayList.add((sjk) r5.remove());
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (b(arrayList)) {
                sji.a(((sjk) arrayList.get(0)).a.a.f, 1034);
            } else {
                sji.a(str, 1026);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sji.a(((sjk) it.next()).a.a.f, 1027);
                }
            }
            sjl sjlVar = new sjl(this, sjdVar, arrayList, str);
            Stream map = Collection.EL.stream(arrayList).map(new ric(9));
            int i = yfq.d;
            BatchedLogEventParcelable batchedLogEventParcelable = new BatchedLogEventParcelable((yfq) map.collect(ycm.a), sjg.b().a());
            try {
                sjf sjfVar = (sjf) sjdVar.v();
                Parcel parcelGh = sjfVar.gh();
                ijp.i(parcelGh, sjlVar);
                ijp.g(parcelGh, batchedLogEventParcelable);
                sjfVar.gk(9, parcelGh);
                AtomicBoolean atomicBoolean = sjlVar.a;
                if (atomicBoolean.get()) {
                    return;
                }
                ScheduledFuture<?> scheduledFutureSchedule = a.schedule(new shd(sjlVar, 2), adco.a.gu().a(sjlVar.c.b), TimeUnit.MILLISECONDS);
                if (sjlVar.b.getAndSet(scheduledFutureSchedule) != null) {
                    throw new IllegalStateException("Timeout should only be started once.");
                }
                if (atomicBoolean.get()) {
                    scheduledFutureSchedule.cancel(false);
                    return;
                }
                return;
            } finally {
            }
        }
    }
}
