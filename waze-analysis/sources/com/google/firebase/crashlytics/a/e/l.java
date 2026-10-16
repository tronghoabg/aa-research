package com.google.firebase.crashlytics.a.e;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class l implements com.google.firebase.d.f {

    /* renamed from: a, reason: collision with root package name */
    static final l f9625a = new l();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f9626b = com.google.firebase.d.e.b("baseAddress");

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.d.e f9627c = com.google.firebase.d.e.b("size");

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.d.e f9628d = com.google.firebase.d.e.b(HintConstants.AUTOFILL_HINT_NAME);

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.d.e f9629e = com.google.firebase.d.e.b("uuid");

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        br brVar = (br) obj;
        com.google.firebase.d.g gVar = (com.google.firebase.d.g) obj2;
        gVar.c(f9626b, brVar.a());
        gVar.c(f9627c, brVar.b());
        gVar.d(f9628d, brVar.c());
        com.google.firebase.d.e eVar = f9629e;
        String strD = brVar.d();
        gVar.d(eVar, strD != null ? strD.getBytes(cu.f9545b) : null);
    }
}
