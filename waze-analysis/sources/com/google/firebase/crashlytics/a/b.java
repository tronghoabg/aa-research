package com.google.firebase.crashlytics.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements com.google.firebase.g.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f9059a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f9060b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f9060b = i2;
        this.f9059a = obj;
    }

    @Override // com.google.firebase.g.a
    public final void a(com.google.firebase.g.c cVar) {
        int i2 = this.f9060b;
        if (i2 == 0) {
            e.a((e) this.f9059a, cVar);
        } else if (i2 == 1) {
            com.google.firebase.crashlytics.c.a((com.google.firebase.crashlytics.c) this.f9059a, cVar);
        } else {
            ((com.google.firebase.remoteconfig.a.a) cVar.a()).f((f) this.f9059a);
            i.f9765a.b("Registering RemoteConfig Rollouts subscriber");
        }
    }
}
