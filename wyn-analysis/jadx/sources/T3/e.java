package T3;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final String f11408c = J3.r.f("EnqueueRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final K3.k f11409a;

    /* renamed from: b, reason: collision with root package name */
    public final S3.e f11410b;

    public e(K3.k kVar) {
        S3.e eVar = new S3.e(8);
        this.f11409a = kVar;
        this.f11410b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f9 A[LOOP:4: B:76:0x016c->B:124:0x02f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(K3.k r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.e.a(K3.k):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        S3.e eVar = this.f11410b;
        K3.k kVar = this.f11409a;
        try {
            kVar.getClass();
            HashSet hashSet = new HashSet();
            hashSet.addAll(kVar.f6489c);
            HashSet hashSetH0 = K3.k.h0(kVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(kVar.f6489c);
                    z2 = false;
                    break;
                } else if (hashSetH0.contains((String) it.next())) {
                    z2 = true;
                    break;
                }
            }
            if (z2) {
                throw new IllegalStateException("WorkContinuation has cycles (" + kVar + ")");
            }
            K3.q qVar = kVar.f6487a;
            WorkDatabase workDatabase = qVar.f6503c;
            workDatabase.c();
            try {
                boolean zA = a(kVar);
                workDatabase.n();
                if (zA) {
                    k.a(qVar.f6501a, RescheduleReceiver.class, true);
                    K3.i.a(qVar.f6502b, qVar.f6503c, qVar.f6505e);
                }
                eVar.r(J3.w.f5589L8);
            } finally {
                workDatabase.j();
            }
        } catch (Throwable th) {
            eVar.r(new J3.t(th));
        }
    }
}
