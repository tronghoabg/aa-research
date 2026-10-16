package com.google.e.a.e;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f8434a = Logger.getLogger(c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final c f8435b = new c();

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentMap f8436c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentMap f8437d = new ConcurrentHashMap();

    public static c a() {
        return f8435b;
    }

    private final synchronized g g(String str) {
        ConcurrentMap concurrentMap;
        concurrentMap = this.f8436c;
        if (!concurrentMap.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return (g) concurrentMap.get(str);
    }

    private final synchronized void h(g gVar) {
        ConcurrentMap concurrentMap = this.f8437d;
        String str = gVar.f8440a;
        if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
            throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
        }
        ConcurrentMap concurrentMap2 = this.f8436c;
        g gVar2 = (g) concurrentMap2.get(str);
        if (gVar2 != null && !gVar2.getClass().equals(gVar.getClass())) {
            f8434a.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, gVar2.getClass().getName(), gVar.getClass().getName()));
        }
        concurrentMap2.putIfAbsent(str, gVar);
        concurrentMap.put(str, true);
    }

    public final boolean b(String str) {
        return ((Boolean) this.f8437d.get(str)).booleanValue();
    }

    public final g c(String str, Class cls) throws GeneralSecurityException {
        g gVarG = g(str);
        Class cls2 = gVarG.f8441b;
        if (cls2.equals(cls)) {
            return gVarG;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(gVarG.getClass()) + ", which only supports: " + cls2.toString());
    }

    public final g d(String str) {
        return g(str);
    }

    public final synchronized void e(g gVar) {
        f(gVar, 1);
    }

    public final synchronized void f(g gVar, int i2) {
        if (!com.google.e.a.b.a.a.a(i2)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        h(gVar);
    }
}
