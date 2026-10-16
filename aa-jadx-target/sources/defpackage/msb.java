package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class msb implements defpackage.lhn {
    public static final /* synthetic */ int b = 0;
    private static final defpackage.yqm c = defpackage.yqm.c("GH.ClusterShUiCont");
    public defpackage.ndd a;

    public final void a() {
        ((defpackage.yqj) c.l().ai((char) 5247)).u("Starting Cluster Shell UI.");
        defpackage.ndd nddVar = this.a;
        nddVar.getClass();
        msc mscVar = (msc) nddVar.b;
        defpackage.ysr.bk(mscVar.c == null, "Sliver is already showing");
        defpackage.nta ntaVar = defpackage.nta.l;
        defpackage.ntb ntbVar = mscVar.b;
        if (!ntbVar.G(ntaVar)) {
            ((defpackage.yqj) msc.a.l().ai((char) 5250)).u("Not starting sliver because it is not declared in the DisplayLayout");
            return;
        }
        msa msaVar = new msa();
        defpackage.qts qtsVarN = ntbVar.n(ntaVar);
        qtsVarN.getClass();
        qtsVarN.l = true;
        defpackage.lem.a();
        qtsVarN.n = 2132149918;
        mscVar.c = (defpackage.noz) defpackage.kgu.c(new defpackage.mmj(qtsVarN.a(), msaVar, 2), "GH.SliverController", defpackage.zbe.CLUSTER_SLIVER, defpackage.zbd.o, true, "Unable to show cluster sliver", new java.lang.Object[0]);
    }

    public final void b() {
        ((defpackage.yqj) c.l().ai((char) 5248)).u("Stopping Cluster Shell UI.");
        defpackage.ndd nddVar = this.a;
        nddVar.getClass();
        msc mscVar = (msc) nddVar.b;
        defpackage.noz nozVar = mscVar.c;
        if (nozVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) msc.a.f()).ai((char) 5249)).u("Redundant call to hide(). Not currently showing");
        } else {
            nozVar.d();
            mscVar.c = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, nst] */
    @Override // defpackage.lhn
    public final void d() {
        defpackage.ndd nddVar = this.a;
        if (nddVar == null) {
            return;
        }
        ((defpackage.ntb) nddVar.a).A(nddVar.c);
        b();
        this.a = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, nst] */
    @Override // defpackage.lhn
    public final void eQ() {
        defpackage.ysr.bk(this.a == null, "Already started");
        if (defpackage.acvb.j()) {
            defpackage.ntb ntbVar = (defpackage.ntb) j$.util.Collection.-EL.stream(defpackage.nte.c().e()).filter(new mrx(2)).findFirst().orElse((java.lang.Object) null);
            if (ntbVar == 0) {
                ((defpackage.yqj) c.l().ai((char) 5246)).u("Not showing Cluster Shell UI because no cluster display detected.");
                return;
            }
            defpackage.ndd nddVar = new defpackage.ndd(ntbVar, new msc(ntbVar), new nsd(this, 1));
            this.a = nddVar;
            ntbVar.w(nddVar.c);
            a();
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.CLUSTER_SLIVER, defpackage.zbd.p).l());
        }
    }
}
