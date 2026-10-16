package kotlinx.b.e;

import h.g.a.l;
import h.g.b.ar;
import h.g.b.au;
import h.g.b.m;
import h.g.b.x;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Map f51236a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f51237b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f51238c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f51239d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f51240e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f51241f;

    public e(Map map, Map map2, Map map3, Map map4, Map map5, boolean z) {
        x.f(map, "class2ContextualFactory");
        x.f(map2, "polyBase2Serializers");
        x.f(map3, "polyBase2DefaultSerializerProvider");
        x.f(map4, "polyBase2NamedSerializers");
        x.f(map5, "polyBase2DefaultDeserializerProvider");
        this.f51237b = map;
        this.f51236a = map2;
        this.f51238c = map3;
        this.f51239d = map4;
        this.f51240e = map5;
        this.f51241f = z;
    }

    public final kotlinx.b.a a(h.l.c cVar, String str) {
        x.f(cVar, "baseClass");
        Map map = (Map) this.f51239d.get(cVar);
        kotlinx.b.b bVar = map != null ? (kotlinx.b.b) map.get(str) : null;
        if (true != (bVar instanceof kotlinx.b.b)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.f51240e.get(cVar);
        l lVar = au.e(obj, 1) ? (l) obj : null;
        if (lVar != null) {
            return (kotlinx.b.a) lVar.invoke(str);
        }
        return null;
    }

    public final kotlinx.b.b b(h.l.c cVar, List list) {
        x.f(cVar, "kClass");
        x.f(list, "typeArgumentsSerializers");
        c cVar2 = (c) this.f51237b.get(cVar);
        kotlinx.b.b bVarB = cVar2 != null ? cVar2.b(list) : null;
        if (bVarB instanceof kotlinx.b.b) {
            return bVarB;
        }
        return null;
    }

    public final kotlinx.b.l c(h.l.c cVar, Object obj) {
        kotlinx.b.b bVar;
        x.f(cVar, "baseClass");
        x.f(obj, "value");
        if (cVar.d(obj)) {
            Map map = (Map) this.f51236a.get(cVar);
            if (map != null) {
                Class<?> cls = obj.getClass();
                int i2 = ar.f48106a;
                bVar = (kotlinx.b.b) map.get(new m(cls));
            } else {
                bVar = null;
            }
            kotlinx.b.b bVar2 = bVar instanceof kotlinx.b.l ? bVar : null;
            if (bVar2 != null) {
                return bVar2;
            }
            Object obj2 = this.f51238c.get(cVar);
            l lVar = au.e(obj2, 1) ? (l) obj2 : null;
            if (lVar != null) {
                return (kotlinx.b.l) lVar.invoke(obj);
            }
        }
        return null;
    }

    public final void d(g gVar) {
        x.f(gVar, "collector");
        for (Map.Entry entry : this.f51237b.entrySet()) {
            h.l.c cVar = (h.l.c) entry.getKey();
            c cVar2 = (c) entry.getValue();
            if (cVar2 instanceof a) {
                x.d(cVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                kotlinx.b.b bVarA = ((a) cVar2).a();
                x.d(bVarA, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                gVar.b(cVar, bVarA);
            } else {
                if (!(cVar2 instanceof b)) {
                    throw new h.i();
                }
                gVar.a(cVar, ((b) cVar2).a());
            }
        }
        for (Map.Entry entry2 : this.f51236a.entrySet()) {
            h.l.c cVar3 = (h.l.c) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                h.l.c cVar4 = (h.l.c) entry3.getKey();
                kotlinx.b.b bVar = (kotlinx.b.b) entry3.getValue();
                x.d(cVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                x.d(cVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                x.d(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                gVar.c(cVar3, cVar4, bVar);
            }
        }
        for (Map.Entry entry4 : this.f51238c.entrySet()) {
            h.l.c cVar5 = (h.l.c) entry4.getKey();
            l lVar = (l) entry4.getValue();
            x.d(cVar5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            x.d(lVar, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            au.h(lVar, 1);
            gVar.e(cVar5, lVar);
        }
        for (Map.Entry entry5 : this.f51240e.entrySet()) {
            h.l.c cVar6 = (h.l.c) entry5.getKey();
            l lVar2 = (l) entry5.getValue();
            x.d(cVar6, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            x.d(lVar2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            au.h(lVar2, 1);
            gVar.d(cVar6, lVar2);
        }
    }

    public final boolean e() {
        return this.f51241f;
    }

    private e() {
        throw null;
    }
}
