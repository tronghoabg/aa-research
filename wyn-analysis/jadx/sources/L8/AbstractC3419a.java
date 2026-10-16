package l8;

import A.AbstractC0213f;
import java.util.NoSuchElementException;

/* renamed from: l8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3419a extends t0 {

    /* renamed from: a, reason: collision with root package name */
    public int f40079a = 2;

    /* renamed from: b, reason: collision with root package name */
    public Object f40080b;

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Fe.e.x(this.f40079a != 4);
        int iF = AbstractC0213f.f(this.f40079a);
        if (iF == 0) {
            return true;
        }
        if (iF != 2) {
            this.f40079a = 4;
            this.f40080b = a();
            if (this.f40079a != 3) {
                this.f40079a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f40079a = 2;
        Object obj = this.f40080b;
        this.f40080b = null;
        return obj;
    }
}
