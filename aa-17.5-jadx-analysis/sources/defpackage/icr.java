package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class icr {
    public final hta a;
    public final List b;
    public final hss c;
    public boolean d;
    public icq e;
    public boolean f;
    public icq g;
    public Bitmap h;
    public icq i;
    public int j;
    public int k;
    public int l;
    private final Handler m;
    private final hxe n;
    private boolean o;
    private hsq p;

    public icr(hrt hrtVar, hta htaVar, int i, int i2, huq huqVar, Bitmap bitmap) {
        hxe hxeVar = hrtVar.a;
        hss hssVarC = hrt.c(hrtVar.a());
        hsq hsqVarN = hrt.c(hrtVar.a()).b().n(((iek) ((iek) iek.c(hwf.b).V()).X()).G(i, i2));
        this.b = new ArrayList();
        this.c = hssVarC;
        Handler handler = new Handler(Looper.getMainLooper(), new gly(this, 2));
        this.n = hxeVar;
        this.m = handler;
        this.p = hsqVarN;
        this.a = htaVar;
        e(huqVar, bitmap);
    }

    final int a() {
        return ((hte) this.a).f.c;
    }

    public final void b() {
        int i;
        if (!this.d || this.o) {
            return;
        }
        icq icqVar = this.i;
        if (icqVar != null) {
            this.i = null;
            c(icqVar);
            return;
        }
        this.o = true;
        hta htaVar = this.a;
        hte hteVar = (hte) htaVar;
        htc htcVar = hteVar.f;
        int i2 = htcVar.c;
        int i3 = 0;
        if (i2 > 0 && (i = hteVar.e) >= 0) {
            i3 = i < i2 ? ((htb) htcVar.e.get(i)).i : -1;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + i3;
        htaVar.b();
        this.g = new icq(this.m, hteVar.e, jUptimeMillis);
        this.p.n(iek.e(new ifj(Double.valueOf(Math.random())))).h(htaVar).q(this.g);
    }

    public final void c(icq icqVar) {
        this.o = false;
        if (this.f) {
            this.m.obtainMessage(2, icqVar).sendToTarget();
            return;
        }
        if (!this.d) {
            this.i = icqVar;
            return;
        }
        if (icqVar.b != null) {
            d();
            icq icqVar2 = this.e;
            this.e = icqVar;
            List list = this.b;
            for (int size = list.size() - 1; size >= 0; size--) {
                icm icmVar = (icm) list.get(size);
                Object callback = icmVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    icmVar.stop();
                    icmVar.invalidateSelf();
                } else {
                    icmVar.invalidateSelf();
                    icq icqVar3 = icmVar.a.a.e;
                    if ((icqVar3 != null ? icqVar3.a : -1) == r5.a() - 1) {
                        icmVar.c++;
                    }
                    if (icmVar.d != -1 && icmVar.c >= 0) {
                        icmVar.stop();
                    }
                }
            }
            if (icqVar2 != null) {
                this.m.obtainMessage(2, icqVar2).sendToTarget();
            }
        }
        b();
    }

    public final void d() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.n.d(bitmap);
            this.h = null;
        }
    }

    final void e(huq huqVar, Bitmap bitmap) {
        a.al(bitmap, "Argument must not be null");
        this.h = bitmap;
        this.p = this.p.n(new iek().P(huqVar, true));
        this.j = ify.a(bitmap);
        this.k = bitmap.getWidth();
        this.l = bitmap.getHeight();
    }

    public final void f() {
        this.d = false;
    }
}
