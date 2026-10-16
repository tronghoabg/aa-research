package androidx.navigation;

import android.support.v4.app.ar;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.m;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NavGraphViewModelLazyKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$1, reason: invalid class name */
    public final class AnonymousClass1 implements a<CreationExtras> {
        final /* synthetic */ f<NavBackStackEntry> $backStackEntry$delegate;

        public AnonymousClass1(f<NavBackStackEntry> fVar) {
            this.$backStackEntry$delegate = fVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final CreationExtras invoke() {
            return NavGraphViewModelLazyKt.m13218navGraphViewModels$lambda0(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$2, reason: invalid class name */
    public final class AnonymousClass2 implements a<ViewModelProvider.Factory> {
        final /* synthetic */ f<NavBackStackEntry> $backStackEntry$delegate;

        public AnonymousClass2(f<NavBackStackEntry> fVar) {
            this.$backStackEntry$delegate = fVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m13218navGraphViewModels$lambda0(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$3, reason: invalid class name */
    public final class AnonymousClass3 implements a<CreationExtras> {
        final /* synthetic */ f<NavBackStackEntry> $backStackEntry$delegate;
        final /* synthetic */ a<CreationExtras> $extrasProducer;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(a<? extends CreationExtras> aVar, f<NavBackStackEntry> fVar) {
            this.$extrasProducer = aVar;
            this.$backStackEntry$delegate = fVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final CreationExtras invoke() {
            CreationExtras creationExtrasInvoke;
            a<CreationExtras> aVar = this.$extrasProducer;
            return (aVar == null || (creationExtrasInvoke = aVar.invoke()) == null) ? NavGraphViewModelLazyKt.m13219navGraphViewModels$lambda1(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras() : creationExtrasInvoke;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$4, reason: invalid class name */
    public final class AnonymousClass4 implements a<ViewModelProvider.Factory> {
        final /* synthetic */ f<NavBackStackEntry> $backStackEntry$delegate;

        public AnonymousClass4(f<NavBackStackEntry> fVar) {
            this.$backStackEntry$delegate = fVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m13219navGraphViewModels$lambda1(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$5, reason: invalid class name */
    public final class AnonymousClass5 implements a<CreationExtras> {
        final /* synthetic */ f<NavBackStackEntry> $backStackEntry$delegate;

        public AnonymousClass5(f<NavBackStackEntry> fVar) {
            this.$backStackEntry$delegate = fVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final CreationExtras invoke() {
            return NavGraphViewModelLazyKt.m13220navGraphViewModels$lambda2(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$6, reason: invalid class name */
    public final class AnonymousClass6 implements a<ViewModelProvider.Factory> {
        final /* synthetic */ f<NavBackStackEntry> $backStackEntry$delegate;

        public AnonymousClass6(f<NavBackStackEntry> fVar) {
            this.$backStackEntry$delegate = fVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m13220navGraphViewModels$lambda2(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$7, reason: invalid class name */
    public final class AnonymousClass7 implements a<CreationExtras> {
        final /* synthetic */ f<NavBackStackEntry> $backStackEntry$delegate;
        final /* synthetic */ a<CreationExtras> $extrasProducer;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(a<? extends CreationExtras> aVar, f<NavBackStackEntry> fVar) {
            this.$extrasProducer = aVar;
            this.$backStackEntry$delegate = fVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final CreationExtras invoke() {
            CreationExtras creationExtrasInvoke;
            a<CreationExtras> aVar = this.$extrasProducer;
            return (aVar == null || (creationExtrasInvoke = aVar.invoke()) == null) ? NavGraphViewModelLazyKt.m13221navGraphViewModels$lambda3(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras() : creationExtrasInvoke;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$8, reason: invalid class name */
    public final class AnonymousClass8 implements a<ViewModelProvider.Factory> {
        final /* synthetic */ f<NavBackStackEntry> $backStackEntry$delegate;

        public AnonymousClass8(f<NavBackStackEntry> fVar) {
            this.$backStackEntry$delegate = fVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m13221navGraphViewModels$lambda3(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    public static final /* synthetic */ <VM extends ViewModel> f<VM> navGraphViewModels(ar arVar, String str, a<? extends CreationExtras> aVar, a<? extends ViewModelProvider.Factory> aVar2) {
        x.f(arVar, "<this>");
        x.f(str, "navGraphRoute");
        f fVarA = g.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$11(arVar, str));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(fVarA);
        x.i();
        int i2 = h.g.b.ar.f48106a;
        m mVar = new m(ViewModel.class);
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(aVar, fVarA);
        if (aVar2 == null) {
            aVar2 = new AnonymousClass8(fVarA);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(arVar, mVar, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4, anonymousClass7, aVar2);
    }

    public static /* synthetic */ f navGraphViewModels$default(ar arVar, String str, a aVar, a aVar2, int i2, Object obj) {
        x.f(arVar, "<this>");
        x.f(str, "navGraphRoute");
        f fVarA = g.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$11(arVar, str));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(fVarA);
        x.i();
        int i3 = h.g.b.ar.f48106a;
        m mVar = new m(ViewModel.class);
        if ((i2 & 2) != 0) {
            aVar = null;
        }
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(aVar, fVarA);
        if ((i2 & 4) != 0) {
            aVar2 = null;
        }
        if (aVar2 == null) {
            aVar2 = new AnonymousClass8(fVarA);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(arVar, mVar, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4, anonymousClass7, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-0, reason: not valid java name */
    public static final NavBackStackEntry m13218navGraphViewModels$lambda0(f<NavBackStackEntry> fVar) {
        return fVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-1, reason: not valid java name */
    public static final NavBackStackEntry m13219navGraphViewModels$lambda1(f<NavBackStackEntry> fVar) {
        return fVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-2, reason: not valid java name */
    public static final NavBackStackEntry m13220navGraphViewModels$lambda2(f<NavBackStackEntry> fVar) {
        return fVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-3, reason: not valid java name */
    public static final NavBackStackEntry m13221navGraphViewModels$lambda3(f<NavBackStackEntry> fVar) {
        return fVar.getValue();
    }

    public static final /* synthetic */ <VM extends ViewModel> f<VM> navGraphViewModels(ar arVar, int i2, a<? extends CreationExtras> aVar, a<? extends ViewModelProvider.Factory> aVar2) {
        x.f(arVar, "<this>");
        f fVarA = g.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$5(arVar, i2));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(fVarA);
        x.i();
        int i3 = h.g.b.ar.f48106a;
        m mVar = new m(ViewModel.class);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(aVar, fVarA);
        if (aVar2 == null) {
            aVar2 = new AnonymousClass4(fVarA);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(arVar, mVar, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, anonymousClass3, aVar2);
    }

    public static final /* synthetic */ <VM extends ViewModel> f<VM> navGraphViewModels(ar arVar, String str, a<? extends ViewModelProvider.Factory> aVar) {
        x.f(arVar, "<this>");
        x.f(str, "navGraphRoute");
        f fVarA = g.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(arVar, str));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(fVarA);
        x.i();
        int i2 = h.g.b.ar.f48106a;
        m mVar = new m(ViewModel.class);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(fVarA);
        if (aVar == null) {
            aVar = new AnonymousClass6(fVarA);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(arVar, mVar, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3, anonymousClass5, aVar);
    }

    public static /* synthetic */ f navGraphViewModels$default(ar arVar, int i2, a aVar, a aVar2, int i3, Object obj) {
        x.f(arVar, "<this>");
        f fVarA = g.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$5(arVar, i2));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(fVarA);
        x.i();
        int i4 = h.g.b.ar.f48106a;
        m mVar = new m(ViewModel.class);
        if ((i3 & 2) != 0) {
            aVar = null;
        }
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(aVar, fVarA);
        if ((i3 & 4) != 0) {
            aVar2 = null;
        }
        if (aVar2 == null) {
            aVar2 = new AnonymousClass4(fVarA);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(arVar, mVar, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, anonymousClass3, aVar2);
    }

    public static final /* synthetic */ <VM extends ViewModel> f<VM> navGraphViewModels(ar arVar, int i2, a<? extends ViewModelProvider.Factory> aVar) {
        x.f(arVar, "<this>");
        f fVarA = g.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(arVar, i2));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(fVarA);
        x.i();
        int i3 = h.g.b.ar.f48106a;
        m mVar = new m(ViewModel.class);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(fVarA);
        if (aVar == null) {
            aVar = new AnonymousClass2(fVarA);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(arVar, mVar, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, anonymousClass1, aVar);
    }

    public static /* synthetic */ f navGraphViewModels$default(ar arVar, String str, a aVar, int i2, Object obj) {
        x.f(arVar, "<this>");
        x.f(str, "navGraphRoute");
        f fVarA = g.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(arVar, str));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(fVarA);
        x.i();
        int i3 = h.g.b.ar.f48106a;
        m mVar = new m(ViewModel.class);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(fVarA);
        if ((i2 & 2) != 0) {
            aVar = null;
        }
        if (aVar == null) {
            aVar = new AnonymousClass6(fVarA);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(arVar, mVar, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3, anonymousClass5, aVar);
    }

    public static /* synthetic */ f navGraphViewModels$default(ar arVar, int i2, a aVar, int i3, Object obj) {
        x.f(arVar, "<this>");
        f fVarA = g.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(arVar, i2));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(fVarA);
        x.i();
        int i4 = h.g.b.ar.f48106a;
        m mVar = new m(ViewModel.class);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(fVarA);
        if ((i3 & 2) != 0) {
            aVar = null;
        }
        if (aVar == null) {
            aVar = new AnonymousClass2(fVarA);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(arVar, mVar, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, anonymousClass1, aVar);
    }
}
