package com.google.e.a.a;

import com.google.e.a.h.bi;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8161a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.e.a.e.af f8162b = com.google.e.a.e.af.a(new e(5), aa.class, com.google.e.a.a.class);

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.e.a.e.b f8163c = new l(4);

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.g f8164d;

    static {
        bi biVar = bi.SYMMETRIC;
        com.google.e.a.h.av.parser();
        f8164d = com.google.e.a.e.g.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", com.google.e.a.a.class, biVar);
    }

    public static void a() throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        com.google.e.a.a.a.i.a();
        com.google.e.a.e.t.a().b(f8162b);
        com.google.e.a.e.n.a().b(f8163c, ad.class);
        com.google.e.a.e.s sVarA = com.google.e.a.e.s.a();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", ad.g(ac.f8165a));
        map.put("CHACHA20_POLY1305_RAW", ad.g(ac.f8167c));
        sVarA.b(DesugarCollections.unmodifiableMap(map));
        com.google.e.a.e.c.a().e(f8164d);
    }
}
