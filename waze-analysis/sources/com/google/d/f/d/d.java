package com.google.d.f.d;

import com.google.d.d.fo;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d extends c {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f7833a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.d.f.b.b f7834b;

    static {
        EnumMap enumMap = new EnumMap(com.google.d.f.b.b.class);
        for (com.google.d.f.b.b bVar : com.google.d.f.b.b.values()) {
            d[] dVarArr = new d[10];
            for (int i2 = 0; i2 < 10; i2++) {
                dVarArr[i2] = new d(i2, bVar, com.google.d.f.b.c.e());
            }
            enumMap.put((EnumMap) bVar, (com.google.d.f.b.b) dVarArr);
        }
        f7833a = DesugarCollections.unmodifiableMap(enumMap);
    }

    private d(int i2, com.google.d.f.b.b bVar, com.google.d.f.b.c cVar) {
        super(cVar, i2);
        fo.o(bVar, "format char");
        this.f7834b = bVar;
        if (cVar.h()) {
            bVar.e();
            return;
        }
        int iA = bVar.a();
        iA = cVar.i() ? iA & 65503 : iA;
        StringBuilder sb = new StringBuilder("%");
        cVar.k(sb);
        sb.append((char) iA);
    }

    public static d a(int i2, com.google.d.f.b.b bVar, com.google.d.f.b.c cVar) {
        if (i2 >= 10 || !cVar.h()) {
            return new d(i2, bVar, cVar);
        }
        d[] dVarArr = (d[]) f7833a.get(bVar);
        fo.o(dVarArr, "default parameter");
        return dVarArr[i2];
    }

    @Override // com.google.d.f.d.c
    protected final void b(com.google.d.f.b.a aVar, Object obj) throws IOException {
        aVar.c(obj, this.f7834b, d());
    }
}
