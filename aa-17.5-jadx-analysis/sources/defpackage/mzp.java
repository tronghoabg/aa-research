package defpackage;

import android.support.v4.app.Fragment;

/* loaded from: classes2.dex */
public final class mzp implements afdr {
    final /* synthetic */ afdr a;
    final /* synthetic */ esc b;
    final /* synthetic */ Fragment c;
    private final /* synthetic */ int d;

    public mzp(afdr afdrVar, esc escVar, Fragment fragment, int i) {
        this.d = i;
        this.a = afdrVar;
        this.b = escVar;
        this.c = fragment;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [erq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [erq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [erq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [erq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [erq, java.lang.Object] */
    @Override // defpackage.afdr
    public final /* synthetic */ Object invoke() {
        int i = this.d;
        if (i == 0) {
            jty.b();
            return kfn.g(this.c, this.a.invoke(), this.b).a(mzo.class);
        }
        if (i == 1) {
            jty.b();
            return kfn.g(this.c, this.a.invoke(), this.b).a(mzm.class);
        }
        if (i == 2) {
            jty.b();
            return kfn.g(this.c, this.a.invoke(), this.b).a(mzt.class);
        }
        if (i != 3) {
            jty.b();
            return kfn.g(this.c, this.a.invoke(), this.b).a(nnu.class);
        }
        jty.b();
        return kfn.g(this.c, this.a.invoke(), this.b).a(nms.class);
    }
}
