package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class mdb extends mov {
    public mdb() {
        super("ParkedNativeApp");
    }

    @Override // defpackage.mov
    public final boolean d(Intent intent, qql qqlVar) {
        mqc mqcVarA;
        intent.getClass();
        mqb mqbVarD = mpl.d(intent);
        if (mqbVarD == null || (mqcVarA = lem.a().a(kio.b().e(), mqbVarD)) == null) {
            return false;
        }
        return mqcVarA.e;
    }

    @Override // defpackage.mov
    protected final void i(Intent intent, qql qqlVar) {
        intent.getClass();
        ComponentName component = intent.getComponent();
        if (component == null || kmo.e(acpf.e(), component.getPackageName())) {
            return;
        }
        intent.addCategory("android.intent.category.CAR_LAUNCHER");
    }
}
