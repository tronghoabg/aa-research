package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iol implements defpackage.ioj {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.IME");
    public rnb c;
    public rnh e;
    public android.view.inputmethod.EditorInfo f;
    public defpackage.inn g;
    public final defpackage.rnd h;
    private final android.content.Context i;
    private final android.content.Intent j;
    private boolean k;
    private defpackage.inn l;
    private final defpackage.sqf m;
    public final android.os.Handler b = new defpackage.stq(android.os.Looper.getMainLooper(), (byte[]) null);
    public int d = 0;
    private final android.content.ServiceConnection n = new defpackage.iok(this);

    public iol(android.content.Context context, android.content.ComponentName componentName, defpackage.sqf sqfVar, android.graphics.Point point) {
        this.i = context;
        this.m = sqfVar;
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.car.BIND_CAR_INPUT");
        this.j = intent;
        intent.setComponent(componentName);
        if (point != null) {
            intent.putExtra("touchpad_width", point.x);
            intent.putExtra("touchpad_height", point.y);
        }
        this.h = new defpackage.rnd(this);
    }

    @Override // defpackage.ioj
    public final void a(boolean z) {
        ((defpackage.yqj) a.l().ai((char) 814)).y("onVideoFocusChange hasFocus=%b", java.lang.Boolean.valueOf(z));
        if (!z) {
            g();
        }
        this.k = z;
    }

    @Override // defpackage.ioj
    public final void b() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 815)).u("Resetting input manager");
        g();
    }

    @Override // defpackage.ioj
    public final void c(rnh rnhVar, android.view.inputmethod.EditorInfo editorInfo, defpackage.inn innVar) {
        if (!this.k) {
            ((defpackage.yqj) a.l().ai((char) 817)).u("No video focus; ignoring startInput");
            return;
        }
        this.b.removeCallbacksAndMessages(null);
        int i = this.d;
        if (i == 2) {
            try {
                i(rnhVar, editorInfo, innVar);
                return;
            } catch (android.os.RemoteException e) {
                h("Failed to notify input service of start", e);
                return;
            }
        }
        if (i == 0 && !this.m.d(this.i, this.j, this.n, 65)) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 816)).u("Could not bind to input service");
            innVar.q();
            return;
        }
        defpackage.inn innVar2 = this.g;
        if (innVar2 != null && innVar2 != innVar) {
            innVar2.q();
        }
        this.e = rnhVar;
        this.f = editorInfo;
        this.g = innVar;
        this.d = 1;
    }

    @Override // defpackage.ioj
    public final void d(defpackage.inn innVar) {
        ((defpackage.yqj) a.l().ai((char) 818)).u("stopImeIfActiveClient");
        if (this.k) {
            if (this.l == innVar || this.g == innVar) {
                e(innVar);
            }
        }
    }

    @Override // defpackage.ioj
    public final void e(defpackage.inn innVar) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 820)).u("stopInput");
        if (this.l == innVar || this.g == innVar) {
            g();
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 821)).u("Client requested to stop input without starting input first.");
        }
    }

    public final void f() {
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public final void g() {
        int i = this.d;
        if (i == 0) {
            return;
        }
        if (i == 2) {
            this.l.q();
        }
        this.l = null;
        if (this.d == 1) {
            this.g.q();
        }
        f();
        rnb rnbVar = this.c;
        if (rnbVar != null) {
            try {
                rnbVar.e();
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 819)).u("Failed to notify input service of stop");
            }
        }
        this.c = null;
        this.m.b(this.i, this.n);
        this.d = 0;
    }

    public final void h(java.lang.String str, android.os.RemoteException remoteException) {
        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(remoteException)).ai((char) 822)).y("%s", str);
        this.c = null;
        g();
    }

    public final void i(rnh rnhVar, android.view.inputmethod.EditorInfo editorInfo, defpackage.inn innVar) throws android.os.RemoteException {
        ((defpackage.yqj) a.l().ai((char) 823)).u("updateClientConnection");
        defpackage.inn innVar2 = this.l;
        if (innVar2 != null && innVar2 != innVar) {
            innVar2.q();
        }
        this.l = innVar;
        this.c.g(rnhVar, editorInfo, innVar.z);
    }

    public final java.lang.String toString() {
        return "CarImeManagerImpl " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + "{mImeState=" + this.d + ", mInputService=" + this.c + ", mCurrentClient=" + this.l + ", mPendingClient=" + this.g + "}";
    }
}
