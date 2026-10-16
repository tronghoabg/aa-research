package kotlinx.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.ui.t;
import h.ab;
import h.g.b.ar;
import h.g.b.at;
import h.g.b.x;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.b.a.v;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends kotlinx.b.c.b {

    /* renamed from: a, reason: collision with root package name */
    private final h.l.c f51257a;

    /* renamed from: b, reason: collision with root package name */
    private List f51258b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f51259c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f51260d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f51261e;

    public i(String str, h.l.c cVar, h.l.c[] cVarArr, b[] bVarArr, Annotation[] annotationArr) {
        x.f(str, "serialName");
        x.f(cVar, "baseClass");
        x.f(cVarArr, "subclasses");
        x.f(bVarArr, "subclassSerializers");
        x.f(annotationArr, "classAnnotations");
        x.f(str, "serialName");
        x.f(cVar, "baseClass");
        x.f(cVarArr, "subclasses");
        x.f(bVarArr, "subclassSerializers");
        this.f51257a = cVar;
        this.f51258b = h.a.i.h();
        this.f51259c = h.g.b(h.h.f48131b, new t(str, this, 20, null));
        if (cVarArr.length != bVarArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + cVar.c() + " should be marked @Serializable");
        }
        Map mapQ = h.a.r.q(h.a.c.ab(cVarArr, bVarArr));
        this.f51260d = mapQ;
        h hVar = new h(mapQ.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : hVar.f51256a) {
            String strD = ((b) entry.getValue()).getDescriptor().d();
            Object obj = linkedHashMap.get(strD);
            if (obj == null) {
                linkedHashMap.containsKey(strD);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException("Multiple sealed subclasses of '" + this.f51257a + "' have the same serial name '" + strD + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'');
            }
            linkedHashMap.put(strD, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h.a.r.a(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (b) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f51261e = linkedHashMap2;
        this.f51258b = h.a.c.i(annotationArr);
    }

    static final ab a(i iVar, kotlinx.b.a.a aVar) {
        x.f(aVar, "$this$buildSerialDescriptor");
        kotlinx.b.a.a.g(aVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, kotlinx.b.a.b.u(at.f48108a).getDescriptor());
        kotlinx.b.a.a.g(aVar, "value", h.k.n.z("kotlinx.serialization.Sealed<" + iVar.f51257a.c() + '>', v.f50938a, new kotlinx.b.a.q[0], new g(iVar, 2)));
        aVar.f(iVar.f51258b);
        return ab.f48028a;
    }

    static final ab c(i iVar, kotlinx.b.a.a aVar) {
        x.f(aVar, "$this$buildSerialDescriptor");
        for (Map.Entry entry : iVar.f51261e.entrySet()) {
            kotlinx.b.a.a.g(aVar, (String) entry.getKey(), ((b) entry.getValue()).getDescriptor());
        }
        return ab.f48028a;
    }

    @Override // kotlinx.b.c.b
    public final h.l.c b() {
        return this.f51257a;
    }

    @Override // kotlinx.b.c.b
    public final a d(kotlinx.b.b.c cVar, String str) {
        x.f(cVar, "decoder");
        b bVar = (b) this.f51261e.get(str);
        return bVar != null ? bVar : super.d(cVar, str);
    }

    @Override // kotlinx.b.c.b
    public final l e(kotlinx.b.b.f fVar, Object obj) {
        x.f(fVar, "encoder");
        x.f(obj, "value");
        Class<?> cls = obj.getClass();
        int i2 = ar.f48106a;
        b bVar = (b) this.f51260d.get(new h.g.b.m(cls));
        b bVarE = bVar != null ? bVar : super.e(fVar, obj);
        if (bVarE != null) {
            return bVarE;
        }
        return null;
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return (kotlinx.b.a.q) this.f51259c.getValue();
    }
}
