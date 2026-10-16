package defpackage;

import android.content.BroadcastReceiver;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.car.diagnostics.CriticalError;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final /* synthetic */ class qjv implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qjv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zIsEmpty;
        int i = 10;
        int i2 = 0;
        switch (this.b) {
            case 0:
                qjw qjwVar = (qjw) this.a;
                qjwVar.f = false;
                Runnable runnable = qjwVar.g;
                Handler handler = qjwVar.e;
                handler.removeCallbacks(runnable);
                handler.removeCallbacks(qjwVar.h);
                Iterator it = qjwVar.c.iterator();
                while (it.hasNext()) {
                    ((mnp) it.next()).b();
                }
                return;
            case 1:
                ((qjj) this.a).a.performEditorAction(3);
                return;
            case 2:
                wer.c();
                qjw qjwVar2 = (qjw) this.a;
                List list = qjwVar2.b;
                qju qjuVar = qjwVar2.d;
                qjuVar.b(list);
                while (true) {
                    if (i2 < list.size() - 1) {
                        moa moaVar = (moa) list.get(i2);
                        i2++;
                        if (qjuVar.compare(moaVar, (moa) list.get(i2)) > 0) {
                            qjuVar.c(list);
                            Iterator it2 = qjwVar2.c.iterator();
                            while (it2.hasNext()) {
                                ((mnp) it2.next()).a();
                            }
                        }
                    }
                }
                qjwVar2.e.postDelayed(this, 60000L);
                return;
            case 3:
                Object obj = this.a;
                if (obj != null) {
                    ((BroadcastReceiver.PendingResult) obj).finish();
                    return;
                }
                return;
            case 4:
                ((qmd) this.a).a.B();
                return;
            case 5:
                ((qmd) this.a).a.D(null);
                return;
            case 6:
                ((qmq) this.a).z();
                return;
            case 7:
                Looper looperMyLooper = Looper.myLooper();
                Looper mainLooper = Looper.getMainLooper();
                Object obj2 = this.a;
                if (looperMyLooper == mainLooper) {
                    ((qmv) obj2).b.b().c(this);
                    return;
                }
                qmv qmvVar = (qmv) obj2;
                boolean zE = qmvVar.e();
                qmvVar.d = 0L;
                if (zE) {
                    qmvVar.a();
                    return;
                }
                return;
            case 8:
                Object obj3 = this.a;
                qpt qptVar = (qpt) obj3;
                long andSet = qptVar.h.getAndSet(0L);
                long andSet2 = qptVar.j.getAndSet(0L);
                if (andSet == 0) {
                    synchronized (obj3) {
                        Future future = ((qpt) obj3).A;
                        if (future != null) {
                            future.cancel(false);
                            ((qpt) obj3).A = null;
                        }
                    }
                    List list2 = qptVar.B;
                    if (list2.isEmpty()) {
                        return;
                    }
                    qptVar.k(yfq.o(list2));
                    list2.clear();
                    return;
                }
                List list3 = qptVar.B;
                list3.add(andSet + ":" + (andSet2 / andSet) + "us");
                if (list3.size() >= 10) {
                    qptVar.k(yfq.o(list3));
                    list3.clear();
                    return;
                }
                return;
            case 9:
                Object obj4 = this.a;
                int andSet3 = (((qpt) obj4).f.getAndSet(0) * 8) / 1000;
                synchronized (obj4) {
                    List list4 = ((qpt) obj4).z;
                    list4.add(String.valueOf(andSet3));
                    if (list4.size() >= 10) {
                        ((qpt) obj4).l(yfq.o(list4));
                        list4.clear();
                    }
                }
                return;
            case 10:
                qqt qqtVar = (qqt) this.a;
                if (qqtVar.g != xhj.AUDIO_FOCUS_STATE_GAIN) {
                    qqt.a.h().ai(7641).u("HU failed to recover LOSS_TR after phone call");
                    qqtVar.i = false;
                    qqtVar.f.b(yzy.zl);
                    return;
                }
                return;
            case 11:
                Object obj5 = this.a;
                qqt qqtVar2 = (qqt) obj5;
                if (qqtVar2.i) {
                    qqt.a.f().ai(7634).u("Request HU to recover LOSS_TR state");
                    qqtVar2.i(1);
                    qqs qqsVar = qqtVar2.k;
                    qqsVar.getClass();
                    qqsVar.postDelayed(new qjv(obj5, i), 1000L);
                    qqtVar2.f.b(yzy.zk);
                    return;
                }
                return;
            case 12:
                ypf ypfVar = qqt.a;
                ypfVar.d().ai(7609).u("Running focusReleaseRunnable");
                qqt qqtVar3 = (qqt) this.a;
                rfp rfpVar = qqtVar3.d;
                rfpVar.getClass();
                if (rfpVar.c()) {
                    ypfVar.d().ai(7612).u("Some app is playing audio, so not waiting for MEDIA stream to stop.");
                    return;
                }
                qpx qpxVar = qqtVar3.b;
                qpxVar.k(3, 5000L);
                if (rfpVar.c()) {
                    ypfVar.d().ai(7611).u("Some app is playing audio, so not waiting for TTS stream to stop.");
                    return;
                }
                qpxVar.k(5, 5000L);
                if (rfpVar.c()) {
                    ypfVar.d().ai(7610).u("Some app is playing audio, so not requesting to release focus to car.");
                    return;
                }
                qqs qqsVar2 = qqtVar3.k;
                qqsVar2.getClass();
                qqsVar2.d();
                return;
            case 13:
                Object obj6 = this.a;
                qrf qrfVar = (qrf) obj6;
                qrfVar.a();
                qrfVar.b.f.remove(obj6);
                return;
            case 14:
                qrp qrpVar = (qrp) this.a;
                Runnable runnable2 = qrpVar.b;
                if (runnable2 != null) {
                    runnable2.run();
                    qrpVar.b = null;
                    return;
                }
                return;
            case 15:
                Map map = ((qso) this.a).c;
                synchronized (map) {
                    zIsEmpty = map.isEmpty();
                }
                if (zIsEmpty) {
                    Object obj7 = this.a;
                    qso.a.l().ai(7846).u("CSB onClientsDisconnected");
                    qso qsoVar = (qso) obj7;
                    qsoVar.r();
                    if (qsoVar.u()) {
                        return;
                    }
                    qsoVar.d.h();
                    return;
                }
                return;
            case 16:
                qso qsoVar2 = (qso) this.a;
                if (qsoVar2.t()) {
                    qsoVar2.i.n();
                    return;
                }
                return;
            case 17:
                ((qsn) this.a).a.f(CriticalError.a(yze.PROTOCOL_BYEBYE_REQUESTED_BY_USER, yzf.BYEBYE_BY_USER));
                return;
            case 18:
                ((qsr) ((wyd) this.a).a).p(CriticalError.a(yze.UNKNOWN_CODE, yzf.UNKNOWN_DETAIL));
                return;
            case 19:
                ((qsr) ((wyd) this.a).a).p(CriticalError.a(yze.UNKNOWN_CODE, yzf.UNKNOWN_DETAIL));
                return;
            default:
                ((qsr) ((wyd) this.a).a).p(CriticalError.a(yze.UNKNOWN_CODE, yzf.UNKNOWN_DETAIL));
                return;
        }
    }

    public qjv(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
