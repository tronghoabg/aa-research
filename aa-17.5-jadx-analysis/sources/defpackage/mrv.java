package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.material.tabs.TabLayout;
import com.google.android.projection.gearhead.R;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes2.dex */
public final class mrv extends Fragment implements mpb {
    public static final yph a = yph.c("GH.ClusterSysUIFragment");
    public TabLayout b;
    public List c;
    public mru d;

    public mrv() {
        super(R.layout.cluster_activity_indicator_fragment);
    }

    @Override // defpackage.mpb
    public final void b(Intent intent, CarRegionId carRegionId) {
        noh nohVarB = nsh.c().b(this);
        if (nohVarB == null) {
            ((ype) ((ype) a.h()).ai((char) 5241)).u("onActivityChanged ignoring, parent detached");
            return;
        }
        if (Objects.equals(carRegionId, nsr.c().a(nohVarB.o()).r(nsn.a))) {
            int i = 0;
            while (true) {
                if (i >= this.c.size()) {
                    i = -1;
                    break;
                } else if (Objects.equals(intent.getComponent(), ((mrz) this.c.get(i)).a.getComponent())) {
                    break;
                } else {
                    i++;
                }
            }
            ((ype) a.l().ai((char) 5240)).w("New cluster activity, updating to index=%d", i);
            if (i != -1) {
                TabLayout tabLayout = this.b;
                mru mruVar = this.d;
                mruVar.getClass();
                tabLayout.j(mruVar);
                wwg wwgVarC = this.b.c(i);
                wwgVarC.getClass();
                wwgVarC.a();
                TabLayout tabLayout2 = this.b;
                mru mruVar2 = this.d;
                mruVar2.getClass();
                tabLayout2.e(mruVar2);
                ComponentName componentName = intent.getComponent() == null ? new ComponentName("", "") : intent.getComponent();
                ohs ohsVarJ = ebf.j();
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.CLUSTER_SLIVER, yzy.q);
                componentName.getClass();
                rrbVarH.d(componentName);
                ohsVarJ.F(rrbVarH.l());
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        mpd.b().g(this);
    }

    @Override // android.support.v4.app.Fragment
    public final void onStop() {
        super.onStop();
        mpd.b().j(this);
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ((ype) a.l().ai((char) 5242)).u("onViewCreated");
        this.b = (TabLayout) view.findViewById(R.id.dotdotdot);
        this.d = new mrs(this);
        jty.b();
        ((mrt) kfn.h(this, null, 6).a(mrt.class)).a.fE(getViewLifecycleOwner(), new mmt(this, 7));
        view.setOnGenericMotionListener(new omy(this, 1));
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void a(Intent intent, CarRegionId carRegionId) {
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void e(Intent intent, CarRegionId carRegionId) {
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void f(Intent intent, CarRegionId carRegionId) {
    }
}
