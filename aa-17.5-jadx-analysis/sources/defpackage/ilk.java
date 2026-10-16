package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Handler;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.SortedSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class ilk implements xyc {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ilk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v59, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r14v61, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r14v65, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, jes, jev, jew] */
    @Override // defpackage.xyc
    public final Object gu() throws Throwable {
        Throwable th;
        Integer numValueOf;
        int i = 6;
        boolean z = false;
        switch (this.b) {
            case 0:
                return new Handler(((ima) this.a).o.getLooper());
            case 1:
                return new qzh((ima) this.a);
            case 2:
                CarInfo carInfoT = ((ima) this.a).t();
                return Boolean.valueOf(carInfoT != null && carInfoT.e >= 6);
            case 3:
                ?? r3 = this.a;
                izj izjVar = new izj(r3, null);
                ima imaVar = (ima) r3;
                jcp jcpVarB = imaVar.u.b();
                jcpVarB.getClass();
                jgi jgiVar = imaVar.X;
                imf imfVar = imaVar.ac;
                return new ivc(izjVar, imaVar.O, r3, r3, imaVar.l, r3, imaVar.k, imaVar.K, imaVar.o, jcpVarB, imaVar.ab, imfVar, jgiVar);
            case 4:
                return ima.o(((ima) this.a).X()).y;
            case 5:
                return ((ima) this.a).n();
            case 6:
                return Boolean.valueOf(((ima) this.a).W);
            case 7:
                iob iobVar = (iob) this.a;
                return acur.h() ? iobVar.z : new rps(iobVar.d, false, false);
            case 8:
                yph yphVar = iya.a;
                PackageManager packageManager = ((Context) this.a).getPackageManager();
                abru abruVarB = acma.b();
                xxx xxxVar = iyj.a;
                return tgx.c(new gjm(packageManager, 7), abruVarB);
            case 9:
                return Boolean.valueOf(((skn) ((iya) this.a).c.a()).b("com.android.vending"));
            case 10:
                return ((jdu) this.a).a.d();
            case 11:
                return ((jdu) this.a).a.c();
            case 12:
                int i2 = jgn.c;
                jhc jhcVar = ((ina) this.a).w;
                jhcVar.getClass();
                return Integer.valueOf(jhcVar.a.d);
            case 13:
                final CarDisplayId carDisplayId = (CarDisplayId) this.a;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: jgp
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        return new Thread(new imt(runnable, 20, null), "GH-Vsync-" + carDisplayId.b);
                    }
                });
            case 14:
                return this.a.gu();
            case 15:
                yph yphVar2 = jnv.a;
                return ((jnp) this.a.gu()).c;
            case 16:
                yph yphVar3 = jnv.a;
                jnp jnpVar = (jnp) this.a.gu();
                zgj zgjVarV = zgj.v(jnpVar.c);
                ikk ikkVar = new ikk(jnpVar, 5);
                zfq zfqVar = zfq.a;
                return zgjVarV.w(ikkVar, zfqVar).u(Exception.class, new ikk(jnpVar, i), zfqVar);
            case 17:
                yph yphVar4 = jou.a;
                Object obj = this.a;
                obj.getClass();
                return jme.a.a((Context) obj);
            case 18:
                iyp iypVar = new iyp();
                jpy jpyVar = ((jqa) this.a).e;
                jpyVar.getClass();
                jou jouVar = (jou) jpyVar;
                jouVar.d.post(new jlh(jouVar, (iyq) iypVar, 8));
                return iypVar;
            case 19:
                return iya.q(((jqj) this.a).h);
            default:
                jqj jqjVar = (jqj) this.a;
                if (!jqjVar.i.f()) {
                    return jqjVar.b.c(jqjVar.h) ? jqjVar.j : new jqo();
                }
                jqjVar.p();
                jnl jnlVar = jqjVar.k;
                int callingUid = Binder.getCallingUid();
                if (Process.myUid() == callingUid) {
                    int i3 = yfq.d;
                    Object[] objArr = {"com.google.android.projection.gearhead"};
                    yrm.B(objArr, 1);
                    jnlVar.b(new ylz(new yls(objArr, 1), yli.a), true);
                } else {
                    SortedSet sortedSet = (SortedSet) jnlVar.b.get(Integer.valueOf(callingUid));
                    if (sortedSet == null) {
                        String[] packagesForUid = jnlVar.c.getPackageManager().getPackagesForUid(callingUid);
                        if (packagesForUid != null) {
                            yhc yhcVarW = yhc.w(yli.a, packagesForUid.length, (Comparable[]) packagesForUid.clone());
                            try {
                                yno it = ((ylz) yhcVarW).iterator();
                                boolean zBv = false;
                                do {
                                    try {
                                        if (it.hasNext()) {
                                            try {
                                                zBv = jnlVar.d.bv((String) it.next(), qpi.e.ordinal());
                                            } catch (RemoteException e) {
                                                ((ype) ((ype) ((ype) jnl.a.h()).p(e)).ai(2409)).u("Failure while checking if package is allowed.");
                                                zBv = false;
                                            }
                                            numValueOf = Integer.valueOf(callingUid);
                                        } else {
                                            jnlVar.b(yhcVarW, zBv);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z = zBv;
                                        jnlVar.b(yhcVarW, z);
                                        throw th;
                                    }
                                } while (!zBv);
                                ((ype) jnl.a.l().ai(2408)).w("Allowing call from UID %d", callingUid);
                                jnlVar.b.put(numValueOf, yhcVarW);
                                jnlVar.b(yhcVarW, true);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        ((ype) ((ype) jnl.a.h()).ai((char) 2406)).w("Call from UID %d is not allowed.", callingUid);
                        throw new SecurityException("Caller is not allowed");
                    }
                    jnlVar.b(sortedSet, true);
                }
                return jqjVar.j;
        }
    }
}
