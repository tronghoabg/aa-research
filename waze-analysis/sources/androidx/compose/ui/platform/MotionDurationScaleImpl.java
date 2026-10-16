package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.MotionDurationScale;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.c.h;
import h.c.i;
import h.c.j;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.l;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MotionDurationScaleImpl implements MotionDurationScale {
    private final MutableFloatState _scaleFactor$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
    private final Context applicationContext;
    private af coroutineScope;
    private br job;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.MotionDurationScaleImpl$startObservingSystemScaleFactor$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ ch<Float> $durationScaleStateFlow;
        int label;
        final /* synthetic */ MotionDurationScaleImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ch<Float> chVar, MotionDurationScaleImpl motionDurationScaleImpl, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$durationScaleStateFlow = chVar;
            this.this$0 = motionDurationScaleImpl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$durationScaleStateFlow, this.this$0, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                ch<Float> chVar = this.$durationScaleStateFlow;
                final MotionDurationScaleImpl motionDurationScaleImpl = this.this$0;
                this.label = 1;
                if (chVar.collect(new l() { // from class: androidx.compose.ui.platform.MotionDurationScaleImpl.startObservingSystemScaleFactor.1.1
                    @Override // kotlinx.coroutines.b.l
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                        return emit(((Number) obj2).floatValue(), (e<? super ab>) eVar);
                    }

                    public final Object emit(float f2, e<? super ab> eVar) {
                        motionDurationScaleImpl.set_scaleFactor(f2);
                        return ab.f48028a;
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            throw new h.e();
        }
    }

    public MotionDurationScaleImpl(Context context) {
        this.applicationContext = context;
    }

    private final float get_scaleFactor() {
        return this._scaleFactor$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_scaleFactor(float f2) {
        this._scaleFactor$delegate.setFloatValue(f2);
    }

    private final br startObservingSystemScaleFactor() {
        ch animationScaleFlowFor = WindowRecomposer_androidKt.getAnimationScaleFlowFor(this.applicationContext);
        set_scaleFactor(((Number) animationScaleFlowFor.d()).floatValue());
        af afVar = this.coroutineScope;
        if (afVar != null) {
            return aj.z(afVar, null, null, new AnonymousClass1(animationScaleFlowFor, this, null), 3);
        }
        throw new IllegalStateException("MotionDurationScale scale factor requested before recomposer loop start");
    }

    @Override // h.c.j
    public /* bridge */ <R> R fold(R r, p<? super R, ? super h, ? extends R> pVar) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r, pVar);
    }

    @Override // h.c.h, h.c.j
    public /* bridge */ <E extends h> E get(i<E> iVar) {
        return (E) MotionDurationScale.DefaultImpls.get(this, iVar);
    }

    public final af getCoroutineScope() {
        return this.coroutineScope;
    }

    public final br getJob() {
        return this.job;
    }

    @Override // androidx.compose.ui.MotionDurationScale, h.c.h
    public /* synthetic */ i getKey() {
        return MotionDurationScale.Key;
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public float getScaleFactor() {
        if (this.job == null) {
            this.job = startObservingSystemScaleFactor();
        }
        return get_scaleFactor();
    }

    @Override // h.c.j
    public /* bridge */ j minusKey(i<?> iVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, iVar);
    }

    @Override // h.c.j
    public /* bridge */ j plus(j jVar) {
        return MotionDurationScale.DefaultImpls.plus(this, jVar);
    }

    public final void setCoroutineScope(af afVar) {
        this.coroutineScope = afVar;
    }

    public final void setJob(br brVar) {
        this.job = brVar;
    }
}
