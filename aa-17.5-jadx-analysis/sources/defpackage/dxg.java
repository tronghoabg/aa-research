package defpackage;

import android.os.Bundle;
import android.telecom.Call;

/* loaded from: classes2.dex */
public final class dxg extends Call.Callback {
    final /* synthetic */ aitf a;
    final /* synthetic */ aabf b;

    public dxg(aitf aitfVar, aabf aabfVar) {
        this.a = aitfVar;
        this.b = aabfVar;
    }

    @Override // android.telecom.Call.Callback
    public final void onConnectionEvent(Call call, String str, Bundle bundle) {
        if (str != null && affa.f(str, "androidx.core.telecom.EVENT_CALL_READY")) {
            aitf aitfVar = this.a;
            if (aitfVar.h()) {
                ((rz) this.b.a).l(this);
                aitfVar.w(afak.a);
            }
        }
    }
}
