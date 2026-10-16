package E4;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2954a;

    public r(ArrayList arrayList) {
        this.f2954a = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f2954a.iterator();
    }
}
