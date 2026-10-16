package defpackage;

import android.os.PowerManager$OnThermalStatusChangedListener;

/* loaded from: classes.dex */
public final /* synthetic */ class obp implements PowerManager$OnThermalStatusChangedListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ obp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final void onThermalStatusChanged(int i) {
        if (this.b != 0) {
            ixs ixsVar = (ixs) this.a;
            ixsVar.t = i;
            ((ype) ixs.a.l().ai((char) 1528)).w("Thermal status changed to %d", i);
            ixsVar.d();
            return;
        }
        Integer numValueOf = Integer.valueOf(i);
        eqj eqjVar = (eqj) this.a;
        eqjVar.m(numValueOf);
        ((ype) obq.a.f()).D("Severe thermal status changed. Thermal status: %d, isSevere+: %s", i, eqjVar.e());
    }
}
