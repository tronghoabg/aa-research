package defpackage;

import android.content.ComponentName;
import android.os.Bundle;

/* loaded from: classes2.dex */
final class lsw implements vm {
    final /* synthetic */ lsy a;

    public lsw(lsy lsyVar) {
        this.a = lsyVar;
    }

    @Override // defpackage.vm
    public final void a(String str) {
        mpe mpeVarA = mpe.a();
        lsy lsyVar = this.a;
        ComponentName componentName = lsyVar.f;
        componentName.getClass();
        mpeVarA.i(lnm.b(componentName, str, new Bundle()));
        lsyVar.a.c();
    }

    @Override // defpackage.vm
    public final /* synthetic */ void b(String str) {
    }
}
