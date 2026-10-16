package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import h.f;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import h.l.c;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ViewModelLazy<VM extends ViewModel> implements f<VM> {
    private VM cached;
    private final a<CreationExtras> extrasProducer;
    private final a<ViewModelProvider.Factory> factoryProducer;
    private final a<ViewModelStore> storeProducer;
    private final c<VM> viewModelClass;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelLazy(c<VM> cVar, a<? extends ViewModelStore> aVar, a<? extends ViewModelProvider.Factory> aVar2, a<? extends CreationExtras> aVar3) {
        x.f(cVar, "viewModelClass");
        x.f(aVar, "storeProducer");
        x.f(aVar2, "factoryProducer");
        x.f(aVar3, "extrasProducer");
        this.viewModelClass = cVar;
        this.storeProducer = aVar;
        this.factoryProducer = aVar2;
        this.extrasProducer = aVar3;
    }

    @Override // h.f
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) ViewModelProvider.Companion.create(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).get(this.viewModelClass);
        this.cached = vm2;
        return vm2;
    }

    @Override // h.f
    public boolean isInitialized() {
        return this.cached != null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(c<VM> cVar, a<? extends ViewModelStore> aVar, a<? extends ViewModelProvider.Factory> aVar2) {
        this(cVar, aVar, aVar2, null, 8, null);
        x.f(cVar, "viewModelClass");
        x.f(aVar, "storeProducer");
        x.f(aVar2, "factoryProducer");
    }

    public /* synthetic */ ViewModelLazy(c cVar, a aVar, a aVar2, a aVar3, int i2, o oVar) {
        this(cVar, aVar, aVar2, (i2 & 8) != 0 ? new a() { // from class: androidx.lifecycle.ViewModelLazy$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return CreationExtras.Empty.INSTANCE;
            }
        } : aVar3);
    }
}
