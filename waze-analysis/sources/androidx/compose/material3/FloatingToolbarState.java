package androidx.compose.material3;

import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import h.a.i;
import h.g.a.l;
import h.g.a.p;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface FloatingToolbarState {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Saver<FloatingToolbarState, ?> Saver = ListSaverKt.listSaver(new p() { // from class: androidx.compose.material3.FloatingToolbarState$Companion$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                FloatingToolbarState floatingToolbarState = (FloatingToolbarState) obj2;
                return i.i(Float.valueOf(floatingToolbarState.getOffsetLimit()), Float.valueOf(floatingToolbarState.getOffset()), Float.valueOf(floatingToolbarState.getContentOffset()));
            }
        }, new l() { // from class: androidx.compose.material3.FloatingToolbarState$Companion$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                List list = (List) obj;
                return FloatingToolbarKt.FloatingToolbarState(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
            }
        });

        private Companion() {
        }

        public final Saver<FloatingToolbarState, ?> getSaver$material3() {
            return Saver;
        }
    }

    float getContentOffset();

    float getOffset();

    float getOffsetLimit();

    void setContentOffset(float f2);

    void setOffset(float f2);

    void setOffsetLimit(float f2);
}
