package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xgs extends defpackage.jri {
    @Override // defpackage.jri, defpackage.ovs, defpackage.qso, defpackage.qsk, defpackage.qrd
    public final void a(android.os.Bundle bundle) {
        super.a(bundle);
        v(com.google.android.projection.gearhead.R.layout.prototype_auxiliary_display_layout);
    }

    @Override // defpackage.ovs, defpackage.qso, defpackage.qsk, defpackage.qrd
    public final void h() {
        super.h();
        defpackage.rkf rkfVarC = defpackage.mpy.a().c(new com.google.android.gms.car.display.CarDisplayId(y()));
        android.widget.TextView textView = (android.widget.TextView) B(com.google.android.projection.gearhead.R.id.aux_content_type);
        int iOrdinal = rkfVarC.ordinal();
        if (iOrdinal == 1) {
            textView.setText("NAVIGATION AUXILIARY DISPLAY");
        } else {
            if (iOrdinal != 2) {
                throw new java.lang.IllegalStateException("ContentType not supported in auxiliary car display: ".concat(rkfVarC.toString()));
            }
            textView.setText("TURN CARD AUXILIARY DISPLAY");
        }
    }
}
