package androidx.fragment.app;

import android.support.v4.app.ar;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.m;
import h.g.b.x;
import h.h;
import h.l.c;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FragmentViewModelLazyKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 implements a<ViewModelStore> {
        final /* synthetic */ ar $this_activityViewModels;

        public AnonymousClass1(ar arVar) {
            this.$this_activityViewModels = arVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            x.e(viewModelStore, "<get-viewModelStore>(...)");
            return viewModelStore;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 implements a<CreationExtras> {
        final /* synthetic */ ar $this_activityViewModels;

        public AnonymousClass2(ar arVar) {
            this.$this_activityViewModels = arVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final CreationExtras invoke() {
            CreationExtras defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            x.e(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
            return defaultViewModelCreationExtras;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass3 implements a<ViewModelProvider.Factory> {
        final /* synthetic */ ar $this_activityViewModels;

        public AnonymousClass3(ar arVar) {
            this.$this_activityViewModels = arVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            x.e(defaultViewModelProviderFactory, "<get-defaultViewModelProviderFactory>(...)");
            return defaultViewModelProviderFactory;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$4, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass4 implements a<ViewModelStore> {
        final /* synthetic */ ar $this_activityViewModels;

        public AnonymousClass4(ar arVar) {
            this.$this_activityViewModels = arVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            x.e(viewModelStore, "<get-viewModelStore>(...)");
            return viewModelStore;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$5, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass5 implements a<CreationExtras> {
        final /* synthetic */ a<CreationExtras> $extrasProducer;
        final /* synthetic */ ar $this_activityViewModels;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(a<? extends CreationExtras> aVar, ar arVar) {
            this.$extrasProducer = aVar;
            this.$this_activityViewModels = arVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final CreationExtras invoke() {
            CreationExtras creationExtrasInvoke;
            a<CreationExtras> aVar = this.$extrasProducer;
            if (aVar != null && (creationExtrasInvoke = aVar.invoke()) != null) {
                return creationExtrasInvoke;
            }
            CreationExtras defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            x.e(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
            return defaultViewModelCreationExtras;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$6, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass6 implements a<ViewModelProvider.Factory> {
        final /* synthetic */ ar $this_activityViewModels;

        public AnonymousClass6(ar arVar) {
            this.$this_activityViewModels = arVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            x.e(defaultViewModelProviderFactory, "<get-defaultViewModelProviderFactory>(...)");
            return defaultViewModelProviderFactory;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C04352 implements a<ViewModelStore> {
        final /* synthetic */ f<ViewModelStoreOwner> $owner$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        public C04352(f<? extends ViewModelStoreOwner> fVar) {
            this.$owner$delegate = fVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.m11912viewModels$lambda0(this.$owner$delegate).getViewModelStore();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$3, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C04363 implements a<CreationExtras> {
        final /* synthetic */ f<ViewModelStoreOwner> $owner$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        public C04363(f<? extends ViewModelStoreOwner> fVar) {
            this.$owner$delegate = fVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final CreationExtras invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwnerM11912viewModels$lambda0 = FragmentViewModelLazyKt.m11912viewModels$lambda0(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM11912viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM11912viewModels$lambda0 : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras()) == null) ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$4, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C04374 implements a<ViewModelProvider.Factory> {
        final /* synthetic */ f<ViewModelStoreOwner> $owner$delegate;
        final /* synthetic */ ar $this_viewModels;

        /* JADX WARN: Multi-variable type inference failed */
        public C04374(ar arVar, f<? extends ViewModelStoreOwner> fVar) {
            this.$this_viewModels = arVar;
            this.$owner$delegate = fVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerM11912viewModels$lambda0 = FragmentViewModelLazyKt.m11912viewModels$lambda0(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM11912viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM11912viewModels$lambda0 : null;
            if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            x.e(defaultViewModelProviderFactory2, "<get-defaultViewModelProviderFactory>(...)");
            return defaultViewModelProviderFactory2;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$6, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C04396 implements a<ViewModelStore> {
        final /* synthetic */ f<ViewModelStoreOwner> $owner$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        public C04396(f<? extends ViewModelStoreOwner> fVar) {
            this.$owner$delegate = fVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.m11913viewModels$lambda1(this.$owner$delegate).getViewModelStore();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$7, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass7 implements a<CreationExtras> {
        final /* synthetic */ a<CreationExtras> $extrasProducer;
        final /* synthetic */ f<ViewModelStoreOwner> $owner$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(a<? extends CreationExtras> aVar, f<? extends ViewModelStoreOwner> fVar) {
            this.$extrasProducer = aVar;
            this.$owner$delegate = fVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final CreationExtras invoke() {
            CreationExtras creationExtrasInvoke;
            a<CreationExtras> aVar = this.$extrasProducer;
            if (aVar != null && (creationExtrasInvoke = aVar.invoke()) != null) {
                return creationExtrasInvoke;
            }
            ViewModelStoreOwner viewModelStoreOwnerM11913viewModels$lambda1 = FragmentViewModelLazyKt.m11913viewModels$lambda1(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM11913viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM11913viewModels$lambda1 : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$8, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass8 implements a<ViewModelProvider.Factory> {
        final /* synthetic */ f<ViewModelStoreOwner> $owner$delegate;
        final /* synthetic */ ar $this_viewModels;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(ar arVar, f<? extends ViewModelStoreOwner> fVar) {
            this.$this_viewModels = arVar;
            this.$owner$delegate = fVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerM11913viewModels$lambda1 = FragmentViewModelLazyKt.m11913viewModels$lambda1(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM11913viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM11913viewModels$lambda1 : null;
            if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            x.e(defaultViewModelProviderFactory2, "<get-defaultViewModelProviderFactory>(...)");
            return defaultViewModelProviderFactory2;
        }
    }

    public static final /* synthetic */ <VM extends ViewModel> f<VM> activityViewModels(ar arVar, a<? extends CreationExtras> aVar, a<? extends ViewModelProvider.Factory> aVar2) {
        x.f(arVar, "<this>");
        x.i();
        int i2 = h.g.b.ar.f48106a;
        m mVar = new m(ViewModel.class);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(arVar);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(aVar, arVar);
        if (aVar2 == null) {
            aVar2 = new AnonymousClass6(arVar);
        }
        return createViewModelLazy(arVar, mVar, anonymousClass4, anonymousClass5, aVar2);
    }

    public static /* synthetic */ f activityViewModels$default(ar arVar, a aVar, a aVar2, int i2, Object obj) {
        x.f(arVar, "<this>");
        x.i();
        int i3 = h.g.b.ar.f48106a;
        m mVar = new m(ViewModel.class);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(arVar);
        if (1 == (i2 & 1)) {
            aVar = null;
        }
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(aVar, arVar);
        if ((i2 & 2) != 0) {
            aVar2 = null;
        }
        if (aVar2 == null) {
            aVar2 = new AnonymousClass6(arVar);
        }
        return createViewModelLazy(arVar, mVar, anonymousClass4, anonymousClass5, aVar2);
    }

    public static final <VM extends ViewModel> f<VM> createViewModelLazy(final ar arVar, c<VM> cVar, a<? extends ViewModelStore> aVar, a<? extends CreationExtras> aVar2, a<? extends ViewModelProvider.Factory> aVar3) {
        x.f(arVar, "<this>");
        x.f(cVar, "viewModelClass");
        x.f(aVar, "storeProducer");
        x.f(aVar2, "extrasProducer");
        if (aVar3 == null) {
            aVar3 = new a() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    return FragmentViewModelLazyKt.createViewModelLazy$lambda$2(arVar);
                }
            };
        }
        return new ViewModelLazy(cVar, aVar, aVar3, aVar2);
    }

    public static /* synthetic */ f createViewModelLazy$default(final ar arVar, c cVar, a aVar, a aVar2, a aVar3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            aVar2 = new a() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return arVar.getDefaultViewModelCreationExtras();
                }
            };
        }
        if ((i2 & 8) != 0) {
            aVar3 = null;
        }
        return createViewModelLazy(arVar, cVar, aVar, aVar2, aVar3);
    }

    static final CreationExtras createViewModelLazy$lambda$0(ar arVar) {
        CreationExtras defaultViewModelCreationExtras = arVar.getDefaultViewModelCreationExtras();
        x.e(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
        return defaultViewModelCreationExtras;
    }

    static final ViewModelProvider.Factory createViewModelLazy$lambda$2(ar arVar) {
        ViewModelProvider.Factory defaultViewModelProviderFactory = arVar.getDefaultViewModelProviderFactory();
        x.e(defaultViewModelProviderFactory, "<get-defaultViewModelProviderFactory>(...)");
        return defaultViewModelProviderFactory;
    }

    public static final /* synthetic */ <VM extends ViewModel> f<VM> viewModels(ar arVar, a<? extends ViewModelStoreOwner> aVar, a<? extends CreationExtras> aVar2, a<? extends ViewModelProvider.Factory> aVar3) {
        x.f(arVar, "<this>");
        x.f(aVar, "ownerProducer");
        f fVarB = g.b(h.f48132c, new FragmentViewModelLazyKt$viewModels$owner$5(aVar));
        x.i();
        int i2 = h.g.b.ar.f48106a;
        m mVar = new m(ViewModel.class);
        C04396 c04396 = new C04396(fVarB);
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(aVar2, fVarB);
        if (aVar3 == null) {
            aVar3 = new AnonymousClass8(arVar, fVarB);
        }
        return createViewModelLazy(arVar, mVar, c04396, anonymousClass7, aVar3);
    }

    public static /* synthetic */ f viewModels$default(final ar arVar, a aVar, a aVar2, a aVar3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = new a<ar>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.viewModels.5
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // h.g.a.a
                public final ar invoke() {
                    return arVar;
                }
            };
        }
        if ((i2 & 2) != 0) {
            aVar2 = null;
        }
        if ((i2 & 4) != 0) {
            aVar3 = null;
        }
        x.f(arVar, "<this>");
        x.f(aVar, "ownerProducer");
        f fVarB = g.b(h.f48132c, new FragmentViewModelLazyKt$viewModels$owner$5(aVar));
        x.i();
        int i3 = h.g.b.ar.f48106a;
        m mVar = new m(ViewModel.class);
        C04396 c04396 = new C04396(fVarB);
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(aVar2, fVarB);
        if (aVar3 == null) {
            aVar3 = new AnonymousClass8(arVar, fVarB);
        }
        return createViewModelLazy(arVar, mVar, c04396, anonymousClass7, aVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: viewModels$lambda-0, reason: not valid java name */
    public static final ViewModelStoreOwner m11912viewModels$lambda0(f<? extends ViewModelStoreOwner> fVar) {
        return fVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: viewModels$lambda-1, reason: not valid java name */
    public static final ViewModelStoreOwner m11913viewModels$lambda1(f<? extends ViewModelStoreOwner> fVar) {
        return fVar.getValue();
    }

    public static /* synthetic */ f createViewModelLazy$default(ar arVar, c cVar, a aVar, a aVar2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            aVar2 = null;
        }
        return createViewModelLazy(arVar, cVar, aVar, aVar2);
    }

    public static final /* synthetic */ f createViewModelLazy(final ar arVar, c cVar, a aVar, a aVar2) {
        x.f(arVar, "<this>");
        x.f(cVar, "viewModelClass");
        x.f(aVar, "storeProducer");
        return createViewModelLazy(arVar, cVar, aVar, new a() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return FragmentViewModelLazyKt.createViewModelLazy$lambda$0(arVar);
            }
        }, aVar2);
    }

    public static final /* synthetic */ <VM extends ViewModel> f<VM> activityViewModels(ar arVar, a<? extends ViewModelProvider.Factory> aVar) {
        x.f(arVar, "<this>");
        x.i();
        int i2 = h.g.b.ar.f48106a;
        m mVar = new m(ViewModel.class);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(arVar);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(arVar);
        if (aVar == null) {
            aVar = new AnonymousClass3(arVar);
        }
        return createViewModelLazy(arVar, mVar, anonymousClass1, anonymousClass2, aVar);
    }

    public static /* synthetic */ f activityViewModels$default(ar arVar, a aVar, int i2, Object obj) {
        x.f(arVar, "<this>");
        x.i();
        int i3 = h.g.b.ar.f48106a;
        m mVar = new m(ViewModel.class);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(arVar);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(arVar);
        if (1 == (i2 & 1)) {
            aVar = null;
        }
        if (aVar == null) {
            aVar = new AnonymousClass3(arVar);
        }
        return createViewModelLazy(arVar, mVar, anonymousClass1, anonymousClass2, aVar);
    }

    public static final /* synthetic */ <VM extends ViewModel> f<VM> viewModels(ar arVar, a<? extends ViewModelStoreOwner> aVar, a<? extends ViewModelProvider.Factory> aVar2) {
        x.f(arVar, "<this>");
        x.f(aVar, "ownerProducer");
        f fVarB = g.b(h.f48132c, new FragmentViewModelLazyKt$viewModels$owner$2(aVar));
        x.i();
        int i2 = h.g.b.ar.f48106a;
        m mVar = new m(ViewModel.class);
        C04352 c04352 = new C04352(fVarB);
        C04363 c04363 = new C04363(fVarB);
        if (aVar2 == null) {
            aVar2 = new C04374(arVar, fVarB);
        }
        return createViewModelLazy(arVar, mVar, c04352, c04363, aVar2);
    }

    public static /* synthetic */ f viewModels$default(final ar arVar, a aVar, a aVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = new a<ar>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.viewModels.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // h.g.a.a
                public final ar invoke() {
                    return arVar;
                }
            };
        }
        if ((i2 & 2) != 0) {
            aVar2 = null;
        }
        x.f(arVar, "<this>");
        x.f(aVar, "ownerProducer");
        f fVarB = g.b(h.f48132c, new FragmentViewModelLazyKt$viewModels$owner$2(aVar));
        x.i();
        int i3 = h.g.b.ar.f48106a;
        m mVar = new m(ViewModel.class);
        C04352 c04352 = new C04352(fVarB);
        C04363 c04363 = new C04363(fVarB);
        if (aVar2 == null) {
            aVar2 = new C04374(arVar, fVarB);
        }
        return createViewModelLazy(arVar, mVar, c04352, c04363, aVar2);
    }
}
