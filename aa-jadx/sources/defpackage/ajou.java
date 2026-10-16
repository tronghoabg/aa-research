package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajou implements defpackage.ajnz {
    public final defpackage.ajpa a;
    public final defpackage.ajny b = new defpackage.ajny();
    public boolean c;

    public ajou(defpackage.ajpa ajpaVar) {
        this.a = ajpaVar;
    }

    @Override // defpackage.ajnz
    public final void P(int i) throws java.io.IOException {
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.b.O(i);
        c();
    }

    @Override // defpackage.ajnz
    public final void Q(int i) throws java.io.IOException {
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        defpackage.ajny ajnyVar = this.b;
        defpackage.ajox ajoxVarV = ajnyVar.v(2);
        byte[] bArr = ajoxVarV.a;
        int i2 = ajoxVarV.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        ajoxVarV.c = i2 + 2;
        ajnyVar.b += 2;
        c();
    }

    @Override // defpackage.ajnz
    public final void W(int i) throws java.io.IOException {
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.b.N(i);
        c();
    }

    @Override // defpackage.ajnz
    public final void Y(long j) throws java.io.IOException {
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.b.X(j);
        c();
    }

    @Override // defpackage.ajnz
    public final void Z(java.lang.String str) throws java.io.IOException {
        str.getClass();
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.b.V(str);
        c();
    }

    @Override // defpackage.ajpa
    public final void a(defpackage.ajny ajnyVar, long j) throws java.io.IOException {
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.b.a(ajnyVar, j);
        c();
    }

    public final void c() throws java.io.IOException {
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        defpackage.ajny ajnyVar = this.b;
        long jH = ajnyVar.h();
        if (jH > 0) {
            this.a.a(ajnyVar, jH);
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.ajpa
    public final void close() throws java.lang.Throwable {
        java.lang.Throwable th;
        if (this.c) {
            return;
        }
        try {
            defpackage.ajny ajnyVar = this.b;
            long j = ajnyVar.b;
            th = null;
            if (j > 0) {
                this.a.a(ajnyVar, j);
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        try {
            this.a.close();
        } catch (java.lang.Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.ajnz, defpackage.ajpa, java.io.Flushable
    public final void flush() throws java.io.IOException {
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        defpackage.ajny ajnyVar = this.b;
        long j = ajnyVar.b;
        if (j > 0) {
            this.a.a(ajnyVar, j);
        }
        this.a.flush();
    }

    @Override // defpackage.ajpa
    public final defpackage.ajpe hh() {
        return this.a.hh();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    public final java.lang.String toString() {
        return "buffer(" + this.a + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        byteBuffer.getClass();
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        int iWrite = this.b.write(byteBuffer);
        c();
        return iWrite;
    }
}
