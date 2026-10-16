package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.CreationExtras;
import h.g.b.o;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MutableCreationExtras extends CreationExtras {
    public MutableCreationExtras(Map<CreationExtras.Key<?>, ? extends Object> map) {
        x.f(map, "initialExtras");
        getExtras$lifecycle_viewmodel().putAll(map);
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    public <T> T get(CreationExtras.Key<T> key) {
        x.f(key, "key");
        return (T) getExtras$lifecycle_viewmodel().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void set(CreationExtras.Key<T> key, T t) {
        x.f(key, "key");
        getExtras$lifecycle_viewmodel().put(key, t);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MutableCreationExtras(CreationExtras creationExtras) {
        this((Map<CreationExtras.Key<?>, ? extends Object>) creationExtras.getExtras$lifecycle_viewmodel());
        x.f(creationExtras, "initialExtras");
    }

    public /* synthetic */ MutableCreationExtras(CreationExtras.Empty empty, int i2, o oVar) {
        this((i2 & 1) != 0 ? CreationExtras.Empty.INSTANCE : empty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutableCreationExtras() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
