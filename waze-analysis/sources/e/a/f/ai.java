package e.a.f;

import e.a.d.ho;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ai extends e.a.d.d {

    /* renamed from: a, reason: collision with root package name */
    private final k.h f47647a;

    ai(k.h hVar) {
        this.f47647a = hVar;
    }

    @Override // e.a.d.d, e.a.d.ho, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f47647a.N();
    }

    @Override // e.a.d.ho
    public final int e() {
        try {
            return this.f47647a.c() & 255;
        } catch (EOFException e2) {
            throw new IndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // e.a.d.ho
    public final int f() {
        return (int) this.f47647a.q();
    }

    @Override // e.a.d.ho
    public final ho g(int i2) {
        k.h hVar = new k.h();
        hVar.l(this.f47647a, i2);
        return new ai(hVar);
    }

    @Override // e.a.d.ho
    public final void i(OutputStream outputStream, int i2) throws IOException {
        this.f47647a.ak(outputStream, i2);
    }

    @Override // e.a.d.ho
    public final void j(byte[] bArr, int i2, int i3) {
        while (i3 > 0) {
            int iD = this.f47647a.d(bArr, i2, i3);
            if (iD == -1) {
                throw new IndexOutOfBoundsException("EOF trying to read " + i3 + " bytes");
            }
            i3 -= iD;
            i2 += iD;
        }
    }

    @Override // e.a.d.ho
    public final void k(int i2) {
        try {
            this.f47647a.Q(i2);
        } catch (EOFException e2) {
            throw new IndexOutOfBoundsException(e2.getMessage());
        }
    }
}
