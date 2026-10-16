package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;
import ra.C3962a;
import ra.C3963b;

/* renamed from: com.google.gson.internal.bind.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1765k extends la.z {

    /* renamed from: a, reason: collision with root package name */
    public final com.dexterous.flutterlocalnotifications.j f27467a;

    /* renamed from: b, reason: collision with root package name */
    public final com.dexterous.flutterlocalnotifications.j f27468b;

    /* renamed from: c, reason: collision with root package name */
    public final na.m f27469c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MapTypeAdapterFactory f27470d;

    public C1765k(MapTypeAdapterFactory mapTypeAdapterFactory, la.l lVar, Type type, la.z zVar, Type type2, la.z zVar2, na.m mVar) {
        this.f27470d = mapTypeAdapterFactory;
        this.f27467a = new com.dexterous.flutterlocalnotifications.j(lVar, zVar, type);
        this.f27468b = new com.dexterous.flutterlocalnotifications.j(lVar, zVar2, type2);
        this.f27469c = mVar;
    }

    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        int iE0 = c3962a.e0();
        if (iE0 == 9) {
            c3962a.a0();
            return null;
        }
        Map map = (Map) this.f27469c.d();
        if (iE0 == 1) {
            c3962a.a();
            while (c3962a.D()) {
                c3962a.a();
                Object objB = ((la.z) this.f27467a.f26236c).b(c3962a);
                if (map.put(objB, ((la.z) this.f27468b.f26236c).b(c3962a)) != null) {
                    throw new la.p("duplicate key: " + objB, 13);
                }
                c3962a.i();
            }
            c3962a.i();
            return map;
        }
        c3962a.b();
        while (c3962a.D()) {
            a2.k.f17189b.getClass();
            if (c3962a instanceof C1762h) {
                C1762h c1762h = (C1762h) c3962a;
                c1762h.n0(5);
                Map.Entry entry = (Map.Entry) ((Iterator) c1762h.r0()).next();
                c1762h.t0(entry.getValue());
                c1762h.t0(new la.s((String) entry.getKey()));
            } else {
                int iH = c3962a.f44690g;
                if (iH == 0) {
                    iH = c3962a.h();
                }
                if (iH == 13) {
                    c3962a.f44690g = 9;
                } else if (iH == 12) {
                    c3962a.f44690g = 8;
                } else {
                    if (iH != 14) {
                        throw c3962a.m0("a name");
                    }
                    c3962a.f44690g = 10;
                }
            }
            Object objB2 = ((la.z) this.f27467a.f26236c).b(c3962a);
            if (map.put(objB2, ((la.z) this.f27468b.f26236c).b(c3962a)) != null) {
                throw new la.p("duplicate key: " + objB2, 13);
            }
        }
        c3962a.o();
        return map;
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            c3963b.z();
            return;
        }
        this.f27470d.getClass();
        com.dexterous.flutterlocalnotifications.j jVar = this.f27468b;
        c3963b.d();
        for (Map.Entry entry : map.entrySet()) {
            c3963b.w(String.valueOf(entry.getKey()));
            jVar.c(c3963b, entry.getValue());
        }
        c3963b.o();
    }
}
