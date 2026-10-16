package com.google.e.a.e;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class an implements com.google.e.a.t {

    /* renamed from: a, reason: collision with root package name */
    private final Map f8429a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f8430b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f8431c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f8432d;

    /* synthetic */ an(am amVar) {
        this.f8429a = new HashMap(amVar.f8425a);
        this.f8430b = new HashMap(amVar.f8426b);
        this.f8431c = new HashMap(amVar.f8427c);
        this.f8432d = new HashMap(amVar.f8428d);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.e.a.e.d, java.lang.Object] */
    @Override // com.google.e.a.t
    public final com.google.d.m.a.a.b a(com.waze.car_lib.r.ai aiVar, com.google.e.a.y yVar) throws GeneralSecurityException {
        Map map = this.f8430b;
        String strH = aiVar.h();
        if (map.containsKey(strH)) {
            return ((f) map.get(strH)).f8438a.a(aiVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + strH + " available");
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.e.a.e.e, java.lang.Object] */
    @Override // com.google.e.a.t
    public final com.waze.car_lib.r.ai b(com.google.d.m.a.a.b bVar, com.google.e.a.y yVar) throws GeneralSecurityException {
        Map map = this.f8429a;
        if (map.containsKey(bVar.getClass())) {
            return ((f) map.get(bVar.getClass())).f8438a.a(bVar);
        }
        throw new GeneralSecurityException("No Key serializer for " + String.valueOf(bVar.getClass()) + " available");
    }

    public final boolean g(com.waze.car_lib.r.ai aiVar) {
        return this.f8430b.containsKey(aiVar.h());
    }

    public final boolean h(com.google.android.libraries.e.a.f fVar) {
        return this.f8432d.containsKey(fVar.g());
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.e.a.e.x, java.lang.Object] */
    public final com.google.d.m.a.a.b i(com.google.android.libraries.e.a.f fVar) throws GeneralSecurityException {
        Map map = this.f8432d;
        String strG = fVar.g();
        if (map.containsKey(strG)) {
            return ((z) map.get(strG)).f8464a.a(fVar);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + strG + " available");
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.e.a.e.y, java.lang.Object] */
    public final com.google.android.libraries.e.a.f j(com.google.d.m.a.a.b bVar) throws GeneralSecurityException {
        Map map = this.f8431c;
        if (map.containsKey(bVar.getClass())) {
            return ((z) map.get(bVar.getClass())).f8464a.a(bVar);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + String.valueOf(bVar.getClass()) + " available");
    }
}
