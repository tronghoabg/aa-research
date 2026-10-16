package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.RemoteException;
import android.util.TypedValue;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import j$.util.DesugarArrays;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class kyi implements kiy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kyi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v87, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object, qxp] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.kiy
    public final void a() throws qrz, qsa {
        boolean z;
        Collection collectionValues;
        int i = 5;
        int i2 = 6;
        int i3 = 0;
        int i4 = 1;
        switch (this.b) {
            case 0:
                roe roeVarE = lau.a().e(kio.b().e());
                kyk kykVar = (kyk) this.a;
                kykVar.g = roeVarE;
                kykVar.g.b = kykVar.f;
                kykVar.e = lau.a().c(kio.b().e());
                return;
            case 1:
                mki.a.f();
                erb erbVarC = ((qsz) kio.b().e()).d().v().c();
                jwa jwaVar = (jwa) this.a;
                jwaVar.e = erbVarC;
                mki.a.f();
                jwaVar.c = oni.f(kio.b().e());
                ogz ogzVar = jwa.d;
                mki.a.f();
                CarInfo carInfoD = oni.d(kio.b().e());
                for (abrh abrhVar : aczc.f().b) {
                    int iAs = a.as(abrhVar.c);
                    if (iAs == 0) {
                        iAs = 1;
                    }
                    if (iAs == 5) {
                        z = true;
                    } else if (iAs == 6) {
                        iAs = 6;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (iAs == 6 || iAs == 7) {
                        String str = abrhVar.e;
                        yph yphVar = kjf.a;
                        Stream streamFilter = DesugarArrays.stream(str.split(":")).map(new ilq(17)).filter(new hmd(20));
                        int i5 = yfq.d;
                        yfq yfqVar = (yfq) streamFilter.collect(ycm.a);
                        ArrayList arrayList = new ArrayList();
                        if (kjf.h(carInfoD, yfqVar)) {
                            Iterator it = (!abrhVar.d.isEmpty() ? abrhVar.d : ogzVar.b.keySet()).iterator();
                            while (it.hasNext()) {
                                Integer num = (Integer) ogzVar.b.get((String) it.next());
                                if (num != null) {
                                    arrayList.add(num);
                                }
                            }
                        }
                        collectionValues = arrayList;
                    } else {
                        collectionValues = ogzVar.b.values();
                    }
                    Iterator it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        ogzVar.a.put((Integer) it2.next(), Boolean.valueOf(z));
                    }
                }
                jwaVar.b(jvy.a, jvx.a, 0);
                jwaVar.b = true;
                return;
            case 2:
                mki.a.g();
                rdm rdmVarD = ((qsz) kio.b().e()).d();
                rfe rfeVar = (rfe) rdmVarD.f.a(new rcl(rdmVarD, i3));
                Object obj = this.a;
                laf lafVar = (laf) obj;
                try {
                    rfeVar.b(lafVar.c);
                } catch (qrz e) {
                    ((ype) ((ype) ((ype) laf.a.g()).p(e)).ai((char) 3679)).u("Failed to add the audio stream diagnostics listener, possibly due to b/185152155");
                    ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.AUDIO_DIAGNOSTICS, yzy.vK).l());
                }
                lafVar.c.c();
                rfeVar.c(lafVar.d);
                synchronized (obj) {
                    ((laf) obj).b = rfeVar;
                }
                return;
            case 3:
                mal malVar = (mal) this.a;
                if (!malVar.d) {
                    roe roeVar = malVar.f;
                    roeVar.getClass();
                    if (!roeVar.b(1)) {
                        malVar.e(maj.a);
                        return;
                    }
                }
                malVar.d = true;
                malVar.b(true);
                return;
            case 4:
                ((mal) this.a).b(false);
                return;
            case 5:
                mki.a.g();
                roe roeVarS = ols.s(kio.b().e());
                mal malVar2 = (mal) this.a;
                malVar2.f = roeVarS;
                malVar2.f.b = new mak(malVar2);
                malVar2.b = true;
                malVar2.c = true;
                return;
            case 6:
                Object obj2 = this.a;
                try {
                    mki.a.f();
                    ((mhv) obj2).h = oni.g(kio.b().e(), "com.google.android.apps.auto.projectedapps");
                    return;
                } catch (qsa unused) {
                    ((ype) ((ype) mhv.a.f()).ai((char) 4961)).u("Projected Apps not supported by target device");
                    return;
                }
            case 7:
                ((ype) mpd.a.l().ai((char) 5143)).u("Registering CarActivityLifecycleEventListener");
                rdm rdmVarD2 = ((qsz) kio.b().e()).d();
                rox roxVar = rdmVarD2.f;
                Object obj3 = this.a;
                roxVar.g(new rcu(rdmVarD2, obj3, i2));
                rdm rdmVarD3 = ((qsz) kio.b().e()).d();
                mpd mpdVar = (mpd) obj3;
                rdmVarD3.f.g(new rcu(rdmVarD3, mpdVar.i, 2));
                mpdVar.g = true;
                mpdVar.f = true;
                return;
            case 8:
                ((ype) mpe.a.l().ai((char) 5157)).u("Registering CarActivityStartProcessor");
                mki.a.g();
                rdm rdmVarD4 = ((qsz) kio.b().e()).d();
                rox roxVar2 = rdmVarD4.f;
                Object obj4 = this.a;
                roxVar2.g(new rcu(rdmVarD4, obj4, i));
                ((mpe) obj4).b = true;
                return;
            case 9:
                Object obj5 = this.a;
                if (obj5 != null) {
                    mki.a.g();
                    ols.f(kio.b().e(), CarDisplayId.a, (ProjectionWindowAnimationChoreography) obj5);
                }
                mki.a.g();
                ols.E(kio.b().e(), CarRegionId.a);
                return;
            case 10:
                mki.a.g();
                qrn qrnVarE = kio.b().e();
                CarDisplayId carDisplayId = CarDisplayId.a;
                CarDisplay carDisplayD = ols.v(qrnVarE, carDisplayId).d();
                if (carDisplayD == null) {
                    ((ype) ((ype) nrx.a.h()).ai((char) 5349)).u("show called before layout is calculated.");
                    return;
                }
                Object obj6 = this.a;
                Point point = carDisplayD.d;
                Rect rectA = carDisplayD.a();
                point.getClass();
                Rect rect = new Rect(rectA.left, rectA.top, point.x - rectA.right, point.y - rectA.bottom);
                ((ype) nrx.a.l().ai((char) 5348)).M("contentInsets: %s stableArea: %s", rectA, rect);
                nso nsoVarB = nsr.c().b();
                qsw qswVarN = nsoVarB.n(nsn.s);
                qswVarN.getClass();
                CarWindowLayoutParams carWindowLayoutParamsA = qswVarN.a();
                int i6 = 18;
                if (!acxa.Z()) {
                    mpf mpfVarQ = mpg.q();
                    mpfVarQ.e(true);
                    mpfVarQ.d(true);
                    mpfVarQ.f(true);
                    mpfVarQ.g(true);
                    mpfVarQ.c(false);
                    mpfVarQ.b(false);
                    mpg mpgVarA = mpfVarQ.a();
                    mki mkiVar = mki.a;
                    Context context = mkiVar.c;
                    mkiVar.g();
                    ((nrx) obj6).c = mpi.a(context, ols.v(kio.b().e(), carDisplayId), rect, carWindowLayoutParamsA.i + 1, nsoVarB.v(), new ily(i6), mpgVarA);
                    return;
                }
                int iApplyDimension = (int) TypedValue.applyDimension(1, acxa.k(), mki.a.c.getResources().getDisplayMetrics());
                mpf mpfVarQ2 = mpg.q();
                mpfVarQ2.e(rectA.left > iApplyDimension);
                mpfVarQ2.g(rectA.top > iApplyDimension);
                mpfVarQ2.f(rectA.right > iApplyDimension);
                mpfVarQ2.d(rectA.bottom > iApplyDimension);
                mpfVarQ2.c(true);
                mpfVarQ2.b(false);
                mpg mpgVarA2 = mpfVarQ2.a();
                mki mkiVar2 = mki.a;
                Context context2 = mkiVar2.c;
                mkiVar2.g();
                ((nrx) obj6).c = mpi.a(context2, ols.v(kio.b().e(), carDisplayId), rect, carWindowLayoutParamsA.i + 1, nsoVarB.v(), new ily(i6), mpgVarA2);
                return;
            case 11:
                nrx nrxVar = (nrx) this.a;
                nrv nrvVar = nrxVar.d;
                if (nrvVar != null) {
                    nrvVar.a();
                    nrxVar.d = null;
                    return;
                }
                return;
            case 12:
                rdx rdxVar = ((sab) this.a).h;
                Object objA = rdxVar.f.a();
                objA.getClass();
                ((rox) objA).g(new rea(rdxVar, i4));
                return;
            default:
                mki.a.g();
                qrh qrhVarK = ols.k(kio.b().e());
                xfx xfxVar = (xfx) this.a;
                xfxVar.e = qrhVarK;
                if (xfxVar.e.a()) {
                    qrh qrhVar = xfxVar.e;
                    qxr qxrVar = xfxVar.f;
                    ?? r0 = qrhVar.b;
                    if (r0 == 0) {
                        throw new IllegalStateException("Cannot add CarPhoneStatusEventListener if carPhoneStatus is null");
                    }
                    try {
                        r0.j(1, qxrVar);
                    } catch (RemoteException e2) {
                        olm.h(e2);
                    }
                }
                if (xfxVar.e.b()) {
                    xfxVar.Q();
                    return;
                }
                return;
        }
    }
}
