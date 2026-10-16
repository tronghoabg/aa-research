package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ee implements com.google.v.el {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f11293a;

    ee(int i2) {
        this.f11293a = i2;
    }

    @Override // com.google.v.el
    public final /* synthetic */ Object convert(int i2) {
        int i3 = this.f11293a;
        if (i3 == 0) {
            eg egVarA = eg.a(i2);
            return egVarA == null ? eg.FLAG_ANY : egVarA;
        }
        if (i3 == 1) {
            d dVarA = d.a(i2);
            return dVarA == null ? d.TRAVEL_MODE_MOTOR_VEHICLE : dVarA;
        }
        if (i3 == 2) {
            gj gjVarA = gj.a(i2);
            return gjVarA == null ? gj.TRAVEL_ANY : gjVarA;
        }
        if (i3 == 3) {
            com.google.k.a.a.i iVarA = com.google.k.a.a.i.a(i2);
            return iVarA == null ? com.google.k.a.a.i.UNKNOWN : iVarA;
        }
        if (i3 != 4) {
            jh jhVarA = jh.a(i2);
            return jhVarA == null ? jh.FLAG_NO_COLD_CALLS : jhVarA;
        }
        hc hcVarA = hc.a(i2);
        return hcVarA == null ? hc.UNKNOWN : hcVarA;
    }
}
