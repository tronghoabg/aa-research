package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavType;
import h.g.b.x;
import java.util.Map;
import kotlinx.b.a.q;
import kotlinx.b.b.a;
import kotlinx.b.e.e;
import kotlinx.b.e.i;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RouteDecoder extends a {
    private int elementIndex;
    private String elementName;
    private final e serializersModule;
    private final ArgStore store;

    public RouteDecoder(Bundle bundle, Map<String, ? extends NavType<?>> map) {
        x.f(bundle, "bundle");
        x.f(map, "typeMap");
        this.elementIndex = -1;
        this.elementName = "";
        this.serializersModule = i.a();
        this.store = new SavedStateArgStore(bundle, map);
    }

    public static /* synthetic */ void getSerializersModule$annotations() {
    }

    private final Object internalDecodeValue() {
        Object obj = this.store.get(this.elementName);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Unexpected null value for non-nullable argument ".concat(String.valueOf(this.elementName)));
    }

    @Override // kotlinx.b.b.c
    public int decodeElementIndex(q qVar) {
        String strC;
        x.f(qVar, "descriptor");
        int i2 = this.elementIndex;
        do {
            i2++;
            if (i2 >= qVar.b()) {
                return -1;
            }
            strC = qVar.c(i2);
        } while (!this.store.contains(strC));
        this.elementIndex = i2;
        this.elementName = strC;
        return i2;
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public kotlinx.b.b.e decodeInline(q qVar) {
        x.f(qVar, "descriptor");
        if (RouteSerializerKt.isValueClass(qVar)) {
            this.elementName = qVar.c(0);
            this.elementIndex = 0;
        }
        return super.decodeInline(qVar);
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public boolean decodeNotNullMark() {
        return this.store.get(this.elementName) != null;
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public Void decodeNull() {
        return null;
    }

    public final <T> T decodeRouteWithArgs$navigation_common(kotlinx.b.a<? extends T> aVar) {
        x.f(aVar, "deserializer");
        return (T) super.decodeSerializableValue(aVar);
    }

    @Override // kotlinx.b.b.a, kotlinx.b.b.e
    public <T> T decodeSerializableValue(kotlinx.b.a<? extends T> aVar) {
        x.f(aVar, "deserializer");
        return (T) internalDecodeValue();
    }

    @Override // kotlinx.b.b.a
    public Object decodeValue() {
        return internalDecodeValue();
    }

    @Override // kotlinx.b.b.c
    public e getSerializersModule() {
        return this.serializersModule;
    }

    public RouteDecoder(SavedStateHandle savedStateHandle, Map<String, ? extends NavType<?>> map) {
        x.f(savedStateHandle, "handle");
        x.f(map, "typeMap");
        this.elementIndex = -1;
        this.elementName = "";
        this.serializersModule = i.a();
        this.store = new SavedStateHandleArgStore(savedStateHandle, map);
    }
}
