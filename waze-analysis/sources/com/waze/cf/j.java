package com.waze.cf;

import com.waze.location.q;
import h.g.a.p;
import h.g.b.x;
import java.io.File;
import java.io.IOException;
import kotlinx.coroutines.dc;
import kotlinx.coroutines.w;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class j implements p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f22245a;

    public /* synthetic */ j(int i2) {
        this.f22245a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) throws IOException {
        h.c.d dVar;
        boolean z = true;
        switch (this.f22245a) {
            case 0:
                int i2 = k.f22246a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new q();
            case 1:
                int i3 = k.f22246a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.location.b();
            case 2:
                int i4 = k.f22246a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.cf.b.a();
            case 3:
                String str = (String) obj;
                h.c.h hVar = (h.c.h) obj2;
                x.f(str, "acc");
                x.f(hVar, "element");
                if (str.length() == 0) {
                    return hVar.toString();
                }
                return str + ", " + hVar;
            case 4:
                h.c.j jVar = (h.c.j) obj;
                h.c.h hVar2 = (h.c.h) obj2;
                x.f(jVar, "acc");
                x.f(hVar2, "element");
                h.c.j jVarMinusKey = jVar.minusKey(hVar2.getKey());
                h.c.k kVar = h.c.k.f48060a;
                if (jVarMinusKey == kVar) {
                    return hVar2;
                }
                h.c.f fVar = h.c.g.f48059a;
                h.c.g gVar = (h.c.g) jVarMinusKey.get(fVar);
                if (gVar == null) {
                    dVar = new h.c.d(jVarMinusKey, hVar2);
                } else {
                    h.c.j jVarMinusKey2 = jVarMinusKey.minusKey(fVar);
                    dVar = jVarMinusKey2 == kVar ? new h.c.d(hVar2, gVar) : new h.c.d(new h.c.d(jVarMinusKey2, hVar2), gVar);
                }
                return dVar;
            case 5:
                IOException iOException = (IOException) obj2;
                x.f((File) obj, "<unused var>");
                x.f(iOException, "exception");
                throw iOException;
            case 6:
                h.c.h hVar3 = (h.c.h) obj2;
                if (!((Boolean) obj).booleanValue() && !(hVar3 instanceof w)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                h.c.j jVar2 = (h.c.j) obj;
                h.c.h hVar4 = (h.c.h) obj2;
                return hVar4 instanceof w ? jVar2.plus(((w) hVar4).a()) : jVar2.plus(hVar4);
            case 8:
                return Boolean.valueOf(x.n(obj, obj2));
            case 9:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 10:
                h.c.h hVar5 = (h.c.h) obj2;
                if (!(hVar5 instanceof dc)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? hVar5 : Integer.valueOf(iIntValue + 1);
            case 11:
                dc dcVar = (dc) obj;
                h.c.h hVar6 = (h.c.h) obj2;
                if (dcVar != null) {
                    return dcVar;
                }
                if (hVar6 instanceof dc) {
                    return (dc) hVar6;
                }
                return null;
            default:
                int i5 = org.a.b.a.b.a.f56353a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new org.a.b.a.a.a(null);
        }
    }
}
