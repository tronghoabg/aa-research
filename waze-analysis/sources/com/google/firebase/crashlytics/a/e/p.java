package com.google.firebase.crashlytics.a.e;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class p implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final p f9646a = new p();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f9647b = com.google.firebase.d.e.b(HintConstants.AUTOFILL_HINT_NAME);

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f9648c = com.google.firebase.d.e.b("importance");

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.d.e f9649d = com.google.firebase.d.e.b("frames");

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ca caVar = (ca) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.d(f9647b, caVar.b());
        gVar.b(f9648c, caVar.a());
        gVar.d(f9649d, caVar.c());
    }
}
