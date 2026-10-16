package androidx.fragment.app.strictmode;

import android.support.v4.app.ar;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class Violation extends RuntimeException {
    private final ar fragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(ar arVar, String str) {
        super(str);
        x.f(arVar, "fragment");
        this.fragment = arVar;
    }

    public final ar getFragment() {
        return this.fragment;
    }

    public /* synthetic */ Violation(ar arVar, String str, int i2, o oVar) {
        this(arVar, (i2 & 2) != 0 ? null : str);
    }
}
