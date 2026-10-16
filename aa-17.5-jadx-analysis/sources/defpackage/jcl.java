package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class jcl {
    private static final yph a = yph.c("CAR.BUF.POOL");
    private final int b;
    private final int c;
    private final boolean d;
    private final yws e;
    private final Handler f = new Handler(Looper.getMainLooper());
    private final Deque g;
    private final Set h;
    private int i;
    private int j;
    private final jcq k;

    public jcl(int i, int i2, boolean z, yws ywsVar, jcq jcqVar) {
        woy.O(i > 0, "Buffer capacity should be greater than 0");
        woy.Q(i2 > 0, "Max pool capacity should be greater than 0 for buffer pool of buffer capacity %s", i);
        this.b = i;
        this.d = z;
        this.g = new ArrayDeque();
        this.c = i2;
        this.e = ywsVar;
        this.h = Collections.newSetFromMap(new IdentityHashMap(i2 / 2));
        this.k = jcqVar;
    }

    private final synchronized ByteBuffer h() {
        boolean z = this.d;
        int i = this.b;
        if (z) {
            return ByteBuffer.allocateDirect(i);
        }
        return ByteBuffer.allocate(i);
    }

    private final synchronized void i() {
        this.i = Math.max(this.i, this.h.size());
    }

    public final synchronized ywt a() {
        abnp abnpVarN;
        abnpVarN = ywt.a.n();
        abnpVarN.t();
        ywt ywtVar = (ywt) abnpVarN.b;
        ywtVar.b |= 1;
        ywtVar.c = this.b;
        int i = this.i;
        abnpVarN.t();
        ywt ywtVar2 = (ywt) abnpVarN.b;
        ywtVar2.b |= 2;
        ywtVar2.d = i;
        int i2 = this.j;
        abnpVarN.t();
        ywt ywtVar3 = (ywt) abnpVarN.b;
        ywtVar3.b |= 4;
        ywtVar3.e = i2;
        return (ywt) abnpVarN.q();
    }

    public final synchronized ByteBuffer b() {
        ByteBuffer byteBuffer;
        int i = this.b;
        yws ywsVar = this.e;
        Set set = this.h;
        int size = set.size();
        String strName = ywsVar.name();
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(set.size());
        int i2 = this.c;
        Integer numValueOf3 = Integer.valueOf(i2);
        if (size >= i2) {
            throw new IllegalStateException(wub.M("Pool for %s with buffers of %s capacity is empty. %s buffers in use. Max pool capacity is %s", strName, numValueOf, numValueOf2, numValueOf3));
        }
        Deque deque = this.g;
        if (deque.isEmpty()) {
            deque.push(h());
        }
        byteBuffer = (ByteBuffer) deque.pop();
        set.add(byteBuffer);
        i();
        byteBuffer.clear();
        return byteBuffer;
    }

    public final synchronized void c() {
        int i = this.j + 1;
        this.j = i;
        jcq jcqVar = this.k;
        if (jcqVar.a && i > jcqVar.b) {
            throw new IllegalStateException(String.format("%d buffers leaked from pool with capacity %d for consumer %s", Integer.valueOf(i), Integer.valueOf(this.b), this.e.name()));
        }
    }

    public final synchronized void d(PrintWriter printWriter) {
        printWriter.println(String.format(Locale.ENGLISH, "Consumer: %d, Buffer Capacity: %d, Max Usage: %d, Num leaks: %d ", Integer.valueOf(this.e.d), Integer.valueOf(this.b), Integer.valueOf(this.i), Integer.valueOf(this.j)));
    }

    final synchronized void e() {
        ((ype) ((ype) a.h()).ai(1884)).B("Internal buffer with capacity %d from pool: %d leaked.", this.b, this.e.d);
        this.f.post(new ire(this, 11));
    }

    public final synchronized void f() {
        Set set = this.h;
        if (set.isEmpty()) {
            return;
        }
        ((ype) ((ype) a.h()).ai(1885)).R("%d buffers of %d capacity in use in pool %d", Integer.valueOf(set.size()), Integer.valueOf(this.b), Integer.valueOf(this.e.d));
    }

    final synchronized void g(ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity();
        int i = this.b;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(byteBuffer.capacity());
        boolean z = true;
        boolean z2 = iCapacity == i;
        yws ywsVar = this.e;
        woy.X(z2, "Illegal buffer returned to the %s pool. Pool buffer capacity is %s, returned buffer capacity is %s", ywsVar, numValueOf, numValueOf2);
        boolean zIsDirect = byteBuffer.isDirect();
        boolean z3 = this.d;
        Boolean boolValueOf = Boolean.valueOf(z3);
        Boolean boolValueOf2 = Boolean.valueOf(byteBuffer.isDirect());
        if (zIsDirect != z3) {
            z = false;
        }
        woy.X(z, "Illegal buffer returned to the %s pool. Pool buffer isDirect= %s, returned buffer isDirect= %s", ywsVar, boolValueOf, boolValueOf2);
        if (this.h.remove(byteBuffer)) {
            this.g.push(byteBuffer);
        }
    }
}
