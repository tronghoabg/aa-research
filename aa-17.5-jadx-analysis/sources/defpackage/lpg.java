package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class lpg extends llu {
    final /* synthetic */ lph a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpg(lph lphVar) {
        super((int[]) null);
        this.a = lphVar;
    }

    @Override // defpackage.llu
    public final void t(Bundle bundle) {
        yph yphVar = lpq.a;
        lph lphVar = this.a;
        lphVar.a.R();
        lphVar.m(bundle);
    }

    @Override // defpackage.llu
    public final void w() {
        yph yphVar = lpq.a;
        lph lphVar = this.a;
        lphVar.a.R();
        lphVar.m(Bundle.EMPTY);
    }
}
