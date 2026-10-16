package com.google.e.a.a;

import com.google.e.a.h.bi;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8304a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.e.a.e.af f8305b = com.google.e.a.e.af.a(new e(2), k.class, com.google.e.a.a.class);

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.e.a.e.b f8306c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.g f8307d;

    static {
        bi biVar = bi.SYMMETRIC;
        com.google.e.a.h.x.parser();
        f8307d = com.google.e.a.e.g.b("type.googleapis.com/google.crypto.tink.AesEaxKey", com.google.e.a.a.class, biVar);
        f8306c = new l(0);
    }

    public static void a() throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        com.google.e.a.a.a.b.a();
        com.google.e.a.e.t.a().b(f8305b);
        com.google.e.a.e.s sVarA = com.google.e.a.e.s.a();
        HashMap map = new HashMap();
        map.put("AES128_EAX", aw.f8228c);
        am amVar = new am((char[]) null);
        amVar.k(16);
        amVar.l(16);
        amVar.m();
        n nVar = n.f8310c;
        amVar.n(nVar);
        map.put("AES128_EAX_RAW", amVar.j());
        map.put("AES256_EAX", aw.f8229d);
        am amVar2 = new am((char[]) null);
        amVar2.k(16);
        amVar2.l(32);
        amVar2.m();
        amVar2.n(nVar);
        map.put("AES256_EAX_RAW", amVar2.j());
        sVarA.b(DesugarCollections.unmodifiableMap(map));
        com.google.e.a.e.n.a().b(f8306c, o.class);
        com.google.e.a.e.c.a().e(f8307d);
    }
}
