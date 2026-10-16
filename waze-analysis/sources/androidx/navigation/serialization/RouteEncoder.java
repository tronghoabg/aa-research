package androidx.navigation.serialization;

import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import h.a.r;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.b.a.q;
import kotlinx.b.b.b;
import kotlinx.b.b.f;
import kotlinx.b.e.e;
import kotlinx.b.e.i;
import kotlinx.b.l;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RouteEncoder<T> extends b {
    private int elementIndex;
    private final Map<String, List<String>> map;
    private final kotlinx.b.b<T> serializer;
    private final e serializersModule;
    private final Map<String, NavType<Object>> typeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public RouteEncoder(kotlinx.b.b<T> bVar, Map<String, ? extends NavType<Object>> map) {
        x.f(bVar, "serializer");
        x.f(map, "typeMap");
        this.serializer = bVar;
        this.typeMap = map;
        this.serializersModule = i.a();
        this.map = new LinkedHashMap();
        this.elementIndex = -1;
    }

    private final void internalEncodeValue(Object obj) {
        String strC = this.serializer.getDescriptor().c(this.elementIndex);
        NavType<Object> navType = this.typeMap.get(strC);
        if (navType != null) {
            this.map.put(strC, navType instanceof CollectionNavType ? ((CollectionNavType) navType).serializeAsValues(obj) : h.a.i.d(navType.serializeAsValue(obj)));
            return;
        }
        throw new IllegalStateException("Cannot find NavType for argument " + strC + ". Please provide NavType through typeMap.");
    }

    @Override // kotlinx.b.b.b
    public boolean encodeElement(q qVar, int i2) {
        x.f(qVar, "descriptor");
        this.elementIndex = i2;
        return true;
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public f encodeInline(q qVar) {
        x.f(qVar, "descriptor");
        if (RouteSerializerKt.isValueClass(qVar)) {
            this.elementIndex = 0;
        }
        return super.encodeInline(qVar);
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public void encodeNull() {
        internalEncodeValue(null);
    }

    @Override // kotlinx.b.b.b, kotlinx.b.b.f
    public <T> void encodeSerializableValue(l<? super T> lVar, T t) {
        x.f(lVar, "serializer");
        internalEncodeValue(t);
    }

    public final Map<String, List<String>> encodeToArgMap(Object obj) {
        x.f(obj, "value");
        super.encodeSerializableValue(this.serializer, obj);
        return r.r(this.map);
    }

    @Override // kotlinx.b.b.b
    public void encodeValue(Object obj) {
        x.f(obj, "value");
        internalEncodeValue(obj);
    }

    @Override // kotlinx.b.b.f
    public e getSerializersModule() {
        return this.serializersModule;
    }
}
