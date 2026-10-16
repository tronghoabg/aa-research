package com.google.firebase.crashlytics.a.e;

import androidx.car.app.CarContext;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class t implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final t f9668a = new t();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f9669b = com.google.firebase.d.e.b("timestamp");

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f9670c = com.google.firebase.d.e.b(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.d.e f9671d = com.google.firebase.d.e.b(CarContext.APP_SERVICE);

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.d.e f9672e = com.google.firebase.d.e.b("device");

    /* renamed from: f, reason: collision with root package name */
    private static final com.google.firebase.d.e f9673f = com.google.firebase.d.e.b("log");

    /* renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.d.e f9674g = com.google.firebase.d.e.b("rollouts");

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        co coVar = (co) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.c(f9669b, coVar.a());
        gVar.d(f9670c, coVar.g());
        gVar.d(f9671d, coVar.b());
        gVar.d(f9672e, coVar.d());
        gVar.d(f9673f, coVar.e());
        gVar.d(f9674g, coVar.f());
    }
}
