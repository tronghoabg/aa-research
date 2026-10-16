package androidx.compose.ui.modifier;

import h.g.a.a;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class ModifierLocal<T> {
    public static final int $stable = 0;
    private final a<T> defaultFactory;

    /* JADX WARN: Multi-variable type inference failed */
    private ModifierLocal(a<? extends T> aVar) {
        this.defaultFactory = aVar;
    }

    public final a<T> getDefaultFactory$ui() {
        return this.defaultFactory;
    }

    public /* synthetic */ ModifierLocal(a aVar, o oVar) {
        this(aVar);
    }
}
