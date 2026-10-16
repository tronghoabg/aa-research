package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.config.UseCaseCameraScope;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import e.b.c;
import g.a.a;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
@UseCaseCameraScope
/* loaded from: classes2.dex */
public final class DeferredUseCaseCameraRequestControl implements UseCaseCameraRequestControl {
    private volatile UseCaseCameraRequestControlImpl impl;
    private final a<UseCaseCameraRequestControlImpl> implProvider;
    private final AtomicBoolean isClosed;
    private final UseCaseThreads threads;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$runOnSequential$2, reason: invalid class name */
    public final class AnonymousClass2 extends g implements p<af, e, Object> {
        final /* synthetic */ l<UseCaseCameraRequestControl, am> $action;
        int label;
        final /* synthetic */ DeferredUseCaseCameraRequestControl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(l<? super UseCaseCameraRequestControl, ? extends am> lVar, DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$action = lVar;
            this.this$0 = deferredUseCaseCameraRequestControl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(this.$action, this.this$0, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return obj;
            }
            c.b(obj);
            this.label = 1;
            Object objC = this.$action.invoke(this.this$0.getOrCreateImpl()).c(this);
            return objC == aVar ? aVar : objC;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            return this.$action.invoke(this.this$0.getOrCreateImpl()).c(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$runOnSequentialSuspend$3, reason: invalid class name */
    public final class AnonymousClass3 extends g implements p<af, e, Object> {
        final /* synthetic */ p<UseCaseCameraRequestControl, e, Object> $action;
        int label;
        final /* synthetic */ DeferredUseCaseCameraRequestControl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(p<? super UseCaseCameraRequestControl, ? super e, ? extends Object> pVar, DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl, e<? super AnonymousClass3> eVar) {
            super(2, eVar);
            this.$action = pVar;
            this.this$0 = deferredUseCaseCameraRequestControl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass3(this.$action, this.this$0, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass3) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return obj;
            }
            c.b(obj);
            p<UseCaseCameraRequestControl, e, Object> pVar = this.$action;
            UseCaseCameraRequestControlImpl orCreateImpl = this.this$0.getOrCreateImpl();
            this.label = 1;
            Object objInvoke = pVar.invoke(orCreateImpl, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            return this.$action.invoke(this.this$0.getOrCreateImpl(), this);
        }
    }

    public DeferredUseCaseCameraRequestControl(a<UseCaseCameraRequestControlImpl> aVar, UseCaseThreads useCaseThreads) {
        x.f(aVar, "implProvider");
        x.f(useCaseThreads, "threads");
        this.implProvider = aVar;
        this.threads = useCaseThreads;
        this.isClosed = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UseCaseCameraRequestControlImpl getOrCreateImpl() {
        if (this.isClosed.get()) {
            throw new CancellationException("UseCaseCameraRequestControl is closed");
        }
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        if (useCaseCameraRequestControlImpl != null) {
            return useCaseCameraRequestControlImpl;
        }
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl2 = this.implProvider.get();
        if (this.isClosed.get()) {
            useCaseCameraRequestControlImpl2.close();
            throw new CancellationException("UseCaseCameraRequestControl closed during initialization");
        }
        this.impl = useCaseCameraRequestControlImpl2;
        x.c(useCaseCameraRequestControlImpl2);
        return useCaseCameraRequestControlImpl2;
    }

    private final <T> am<T> runOnSequential(l<? super UseCaseCameraRequestControl, ? extends am<? extends T>> lVar) {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? lVar.invoke(useCaseCameraRequestControlImpl) : aj.y(this.threads.getSequentialScope(), null, null, new AnonymousClass2(lVar, this, null), 3);
    }

    private final <T> List<am<T>> runOnSequentialList(int i2, l<? super UseCaseCameraRequestControl, ? extends List<? extends am<? extends T>>> lVar) {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        if (useCaseCameraRequestControlImpl != null) {
            return lVar.invoke(useCaseCameraRequestControlImpl);
        }
        am amVarY = aj.y(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$runOnSequentialList$submissionJob$1(lVar, this, null), 3);
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(aj.y(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$runOnSequentialList$2$1(amVarY, i3, null), 3));
        }
        return arrayList;
    }

    private final <T> Object runOnSequentialSuspend(p<? super UseCaseCameraRequestControl, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar) {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? pVar.invoke(useCaseCameraRequestControlImpl, null) : aj.v(bo.f(this.threads.getSequentialExecutor()), new AnonymousClass3(pVar, this, null), eVar);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public Object awaitSurfaceSetup(e<? super Boolean> eVar) {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.awaitSurfaceSetup(eVar) : aj.v(bo.f(this.threads.getSequentialExecutor()), new DeferredUseCaseCameraRequestControl$awaitSurfaceSetup$$inlined$runOnSequentialSuspend$1(this, null), eVar);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public am<Result3A> cancelFocusAndMeteringAsync() {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.cancelFocusAndMeteringAsync() : aj.y(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$cancelFocusAndMeteringAsync$$inlined$runOnSequential$1(this, null), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public void close() {
        if (this.isClosed.getAndSet(true)) {
            return;
        }
        aj.z(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$close$$inlined$confineLaunch$1(null, this), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public List<am<Void>> issueSingleCaptureAsync(List<CaptureConfig> list, int i2, int i3, int i4) {
        x.f(list, "captureSequence");
        int size = list.size();
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        if (useCaseCameraRequestControlImpl != null) {
            return useCaseCameraRequestControlImpl.issueSingleCaptureAsync(list, i2, i3, i4);
        }
        am amVarY = aj.y(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$issueSingleCaptureAsync$$inlined$runOnSequentialList$1(this, null, list, i2, i3, i4), 3);
        ArrayList arrayList = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(aj.y(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$runOnSequentialList$2$1(amVarY, i5, null), 3));
        }
        return arrayList;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public am<ab> removeParametersAsync(List<? extends CaptureRequest.Key<?>> list, UseCaseCameraRequestControl.Type type) {
        x.f(list, "keys");
        x.f(type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.removeParametersAsync(list, type) : aj.y(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$removeParametersAsync$$inlined$runOnSequential$1(this, null, list, type), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public am<ab> setParametersAsync(Map<CaptureRequest.Key<?>, ? extends Object> map, UseCaseCameraRequestControl.Type type, Config.OptionPriority optionPriority) {
        x.f(map, "values");
        x.f(type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(optionPriority, "optionPriority");
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.setParametersAsync(map, type, optionPriority) : aj.y(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$setParametersAsync$$inlined$runOnSequential$1(this, null, map, type, optionPriority), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    /* renamed from: setTorchOffAsync-MtizInI, reason: not valid java name */
    public am<Result3A> mo253setTorchOffAsyncMtizInI(int i2) {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.mo253setTorchOffAsyncMtizInI(i2) : aj.y(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$setTorchOffAsyncMtizInI$$inlined$runOnSequential$1(this, null, i2), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public am<Result3A> setTorchOnAsync() {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.setTorchOnAsync() : aj.y(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$setTorchOnAsync$$inlined$runOnSequential$1(this, null), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    /* renamed from: startFocusAndMeteringAsync-HEKfQLs, reason: not valid java name */
    public am<Result3A> mo254startFocusAndMeteringAsyncHEKfQLs(List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode, long j2, l<? super FrameMetadata, Boolean> lVar) {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.mo254startFocusAndMeteringAsyncHEKfQLs(list, list2, list3, lock3ABehavior, lock3ABehavior2, lock3ABehavior3, aeMode, j2, lVar) : aj.y(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$startFocusAndMeteringAsyncHEKfQLs$$inlined$runOnSequential$1(this, null, list, list2, list3, lock3ABehavior, lock3ABehavior2, lock3ABehavior3, aeMode, j2, lVar), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public am<ab> submitParameters(Map<CaptureRequest.Key<?>, ? extends Object> map, UseCaseCameraRequestControl.Type type, Config.OptionPriority optionPriority) {
        x.f(map, "values");
        x.f(type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(optionPriority, "optionPriority");
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.submitParameters(map, type, optionPriority) : aj.y(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$submitParameters$$inlined$runOnSequential$1(this, null, map, type, optionPriority), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public am<Result3A> update3aRegions(List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3) {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.update3aRegions(list, list2, list3) : aj.y(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$update3aRegions$$inlined$runOnSequential$1(this, null, list, list2, list3), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public am<ab> updateCamera2ConfigAsync(Config config, Map<String, ? extends Object> map) {
        x.f(config, "config");
        x.f(map, "tags");
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.updateCamera2ConfigAsync(config, map) : aj.y(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$updateCamera2ConfigAsync$$inlined$runOnSequential$1(this, null, config, map), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public am<ab> updateRepeatingRequestAsync(boolean z, Collection<? extends UseCase> collection) {
        x.f(collection, "runningUseCases");
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.updateRepeatingRequestAsync(z, collection) : aj.y(this.threads.getSequentialScope(), null, null, new DeferredUseCaseCameraRequestControl$updateRepeatingRequestAsync$$inlined$runOnSequential$1(this, null, z, collection), 3);
    }
}
