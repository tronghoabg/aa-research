package androidx.compose.runtime;

import androidx.compose.runtime.Applier;
import h.g.a.p;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class AbstractApplier<T> implements Applier<T> {
    public static final int $stable = 8;
    private T current;
    private final T root;
    private final ArrayList<T> stack = Stack.m7327constructorimpl$default(null, 1, null);

    public AbstractApplier(T t) {
        this.root = t;
        this.current = t;
    }

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void apply(p pVar, Object obj) {
        Applier.CC.$default$apply(this, pVar, obj);
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        Stack.m7325clearimpl(this.stack);
        setCurrent(this.root);
        onClear();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(T t) {
        Stack.m7337pushimpl(this.stack, getCurrent());
        setCurrent(t);
    }

    @Override // androidx.compose.runtime.Applier
    public T getCurrent() {
        return this.current;
    }

    public final T getRoot() {
        return this.root;
    }

    protected final void move(List<T> list, int i2, int i3, int i4) {
        int i5 = i2 > i3 ? i3 : i3 - i4;
        if (i4 == 1) {
            if (i2 == i3 + 1 || i2 == i3 - 1) {
                list.set(i2, list.set(i3, list.get(i2)));
                return;
            } else {
                list.add(i5, list.remove(i2));
                return;
            }
        }
        List<T> listSubList = list.subList(i2, i4 + i2);
        List<T> list2 = listSubList;
        x.f(list2, "<this>");
        ArrayList arrayList = new ArrayList(list2);
        listSubList.clear();
        list.addAll(i5, arrayList);
    }

    protected abstract void onClear();

    protected final void remove(List<T> list, int i2, int i3) {
        if (i3 == 1) {
            list.remove(i2);
        } else {
            list.subList(i2, i3 + i2).clear();
        }
    }

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void reuse() {
        Applier.CC.$default$reuse(this);
    }

    protected void setCurrent(T t) {
        this.current = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.Applier
    public void up() {
        setCurrent(Stack.m7336popimpl(this.stack));
    }

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void onBeginChanges() {
    }

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void onEndChanges() {
    }
}
