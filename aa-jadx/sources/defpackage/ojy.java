package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ojy extends defpackage.okb {
    final /* synthetic */ defpackage.ojz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojy(defpackage.ojz ojzVar) {
        super(ojzVar);
        this.a = ojzVar;
    }

    @Override // defpackage.okf
    public final defpackage.xyn a() {
        return defpackage.xyn.h(new defpackage.ojx(this));
    }

    @Override // defpackage.okf
    public final java.lang.String b() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.usb_flaky_cable_detector_cable_title);
    }

    @Override // defpackage.okf
    public final java.lang.String c() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.usb_flaky_cable_detector_message);
    }

    @Override // defpackage.okf
    public final int f() {
        return this.a.f();
    }
}
