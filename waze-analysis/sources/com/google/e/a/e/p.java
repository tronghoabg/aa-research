package com.google.e.a.e;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final p f8452a = new p();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f8453b = new ConcurrentHashMap();

    public static p a() {
        return f8452a;
    }

    public final void b(o oVar, Class cls) throws GeneralSecurityException {
        o oVar2 = (o) this.f8453b.putIfAbsent(cls, oVar);
        if (oVar2 != null && !oVar2.equals(oVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
    }
}
