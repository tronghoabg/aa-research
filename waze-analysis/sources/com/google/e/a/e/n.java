package com.google.e.a.e;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8448a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final b f8449b = new m();

    /* renamed from: c, reason: collision with root package name */
    private static final n f8450c = d();

    /* renamed from: d, reason: collision with root package name */
    private final Map f8451d = new HashMap();

    public static n a() {
        return f8450c;
    }

    private static n d() {
        n nVar = new n();
        try {
            nVar.b(f8449b, j.class);
            return nVar;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException("unexpected error.", e2);
        }
    }

    private final synchronized com.google.d.m.a.a.b e(com.google.d.m.a.a.b bVar, Integer num) {
        b bVar2;
        bVar2 = (b) this.f8451d.get(bVar.getClass());
        if (bVar2 == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + bVar.toString() + ": no key creator for this class was registered.");
        }
        return bVar2.a(bVar, num);
    }

    public final synchronized void b(b bVar, Class cls) {
        Map map = this.f8451d;
        b bVar2 = (b) map.get(cls);
        if (bVar2 != null && !bVar2.equals(bVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
        }
        map.put(cls, bVar);
    }

    public final com.google.d.m.a.a.b c(com.google.d.m.a.a.b bVar, Integer num) {
        return e(bVar, num);
    }
}
