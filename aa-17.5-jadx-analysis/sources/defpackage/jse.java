package defpackage;

import com.google.android.apps.auto.components.telecom.call.CarCall;

/* loaded from: classes2.dex */
final class jse extends ebf {
    final /* synthetic */ jsf a;

    public jse(jsf jsfVar) {
        this.a = jsfVar;
    }

    @Override // defpackage.ebf
    public final void n(CarCall carCall) {
        ((ype) ((ype) jsf.a.f()).ai((char) 2727)).u("onCallAdded");
        this.a.o();
    }

    @Override // defpackage.ebf
    public final void p(CarCall carCall) {
        ((ype) ((ype) jsf.a.f()).ai((char) 2728)).u("onCallRemoved");
        this.a.o();
    }

    @Override // defpackage.ebf
    public final void y(CarCall carCall, int i) {
        ((ype) ((ype) jsf.a.f()).ai((char) 2729)).u("onStateChanged");
        this.a.o();
    }
}
