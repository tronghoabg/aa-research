package com.google.e.a.f;

import com.google.e.a.e.af;
import com.google.e.a.e.t;
import com.google.e.a.h.bc;
import com.google.e.a.h.bi;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8504a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final af f8505b = af.a(new com.google.e.a.a.e(14), h.class, e.class);

    /* renamed from: c, reason: collision with root package name */
    private static final af f8506c = af.a(new com.google.e.a.a.e(15), h.class, com.google.e.a.q.class);

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.o f8507d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.e.a.e.b f8508e;

    /* renamed from: f, reason: collision with root package name */
    private static final com.google.e.a.e.g f8509f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f8510g;

    static {
        bi biVar = bi.SYMMETRIC;
        bc.parser();
        f8509f = com.google.e.a.e.g.b("type.googleapis.com/google.crypto.tink.HmacKey", com.google.e.a.q.class, biVar);
        f8507d = new com.google.e.a.a.q();
        f8508e = new i();
        f8510g = 2;
    }

    public static void a() throws GeneralSecurityException {
        int i2 = f8510g;
        if (!com.google.e.a.b.a.a.a(i2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.e.a.f.a.c.a();
        t.a().b(f8505b);
        t.a().b(f8506c);
        com.google.e.a.e.s sVarA = com.google.e.a.e.s.a();
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", s.f8533a);
        k kVar = new k();
        kVar.c(32);
        kVar.d(16);
        m mVar = m.f8524d;
        kVar.e(mVar);
        l lVar = l.f8517c;
        kVar.b(lVar);
        map.put("HMAC_SHA256_128BITTAG_RAW", kVar.a());
        k kVar2 = new k();
        kVar2.c(32);
        kVar2.d(32);
        m mVar2 = m.f8521a;
        kVar2.e(mVar2);
        kVar2.b(lVar);
        map.put("HMAC_SHA256_256BITTAG", kVar2.a());
        k kVar3 = new k();
        kVar3.c(32);
        kVar3.d(32);
        kVar3.e(mVar);
        kVar3.b(lVar);
        map.put("HMAC_SHA256_256BITTAG_RAW", kVar3.a());
        k kVar4 = new k();
        kVar4.c(64);
        kVar4.d(16);
        kVar4.e(mVar2);
        l lVar2 = l.f8519e;
        kVar4.b(lVar2);
        map.put("HMAC_SHA512_128BITTAG", kVar4.a());
        k kVar5 = new k();
        kVar5.c(64);
        kVar5.d(16);
        kVar5.e(mVar);
        kVar5.b(lVar2);
        map.put("HMAC_SHA512_128BITTAG_RAW", kVar5.a());
        k kVar6 = new k();
        kVar6.c(64);
        kVar6.d(32);
        kVar6.e(mVar2);
        kVar6.b(lVar2);
        map.put("HMAC_SHA512_256BITTAG", kVar6.a());
        k kVar7 = new k();
        kVar7.c(64);
        kVar7.d(32);
        kVar7.e(mVar);
        kVar7.b(lVar2);
        map.put("HMAC_SHA512_256BITTAG_RAW", kVar7.a());
        map.put("HMAC_SHA512_512BITTAG", s.f8534b);
        k kVar8 = new k();
        kVar8.c(64);
        kVar8.d(64);
        kVar8.e(mVar);
        kVar8.b(lVar2);
        map.put("HMAC_SHA512_512BITTAG_RAW", kVar8.a());
        sVarA.b(DesugarCollections.unmodifiableMap(map));
        com.google.e.a.e.n.a().b(f8508e, n.class);
        com.google.e.a.e.p.a().b(f8507d, n.class);
        com.google.e.a.e.c.a().f(f8509f, i2);
    }
}
