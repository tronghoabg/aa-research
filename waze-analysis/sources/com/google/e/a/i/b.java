package com.google.e.a.i;

import com.google.e.a.e.af;
import com.google.e.a.e.n;
import com.google.e.a.e.s;
import com.google.e.a.e.t;
import com.google.e.a.h.bi;
import com.google.e.a.z;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8603a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final af f8604b = af.a(new com.google.e.a.a.e(17), a.class, z.class);

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.e.a.e.b f8605c = new com.google.e.a.a.l(10);

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.g f8606d;

    static {
        bi biVar = bi.SYMMETRIC;
        com.google.e.a.h.l.parser();
        f8606d = com.google.e.a.e.g.b("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey", z.class, biVar);
    }

    public static void a() throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Registering AES CTR HMAC Streaming AEAD is not supported in FIPS mode");
        }
        com.google.e.a.i.a.a.a();
        s sVarA = s.a();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256_4KB", k.f8642a);
        map.put("AES128_CTR_HMAC_SHA256_1MB", k.f8643b);
        map.put("AES256_CTR_HMAC_SHA256_4KB", k.f8644c);
        map.put("AES256_CTR_HMAC_SHA256_1MB", k.f8645d);
        sVarA.b(DesugarCollections.unmodifiableMap(map));
        n.a().b(f8605c, e.class);
        t.a().b(f8604b);
        com.google.e.a.e.c.a().e(f8606d);
    }
}
