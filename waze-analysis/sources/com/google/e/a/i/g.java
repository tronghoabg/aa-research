package com.google.e.a.i;

import com.google.e.a.a.q;
import com.google.e.a.e.af;
import com.google.e.a.e.n;
import com.google.e.a.e.o;
import com.google.e.a.e.p;
import com.google.e.a.e.s;
import com.google.e.a.e.t;
import com.google.e.a.h.ad;
import com.google.e.a.h.bi;
import com.google.e.a.z;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8625a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final af f8626b = af.a(new com.google.e.a.a.e(18), f.class, z.class);

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.e.a.e.b f8627c;

    /* renamed from: d, reason: collision with root package name */
    private static final o f8628d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.e.a.e.g f8629e;

    static {
        bi biVar = bi.SYMMETRIC;
        ad.parser();
        f8629e = com.google.e.a.e.g.b("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", z.class, biVar);
        f8627c = new com.google.e.a.a.l(11);
        f8628d = new q();
    }

    public static void a() throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Registering AES-GCM HKDF Streaming AEAD is not supported in FIPS mode");
        }
        com.google.e.a.i.a.b.a();
        s sVarA = s.a();
        HashMap map = new HashMap();
        map.put("AES128_GCM_HKDF_4KB", k.f8646e);
        map.put("AES128_GCM_HKDF_1MB", k.f8647f);
        map.put("AES256_GCM_HKDF_4KB", k.f8648g);
        map.put("AES256_GCM_HKDF_1MB", k.f8649h);
        sVarA.b(DesugarCollections.unmodifiableMap(map));
        p.a().b(f8628d, j.class);
        n.a().b(f8627c, j.class);
        t.a().b(f8626b);
        com.google.e.a.e.c.a().e(f8629e);
    }
}
