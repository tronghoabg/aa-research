package defpackage;

/* loaded from: classes2.dex */
public final class kjm extends eqj {
    public final rij a;
    public final int h = 1;
    public final ajmd i = new ajmd(this);

    public kjm(rij rijVar) {
        this.a = rijVar;
    }

    @Override // defpackage.eqj
    protected final void c() {
        khc.t(new wci("GH.CarControlGroupLD", yzz.CAR_CONTROLS, yzy.Mg, "Car not connected when registering car control group listener.", new Object[0]), new kbg(this, 18));
    }

    @Override // defpackage.eqj
    protected final void d() {
        if (kio.b().q()) {
            khc.t(new wci("GH.CarControlGroupLD", yzz.CAR_CONTROLS, yzy.Mh, "Car not connected when unregistering car control group listener.", new Object[0]), new kbg(this, 17));
        }
    }
}
