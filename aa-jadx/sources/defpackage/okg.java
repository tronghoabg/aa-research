package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class okg extends defpackage.okb {
    final /* synthetic */ defpackage.okh a;
    private final android.content.Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okg(defpackage.okh okhVar, android.content.Context context) {
        super(okhVar);
        this.a = okhVar;
        this.b = context;
    }

    @Override // defpackage.okf
    public final defpackage.xyn a() {
        return defpackage.xxe.a;
    }

    @Override // defpackage.okf
    public final java.lang.String b() {
        return this.b.getString(com.google.android.projection.gearhead.R.string.no_5ghz_title);
    }

    @Override // defpackage.okf
    public final java.lang.String c() {
        return this.b.getString(com.google.android.projection.gearhead.R.string.no_5ghz_message);
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
