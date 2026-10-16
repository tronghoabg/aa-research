package com.google.e.a.a;

import com.google.e.a.h.bi;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8271a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.e.a.e.af f8272b = com.google.e.a.e.af.a(new e(0), d.class, com.google.e.a.a.class);

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.e.a.e.o f8273c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.b f8274d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.e.a.e.g f8275e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f8276f;

    static {
        bi biVar = bi.SYMMETRIC;
        com.google.e.a.h.h.parser();
        f8275e = com.google.e.a.e.g.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", com.google.e.a.a.class, biVar);
        f8273c = new q();
        f8274d = new l(1);
        f8276f = 2;
    }

    public static void a() throws GeneralSecurityException {
        int i2 = f8276f;
        if (!com.google.e.a.b.a.a.a(i2)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.e.a.a.a.a.a();
        com.google.e.a.e.t.a().b(f8272b);
        com.google.e.a.e.s sVarA = com.google.e.a.e.s.a();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", aw.f8230e);
        g gVar = new g();
        gVar.b(16);
        gVar.d(32);
        gVar.f(16);
        gVar.e(16);
        h hVar = h.f8285c;
        gVar.c(hVar);
        i iVar = i.f8291c;
        gVar.g(iVar);
        map.put("AES128_CTR_HMAC_SHA256_RAW", gVar.a());
        map.put("AES256_CTR_HMAC_SHA256", aw.f8231f);
        g gVar2 = new g();
        gVar2.b(32);
        gVar2.d(32);
        gVar2.f(32);
        gVar2.e(16);
        gVar2.c(hVar);
        gVar2.g(iVar);
        map.put("AES256_CTR_HMAC_SHA256_RAW", gVar2.a());
        sVarA.b(DesugarCollections.unmodifiableMap(map));
        com.google.e.a.e.p.a().b(f8273c, j.class);
        com.google.e.a.e.n.a().b(f8274d, j.class);
        com.google.e.a.e.c.a().f(f8275e, i2);
    }
}
