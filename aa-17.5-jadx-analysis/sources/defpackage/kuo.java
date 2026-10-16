package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class kuo extends jrh {
    public static final yph a = yph.c("Gh.ComposeCatalog");

    @Override // defpackage.jrh, defpackage.ouv, defpackage.qru, defpackage.qrq, defpackage.qqh
    public final void a(Bundle bundle) {
        super.a(bundle);
        C().getDecorView().setSystemUiVisibility(C().getDecorView().getSystemUiVisibility() | 1280);
        C().addFlags(67108864);
        C().addFlags(134217728);
        C().setStatusBarColor(cjn.h(cjn.i(0)));
        juq.b(this, kum.e);
    }
}
