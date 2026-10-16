package com.google.e.a.a;

import com.google.e.a.h.bi;
import com.google.e.a.h.cb;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8170a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.e.a.e.af f8171b = com.google.e.a.e.af.a(new e(6), ah.class, com.google.e.a.a.class);

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.e.a.e.b f8172c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.g f8173d;

    static {
        bi biVar = bi.REMOTE;
        cb.parser();
        f8173d = com.google.e.a.e.g.b("type.googleapis.com/google.crypto.tink.KmsAeadKey", com.google.e.a.a.class, biVar);
        f8172c = new l(5);
    }

    public static void a() throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        ak.a();
        com.google.e.a.e.t.a().b(f8171b);
        com.google.e.a.e.n.a().b(f8172c, aj.class);
        com.google.e.a.e.c.a().e(f8173d);
    }
}
