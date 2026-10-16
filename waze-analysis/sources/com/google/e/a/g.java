package com.google.e.a;

import com.google.e.a.e.aq;
import com.google.e.a.h.bl;
import com.google.e.a.h.bm;
import com.google.e.a.h.bu;
import com.google.v.dm;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8536a;

    private g(Object obj) {
        this.f8536a = obj;
    }

    public static g c(n nVar) {
        return new g(nVar.h().toBuilder());
    }

    public static g d(com.google.d.m.a.a.b bVar) {
        return new g(bVar);
    }

    final bm a() {
        try {
            Object obj = this.f8536a;
            com.google.android.libraries.e.a.f fVarF = obj instanceof com.google.e.a.e.j ? ((com.google.e.a.e.j) obj).f() : com.google.e.a.e.v.a().k((com.google.d.m.a.a.b) obj);
            bl blVarNewBuilder = bm.newBuilder();
            blVarNewBuilder.b(fVarF.g());
            blVarNewBuilder.c(fVarF.f());
            blVarNewBuilder.a(com.google.e.a.b.a.a.e(fVarF.e()));
            return blVarNewBuilder.build();
        } catch (GeneralSecurityException e2) {
            throw new aq("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(String.valueOf(String.valueOf(this.f8536a))), e2);
        }
    }

    public final synchronized n b() {
        return n.f((bu) ((dm) this.f8536a).build(), x.a());
    }

    public final com.google.d.m.a.a.b e() {
        Object obj = this.f8536a;
        return obj != null ? (com.google.d.m.a.a.b) obj : e.e(a().toByteArray());
    }
}
