package androidx.compose.material;

import androidx.compose.material.DismissState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import h.ab;
import h.c.a.a;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DismissState extends SwipeableState<DismissValue> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public /* synthetic */ DismissState(DismissValue dismissValue, l lVar, int i2, o oVar) {
        this(dismissValue, (i2 & 2) != 0 ? new l() { // from class: androidx.compose.material.DismissState$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return true;
            }
        } : lVar);
    }

    static final boolean _init_$lambda$0(DismissValue dismissValue) {
        return true;
    }

    public final Object dismiss(DismissDirection dismissDirection, e<? super ab> eVar) {
        Object objAnimateTo$default = SwipeableState.animateTo$default(this, dismissDirection == DismissDirection.StartToEnd ? DismissValue.DismissedToEnd : DismissValue.DismissedToStart, null, eVar, 2, null);
        return objAnimateTo$default == a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    public final DismissDirection getDismissDirection() {
        if (getOffset().getValue().floatValue() == 0.0f) {
            return null;
        }
        return getOffset().getValue().floatValue() > 0.0f ? DismissDirection.StartToEnd : DismissDirection.EndToStart;
    }

    public final boolean isDismissed(DismissDirection dismissDirection) {
        return getCurrentValue() == (dismissDirection == DismissDirection.StartToEnd ? DismissValue.DismissedToEnd : DismissValue.DismissedToStart);
    }

    public final Object reset(e<? super ab> eVar) {
        Object objAnimateTo$default = SwipeableState.animateTo$default(this, DismissValue.Default, null, eVar, 2, null);
        return objAnimateTo$default == a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final DismissState Saver$lambda$1(l lVar, DismissValue dismissValue) {
            return new DismissState(dismissValue, lVar);
        }

        public final Saver<DismissState, DismissValue> Saver(final l<? super DismissValue, Boolean> lVar) {
            return SaverKt.Saver(new p() { // from class: androidx.compose.material.DismissState$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((DismissState) obj2).getCurrentValue();
                }
            }, new l() { // from class: androidx.compose.material.DismissState$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return DismissState.Companion.Saver$lambda$1(lVar, (DismissValue) obj);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public DismissState(DismissValue dismissValue, l<? super DismissValue, Boolean> lVar) {
        super(dismissValue, null, lVar, 2, null);
    }
}
