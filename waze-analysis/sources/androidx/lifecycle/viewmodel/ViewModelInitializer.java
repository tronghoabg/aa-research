package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.l.c;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewModelInitializer<T extends ViewModel> {
    private final c<T> clazz;
    private final l<CreationExtras, T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelInitializer(c<T> cVar, l<? super CreationExtras, ? extends T> lVar) {
        x.f(cVar, "clazz");
        x.f(lVar, "initializer");
        this.clazz = cVar;
        this.initializer = lVar;
    }

    public final c<T> getClazz$lifecycle_viewmodel() {
        return this.clazz;
    }

    public final l<CreationExtras, T> getInitializer$lifecycle_viewmodel() {
        return this.initializer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelInitializer(Class<T> cls, l<? super CreationExtras, ? extends T> lVar) {
        this(o.y(cls), lVar);
        x.f(cls, "clazz");
        x.f(lVar, "initializer");
    }
}
