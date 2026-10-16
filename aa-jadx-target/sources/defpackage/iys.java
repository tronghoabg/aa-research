package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iys implements defpackage.izy {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.GAL");
    public defpackage.jaa b;
    public final android.content.Context c;
    public final boolean e;
    public boolean g;
    public final defpackage.jal h;
    private android.os.Handler i;
    private java.lang.Runnable j;
    public volatile boolean d = false;
    public final java.lang.Object f = new java.lang.Object();

    public iys(android.content.Context context, defpackage.jal jalVar, boolean z) {
        this.c = context;
        this.h = jalVar;
        this.e = z;
    }

    public final void a() {
        java.lang.Runnable runnable;
        synchronized (this.f) {
            android.os.Handler handler = this.i;
            if (handler != null && (runnable = this.j) != null) {
                handler.removeCallbacks(runnable);
            }
        }
    }

    public final void b(boolean z, xiw xiwVar) {
        synchronized (this.f) {
            if (this.g) {
                a.f().ai(1641).u("Ignoring byebye on released handler");
                return;
            }
            this.i = new defpackage.stq(android.os.Looper.getMainLooper(), (byte[]) null);
            defpackage.iqv iqvVar = new defpackage.iqv(this, 15, null);
            this.j = iqvVar;
            this.i.postDelayed(iqvVar, 200L);
            this.d = true;
            defpackage.jaa jaaVar = this.b;
            if (jaaVar != null) {
                jaaVar.c(xiwVar);
                if (defpackage.acsd.y()) {
                    defpackage.jal jalVar = this.h;
                    if (z) {
                        if (defpackage.acsd.y()) {
                            ((defpackage.joq) jalVar).e.post(new jlb(jalVar, xiwVar, 8, (char[]) null));
                            return;
                        } else {
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.joq.a.g()).ai((char) 2485)).u("onPctsByeByeMessageSent invoked, flag is disabled.");
                            return;
                        }
                    }
                    if (defpackage.acsd.y()) {
                        ((defpackage.joq) jalVar).e.post(new jlb(jalVar, xiwVar, 7, (char[]) null));
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.joq.a.g()).ai((char) 2484)).u("onByeByeMessageSent invoked, flag is disabled.");
                    }
                }
            }
        }
    }
}
