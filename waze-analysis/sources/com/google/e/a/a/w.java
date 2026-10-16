package com.google.e.a.a;

import com.google.e.a.h.bi;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8341a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.e.a.e.af f8342b = com.google.e.a.e.af.a(new e(4), v.class, com.google.e.a.a.class);

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.e.a.e.b f8343c = new l(3);

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.o f8344d = new q();

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.e.a.e.g f8345e;

    static {
        bi biVar = bi.SYMMETRIC;
        com.google.e.a.h.an.parser();
        f8345e = com.google.e.a.e.g.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey", com.google.e.a.a.class, biVar);
    }

    public static void a() throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        com.google.e.a.a.a.g.a();
        com.google.e.a.e.s sVarA = com.google.e.a.e.s.a();
        HashMap map = new HashMap();
        x xVar = new x();
        xVar.b(16);
        y yVar = y.f8348a;
        xVar.c(yVar);
        map.put("AES128_GCM_SIV", xVar.a());
        x xVar2 = new x();
        xVar2.b(16);
        y yVar2 = y.f8350c;
        xVar2.c(yVar2);
        map.put("AES128_GCM_SIV_RAW", xVar2.a());
        x xVar3 = new x();
        xVar3.b(32);
        xVar3.c(yVar);
        map.put("AES256_GCM_SIV", xVar3.a());
        x xVar4 = new x();
        xVar4.b(32);
        xVar4.c(yVar2);
        map.put("AES256_GCM_SIV_RAW", xVar4.a());
        sVarA.b(DesugarCollections.unmodifiableMap(map));
        com.google.e.a.e.p.a().b(f8344d, z.class);
        com.google.e.a.e.n.a().b(f8343c, z.class);
        com.google.e.a.e.t.a().b(f8342b);
        com.google.e.a.e.c.a().e(f8345e);
    }
}
