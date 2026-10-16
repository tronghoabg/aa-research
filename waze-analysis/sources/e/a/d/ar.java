package e.a.d;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ar extends d {

    /* renamed from: a, reason: collision with root package name */
    private static final ap f46615a = new an(1);

    /* renamed from: b, reason: collision with root package name */
    private static final ap f46616b = new an(0);

    /* renamed from: c, reason: collision with root package name */
    private static final ap f46617c = new an(2);

    /* renamed from: d, reason: collision with root package name */
    private static final aq f46618d = new ao();

    /* renamed from: e, reason: collision with root package name */
    private final Deque f46619e;

    /* renamed from: f, reason: collision with root package name */
    private Deque f46620f;

    /* renamed from: g, reason: collision with root package name */
    private int f46621g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f46622h;

    public ar() {
        this.f46619e = new ArrayDeque();
    }

    private final int l(aq aqVar, int i2, Object obj, int i3) {
        a(i2);
        Deque deque = this.f46619e;
        if (!deque.isEmpty()) {
            o();
        }
        while (i2 > 0 && !deque.isEmpty()) {
            ho hoVar = (ho) deque.peek();
            int iMin = Math.min(i2, hoVar.f());
            i3 = aqVar.a(hoVar, iMin, obj, i3);
            i2 -= iMin;
            this.f46621g -= iMin;
            o();
        }
        if (i2 <= 0) {
            return i3;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private final int m(ap apVar, int i2, Object obj, int i3) {
        try {
            return l(apVar, i2, obj, i3);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    private final void n() {
        if (!this.f46622h) {
            ((ho) this.f46619e.remove()).close();
            return;
        }
        Deque deque = this.f46620f;
        Deque deque2 = this.f46619e;
        deque.add((ho) deque2.remove());
        ho hoVar = (ho) deque2.peek();
        if (hoVar != null) {
            hoVar.b();
        }
    }

    private final void o() {
        if (((ho) this.f46619e.peek()).f() == 0) {
            n();
        }
    }

    @Override // e.a.d.d, e.a.d.ho
    public final void b() {
        if (this.f46620f == null) {
            this.f46620f = new ArrayDeque(Math.min(this.f46619e.size(), 16));
        }
        while (!this.f46620f.isEmpty()) {
            ((ho) this.f46620f.remove()).close();
        }
        this.f46622h = true;
        ho hoVar = (ho) this.f46619e.peek();
        if (hoVar != null) {
            hoVar.b();
        }
    }

    @Override // e.a.d.d, e.a.d.ho
    public final void c() {
        if (!this.f46622h) {
            throw new InvalidMarkException();
        }
        Deque deque = this.f46619e;
        ho hoVar = (ho) deque.peek();
        if (hoVar != null) {
            int iF = hoVar.f();
            hoVar.c();
            this.f46621g += hoVar.f() - iF;
        }
        while (true) {
            ho hoVar2 = (ho) this.f46620f.pollLast();
            if (hoVar2 == null) {
                return;
            }
            hoVar2.c();
            deque.addFirst(hoVar2);
            this.f46621g += hoVar2.f();
        }
    }

    @Override // e.a.d.d, e.a.d.ho, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            Deque deque = this.f46619e;
            if (deque.isEmpty()) {
                break;
            } else {
                ((ho) deque.remove()).close();
            }
        }
        if (this.f46620f != null) {
            while (!this.f46620f.isEmpty()) {
                ((ho) this.f46620f.remove()).close();
            }
        }
    }

    @Override // e.a.d.d, e.a.d.ho
    public final boolean d() {
        Iterator it = this.f46619e.iterator();
        while (it.hasNext()) {
            if (!((ho) it.next()).d()) {
                return false;
            }
        }
        return true;
    }

    @Override // e.a.d.ho
    public final int e() {
        return m(f46615a, 1, null, 0);
    }

    @Override // e.a.d.ho
    public final int f() {
        return this.f46621g;
    }

    @Override // e.a.d.ho
    public final ho g(int i2) {
        ho hoVarG;
        int i3;
        ho hoVarG2;
        if (i2 <= 0) {
            return hr.a();
        }
        a(i2);
        this.f46621g -= i2;
        ho hoVar = null;
        ar arVar = null;
        while (true) {
            Deque deque = this.f46619e;
            ho hoVar2 = (ho) deque.peek();
            int iF = hoVar2.f();
            if (iF > i2) {
                hoVarG2 = hoVar2.g(i2);
                i3 = 0;
            } else {
                if (this.f46622h) {
                    hoVarG = hoVar2.g(iF);
                    n();
                } else {
                    hoVarG = (ho) deque.poll();
                }
                ho hoVar3 = hoVarG;
                i3 = i2 - iF;
                hoVarG2 = hoVar3;
            }
            if (hoVar == null) {
                hoVar = hoVarG2;
            } else {
                if (arVar == null) {
                    arVar = new ar(i3 != 0 ? Math.min(deque.size() + 2, 16) : 2);
                    arVar.h(hoVar);
                    hoVar = arVar;
                }
                arVar.h(hoVarG2);
            }
            if (i3 <= 0) {
                return hoVar;
            }
            i2 = i3;
        }
    }

    public final void h(ho hoVar) {
        boolean z = this.f46622h && this.f46619e.isEmpty();
        if (hoVar instanceof ar) {
            ar arVar = (ar) hoVar;
            while (true) {
                Deque deque = arVar.f46619e;
                if (deque.isEmpty()) {
                    break;
                } else {
                    this.f46619e.add((ho) deque.remove());
                }
            }
            this.f46621g += arVar.f46621g;
            arVar.f46621g = 0;
            arVar.close();
        } else {
            this.f46619e.add(hoVar);
            this.f46621g += hoVar.f();
        }
        if (z) {
            ((ho) this.f46619e.peek()).b();
        }
    }

    @Override // e.a.d.ho
    public final void i(OutputStream outputStream, int i2) {
        l(f46618d, i2, outputStream, 0);
    }

    @Override // e.a.d.ho
    public final void j(byte[] bArr, int i2, int i3) {
        m(f46617c, i3, bArr, i2);
    }

    @Override // e.a.d.ho
    public final void k(int i2) {
        m(f46616b, i2, null, 0);
    }

    public ar(int i2) {
        this.f46619e = new ArrayDeque(i2);
    }
}
