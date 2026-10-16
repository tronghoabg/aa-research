package defpackage;

import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public class afbw<K, V> {
    public final afby a;
    public int b;
    public int c = -1;
    private int d;

    public afbw(afby afbyVar) {
        this.a = afbyVar;
        this.d = afbyVar.f;
        b();
    }

    public final void a() {
        if (this.a.f != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public final void b() {
        while (true) {
            int i = this.b;
            afby afbyVar = this.a;
            if (i >= afbyVar.e || afbyVar.d[i] >= 0) {
                return;
            } else {
                this.b = i + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.b < this.a.e;
    }

    public final void remove() {
        a();
        if (this.c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        afby afbyVar = this.a;
        afbyVar.f();
        afbyVar.g(this.c);
        this.c = -1;
        this.d = afbyVar.f;
    }
}
