package com.google.firebase.crashlytics.a;

import com.google.firebase.crashlytics.a.e.cy;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    private static final j f9280a = new d();

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.g.b f9281b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f9282c = new AtomicReference(null);

    public e(com.google.firebase.g.b bVar) {
        this.f9281b = bVar;
        bVar.e(new b(this, 0));
    }

    public static /* synthetic */ void a(e eVar, com.google.firebase.g.c cVar) {
        i.f9765a.b("Crashlytics native component now available.");
        eVar.f9282c.set((a) cVar.a());
    }

    @Override // com.google.firebase.crashlytics.a.a
    public final j getSessionFileProvider(String str) {
        a aVar = (a) this.f9282c.get();
        return aVar == null ? f9280a : aVar.getSessionFileProvider(str);
    }

    @Override // com.google.firebase.crashlytics.a.a
    public final boolean hasCrashDataForCurrentSession() {
        a aVar = (a) this.f9282c.get();
        return aVar != null && aVar.hasCrashDataForCurrentSession();
    }

    @Override // com.google.firebase.crashlytics.a.a
    public final boolean hasCrashDataForSession(String str) {
        a aVar = (a) this.f9282c.get();
        return aVar != null && aVar.hasCrashDataForSession(str);
    }

    @Override // com.google.firebase.crashlytics.a.a
    public final void prepareNativeSession(final String str, final String str2, final long j2, final cy cyVar) {
        i.f9765a.g("Deferring native open session: ".concat(String.valueOf(str)));
        this.f9281b.e(new com.google.firebase.g.a() { // from class: com.google.firebase.crashlytics.a.c
            @Override // com.google.firebase.g.a
            public final void a(com.google.firebase.g.c cVar) {
                ((a) cVar.a()).prepareNativeSession(str, str2, j2, cyVar);
            }
        });
    }
}
