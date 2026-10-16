package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1388e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f18199a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f18200b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1390g f18201c;

    public C1388e(C1390g c1390g) {
        this.f18201c = c1390g;
        this.f18200b = c1390g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18199a < this.f18200b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i5 = this.f18199a;
        if (i5 >= this.f18200b) {
            throw new NoSuchElementException();
        }
        this.f18199a = i5 + 1;
        return Byte.valueOf(this.f18201c.f18206b[i5]);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
