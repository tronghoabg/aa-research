package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import h.g.b.o;
import h.g.b.x;
import h.l.c;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewModelProviderImpl_androidKt {
    public static final <VM extends ViewModel> VM createViewModel(ViewModelProvider.Factory factory, c<VM> cVar, CreationExtras creationExtras) {
        x.f(factory, "factory");
        x.f(cVar, "modelClass");
        x.f(creationExtras, "extras");
        try {
            try {
                return (VM) factory.create(cVar, creationExtras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.create(o.w(cVar));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.create(o.w(cVar), creationExtras);
        }
    }
}
