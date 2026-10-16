package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class okj extends defpackage.okb {
    public final android.content.Context a;
    final /* synthetic */ defpackage.okk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okj(defpackage.okk okkVar, android.content.Context context) {
        super(okkVar);
        this.b = okkVar;
        this.a = context;
    }

    @Override // defpackage.okf
    public final defpackage.xyn a() {
        return defpackage.xyn.h(new defpackage.oki(this));
    }

    @Override // defpackage.okf
    public final java.lang.String b() {
        return this.a.getString(com.google.android.projection.gearhead.R.string.no_hfp_title);
    }

    @Override // defpackage.okf
    public final java.lang.String c() {
        return this.a.getString(com.google.android.projection.gearhead.R.string.no_hfp_message);
    }

    @Override // defpackage.okf
    public final int f() {
        return this.b.f();
    }
}
