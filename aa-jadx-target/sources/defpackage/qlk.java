package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class qlk extends defpackage.mpd {
    private static final defpackage.yqm c = defpackage.yqm.c("GH.PassengerMode");
    public boolean a;
    public boolean b;

    @Override // defpackage.mpd
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.eqp a() {
        return ((defpackage.xgj) f()).e;
    }

    @Override // defpackage.lhn
    public final void d() {
        if (this.b) {
            this.b = false;
            defpackage.xgj xgjVar = (defpackage.xgj) f();
            defpackage.kit.b().w(xgjVar.f);
            if (xgjVar.c) {
                xgjVar.a();
            }
            defpackage.sax saxVar = xgjVar.d;
            if (saxVar != null) {
                saxVar.h(xgjVar.b);
            }
            xgjVar.e.m(defpackage.mpc.c);
            this.a = false;
        }
    }

    @Override // defpackage.mpd
    public final void e() {
        defpackage.wfp.c();
        if (this.a || !this.b) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) c.f()).ai((char) 7522)).u("enablePassengerMode()");
        this.a = true;
    }

    @Override // defpackage.lhn
    public void eQ() {
        throw null;
    }

    protected abstract qll f();
}
