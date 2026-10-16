package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class c9 extends m5 {
    public final /* synthetic */ d9 c;

    public c9(d9 d9Var) {
        this.c = d9Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        d9 d9Var = this.c;
        ec.d(i, d9Var.f);
        Object[] objArr = d9Var.e;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
