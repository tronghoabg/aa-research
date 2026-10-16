package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class oks extends defpackage.okb {
    final /* synthetic */ defpackage.okt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oks(defpackage.okt oktVar) {
        super(oktVar);
        this.a = oktVar;
    }

    @Override // defpackage.okf
    public final defpackage.xyn a() {
        return defpackage.xyn.h(new defpackage.okr(this));
    }

    @Override // defpackage.okf
    public final java.lang.String b() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.connection_rejected_cars_title);
    }

    @Override // defpackage.okf
    public final java.lang.String c() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.connection_rejected_cars_message);
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
