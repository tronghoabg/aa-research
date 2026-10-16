package com.dexterous.flutterlocalnotifications;

import E5.Q;
import com.google.gson.internal.bind.C1762h;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import la.l;
import la.o;
import la.p;
import la.r;
import la.z;
import ra.C3962a;

/* loaded from: classes3.dex */
public final class j extends z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26234a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26235b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f26236c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f26237d;

    public j(RuntimeTypeAdapterFactory runtimeTypeAdapterFactory, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f26237d = runtimeTypeAdapterFactory;
        this.f26235b = linkedHashMap;
        this.f26236c = linkedHashMap2;
    }

    @Override // la.z
    public final Object b(C3962a c3962a) {
        switch (this.f26234a) {
            case 0:
                o oVarI = na.d.i(c3962a);
                r rVarB = oVarI.b();
                RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = (RuntimeTypeAdapterFactory) this.f26237d;
                o oVar = (o) rVarB.f40208a.remove(runtimeTypeAdapterFactory.typeFieldName);
                if (oVar == null) {
                    throw new Q("cannot deserialize " + runtimeTypeAdapterFactory.baseType + " because it does not define a field named " + runtimeTypeAdapterFactory.typeFieldName, 13);
                }
                String strC = oVar.c();
                z zVar = (z) ((LinkedHashMap) this.f26235b).get(strC);
                if (zVar == null) {
                    throw new Q("cannot deserialize " + runtimeTypeAdapterFactory.baseType + " subtype named " + strC + "; did you forget to register a subtype?", 13);
                }
                try {
                    C1762h c1762h = new C1762h(C1762h.f27456t);
                    c1762h.f27458p = new Object[32];
                    c1762h.f27459q = 0;
                    c1762h.f27460r = new String[32];
                    c1762h.f27461s = new int[32];
                    c1762h.t0(oVarI);
                    return zVar.b(c1762h);
                } catch (IOException e7) {
                    throw new p(e7, 13);
                }
            default:
                return ((z) this.f26236c).b(c3962a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.reflect.Type] */
    @Override // la.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(ra.C3963b r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dexterous.flutterlocalnotifications.j.c(ra.b, java.lang.Object):void");
    }

    public j(l lVar, z zVar, Type type) {
        this.f26235b = lVar;
        this.f26236c = zVar;
        this.f26237d = type;
    }
}
