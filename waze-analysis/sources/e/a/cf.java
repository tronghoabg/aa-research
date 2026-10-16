package e.a;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cf implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cg f46517a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f46518b;

    /* renamed from: c, reason: collision with root package name */
    private int f46519c;

    cf(cg cgVar) {
        Objects.requireNonNull(cgVar);
        this.f46517a = cgVar;
        this.f46518b = true;
        this.f46519c = cgVar.f46522c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f46518b) {
            return true;
        }
        while (true) {
            int i2 = this.f46519c;
            cg cgVar = this.f46517a;
            cm cmVar = cgVar.f46520a;
            if (i2 >= cmVar.f46538e) {
                return false;
            }
            if (Arrays.equals(cgVar.f46521b.g(), cmVar.v(this.f46519c))) {
                this.f46518b = true;
                return true;
            }
            this.f46519c++;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f46518b = false;
        cg cgVar = this.f46517a;
        int i2 = this.f46519c;
        this.f46519c = i2 + 1;
        return cgVar.f46520a.q(i2, cgVar.f46521b);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
