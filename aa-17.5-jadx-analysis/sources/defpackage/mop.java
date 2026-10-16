package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* loaded from: classes.dex */
public final class mop extends mov {
    private static final yph a = yph.c("GH.CameraOverlayIP");

    public mop() {
        super("CameraOverlay");
    }

    @Override // defpackage.mov
    protected final boolean d(Intent intent, qql qqlVar) {
        intent.getClass();
        Integer num = (Integer) kkq.a.a().e();
        return num != null && num.intValue() == 1 && kkk.b();
    }

    @Override // defpackage.mov
    protected final void i(Intent intent, qql qqlVar) {
        intent.getClass();
        ype ypeVar = (ype) a.f();
        String action = intent.getAction();
        ComponentName component = intent.getComponent();
        ypeVar.M("Dismissing camera overlay because intent was sent: intent action: %s, intent component: %s", action, component != null ? component.toShortString() : null);
        kkk.a();
    }
}
