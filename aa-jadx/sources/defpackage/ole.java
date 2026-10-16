package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ole extends defpackage.okb {
    final /* synthetic */ defpackage.olf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ole(defpackage.olf olfVar) {
        super(olfVar);
        this.a = olfVar;
    }

    @Override // defpackage.okf
    public final defpackage.xyn a() {
        return defpackage.xxe.a;
    }

    @Override // defpackage.okf
    public final java.lang.String b() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.usb_signal_disabled_title);
    }

    @Override // defpackage.okf
    public final java.lang.String c() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.usb_signal_disabled_message);
    }

    @Override // defpackage.okf
    public final boolean e() {
        return false;
    }

    @Override // defpackage.okf
    public final int f() {
        return this.a.f();
    }

    @Override // defpackage.okf
    public final int q() {
        return 4;
    }
}
