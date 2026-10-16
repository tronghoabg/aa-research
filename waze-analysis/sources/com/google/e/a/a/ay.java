package com.google.e.a.a;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ay {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.e.a.e.b f8240a = new l(7);

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.e.a.e.af f8241b = com.google.e.a.e.af.a(new e(8), ax.class, com.google.e.a.a.class);

    public static void a() {
        com.google.e.a.a.a.u.a();
        com.google.e.a.e.s sVarA = com.google.e.a.e.s.a();
        HashMap map = new HashMap();
        map.put("XAES_256_GCM_192_BIT_NONCE", aw.f8232g);
        map.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", aw.f8233h);
        map.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", aw.f8234i);
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", aw.f8235j);
        sVarA.b(DesugarCollections.unmodifiableMap(map));
        com.google.e.a.e.t.a().b(f8241b);
        com.google.e.a.e.n.a().b(f8240a, ba.class);
    }
}
