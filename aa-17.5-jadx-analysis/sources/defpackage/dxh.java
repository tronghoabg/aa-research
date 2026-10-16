package defpackage;

import android.telecom.Call;

/* loaded from: classes2.dex */
public final class dxh extends Call.Callback {
    final /* synthetic */ aitf a;
    final /* synthetic */ aabf b;

    public dxh(aabf aabfVar, aitf aitfVar) {
        this.b = aabfVar;
        this.a = aitfVar;
    }

    @Override // android.telecom.Call.Callback
    public final void onCallDestroyed(Call call) {
        if (call == null || !affa.f(((rz) this.b.a).a, call)) {
            return;
        }
        aitf aitfVar = this.a;
        if (aitfVar.i()) {
            return;
        }
        aitfVar.w(afak.a);
    }
}
