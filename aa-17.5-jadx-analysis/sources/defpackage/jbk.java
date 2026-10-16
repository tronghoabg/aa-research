package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.auto.components.bugreport.BugreportRequester;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.projection.gearhead.GhApplication;
import com.google.android.projection.gearhead.GhCrashHandler;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class jbk implements xyc {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jbk(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v23, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v36, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r11v44, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r11v51, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.xyc
    public final Object gu() {
        switch (this.c) {
            case 0:
                jbl jblVar = (jbl) this.b;
                Context context = jblVar.b;
                izs izsVar = jblVar.k;
                String str = jblVar.l;
                String str2 = jblVar.o;
                xiv xivVar = jblVar.s;
                jbu jbuVar = jblVar.v;
                izz izzVar = jblVar.p;
                jbp jbpVar = (jbp) this.a;
                return new izu(context, izsVar, jbpVar.c, jbpVar.b, str, str2, xivVar, jbuVar, izzVar);
            case 1:
                return ((ima) this.b).m((CarDisplayId) this.a);
            case 2:
                yph yphVar = jnv.a;
                return new jnp((Context) this.b, (Handler) this.a);
            case 3:
                return ((jnv) this.b).c((jny) this.a);
            case 4:
                return ((jny) this.b).b(this.a);
            case 5:
                yph yphVar2 = BugreportRequester.a;
                Object obj = this.a;
                Context context2 = (Context) this.b;
                return context2.getSharedPreferences("bugreport_shared_preferences_".concat(((jrl) obj).c(context2)), 0);
            case 6:
                Object obj2 = this.a;
                yph yphVar3 = kio.a;
                zjc zjcVar = zjc.a;
                final kio kioVar = (kio) obj2;
                qqf qqfVar = kioVar.n;
                ((ype) yphVar3.l().ai((char) 3119)).y("Registering listener %s with CarClientToken", new zjd(zjcVar, qqfVar));
                Object obj3 = this.b;
                obj3.getClass();
                return omc.b((Context) obj3, kioVar.m, new rbv() { // from class: kii
                    @Override // defpackage.rbv
                    public final void a(rbu rbuVar) {
                        wer.c();
                        yph yphVar4 = kio.a;
                        yop yopVarH = yphVar4.h();
                        zjc zjcVar2 = zjc.a;
                        ((ype) ((ype) yopVarH).ai((char) 3139)).y("CarClientToken connection failed: %s", new zjd(zjcVar2, rbuVar));
                        kio kioVar2 = kioVar;
                        kioVar2.e = rbuVar;
                        kioVar2.m(kin.b);
                        wer.c();
                        ((ype) yphVar4.l().ai((char) 3128)).u("notifyListenersOnConnectionFailed entered");
                        CopyOnWriteArraySet copyOnWriteArraySet = kioVar2.k;
                        synchronized (copyOnWriteArraySet) {
                            Iterator it = copyOnWriteArraySet.iterator();
                            while (it.hasNext()) {
                                kfn kfnVar = (kfn) it.next();
                                ((ype) yphVar4.l().ai(3129)).y("calling onConnectionFailed on %s", new zjd(zjcVar2, kfnVar));
                                kfnVar.d(rbuVar);
                            }
                        }
                    }
                }, qqfVar, 2);
            case 7:
                int i = qer.g;
                return new oqg((Context) this.b, this.a);
            case 8:
                rur rurVar = (rur) this.b;
                Context context3 = rurVar.c;
                rtf rtfVar = rurVar.k;
                rtx rtxVar = rurVar.o;
                ruw ruwVar = (ruw) this.a;
                return new rth(context3, rtfVar, ruwVar.c, ruwVar.b, rtxVar);
            case 9:
                return ((rod) this.b).b(((vxa) this.a.a()).a);
            case 10:
                return ((ytq) ((nfh) this.b).b).i(((abms) this.a).D());
            case 11:
                shr shrVar = (shr) this.b;
                String str3 = shrVar.i;
                String str4 = shrVar.h;
                return wci.b(str4, (AtomicReference) ((wci) ((six) this.a).a).d.get(new xxi(str3, str4)));
            case 12:
                return wci.b("", (AtomicReference) ((wci) ((six) this.a).a).e.get(((shr) this.b).i));
            case 13:
                return String.valueOf(wac.b((Context) this.b)) + File.separator + "phenotype_storage_info" + File.separator + "shared" + File.separator + ((String) this.a);
            case 14:
                int i2 = GhApplication.b;
                return new kmr(this.a, (Context) this.b);
            default:
                yph yphVar4 = GhCrashHandler.a;
                Object obj4 = this.a;
                Context context4 = (Context) this.b;
                return context4.getSharedPreferences("crash_shared_preferences_".concat(((jrl) obj4).c(context4)), 0);
        }
    }

    public /* synthetic */ jbk(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
