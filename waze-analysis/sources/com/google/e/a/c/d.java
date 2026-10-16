package com.google.e.a.c;

import com.google.android.libraries.phenotype.client.stable.p;
import com.google.e.a.a.q;
import com.google.e.a.e.af;
import com.google.e.a.e.n;
import com.google.e.a.e.o;
import com.google.e.a.e.s;
import com.google.e.a.e.t;
import com.google.e.a.h.ar;
import com.google.e.a.h.bi;
import com.google.e.a.j.m;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final af f8378a = af.a(new com.google.e.a.a.e(10), b.class, com.google.e.a.d.class);

    /* renamed from: b, reason: collision with root package name */
    private static final o f8379b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.e.a.e.b f8380c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.g f8381d;

    static {
        bi biVar = bi.SYMMETRIC;
        ar.parser();
        f8381d = com.google.e.a.e.g.b("type.googleapis.com/google.crypto.tink.AesSivKey", com.google.e.a.d.class, biVar);
        f8379b = new q();
        f8380c = new c();
    }

    public static /* synthetic */ com.google.e.a.d a(b bVar) throws InvalidAlgorithmParameterException {
        d(bVar.g());
        return m.c(bVar);
    }

    static b b(g gVar, Integer num) throws InvalidAlgorithmParameterException {
        d(gVar);
        a aVar = new a();
        aVar.c(gVar);
        aVar.b(num);
        aVar.d(p.f(gVar.f()));
        return aVar.a();
    }

    public static void c() throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
        com.google.e.a.c.a.a.a();
        t.a().b(f8378a);
        s sVarA = s.a();
        HashMap map = new HashMap();
        map.put("AES256_SIV", l.f8392a);
        e eVar = new e();
        eVar.b(64);
        eVar.c(f.f8386c);
        map.put("AES256_SIV_RAW", eVar.a());
        sVarA.b(DesugarCollections.unmodifiableMap(map));
        com.google.e.a.e.p.a().b(f8379b, g.class);
        n.a().b(f8380c, g.class);
        com.google.e.a.e.c.a().e(f8381d);
    }

    private static void d(g gVar) throws InvalidAlgorithmParameterException {
        if (gVar.f() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + gVar.f() + ". Valid keys must have 64 bytes.");
    }
}
