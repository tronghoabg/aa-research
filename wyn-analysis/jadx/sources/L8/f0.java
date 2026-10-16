package l8;

import j$.util.Objects;
import java.util.AbstractMap;

/* loaded from: classes4.dex */
public final class f0 extends AbstractC3409K {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f40106c;

    public f0(g0 g0Var) {
        this.f40106c = g0Var;
    }

    @Override // l8.AbstractC3404F
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        g0 g0Var = this.f40106c;
        Fe.e.s(i5, g0Var.f40110f);
        int i10 = i5 * 2;
        Object[] objArr = g0Var.f40109e;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40106c.f40110f;
    }
}
