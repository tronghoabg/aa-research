package k;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class af implements i {

    /* renamed from: a, reason: collision with root package name */
    public final al f50799a;

    /* renamed from: b, reason: collision with root package name */
    public final h f50800b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f50801c;

    public af(al alVar) {
        h.g.b.x.f(alVar, "sink");
        this.f50799a = alVar;
        this.f50800b = new h();
    }

    @Override // k.i
    public final h B() {
        return this.f50800b;
    }

    @Override // k.i
    public final i C(byte[] bArr) {
        h.g.b.x.f(bArr, "source");
        if (this.f50801c) {
            throw new IllegalStateException("closed");
        }
        this.f50800b.ap(bArr);
        return a();
    }

    @Override // k.i
    public final i D(long j2) {
        if (this.f50801c) {
            throw new IllegalStateException("closed");
        }
        this.f50800b.as(j2);
        return a();
    }

    @Override // k.i
    public final i E(String str) {
        h.g.b.x.f(str, TypedValues.Custom.S_STRING);
        if (this.f50801c) {
            throw new IllegalStateException("closed");
        }
        this.f50800b.ar(str);
        return a();
    }

    @Override // k.i
    public final void Z(k kVar) {
        h.g.b.x.f(kVar, "byteString");
        if (this.f50801c) {
            throw new IllegalStateException("closed");
        }
        this.f50800b.Z(kVar);
        a();
    }

    public final i a() {
        if (this.f50801c) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.f50800b;
        long jI = hVar.i();
        if (jI > 0) {
            this.f50799a.l(hVar, jI);
        }
        return this;
    }

    @Override // k.i
    public final void ab(byte[] bArr, int i2) {
        h.g.b.x.f(bArr, "source");
        if (this.f50801c) {
            throw new IllegalStateException("closed");
        }
        this.f50800b.aa(bArr, 0, i2);
        a();
    }

    @Override // k.i
    public final void ac(am amVar) {
        h.g.b.x.f(amVar, "source");
        while (amVar.a(this.f50800b, 8192L) != -1) {
            a();
        }
    }

    @Override // k.i
    public final void ae(int i2) {
        if (this.f50801c) {
            throw new IllegalStateException("closed");
        }
        this.f50800b.ae(i2);
        a();
    }

    @Override // k.i
    public final void af(long j2) {
        if (this.f50801c) {
            throw new IllegalStateException("closed");
        }
        this.f50800b.af(j2);
        a();
    }

    @Override // k.i
    public final void ah(int i2) {
        if (this.f50801c) {
            throw new IllegalStateException("closed");
        }
        this.f50800b.ah(i2);
        a();
    }

    @Override // k.i
    public final void aj(int i2) {
        if (this.f50801c) {
            throw new IllegalStateException("closed");
        }
        this.f50800b.aj(i2);
        a();
    }

    @Override // k.i
    public final void an(String str, int i2, int i3) {
        throw null;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, k.al
    public final void close() {
        Throwable th;
        if (this.f50801c) {
            return;
        }
        try {
            h hVar = this.f50800b;
            th = null;
            if (hVar.q() > 0) {
                this.f50799a.l(hVar, hVar.q());
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f50799a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f50801c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // k.i, k.al, java.io.Flushable
    public final void flush() {
        if (this.f50801c) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.f50800b;
        if (hVar.q() > 0) {
            this.f50799a.l(hVar, hVar.q());
        }
        this.f50799a.flush();
    }

    @Override // k.al
    public final ao h() {
        return this.f50799a.h();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f50801c;
    }

    @Override // k.al
    public final void l(h hVar, long j2) {
        h.g.b.x.f(hVar, "source");
        if (this.f50801c) {
            throw new IllegalStateException("closed");
        }
        this.f50800b.l(hVar, j2);
        a();
    }

    @Override // k.i
    public final OutputStream s() {
        return new ae(this);
    }

    public final String toString() {
        return "buffer(" + this.f50799a + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        h.g.b.x.f(byteBuffer, "source");
        if (this.f50801c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f50800b.write(byteBuffer);
        a();
        return iWrite;
    }
}
