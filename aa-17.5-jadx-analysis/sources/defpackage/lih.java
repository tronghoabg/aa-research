package defpackage;

import com.google.android.apps.auto.components.lifetime.service.GhLifetimeService;

/* loaded from: classes.dex */
public final class lih extends lhk {
    final /* synthetic */ GhLifetimeService a;

    public lih(GhLifetimeService ghLifetimeService) {
        this.a = ghLifetimeService;
    }

    @Override // defpackage.lhk, defpackage.lhl
    public final void a() {
        wer.c();
        GhLifetimeService ghLifetimeService = this.a;
        Boolean bool = ghLifetimeService.c;
        bool.getClass();
        woy.aa(bool.booleanValue(), "Received onDelayedStart while not started");
        ghLifetimeService.d = true;
        Boolean bool2 = ghLifetimeService.c;
        bool2.getClass();
        ghLifetimeService.b(bool2.booleanValue());
    }

    @Override // defpackage.lhk, defpackage.lhl
    public final void b() {
        GhLifetimeService ghLifetimeService = this.a;
        ghLifetimeService.c = false;
        ghLifetimeService.b(ghLifetimeService.c.booleanValue());
    }

    @Override // defpackage.lhk, defpackage.lhl
    public final void c() {
        GhLifetimeService ghLifetimeService = this.a;
        ghLifetimeService.c = true;
        ghLifetimeService.b(ghLifetimeService.c.booleanValue());
    }
}
