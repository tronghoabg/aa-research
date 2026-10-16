package defpackage;

import com.google.android.projection.gearhead.R;
import j$.util.Collection;

/* loaded from: classes.dex */
public final class mrx implements lhg {
    public static final /* synthetic */ int b = 0;
    private static final yph c = yph.c("GH.ClusterShUiCont");
    public ncp a;

    public final void a() {
        ((ype) c.l().ai((char) 5245)).u("Starting Cluster Shell UI.");
        ncp ncpVar = this.a;
        ncpVar.getClass();
        mry mryVar = (mry) ncpVar.b;
        woy.aa(mryVar.c == null, "Sliver is already showing");
        nsn nsnVar = nsn.l;
        nso nsoVar = mryVar.b;
        if (!nsoVar.G(nsnVar)) {
            ((ype) mry.a.l().ai((char) 5248)).u("Not starting sliver because it is not declared in the DisplayLayout");
            return;
        }
        mrv mrvVar = new mrv();
        qsw qswVarN = nsoVar.n(nsnVar);
        qswVarN.getClass();
        qswVarN.l = true;
        leh.a();
        qswVarN.n = R.style.Theme_Gearhead_Coolwalk_Cluster;
        mryVar.c = (noh) kgq.c(new mmd(qswVarN.a(), mrvVar, 2), "GH.SliverController", yzz.CLUSTER_SLIVER, yzy.o, true, "Unable to show cluster sliver", new Object[0]);
    }

    public final void b() {
        ((ype) c.l().ai((char) 5246)).u("Stopping Cluster Shell UI.");
        ncp ncpVar = this.a;
        ncpVar.getClass();
        mry mryVar = (mry) ncpVar.b;
        noh nohVar = mryVar.c;
        if (nohVar == null) {
            ((ype) ((ype) mry.a.f()).ai((char) 5247)).u("Redundant call to hide(). Not currently showing");
        } else {
            nohVar.d();
            mryVar.c = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, nsg] */
    @Override // defpackage.lhg
    public final void c() {
        woy.aa(this.a == null, "Already started");
        if (actz.j()) {
            nso nsoVar = (nso) Collection.EL.stream(nsr.c().e()).filter(new mrw(0)).findFirst().orElse(null);
            if (nsoVar == 0) {
                ((ype) c.l().ai((char) 5244)).u("Not showing Cluster Shell UI because no cluster display detected.");
                return;
            }
            ncp ncpVar = new ncp(nsoVar, new mry(nsoVar), new nrp(this, 1));
            this.a = ncpVar;
            nsoVar.w(ncpVar.c);
            a();
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.CLUSTER_SLIVER, yzy.p).l());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, nsg] */
    @Override // defpackage.lhg
    public final void d() {
        ncp ncpVar = this.a;
        if (ncpVar == null) {
            return;
        }
        ((nso) ncpVar.a).A(ncpVar.c);
        b();
        this.a = null;
    }
}
