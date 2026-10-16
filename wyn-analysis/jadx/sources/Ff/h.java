package ff;

import java.util.AbstractList;
import java.util.List;
import uf.InterfaceC4293c;

/* loaded from: classes5.dex */
public abstract class h extends AbstractList implements List, InterfaceC4293c {
    public abstract int a();

    public abstract Object c(int i5);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i5) {
        return c(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
