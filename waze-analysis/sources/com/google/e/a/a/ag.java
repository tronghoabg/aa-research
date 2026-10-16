package com.google.e.a.a;

import com.google.e.a.h.bi;
import com.google.e.a.h.cf;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8180a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.e.a.e.b f8181b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.e.a.e.af f8182c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.e.a.e.g f8183d;

    static {
        bi biVar = bi.SYMMETRIC;
        cf.parser();
        f8183d = com.google.e.a.e.g.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", com.google.e.a.a.class, biVar);
        f8181b = new l(6);
        f8182c = com.google.e.a.e.af.a(new e(7), al.class, com.google.e.a.a.class);
    }

    public static void a() throws GeneralSecurityException {
        if (!com.google.e.a.b.a.a.a(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        au.a();
        com.google.e.a.e.n.a().b(f8181b, ap.class);
        com.google.e.a.e.t.a().b(f8182c);
        com.google.e.a.e.c.a().e(f8183d);
    }
}
