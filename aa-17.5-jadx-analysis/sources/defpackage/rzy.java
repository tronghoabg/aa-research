package defpackage;

import android.os.RemoteException;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import com.google.android.gms.carsetup.frx.SetupFsm;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final /* synthetic */ class rzy implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rzy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v50, types: [android.content.ServiceConnection, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                sab sabVar = (sab) this.a;
                Iterator it = new HashSet(sabVar.g.keySet()).iterator();
                while (it.hasNext()) {
                    sabVar.i((rby) it.next());
                }
                break;
            case 1:
                break;
            case 2:
                ((sar) this.a).a.k();
                break;
            case 3:
                sat satVar = (sat) this.a;
                satVar.c.removeCallbacks(satVar.b);
                ypf ypfVar = CarSetupServiceImpl.a;
                satVar.d.i.h();
                break;
            case 4:
                ((sbb) this.a).c();
                break;
            case 5:
                sbm sbmVar = (sbm) this.a;
                ScheduledFuture scheduledFuture = sbmVar.g;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                sbmVar.e.removeCallbacksAndMessages(null);
                sbmVar.f.shutdownNow();
                break;
            case 6:
                rxf.m(((sej) this.a).a, yxo.ONLY_KNOWN_CARS);
                break;
            case 7:
                SetupFsm.a.f().ai(8799).u("AutoIntroState / broadcasting delayed acknowledgement due to phone unlock");
                ((sej) this.a).b.f("EVENT_INTRO_ACKNOWLEDGED", null);
                break;
            case 8:
                SetupFsm.a.g().ai(8798).u("Critical error: user didn't unlock to proceed within 30s.");
                ((sej) this.a).b.f("EVENT_INTRO_LOCK_TIMEOUT", null);
                break;
            case 9:
                ((sdx) this.a).a.a.f();
                break;
            case 10:
                sfl.m.g().ai(8862).u("Critical error: user didn't unlock to proceed within 30s.");
                sga sgaVar = ((sfl) this.a).r;
                sgaVar.getClass();
                if (!sgaVar.c) {
                    sgaVar.g.L(yzz.FRX_PRESETUP_EXIT_CONDITIONS, yzy.pT);
                    sgaVar.g();
                    break;
                }
                break;
            case 11:
                Object obj = this.a;
                sft sftVar = (sft) obj;
                sftVar.c = true;
                sftVar.b.c();
                ((sfw) obj).c().h(12);
                break;
            case 12:
                sgs sgsVar = ((sgx) this.a).g;
                if (sgsVar != null) {
                    ypf ypfVar2 = sgx.a;
                    ypfVar2.f().ai(8932).u("Tearing down connection");
                    if (sgsVar.i == 1) {
                        sgsVar.i = 2;
                        rwv rwvVar = sgsVar.f;
                        if (rwvVar == null) {
                            rhx rhxVar = rhx.c;
                            ypfVar2.h().ai(8934).u("Skipping stopping startup service when null");
                        } else {
                            try {
                                rwvVar.m(sgsVar.b);
                            } catch (RemoteException e) {
                                sgx.a.f().p(e).ai(8933).y("Couldn't stop %s, but it could be fine.", sgsVar.c);
                            }
                        }
                    }
                    if (sgsVar.i == 2) {
                        sgsVar.i = 3;
                        spi.a().c(sgsVar.h.b, sgsVar);
                        break;
                    }
                }
                break;
            case 13:
                ((wyd) this.a).f();
                break;
            case 14:
                ((wyd) this.a).e();
                break;
            case 15:
                ((sgs) this.a).h.h.g(false);
                break;
            case 16:
                ?? r6 = this.a;
                sgs sgsVar2 = (sgs) r6;
                if (sgsVar2.i == 1) {
                    sgsVar2.i = 3;
                    sgx sgxVar = sgsVar2.h;
                    spi.a().c(sgxVar.b, r6);
                    sgxVar.d.post(new rzy(sgxVar.h, 14));
                    break;
                }
                break;
            case 17:
                ((wyd) this.a).e();
                break;
            case 18:
                ((rwl) this.a).a.h.g(false);
                break;
            case 19:
                shi shiVar = (shi) this.a;
                shiVar.j.c(null, shiVar.d);
                break;
            default:
                ((shi) this.a).f();
                break;
        }
    }

    public rzy(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
