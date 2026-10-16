package Cd;

import cg.AbstractC1613b;
import cg.C1610B;
import cg.C1618g;
import com.google.protobuf.C1829q1;
import io.ktor.utils.io.InterfaceC2886t;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import jf.C3109i;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.fork.ForkServer;

/* renamed from: Cd.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0351t extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2177a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2178b;

    public /* synthetic */ C0351t(Object obj, int i5) {
        this.f2177a = i5;
        this.f2178b = obj;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        switch (this.f2177a) {
            case 0:
                return ((C0351t) this.f2178b).available();
            case 1:
            default:
                return super.available();
            case 2:
                return (int) Math.min(((C1618g) this.f2178b).f19902b, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
            case 3:
                C1610B c1610b = (C1610B) this.f2178b;
                if (c1610b.f19865c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(c1610b.f19864b.f19902b, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
            case 4:
                return ((ByteBuffer) this.f2178b).remaining();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f2177a) {
            case 0:
                super.close();
                ((C0351t) this.f2178b).close();
                break;
            case 1:
                io.ktor.utils.io.N.b((InterfaceC2886t) this.f2178b);
                break;
            case 2:
                break;
            case 3:
                ((C1610B) this.f2178b).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i5) {
        switch (this.f2177a) {
            case 4:
                ((ByteBuffer) this.f2178b).mark();
                break;
            default:
                super.mark(i5);
                break;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        switch (this.f2177a) {
            case 4:
                return true;
            default:
                return super.markSupported();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws Throwable {
        switch (this.f2177a) {
            case 0:
                return ((C0351t) this.f2178b).read();
            case 1:
                InterfaceC2886t interfaceC2886t = (InterfaceC2886t) this.f2178b;
                if (!interfaceC2886t.h()) {
                    if (interfaceC2886t.d().exhausted()) {
                        Ef.H.I(C3109i.f38759a, new Vd.a(interfaceC2886t, null));
                    }
                    if (!interfaceC2886t.h()) {
                        return interfaceC2886t.d().readByte() & ForkServer.ERROR;
                    }
                }
                return -1;
            case 2:
                C1618g c1618g = (C1618g) this.f2178b;
                if (c1618g.f19902b > 0) {
                    return c1618g.readByte() & ForkServer.ERROR;
                }
                return -1;
            case 3:
                C1610B c1610b = (C1610B) this.f2178b;
                if (c1610b.f19865c) {
                    throw new IOException("closed");
                }
                C1618g c1618g2 = c1610b.f19864b;
                if (c1618g2.f19902b == 0 && c1610b.f19863a.read(c1618g2, 8192L) == -1) {
                    return -1;
                }
                return c1618g2.readByte() & ForkServer.ERROR;
            default:
                ByteBuffer byteBuffer = (ByteBuffer) this.f2178b;
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & ForkServer.ERROR;
                }
                return -1;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        switch (this.f2177a) {
            case 4:
                try {
                    ((ByteBuffer) this.f2178b).reset();
                    return;
                } catch (InvalidMarkException e7) {
                    throw new IOException(e7);
                }
            default:
                super.reset();
                return;
        }
    }

    public String toString() {
        switch (this.f2177a) {
            case 2:
                return ((C1618g) this.f2178b) + ".inputStream()";
            case 3:
                return ((C1610B) this.f2178b) + ".inputStream()";
            default:
                return super.toString();
        }
    }

    public C0351t(C1829q1 c1829q1) {
        this.f2177a = 4;
        this.f2178b = c1829q1.f27737a.slice();
    }

    @Override // java.io.InputStream
    public final int read(byte[] b5, int i5, int i10) throws Throwable {
        switch (this.f2177a) {
            case 0:
                AbstractC3340k.e(b5, "b");
                return ((C0351t) this.f2178b).read(b5, i5, i10);
            case 1:
                AbstractC3340k.e(b5, "b");
                InterfaceC2886t interfaceC2886t = (InterfaceC2886t) this.f2178b;
                if (!interfaceC2886t.h()) {
                    if (interfaceC2886t.d().exhausted()) {
                        Ef.H.I(C3109i.f38759a, new Vd.a(interfaceC2886t, null));
                    }
                    Pf.a aVarD = interfaceC2886t.d();
                    aVarD.getClass();
                    int iA = interfaceC2886t.d().a(i5, Math.min((int) aVarD.f9456c, i10) + i5, b5);
                    if (iA >= 0) {
                        return iA;
                    }
                    if (!interfaceC2886t.h()) {
                        return 0;
                    }
                }
                return -1;
            case 2:
                AbstractC3340k.e(b5, "sink");
                return ((C1618g) this.f2178b).read(b5, i5, i10);
            case 3:
                AbstractC3340k.e(b5, "data");
                C1610B c1610b = (C1610B) this.f2178b;
                if (!c1610b.f19865c) {
                    AbstractC1613b.f(b5.length, i5, i10);
                    C1618g c1618g = c1610b.f19864b;
                    if (c1618g.f19902b == 0 && c1610b.f19863a.read(c1618g, 8192L) == -1) {
                        return -1;
                    }
                    return c1618g.read(b5, i5, i10);
                }
                throw new IOException("closed");
            default:
                ByteBuffer byteBuffer = (ByteBuffer) this.f2178b;
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int iMin = Math.min(i10, byteBuffer.remaining());
                byteBuffer.get(b5, i5, iMin);
                return iMin;
        }
    }

    private final void a() {
    }
}
