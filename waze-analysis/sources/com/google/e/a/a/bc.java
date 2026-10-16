package com.google.e.a.a;

import com.google.e.a.h.bi;
import com.google.e.a.h.cs;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8253a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.e.a.e.af f8254b = com.google.e.a.e.af.a(new e(9), bb.class, com.google.e.a.a.class);

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.e.a.e.o f8255c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.b f8256d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.e.a.e.g f8257e;

    static {
        bi biVar = bi.SYMMETRIC;
        cs.parser();
        f8257e = com.google.e.a.e.g.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", com.google.e.a.a.class, biVar);
        f8255c = new q();
        f8256d = new l(8);
    }

    public static void a() throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        com.google.e.a.a.a.w.a();
        com.google.e.a.e.t.a().b(f8254b);
        com.google.e.a.e.s sVarA = com.google.e.a.e.s.a();
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", be.g(bd.f8258a));
        map.put("XCHACHA20_POLY1305_RAW", be.g(bd.f8260c));
        sVarA.b(DesugarCollections.unmodifiableMap(map));
        com.google.e.a.e.n.a().b(f8256d, be.class);
        com.google.e.a.e.p.a().b(f8255c, be.class);
        com.google.e.a.e.c.a().e(f8257e);
    }
}
