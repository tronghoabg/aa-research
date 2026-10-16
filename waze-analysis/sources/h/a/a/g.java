package h.a.a;

import h.g.b.x;
import java.util.ConcurrentModificationException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class g<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final i f47941a;

    /* renamed from: b, reason: collision with root package name */
    private int f47942b;

    /* renamed from: c, reason: collision with root package name */
    private int f47943c;

    /* renamed from: d, reason: collision with root package name */
    private int f47944d;

    public g(i iVar) {
        x.f(iVar, "map");
        this.f47941a = iVar;
        this.f47943c = -1;
        this.f47944d = iVar.f47954i;
        e();
    }

    public final int a() {
        return this.f47942b;
    }

    public final int b() {
        return this.f47943c;
    }

    public final i c() {
        return this.f47941a;
    }

    public final void d() {
        if (this.f47941a.f47954i != this.f47944d) {
            throw new ConcurrentModificationException();
        }
    }

    public final void e() {
        while (true) {
            int i2 = this.f47942b;
            i iVar = this.f47941a;
            if (i2 >= iVar.f47952g || iVar.f47949d[i2] >= 0) {
                return;
            } else {
                this.f47942b = i2 + 1;
            }
        }
    }

    public final void f(int i2) {
        this.f47942b = i2;
    }

    public final void g(int i2) {
        this.f47943c = i2;
    }

    public final boolean hasNext() {
        return this.f47942b < this.f47941a.f47952g;
    }

    public final void remove() {
        d();
        if (this.f47943c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        i iVar = this.f47941a;
        iVar.i();
        iVar.B(this.f47943c);
        this.f47943c = -1;
        this.f47944d = iVar.f47954i;
    }
}
