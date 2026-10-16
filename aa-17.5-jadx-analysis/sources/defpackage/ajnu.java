package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class ajnu implements ajmz {
    public final ajoa a;
    public final ajmy b = new ajmy();
    public boolean c;

    public ajnu(ajoa ajoaVar) {
        this.a = ajoaVar;
    }

    @Override // defpackage.ajmz
    public final void P(int i) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.O(i);
        c();
    }

    @Override // defpackage.ajmz
    public final void Q(int i) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        ajmy ajmyVar = this.b;
        ajnx ajnxVarV = ajmyVar.v(2);
        byte[] bArr = ajnxVarV.a;
        int i2 = ajnxVarV.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        ajnxVarV.c = i2 + 2;
        ajmyVar.b += 2;
        c();
    }

    @Override // defpackage.ajmz
    public final void W(int i) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.N(i);
        c();
    }

    @Override // defpackage.ajmz
    public final void Y(long j) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.X(j);
        c();
    }

    @Override // defpackage.ajmz
    public final void Z(String str) throws IOException {
        str.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.V(str);
        c();
    }

    @Override // defpackage.ajoa
    public final void a(ajmy ajmyVar, long j) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.a(ajmyVar, j);
        c();
    }

    public final void c() throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        ajmy ajmyVar = this.b;
        long jH = ajmyVar.h();
        if (jH > 0) {
            this.a.a(ajmyVar, jH);
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.ajoa
    public final void close() throws Throwable {
        Throwable th;
        if (this.c) {
            return;
        }
        try {
            ajmy ajmyVar = this.b;
            long j = ajmyVar.b;
            th = null;
            if (j > 0) {
                this.a.a(ajmyVar, j);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.ajmz, defpackage.ajoa, java.io.Flushable
    public final void flush() throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        ajmy ajmyVar = this.b;
        long j = ajmyVar.b;
        if (j > 0) {
            this.a.a(ajmyVar, j);
        }
        this.a.flush();
    }

    @Override // defpackage.ajoa
    public final ajoe hV() {
        return this.a.hV();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    public final String toString() {
        return "buffer(" + this.a + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        byteBuffer.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.b.write(byteBuffer);
        c();
        return iWrite;
    }
}
