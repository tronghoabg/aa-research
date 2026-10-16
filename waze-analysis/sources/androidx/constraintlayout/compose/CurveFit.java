package androidx.constraintlayout.compose;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CurveFit implements NamedPropertyOrValue {
    public static final int $stable = 0;
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final CurveFit Spline = new CurveFit("spline");
    private static final CurveFit Linear = new CurveFit("linear");

    public CurveFit(String str) {
        this.name = str;
    }

    @Override // androidx.constraintlayout.compose.NamedPropertyOrValue
    public String getName() {
        return this.name;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final CurveFit getLinear() {
            return CurveFit.Linear;
        }

        public final CurveFit getSpline() {
            return CurveFit.Spline;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
