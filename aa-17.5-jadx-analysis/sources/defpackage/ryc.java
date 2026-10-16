package defpackage;

import android.content.Context;
import android.hardware.usb.UsbManager;
import android.net.Uri;
import android.os.Handler;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class ryc implements ryb {
    public static final ypf a = ols.R("CAR.USBMON.NOACC");
    public static final yfq b;
    public static final ajlp q;
    public final Context c;
    public final UsbManager d;
    public final Handler e;
    public final long f;
    public final long g;
    public final int h;
    public final boolean i;
    public Runnable j;
    public long n;
    public ajmd r;
    private final boolean s;
    private final boolean t;
    private zgp u;
    private final wgx v;
    public int k = 0;
    public int o = 1;
    public boolean l = false;
    public boolean m = false;
    public int p = 1;

    static {
        rhx rhxVar = rhx.c;
        yfq yfqVarT = acxv.p() ? yfq.t(4L, 16L, 0L, 8L) : yfq.s(4L, 16L, 0L);
        b = yfqVarT;
        q = new ajlp((List) yfqVarT);
    }

    public ryc(Context context, Handler handler, boolean z, long j, long j2, int i, boolean z2, int i2, boolean z3) {
        context.getClass();
        this.c = context;
        Object systemService = context.getSystemService("usb");
        systemService.getClass();
        this.d = (UsbManager) systemService;
        this.e = handler;
        Pattern pattern = wez.a;
        wey weyVar = new wey(context);
        weyVar.b("car");
        weyVar.c("no_accessory.pb");
        Uri uriA = weyVar.a();
        vqk vqkVarF = vqk.f();
        wgg wggVarA = wgh.a();
        wggVarA.d(uriA);
        wggVarA.c(rrp.a);
        this.v = vqkVarF.e(wggVarA.a());
        this.s = z;
        this.f = j;
        this.g = j2;
        this.h = i;
        this.t = z2;
        this.i = z3;
        q.a = i2;
    }

    private final void i(rrp rrpVar) {
        rgf rgfVar = new rgf(rrpVar, 2);
        wgx wgxVar = this.v;
        zfq zfqVar = zfq.a;
        wub.ah(wgxVar.a(rgfVar, zfqVar), new khs(6), zfqVar);
    }

    @Override // defpackage.ryb
    public final void c(ryx ryxVar) {
        if (this.l) {
            boolean z = ryxVar.c;
            this.o = true != z ? 2 : 3;
            if (!ryxVar.e) {
                if (z) {
                    if (!ryxVar.b || this.p == 3) {
                        return;
                    }
                    g();
                    return;
                }
                if (this.p != 3) {
                    this.e.removeCallbacks(this.j);
                    this.p = 1;
                    if (this.t) {
                        wub.ah(this.u, new ikn(this, 16), zfq.a);
                        return;
                    }
                    return;
                }
                return;
            }
            ajmd ajmdVar = this.r;
            if (ajmdVar != null) {
                ajmdVar.q(q.m(this.k - 1), 2L);
            }
            int i = this.p;
            if (i != 2) {
                if (i == 3) {
                    abnp abnpVarN = rrp.a.n();
                    int i2 = this.h;
                    abnpVarN.t();
                    rrp rrpVar = (rrp) abnpVarN.b;
                    rrpVar.b |= 1;
                    rrpVar.c = i2;
                    i((rrp) abnpVarN.q());
                    ols.M(this.c, yxi.USB_ISSUE_NO_ACCESSORY_MODE_FEATURE_DISABLED);
                    e();
                    return;
                }
                return;
            }
            ajlp ajlpVar = q;
            Long l = (Long) ajlpVar.n(this.k - 1);
            int iM = ajlpVar.m(this.k - 1);
            a.l().ai(8547).w("Persisting mode: %d", iM);
            abnp abnpVarN2 = rrp.a.n();
            abnpVarN2.t();
            rrp rrpVar2 = (rrp) abnpVarN2.b;
            rrpVar2.b = 2 | rrpVar2.b;
            rrpVar2.d = iM;
            abnpVarN2.t();
            rrp rrpVar3 = (rrp) abnpVarN2.b;
            rrpVar3.b |= 1;
            rrpVar3.c = 0;
            i((rrp) abnpVarN2.q());
            ajlpVar.a = iM;
            this.k = 0;
            this.p = 1;
            ols.N(this.c, yxi.USB_ISSUE_NO_ACCESSORY_MODE_FOUND_USB_FUNCTION, l.intValue());
        }
    }

    @Override // defpackage.ryb
    public final void d() {
        if (this.u == null) {
            this.u = !this.s ? wub.Y(new wic(-1L)) : zfb.g(this.v.c(), new kew(this, 4), zfq.a);
        }
        if (this.j == null) {
            this.j = new rnq(this, 15);
        }
        this.l = true;
    }

    @Override // defpackage.ryb
    public final void e() {
        this.l = false;
        this.o = 1;
    }

    @Override // defpackage.ryb
    public final /* synthetic */ String[] f() {
        return roc.g();
    }

    public final void g() {
        this.j.getClass();
        zgp zgpVar = this.u;
        zgpVar.getClass();
        zgpVar.c(new rnq(this, 14), zfq.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(long j) {
        this.d.setCurrentFunctions(j);
        if (this.r == null) {
            return;
        }
        int i = 0;
        while (true) {
            yfq yfqVar = b;
            if (i >= ((yls) yfqVar).c) {
                return;
            }
            if (((Long) yfqVar.get(i)).longValue() == j) {
                this.r.q(i, ((Long) yfqVar.get(i)).longValue());
                return;
            }
            i++;
        }
    }

    @Override // defpackage.ryb
    public final void b(ryv ryvVar) {
    }

    @Override // defpackage.ryb
    public final /* synthetic */ void v(String str, xxh xxhVar) {
    }
}
