package defpackage;

import java.util.List;

/* loaded from: classes.dex */
final class yfn<E> extends yfq<E> {
    private final transient yfq a;

    public yfn(yfq yfqVar) {
        this.a = yfqVar;
    }

    @Override // defpackage.yfq, defpackage.yfg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.yfg
    public final boolean f() {
        return this.a.f();
    }

    @Override // java.util.List
    public final E get(int i) {
        woy.ai(i, size());
        return this.a.get((size() - 1) - i);
    }

    @Override // defpackage.yfq
    public final yfq h() {
        return this.a;
    }

    @Override // defpackage.yfq
    /* renamed from: i */
    public final yfq subList(int i, int i2) {
        woy.Y(i, i2, size());
        return this.a.subList(size() - i2, size() - i).h();
    }

    @Override // defpackage.yfq, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.a.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.yfq, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.a.indexOf(obj);
        if (iIndexOf >= 0) {
            return (size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.yfq, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.yfq, defpackage.yfg
    public Object writeReplace() {
        return super.writeReplace();
    }
}
