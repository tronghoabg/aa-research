package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class okm extends defpackage.okb {
    final /* synthetic */ defpackage.okn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okm(defpackage.okn oknVar) {
        super(oknVar);
        this.a = oknVar;
    }

    @Override // defpackage.okf
    public final defpackage.xyn a() {
        return defpackage.xyn.h(new defpackage.okl(this));
    }

    @Override // defpackage.okf
    public final java.lang.String b() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.online_help_title);
    }

    @Override // defpackage.okf
    public final java.lang.String c() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.online_help_message);
    }

    @Override // defpackage.okf
    public final int f() {
        return 2;
    }

    @Override // defpackage.okf
    public final int q() {
        return 1;
    }
}
