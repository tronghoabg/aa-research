package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import j$.util.Collection;

/* loaded from: classes.dex */
public final class jyy extends mot implements jwi {
    public jyy() {
        super(mkn.k, "NavigationAppHost");
    }

    @Override // defpackage.jwi
    public final Intent a(ComponentName componentName) {
        Intent component = new Intent().setComponent(componentName);
        c(component, new qql());
        return component;
    }

    @Override // defpackage.mot
    protected final void c(Intent intent, qql qqlVar) {
        ComponentName component = intent.getComponent();
        component.getClass();
        g(intent);
        jsf.l(intent, mpl.b(component));
        intent.setComponent(mkn.k);
    }

    @Override // defpackage.mov
    protected final boolean d(Intent intent, qql qqlVar) {
        mqb mqbVarB;
        CarRegionId carRegionId = qqlVar.e;
        if ((carRegionId == null || CarDisplayId.b(carRegionId.h)) && (mqbVarB = mqb.b(intent)) != null) {
            return Collection.EL.stream(jzb.a().b(kio.b().e(), nyj.a())).map(new jxe(8)).anyMatch(new ghp(mqbVarB, 14));
        }
        return false;
    }
}
