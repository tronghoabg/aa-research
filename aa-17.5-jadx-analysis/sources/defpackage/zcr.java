package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes3.dex */
final class zcr<E> extends yeg<E> {
    private final ListIterator a;

    public zcr(ListIterator listIterator) {
        this.a = listIterator;
    }

    @Override // defpackage.yeg, defpackage.yee
    protected final /* synthetic */ Iterator a() {
        return this.a;
    }

    @Override // defpackage.yeg, java.util.ListIterator
    public final void add(E e) {
        e.getClass();
        this.a.add(e);
    }

    @Override // defpackage.yeg
    protected final ListIterator c() {
        return this.a;
    }

    @Override // defpackage.yel
    protected final /* synthetic */ Object d() {
        return this.a;
    }

    @Override // defpackage.yeg, java.util.ListIterator
    public final void set(E e) {
        e.getClass();
        this.a.set(e);
    }
}
