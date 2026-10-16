package defpackage;

import android.content.Context;
import android.hardware.usb.UsbManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import j$.time.Duration;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class kql implements kqr {
    public static final yph a = yph.c("GH.FunctionSearch");
    public final List b;
    public final Context c;
    public final UsbManager d;
    public final Duration e;
    public final int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public final ajju l;
    private final Handler m;
    private final boolean n;
    private zgp o;
    private Runnable p;
    private boolean q;
    private final wgx r;

    public kql(Context context) {
        Handler handler = new Handler(Looper.getMainLooper());
        Duration durationOfMillis = Duration.ofMillis(acxv.g());
        int iD = (int) acxv.d();
        boolean zQ = acxv.q();
        int iNextInt = ThreadLocalRandom.current().nextInt(0, acxv.j().b.size());
        this.g = 0;
        this.j = 1;
        this.h = false;
        this.q = true;
        this.k = 1;
        context.getClass();
        this.c = context;
        Object systemService = context.getSystemService("usb");
        systemService.getClass();
        this.d = (UsbManager) systemService;
        this.m = handler;
        Pattern pattern = wez.a;
        wey weyVar = new wey(context);
        weyVar.b("car");
        weyVar.c("function_search.pb");
        Uri uriA = weyVar.a();
        vqk vqkVarF = vqk.f();
        wgg wggVarA = wgh.a();
        wggVarA.d(uriA);
        wggVarA.c(kqk.a);
        this.r = vqkVarF.e(wggVarA.a());
        this.e = durationOfMillis;
        this.f = iD;
        this.n = zQ;
        abog abogVar = acxv.j().b;
        this.b = abogVar;
        ajju ajjuVar = new ajju(abogVar, (byte[]) null);
        this.l = ajjuVar;
        ajjuVar.a = iNextInt;
    }

    private final void g(kqk kqkVar) {
        ikk ikkVar = new ikk(kqkVar, 9);
        wgx wgxVar = this.r;
        zfq zfqVar = zfq.a;
        wub.ah(wgxVar.a(ikkVar, zfqVar), new khs(4), zfqVar);
    }

    @Override // defpackage.kqr
    public final void a(ryx ryxVar) {
        int i;
        if (this.h) {
            boolean z = ryxVar.c;
            this.j = true != z ? 2 : 3;
            boolean z2 = ryxVar.e;
            if (!z2 || (i = this.k) == 1) {
                int i2 = this.k;
                if (!z) {
                    if (i2 != 3) {
                        this.m.removeCallbacks(this.p);
                        this.k = 1;
                        if (this.n) {
                            wub.ah(this.o, new ikn(this, 4), zfq.a);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i2 != 3) {
                    if (!this.q) {
                        b();
                        return;
                    }
                    this.q = false;
                    if (!z2) {
                        this.i = true;
                    }
                    f();
                    return;
                }
                return;
            }
            if (i == 2) {
                ajju ajjuVar = this.l;
                Long l = (Long) ajjuVar.k(this.g - 1);
                int iJ = ajjuVar.j(this.g - 1);
                ajjuVar.a = iJ;
                this.g = 0;
                this.k = 1;
                if (this.i) {
                    if (l.longValue() >= 0) {
                        woy.aa(iJ >= 0, "Function index must be >= 0");
                        ((ype) a.l().ai((char) 3387)).w("Persisting mode: %d", iJ);
                        abnp abnpVarN = kqk.a.n();
                        abnpVarN.t();
                        kqk kqkVar = (kqk) abnpVarN.b;
                        kqkVar.b = 2 | kqkVar.b;
                        kqkVar.d = iJ;
                        abnpVarN.t();
                        kqk kqkVar2 = (kqk) abnpVarN.b;
                        kqkVar2.b |= 1;
                        kqkVar2.c = 0;
                        g((kqk) abnpVarN.q());
                    }
                    ols.N(this.c, yxi.USB_ISSUE_NO_ACCESSORY_MODE_FOUND_USB_FUNCTION, l.intValue());
                }
            } else if (i == 3) {
                abnp abnpVarN2 = kqk.a.n();
                int i3 = this.f;
                abnpVarN2.t();
                kqk kqkVar3 = (kqk) abnpVarN2.b;
                kqkVar3.b |= 1;
                kqkVar3.c = i3;
                g((kqk) abnpVarN2.q());
                ols.M(this.c, yxi.USB_ISSUE_NO_ACCESSORY_MODE_FEATURE_DISABLED);
                e();
            }
            this.q = false;
        }
    }

    public final void b() {
        Runnable runnable = this.p;
        runnable.getClass();
        this.o.getClass();
        this.m.postDelayed(runnable, this.e.toMillis());
    }

    public final void c(long j) {
        woy.aa(j >= 0, "Usb functions must be >= 0");
        this.d.setCurrentFunctions(j);
    }

    @Override // defpackage.kqr
    public final void d() {
        if (this.o == null) {
            this.o = zfb.g(this.r.c(), new kew(this, 2), zfq.a);
        }
        if (this.p == null) {
            this.p = new kea(this, 20);
        }
        this.h = true;
    }

    @Override // defpackage.kqr
    public final void e() {
        this.h = false;
        this.j = 1;
    }

    public final void f() {
        this.o.c(new kyl(this, 1), zfq.a);
    }
}
