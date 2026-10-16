package od;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: od.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3736x extends AbstractC3674c {

    /* renamed from: e, reason: collision with root package name */
    public static final Y1 f42116e = new Y1(2);

    /* renamed from: f, reason: collision with root package name */
    public static final Y1 f42117f = new Y1(3);

    /* renamed from: g, reason: collision with root package name */
    public static final Y1 f42118g = new Y1(4);

    /* renamed from: h, reason: collision with root package name */
    public static final Y1 f42119h = new Y1(5);

    /* renamed from: i, reason: collision with root package name */
    public static final Y1 f42120i = new Y1(6);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f42121a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f42122b;

    /* renamed from: c, reason: collision with root package name */
    public int f42123c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f42124d;

    public C3736x() {
        new ArrayDeque(2);
        this.f42121a = new ArrayDeque();
    }

    @Override // od.AbstractC3674c
    public final void B() {
        if (!this.f42124d) {
            throw new InvalidMarkException();
        }
        ArrayDeque arrayDeque = this.f42121a;
        AbstractC3674c abstractC3674c = (AbstractC3674c) arrayDeque.peek();
        if (abstractC3674c != null) {
            int iZ = abstractC3674c.z();
            abstractC3674c.B();
            this.f42123c = (abstractC3674c.z() - iZ) + this.f42123c;
        }
        while (true) {
            AbstractC3674c abstractC3674c2 = (AbstractC3674c) this.f42122b.pollLast();
            if (abstractC3674c2 == null) {
                return;
            }
            abstractC3674c2.B();
            arrayDeque.addFirst(abstractC3674c2);
            this.f42123c = abstractC3674c2.z() + this.f42123c;
        }
    }

    @Override // od.AbstractC3674c
    public final void D(int i5) {
        V(f42117f, i5, null, 0);
    }

    public final void J(AbstractC3674c abstractC3674c) throws IOException {
        boolean z2 = this.f42124d;
        ArrayDeque arrayDeque = this.f42121a;
        boolean z10 = z2 && arrayDeque.isEmpty();
        if (abstractC3674c instanceof C3736x) {
            C3736x c3736x = (C3736x) abstractC3674c;
            while (!c3736x.f42121a.isEmpty()) {
                arrayDeque.add((AbstractC3674c) c3736x.f42121a.remove());
            }
            this.f42123c += c3736x.f42123c;
            c3736x.f42123c = 0;
            c3736x.close();
        } else {
            arrayDeque.add(abstractC3674c);
            this.f42123c = abstractC3674c.z() + this.f42123c;
        }
        if (z10) {
            ((AbstractC3674c) arrayDeque.peek()).b();
        }
    }

    public final void P() throws IOException {
        boolean z2 = this.f42124d;
        ArrayDeque arrayDeque = this.f42121a;
        if (!z2) {
            ((AbstractC3674c) arrayDeque.remove()).close();
            return;
        }
        this.f42122b.add((AbstractC3674c) arrayDeque.remove());
        AbstractC3674c abstractC3674c = (AbstractC3674c) arrayDeque.peek();
        if (abstractC3674c != null) {
            abstractC3674c.b();
        }
    }

    public final int Q(InterfaceC3733w interfaceC3733w, int i5, Object obj, int i10) throws IOException {
        a(i5);
        ArrayDeque arrayDeque = this.f42121a;
        if (!arrayDeque.isEmpty() && ((AbstractC3674c) arrayDeque.peek()).z() == 0) {
            P();
        }
        while (i5 > 0 && !arrayDeque.isEmpty()) {
            AbstractC3674c abstractC3674c = (AbstractC3674c) arrayDeque.peek();
            int iMin = Math.min(i5, abstractC3674c.z());
            i10 = interfaceC3733w.b(abstractC3674c, iMin, obj, i10);
            i5 -= iMin;
            this.f42123c -= iMin;
            if (((AbstractC3674c) arrayDeque.peek()).z() == 0) {
                P();
            }
        }
        if (i5 <= 0) {
            return i10;
        }
        throw new AssertionError("Failed executing read operation");
    }

    public final int V(Y1 y12, int i5, Object obj, int i10) {
        try {
            return Q(y12, i5, obj, i10);
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // od.AbstractC3674c
    public final void b() throws IOException {
        ArrayDeque arrayDeque = this.f42122b;
        ArrayDeque arrayDeque2 = this.f42121a;
        if (arrayDeque == null) {
            this.f42122b = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.f42122b.isEmpty()) {
            ((AbstractC3674c) this.f42122b.remove()).close();
        }
        this.f42124d = true;
        AbstractC3674c abstractC3674c = (AbstractC3674c) arrayDeque2.peek();
        if (abstractC3674c != null) {
            abstractC3674c.b();
        }
    }

    @Override // od.AbstractC3674c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        while (true) {
            ArrayDeque arrayDeque = this.f42121a;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((AbstractC3674c) arrayDeque.remove()).close();
            }
        }
        if (this.f42122b != null) {
            while (!this.f42122b.isEmpty()) {
                ((AbstractC3674c) this.f42122b.remove()).close();
            }
        }
    }

    @Override // od.AbstractC3674c
    public final boolean d() {
        Iterator it = this.f42121a.iterator();
        while (it.hasNext()) {
            if (!((AbstractC3674c) it.next()).d()) {
                return false;
            }
        }
        return true;
    }

    @Override // od.AbstractC3674c
    public final AbstractC3674c h(int i5) throws IOException {
        AbstractC3674c abstractC3674cH;
        int i10;
        AbstractC3674c abstractC3674cH2;
        if (i5 <= 0) {
            return AbstractC3720r1.f42081a;
        }
        a(i5);
        this.f42123c -= i5;
        AbstractC3674c abstractC3674c = null;
        C3736x c3736x = null;
        while (true) {
            ArrayDeque arrayDeque = this.f42121a;
            AbstractC3674c abstractC3674c2 = (AbstractC3674c) arrayDeque.peek();
            int iZ = abstractC3674c2.z();
            if (iZ > i5) {
                abstractC3674cH2 = abstractC3674c2.h(i5);
                i10 = 0;
            } else {
                if (this.f42124d) {
                    abstractC3674cH = abstractC3674c2.h(iZ);
                    P();
                } else {
                    abstractC3674cH = (AbstractC3674c) arrayDeque.poll();
                }
                AbstractC3674c abstractC3674c3 = abstractC3674cH;
                i10 = i5 - iZ;
                abstractC3674cH2 = abstractC3674c3;
            }
            if (abstractC3674c == null) {
                abstractC3674c = abstractC3674cH2;
            } else {
                if (c3736x == null) {
                    c3736x = new C3736x(i10 != 0 ? Math.min(arrayDeque.size() + 2, 16) : 2);
                    c3736x.J(abstractC3674c);
                    abstractC3674c = c3736x;
                }
                c3736x.J(abstractC3674cH2);
            }
            if (i10 <= 0) {
                return abstractC3674c;
            }
            i5 = i10;
        }
    }

    @Override // od.AbstractC3674c
    public final void i(int i5, int i10, byte[] bArr) {
        V(f42118g, i10, bArr, i5);
    }

    @Override // od.AbstractC3674c
    public final void o(OutputStream outputStream, int i5) throws IOException {
        Q(f42120i, i5, outputStream, 0);
    }

    @Override // od.AbstractC3674c
    public final void w(ByteBuffer byteBuffer) {
        V(f42119h, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // od.AbstractC3674c
    public final int y() {
        return V(f42116e, 1, null, 0);
    }

    @Override // od.AbstractC3674c
    public final int z() {
        return this.f42123c;
    }

    public C3736x(int i5) {
        new ArrayDeque(2);
        this.f42121a = new ArrayDeque(i5);
    }
}
