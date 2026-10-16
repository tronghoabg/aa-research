package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class sqb implements sqf {
    final /* synthetic */ Bundle a;
    final /* synthetic */ sqg b;

    public sqb(sqg sqgVar, Bundle bundle) {
        this.a = bundle;
        this.b = sqgVar;
    }

    @Override // defpackage.sqf
    public final int a() {
        return 1;
    }

    @Override // defpackage.sqf
    public final void b() {
        this.b.a.onCreate(this.a);
    }
}
