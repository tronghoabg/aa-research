package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Constraints;
import h.ab;
import h.g.a.a;
import h.g.a.q;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class InvalidationStrategy {
    private final q<InvalidationStrategySpecification, Constraints, Constraints, Boolean> onIncomingConstraints;
    private final a<ab> onObservedStateChange;
    private final InvalidationStrategySpecification scope;
    private final ShouldInvalidateCallback shouldInvalidate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InvalidationStrategy DefaultInvalidationStrategy = new InvalidationStrategy(null, null);

    /* JADX WARN: Multi-variable type inference failed */
    public InvalidationStrategy(q<? super InvalidationStrategySpecification, ? super Constraints, ? super Constraints, Boolean> qVar, a<ab> aVar) {
        this.onIncomingConstraints = qVar;
        this.onObservedStateChange = aVar;
        this.scope = new InvalidationStrategySpecification();
        this.shouldInvalidate = qVar == 0 ? null : new ShouldInvalidateCallback() { // from class: androidx.constraintlayout.compose.InvalidationStrategy$shouldInvalidate$1$1
            @Override // androidx.constraintlayout.compose.ShouldInvalidateCallback
            /* renamed from: invoke-N9IONVI, reason: not valid java name */
            public final boolean mo11546invokeN9IONVI(long j2, long j3) {
                InvalidationStrategy invalidationStrategy = this.this$0;
                return invalidationStrategy.getOnIncomingConstraints().invoke(invalidationStrategy.scope, Constraints.m11094boximpl(j2), Constraints.m11094boximpl(j3)).booleanValue();
            }
        };
    }

    public final q<InvalidationStrategySpecification, Constraints, Constraints, Boolean> getOnIncomingConstraints() {
        return this.onIncomingConstraints;
    }

    public final a<ab> getOnObservedStateChange() {
        return this.onObservedStateChange;
    }

    public final ShouldInvalidateCallback getShouldInvalidate$constraintlayout_compose() {
        return this.shouldInvalidate;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final InvalidationStrategy getDefaultInvalidationStrategy() {
            return InvalidationStrategy.DefaultInvalidationStrategy;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ InvalidationStrategy(q qVar, a aVar, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : qVar, aVar);
    }
}
