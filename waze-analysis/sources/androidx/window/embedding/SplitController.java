package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.embedding.SplitController;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.a.ad;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SplitController {
    public static final Companion Companion = new Companion(null);
    public static final boolean sDebug = false;
    private final EmbeddingBackend embeddingBackend;

    public SplitController(EmbeddingBackend embeddingBackend) {
        x.f(embeddingBackend, "embeddingBackend");
        this.embeddingBackend = embeddingBackend;
    }

    public static final SplitController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public final void clearSplitAttributesCalculator() {
        this.embeddingBackend.clearSplitAttributesCalculator();
    }

    public final SplitSupportStatus getSplitSupportStatus() {
        return this.embeddingBackend.getSplitSupportStatus();
    }

    public final boolean pinTopActivityStack(int i2, SplitPinRule splitPinRule) {
        x.f(splitPinRule, "splitPinRule");
        return this.embeddingBackend.pinTopActivityStack(i2, splitPinRule);
    }

    public final void setSplitAttributesCalculator(l<? super SplitAttributesCalculatorParams, SplitAttributes> lVar) {
        x.f(lVar, "calculator");
        this.embeddingBackend.setSplitAttributesCalculator(lVar);
    }

    public final k<List<SplitInfo>> splitInfoList(Activity activity) {
        x.f(activity, "activity");
        return ai.n(new AnonymousClass1(activity, null));
    }

    public final void unpinTopActivityStack(int i2) {
        this.embeddingBackend.unpinTopActivityStack(i2);
    }

    public final void updateSplitAttributes(SplitInfo splitInfo, SplitAttributes splitAttributes) {
        x.f(splitInfo, "splitInfo");
        x.f(splitAttributes, "splitAttributes");
        this.embeddingBackend.updateSplitAttributes(splitInfo, splitAttributes);
    }

    /* compiled from: WazeSource */
    public final class SplitSupportStatus {
        private final int rawValue;
        public static final Companion Companion = new Companion(null);
        public static final SplitSupportStatus SPLIT_AVAILABLE = new SplitSupportStatus(0);
        public static final SplitSupportStatus SPLIT_UNAVAILABLE = new SplitSupportStatus(1);
        public static final SplitSupportStatus SPLIT_ERROR_PROPERTY_NOT_DECLARED = new SplitSupportStatus(2);

        private SplitSupportStatus(int i2) {
            this.rawValue = i2;
        }

        public String toString() {
            int i2 = this.rawValue;
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? "UNKNOWN" : "SplitSupportStatus: ERROR_SPLIT_PROPERTY_NOT_DECLARED" : "SplitSupportStatus: UNAVAILABLE" : "SplitSupportStatus: AVAILABLE";
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final SplitController getInstance(Context context) {
            x.f(context, "context");
            return new SplitController(EmbeddingBackend.Companion.getInstance(context));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.window.embedding.SplitController$splitInfoList$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<ad<? super List<? extends SplitInfo>>, e<? super ab>, Object> {
        final /* synthetic */ Activity $activity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Activity activity, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$activity = activity;
        }

        static final ab invokeSuspend$lambda$1(SplitController splitController, Consumer consumer) {
            splitController.embeddingBackend.removeSplitListenerForActivity(consumer);
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = SplitController.this.new AnonymousClass1(this.$activity, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ad<? super List<SplitInfo>> adVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(adVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final ad adVar = (ad) this.L$0;
                final Consumer<List<SplitInfo>> consumer = new Consumer() { // from class: androidx.window.embedding.SplitController$splitInfoList$1$$ExternalSyntheticLambda0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj2) {
                        adVar.i((List) obj2);
                    }
                };
                SplitController splitController = SplitController.this;
                splitController.embeddingBackend.addSplitListenerForActivity(this.$activity, new Executor() { // from class: androidx.window.embedding.SplitController$splitInfoList$1$$ExternalSyntheticLambda1
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, consumer);
                final SplitController splitController2 = SplitController.this;
                this.label = 1;
                if (kotlinx.coroutines.a.ab.a(adVar, new h.g.a.a() { // from class: androidx.window.embedding.SplitController$splitInfoList$1$$ExternalSyntheticLambda2
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return SplitController.AnonymousClass1.invokeSuspend$lambda$1(splitController2, consumer);
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
            return ab.f48028a;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(ad<? super List<? extends SplitInfo>> adVar, e<? super ab> eVar) {
            return invoke2((ad<? super List<SplitInfo>>) adVar, eVar);
        }
    }
}
