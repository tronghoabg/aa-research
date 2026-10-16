package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ojs extends defpackage.okb {
    final /* synthetic */ defpackage.ojt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojs(defpackage.ojt ojtVar) {
        super(ojtVar);
        this.a = ojtVar;
    }

    @Override // defpackage.okf
    public final defpackage.xyn a() {
        return defpackage.xyn.h(new defpackage.ojr(this));
    }

    @Override // defpackage.okf
    public final java.lang.String b() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.bluetooth_connect_permission_title);
    }

    @Override // defpackage.okf
    public final java.lang.String c() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.bluetooth_connect_permission_message);
    }

    @Override // defpackage.okf
    public final boolean d() {
        return !this.a.c();
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
