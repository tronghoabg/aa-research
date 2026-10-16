package androidx.constraintlayout.compose;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Visibility {
    public static final int $stable = 0;
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final Visibility Visible = new Visibility("visible");
    private static final Visibility Invisible = new Visibility("invisible");
    private static final Visibility Gone = new Visibility("gone");

    public Visibility(String str) {
        this.name = str;
    }

    public final String getName$constraintlayout_compose() {
        return this.name;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getGone$annotations() {
        }

        public static /* synthetic */ void getInvisible$annotations() {
        }

        public static /* synthetic */ void getVisible$annotations() {
        }

        public final Visibility getGone() {
            return Visibility.Gone;
        }

        public final Visibility getInvisible() {
            return Visibility.Invisible;
        }

        public final Visibility getVisible() {
            return Visibility.Visible;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
