package defpackage;

import android.os.Build;
import java.io.Closeable;
import java.lang.ref.Cleaner;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* loaded from: classes.dex */
public final class jcn implements Closeable {
    private boolean a;
    private final ByteBuffer b;
    private final jcl c;
    private final jcm d;
    private Cleaner.Cleanable e;

    public jcn(ByteBuffer byteBuffer, jcl jclVar, boolean z) {
        this.b = byteBuffer;
        this.c = jclVar;
        if (jclVar == null) {
            this.d = null;
            return;
        }
        jcm jcmVar = new jcm(jclVar, byteBuffer);
        this.d = jcmVar;
        if (Build.VERSION.SDK_INT < 33 || !z) {
            return;
        }
        this.e = gjs.h().register(this, jcmVar);
    }

    private final void x() {
        if (this.c != null && this.a) {
            throw new IllegalStateException("ByteBuffer used after release");
        }
    }

    public final synchronized byte a(int i) {
        x();
        return this.b.get(i);
    }

    public final synchronized int b() {
        ByteBuffer byteBuffer;
        x();
        byteBuffer = this.b;
        if (!byteBuffer.hasArray()) {
            throw new IllegalStateException("Trying to access the array offset of a ByteBuffer where the array is inaccessible.");
        }
        return byteBuffer.arrayOffset();
    }

    public final synchronized int c() {
        x();
        return this.b.limit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        jcm jcmVar;
        Cleaner.Cleanable cleanable;
        if (this.a || (jcmVar = this.d) == null) {
            return;
        }
        this.a = true;
        jcmVar.a = false;
        if (Build.VERSION.SDK_INT < 33 || (cleanable = this.e) == null) {
            jcmVar.run();
        } else {
            cleanable.clean();
        }
    }

    public final synchronized int d() {
        x();
        return this.b.position();
    }

    public final synchronized int e() {
        x();
        return this.b.remaining();
    }

    public final synchronized jcn f() {
        x();
        return new jcn(this.b.duplicate(), null, false);
    }

    public final synchronized ByteBuffer g() {
        ByteBuffer byteBufferAllocateDirect;
        x();
        ByteBuffer byteBuffer = this.b;
        int iCapacity = byteBuffer.capacity();
        byteBufferAllocateDirect = byteBuffer.isDirect() ? ByteBuffer.allocateDirect(iCapacity) : ByteBuffer.allocate(iCapacity);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        try {
            byteBufferAllocateDirect.position(byteBufferDuplicate.reset().position());
            byteBufferAllocateDirect.mark();
        } catch (InvalidMarkException unused) {
            byteBufferDuplicate.rewind();
        }
        byteBufferAllocateDirect.put(byteBufferDuplicate);
        ByteBuffer byteBuffer2 = this.b;
        byteBufferAllocateDirect.position(byteBuffer2.position());
        byteBufferAllocateDirect.limit(byteBuffer2.limit());
        return byteBufferAllocateDirect;
    }

    public final synchronized ByteBuffer h() {
        x();
        return this.b;
    }

    public final synchronized ByteBuffer i() {
        woy.aa(this.c == null, "Internal buffer is a pooled buffer");
        return this.b;
    }

    public final synchronized short j() {
        x();
        return this.b.getShort();
    }

    public final synchronized boolean k() {
        x();
        return this.b.hasRemaining();
    }

    public final synchronized byte[] l() {
        ByteBuffer byteBuffer;
        x();
        byteBuffer = this.b;
        if (!byteBuffer.hasArray()) {
            throw new IllegalStateException("Trying to access the backing array of a ByteBuffer where the array is inaccessible.");
        }
        return byteBuffer.array();
    }

    public final synchronized void m() {
        x();
        this.b.flip();
    }

    public final synchronized void n() {
        x();
        this.b.getLong(2);
    }

    public final synchronized short o() {
        x();
        return this.b.getShort(0);
    }

    public final synchronized void p(int i) {
        x();
        this.b.limit(i);
    }

    public final synchronized void q(int i) {
        x();
        this.b.position(i);
    }

    public final synchronized void r(ByteBuffer byteBuffer) {
        x();
        this.b.put(byteBuffer);
    }

    public final synchronized void s(byte[] bArr) {
        x();
        this.b.put(bArr);
    }

    public final synchronized void t(byte[] bArr, int i, int i2) {
        x();
        this.b.put(bArr, i, i2);
    }

    public final synchronized void u(long j) {
        x();
        this.b.putLong(j);
    }

    public final synchronized void v(short s) {
        x();
        this.b.putShort(s);
    }

    public final synchronized void w() {
        x();
        this.b.rewind();
    }
}
