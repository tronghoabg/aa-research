package com.google.firebase.crashlytics.a.e;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final n f9636a = new n();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f9637b = com.google.firebase.d.e.b(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f9638c = com.google.firebase.d.e.b("reason");

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.d.e f9639d = com.google.firebase.d.e.b("frames");

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.d.e f9640e = com.google.firebase.d.e.b("causedBy");

    /* renamed from: f, reason: collision with root package name */
    private static final com.google.firebase.d.e f9641f = com.google.firebase.d.e.b("overflowCount");

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        bu buVar = (bu) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.d(f9637b, buVar.d());
        gVar.d(f9638c, buVar.c());
        gVar.d(f9639d, buVar.e());
        gVar.d(f9640e, buVar.b());
        gVar.b(f9641f, buVar.a());
    }
}
