package com.google.firebase.perf;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e implements com.google.firebase.perf.a.a {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10372a = com.google.firebase.perf.c.a.a();

    @Override // com.google.firebase.perf.a.a
    public final void a() {
        try {
            d.a();
        } catch (IllegalStateException e2) {
            f10372a.j("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e2);
        }
    }
}
