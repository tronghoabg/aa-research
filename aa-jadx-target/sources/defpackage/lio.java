package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lio extends defpackage.lhr {
    final /* synthetic */ com.google.android.apps.auto.components.lifetime.service.GhLifetimeService a;

    public lio(com.google.android.apps.auto.components.lifetime.service.GhLifetimeService ghLifetimeService) {
        this.a = ghLifetimeService;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhr, defpackage.lhs
    public final void a() throws wfo {
        defpackage.wfp.c();
        com.google.android.apps.auto.components.lifetime.service.GhLifetimeService ghLifetimeService = this.a;
        java.lang.Boolean bool = ghLifetimeService.c;
        bool.getClass();
        defpackage.ysr.bk(bool.booleanValue(), "Received onDelayedStart while not started");
        ghLifetimeService.d = true;
        java.lang.Boolean bool2 = ghLifetimeService.c;
        bool2.getClass();
        ghLifetimeService.b(bool2.booleanValue());
    }

    @Override // defpackage.lhr, defpackage.lhs
    public final void b() {
        com.google.android.apps.auto.components.lifetime.service.GhLifetimeService ghLifetimeService = this.a;
        ghLifetimeService.c = java.lang.Boolean.FALSE;
        ghLifetimeService.b(ghLifetimeService.c.booleanValue());
    }

    @Override // defpackage.lhr, defpackage.lhs
    public final void c() {
        com.google.android.apps.auto.components.lifetime.service.GhLifetimeService ghLifetimeService = this.a;
        ghLifetimeService.c = java.lang.Boolean.TRUE;
        ghLifetimeService.b(ghLifetimeService.c.booleanValue());
    }
}
