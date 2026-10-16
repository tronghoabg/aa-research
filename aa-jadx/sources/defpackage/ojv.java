package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ojv extends defpackage.okb {
    public final android.content.Context a;
    final /* synthetic */ defpackage.ojw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojv(defpackage.ojw ojwVar, android.content.Context context) {
        super(ojwVar);
        this.b = ojwVar;
        this.a = context;
    }

    @Override // defpackage.okf
    public final defpackage.xyn a() {
        return defpackage.xyn.h(new defpackage.oju(this));
    }

    @Override // defpackage.okf
    public final java.lang.String b() {
        return this.a.getString(com.google.android.projection.gearhead.R.string.charge_only_title);
    }

    @Override // defpackage.okf
    public final java.lang.String c() {
        return this.a.getString(com.google.android.projection.gearhead.R.string.charge_only_message);
    }

    @Override // defpackage.okf
    public final boolean e() {
        return false;
    }

    @Override // defpackage.okf
    public final int f() {
        return this.b.f();
    }
}
