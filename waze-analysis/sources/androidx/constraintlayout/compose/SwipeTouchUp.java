package androidx.constraintlayout.compose;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SwipeTouchUp {
    public static final int $stable = 0;
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final SwipeTouchUp AutoComplete = new SwipeTouchUp("autocomplete");
    private static final SwipeTouchUp ToStart = new SwipeTouchUp("toStart");
    private static final SwipeTouchUp ToEnd = new SwipeTouchUp("toEnd");
    private static final SwipeTouchUp Stop = new SwipeTouchUp("stop");
    private static final SwipeTouchUp Decelerate = new SwipeTouchUp("decelerate");
    private static final SwipeTouchUp NeverCompleteStart = new SwipeTouchUp("neverCompleteStart");
    private static final SwipeTouchUp NeverCompleteEnd = new SwipeTouchUp("neverCompleteEnd");

    public SwipeTouchUp(String str) {
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final SwipeTouchUp getAutoComplete() {
            return SwipeTouchUp.AutoComplete;
        }

        public final SwipeTouchUp getDecelerate() {
            return SwipeTouchUp.Decelerate;
        }

        public final SwipeTouchUp getNeverCompleteEnd() {
            return SwipeTouchUp.NeverCompleteEnd;
        }

        public final SwipeTouchUp getNeverCompleteStart() {
            return SwipeTouchUp.NeverCompleteStart;
        }

        public final SwipeTouchUp getStop() {
            return SwipeTouchUp.Stop;
        }

        public final SwipeTouchUp getToEnd() {
            return SwipeTouchUp.ToEnd;
        }

        public final SwipeTouchUp getToStart() {
            return SwipeTouchUp.ToStart;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
