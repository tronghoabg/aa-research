package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class olg extends defpackage.okb {
    final /* synthetic */ defpackage.olh a;
    private final android.content.Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olg(defpackage.olh olhVar, android.content.Context context) {
        super(olhVar);
        this.a = olhVar;
        this.b = context;
    }

    @Override // defpackage.okf
    public final defpackage.xyn a() {
        return defpackage.xxe.a;
    }

    @Override // defpackage.okf
    public final java.lang.String b() {
        return this.b.getString(com.google.android.projection.gearhead.R.string.vpn_detected_title);
    }

    @Override // defpackage.okf
    public final java.lang.String c() {
        return this.b.getString(com.google.android.projection.gearhead.R.string.vpn_detected_message);
    }

    @Override // defpackage.okf
    public final int f() {
        return this.a.f();
    }
}
