package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.car.display.CarRegionId;
import j$.util.Collection;

/* loaded from: classes.dex */
public final class jyz extends mot implements jwi {
    public jyz() {
        super(mkn.l, "ClusterAppHost");
    }

    @Override // defpackage.jwi
    public final Intent a(ComponentName componentName) {
        throw new IllegalStateException("ClusterIntentProcessor can't give display-less intents");
    }

    @Override // defpackage.mot
    protected final void c(Intent intent, qql qqlVar) {
        ComponentName component = intent.getComponent();
        component.getClass();
        g(intent);
        jsf.l(intent, mpl.b(component));
        CarRegionId carRegionId = qqlVar.e;
        carRegionId.getClass();
        if (nsr.c().a(carRegionId.h).q == rji.b) {
            intent.setComponent(mkn.l);
        } else {
            intent.setComponent(mkn.m);
        }
    }

    @Override // defpackage.mov
    protected final boolean d(Intent intent, qql qqlVar) {
        mqb mqbVarB;
        CarRegionId carRegionId = qqlVar.e;
        if (carRegionId == null || (mqbVarB = mqb.b(intent)) == null) {
            return false;
        }
        rji rjiVar = nsr.c().a(carRegionId.h).q;
        if (rjiVar == rji.b || rjiVar == rji.c) {
            return Collection.EL.stream(jzd.a().b(kio.b().e(), nyj.a())).map(new jxe(9)).anyMatch(new ghp(mqbVarB, 15));
        }
        return false;
    }
}
