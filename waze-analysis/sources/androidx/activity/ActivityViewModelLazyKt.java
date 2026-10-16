package androidx.activity;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import h.f;
import h.g.a.a;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ActivityViewModelLazyKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$1, reason: invalid class name */
    public final class AnonymousClass1 implements a<ViewModelStore> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        public AnonymousClass1(ComponentActivity componentActivity) {
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$2, reason: invalid class name */
    public final class AnonymousClass2 implements a<CreationExtras> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        public AnonymousClass2(ComponentActivity componentActivity) {
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final CreationExtras invoke() {
            return this.$this_viewModels.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$3, reason: invalid class name */
    public final class AnonymousClass3 implements a<ViewModelStore> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        public AnonymousClass3(ComponentActivity componentActivity) {
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$4, reason: invalid class name */
    public final class AnonymousClass4 implements a<CreationExtras> {
        final /* synthetic */ a<CreationExtras> $extrasProducer;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(a<? extends CreationExtras> aVar, ComponentActivity componentActivity) {
            this.$extrasProducer = aVar;
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final CreationExtras invoke() {
            CreationExtras creationExtrasInvoke;
            a<CreationExtras> aVar = this.$extrasProducer;
            return (aVar == null || (creationExtrasInvoke = aVar.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : creationExtrasInvoke;
        }
    }

    public static final /* synthetic */ <VM extends ViewModel> f<VM> viewModels(ComponentActivity componentActivity, a<? extends ViewModelProvider.Factory> aVar) {
        x.f(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        x.i();
        int i2 = ar.f48106a;
        return new ViewModelLazy(new m(ViewModel.class), new AnonymousClass1(componentActivity), aVar, new AnonymousClass2(componentActivity));
    }

    public static /* synthetic */ f viewModels$default(ComponentActivity componentActivity, a aVar, a aVar2, int i2, Object obj) {
        x.f(componentActivity, "<this>");
        if ((i2 & 2) != 0) {
            aVar2 = null;
        }
        if (aVar2 == null) {
            aVar2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        if (1 == (i2 & 1)) {
            aVar = null;
        }
        x.i();
        int i3 = ar.f48106a;
        return new ViewModelLazy(new m(ViewModel.class), new AnonymousClass3(componentActivity), aVar2, new AnonymousClass4(aVar, componentActivity));
    }

    public static final /* synthetic */ <VM extends ViewModel> f<VM> viewModels(ComponentActivity componentActivity, a<? extends CreationExtras> aVar, a<? extends ViewModelProvider.Factory> aVar2) {
        x.f(componentActivity, "<this>");
        if (aVar2 == null) {
            aVar2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        x.i();
        int i2 = ar.f48106a;
        return new ViewModelLazy(new m(ViewModel.class), new AnonymousClass3(componentActivity), aVar2, new AnonymousClass4(aVar, componentActivity));
    }

    public static /* synthetic */ f viewModels$default(ComponentActivity componentActivity, a aVar, int i2, Object obj) {
        x.f(componentActivity, "<this>");
        if (1 == (i2 & 1)) {
            aVar = null;
        }
        if (aVar == null) {
            aVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        x.i();
        int i3 = ar.f48106a;
        return new ViewModelLazy(new m(ViewModel.class), new AnonymousClass1(componentActivity), aVar, new AnonymousClass2(componentActivity));
    }
}
