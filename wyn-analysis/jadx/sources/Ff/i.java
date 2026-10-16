package ff;

import java.util.AbstractSet;
import java.util.Set;
import uf.InterfaceC4296f;

/* loaded from: classes5.dex */
public abstract class i extends AbstractSet implements Set, InterfaceC4296f {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
