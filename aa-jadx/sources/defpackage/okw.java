package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class okw extends defpackage.okb {
    final /* synthetic */ defpackage.okx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okw(defpackage.okx okxVar) {
        super(okxVar);
        this.a = okxVar;
    }

    @Override // defpackage.okf
    public final defpackage.xyn a() {
        return defpackage.xxe.a;
    }

    @Override // defpackage.okf
    public final java.lang.String b() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.sideload_title);
    }

    @Override // defpackage.okf
    public final java.lang.String c() {
        return this.a.a.getString(com.google.android.projection.gearhead.R.string.sideload_message);
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
