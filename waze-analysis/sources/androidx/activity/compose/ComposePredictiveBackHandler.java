package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.compose.internal.BackHandlerCompat;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.q;
import h.g.b.am;
import h.g.b.w;
import h.g.b.x;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ComposePredictiveBackHandler extends BackHandlerCompat {
    private o<BackEventCompat> activeChannel;
    private br activeJob;
    private p<? super k<BackEventCompat>, ? super e<? super ab>, ? extends Object> currentOnBack;
    private boolean isPredictiveBack;
    private final af scope;

    /* compiled from: WazeSource */
    /* renamed from: androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1, reason: invalid class name and collision with other inner class name */
        final class C00001 extends g implements q<l<? super BackEventCompat>, Throwable, e<? super ab>, Object> {
            final /* synthetic */ am $completed;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00001(am amVar, e<? super C00001> eVar) {
                super(3, eVar);
                this.$completed = amVar;
            }

            @Override // h.g.a.q
            public final Object invoke(l<? super BackEventCompat> lVar, Throwable th, e<? super ab> eVar) {
                return new C00001(this.$completed, eVar).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f48038a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                this.$completed.f48101a = true;
                return ab.f48028a;
            }
        }

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return ComposePredictiveBackHandler.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            am amVar;
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                if (ComposePredictiveBackHandler.this.isBackEnabled()) {
                    am amVar2 = new am();
                    ComposePredictiveBackHandler composePredictiveBackHandler = ComposePredictiveBackHandler.this;
                    p<k<BackEventCompat>, e<? super ab>, Object> currentOnBack = composePredictiveBackHandler.getCurrentOnBack();
                    o oVar = composePredictiveBackHandler.activeChannel;
                    x.c(oVar);
                    k<BackEventCompat> kVarJ = ai.J(ai.v(oVar), new C00001(amVar2, null));
                    this.L$0 = amVar2;
                    this.label = 1;
                    if (currentOnBack.invoke(kVarJ, this) == aVar) {
                        return aVar;
                    }
                    amVar = amVar2;
                }
                return ab.f48028a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            amVar = (am) this.L$0;
            c.b(obj);
            if (!amVar.f48101a) {
                throw new IllegalStateException("You must collect the progress flow");
            }
            return ab.f48028a;
        }
    }

    public ComposePredictiveBackHandler(af afVar, PredictiveBackHandlerInfo predictiveBackHandlerInfo) {
        super(predictiveBackHandlerInfo);
        this.scope = afVar;
        this.currentOnBack = new ComposePredictiveBackHandler$currentOnBack$1(null);
    }

    private final void launchNewGesture() {
        this.activeChannel = w.c(-2, kotlinx.coroutines.a.a.f51271a, null, 4);
        this.activeJob = aj.z(this.scope, null, null, new AnonymousClass1(null), 3);
    }

    public final p<k<BackEventCompat>, e<? super ab>, Object> getCurrentOnBack() {
        return this.currentOnBack;
    }

    public final af getScope() {
        return this.scope;
    }

    @Override // androidx.activity.compose.internal.BackHandlerCompat
    public boolean isBackEnabled() {
        return super.isBackEnabled();
    }

    @Override // androidx.activity.compose.internal.BackHandlerCompat
    public void onBackCancelled() {
        o<BackEventCompat> oVar = this.activeChannel;
        if (oVar != null) {
            oVar.s(new CancellationException("onBack cancelled"));
        }
        br brVar = this.activeJob;
        if (brVar != null) {
            brVar.s(null);
        }
        this.activeChannel = null;
        this.activeJob = null;
        this.isPredictiveBack = false;
    }

    @Override // androidx.activity.compose.internal.BackHandlerCompat
    public void onBackCompleted() {
        if (this.activeChannel != null && !this.isPredictiveBack) {
            onBackCancelled();
        }
        if (this.activeChannel == null) {
            this.isPredictiveBack = false;
            launchNewGesture();
        }
        o<BackEventCompat> oVar = this.activeChannel;
        if (oVar != null) {
            oVar.v(null);
        }
        this.isPredictiveBack = false;
    }

    @Override // androidx.activity.compose.internal.BackHandlerCompat
    public void onBackProgressed(BackEventCompat backEventCompat) {
        o<BackEventCompat> oVar = this.activeChannel;
        if (oVar != null) {
            oVar.i(backEventCompat);
        }
    }

    @Override // androidx.activity.compose.internal.BackHandlerCompat
    public void onBackStarted(BackEventCompat backEventCompat) {
        onBackCancelled();
        if (isBackEnabled()) {
            this.isPredictiveBack = true;
            launchNewGesture();
        }
    }

    @Override // androidx.activity.compose.internal.BackHandlerCompat
    public void setBackEnabled(boolean z) {
        br brVar;
        if (!z && super.isBackEnabled() && (brVar = this.activeJob) != null && !brVar.bZ()) {
            onBackCancelled();
        }
        super.setBackEnabled(z);
    }

    public final void setCurrentOnBack(p<? super k<BackEventCompat>, ? super e<? super ab>, ? extends Object> pVar) {
        this.currentOnBack = pVar;
    }
}
