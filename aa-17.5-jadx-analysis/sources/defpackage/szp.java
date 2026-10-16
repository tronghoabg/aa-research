package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.time.Duration;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class szp {
    public static volatile admf a;
    public static volatile admf b;
    public static volatile admf c;
    public static volatile admf d;
    public static volatile admf e;
    public static volatile admf f;
    public static volatile admf g;
    public static volatile admf h;
    public static volatile admf i;
    private static volatile admf j;

    private szp() {
    }

    public static final tjd A(afdr afdrVar) {
        afdrVar.getClass();
        return new tjd(afdrVar);
    }

    public static admf a() {
        admf admfVarA;
        admf admfVar = j;
        if (admfVar != null) {
            return admfVar;
        }
        synchronized (szp.class) {
            admfVarA = j;
            if (admfVarA == null) {
                xh xhVarC = admf.c();
                xhVarC.b = adme.a;
                xhVarC.d = admf.b("java.com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.proto.CarAssistantService", "GetSettings");
                xhVarC.b();
                tas tasVar = tas.b;
                abnj abnjVar = aecu.a;
                xhVarC.e = new aect(tasVar);
                xhVarC.c = new aect(tar.a);
                admfVarA = xhVarC.a();
                j = admfVarA;
            }
        }
        return admfVarA;
    }

    public static final /* synthetic */ szs b(abnp abnpVar) {
        abnv abnvVarQ = abnpVar.q();
        abnvVarQ.getClass();
        return (szs) abnvVarQ;
    }

    public static final /* synthetic */ tas c(abnp abnpVar) {
        abnv abnvVarQ = abnpVar.q();
        abnvVarQ.getClass();
        return (tas) abnvVarQ;
    }

    public static final /* synthetic */ void d(taq taqVar, abnp abnpVar) {
        abnpVar.t();
        tas tasVar = (tas) abnpVar.b;
        aboe aboeVar = tas.a;
        abod abodVar = tasVar.c;
        if (!abodVar.c()) {
            tasVar.c = abnv.G(abodVar);
        }
        tasVar.c.g(taqVar.k);
    }

    public static final /* synthetic */ void e(abnp abnpVar) {
        new abof(((tas) abnpVar.b).c, tas.a);
    }

    public static final /* synthetic */ tak f(abnp abnpVar) {
        abnv abnvVarQ = abnpVar.q();
        abnvVarQ.getClass();
        return (tak) abnvVarQ;
    }

    public static final void g(int i2, abnp abnpVar) {
        abnpVar.t();
        tak takVar = (tak) abnpVar.b;
        tak takVar2 = tak.a;
        takVar.b |= 2;
        takVar.d = i2;
    }

    public static final void h(int i2, abnp abnpVar) {
        abnpVar.t();
        tak takVar = (tak) abnpVar.b;
        tak takVar2 = tak.a;
        takVar.b |= 1;
        takVar.c = i2;
    }

    public static void i(eqj eqjVar, eqa eqaVar, eqn eqnVar) {
        tch tchVar = new tch(eqnVar, eqjVar);
        eqjVar.fE(eqaVar, tchVar);
        eqaVar.getLifecycle().c(tchVar);
    }

    public static final void j(eqm eqmVar, Object obj) {
        eqmVar.getClass();
        Set set = (Set) eqmVar.e();
        if (set == null) {
            set = afbg.a;
        }
        eqmVar.m(woy.aR(set, obj));
    }

    public static final void k(eqm eqmVar, Object obj) {
        eqmVar.getClass();
        Set set = (Set) eqmVar.e();
        if (set == null) {
            set = afbg.a;
        }
        eqmVar.m(woy.aT(set, obj));
    }

    public static eqj l(zgp zgpVar) {
        eqm eqmVar = new eqm();
        wub.ah(zgj.v(zgpVar), new tcd(eqmVar, 0), zfq.a);
        return eqmVar;
    }

    public static zgp m(eqa eqaVar, eqj eqjVar) {
        wer.c();
        zhc zhcVar = new zhc();
        tde tdeVar = new tde(new Handler(Looper.getMainLooper()), 0);
        tca tcaVar = new tca(zhcVar);
        tbz tbzVar = new tbz(zhcVar);
        tcb tcbVar = new tcb(eqaVar, tcaVar, eqjVar, tbzVar);
        eqaVar.getLifecycle().c(tcaVar);
        eqjVar.fE(eqaVar, tbzVar);
        wub.ah(zgj.v(zhcVar), tcbVar, tdeVar);
        return zhcVar;
    }

    public static zgp n(eqj eqjVar, Duration duration, ScheduledExecutorService scheduledExecutorService) {
        wer.c();
        zhc zhcVar = new zhc();
        tbz tbzVar = new tbz(zhcVar);
        tcc tccVar = new tcc(eqjVar, tbzVar, 0);
        eqjVar.i(tbzVar);
        wub.ah(zgj.v(zhcVar).x(duration.toMillis(), TimeUnit.MILLISECONDS, scheduledExecutorService), tccVar, zfq.a);
        return zhcVar;
    }

    public static final /* synthetic */ tav o(abnp abnpVar) {
        abnv abnvVarQ = abnpVar.q();
        abnvVarQ.getClass();
        return (tav) abnvVarQ;
    }

    public static final tlz p(tlx tlxVar) {
        abnp abnpVarN = tlz.a.n();
        abnpVarN.getClass();
        abnpVarN.t();
        tlz tlzVar = (tlz) abnpVarN.b;
        tlzVar.b |= 1;
        tlzVar.c = tlxVar.a;
        Drawable drawable = tlxVar.b;
        abms abmsVarL = drawable != null ? tmo.l(drawable, 64) : null;
        if (abmsVarL != null) {
            abnpVarN.t();
            tlz tlzVar2 = (tlz) abnpVarN.b;
            tlzVar2.b |= 2;
            tlzVar2.d = abmsVarL;
        }
        abnv abnvVarQ = abnpVarN.q();
        abnvVarQ.getClass();
        return (tlz) abnvVarQ;
    }

    public static final CarIcon q(Bitmap bitmap) {
        return new CarIcon(new tj(IconCompat.k(bitmap)));
    }

    public static final uj r(tlh tlhVar) {
        uj ujVar = new uj();
        ujVar.g(tlhVar.c);
        sw swVar = new sw();
        Drawable drawable = tlhVar.d;
        if (drawable.getIntrinsicHeight() <= 0 || drawable.getIntrinsicWidth() <= 0) {
            throw new IllegalStateException("Can only use drawables with defined intrinsic height and width");
        }
        swVar.c(q(dti.e(drawable, 0, 0, 7)));
        ujVar.e(swVar.a());
        return ujVar;
    }

    public static final /* synthetic */ tlj s(abnp abnpVar) {
        abnv abnvVarQ = abnpVar.q();
        abnvVarQ.getClass();
        return (tlj) abnvVarQ;
    }

    @ResultIgnorabilityUnspecified
    public static Object t(Looper looper, xyc xycVar) {
        if (Looper.myLooper() == looper) {
            return xycVar.gu();
        }
        Handler handler = new Handler(looper);
        tkp tkpVar = new tkp(xycVar);
        handler.post(tkpVar);
        synchronized (tkpVar) {
            while (!tkpVar.a) {
                try {
                    tkpVar.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        woy.aa(tkpVar.a, "SyncRunnable not complete");
        return tkpVar.b;
    }

    public static void u(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public static void v(Runnable runnable) {
        t(Looper.getMainLooper(), new qfe(runnable, 4));
    }

    public static final boolean w(Uri uri) {
        uri.getClass();
        return affa.f(uri.getScheme(), "android.resource");
    }

    public static final boolean x(Uri uri) {
        String path;
        return (uri == null || !w(uri) || (path = uri.getPath()) == null || afyh.u(path, "station_icon_fallback", false)) ? false : true;
    }

    public static IconCompat y(tjy tjyVar, Uri uri) {
        return tjyVar.b(tjyVar.d(uri));
    }

    public static final tjy z(tjy tjyVar, int i2) {
        return new tjx(IconCompat.k(Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888)), tjyVar);
    }
}
