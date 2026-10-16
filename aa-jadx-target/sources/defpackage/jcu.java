package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jcu implements java.io.Closeable {
    private boolean a;
    private final java.nio.ByteBuffer b;
    private final defpackage.jcs c;
    private final defpackage.jct d;
    private java.lang.ref.Cleaner.Cleanable e;

    public jcu(java.nio.ByteBuffer byteBuffer, defpackage.jcs jcsVar, boolean z) {
        this.b = byteBuffer;
        this.c = jcsVar;
        if (jcsVar == null) {
            this.d = null;
            return;
        }
        defpackage.jct jctVar = new defpackage.jct(jcsVar, byteBuffer);
        this.d = jctVar;
        if (android.os.Build.VERSION.SDK_INT < 33 || !z) {
            return;
        }
        this.e = ag$.ExternalSyntheticApiModelOutline0.m(defpackage.gjz.h(), this, jctVar);
    }

    private final void x() {
        if (this.c != null && this.a) {
            throw new java.lang.IllegalStateException("ByteBuffer used after release");
        }
    }

    public final synchronized byte a(int i) {
        x();
        return this.b.get(i);
    }

    public final synchronized int b() {
        java.nio.ByteBuffer byteBuffer;
        x();
        byteBuffer = this.b;
        if (!byteBuffer.hasArray()) {
            throw new java.lang.IllegalStateException("Trying to access the array offset of a ByteBuffer where the array is inaccessible.");
        }
        return byteBuffer.arrayOffset();
    }

    public final synchronized int c() {
        x();
        return this.b.limit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        defpackage.jct jctVar;
        java.lang.ref.Cleaner.Cleanable cleanable;
        if (this.a || (jctVar = this.d) == null) {
            return;
        }
        this.a = true;
        jctVar.a = false;
        if (android.os.Build.VERSION.SDK_INT < 33 || (cleanable = this.e) == null) {
            jctVar.run();
        } else {
            ag$.ExternalSyntheticApiModelOutline0.m(cleanable);
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

    public final synchronized defpackage.jcu f() {
        x();
        return new defpackage.jcu(this.b.duplicate(), null, false);
    }

    public final synchronized java.nio.ByteBuffer g() {
        java.nio.ByteBuffer byteBufferAllocateDirect;
        x();
        java.nio.ByteBuffer byteBuffer = this.b;
        int iCapacity = byteBuffer.capacity();
        byteBufferAllocateDirect = byteBuffer.isDirect() ? java.nio.ByteBuffer.allocateDirect(iCapacity) : java.nio.ByteBuffer.allocate(iCapacity);
        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        try {
            byteBufferAllocateDirect.position(byteBufferDuplicate.reset().position());
            byteBufferAllocateDirect.mark();
        } catch (java.nio.InvalidMarkException unused) {
            byteBufferDuplicate.rewind();
        }
        byteBufferAllocateDirect.put(byteBufferDuplicate);
        java.nio.ByteBuffer byteBuffer2 = this.b;
        byteBufferAllocateDirect.position(byteBuffer2.position());
        byteBufferAllocateDirect.limit(byteBuffer2.limit());
        return byteBufferAllocateDirect;
    }

    public final synchronized java.nio.ByteBuffer h() {
        x();
        return this.b;
    }

    public final synchronized java.nio.ByteBuffer i() {
        defpackage.ysr.bk(this.c == null, "Internal buffer is a pooled buffer");
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
        java.nio.ByteBuffer byteBuffer;
        x();
        byteBuffer = this.b;
        if (!byteBuffer.hasArray()) {
            throw new java.lang.IllegalStateException("Trying to access the backing array of a ByteBuffer where the array is inaccessible.");
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

    public final synchronized void r(java.nio.ByteBuffer byteBuffer) {
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
