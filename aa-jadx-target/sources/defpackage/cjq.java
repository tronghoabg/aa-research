package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cjq {
    private static boolean d = true;
    public boolean a;
    public defpackage.cok c;
    private final android.view.ViewGroup e;
    private defpackage.cna g;
    private final java.lang.Object f = new java.lang.Object();
    public final android.content.ComponentCallbacks2 b = new defpackage.cjo(this);

    public cjq(android.view.ViewGroup viewGroup) {
        this.e = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            c(viewGroup.getContext());
        }
        viewGroup.addOnAttachStateChangeListener(new defpackage.cjp(this, 0));
    }

    private final defpackage.cna e(android.view.ViewGroup viewGroup) {
        defpackage.cna cnaVar = this.g;
        if (cnaVar != null) {
            return cnaVar;
        }
        defpackage.cnb cnbVar = new defpackage.cnb(viewGroup.getContext());
        ((defpackage.czz) viewGroup).addView(cnbVar, -1);
        this.g = cnbVar;
        return cnbVar;
    }

    public final defpackage.cmq a() {
        defpackage.cmx cmxVar;
        defpackage.cmt cmuVar;
        defpackage.cmq cmqVar;
        synchronized (this.f) {
            android.view.ViewGroup viewGroup = this.e;
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                alh$.ExternalSyntheticApiModelOutline0.m(viewGroup);
            }
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                cmuVar = new defpackage.cmv(new defpackage.khb((short[]) null), new defpackage.cmj());
            } else {
                if (d) {
                    try {
                        cmuVar = new defpackage.cmu(viewGroup, new defpackage.khb((short[]) null), new defpackage.cmj());
                    } catch (java.lang.Throwable unused) {
                        d = false;
                        cmxVar = new defpackage.cmx(e(this.e));
                        cmuVar = cmxVar;
                    }
                } else {
                    cmxVar = new defpackage.cmx(e(this.e));
                }
                cmuVar = cmxVar;
            }
            cmqVar = new defpackage.cmq(cmuVar);
        }
        return cmqVar;
    }

    public final void b() {
        defpackage.cok cokVar = this.c;
        if (cokVar != null) {
            synchronized (cokVar) {
                java.lang.Object obj = cokVar.a;
                if (obj != null) {
                    ((defpackage.aau) obj).k();
                }
                cokVar.b = null;
            }
        }
        this.c = null;
    }

    public final void c(android.content.Context context) {
        if (this.a) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(this.b);
        this.a = true;
    }

    public final void d(defpackage.cmq cmqVar) {
        synchronized (this.f) {
            if (!cmqVar.l) {
                cmqVar.l = true;
                cmqVar.e();
            }
        }
    }
}
