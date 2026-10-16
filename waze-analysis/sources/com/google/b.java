package com.google;

import com.google.firebase.d.f;
import com.google.firebase.d.g;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    static final b f6989a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.d.e f6990b;

    static {
        com.google.firebase.d.d dVarA = com.google.firebase.d.e.a("messagingClientEvent");
        com.google.firebase.d.c.b bVar = new com.google.firebase.d.c.b();
        bVar.b(1);
        dVarA.b(bVar.a());
        f6990b = dVarA.a();
    }

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((g) obj2).d(f6990b, ((com.google.firebase.messaging.a.g) obj).a());
    }
}
