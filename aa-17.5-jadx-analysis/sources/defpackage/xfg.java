package defpackage;

/* loaded from: classes.dex */
public final class xfg extends qkp {
    private final xfj c = new xfj();

    static {
        yph.c("GH.ProjectionHomeMgr");
    }

    @Override // defpackage.qkp, defpackage.lhg
    public final void c() {
        this.a = false;
        ((ype) xfj.a.l().ai((char) 10237)).u("start");
        int i = klt.a;
        boolean z = kmu.a(mki.a.c).getBoolean("SHOWN_NO_VIDEO_FOCUS_SCREEN_KEY", false);
        xfj xfjVar = this.c;
        xfjVar.c = z;
        xfjVar.e.m(mow.c);
        kio.b().v(xfjVar.f);
        this.b = true;
        e();
    }

    @Override // defpackage.qkp
    protected final qkq f() {
        return this.c;
    }
}
