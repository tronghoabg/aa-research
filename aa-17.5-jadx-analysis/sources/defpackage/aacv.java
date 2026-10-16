package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class aacv {
    public final zyo a;
    public final zrt b;
    public final Executor c;
    public final twq d;
    public nzj e;
    private final int f;

    public aacv(twq twqVar, zyo zyoVar, int i) {
        zrt zrtVar = zrt.a;
        ExecutorService executorServiceC = zrz.c("tileoverlay", 3);
        zkt.n(twqVar, "phoenixGoogleMap");
        this.d = twqVar;
        this.a = zyoVar;
        zkt.n(zyoVar.b, "getTileProvider()");
        this.f = i;
        zkt.n(zrtVar, "uiThreadChecker");
        this.b = zrtVar;
        zkt.n(executorServiceC, "tileOverlayExecutor");
        this.c = executorServiceC;
    }

    public final void a() {
        zyo zyoVar = this.a;
        boolean zD = zyoVar.d();
        nzj nzjVar = this.e;
        if (zD) {
            nzjVar.h(true);
            this.e.g(zyoVar.a());
        } else {
            nzjVar.h(false);
            this.e.g(BitmapDescriptorFactory.HUE_RED);
        }
    }

    public final void b() {
        zyo zyoVar = this.a;
        nzj nzjVar = this.e;
        tqa tqaVar = new tqa(aaaw.e(zyoVar.b()), this.f);
        ufs ufsVar = (ufs) nzjVar.b;
        ufsVar.D(tqaVar);
        ufsVar.F();
    }
}
