package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class olc extends defpackage.okb {
    final /* synthetic */ defpackage.old a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olc(defpackage.old oldVar) {
        super(oldVar);
        this.a = oldVar;
    }

    @Override // defpackage.okf
    public final defpackage.xyn a() {
        return defpackage.xyn.h(new defpackage.olb(this));
    }

    @Override // defpackage.okf
    public final java.lang.String b() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.usb_debugging_title);
    }

    @Override // defpackage.okf
    public final java.lang.String c() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.usb_debugging_message);
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
