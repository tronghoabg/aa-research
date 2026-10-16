package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class okp extends defpackage.okb {
    final /* synthetic */ defpackage.okq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okp(defpackage.okq okqVar) {
        super(okqVar);
        this.a = okqVar;
    }

    @Override // defpackage.okf
    public final defpackage.xyn a() {
        return defpackage.xyn.h(new defpackage.oko(this));
    }

    @Override // defpackage.okf
    public final java.lang.String b() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.usb_only_connect_to_known_cars_title);
    }

    @Override // defpackage.okf
    public final java.lang.String c() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.usb_only_connect_to_known_cars_message);
    }

    @Override // defpackage.okf
    public final boolean e() {
        return false;
    }

    @Override // defpackage.okf
    public final int f() {
        return this.a.f();
    }
}
