package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import j$.util.Collection;

/* loaded from: classes.dex */
public final class lyj extends jrw {
    private final lup a = lup.e();

    @Override // defpackage.jrw
    protected final mqb a(Intent intent) {
        return mpl.b(mkn.o);
    }

    @Override // defpackage.jrw
    protected final void b(Intent intent) {
        ComponentName component = intent.getComponent();
        component.getClass();
        String packageName = component.getPackageName();
        yph yphVar = jsf.a;
        intent.putExtra("TemplateCarActivity.SESSION_ID", packageName);
    }

    @Override // defpackage.mov
    protected final boolean d(Intent intent, qql qqlVar) {
        mqb mqbVarB = mqb.b(intent);
        if (mqbVarB == null) {
            return false;
        }
        return Collection.EL.stream(this.a.b(kio.b().e(), nyj.a())).map(new lyd(3)).anyMatch(new lou(mqbVarB, 9));
    }
}
