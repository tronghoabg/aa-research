package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jgo implements defpackage.jgn {
    final /* synthetic */ defpackage.jgq a;
    private final defpackage.rrw b;
    private final defpackage.rrw c;
    private final defpackage.rrw d;
    private final defpackage.rrw e;
    private final defpackage.rrw f;
    private final defpackage.rrw g;
    private final defpackage.rrw h;

    public jgo(defpackage.jgq jgqVar, defpackage.zbd zbdVar, defpackage.zbd zbdVar2, defpackage.zbd zbdVar3, defpackage.zbd zbdVar4, defpackage.zbd zbdVar5, defpackage.zbd zbdVar6, defpackage.zbd zbdVar7) {
        this.a = jgqVar;
        defpackage.yzd yzdVar = defpackage.yzd.CAR_SERVICE;
        defpackage.zbe zbeVar = defpackage.zbe.PROJECTION_WINDOW_MANAGER;
        this.b = (defpackage.rrw) defpackage.rrw.h(yzdVar, zbeVar, zbdVar).l();
        this.c = (defpackage.rrw) defpackage.rrw.h(yzdVar, zbeVar, zbdVar2).l();
        this.d = (defpackage.rrw) defpackage.rrw.h(yzdVar, zbeVar, zbdVar3).l();
        this.e = (defpackage.rrw) defpackage.rrw.h(yzdVar, zbeVar, zbdVar4).l();
        this.f = (defpackage.rrw) defpackage.rrw.h(yzdVar, zbeVar, zbdVar5).l();
        this.g = (defpackage.rrw) defpackage.rrw.h(yzdVar, zbeVar, zbdVar6).l();
        this.h = (defpackage.rrw) defpackage.rrw.h(yzdVar, zbeVar, zbdVar7).l();
    }

    @Override // defpackage.jgn
    public final void a(j$.time.Duration duration) {
        long seconds = duration.toSeconds();
        if (seconds >= 21) {
            defpackage.jgq jgqVar = this.a;
            jgqVar.g.n(this.h, 1);
            return;
        }
        if (seconds >= 13) {
            defpackage.jgq jgqVar2 = this.a;
            jgqVar2.g.n(this.g, 1);
            return;
        }
        if (seconds >= 8) {
            defpackage.jgq jgqVar3 = this.a;
            jgqVar3.g.n(this.f, 1);
            return;
        }
        if (seconds >= 5) {
            defpackage.jgq jgqVar4 = this.a;
            jgqVar4.g.n(this.e, 1);
            return;
        }
        if (seconds >= 3) {
            defpackage.jgq jgqVar5 = this.a;
            jgqVar5.g.n(this.d, 1);
        } else if (seconds >= 2) {
            defpackage.jgq jgqVar6 = this.a;
            jgqVar6.g.n(this.c, 1);
        } else if (seconds >= 1) {
            defpackage.jgq jgqVar7 = this.a;
            jgqVar7.g.n(this.b, 1);
        }
    }
}
