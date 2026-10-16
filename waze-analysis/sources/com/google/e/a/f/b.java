package com.google.e.a.f;

import com.google.e.a.e.af;
import com.google.e.a.e.t;
import com.google.e.a.h.bi;
import com.google.e.a.j.ae;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.e.a.e.b f8484a = new com.google.e.a.a.l(9);

    /* renamed from: b, reason: collision with root package name */
    private static final af f8485b = af.a(new com.google.e.a.a.e(12), a.class, e.class);

    /* renamed from: c, reason: collision with root package name */
    private static final af f8486c = af.a(new com.google.e.a.a.e(13), a.class, com.google.e.a.q.class);

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.g f8487d;

    static {
        bi biVar = bi.SYMMETRIC;
        com.google.e.a.h.b.parser();
        f8487d = com.google.e.a.e.g.b("type.googleapis.com/google.crypto.tink.AesCmacKey", com.google.e.a.q.class, biVar);
    }

    public static /* synthetic */ com.google.e.a.q a(a aVar) throws GeneralSecurityException {
        e(aVar.f());
        return ae.b(aVar);
    }

    public static /* synthetic */ a b(d dVar, Integer num) throws GeneralSecurityException {
        e(dVar);
        g gVar = new g(null, null);
        gVar.k(dVar);
        gVar.l(com.google.android.libraries.phenotype.client.stable.p.f(dVar.g()));
        gVar.j(num);
        return gVar.i();
    }

    public static /* synthetic */ e c(a aVar) throws GeneralSecurityException {
        e(aVar.f());
        return com.google.e.a.f.a.b.a(aVar);
    }

    public static void d() throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        com.google.e.a.f.a.a.a();
        com.google.e.a.e.n.a().b(f8484a, d.class);
        t.a().b(f8485b);
        t.a().b(f8486c);
        com.google.e.a.e.s sVarA = com.google.e.a.e.s.a();
        HashMap map = new HashMap();
        d dVar = s.f8535c;
        map.put("AES_CMAC", dVar);
        map.put("AES256_CMAC", dVar);
        g gVar = new g(null);
        gVar.f(32);
        gVar.g(16);
        gVar.h(c.f8491d);
        map.put("AES256_CMAC_RAW", gVar.e());
        sVarA.b(DesugarCollections.unmodifiableMap(map));
        com.google.e.a.e.c.a().e(f8487d);
    }

    private static void e(d dVar) throws GeneralSecurityException {
        if (dVar.g() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
