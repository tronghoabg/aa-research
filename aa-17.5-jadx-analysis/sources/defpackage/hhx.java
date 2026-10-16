package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.auto.components.apphost.view.widgets.common.RowListView;
import com.google.android.apps.auto.components.firstdrive.FirstDriveNotificationManager;
import com.google.android.apps.auto.components.ui.media.MediaPlaybackView;
import com.google.android.apps.auto.sdk.ui.CarLayoutManager;
import com.google.android.gearhead.service.SharedService;
import com.google.android.gms.car.display.CarRegionId;
import j$.util.Objects;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class hhx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ hhx(int i, nur nurVar, int i2) {
        this.c = i2;
        this.a = i;
        this.b = nurVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v43, types: [java.lang.Object, paa] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, jcx] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, jcx] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, jcx] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 2;
        switch (this.c) {
            case 0:
                int i2 = this.a;
                Object obj = this.b;
                ((hhy) obj).a.n("dismissAlert", new hhx(obj, i2, i));
                return;
            case 1:
                ((dsg) this.b).a(this.a);
                return;
            case 2:
                gdl gdlVar = (gdl) ((hhy) this.b).a.a.l(gdl.class);
                gdlVar.getClass();
                gdlVar.d(this.a);
                return;
            case 3:
                ((ype) ((ype) ((iru) this.b).a.l().l(10, TimeUnit.SECONDS)).ai(1252)).w("frame sent outside session. size: %d", this.a);
                return;
            case 4:
                this.b.a(this.a);
                return;
            case 5:
                this.b.a(this.a);
                return;
            case 6:
                this.b.b(this.a);
                return;
            case 7:
                jqa jqaVar = ((jpz) this.b).a;
                jqaVar.i.set(-1, false);
                int i3 = this.a;
                Set set = jqaVar.d;
                synchronized (set) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        qwg qwgVar = (qwg) it.next();
                        try {
                            qwgVar.a(i3);
                        } catch (RemoteException unused) {
                            ((ype) ((ype) jqa.a.f()).ai(2582)).y("RemoteException notifying listener %s onCarConnectionFailure.", new zjd(zjc.a, qwgVar));
                            it.remove();
                        }
                    }
                }
                return;
            case 8:
                nuj.b().g("APPHOST", this.a, ((jym) this.b).b.getPackageName());
                return;
            case 9:
                CarLayoutManager carLayoutManager = ((RowListView) this.b).c().g;
                if (carLayoutManager.i) {
                    carLayoutManager.a = true;
                    carLayoutManager.O();
                }
                carLayoutManager.Q(this.a, oxa.QUICK);
                return;
            case 10:
                ((kzf) this.b).b(this.a);
                return;
            case 11:
                int i4 = this.a;
                lin linVar = (lin) this.b;
                linVar.j = i4;
                linVar.a();
                return;
            case 12:
                int i5 = maz.a;
                nuj.b().j("AlarmNotificationHandler", this.a, (nur) this.b);
                return;
            case 13:
                if (lbh.d().g()) {
                    int i6 = this.a;
                    mtv mtvVar = (mtv) this.b;
                    mtvVar.d.m(false);
                    yph yphVar = mtv.b;
                    yphVar.l().w("onDragEnded(%s)", i6);
                    mtt mttVarD = mtvVar.d();
                    int i7 = mttVarD.h;
                    if (i6 > i7) {
                        mttVarD.i = true;
                    } else if (i6 < i7) {
                        mttVarD.i = false;
                    }
                    mttVarD.h = i6;
                    mttVarD.c(i6);
                    nsu nsuVarL = mttVarD.a.l();
                    yfq yfqVar = nsuVarL != null ? nsuVarL.e : null;
                    mtvVar.e.m(Boolean.valueOf(yfqVar != null && i6 == woy.bh(yfqVar)));
                    if (yfqVar != null) {
                        mtr.a.a().c(((Integer) yfqVar.get(i6)).intValue());
                    }
                    if (i6 == 0) {
                        if (!mttVarD.g) {
                            yphVar.l().u("Dashboard collapsed by drag, already closed");
                            return;
                        }
                        ((ype) yphVar.f()).u("Dashboard collapsed by drag");
                        mttVarD.g = false;
                        mttVarD.b(muc.b);
                        return;
                    }
                    if (i6 > 0) {
                        if (mttVarD.g) {
                            yphVar.l().w("Dashboard expanded by drag to %s, already expanded", i6);
                            return;
                        }
                        ((ype) yphVar.f()).u("Dashboard expanded by drag");
                        mttVarD.d = true;
                        mttVarD.g = true;
                        mttVarD.b(muc.a);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                MediaPlaybackView mediaPlaybackView = (MediaPlaybackView) this.b;
                boolean z = mediaPlaybackView.c;
                int i8 = this.a;
                if (z) {
                    krt krtVarA = krn.a(i8);
                    krr krrVar = krr.w;
                    mediaPlaybackView.d(krrVar.a(mediaPlaybackView.getContext(), krtVarA), krr.D.a(mediaPlaybackView.getContext(), krtVarA), krr.q.a(mediaPlaybackView.getContext(), krtVarA), krr.s.a(mediaPlaybackView.getContext(), krtVarA), krr.v.a(mediaPlaybackView.getContext(), krtVarA), krrVar.a(mediaPlaybackView.getContext(), krtVarA), krr.o.a(mediaPlaybackView.getContext(), krtVarA));
                }
                mediaPlaybackView.b(i8);
                return;
            case 15:
                int i9 = oza.g;
                if (aczv.aX()) {
                    return;
                }
                ((ozb) this.b).j.remove(Integer.valueOf(this.a));
                return;
            case 16:
                ((pbi) this.b).a.h.c(pag.a(this.a), Bundle.EMPTY);
                return;
            case 17:
                this.b.f(this.a);
                return;
            case 18:
                int i10 = this.a;
                boolean z2 = (i10 & 4) == 0 && (i10 & 1) == 0;
                int i11 = i10 & 6;
                mpj mpjVarE = mpl.e();
                mpjVarE.f(z2);
                mpjVarE.o();
                Object obj2 = this.b;
                mpjVarE.n();
                nsr nsrVarC = nsr.c();
                CarRegionId carRegionId = ((raa) obj2).a;
                if (nsrVarC.a(carRegionId.h).k(carRegionId) == nsn.d) {
                    mpjVarE.i(i11 == 0);
                    return;
                }
                return;
            case 19:
                ((qfp) this.b).a.searchController.p((this.a & 2) == 0);
                return;
            default:
                qjo qjoVar = ((qjp) this.b).b.b.b;
                wer.c();
                yph yphVar2 = SharedService.a;
                ype ypeVar = (ype) yphVar2.l().ai(7397);
                int i12 = this.a;
                Integer numValueOf = Integer.valueOf(i12);
                zjc zjcVar = zjc.a;
                ypeVar.M("Processed event %s %s", new zjd(zjcVar, numValueOf), new zjd(zjcVar, Integer.valueOf(qjoVar.a)));
                if (i12 != 0) {
                    woy.aa(qjoVar.a > 0, "Asymmetrical projection exit");
                    qjoVar.a--;
                    kfl.g().d(yxi.PROJECTION_MODE_ENDED);
                    if (qjoVar.a == 0) {
                        ((ype) yphVar2.l().ai((char) 7399)).u("Process exit from shared car mode");
                        lds.a().b(false);
                        SharedService sharedService = qjoVar.c;
                        if (!Objects.equals(sharedService.d, "UNINITIALIZED_BLUETOOTH_ADDRESS") && !Objects.equals(sharedService.e, "UNINITIALIZED_BLUETOOTH_ADDRESS")) {
                            kfl.g().h();
                        }
                    }
                } else {
                    if (qjoVar.a == 0) {
                        if (!qjoVar.b) {
                            SharedService sharedService2 = qjoVar.c;
                            kzd.j().c();
                            lnm.K().c();
                            lnm.S().c();
                            lcq.a().c();
                            FirstDriveNotificationManager.a().c();
                            qjoVar.b = true;
                        }
                        ((ype) yphVar2.l().ai((char) 7398)).u("Processed event enter shared car mode");
                        lds.a().b(true);
                        SharedService sharedService3 = qjoVar.c;
                        if (!Objects.equals(sharedService3.d, "UNINITIALIZED_BLUETOOTH_ADDRESS") && !Objects.equals(sharedService3.e, "UNINITIALIZED_BLUETOOTH_ADDRESS")) {
                            kfl.g().i(sharedService3.d, sharedService3.e);
                            kmz kmzVar = (kmz) mki.a.k(kmz.class);
                            kmzVar.getClass();
                            kmzVar.b(sharedService3.d);
                        }
                    }
                    kfl.g().d(yxi.PROJECTION_MODE_STARTED);
                    qjoVar.a++;
                }
                woy.O(qjoVar.a >= 0, "Use count never goes < 0");
                return;
        }
    }

    public hhx(dsg dsgVar, int i, int i2) {
        this.c = i2;
        this.b = dsgVar;
        this.a = i;
    }

    public /* synthetic */ hhx(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    public hhx(jpz jpzVar, int i, int i2) {
        this.c = i2;
        this.a = i;
        this.b = jpzVar;
    }
}
