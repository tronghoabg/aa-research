package androidx.compose.ui.layout;

import h.g.a.p;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class AlignmentLine {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int Unspecified = Integer.MIN_VALUE;
    private final p<Integer, Integer, Integer> merger;

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLine(p<? super Integer, ? super Integer, Integer> pVar) {
        this.merger = pVar;
    }

    public final p<Integer, Integer, Integer> getMerger$ui() {
        return this.merger;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ AlignmentLine(p pVar, o oVar) {
        this(pVar);
    }
}
