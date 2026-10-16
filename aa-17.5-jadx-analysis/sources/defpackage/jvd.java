package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class jvd extends ggl {
    public static final yfq c = yfq.q("CAR_APP_NOTIFICATION_INTENT");
    public final int d;
    public final int e;

    /* JADX WARN: Illegal instructions before constructor call */
    public jvd(gdv gdvVar) {
        gmh gmhVar = (gmh) gdvVar;
        super(gmhVar.a);
        ComponentName componentName = gmhVar.a;
        aboh abohVar = aczc.h().b;
        int i = yl.a;
        this.d = ggp.a(componentName, abohVar, 1);
        int iB = (int) aczc.b();
        if (lnm.G()) {
            this.e = iB;
        } else {
            this.e = Math.min(iB, ggp.a(componentName, aczc.g().b, iB));
        }
    }

    @Override // defpackage.ggl
    public final int a() {
        return this.e;
    }

    @Override // defpackage.ggl
    public final int b() {
        return this.d;
    }
}
