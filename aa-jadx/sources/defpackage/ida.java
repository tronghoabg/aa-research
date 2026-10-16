package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ida {
    public final defpackage.htk a;
    public final java.util.List b;
    public final defpackage.htb c;
    public boolean d;
    public defpackage.icz e;
    public boolean f;
    public defpackage.icz g;
    public android.graphics.Bitmap h;
    public defpackage.icz i;
    public int j;
    public int k;
    public int l;
    private final android.os.Handler m;
    private final defpackage.hxn n;
    private boolean o;
    private defpackage.hsz p;

    public ida(defpackage.hsc hscVar, defpackage.htk htkVar, int i, int i2, defpackage.hva hvaVar, android.graphics.Bitmap bitmap) {
        defpackage.hxn hxnVar = hscVar.a;
        defpackage.htb htbVarC = defpackage.hsc.c(hscVar.a());
        defpackage.hsz hszVarN = defpackage.hsc.c(hscVar.a()).b().n(((defpackage.ies) ((defpackage.ies) defpackage.ies.c(defpackage.hwp.b).V()).X()).G(i, i2));
        this.b = new java.util.ArrayList();
        this.c = htbVarC;
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper(), new defpackage.gmf(this, 2));
        this.n = hxnVar;
        this.m = handler;
        this.p = hszVarN;
        this.a = htkVar;
        e(hvaVar, bitmap);
    }

    final int a() {
        return ((defpackage.hto) this.a).f.c;
    }

    public final void b() {
        int i;
        if (!this.d || this.o) {
            return;
        }
        defpackage.icz iczVar = this.i;
        if (iczVar != null) {
            this.i = null;
            c(iczVar);
            return;
        }
        this.o = true;
        defpackage.htk htkVar = this.a;
        defpackage.hto htoVar = (defpackage.hto) htkVar;
        defpackage.htm htmVar = htoVar.f;
        int i2 = htmVar.c;
        int i3 = 0;
        if (i2 > 0 && (i = htoVar.e) >= 0) {
            i3 = i < i2 ? ((defpackage.htl) htmVar.e.get(i)).i : -1;
        }
        long jUptimeMillis = android.os.SystemClock.uptimeMillis() + ((long) i3);
        htkVar.b();
        this.g = new defpackage.icz(this.m, htoVar.e, jUptimeMillis);
        this.p.n(defpackage.ies.e(new defpackage.ifr(java.lang.Double.valueOf(java.lang.Math.random())))).h(htkVar).q(this.g);
    }

    public final void c(defpackage.icz iczVar) {
        this.o = false;
        if (this.f) {
            this.m.obtainMessage(2, iczVar).sendToTarget();
            return;
        }
        if (!this.d) {
            this.i = iczVar;
            return;
        }
        if (iczVar.b != null) {
            d();
            defpackage.icz iczVar2 = this.e;
            this.e = iczVar;
            java.util.List list = this.b;
            for (int size = list.size() - 1; size >= 0; size--) {
                defpackage.icv icvVar = (defpackage.icv) list.get(size);
                java.lang.Object callback = icvVar.getCallback();
                while (callback instanceof android.graphics.drawable.Drawable) {
                    callback = ((android.graphics.drawable.Drawable) callback).getCallback();
                }
                if (callback == null) {
                    icvVar.stop();
                    icvVar.invalidateSelf();
                } else {
                    icvVar.invalidateSelf();
                    defpackage.ida idaVar = icvVar.a.a;
                    defpackage.icz iczVar3 = idaVar.e;
                    if ((iczVar3 != null ? iczVar3.a : -1) == idaVar.a() - 1) {
                        icvVar.c++;
                    }
                    if (icvVar.d != -1 && icvVar.c >= 0) {
                        icvVar.stop();
                    }
                }
            }
            if (iczVar2 != null) {
                this.m.obtainMessage(2, iczVar2).sendToTarget();
            }
        }
        b();
    }

    public final void d() {
        android.graphics.Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.n.d(bitmap);
            this.h = null;
        }
    }

    final void e(defpackage.hva hvaVar, android.graphics.Bitmap bitmap) {
        defpackage.a.ak(bitmap, "Argument must not be null");
        this.h = bitmap;
        this.p = this.p.n(new defpackage.ies().P(hvaVar, true));
        this.j = defpackage.igg.a(bitmap);
        this.k = bitmap.getWidth();
        this.l = bitmap.getHeight();
    }

    public final void f() {
        this.d = false;
    }
}
