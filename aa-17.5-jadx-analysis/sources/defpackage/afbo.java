package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class afbo<T> extends afar<T> {
    public final List a;

    public afbo(List list) {
        this.a = list;
    }

    @Override // defpackage.afam
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.afar, java.util.List
    public final T get(int i) {
        return (T) this.a.get(woy.bw(this, i));
    }

    @Override // defpackage.afar, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new afbn(this, 0, 0);
    }

    @Override // defpackage.afar, java.util.List
    public final ListIterator listIterator() {
        return new afbn(this, 0, 0);
    }

    @Override // defpackage.afar, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new afbn(this, i, 0);
    }
}
