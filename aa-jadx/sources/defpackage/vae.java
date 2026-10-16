package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vae {
    private static final defpackage.ypg a = defpackage.ypg.c("com/google/android/libraries/geo/systems/network/cronet/CronetEngineBuilderFactory");
    private final android.content.Context b;
    private final android.content.Context c;
    private final boolean d;
    private final defpackage.sr e;

    public vae(android.content.Context context, android.content.Context context2, defpackage.xyn xynVar, defpackage.xyn xynVar2) {
        this.b = context;
        this.c = context2;
        this.e = (defpackage.sr) ((defpackage.xys) xynVar).a;
        this.d = ((java.lang.Boolean) xynVar2.d(java.lang.Boolean.FALSE)).booleanValue();
    }

    private final org.chromium.net.ExperimentalCronetEngine.Builder b() {
        return (org.chromium.net.ExperimentalCronetEngine.Builder) new org.chromium.net.impl.JavaCronetProvider(this.c).createBuilder();
    }

    private final void c() {
    }

    public final org.chromium.net.ExperimentalCronetEngine.Builder a() {
        if (this.d) {
            return b();
        }
        for (org.chromium.net.CronetProvider cronetProvider : org.chromium.net.CronetProvider.getAllProviders(this.c)) {
            try {
                if (cronetProvider.isEnabled()) {
                    return (org.chromium.net.ExperimentalCronetEngine.Builder) cronetProvider.createBuilder();
                }
                continue;
            } catch (java.lang.LinkageError | java.lang.RuntimeException e) {
                java.lang.Throwable cause = e.getCause();
                defpackage.ypg ypgVar = a;
                ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) ypgVar.g()).p(e)).ai((char) 9756)).u("Exception trying to create ExperimentalCronetEngine.Builder");
                if (e instanceof java.lang.UnsatisfiedLinkError) {
                    c();
                } else if (e instanceof java.lang.VerifyError) {
                    c();
                } else if (e instanceof java.lang.LinkageError) {
                    c();
                } else if (cause instanceof defpackage.slg) {
                    ((defpackage.ype) ((defpackage.ype) ypgVar.f()).ai((char) 9758)).u("GMSCore Cronet not available on this device.");
                    c();
                } else if (cause instanceof defpackage.slh) {
                    ((defpackage.ype) ((defpackage.ype) ypgVar.f()).ai((char) 9757)).u("GMSCore CronetProvider not installed; Google Play Services update is required.");
                    defpackage.skr.a.i(this.b, ((defpackage.slh) cause).a);
                    c();
                } else {
                    c();
                }
            }
        }
        return b();
    }
}
