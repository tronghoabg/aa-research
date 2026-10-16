package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* loaded from: classes.dex */
public final class moo extends mou {
    public moo() {
        super("CameraOverlay");
    }

    @Override // defpackage.mou
    protected final void a(Intent intent) {
        ype ypeVar = (ype) mou.b.f();
        String action = intent.getAction();
        ComponentName component = intent.getComponent();
        ypeVar.M("Blocking intent because camera overlay is active and non-dismissable: intent action: %s, intent component: %s", action, component != null ? component.toShortString() : null);
    }

    @Override // defpackage.mou
    protected final boolean b(Intent intent) {
        Integer num;
        return (mkn.e.equals(intent.getComponent()) || (num = (Integer) kkq.a.a().e()) == null || num.intValue() != 2) ? false : true;
    }
}
