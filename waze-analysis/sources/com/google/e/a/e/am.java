package com.google.e.a.e;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class am {

    /* renamed from: a, reason: collision with root package name */
    private final Map f8425a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f8426b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f8427c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f8428d;

    public am(an anVar) {
        this.f8425a = new HashMap(anVar.f8429a);
        this.f8426b = new HashMap(anVar.f8430b);
        this.f8427c = new HashMap(anVar.f8431c);
        this.f8428d = new HashMap(anVar.f8432d);
    }

    public final void e(f fVar) throws GeneralSecurityException {
        Map map = this.f8425a;
        if (!map.containsKey(fVar.b())) {
            map.put(fVar.b(), fVar);
            return;
        }
        f fVar2 = (f) map.get(fVar.b());
        if (!fVar2.equals(fVar) || !fVar.equals(fVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(fVar.b().toString()));
        }
    }

    public final void f(z zVar) throws GeneralSecurityException {
        Map map = this.f8427c;
        if (!map.containsKey(zVar.b())) {
            map.put(zVar.b(), zVar);
            return;
        }
        z zVar2 = (z) map.get(zVar.b());
        if (!zVar2.equals(zVar) || !zVar.equals(zVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zVar.b().toString()));
        }
    }

    public final void g(f fVar) throws GeneralSecurityException {
        Map map = this.f8426b;
        String strC = fVar.c();
        if (!map.containsKey(strC)) {
            map.put(strC, fVar);
            return;
        }
        f fVar2 = (f) map.get(strC);
        if (!fVar2.equals(fVar) || !fVar.equals(fVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(strC));
        }
    }

    public final void h(z zVar) throws GeneralSecurityException {
        Map map = this.f8428d;
        String strC = zVar.c();
        if (!map.containsKey(strC)) {
            map.put(strC, zVar);
            return;
        }
        z zVar2 = (z) map.get(strC);
        if (!zVar2.equals(zVar) || !zVar.equals(zVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(strC));
        }
    }

    public am() {
        this.f8425a = new HashMap();
        this.f8426b = new HashMap();
        this.f8427c = new HashMap();
        this.f8428d = new HashMap();
    }
}
