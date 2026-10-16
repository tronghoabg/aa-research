package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes2.dex */
final class sqa implements sqf {
    final /* synthetic */ Activity a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ sqg d;

    public sqa(sqg sqgVar, Activity activity, Bundle bundle, Bundle bundle2) {
        this.a = activity;
        this.b = bundle;
        this.c = bundle2;
        this.d = sqgVar;
    }

    @Override // defpackage.sqf
    public final int a() {
        return 0;
    }

    @Override // defpackage.sqf
    public final void b() {
        this.d.a.onInflate(this.a, this.b, this.c);
    }
}
