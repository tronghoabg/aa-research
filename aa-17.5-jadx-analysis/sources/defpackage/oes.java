package defpackage;

import android.content.Intent;
import com.google.android.apps.auto.components.telecom.call.CarCall;

/* loaded from: classes2.dex */
public final class oes extends mnz {
    final /* synthetic */ CarCall a;

    public oes(CarCall carCall) {
        this.a = carCall;
    }

    @Override // defpackage.mnz
    public final /* bridge */ /* synthetic */ void a(moa moaVar) {
        yph yphVar = oet.a;
        CarCall carCall = this.a;
        if (jri.a()) {
            ebf.A().m(carCall.a);
            return;
        }
        ((ype) oet.a.l().ai((char) 5686)).u("Answering phone calls and switch to dialer facet.");
        Intent intent = new Intent();
        if (odn.a().G(carCall)) {
            intent.setAction("com.google.android.gearhead.telecom.ANSWER_CALL");
        }
        mlq.f().c(3, intent);
    }
}
