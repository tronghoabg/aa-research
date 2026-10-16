package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xgg extends defpackage.qlk {
    private final defpackage.xgj c = new defpackage.xgj();

    static {
        defpackage.yqm.c("GH.ProjectionHomeMgr");
    }

    @Override // defpackage.qlk, defpackage.lhn
    public final void eQ() {
        this.a = false;
        ((defpackage.yqj) defpackage.xgj.a.l().ai((char) 10265)).u("start");
        int i = defpackage.kma.a;
        boolean z = defpackage.knb.a(defpackage.mkp.a.c).getBoolean("SHOWN_NO_VIDEO_FOCUS_SCREEN_KEY", false);
        defpackage.xgj xgjVar = this.c;
        xgjVar.c = z;
        xgjVar.e.m(defpackage.mpc.c);
        defpackage.kit.b().v(xgjVar.f);
        this.b = true;
        e();
    }

    @Override // defpackage.qlk
    protected final qll f() {
        return this.c;
    }
}
