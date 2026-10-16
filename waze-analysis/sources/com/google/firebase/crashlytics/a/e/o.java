package com.google.firebase.crashlytics.a.e;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class o implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final o f9642a = new o();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f9643b = com.google.firebase.d.e.b(HintConstants.AUTOFILL_HINT_NAME);

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f9644c = com.google.firebase.d.e.b("code");

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.d.e f9645d = com.google.firebase.d.e.b("address");

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        bw bwVar = (bw) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.d(f9643b, bwVar.c());
        gVar.d(f9644c, bwVar.b());
        gVar.c(f9645d, bwVar.a());
    }
}
