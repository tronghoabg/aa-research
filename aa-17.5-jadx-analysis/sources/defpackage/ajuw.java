package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class ajuw extends ajuv {
    public InputStream d;
    public long e = -1;

    @Override // defpackage.ajpb
    public final long a() {
        return this.e;
    }

    @Override // defpackage.ajpb
    public final InputStream b() throws IllegalStateException {
        ahkp.b(this.d != null, "Content has not been provided");
        return this.d;
    }

    @Override // defpackage.ajpb
    public final void f(OutputStream outputStream) throws IllegalStateException, IOException {
        InputStream inputStreamB = b();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = inputStreamB.read(bArr);
                if (i == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i);
                }
            }
        } finally {
            inputStreamB.close();
        }
    }

    @Override // defpackage.ajpb
    public final boolean h() {
        return false;
    }

    @Override // defpackage.ajpb
    public final boolean i() {
        InputStream inputStream = this.d;
        return (inputStream == null || inputStream == ajzl.a) ? false : true;
    }
}
