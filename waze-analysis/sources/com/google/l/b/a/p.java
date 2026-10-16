package com.google.l.b.a;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p implements com.google.l.v {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.l.b.e f12303a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f12304b;

    public p(com.google.l.b.e eVar, int i2) {
        this.f12304b = i2;
        this.f12303a = eVar;
    }

    @Override // com.google.l.v
    public final com.google.l.u a(com.google.l.d dVar, com.google.l.c.a aVar) {
        if (this.f12304b != 0) {
            Type typeD = aVar.d();
            Class clsC = aVar.c();
            if (!Collection.class.isAssignableFrom(clsC)) {
                return null;
            }
            Type typeD2 = com.google.l.b.k.d(typeD, clsC);
            return new b(new af(dVar, dVar.a(com.google.l.c.a.b(typeD2)), typeD2), this.f12303a.a(aVar, false));
        }
        Type typeD3 = aVar.d();
        Class clsC2 = aVar.c();
        if (!Map.class.isAssignableFrom(clsC2)) {
            return null;
        }
        Type[] typeArrH = com.google.l.b.k.h(typeD3, clsC2);
        Type type = typeArrH[0];
        Type type2 = typeArrH[1];
        return new o(this, new af(dVar, (type == Boolean.TYPE || type == Boolean.class) ? bo.f12268f : dVar.a(com.google.l.c.a.b(type)), type), new af(dVar, dVar.a(com.google.l.c.a.b(type2)), type2), this.f12303a.a(aVar, false));
    }
}
