package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class l5 extends m5 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ m5 e;

    public l5(m5 m5Var, int i, int i2) {
        this.e = m5Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.j5
    public final Object[] b() {
        return this.e.b();
    }

    @Override // defpackage.j5
    public final int c() {
        return this.e.d() + this.c + this.d;
    }

    @Override // defpackage.j5
    public final int d() {
        return this.e.d() + this.c;
    }

    @Override // defpackage.m5, java.util.List
    /* renamed from: f */
    public final m5 subList(int i, int i2) {
        ec.f(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        ec.d(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.m5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.m5, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.m5, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
