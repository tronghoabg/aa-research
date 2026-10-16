package com.google.e.a.a;

import com.google.e.a.h.bi;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8320a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.e.a.e.af f8321b = com.google.e.a.e.af.a(new e(3), p.class, com.google.e.a.a.class);

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.e.a.e.o f8322c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.b f8323d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.e.a.e.g f8324e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f8325f;

    static {
        bi biVar = bi.SYMMETRIC;
        com.google.e.a.h.aj.parser();
        f8324e = com.google.e.a.e.g.b("type.googleapis.com/google.crypto.tink.AesGcmKey", com.google.e.a.a.class, biVar);
        f8322c = new q();
        f8323d = new l(2);
        f8325f = 2;
    }

    public static void a() throws GeneralSecurityException {
        int i2 = f8325f;
        if (!com.google.e.a.b.a.a.a(i2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.e.a.a.a.e.a();
        com.google.e.a.e.t.a().b(f8321b);
        com.google.e.a.e.s sVarA = com.google.e.a.e.s.a();
        HashMap map = new HashMap();
        map.put("AES128_GCM", aw.f8226a);
        am amVar = new am((byte[]) null);
        amVar.f();
        amVar.g(16);
        amVar.h();
        s sVar = s.f8328c;
        amVar.i(sVar);
        map.put("AES128_GCM_RAW", amVar.e());
        map.put("AES256_GCM", aw.f8227b);
        am amVar2 = new am((byte[]) null);
        amVar2.f();
        amVar2.g(32);
        amVar2.h();
        amVar2.i(sVar);
        map.put("AES256_GCM_RAW", amVar2.e());
        sVarA.b(DesugarCollections.unmodifiableMap(map));
        com.google.e.a.e.p.a().b(f8322c, t.class);
        com.google.e.a.e.n.a().b(f8323d, t.class);
        com.google.e.a.e.c.a().f(f8324e, i2);
    }
}
