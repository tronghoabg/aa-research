package androidx.navigation.internal;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class Log {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final void i(String str, String str2) {
            x.f(str, "tag");
            x.f(str2, "message");
            android.util.Log.i(str, str2);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
