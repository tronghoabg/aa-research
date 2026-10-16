package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.time.Duration;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class qfe implements xyc {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qfe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r14v28, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v32, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v44, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v47, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v50, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v56, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v66, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v69, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v72, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v75, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v78, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, tmb] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.xyc
    public final Object gu() {
        int iB;
        toi toiVar;
        int i = 10;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(nrq.b().a().fH(((raa) this.a).a));
            case 1:
                qah qahVar = new qah(abwp.a);
                abwo abwoVarA = qahVar.a();
                abwoVarA.getClass();
                Integer num = qahVar.c;
                ajdr ajdrVar = (ajdr) this.a;
                Object obj = ajdrVar.c;
                if (num == null) {
                    int andIncrement = ((qar) ((qau) obj).b.gu()).b.getAndIncrement();
                    Integer.valueOf(andIncrement).getClass();
                    qahVar.c = Integer.valueOf(andIncrement);
                }
                qau qauVar = (qau) obj;
                Duration.ofMillis(qauVar.c.a());
                qag qagVarC = qauVar.c(new qaj(null));
                qcf qcfVar = qauVar.e;
                if (qcfVar != null) {
                    qcfVar.a();
                }
                if (!pzx.a.contains(qahVar.a())) {
                    synchronized (qauVar.l) {
                        if (!Objects.equals(((qau) obj).o, abwoVarA)) {
                            if (((qau) obj).o != null) {
                                ((qau) obj).m.clear();
                            }
                            ((qau) obj).o = abwoVarA;
                        }
                    }
                    qam qamVar = qauVar.g;
                    int i2 = abwoVarA.a;
                    long epochMilli = qauVar.c.f().toEpochMilli();
                    ydx ydxVar = qamVar.b;
                    synchronized (ydxVar) {
                        ydxVar.add(new qal(i2, epochMilli));
                    }
                    List<ncp> list = qauVar.k;
                    synchronized (list) {
                        for (ncp ncpVar : list) {
                            ncpVar.a.execute(new rgm(ncpVar, abwoVarA.a, i, bArr));
                        }
                    }
                }
                ?? r4 = ajdrVar.a;
                Object obj2 = ajdrVar.b;
                qaq qaqVar = new qaq(qahVar, qagVarC, qauVar, r4, (xxh) ajdrVar.e);
                qap qapVar = (qap) obj2;
                if (qapVar.d == null) {
                    synchronized (obj2) {
                        if (((qap) obj2).d == null) {
                            uyh uyhVar = ((htm) ((qap) obj2).b.a()).B().e;
                            if (uyhVar == null) {
                                uyhVar = uyh.a;
                            }
                            int i3 = uyhVar.o;
                            if (i3 <= 0) {
                                ((ynz) qap.a.a(uys.a).ai(6976)).w("Flush period is %d, must be > 0. Using 60 instead", i3);
                                i3 = 60;
                            }
                            long j = i3;
                            ((qap) obj2).d = ((qap) obj2).c.scheduleAtFixedRate(new pru(obj2, 20), j, j, TimeUnit.SECONDS);
                        }
                    }
                }
                qapVar.e.add(new WeakReference(qaqVar));
                return qaqVar;
            case 2:
                return ((qso) this.a).k();
            case 3:
                return new ssc((Activity) this.a);
            case 4:
                this.a.run();
                return null;
            case 5:
                vaq.d();
                Object obj3 = this.a;
                ttn ttnVar = ttn.a;
                ttl ttlVar = new ttl();
                tnt tntVar = ((tnl) obj3).c;
                if (tntVar != null) {
                    iB = tntVar.b(ttlVar);
                } else {
                    ((tnl) obj3).i.execute(new shd(obj3, i));
                    ttlVar.b(ttb.a(((tnl) obj3).j.c()));
                    iB = 1;
                }
                ((tnl) obj3).f = Boolean.valueOf(iB != 3);
                if (iB == 1) {
                    ((tnl) obj3).g = 15.0f;
                } else {
                    ((tnl) obj3).g = ttlVar.e;
                }
                if (((tnl) obj3).l != null) {
                    qbs qbsVar = qbs.AUTO_PAN_MODE_ENABLED;
                }
                if (tntVar != null) {
                    tntVar.a();
                }
                if (Boolean.TRUE.equals(((tnl) obj3).f) && (toiVar = (toi) ((tnl) obj3).b.gu()) != null) {
                    ((ums) ((tnl) obj3).d.a()).j();
                    ttlVar.e(too.k(toiVar));
                    float f = ((tnl) obj3).g;
                    float f2 = ((ppm) ((tnl) obj3).e).a().f;
                    if (f2 >= BitmapDescriptorFactory.HUE_RED) {
                        f = f2;
                    }
                    ttlVar.e = Math.min(21.0f, Math.max(2.0f, f));
                }
                ((ums) ((tnl) obj3).d.a()).l();
                return ttlVar.a();
            case 6:
                return false;
            case 7:
                return this.a;
            case 8:
                return Boolean.valueOf(((zwm) this.a.a()).a().e);
            case 9:
                Object obj4 = this.a;
                yob yobVar = txu.a;
                return Boolean.valueOf(obj4 != null ? ((uaj) obj4).h() : false);
            case 10:
                ((tyb) this.a).b.a();
                return false;
            case 11:
                int i4 = tzz.e;
                ?? r14 = this.a;
                return false;
            case 12:
                int i5 = tzz.e;
                return false;
            case 13:
                int i6 = tzz.e;
                return Integer.valueOf(zwm.f().k);
            case 14:
                int i7 = tzz.e;
                return Integer.valueOf(zwm.f().l);
            case 15:
                return Boolean.valueOf(pyn.a((Context) this.a, pyo.AGMM_ENABLE_LAZIFY_STARTUP_DEPENDENCIES));
            case 16:
                ((zwm) this.a.a()).g();
                return false;
            case 17:
                ((zwm) this.a.a()).g();
                return false;
            case 18:
                ((zwm) this.a.a()).g();
                return false;
            case 19:
                ((zwm) this.a.a()).g();
                return false;
            default:
                ((zwm) this.a.a()).g();
                return false;
        }
    }
}
