package defpackage;

import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;

/* loaded from: classes2.dex */
public final class seq {
    public static final ypf a = ols.R("CAR.SETUP.INSTALLER");
    public final String b;
    public final seo c;
    public final PackageManager d;
    public final PackageInstaller e;
    final sep f;
    public final eqm g;
    private final epf h;

    public seq(seo seoVar, PackageManager packageManager) {
        sen senVar = new sen(this);
        this.h = senVar;
        this.b = "com.google.android.projection.gearhead";
        this.c = seoVar;
        this.d = packageManager;
        this.e = packageManager.getPackageInstaller();
        this.f = new sep(this);
        this.g = new eqm(new ser(2, ""));
        ((eqa) seoVar).getLifecycle().c(senVar);
    }

    public final void a(int i) {
        a.l().ai(8844).K("post app status update pkg=%s, state=%d", this.b, i);
        eqm eqmVar = this.g;
        ser serVar = (ser) eqmVar.e();
        serVar.getClass();
        serVar.a = i;
        eqmVar.j(serVar);
    }
}
