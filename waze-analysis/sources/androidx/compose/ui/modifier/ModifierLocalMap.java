package androidx.compose.ui.modifier;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class ModifierLocalMap {
    public static final int $stable = 0;

    private ModifierLocalMap() {
    }

    public abstract boolean contains$ui(ModifierLocal<?> modifierLocal);

    public abstract <T> T get$ui(ModifierLocal<T> modifierLocal);

    /* renamed from: set$ui */
    public abstract <T> void mo9902set$ui(ModifierLocal<T> modifierLocal, T t);

    public /* synthetic */ ModifierLocalMap(o oVar) {
        this();
    }
}
